package com.ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.ironsource.B7;
import com.ironsource.C4664b4;
import com.ironsource.C4790i4;
import com.ironsource.C4871me;
import com.ironsource.C4950r4;
import com.ironsource.C4990t8;
import com.ironsource.D8;
import com.ironsource.Pb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.singular.sdk.internal.UserDetailsUtils;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import defpackage.d;
import defpackage.dr0;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class SDKUtils {
    private static final String a = "SDKUtils";
    private static String b = null;
    private static String c = null;
    private static String d = null;
    private static String e = null;
    private static int f = 0;
    private static String g = null;
    private static Map<String, String> h = null;
    private static String i = "";
    private static final AtomicInteger j = new AtomicInteger(1);

    public static int convertDpToPx(int i2) {
        return (int) TypedValue.applyDimension(0, i2, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i2) {
        return (int) TypedValue.applyDimension(1, i2, Resources.getSystem().getDisplayMetrics());
    }

    public static byte[] encrypt(String str) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            try {
                messageDigest.reset();
                messageDigest.update(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                C4950r4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            } catch (NoSuchAlgorithmException e3) {
                e = e3;
                C4950r4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        } catch (UnsupportedEncodingException e4) {
            e = e4;
            messageDigest = null;
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            messageDigest = null;
        }
        if (messageDigest != null) {
            return messageDigest.digest();
        }
        return null;
    }

    public static boolean isExternalStorageAvailable() {
        try {
            String externalStorageState = Environment.getExternalStorageState();
            return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            return false;
        }
    }

    public static String translateDeviceOrientation(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? "none" : C4664b4.i.C;
        }
        return C4664b4.i.D;
    }

    public static String translateOrientation(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? "none" : C4664b4.i.C;
        }
        return C4664b4.i.D;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    private static int a() {
        AtomicInteger atomicInteger;
        int i2;
        int i3;
        do {
            atomicInteger = j;
            i2 = atomicInteger.get();
            i3 = i2 + 1;
            if (i3 > 16777215) {
                i3 = 1;
            }
        } while (!atomicInteger.compareAndSet(i2, i3));
        return i2;
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            C4950r4.d().a(e2);
            Logger.d(a, "Failed decoding string " + e2.getMessage());
            return "";
        }
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace(UserDetailsUtils.UserDetailsLiterals.PLUS, "%20");
        } catch (UnsupportedEncodingException e2) {
            C4950r4.d().a(e2);
            return "";
        }
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(strOptString) ? strOptString : jSONObject.optString("demandSourceName");
    }

    public static int getActivityUIFlags(boolean z) {
        return z ? 5894 : 1798;
    }

    public static String getAdvertiserId() {
        return b;
    }

    public static String getControllerConfig() {
        return g;
    }

    public static String getControllerUrl() {
        if (TextUtils.isEmpty(e)) {
            return !TextUtils.isEmpty(d) ? d : "";
        }
        return e;
    }

    public static int getDebugMode() {
        return f;
    }

    public static String getFileName(String str) {
        String[] strArrSplit = str.split(File.separator);
        try {
            return URLEncoder.encode(strArrSplit[strArrSplit.length - 1].split("\\?")[0], "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return h;
    }

    public static String getLimitAdTracking() {
        return c;
    }

    public static String getMD5(String str) {
        try {
            String string = new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes())).toString(16);
            while (string.length() < 32) {
                string = "0" + string;
            }
            return string;
        } catch (NoSuchAlgorithmException e2) {
            C4950r4.d().a(e2);
            dr0.m(e2);
            return null;
        }
    }

    public static C4990t8.e getProductType(String str) {
        C4990t8.e eVar = C4990t8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C4990t8.e eVar2 = C4990t8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        return null;
    }

    public static String getSDKVersion() {
        return "9.6.1";
    }

    public static String getTesterParameters() {
        return i;
    }

    public static boolean isIronSourceActivity(Activity activity) {
        return (activity instanceof ControllerActivity) || (activity instanceof OpenUrlActivity) || (activity instanceof InlineStoreActivity);
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap map = new HashMap();
        if (mapArr != null) {
            for (Map<String, String> map2 : mapArr) {
                if (map2 != null) {
                    map.putAll(map2);
                }
            }
        }
        return map;
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        if (str != null) {
            return str;
        }
        d.w(str2);
        return null;
    }

    public static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        d.w(str);
        return null;
    }

    public static void setControllerConfig(String str) {
        g = str;
        Pb.b0().z().a(getControllerConfigAsJSONObject());
    }

    public static void setControllerUrl(String str) {
        d = str;
    }

    public static void setCustomControllerUrl(String str) {
        e = str;
    }

    public static void setDebugMode(int i2) {
        f = i2;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        h = map;
    }

    public static void setTesterParameters(String str) {
        i = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new a()).show();
    }

    public static String translateRequestedOrientation(int i2) {
        if (i2 == 0) {
            return C4664b4.i.C;
        }
        if (i2 == 1) {
            return C4664b4.i.D;
        }
        if (i2 == 11) {
            return C4664b4.i.C;
        }
        if (i2 == 12) {
            return C4664b4.i.D;
        }
        switch (i2) {
            case 6:
            case 8:
                return C4664b4.i.C;
            case 7:
            case 9:
                return C4664b4.i.D;
            default:
                return "none";
        }
    }

    public static boolean copyFileFromBundleToStorage(Context context, D8 d8) {
        int iSaveFile;
        byte[] bArrA = C4790i4.a(context, d8.getName());
        if (bArrA == null || bArrA.length == 0) {
            return false;
        }
        try {
            iSaveFile = IronSourceStorageUtils.saveFile(bArrA, d8.getPath());
        } catch (Exception e2) {
            IronLog.INTERNAL.error("exception: " + e2.getMessage());
            iSaveFile = 0;
        }
        if (iSaveFile == 0) {
            IronLog.INTERNAL.verbose("failed to read bytes for " + d8.getName());
            return false;
        }
        return true;
    }

    public static int dpToPx(long j2) {
        return (int) ((j2 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return IronSourceNetworkBridge.jsonObjectInit(getControllerConfig());
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return IronSourceNetworkBridge.jsonObjectInit();
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt(C4664b4.d.b);
    }

    public static JSONObject getOrientation(Context context) {
        B7 b7A = Pb.k0().a();
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(C4664b4.i.n, translateOrientation(b7A.A(context)));
            return jSONObjectJsonObjectInit;
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return jSONObjectJsonObjectInit;
        }
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        B7 b7A = Pb.k0().a();
        String strI = b7A.I(context);
        String strC = b7A.c(context);
        if (!TextUtils.isEmpty(strI)) {
            b = strI;
        }
        if (!TextUtils.isEmpty(strC)) {
            c = strC;
        }
    }

    public static int pxToDp(long j2) {
        return (int) ((j2 / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static void updateControllerConfig(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(g);
            jSONObjectJsonObjectInit.put(str, jSONObject);
            g = jSONObjectJsonObjectInit.toString();
        } catch (JSONException e2) {
            C4950r4.d().a(e2);
            Logger.i(a, "Unable to update controllerConfigs: " + e2.toString());
        }
    }

    public static String flatMapToJsonAsString(Map<String, String> map) {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                try {
                    jSONObjectJsonObjectInit.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (JSONException e2) {
                    C4950r4.d().a(e2);
                    Logger.i(a, "flatMapToJsonAsStringfailed " + e2.toString());
                }
                it.remove();
            }
        }
        return jSONObjectJsonObjectInit.toString();
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            return getControllerConfigAsJSONObject().getJSONObject(C4664b4.a.b);
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return jSONObjectJsonObjectInit;
        }
    }

    public static JSONObject getNetworkFeatureConfiguration() {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            JSONObject jSONObjectOptJSONObject = getNetworkConfiguration().optJSONObject(C4664b4.a.v);
            if (jSONObjectOptJSONObject != null) {
                return jSONObjectOptJSONObject;
            }
            return jSONObjectJsonObjectInit;
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return IronSourceNetworkBridge.jsonObjectInit(str).getString(str2);
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            return null;
        }
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String string = jSONArray.getString(i2);
                jSONObjectJsonObjectInit.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObjectJsonObjectInit;
    }

    public static String fetchDemandSourceId(C4871me c4871me) {
        return fetchDemandSourceId(c4871me.a());
    }
}
