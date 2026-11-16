package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class M1 {
    public static JSONObject a(Context context, JSONArray jSONArray) {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            int i = 0;
            if (jSONArray.length() == 0) {
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    jSONObjectJsonObjectInit.put(strArr[i], (packageInfo.requestedPermissionsFlags[i] & 2) != 0 ? "Granted" : "Rejected");
                    i++;
                }
            } else {
                List listAsList = Arrays.asList(packageInfo.requestedPermissions);
                while (i < jSONArray.length()) {
                    String string = jSONArray.getString(i);
                    int iIndexOf = listAsList.indexOf(string);
                    if (iIndexOf != -1) {
                        jSONObjectJsonObjectInit.put(string, (packageInfo.requestedPermissionsFlags[iIndexOf] & 2) != 0 ? "Granted" : "Rejected");
                    } else {
                        jSONObjectJsonObjectInit.put(string, "notFoundInManifest");
                    }
                    i++;
                }
            }
            return jSONObjectJsonObjectInit;
        } catch (Exception e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObjectJsonObjectInit;
        }
    }

    public static String b(Context context) {
        try {
            return a(context).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    public static String c(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getPath();
        }
        return null;
    }

    public static boolean d(Context context, String str) {
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        if (!TextUtils.isEmpty(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    boolean zEquals = false;
                    while (true) {
                        try {
                            String[] strArr = packageInfo.requestedPermissions;
                            if (i >= strArr.length || zEquals) {
                                break;
                            }
                            zEquals = str.equals(strArr[i]);
                            i++;
                        } catch (Exception e) {
                            e = e;
                            z = zEquals;
                            C4950r4.d().a(e);
                            IronLog.INTERNAL.error(e.toString());
                            return z;
                        }
                    }
                    return zEquals;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return z;
    }

    public static String e(Context context) {
        String installerPackageName;
        try {
            installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            C4950r4.d().a(th);
            installerPackageName = null;
        }
        if (TextUtils.isEmpty(installerPackageName)) {
            return "";
        }
        return installerPackageName;
    }

    public static long f(Context context) {
        try {
            return a(context).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1L;
        }
    }

    public static String g(Context context) {
        return context.getPackageName();
    }

    public static boolean c(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static String b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e) {
            C4950r4.d().a(e);
            return "";
        }
    }

    public static long d(Context context) {
        try {
            return a(context).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1L;
        }
    }

    public static int a(Activity activity) {
        return activity.getRequestedOrientation();
    }

    public static boolean a() {
        return true;
    }

    public static PackageInfo a(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(g(context), 0);
    }

    public static String a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || TextUtils.isEmpty(str)) {
                return null;
            }
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
        } catch (Exception e) {
            C4950r4.d().a(e);
            return null;
        }
    }
}
