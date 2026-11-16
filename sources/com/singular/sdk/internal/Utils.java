package com.singular.sdk.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import androidx.annotation.NonNull;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4664b4;
import com.singular.sdk.SingularLinkHandler;
import com.singular.sdk.SingularLinkParams;
import com.singular.sdk.internal.services.SingularTimeProvider;
import com.singular.sdk.internal.services.TimeService;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.h50;
import defpackage.n30;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class Utils {
    private static int asidScope;
    private static double asidTimeinterval;
    private static String encryptedApiKey;
    private static final SingularLog logger = SingularLog.getLogger("Utils");
    private static TimeService timeService = new TimeService(new SingularTimeProvider());
    private static String wrapperName = null;
    private static String wrapperVersion = null;
    private static String imei = null;

    public static String extractDeepLink(Uri uri) {
        if (uri == null) {
            logger.debug("Cannot extract deep link: link is null");
            return null;
        }
        if (isESPLink(uri) || isBrandedLink(uri) || isSingularLinkDomain(uri)) {
            String queryParameter = uri.getQueryParameter(Constants.QUERY_ANDROID_DEEPLINK);
            return queryParameter != null ? queryParameter : uri.getQueryParameter(Constants.QUERY_DEEPLINK);
        }
        logger.debug("Cannot extract deep link: link is not from a valid domain. Link: " + uri);
        return null;
    }

    public static Method getDeclaredMethod(Object obj, String str, Class<?>... clsArr) {
        try {
            return obj.getClass().getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            SingularLog singularLog = logger;
            StringBuilder sbR = h50.r("Method ", str, " was not found in ");
            sbR.append(obj != null ? obj.getClass().getName() : null);
            singularLog.debug(sbR.toString());
            SingularInstance.collectError("e96");
            return null;
        } catch (SecurityException e) {
            logger.debug("Security violation occured ", e);
            SingularInstance.collectError("e94");
            return null;
        }
    }

    public static String getPlayStoreAdId(Context context) {
        try {
            String str = (String) SLReflectionUtils.invokeInstanceMethod(getAdvertisingInfoObject(context), "getId", null, new Object[0]);
            if (isInvalidDeviceId(str)) {
                return null;
            }
            return str;
        } catch (Throwable th) {
            h50.A(th, new StringBuilder("Failed to get Play Store Ad ID: "), logger);
            return null;
        }
    }

    public static String getPlayStoreAdIdByBackupMethod(Context context) {
        try {
            String aifa = ExternalAIFAHelper.getAIFA(context);
            if (isInvalidDeviceId(aifa)) {
                return null;
            }
            return aifa;
        } catch (Throwable th) {
            h50.A(th, new StringBuilder("Failed to get Play Store Ad ID by backup method: "), logger);
            return null;
        }
    }

    public static boolean isAmazonLimitAdTracking(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), Constants.AMAZON_LIMIT_AD_TRACKING) != 0;
        } catch (Settings.SettingNotFoundException unused) {
        }
    }

    public static boolean isLimitedTrackingEnabled(Context context) {
        try {
            return ((Boolean) SLReflectionUtils.invokeInstanceMethod(getAdvertisingInfoObject(context), C4664b4.j.M, null, new Object[0])).booleanValue();
        } catch (Throwable th) {
            h50.A(th, new StringBuilder("Failed to check if limited tracking is enabled: "), logger);
            return false;
        }
    }

    public static boolean isSingularLinkDomain(Uri uri) {
        if (uri != null) {
            return uri.getHost() != null && uri.getHost().endsWith(Constants.DEFAULT_SINGULAR_LINK_DOMAIN);
        }
        logger.debug("isSingularLinkDomain: URI is null");
        return false;
    }

    public static boolean validateSingularLink(Uri uri) {
        if (uri == null) {
            logger.debug("validateSingularLink: link is null");
            return false;
        }
        if (uri.getScheme() == null) {
            uri = Uri.parse("https://" + uri.toString());
        }
        if (uri.getHost() != null) {
            return true;
        }
        logger.debug("validateSingularLink: link has no host. Link: " + uri);
        return false;
    }

    public static boolean asidIsSingularId(Context context) {
        return SingularDataStore.get(context, Constants.AppSetId.SINGULAR_ID_AS_ASID_PREF).getBoolean(Constants.AppSetId.SINGULAR_ID_AS_ASID_PREF_KEY, false);
    }

    public static String bytesToHexString(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            cArr2[i2] = cArr[(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >>> 4];
            cArr2[i2 + 1] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    public static void clearTimeInterval() {
        asidTimeinterval = 0.0d;
    }

    public static String extractPassthroughFromSingularLink(Uri uri) {
        return uri.getQueryParameter(Constants.QUERY_DEEPLINK_PASSTHROUGH);
    }

    public static String formatException(Throwable th) {
        return "Exception: \n" + th.getMessage() + "\nStack trace: \n" + getStackTrace(th);
    }

    public static String formatTimestamp(long j) {
        return new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z").format(Long.valueOf(j));
    }

    private static String generateKeyForRetryCountWithKey(String str) {
        return n30.y("rc-", str);
    }

    public static int getASIDScope() {
        return asidScope;
    }

    public static double getASIDTimeInterval() {
        return asidTimeinterval;
    }

    private static Object getAdvertisingInfoObject(Context context) throws Exception {
        return SLReflectionUtils.invokeStaticMethod("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[]{Context.class}, context);
    }

    public static int getAndIncrementRetryCountForKey(Context context, String str) {
        int i = SingularDataStore.get(context, Constants.RequestRetryCounter.PREF_REQUEST_RETRY_COUNT).getInt(generateKeyForRetryCountWithKey(str), 0);
        saveRetryCountForKey(str, context, i + 1);
        return i;
    }

    public static boolean getAndSetIsFirstLaunch(Context context) {
        if (SingularDataStore.get(context, Constants.PREF_FIRST_INSTALL).getBoolean(Constants.WAS_OPENED_AFTER_INSTALL, false)) {
            return false;
        }
        saveFirstLaunchInfo(context);
        return true;
    }

    public static String getAppSetId(Context context) {
        try {
            SingularLog singularLog = logger;
            singularLog.debug("Utils: trying to fetch app set id");
            Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(context).getAppSetIdInfo();
            final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            final long currentTimeMillis = getCurrentTimeMillis();
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.singular.sdk.internal.Utils.1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(AppSetIdInfo appSetIdInfo2) {
                    Utils.logger.debug("Utils: app set id success listener invoked.");
                    int unused = Utils.asidScope = appSetIdInfo2.getScope();
                    linkedBlockingQueue.offer(appSetIdInfo2.getId());
                    double unused2 = Utils.asidTimeinterval = Utils.lagSince(currentTimeMillis);
                }
            });
            appSetIdInfo.addOnFailureListener(new OnFailureListener() { // from class: com.singular.sdk.internal.Utils.2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public void onFailure(@NonNull Exception exc) {
                    Utils.logger.error("Utils: fetch app set id failed with exception: " + Utils.formatException(exc));
                    double unused = Utils.asidTimeinterval = -1.0d;
                    linkedBlockingQueue.offer("");
                }
            });
            String str = (String) linkedBlockingQueue.poll(1L, TimeUnit.SECONDS);
            singularLog.debug("Utils: fetched app set id value: " + str);
            if (isEmptyOrNull(str)) {
                return null;
            }
            return str;
        } catch (Throwable th) {
            h50.A(th, new StringBuilder("Utils: caught exception in fetching app set id: "), logger);
            asidTimeinterval = -2.0d;
            return null;
        }
    }

    public static String getCSIReferrer(Context context) {
        return SingularDataStore.get(context, Constants.PREF_INSTALL_REFERRER).getString(Constants.PREF_CSI_REFERRER_KEY, null);
    }

    public static long getCurrentTimeMillis() {
        return timeService.getCurrentTimeMillis();
    }

    public static String getEncryptedApiKey() {
        return encryptedApiKey;
    }

    public static long getEventIndex(Context context) {
        SingularDataStore singularDataStore = SingularDataStore.get(context, Constants.PREF_EVENT_INDEX);
        return increaseEventIndex(singularDataStore, singularDataStore.getLong(Constants.PREF_EVENT_INDEX_KEY, -1L));
    }

    public static String getImei() {
        return imei;
    }

    public static Set<String> getInvalidDeviceIds() {
        HashSet hashSet = new HashSet();
        hashSet.add("");
        hashSet.add("9774d56d682e549c");
        hashSet.add("unknown");
        hashSet.add("000000000000000");
        hashSet.add("Android");
        hashSet.add("DEFACE");
        hashSet.add("00000000-0000-0000-0000-000000000000");
        hashSet.add("0000-0000");
        return hashSet;
    }

    public static String getPersistedASID(Context context) {
        return SingularDataStore.get(context, Constants.AppSetId.PERSISTED_ASID_PREF).getString(Constants.AppSetId.PERSISTED_ASID_PREF_KEY, null);
    }

    public static UUID getSingularId(Context context) {
        SingularDataStore singularDataStore = SingularDataStore.get(context, Constants.PREF_SINGULAR_ID);
        String string = singularDataStore.getString(Constants.PREF_SINGULAR_ID_KEY, null);
        return string != null ? UUID.fromString(string) : createSingularId(singularDataStore);
    }

    public static String getStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String getWrapperName() {
        return wrapperName;
    }

    private static long increaseEventIndex(SingularDataStore singularDataStore, long j) {
        long j2 = j + 1;
        singularDataStore.putLong(Constants.PREF_EVENT_INDEX_KEY, j2);
        return j2;
    }

    public static boolean isBrandedLink(Uri uri) {
        SingularLog singularLog = logger;
        singularLog.debug("Checking if link is branded link");
        if (uri == null) {
            singularLog.debug("link is null");
            return false;
        }
        if (SingularInstance.getInstance() == null) {
            singularLog.error("Singular instance is null. cannot check branded links");
            return false;
        }
        if (SingularInstance.getInstance().getSingularConfig() == null) {
            singularLog.debug("singular config is null. cannot check branded links");
            return false;
        }
        if (SingularInstance.getInstance().getSingularConfig().brandedDomains == null || SingularInstance.getInstance().getSingularConfig().brandedDomains.size() == 0) {
            singularLog.debug("branded domains is null or empty");
            return false;
        }
        if (uri.getScheme() == null) {
            uri = Uri.parse("https://" + uri.toString());
        }
        return isUrlInDomains(uri, SingularInstance.getInstance().getSingularConfig().brandedDomains);
    }

    public static boolean isEmptyOrNull(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean isGooglePlayServicesAvailable() {
        return SLReflectionUtils.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient") != null;
    }

    public static boolean isLicenseRetrieved(Context context, String str) {
        return SingularDataStore.get(context, Constants.LICENSING_API_KEY).getBoolean(str, false);
    }

    public static double lagSince(long j) {
        return timeService.lagSince(j);
    }

    public static void persistASIDValue(Context context, String str) {
        SingularDataStore.get(context, Constants.AppSetId.PERSISTED_ASID_PREF).putString(Constants.AppSetId.PERSISTED_ASID_PREF_KEY, str);
    }

    public static void resetRetryCountForKey(Context context, String str) {
        SingularDataStore.get(context, Constants.RequestRetryCounter.PREF_REQUEST_RETRY_COUNT).remove(generateKeyForRetryCountWithKey(str));
    }

    public static void resetTimeService() {
        timeService = new TimeService(new SingularTimeProvider());
    }

    public static Uri resolveESPLink(Uri uri) {
        try {
            URL url = new URL(uri.toString());
            HttpURLConnection httpsConnection = url.getProtocol().equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME) ? SingularRequestHandler.getHttpsConnection(url) : SingularRequestHandler.getHttpConnection(url);
            httpsConnection.setInstanceFollowRedirects(false);
            httpsConnection.connect();
            String headerField = httpsConnection.getHeaderField("Location");
            if (headerField != null) {
                return Uri.parse(headerField);
            }
            logger.debug("resolveESPLink: Location header is null, no redirect URL found for ESP link: " + uri);
            return null;
        } catch (IOException e) {
            logger.error("Failed to resolve ESP link: " + formatException(e));
            return null;
        }
    }

    public static void saveASIDIsSingularId(Context context) {
        SingularDataStore.get(context, Constants.AppSetId.SINGULAR_ID_AS_ASID_PREF).putBoolean(Constants.AppSetId.SINGULAR_ID_AS_ASID_PREF_KEY, true);
    }

    public static void saveCSIReferrer(Context context, String str) {
        SingularDataStore.get(context, Constants.PREF_INSTALL_REFERRER).putString(Constants.PREF_CSI_REFERRER_KEY, str);
    }

    private static void saveFirstLaunchInfo(Context context) {
        SingularDataStore.get(context, Constants.PREF_FIRST_INSTALL).putBoolean(Constants.WAS_OPENED_AFTER_INSTALL, true);
    }

    public static void saveLicenseInfo(Context context, String str) {
        SingularDataStore.get(context, Constants.LICENSING_API_KEY).putBoolean(str, true);
    }

    public static void setEncryptedApiKey(String str) {
        encryptedApiKey = str;
    }

    public static void setImei(String str) {
        imei = str;
    }

    public static void setTestTimeService(TimeService timeService2) {
        timeService = timeService2;
    }

    public static void setWrapperNameAndVersion(String str, String str2) {
        wrapperName = str;
        wrapperVersion = str2;
    }

    public static String sha1Hash(String str, String str2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(str2.getBytes("UTF-8"));
            messageDigest.update(str.getBytes("UTF-8"));
            return bytesToHexString(messageDigest.digest());
        } catch (Throwable th) {
            SingularLog singularLog = logger;
            singularLog.error("error in sha1Hash()", th);
            singularLog.error("sha1Hash: returning null due to error generating SHA-1 hash");
            return null;
        }
    }

    private Utils() {
    }

    public static boolean appMovedToBackground() {
        SingularInstance.getInstance().getSingularConfig().isOpenedWithDeepLink = false;
        return false;
    }

    private static UUID createSingularId(SingularDataStore singularDataStore) {
        UUID uuidRandomUUID = UUID.randomUUID();
        singularDataStore.putString(Constants.PREF_SINGULAR_ID_KEY, uuidRandomUUID.toString());
        return uuidRandomUUID;
    }

    public static String findAndRemoveSuffixFromEncryptedKeys(String str, String str2) {
        if (!isEmptyOrNull(str) && !isEmptyOrNull(str2) && str.length() >= str2.length() && str.endsWith(str2)) {
            return str.substring(0, str.length() - str2.length());
        }
        return str;
    }

    public static String getAmazonId(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), Constants.AMAZON_ADVERTISING_ID);
        } catch (Throwable th) {
            h50.A(th, new StringBuilder("Failed to get Amazon ID: "), logger);
            return null;
        }
    }

    public static String getAndroidId(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (!getInvalidDeviceIds().contains(string)) {
            return string;
        }
        return "None";
    }

    public static String getCpuAbi() {
        return SLReflectionUtils.getCpuAbi();
    }

    public static Locale getLocale(Configuration configuration) {
        Locale localeFromLocaleList = SLReflectionUtils.getLocaleFromLocaleList(configuration);
        if (localeFromLocaleList != null) {
            return localeFromLocaleList;
        }
        return SLReflectionUtils.getLocaleFromField(configuration);
    }

    public static String getSdkVersion(SingularInstance singularInstance) {
        String str;
        String str2 = singularInstance.getDeviceInfo().sdkVersion;
        String str3 = wrapperName;
        if (str3 != null && (str = wrapperVersion) != null) {
            return str2 + "-" + str3 + "/" + str;
        }
        return str2;
    }

    public static String[] getSupportedAbis() {
        return SLReflectionUtils.getSupportedAbis();
    }

    public static boolean handleDeepLink(final SingularLinkParams singularLinkParams) {
        if (SLPushNotificationsManager.getInstance().didAppOpenWithPushNotification().booleanValue()) {
            logger.debug("Push notifications: app was opened with push notification link, skipping deeplink handler invocation.");
            return false;
        }
        final SingularLinkHandler singularLinkHandler = SingularInstance.getInstance().getSingularConfig().linkCallback;
        if (singularLinkParams.getDeeplink() == null || singularLinkHandler == null) {
            return false;
        }
        new Runnable() { // from class: com.singular.sdk.internal.Utils.3
            @Override // java.lang.Runnable
            public void run() {
                singularLinkHandler.onResolved(singularLinkParams);
            }
        }.run();
        return true;
    }

    public static void handleSingularLink(Uri uri) {
        String strExtractDeepLink = extractDeepLink(uri);
        if (strExtractDeepLink != null) {
            handleDeepLink(new SingularLinkParams(strExtractDeepLink, extractPassthroughFromSingularLink(uri), false, uri));
        }
    }

    private static byte[] hexStringToByteArray(String str) {
        try {
            int length = str.length();
            byte[] bArr = new byte[length / 2];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
            }
            return bArr;
        } catch (Throwable th) {
            h50.A(th, new StringBuilder("Failed to convert hex string to byte array: "), logger);
            return null;
        }
    }

    public static boolean isAmazonAvailable(Context context) {
        try {
            Settings.Secure.getInt(context.getContentResolver(), Constants.AMAZON_LIMIT_AD_TRACKING);
            return true;
        } catch (Settings.SettingNotFoundException e) {
            logger.debug("Amazon limit ad tracking setting not found: " + formatException(e));
            return false;
        }
    }

    public static boolean isESPLink(Uri uri) {
        String str;
        String str2;
        SingularInstance singularInstance = SingularInstance.getInstance();
        if (uri != null && singularInstance != null && singularInstance.getSingularConfig() != null && singularInstance.getSingularConfig().espDomains != null && singularInstance.getSingularConfig().espDomains.size() != 0) {
            if (uri.getScheme() == null) {
                uri = Uri.parse("https://" + uri.toString());
            }
            return isUrlInDomains(uri, singularInstance.getSingularConfig().espDomains);
        }
        SingularLog singularLog = logger;
        StringBuilder sb = new StringBuilder("isESPLink: returning false - ");
        if (uri == null) {
            str = "link == null ";
        } else {
            str = "";
        }
        sb.append(str);
        if (singularInstance == null) {
            str2 = "instance == null";
        } else if (singularInstance.getSingularConfig() == null) {
            str2 = "getSingularConfig() == null";
        } else if (singularInstance.getSingularConfig().espDomains == null) {
            str2 = "espDomains is null";
        } else {
            str2 = "espDomains is empty";
        }
        sb.append(str2);
        singularLog.debug(sb.toString());
        return false;
    }

    public static boolean isInvalidDeviceId(String str) {
        if (isEmptyOrNull(str)) {
            return false;
        }
        Matcher matcher = Pattern.compile("^[0-]+$").matcher(str);
        if (!getInvalidDeviceIds().contains(str) && !matcher.matches()) {
            return false;
        }
        return true;
    }

    public static boolean isMainThread() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static boolean isOpenedWithDeeplink() {
        return SingularInstance.getInstance().getSingularConfig().isOpenedWithDeepLink;
    }

    public static boolean isShortLink(Uri uri) {
        if ((!isESPLink(uri) && !isBrandedLink(uri) && !isSingularLinkDomain(uri)) || extractDeepLink(uri) != null) {
            return false;
        }
        return true;
    }

    public static boolean isSingularLink(Uri uri) {
        if (!isSingularLinkDomain(uri) && !isBrandedLink(uri) && !isESPLink(uri)) {
            return false;
        }
        return true;
    }

    private static boolean isUrlInDomains(Uri uri, List<String> list) {
        for (String str : list) {
            if (uri.getHost() != null && uri.getHost().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void saveRetryCountForKey(String str, Context context, int i) {
        try {
            SingularDataStore.get(context, Constants.RequestRetryCounter.PREF_REQUEST_RETRY_COUNT).putInt(generateKeyForRetryCountWithKey(str), i);
        } catch (Throwable th) {
            logger.error(formatException(th));
        }
    }

    public static String xorDecrypt(String str) {
        try {
            byte[] bArrHexStringToByteArray = hexStringToByteArray(str);
            byte[] bArr = new byte[4];
            int length = bArrHexStringToByteArray.length - 4;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArrHexStringToByteArray, 0, bArr, 0, 4);
            System.arraycopy(bArrHexStringToByteArray, 4, bArr2, 0, length);
            byte[] bArr3 = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 4]);
            }
            return new String(bArr3);
        } catch (Throwable th) {
            h50.A(th, new StringBuilder("Failed to XOR decrypt: "), logger);
            return null;
        }
    }
}
