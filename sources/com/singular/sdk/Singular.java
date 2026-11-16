package com.singular.sdk;

import android.content.Context;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.singular.sdk.internal.Constants;
import com.singular.sdk.internal.SLPushNotificationsManager;
import com.singular.sdk.internal.SingularGlobalProperty;
import com.singular.sdk.internal.SingularInstance;
import com.singular.sdk.internal.SingularLog;
import com.singular.sdk.internal.Utils;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class Singular {
    private static final SingularLog logger = SingularLog.getLogger(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_SINGULAR);
    private static SingularInstance singular;

    public static boolean event(String str, Object... objArr) {
        try {
            if (!isInitialized()) {
                logger.error("event: Singular SDK not initialized.");
                SingularInstance.collectError("e29");
                return false;
            }
            if (Utils.isEmptyOrNull(str)) {
                logger.error("Event name can not be null or empty");
                SingularInstance.collectError("e34");
                return false;
            }
            if (objArr.length % 2 != 0) {
                logger.error("Extra arguments must be in even numbers.");
                SingularInstance.collectError("e33");
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < objArr.length; i += 2) {
                    jSONObject.put((String) objArr[i], objArr[i + 1]);
                }
                return eventJSON(str, jSONObject);
            } catch (JSONException e) {
                logger.error("error in serializing extra args", e);
                SingularInstance.collectError("e35");
                return false;
            }
        } catch (Throwable th) {
            SingularInstance.collectError("e36");
            logger.error("Exception", th);
            return false;
        }
    }

    public static boolean eventJSON(String str, JSONObject jSONObject) {
        try {
            if (!isInitialized()) {
                logger.error("eventJSON: Singular SDK not initialized.");
                SingularInstance.collectError("e37");
                return false;
            }
            if (!Utils.isEmptyOrNull(str)) {
                return singular.logEvent(str, jSONObject != null ? jSONObject.toString() : null);
            }
            logger.error("Event name can not be null or empty");
            SingularInstance.collectError("e38");
            return false;
        } catch (Throwable th) {
            SingularInstance.collectError("e60");
            logger.error("Exception", th);
            return false;
        }
    }

    private static Object getSku(Object obj) throws Exception {
        Method declaredMethod = Utils.getDeclaredMethod(obj, "getProducts", new Class[0]);
        if (declaredMethod != null) {
            return new JSONArray(declaredMethod.invoke(obj, null).toString());
        }
        Method declaredMethod2 = Utils.getDeclaredMethod(obj, "getSku", new Class[0]);
        if (declaredMethod2 != null) {
            return (String) declaredMethod2.invoke(obj, null);
        }
        Method declaredMethod3 = Utils.getDeclaredMethod(obj, "getSkus", new Class[0]);
        if (declaredMethod3 != null) {
            return new JSONArray(declaredMethod3.invoke(obj, null).toString());
        }
        return null;
    }

    public static void createReferrerShortLink(String str, String str2, String str3, JSONObject jSONObject, ShortLinkHandler shortLinkHandler) {
        if (shortLinkHandler == null) {
            logger.error("Failed to create referrer short link: shortLinkHandler is null");
            SingularInstance.collectError("e84");
        } else {
            if (isInitialized()) {
                singular.createReferrerShortLink(str, str2, str3, jSONObject, shortLinkHandler);
                return;
            }
            logger.error("createReferrerShortLink: Singular SDK not initialized.");
            SingularInstance.collectError("e90");
            try {
                shortLinkHandler.onError("Singular SDK is not initialized");
            } catch (Throwable unused) {
                logger.error("createReferrerShortLink: ShortLinkHandler threw from onError");
                SingularInstance.collectError("e130");
            }
        }
    }

    public static boolean customRevenue(String str, String str2, double d, Object obj, Map<String, Object> map) {
        if (obj != null && obj.getClass().getName().equals("com.android.billingclient.api.Purchase")) {
            try {
                Class<?> cls = obj.getClass();
                Object sku = getSku(obj);
                String str3 = (String) cls.getDeclaredMethod("getOriginalJson", null).invoke(obj, null);
                String str4 = (String) cls.getDeclaredMethod("getSignature", null).invoke(obj, null);
                if (map != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(map);
                        jSONObject.put(Constants.REVENUE_CURRENCY_KEY, str2);
                        jSONObject.put("r", d);
                        jSONObject.put(Constants.IS_REVENUE_EVENT_KEY, true);
                        jSONObject.put(Constants.REVENUE_RECEIPT_KEY, str3);
                        jSONObject.put(Constants.REVENUE_RECEIPT_SIGNATURE, str4);
                        jSONObject.put(Constants.REVENUE_PRODUCT_SKU_KEY, sku);
                        return eventJSON(str, jSONObject);
                    } catch (JSONException e) {
                        logger.error(Utils.formatException(e));
                        SingularInstance.collectError("e49");
                    }
                }
                return event(str, Constants.REVENUE_CURRENCY_KEY, str2, "r", Double.valueOf(d), Constants.REVENUE_PRODUCT_SKU_KEY, sku, Constants.REVENUE_RECEIPT_KEY, str3, Constants.REVENUE_RECEIPT_SIGNATURE, str4, Constants.IS_REVENUE_EVENT_KEY, Boolean.TRUE);
            } catch (Throwable th) {
                logger.error("customRevenue has encountered an unexpected exception. Please verify that the 'purchase' object is of type 'com.android.billingclient.api.Purchase'", th);
                SingularInstance.collectError("e40");
            }
        }
        return customRevenue(str, str2, d, map);
    }

    public static long getSessionId() {
        try {
            if (isInitialized()) {
                return singular.getSessionId();
            }
            logger.error("getSessionId: Singular SDK not initialized.");
            SingularInstance.collectError("e51");
            return -1L;
        } catch (Throwable th) {
            SingularInstance.collectError("e79");
            logger.error(Utils.formatException(th));
            return -1L;
        }
    }

    public static boolean init(Context context, SingularConfig singularConfig) {
        try {
            if (context == null || singularConfig == null) {
                SingularLog singularLog = logger;
                StringBuilder sb = new StringBuilder("SDK initialization failed: ");
                sb.append(context == null ? "context == null " : "");
                sb.append(singularConfig == null ? "config == null" : "");
                sb.append(". Please provide a valid Context, SingularConfig.");
                singularLog.error(sb.toString());
                SingularInstance.collectError("e23");
                return false;
            }
            if (singularConfig.apiKey.endsWith(Constants.ENCRYPTED_KEY_SUFFIX)) {
                Utils.setEncryptedApiKey(singularConfig.apiKey);
            }
            SingularInstance singularInstance = SingularInstance.getInstance(context, SingularConfig.copyWithKeyDecryption(singularConfig));
            singular = singularInstance;
            if (!singularInstance.isInitialized()) {
                SingularInstance.collectError("ie5");
                logger.debug("singular instance is not initialized. start will be sent from session manager.");
            } else if (SLPushNotificationsManager.getInstance().tryHandlePushNotificationAtPaths(singularConfig.pushNotificationPayload, singularConfig.pushNotificationLinkPath).booleanValue()) {
                SLPushNotificationsManager.getInstance().appOpenedWithPushNotification();
                singular.startSessionIfOpenedWithPush();
            } else {
                singular.startSessionIfOpenedWithDeeplink();
            }
            return isInitialized();
        } catch (IOException e) {
            SingularLog singularLog2 = logger;
            singularLog2.error("Failed to init() Singular SDK");
            singularLog2.error(Utils.formatException(e));
            SingularInstance.collectError("e24");
            singular = null;
        } catch (Throwable th) {
            SingularLog singularLog3 = logger;
            singularLog3.error("Failed to init() Singular SDK");
            SingularInstance.collectError("e25");
            singularLog3.error(Utils.formatException(th));
        }
    }

    private static boolean isInitialized() {
        if (singular != null) {
            return true;
        }
        logger.error("Singular not initialized. You must call Singular.init() ");
        return false;
    }

    public static boolean revenue(String str, double d, String str2, String str3, String str4, int i, double d2) {
        return customRevenue(Constants.REVENUE_EVENT_NAME, str, d, str2, str3, str4, i, d2);
    }

    private Singular() {
    }

    public static void adRevenue(SingularAdData singularAdData) {
        try {
            if (isInitialized() && singularAdData != null && singularAdData.hasRequiredParams()) {
                eventJSON(Constants.ADMON_REVENUE_EVENT_NAME, singularAdData);
                return;
            }
            SingularInstance.collectError("e74");
        } catch (Throwable th) {
            SingularInstance.collectError("e76");
            logger.error(Utils.formatException(th));
        }
    }

    public static void clearGlobalProperties() {
        try {
            if (!isInitialized()) {
                logger.error("clearGlobalProperties: Singular SDK not initialized.");
                SingularInstance.collectError("e66");
            } else {
                singular.clearGlobalProperties();
            }
        } catch (Throwable th) {
            SingularInstance.collectError("e88");
            logger.error(Utils.formatException(th));
        }
    }

    public static void clearUserDetails() {
        try {
            if (!isInitialized()) {
                logger.error("clearUserDetails: Singular SDK not initialized.");
                SingularInstance.collectError("e178");
            } else {
                singular.clearUserDetails();
            }
        } catch (Throwable th) {
            SingularInstance.collectError("e179");
            logger.error(Utils.formatException(th));
        }
    }

    public static Map<String, String> getGlobalProperties() {
        try {
            if (isInitialized()) {
                return singular.getGlobalProperties();
            }
            logger.error("getGlobalProperties: Singular SDK not initialized.");
            SingularInstance.collectError("e63");
            return null;
        } catch (Throwable th) {
            SingularInstance.collectError("e85");
            logger.error(Utils.formatException(th));
            return null;
        }
    }

    public static boolean getLimitDataSharing() {
        if (!isInitialized()) {
            logger.error("getLimitDataSharing: Singular SDK not initialized.");
            SingularInstance.collectError("e82");
            return false;
        }
        Boolean limitDataSharing = singular.getLimitDataSharing();
        if (limitDataSharing == null) {
            return false;
        }
        return limitDataSharing.booleanValue();
    }

    public static boolean isAllTrackingStopped() {
        if (!isInitialized()) {
            logger.error("isAllTrackingStopped: Singular SDK not initialized.");
            SingularInstance.collectError("e73");
            return false;
        }
        return singular.isAllTrackingStopped();
    }

    public static void limitDataSharing(boolean z) {
        if (!isInitialized()) {
            logger.error("limitDataSharing: Singular SDK not initialized yet, ignoring. use SingularConfig instead.");
            SingularInstance.collectError("e78");
        } else {
            singular.limitDataSharing(z);
        }
    }

    public static void onActivityPaused() {
        try {
            if (!isInitialized()) {
                logger.error("onActivityPaused: Singular SDK not initialized.");
                SingularInstance.collectError("e39");
            } else {
                singular.onActivityPaused(Utils.getCurrentTimeMillis());
            }
        } catch (Throwable th) {
            SingularInstance.collectError("e70");
            logger.error(Utils.formatException(th));
        }
    }

    public static void onActivityResumed() {
        try {
            if (!isInitialized()) {
                logger.error("onActivityResumed: Singular SDK not initialized.");
                SingularInstance.collectError("e41");
            } else {
                singular.onActivityResumed(Utils.getCurrentTimeMillis());
            }
        } catch (Throwable th) {
            SingularInstance.collectError("e72");
            logger.error(Utils.formatException(th));
        }
    }

    public static void resumeAllTracking() {
        if (!isInitialized()) {
            logger.error("resumeAllTracking: Singular SDK not initialized.");
            SingularInstance.collectError("e71");
        } else {
            singular.resumeAllTracking();
        }
    }

    public static void setCustomUserId(String str) {
        try {
            if (!isInitialized()) {
                logger.error("setCustomUserId: Singular SDK not initialized.");
                SingularInstance.collectError("e53");
            } else {
                singular.saveCustomUserId(str);
            }
        } catch (Throwable th) {
            SingularInstance.collectError("e81");
            logger.error(Utils.formatException(th));
        }
    }

    public static void setDeviceCustomUserId(String str) {
        try {
            if (!isInitialized()) {
                logger.error("setDeviceCustomUserId: Singular SDK not initialized.");
                SingularInstance.collectError("e52");
            } else {
                setCustomUserId(str);
                singular.logSetDeviceCustomUserId();
            }
        } catch (Throwable th) {
            SingularInstance.collectError("e80");
            logger.error(Utils.formatException(th));
        }
    }

    public static void setFCMDeviceToken(String str) {
        try {
            if (!isInitialized()) {
                logger.error("setFCMDeviceToken: Singular SDK not initialized.");
                SingularInstance.collectError("e43");
            } else {
                singular.saveFCMDeviceToken(str);
            }
        } catch (Throwable th) {
            SingularInstance.collectError("e77");
            logger.error(Utils.formatException(th));
        }
    }

    public static void setGCMDeviceToken(String str) {
        try {
            if (!isInitialized()) {
                logger.error("setGCMDeviceToken: Singular SDK not initialized.");
                SingularInstance.collectError("e42");
            } else {
                singular.saveGCMDeviceToken(str);
            }
        } catch (Throwable th) {
            SingularInstance.collectError("e75");
            logger.error(Utils.formatException(th));
        }
    }

    public static boolean setGlobalProperty(String str, String str2, boolean z) {
        if (Utils.isEmptyOrNull(str)) {
            logger.error("Failed to set global property: key is null or empty");
            SingularInstance.collectError("e89");
            return false;
        }
        try {
            if (isInitialized()) {
                return singular.setGlobalProperty(new SingularGlobalProperty(str, str2, z));
            }
        } catch (Throwable th) {
            SingularInstance.collectError("e87");
            logger.error(Utils.formatException(th));
        }
        return false;
    }

    public static void setIMEI(String str) {
        try {
            if (!isInitialized()) {
                logger.error("setIMEI: Singular SDK not initialized.");
                SingularInstance.collectError("e57");
            } else {
                singular.setIMEI(str);
            }
        } catch (Throwable th) {
            SingularInstance.collectError("e58");
            logger.error(Utils.formatException(th));
        }
    }

    public static void setLimitAdvertisingIdentifiers(boolean z) {
        if (!isInitialized()) {
            logger.error("setLimitAdvertisingIdentifiers: Singular SDK not initialized yet, ignoring. use SingularConfig instead.");
            SingularInstance.collectError("e83");
        } else {
            singular.setLimitAdvertisingIdentifiers(z);
        }
    }

    public static void setUserDetails(SingularUserDetails singularUserDetails) {
        try {
            if (!isInitialized()) {
                logger.error("setUserDetails: Singular SDK not initialized.");
                SingularInstance.collectError("e172");
            } else {
                if (singularUserDetails == null) {
                    logger.debug("setUserDetails: userDetails is null; clearing stored user details");
                }
                singular.setUserDetails(singularUserDetails);
            }
        } catch (Throwable th) {
            SingularInstance.collectError("e174");
            logger.error(Utils.formatException(th));
        }
    }

    public static void setWrapperNameAndVersion(String str, String str2) {
        try {
            Utils.setWrapperNameAndVersion(str, str2);
        } catch (Throwable th) {
            SingularInstance.collectError("e61");
            logger.error(Utils.formatException(th));
        }
    }

    public static void stopAllTracking() {
        if (!isInitialized()) {
            logger.error("stopAllTracking: Singular SDK not initialized.");
            SingularInstance.collectError("e69");
        } else {
            singular.stopAllTracking();
        }
    }

    public static void trackingOptIn() {
        if (!isInitialized()) {
            logger.error("trackingOptIn: Singular SDK not initialized.");
            SingularInstance.collectError("e67");
        } else {
            singular.sendTrackingOptIn();
        }
    }

    public static void trackingUnder13() {
        if (!isInitialized()) {
            logger.error("trackingUnder13: Singular SDK not initialized.");
            SingularInstance.collectError("e68");
        } else {
            singular.sendTrackingUnder13();
        }
    }

    public static void unsetCustomUserId() {
        try {
            if (!isInitialized()) {
                logger.error("unsetCustomUserId: Singular SDK not initialized.");
                SingularInstance.collectError("e54");
            } else {
                singular.saveCustomUserId("");
            }
        } catch (Throwable th) {
            SingularInstance.collectError("e56");
            logger.error(Utils.formatException(th));
        }
    }

    public static void unsetGlobalProperty(String str) {
        if (Utils.isEmptyOrNull(str)) {
            logger.error("Failed to unset global property: key is null or empty");
            SingularInstance.collectError("e64");
            return;
        }
        try {
            if (!isInitialized()) {
                logger.error("unsetGlobalProperty: Singular SDK not initialized.");
                SingularInstance.collectError("e65");
            } else {
                singular.removeGlobalProperty(str);
            }
        } catch (Throwable th) {
            SingularInstance.collectError("e86");
            logger.error(Utils.formatException(th));
        }
    }

    public static boolean revenue(String str, double d, Object obj, Map<String, Object> map) {
        return customRevenue(Constants.REVENUE_EVENT_NAME, str, d, obj, map);
    }

    public static boolean revenue(String str, double d) {
        return customRevenue(Constants.REVENUE_EVENT_NAME, str, d);
    }

    public static boolean revenue(String str, double d, Map<String, Object> map) {
        return customRevenue(Constants.REVENUE_EVENT_NAME, str, d, map);
    }

    public static boolean revenue(String str, double d, String str2, String str3) {
        return customRevenue(Constants.REVENUE_EVENT_NAME, str, d, str2, str3);
    }

    public static boolean revenue(String str, double d, Object obj) {
        return customRevenue(Constants.REVENUE_EVENT_NAME, str, d, obj);
    }

    public static boolean revenue(JSONObject jSONObject) {
        return customRevenue(Constants.REVENUE_EVENT_NAME, jSONObject);
    }

    public static boolean event(String str, String str2) {
        try {
            if (!isInitialized()) {
                logger.error("event: Singular SDK not initialized.");
                SingularInstance.collectError("e28");
                return false;
            }
            if (Utils.isEmptyOrNull(str)) {
                logger.error("Event name can not be null or empty");
                SingularInstance.collectError("e31");
                return false;
            }
            return singular.logEvent(str, str2);
        } catch (Throwable th) {
            SingularInstance.collectError("e32");
            logger.error(Utils.formatException(th));
            return false;
        }
    }

    public static boolean event(String str) {
        try {
            if (!isInitialized()) {
                logger.error("event: Singular SDK not initialized.");
                SingularInstance.collectError("e26");
                return false;
            }
            if (Utils.isEmptyOrNull(str)) {
                logger.error("Event name can not be null or empty");
                SingularInstance.collectError("e27");
                return false;
            }
            return singular.logEvent(str);
        } catch (Throwable th) {
            SingularInstance.collectError("e30");
            logger.error(Utils.formatException(th));
            return false;
        }
    }

    public static boolean customRevenue(String str, String str2, double d, Object obj) {
        return customRevenue(str, str2, d, obj, (Map<String, Object>) null);
    }

    public static boolean customRevenue(String str, String str2, double d) {
        return event(str, Constants.REVENUE_CURRENCY_KEY, str2, "r", Double.valueOf(d), Constants.IS_REVENUE_EVENT_KEY, Boolean.TRUE);
    }

    public static boolean customRevenue(String str, String str2, double d, Map<String, Object> map) {
        if (map != null) {
            try {
                JSONObject jSONObject = new JSONObject(map);
                jSONObject.put(Constants.REVENUE_CURRENCY_KEY, str2);
                jSONObject.put("r", d);
                jSONObject.put(Constants.IS_REVENUE_EVENT_KEY, true);
                return eventJSON(str, jSONObject);
            } catch (JSONException e) {
                SingularInstance.collectError("e50");
                logger.error(Utils.formatException(e));
            }
        }
        return customRevenue(str, str2, d);
    }

    public static boolean customRevenue(String str, String str2, double d, String str3, String str4) {
        return event(str, Constants.REVENUE_CURRENCY_KEY, str2, "r", Double.valueOf(d), Constants.REVENUE_RECEIPT_KEY, str3, Constants.REVENUE_RECEIPT_SIGNATURE, str4, Constants.IS_REVENUE_EVENT_KEY, Boolean.TRUE);
    }

    public static boolean customRevenue(String str, String str2, double d, String str3, String str4, String str5, int i, double d2) {
        return event(str, Constants.REVENUE_CURRENCY_KEY, str2, "r", Double.valueOf(d), Constants.REVENUE_PRODUCT_SKU_KEY, str3, Constants.REVENUE_PRODUCT_NAME_KEY, str4, Constants.REVENUE_PRODUCT_CATEGORY_KEY, str5, Constants.REVENUE_PRODUCT_QUANTITY_KEY, Integer.valueOf(i), Constants.REVENUE_PRODUCT_PRICE_KEY, Double.valueOf(d2), Constants.IS_REVENUE_EVENT_KEY, Boolean.TRUE);
    }

    public static boolean init(Context context, String str, String str2) {
        String str3;
        if (context != null && str != null && str2 != null) {
            return init(context, new SingularConfig(str, str2));
        }
        SingularLog singularLog = logger;
        StringBuilder sb = new StringBuilder("SDK initialization failed: ");
        String str4 = "";
        sb.append(context == null ? "context == null " : "");
        if (str != null) {
            str3 = "";
        } else {
            str3 = "apiKey == null ";
        }
        sb.append(str3);
        if (str2 == null) {
            str4 = "secret == null";
        }
        sb.append(str4);
        sb.append(". Please provide a valid Context, API Key, and Secret.");
        singularLog.error(sb.toString());
        SingularInstance.collectError("e22");
        return false;
    }

    public static boolean customRevenue(String str, JSONObject jSONObject) {
        try {
            jSONObject.put(Constants.IS_REVENUE_EVENT_KEY, true);
        } catch (JSONException e) {
            SingularInstance.collectError("e62");
            logger.error(Utils.formatException(e));
        }
        return eventJSON(str, jSONObject);
    }
}
