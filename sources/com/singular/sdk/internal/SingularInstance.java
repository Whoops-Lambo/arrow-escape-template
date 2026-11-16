package com.singular.sdk.internal;

import android.app.Application;
import android.content.Context;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.singular.sdk.ShortLinkHandler;
import com.singular.sdk.SingularConfig;
import com.singular.sdk.SingularDeviceAttributionHandler;
import com.singular.sdk.SingularUserDetails;
import com.singular.sdk.internal.InstallReferrer.SLDigitalTurbineReferrer;
import com.singular.sdk.internal.InstallReferrer.SLGoogleReferrer;
import com.singular.sdk.internal.InstallReferrer.SLInstallReferrerCompletionHandler;
import com.singular.sdk.internal.InstallReferrer.SLSamsungReferrer;
import com.singular.sdk.internal.utils.SLJsonUtils;
import defpackage.e32;
import defpackage.h50;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class SingularInstance {
    private static final int RETRY_DELAY_INTERVAL_MS = 2000;
    private static final int RETRY_DELAY_MAX = 10;
    private static SingularInstance instance;
    private static final SingularLog logger = SingularLog.getLogger("Instance");
    private static int retryCounter = 0;
    private final ApiManager apiManager;
    private SingularConfig config;
    private final Context context;
    private DeviceInfo deviceInfo;
    String dtInstallReferrer;
    private HashMap<String, String> globalProperties;
    Map<String, Object> googleInstallReferrer;
    private double installReferrerTimeInterval;
    Map<String, Object> metaInstallReferrer;
    Map<String, Object> samsungInstallReferrer;
    private SessionManager sessionManager;
    private final SingularWorkerThread worker;
    private boolean initialized = false;
    private boolean isFirstLaunch = false;
    private final ErrorReporter errorReporter = new ErrorReporter();

    public void clearGlobalProperties() {
        this.globalProperties = null;
        saveGlobalProperties();
    }

    public boolean logEvent(String str, String str2) {
        int length = (str != null ? str.length() : 0) + (str2 != null ? str2.length() : 0);
        if (length <= 20000) {
            logEvent(new ApiSubmitEvent.RawEvent(str, str2));
            return true;
        }
        logger.debug("Event discarded! payload length = %d", Integer.valueOf(length));
        collectError("fe14");
        return false;
    }

    public static void collectError(String str) {
        SingularInstance singularInstance = instance;
        if (singularInstance == null || singularInstance.errorReporter == null || !ConfigManager.getInstance().shouldReportErrors()) {
            return;
        }
        instance.errorReporter.collectError(str);
    }

    private static SingularUserDetails createUserDetailsCopy(SingularUserDetails singularUserDetails) {
        if (singularUserDetails == null) {
            logger.debug("createUserDetailsCopy: userDetails is null.skipping copy.");
            return null;
        }
        SingularUserDetails singularUserDetails2 = new SingularUserDetails();
        singularUserDetails2.setEmail(singularUserDetails.getEmail());
        singularUserDetails2.setPhoneNumber(singularUserDetails.getPhoneNumber());
        singularUserDetails2.setEmailSTD(singularUserDetails.getEmailSTD());
        singularUserDetails2.setEmailNoDots(singularUserDetails.getEmailNoDots());
        singularUserDetails2.setPhoneE164(singularUserDetails.getPhoneE164());
        singularUserDetails2.setPhoneDigits(singularUserDetails.getPhoneDigits());
        return singularUserDetails2;
    }

    public static SingularInstance getInstance(Context context, SingularConfig singularConfig) throws IOException {
        singularConfig.userDetails = createUserDetailsCopy(singularConfig.userDetails);
        if (instance == null) {
            synchronized (SingularInstance.class) {
                try {
                    if (instance == null) {
                        SingularLog.ENABLE_LOGGING = singularConfig.enableLogging;
                        SingularLog.LOG_LEVEL = singularConfig.logLevel;
                        instance = new SingularInstance(context, singularConfig);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        SingularInstance singularInstance = instance;
        singularInstance.config = singularConfig;
        return singularInstance;
    }

    private SingularDataStore getSharedPreferences() {
        return SingularDataStore.get(this.context, Constants.PREF_SESSION);
    }

    private void persistBoolean(final String str, final boolean z) {
        runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.17
            @Override // java.lang.Runnable
            public void run() {
                SingularInstance.this.saveBooleanToPref(str, z);
            }
        });
    }

    private boolean putGlobalProperty(SingularGlobalProperty singularGlobalProperty) {
        if (this.globalProperties.containsKey(singularGlobalProperty.getKey())) {
            if (singularGlobalProperty.isOverrideExisting()) {
                this.globalProperties.put(singularGlobalProperty.getKey(), singularGlobalProperty.getValue());
            }
            return true;
        }
        if (this.globalProperties.size() >= 5) {
            return false;
        }
        this.globalProperties.put(singularGlobalProperty.getKey(), singularGlobalProperty.getValue());
        return true;
    }

    private void saveGlobalProperties() {
        if (this.globalProperties == null) {
            this.globalProperties = new HashMap<>();
        }
        getSharedPreferences().putString(Constants.GLOBAL_PROPERTIES_KEY, getGlobalPropertiesJSON().toString());
    }

    public void clearUserDetails() {
        runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.19
            @Override // java.lang.Runnable
            public void run() {
                UserDetailsManager.getInstance().clearUserDetailsPayload();
            }
        });
    }

    public void fetchDTInstallReferrer() {
        new SLDigitalTurbineReferrer().fetchReferrer(getContext(), new SLInstallReferrerCompletionHandler() { // from class: com.singular.sdk.internal.SingularInstance.8
            @Override // com.singular.sdk.internal.InstallReferrer.SLInstallReferrerCompletionHandler
            public void onInstallReferrerReceived(Map<String, Object> map) {
                if (map == null || !map.containsKey(Constants.DT_INSTALL_REFERRER_KEY)) {
                    return;
                }
                SingularInstance.this.dtInstallReferrer = map.get(Constants.DT_INSTALL_REFERRER_KEY).toString();
            }
        });
    }

    public void fetchMetaInstallReferrer() {
        new SLMetaReferrer().fetchReferrer(getContext(), new SLInstallReferrerCompletionHandler() { // from class: com.singular.sdk.internal.SingularInstance.7
            @Override // com.singular.sdk.internal.InstallReferrer.SLInstallReferrerCompletionHandler
            public void onInstallReferrerReceived(Map<String, Object> map) {
                SingularInstance.this.metaInstallReferrer = map;
            }
        });
    }

    public ApiManager getApiManager() {
        return this.apiManager;
    }

    public String getCollectedErrors() {
        if (this.errorReporter != null) {
            return new JSONObject(this.errorReporter.getCollectedErrors()).toString();
        }
        return null;
    }

    public Context getContext() {
        return this.context;
    }

    public String getDTInstallReferrer() {
        return this.dtInstallReferrer;
    }

    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public HashMap<String, String> getGlobalProperties() {
        return this.globalProperties;
    }

    public JSONObject getGlobalPropertiesJSON() {
        return new JSONObject(this.globalProperties);
    }

    public Map getGoogleInstallReferrer() {
        return this.googleInstallReferrer;
    }

    public double getInstallReferrerTimeInterval() {
        return this.installReferrerTimeInterval;
    }

    public boolean getIsFirstLaunch() {
        return this.isFirstLaunch;
    }

    public Map getMetaInstallReferrer() {
        return this.metaInstallReferrer;
    }

    public Map getSamsungInstallReferrer() {
        return this.samsungInstallReferrer;
    }

    public long getSessionId() {
        SessionManager sessionManager = this.sessionManager;
        if (sessionManager == null) {
            return -1L;
        }
        return sessionManager.getSessionId();
    }

    public SessionManager getSessionManager() {
        return this.sessionManager;
    }

    public SingularConfig getSingularConfig() {
        return this.config;
    }

    public void handleDeviceAttributionData(JSONObject jSONObject) {
        try {
            final Map<String, Object> mapJsonToMap = SLJsonUtils.jsonToMap(jSONObject);
            logger.debug("device attribution json to map: " + mapJsonToMap);
            final SingularDeviceAttributionHandler singularDeviceAttributionHandler = this.config.deviceAttributionHandler;
            if (mapJsonToMap == null || singularDeviceAttributionHandler == null) {
                return;
            }
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.20
                @Override // java.lang.Runnable
                public void run() {
                    singularDeviceAttributionHandler.onDeviceAttributionInfoReceived(mapJsonToMap);
                }
            });
        } catch (Throwable th) {
            logger.debug("could not convert device attribution json object to map" + th.getMessage());
            collectError("e99");
        }
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public boolean isLimitAdvertisingIdentifiers() {
        if (instance == null) {
            logger.debug("isLimitAdvertisingIdentifiers: instance null, returning default false.");
            collectError("e48");
            return false;
        }
        SingularConfig singularConfig = this.config;
        if (singularConfig != null) {
            return singularConfig.limitAdvertisingIdentifiers.booleanValue();
        }
        logger.debug("isLimitAdvertisingIdentifiers: config null, returning default false.");
        collectError("e59");
        return false;
    }

    public void limitDataSharing(boolean z) {
        saveBooleanToPref("limit_data_sharing", z);
    }

    public void onActivityPaused(long j) {
        this.sessionManager.onExitForeground(j);
    }

    public void onActivityResumed(long j) {
        SessionManager sessionManager = this.sessionManager;
        if (sessionManager != null) {
            sessionManager.onEnterForeground(j);
        }
    }

    public void resumeAllTracking() {
        persistBoolean(Constants.STOP_ALL_TRACKING_KEY, false);
    }

    public void retryTask(Runnable runnable) {
        if (retryCounter < 10) {
            runOnWorkerDelayed(runnable, 2000);
            retryCounter++;
        }
    }

    public void runOnWorker(Runnable runnable) {
        this.worker.post(runnable);
    }

    public void runOnWorkerAtFront(Runnable runnable) {
        this.worker.postAtFront(runnable);
    }

    public void runOnWorkerDelayed(Runnable runnable, int i) {
        this.worker.postDelayed(runnable, i);
    }

    public void saveFCMDeviceToken(String str) {
        saveDeviceToken(Constants.FCM_DEVICE_TOKEN_KEY, str);
        DeviceInfo deviceInfo = this.deviceInfo;
        if (deviceInfo != null) {
            deviceInfo.setFcmRegId(str);
        }
    }

    public void saveGCMDeviceToken(String str) {
        saveDeviceToken(Constants.GCM_DEVICE_TOKEN_KEY, str);
        DeviceInfo deviceInfo = this.deviceInfo;
        if (deviceInfo != null) {
            deviceInfo.setGcmRegId(str);
        }
    }

    public void sendTrackingOptIn() {
        runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.14
            @Override // java.lang.Runnable
            public void run() {
                ApiGDPRConsent apiGDPRConsent = new ApiGDPRConsent(Utils.getCurrentTimeMillis());
                apiGDPRConsent.addParams(ApiGDPRConsent.Params.build(this));
                SingularInstance.this.logApi(apiGDPRConsent);
            }
        });
    }

    public void sendTrackingUnder13() {
        runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.15
            @Override // java.lang.Runnable
            public void run() {
                ApiGDPRUnder13 apiGDPRUnder13 = new ApiGDPRUnder13(Utils.getCurrentTimeMillis());
                apiGDPRUnder13.addParams(ApiGDPRUnder13.Params.build(this));
                SingularInstance.this.logApi(apiGDPRUnder13);
            }
        });
    }

    public void setLimitAdvertisingIdentifiers(boolean z) {
        try {
            if (instance == null) {
                logger.debug("setLimitAdvertisingIdentifiers: instance null, returning.");
                collectError("e45");
                return;
            }
            SingularConfig singularConfig = this.config;
            if (singularConfig == null) {
                logger.debug("setLimitAdvertisingIdentifiers: config null, returning.");
                collectError("e46");
                return;
            }
            singularConfig.limitAdvertisingIdentifiers = Boolean.valueOf(z);
            SingularInstance singularInstance = instance;
            DeviceInfo deviceInfo = singularInstance.deviceInfo;
            if (deviceInfo == null) {
                logger.debug("setLimitAdvertisingIdentifiers: deviceInfo null, returning.");
                collectError("e47");
            } else if (z) {
                deviceInfo.resetAdvertisingIdentifiers();
            } else if (singularInstance.context != null) {
                runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.16
                    @Override // java.lang.Runnable
                    public void run() {
                        SingularInstance.instance.deviceInfo.blockingFetchLimitedAdvertisingIdentifiers(SingularInstance.instance.context);
                    }
                });
            }
        } catch (Throwable th) {
            logger.debug("setLimitAdvertisingIdentifiers failed with exception: " + Utils.formatException(th));
            collectError("fe47");
        }
    }

    public void startSession(long j) {
        ApiStartSession apiStartSession = new ApiStartSession(j);
        apiStartSession.addParams(ApiStartSession.Params.build(j, instance));
        instance.apiManager.enqueue(apiStartSession);
        SingularInstance singularInstance = instance;
        singularInstance.config.openUri = null;
        singularInstance.isFirstLaunch = false;
    }

    public void startSessionIfOpenedWithDeeplink() {
        if (this.config.singularLink != null || SeoLinkManager.getInstance().hasSeoLink()) {
            runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.13
                @Override // java.lang.Runnable
                public void run() {
                    SingularInstance.this.sessionManager.startNewSession(Utils.getCurrentTimeMillis());
                }
            });
        }
    }

    public void startSessionIfOpenedWithPush() {
        runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.12
            @Override // java.lang.Runnable
            public void run() {
                SingularInstance.this.sessionManager.startNewSession(Utils.getCurrentTimeMillis());
            }
        });
    }

    public void stopAllTracking() {
        persistBoolean(Constants.STOP_ALL_TRACKING_KEY, true);
    }

    private SingularInstance(Context context, SingularConfig singularConfig) throws IOException {
        SingularLog singularLog = logger;
        singularLog.debug("SDK version: %s", Constants.SDK_VERSION);
        singularLog.debug("SDK build info: %s", Constants.SDK_BUILD_INFO);
        singularLog.debug("new SingularInstance() with config: %s", singularConfig);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            this.context = applicationContext;
            this.config = singularConfig;
            SingularDataStore.get(applicationContext, Constants.PREF_SESSION).preload();
            SingularWorkerThread singularWorkerThread = new SingularWorkerThread("worker");
            this.worker = singularWorkerThread;
            this.apiManager = new ApiManager(new SingularWorkerThread("api"), context, new SQLitePersistentQueue(context));
            singularWorkerThread.start();
            initGlobalProperties();
            runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.1
                @Override // java.lang.Runnable
                public void run() {
                    SingularInstance.this.init(this);
                }
            });
            return;
        }
        collectError("ie1");
        e32.i("Context failed to cast to ApplicationContext");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void init(SingularInstance singularInstance) {
        if (isInitialized()) {
            logger.error("Singular is already initialized, please don't call init() again.");
            collectError("ie2");
            return;
        }
        try {
            singularInstance.isFirstLaunch = Utils.getAndSetIsFirstLaunch(getContext());
            if (!Utils.isEmptyOrNull(this.config.fcmDeviceToken)) {
                saveDeviceToken(Constants.FCM_DEVICE_TOKEN_KEY, this.config.fcmDeviceToken);
            }
            String str = this.config.customUserId;
            if (str != null) {
                saveCustomUserId(str);
            }
            Boolean bool = this.config.limitDataSharing;
            if (bool != null) {
                limitDataSharing(bool.booleanValue());
            }
            UserDetailsManager.getInstance().applyFromSingularConfig(this.config);
            String str2 = this.config.imei;
            if (str2 != null) {
                setIMEI(str2);
            }
            singularInstance.deviceInfo = new DeviceInfo(singularInstance.context, this.config.collectOAID, Boolean.valueOf(isLimitAdvertisingIdentifiers()), singularInstance.isFirstLaunch);
            ConfigManager.getInstance().setup();
            DeviceIDManager.getInstance().setup(singularInstance);
            BatchManager.getInstance().setup(this.context);
            BatchManager.getInstance().sendEvents();
            singularInstance.sessionManager = new SessionManager(singularInstance);
            this.initialized = true;
            ApiManager apiManager = this.apiManager;
            if (apiManager != null) {
                apiManager.wakeUp();
            }
            logger.info("Singular is initialized now.");
        } catch (Throwable th) {
            collectError("ie43");
            logger.error("error in init()", th);
        }
    }

    private void initGlobalProperties() {
        this.globalProperties = loadGlobalProperties();
        if (this.config.globalProperties.size() != 0) {
            HashMap<String, String> map = (HashMap) this.globalProperties.clone();
            for (SingularGlobalProperty singularGlobalProperty : this.config.globalProperties.values()) {
                if (singularGlobalProperty.isOverrideExisting() || !map.containsKey(singularGlobalProperty.getKey())) {
                    map.put(singularGlobalProperty.getKey(), singularGlobalProperty.getValue());
                }
            }
            if (map.size() <= 5) {
                this.globalProperties = map;
                saveGlobalProperties();
                if (this.globalProperties == null) {
                    clearGlobalProperties();
                }
            }
        }
    }

    private boolean isSessionManagerInitialized() {
        if (isInitialized() && getInstance() != null && getSessionManager() != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveBooleanToPref(String str, boolean z) {
        getSharedPreferences().putBoolean(str, z);
    }

    private void saveDeviceToken(String str, String str2) {
        getSharedPreferences().putString(str, str2);
    }

    public void createReferrerShortLink(String str, String str2, String str3, JSONObject jSONObject, ShortLinkHandler shortLinkHandler) {
        String validationError = ReferrerLinkService.getValidationError(str, str2, str3, jSONObject);
        if (validationError != null) {
            logger.error("createReferrerShortLink validation failed");
            shortLinkHandler.onError("Error sending request: ".concat(validationError));
            return;
        }
        try {
            ReferrerLinkService.sendReferrerRequest(ReferrerLinkService.unifyParamsToUrl(str, str2, str3, jSONObject), shortLinkHandler);
        } catch (JSONException e) {
            logger.error("Error in JSON parsing ", e);
            shortLinkHandler.onError("Error sending request: could not unify params (" + e.getClass().getSimpleName() + ")");
        }
    }

    public void fetchInstallReferrerAndSendSession(long j) {
        final long currentTimeMillis = Utils.getCurrentTimeMillis();
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        new SLGoogleReferrer().fetchReferrer(getContext(), new SLInstallReferrerCompletionHandler() { // from class: com.singular.sdk.internal.SingularInstance.9
            @Override // com.singular.sdk.internal.InstallReferrer.SLInstallReferrerCompletionHandler
            public void onInstallReferrerReceived(Map<String, Object> map) {
                SingularInstance.this.googleInstallReferrer = map;
                countDownLatch.countDown();
                SingularInstance.this.installReferrerTimeInterval = Utils.lagSince(currentTimeMillis);
            }
        });
        new SLSamsungReferrer().fetchReferrer(getContext(), new SLInstallReferrerCompletionHandler() { // from class: com.singular.sdk.internal.SingularInstance.10
            @Override // com.singular.sdk.internal.InstallReferrer.SLInstallReferrerCompletionHandler
            public void onInstallReferrerReceived(Map<String, Object> map) {
                SingularInstance.this.samsungInstallReferrer = map;
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            logger.debug("InterruptedException while waiting for install referrer: " + Utils.formatException(e));
            collectError("e44");
        }
        startSession(j);
    }

    public Boolean getLimitDataSharing() {
        SingularDataStore sharedPreferences = getSharedPreferences();
        if (!sharedPreferences.contains("limit_data_sharing")) {
            return null;
        }
        return Boolean.valueOf(sharedPreferences.getBoolean("limit_data_sharing", false));
    }

    public boolean isAllTrackingStopped() {
        return getSharedPreferences().getBoolean(Constants.STOP_ALL_TRACKING_KEY, false);
    }

    public HashMap<String, String> loadGlobalProperties() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(getSharedPreferences().getString(Constants.GLOBAL_PROPERTIES_KEY, JsonUtils.EMPTY_JSON));
        } catch (Throwable th) {
            logger.error("Failed to parse global properties JSON, using empty object: " + Utils.formatException(th));
            jSONObject = new JSONObject();
        }
        HashMap<String, String> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            } catch (Throwable th2) {
                h50.A(th2, new StringBuilder("Failed to load global property from JSON: "), logger);
            }
        }
        return map;
    }

    public void logApi(final BaseApi baseApi) {
        if (isAllTrackingStopped()) {
            logger.debug("Tracking was stopped! not logging event!");
        } else if (!isSessionManagerInitialized()) {
            retryTask(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.4
                @Override // java.lang.Runnable
                public void run() {
                    SingularInstance.this.logApi(baseApi);
                }
            });
            collectError("ie4");
        } else {
            runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.5
                @Override // java.lang.Runnable
                public void run() {
                    SingularInstance.instance.apiManager.enqueue(baseApi);
                }
            });
        }
    }

    public void logSessionStart(final long j) {
        if (isAllTrackingStopped()) {
            logger.debug("Tracking was stopped! not logging event!");
        } else {
            runOnWorkerAtFront(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.6
                @Override // java.lang.Runnable
                public void run() {
                    if (SingularInstance.instance != null) {
                        boolean z = SingularInstance.this.isFirstLaunch;
                        SingularInstance singularInstance = SingularInstance.this;
                        if (z) {
                            singularInstance.fetchMetaInstallReferrer();
                            SingularInstance.this.fetchDTInstallReferrer();
                            SingularInstance.this.fetchInstallReferrerAndSendSession(j);
                            return;
                        }
                        singularInstance.startSession(j);
                    }
                }
            });
        }
    }

    public void logSetDeviceCustomUserId() {
        if (isAllTrackingStopped()) {
            logger.debug("Tracking was stopped! not logging event!");
        } else {
            runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.11
                @Override // java.lang.Runnable
                public void run() {
                    ApiCustomUserId apiCustomUserId = new ApiCustomUserId(Utils.getCurrentTimeMillis());
                    apiCustomUserId.addParams(ApiCustomUserId.Params.build(SingularInstance.instance));
                    SingularInstance.instance.apiManager.enqueue(apiCustomUserId);
                }
            });
        }
    }

    public void removeGlobalProperty(String str) {
        if (!Utils.isEmptyOrNull(str) && this.globalProperties.containsKey(str)) {
            this.globalProperties.remove(str);
            saveGlobalProperties();
        }
    }

    public void saveCustomUserId(String str) {
        getSharedPreferences().putString(Constants.CUSTOM_USER_ID_KEY, str);
        DeviceInfo deviceInfo = this.deviceInfo;
        if (deviceInfo != null) {
            deviceInfo.setCustomUserId(str);
        }
    }

    public boolean setGlobalProperty(SingularGlobalProperty singularGlobalProperty) {
        if (!putGlobalProperty(singularGlobalProperty)) {
            return false;
        }
        saveGlobalProperties();
        return true;
    }

    public void setIMEI(String str) {
        Utils.setImei(str);
    }

    public void setUserDetails(SingularUserDetails singularUserDetails) {
        final SingularUserDetails singularUserDetailsCreateUserDetailsCopy = createUserDetailsCopy(singularUserDetails);
        runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.18
            @Override // java.lang.Runnable
            public void run() {
                UserDetailsManager.getInstance().storeUserDetails(singularUserDetailsCreateUserDetailsCopy);
            }
        });
    }

    public static SingularInstance getInstance() {
        return instance;
    }

    public boolean logEvent(String str) {
        return logEvent(str, null);
    }

    public void logEvent(final ApiSubmitEvent.RawEvent rawEvent) {
        if (isAllTrackingStopped()) {
            logger.debug("Tracking was stopped! not logging event!");
        } else if (!isSessionManagerInitialized()) {
            retryTask(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.2
                @Override // java.lang.Runnable
                public void run() {
                    SingularInstance.this.logEvent(rawEvent);
                }
            });
            collectError("ie3");
        } else {
            runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.3
                @Override // java.lang.Runnable
                public void run() {
                    ApiSubmitEvent apiSubmitEvent = new ApiSubmitEvent(rawEvent.timestamp);
                    apiSubmitEvent.addParams(ApiSubmitEvent.Params.build(rawEvent, SingularInstance.instance));
                    if (!apiSubmitEvent.isAdmonEvent() || BatchManager.getInstance() == null) {
                        SingularInstance.instance.apiManager.enqueue(apiSubmitEvent);
                    } else {
                        BatchManager.getInstance().addToBatch(apiSubmitEvent);
                    }
                }
            });
        }
    }
}
