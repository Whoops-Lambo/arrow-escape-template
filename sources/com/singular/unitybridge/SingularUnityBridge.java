package com.singular.unitybridge;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.singular.sdk.DeferredDeepLinkHandler;
import com.singular.sdk.SDIDAccessorHandler;
import com.singular.sdk.ShortLinkHandler;
import com.singular.sdk.Singular;
import com.singular.sdk.SingularConfig;
import com.singular.sdk.SingularDeviceAttributionHandler;
import com.singular.sdk.SingularLinkHandler;
import com.singular.sdk.SingularLinkParams;
import com.singular.sdk.SingularUserDetails;
import com.singular.sdk.internal.Constants;
import com.unity3d.player.UnityPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class SingularUnityBridge {
    private static final String LOG_TAG = "SINGULAR_UNITY_ANDROID_BRIDGE";
    private static final String SINGULAR_SDK_UNITY_OBJECT_NAME = "SingularSDKObject";
    private static SingularConfig config;
    private static String[][] staticPushNotificationLinkPaths;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Utilities {
        /* JADX INFO: Access modifiers changed from: private */
        public static String[][] extractPushLinkPaths(JSONObject jSONObject) throws JSONException {
            JSONArray jSONArray;
            if (jSONObject == null || !jSONObject.has("pushNotificationLinkPath") || (jSONArray = jSONObject.getJSONArray("pushNotificationLinkPath")) == null) {
                return null;
            }
            String[][] strArr = new String[jSONArray.length()][];
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(i);
                if (jSONArrayOptJSONArray == null) {
                    return null;
                }
                String[] strArr2 = new String[jSONArrayOptJSONArray.length()];
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    strArr2[i2] = jSONArrayOptJSONArray.optString(i2, null);
                }
                strArr[i] = strArr2;
            }
            return strArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static SingularUserDetails userDetailsFromJson(JSONObject jSONObject) {
            if (jSONObject == null || jSONObject.length() == 0) {
                return null;
            }
            SingularUserDetails singularUserDetails = new SingularUserDetails();
            if (jSONObject.has("email")) {
                singularUserDetails.setEmail(jSONObject.optString("email", null));
            }
            if (jSONObject.has("phoneNumber")) {
                singularUserDetails.setPhoneNumber(jSONObject.optString("phoneNumber", null));
            }
            if (jSONObject.has("emailSTD")) {
                singularUserDetails.setEmailSTD(jSONObject.optString("emailSTD", null));
            }
            if (jSONObject.has("emailNoDots")) {
                singularUserDetails.setEmailNoDots(jSONObject.optString("emailNoDots", null));
            }
            if (jSONObject.has("phoneE164")) {
                singularUserDetails.setPhoneE164(jSONObject.optString("phoneE164", null));
            }
            if (jSONObject.has("phoneDigits")) {
                singularUserDetails.setPhoneDigits(jSONObject.optString("phoneDigits", null));
            }
            return singularUserDetails;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ArrayList<String> jsonArrayToStringArrayList(JSONArray jSONArray) throws JSONException {
            ArrayList<String> arrayList = new ArrayList<>();
            if (jSONArray == null || jSONArray.length() == 0) {
                return null;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Map<String, Object> jsonStringToMap(String str) {
            HashMap map = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.getString(next));
                }
                return map;
            } catch (Exception e) {
                Log.d(SingularUnityBridge.LOG_TAG, "Unable to transform json string to Map with error:" + e.getMessage());
                return map;
            }
        }

        private Utilities() {
        }
    }

    public static void createReferrerShortLink(String str, String str2, String str3, String str4) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str4);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        Singular.createReferrerShortLink(str, str2, str3, jSONObject, new ShortLinkHandler() { // from class: com.singular.unitybridge.SingularUnityBridge.6
            @Override // com.singular.sdk.ShortLinkHandler
            public void onError(final String str5) {
                UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.singular.unitybridge.SingularUnityBridge.6.2
                    @Override // java.lang.Runnable
                    public void run() {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("data", (Object) null);
                            jSONObject2.put("error", str5);
                        } catch (JSONException e2) {
                            Log.d(SingularUnityBridge.LOG_TAG, "Unable to create json object with error:" + e2.getMessage());
                        }
                        UnityPlayer.UnitySendMessage(SingularUnityBridge.SINGULAR_SDK_UNITY_OBJECT_NAME, "ShortLinkResolved", jSONObject2.toString());
                    }
                });
            }

            @Override // com.singular.sdk.ShortLinkHandler
            public void onSuccess(final String str5) {
                UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.singular.unitybridge.SingularUnityBridge.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("data", str5);
                            jSONObject2.put("error", (Object) null);
                        } catch (JSONException e2) {
                            Log.d(SingularUnityBridge.LOG_TAG, "Unable to create json object with error:" + e2.getMessage());
                        }
                        UnityPlayer.UnitySendMessage(SingularUnityBridge.SINGULAR_SDK_UNITY_OBJECT_NAME, "ShortLinkResolved", jSONObject2.toString());
                    }
                });
            }
        });
    }

    public static void init(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("apiKey", null);
            String strOptString2 = jSONObject.optString("secret", null);
            if (strOptString != null && strOptString2 != null) {
                Context applicationContext = UnityPlayer.currentActivity.getApplicationContext();
                SingularConfig singularConfig = new SingularConfig(strOptString, strOptString2);
                String strOptString3 = jSONObject.optString("facebookAppId", null);
                if (!TextUtils.isEmpty(strOptString3)) {
                    singularConfig.withFacebookAppId(strOptString3);
                }
                String strOptString4 = jSONObject.optString(Constants.PREF_CSI_REFERRER_KEY, null);
                if (!TextUtils.isEmpty(strOptString4)) {
                    singularConfig.withOpenURI(Uri.parse(strOptString4));
                }
                if (jSONObject.optBoolean("enableDeferredDeepLinks", false)) {
                    singularConfig.withDDLHandler(new DeferredDeepLinkHandler() { // from class: com.singular.unitybridge.SingularUnityBridge.2
                        @Override // com.singular.sdk.DeferredDeepLinkHandler
                        public void handleLink(final String str2) {
                            UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.singular.unitybridge.SingularUnityBridge.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    String str3 = str2;
                                    if (str3 == null) {
                                        UnityPlayer.UnitySendMessage(SingularUnityBridge.SINGULAR_SDK_UNITY_OBJECT_NAME, "DeepLinkHandler", "");
                                    } else {
                                        UnityPlayer.UnitySendMessage(SingularUnityBridge.SINGULAR_SDK_UNITY_OBJECT_NAME, "DeepLinkHandler", str3);
                                    }
                                }
                            });
                        }
                    });
                    long jOptLong = jSONObject.optLong("ddlTimeoutSec", 0L);
                    if (jOptLong > 0) {
                        singularConfig.withDDLTimeoutInSec(jOptLong);
                    }
                }
                SingularLinkHandler singularLinkHandler = new SingularLinkHandler() { // from class: com.singular.unitybridge.SingularUnityBridge.3
                    @Override // com.singular.sdk.SingularLinkHandler
                    public void onResolved(final SingularLinkParams singularLinkParams) {
                        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.singular.unitybridge.SingularUnityBridge.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.put("deeplink", singularLinkParams.getDeeplink());
                                    jSONObject2.put("passthrough", singularLinkParams.getPassthrough());
                                    jSONObject2.put("is_deferred", singularLinkParams.isDeferred());
                                    if (singularLinkParams.getUrlParameters() != null) {
                                        jSONObject2.putOpt("url_parameters", new JSONObject(singularLinkParams.getUrlParameters()));
                                    }
                                } catch (JSONException e) {
                                    Log.d(SingularUnityBridge.LOG_TAG, "Unable to create json object with error:" + e.getMessage());
                                }
                                UnityPlayer.UnitySendMessage(SingularUnityBridge.SINGULAR_SDK_UNITY_OBJECT_NAME, "SingularLinkHandlerResolved", jSONObject2.toString());
                            }
                        });
                    }
                };
                Intent intent = UnityPlayer.currentActivity.getIntent();
                long jOptLong2 = jSONObject.optLong("shortlinkResolveTimeout", 0L);
                if (jOptLong2 > 0) {
                    singularConfig.withSingularLink(intent, singularLinkHandler, jOptLong2);
                } else {
                    singularConfig.withSingularLink(intent, singularLinkHandler);
                }
                if (jSONObject.optBoolean("enableLogging", false)) {
                    singularConfig.withLoggingEnabled();
                }
                int iOptInt = jSONObject.optInt("logLevel", -1);
                if (iOptInt >= 0) {
                    singularConfig.withLogLevel(iOptInt);
                }
                String strOptString5 = jSONObject.optString("fcmDeviceToken", null);
                if (strOptString5 != null) {
                    singularConfig.withFCMDeviceToken(strOptString5);
                }
                long jOptLong3 = jSONObject.optLong("sessionTimeoutSec", 0L);
                if (jOptLong3 > 0) {
                    singularConfig.withSessionTimeoutInSec(jOptLong3);
                }
                String strOptString6 = jSONObject.optString("customUserId", null);
                if (strOptString6 != null) {
                    singularConfig.withCustomUserId(strOptString6);
                }
                String strOptString7 = jSONObject.optString(Constants.DeviceIdentifierKeyspaceKeys.IMEI_KEYSPACE_KEY, null);
                if (strOptString7 != null) {
                    singularConfig.withIMEI(strOptString7);
                }
                if (jSONObject.optBoolean("collectOAID", false)) {
                    singularConfig.withOAIDCollection();
                }
                if (jSONObject.has("limitDataSharing")) {
                    singularConfig.withLimitDataSharing(jSONObject.optBoolean("limitDataSharing"));
                }
                singularConfig.limitAdvertisingIdentifiers = Boolean.valueOf(jSONObject.optBoolean("limitAdvertisingIdentifiers", false));
                String[][] strArrExtractPushLinkPaths = Utilities.extractPushLinkPaths(jSONObject);
                staticPushNotificationLinkPaths = strArrExtractPushLinkPaths;
                singularConfig.withPushNotificationPayload(intent, strArrExtractPushLinkPaths);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("globalProperties");
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        JSONObject jSONObject2 = jSONObjectOptJSONObject.getJSONObject(itKeys.next());
                        String strOptString8 = jSONObject2.optString("Key", "");
                        if (strOptString8 != null && !strOptString8.trim().equals("")) {
                            singularConfig.withGlobalProperty(strOptString8, jSONObject2.optString("Value", ""), jSONObject2.optBoolean("OverrideExisting", false));
                        }
                    }
                }
                SingularUserDetails singularUserDetailsUserDetailsFromJson = Utilities.userDetailsFromJson(jSONObject.optJSONObject("userDetails"));
                if (singularUserDetailsUserDetailsFromJson != null) {
                    singularConfig.withUserDetails(singularUserDetailsUserDetailsFromJson);
                }
                singularConfig.withCustomSdid(jSONObject.optString("customSdid", null), new SDIDAccessorHandler() { // from class: com.singular.unitybridge.SingularUnityBridge.4
                    @Override // com.singular.sdk.SDIDAccessorHandler
                    public void didSetSdid(final String str2) {
                        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.singular.unitybridge.SingularUnityBridge.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                UnityPlayer.UnitySendMessage(SingularUnityBridge.SINGULAR_SDK_UNITY_OBJECT_NAME, "SingularDidSetSdid", str2);
                            }
                        });
                    }

                    @Override // com.singular.sdk.SDIDAccessorHandler
                    public void sdidReceived(final String str2) {
                        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.singular.unitybridge.SingularUnityBridge.4.2
                            @Override // java.lang.Runnable
                            public void run() {
                                UnityPlayer.UnitySendMessage(SingularUnityBridge.SINGULAR_SDK_UNITY_OBJECT_NAME, "SingularSdidReceived", str2);
                            }
                        });
                    }
                });
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("brandedDomains");
                    if (jSONArray != null && jSONArray.length() > 0) {
                        singularConfig.brandedDomains = Utilities.jsonArrayToStringArrayList(jSONArray);
                    }
                } catch (JSONException e) {
                    Log.e(LOG_TAG, "Exception thrown while parsing brandedDomains:" + e.getMessage());
                }
                config = singularConfig;
                singularConfig.withSingularDeviceAttribution(new SingularDeviceAttributionHandler() { // from class: com.singular.unitybridge.SingularUnityBridge.5
                    @Override // com.singular.sdk.SingularDeviceAttributionHandler
                    public void onDeviceAttributionInfoReceived(final Map<String, Object> map) {
                        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.singular.unitybridge.SingularUnityBridge.5.1
                            @Override // java.lang.Runnable
                            public void run() {
                                UnityPlayer.UnitySendMessage(SingularUnityBridge.SINGULAR_SDK_UNITY_OBJECT_NAME, "SingularDeviceAttributionCallback", new JSONObject(map).toString());
                            }
                        });
                    }
                });
                Singular.init(applicationContext, singularConfig);
            }
        } catch (Throwable th) {
            Log.d(LOG_TAG, th.getMessage());
        }
    }

    public static void onNewIntent(final Intent intent) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.singular.unitybridge.SingularUnityBridge.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (SingularUnityBridge.config == null) {
                        return;
                    }
                    Intent intent2 = intent;
                    if (intent2 != null && intent2.getExtras() != null && SingularUnityBridge.staticPushNotificationLinkPaths != null) {
                        SingularUnityBridge.config.withPushNotificationPayload(intent, SingularUnityBridge.staticPushNotificationLinkPaths);
                    }
                    Intent intent3 = intent;
                    if (intent3 != null && intent3.getData() != null && "android.intent.action.VIEW".equals(intent.getAction())) {
                        SingularUnityBridge.config.withSingularLink(intent, SingularUnityBridge.config.linkCallback, SingularUnityBridge.config.shortlinkTimeoutSec);
                    }
                    Singular.init(UnityPlayer.currentActivity.getApplicationContext(), SingularUnityBridge.config);
                } catch (Throwable th) {
                    Log.e(SingularUnityBridge.LOG_TAG, "Exception thrown while handling onNewIntent:" + th.getMessage());
                }
            }
        });
    }

    public static void setUserDetails(String str) {
        try {
            if (str == null) {
                Singular.setUserDetails(null);
            } else {
                Singular.setUserDetails(Utilities.userDetailsFromJson(new JSONObject(str)));
            }
        } catch (Throwable th) {
            Log.e(LOG_TAG, "Unable to set user details with error:" + th.getMessage());
        }
    }

    public static void customRevenueWithAttributes(String str, String str2, String str3, String str4) {
        try {
            Singular.customRevenue(str, str2, Double.parseDouble(str3), (Map<String, Object>) Utilities.jsonStringToMap(str4));
        } catch (Exception e) {
            Log.d(LOG_TAG, "Unable to send custom revenue event with error:" + e.getMessage());
        }
    }

    public static void revenueWithAttributes(String str, String str2, String str3) {
        try {
            Singular.revenue(str, Double.parseDouble(str2), (Map<String, Object>) Utilities.jsonStringToMap(str3));
        } catch (Exception e) {
            Log.d(LOG_TAG, "Unable to send revenue event with error:" + e.getMessage());
        }
    }
}
