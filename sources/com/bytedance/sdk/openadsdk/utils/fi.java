package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.ironsource.R6;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.player.UnityPlayerActivity;
import com.unity3d.services.core.fid.Constants;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class fi {
    private static final AtomicReference<Boolean> kgy = new AtomicReference<>(null);
    private static final AtomicReference<String> ahm = new AtomicReference<>(null);

    private static boolean fi() {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sx.rz("BED", "isXiaomiFold return false " + th.getMessage());
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0089  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ca  */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0057. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean yo(Context context) {
        boolean z;
        boolean zCt;
        boolean zCt2;
        try {
            AtomicReference<Boolean> atomicReference = kgy;
            Boolean bool = atomicReference.get();
            if (bool != null) {
                return bool.booleanValue();
            }
            String lowerCase = Build.BRAND;
            if (!TextUtils.isEmpty(lowerCase)) {
                lowerCase = lowerCase.toLowerCase();
            }
            String lowerCase2 = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(lowerCase2)) {
                lowerCase2 = lowerCase2.toLowerCase();
            }
            if (TextUtils.isEmpty(lowerCase) && TextUtils.isEmpty(lowerCase2)) {
                Boolean bool2 = Boolean.FALSE;
                while (!atomicReference.compareAndSet(null, bool2) && atomicReference.get() == null) {
                }
                return false;
            }
            if (!TextUtils.isEmpty(lowerCase)) {
                switch (lowerCase.hashCode()) {
                    case -759499589:
                        if (!lowerCase.equals("xiaomi")) {
                            z = true;
                            zCt = false;
                        } else {
                            zCt2 = ct();
                            zCt = zCt2;
                            z = false;
                        }
                        break;
                    case 3418016:
                        if (!lowerCase.equals("oppo")) {
                            z = true;
                            zCt = false;
                        } else {
                            zCt2 = gf();
                            zCt = zCt2;
                            z = false;
                        }
                        break;
                    case 3620012:
                        if (!lowerCase.equals("vivo")) {
                            z = true;
                            zCt = false;
                        } else {
                            zCt2 = noq();
                            zCt = zCt2;
                            z = false;
                        }
                        break;
                    case 1864941562:
                        if (!lowerCase.equals("samsung")) {
                            z = true;
                            zCt = false;
                        } else {
                            zCt2 = uq();
                            zCt = zCt2;
                            z = false;
                        }
                        break;
                    default:
                        z = true;
                        zCt = false;
                        break;
                }
            } else {
                z = false;
                zCt = false;
            }
            if (z && !TextUtils.isEmpty(lowerCase2)) {
                switch (lowerCase2.hashCode()) {
                    case -759499589:
                        if (!lowerCase2.equals("xiaomi")) {
                            zCt = false;
                        } else {
                            zCt = ct();
                        }
                        break;
                    case 3418016:
                        if (!lowerCase2.equals("oppo")) {
                            zCt = false;
                        } else {
                            zCt = gf();
                        }
                        break;
                    case 3620012:
                        if (!lowerCase2.equals("vivo")) {
                            zCt = false;
                        } else {
                            zCt = noq();
                        }
                        break;
                    case 1864941562:
                        if (!lowerCase2.equals("samsung")) {
                            zCt = false;
                        } else {
                            zCt = uq();
                        }
                        break;
                    default:
                        zCt = false;
                        break;
                }
            }
            Boolean boolValueOf = Boolean.valueOf(zCt);
            while (!atomicReference.compareAndSet(null, boolValueOf)) {
                if (atomicReference.get() != null) {
                    return zCt;
                }
            }
            return zCt;
        } catch (Throwable unused) {
            AtomicReference<Boolean> atomicReference2 = kgy;
            Boolean bool3 = Boolean.FALSE;
            while (!atomicReference2.compareAndSet(null, bool3) && atomicReference2.get() == null) {
            }
            return false;
        }
    }

    public static void ahm(JSONObject jSONObject, Context context) {
        try {
            if (ahm()) {
                String strAhm = com.bytedance.sdk.openadsdk.core.rz.kgy().ahm("w_ver", ct(context));
                if (TextUtils.isEmpty(strAhm)) {
                    return;
                }
                jSONObject.put("w_ver", strAhm);
            }
        } catch (Throwable unused) {
        }
    }

    public static void kgy(JSONObject jSONObject, Context context) {
        if (context == null) {
            return;
        }
        try {
            if (ahm()) {
                com.bytedance.sdk.openadsdk.core.rz rzVarKgy = com.bytedance.sdk.openadsdk.core.rz.kgy();
                String strAhm = rzVarKgy.ahm(R6.u, com.bytedance.sdk.openadsdk.core.ra.ahm().yo());
                if (!TextUtils.isEmpty(strAhm)) {
                    jSONObject.put(R6.u, strAhm);
                }
                int iAhm = rzVarKgy.ahm("bp", ahm(context));
                if (iAhm != 4) {
                    jSONObject.put("bp", iAhm);
                }
                String strAhm2 = rzVarKgy.ahm("t_ver", rz(context));
                if (!TextUtils.isEmpty(strAhm2)) {
                    jSONObject.put("t_ver", strAhm2);
                }
                jSONObject.put("is_fold", rzVarKgy.ahm("is_fold", yo(context) ? 1 : 0));
                jSONObject.put(CampaignEx.JSON_KEY_AAB, rzVarKgy.ahm(CampaignEx.JSON_KEY_AAB, uq(context)));
                String strAhm3 = rzVarKgy.ahm("abi", kgy());
                if (TextUtils.isEmpty(strAhm3)) {
                    return;
                }
                jSONObject.put("abi", strAhm3);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean nu() {
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.SemFloatingFeature");
            Object objInvoke = cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
            Method declaredMethod = cls.getDeclaredMethod("getString", String.class);
            return "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FOLD")) || "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FLIP"));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            com.bytedance.sdk.component.utils.sx.rz("PAG_BANNER", "get ss fold device error: " + e.getMessage());
            return false;
        }
    }

    private static boolean ra() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object objInvoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null), "oplus.hardware.type.fold");
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            com.bytedance.sdk.component.utils.sx.rz("BED", "get oppo fold properties error, msg: " + e.getMessage());
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean ct() {
        if (fi()) {
            return true;
        }
        String[] strArr = {"M2011J18C", "22061218C", "2308CPXD0C", "24072PX77C", "2405CPX3DC", "2405CPX3DG"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i = 0; i < 6; i++) {
                    if (lowerCase.contains(strArr[i])) {
                        return true;
                    }
                }
                if (ahm()) {
                    String strRz = rz();
                    if (TextUtils.isEmpty(strRz)) {
                        return false;
                    }
                    for (String str : strRz.split(",")) {
                        if (lowerCase.contains(str)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean gf() {
        if (ra()) {
            return true;
        }
        String[] strArr = {"CPH2439", "CPH2437", "CPH2499", "CPH2519", "PEUM00", "PGU110", "PGT110", "PHN110", "PHT110"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i = 0; i < 9; i++) {
                    if (lowerCase.contains(strArr[i].toLowerCase())) {
                        return true;
                    }
                }
                if (ahm()) {
                    String strRz = rz();
                    if (TextUtils.isEmpty(strRz)) {
                        return false;
                    }
                    for (String str : strRz.split(",")) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean noq() {
        if (yo()) {
            return true;
        }
        String[] strArr = {"V2330", "V2178A", "V2229A", "V2303A", "V2337A", "V2256A", "V2266A"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i = 0; i < 7; i++) {
                    if (lowerCase.contains(strArr[i].toLowerCase())) {
                        return true;
                    }
                }
                if (ahm()) {
                    String strRz = rz();
                    if (TextUtils.isEmpty(strRz)) {
                        return false;
                    }
                    for (String str : strRz.split(",")) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String rz(Context context) {
        try {
            return String.valueOf(context.getApplicationInfo().targetSdkVersion);
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean uq() {
        if (nu()) {
            return true;
        }
        String[] strArr = {"sm-f9000", "sm-f9160", "sm-f9260", "sm-f9360", "sm-f9460", "sm-f9560", "sm-f7000", "sm-f7070", "sm-f7110", "sm-f7210", "sm-f7310", "sm-f7410"};
        String[] strArr2 = {"winner", "f2q", "q2q", "q4q", "q5q", "q6q", "bloomq", "bloomxq", "b2q", "b4q", "b5q", "b6q"};
        try {
            String lowerCase = Build.DEVICE.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i = 0; i < 12; i++) {
                    if (lowerCase.contains(strArr2[i])) {
                        return true;
                    }
                }
            }
            String lowerCase2 = Build.MODEL.toLowerCase();
            if (TextUtils.isEmpty(lowerCase2)) {
                return false;
            }
            for (int i2 = 0; i2 < 12; i2++) {
                if (lowerCase2.contains(strArr[i2])) {
                    return true;
                }
            }
            if (ahm()) {
                String strKgy = com.bytedance.sdk.openadsdk.lqi.ct.kgy("fold_config", "fold_samung", "");
                if (TextUtils.isEmpty(strKgy)) {
                    return false;
                }
                for (String str : strKgy.split(",")) {
                    if (lowerCase2.contains(str)) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String rz() {
        return com.bytedance.sdk.openadsdk.lqi.ct.kgy("fold_config", "fold_default", "");
    }

    public static int ahm(Context context) {
        if (fi(context)) {
            return 1;
        }
        if (gf(context)) {
            return 2;
        }
        return ra(context) ? 3 : 4;
    }

    public static boolean ahm() {
        return com.bytedance.sdk.openadsdk.lqi.ct.kgy("fold_config", a.k, 0) == 1;
    }

    private static boolean fi(Context context) {
        try {
            int i = UnityPlayerActivity.a;
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libunity.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static boolean ra(Context context) {
        try {
            Class.forName("com.facebook.react.ReactActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libreactnativejni.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    public static String ct(Context context) {
        String str;
        try {
            AtomicReference<String> atomicReference = ahm;
            String str2 = atomicReference.get();
            if (str2 != null) {
                return str2;
            }
            PackageInfo packageInfoNoq = noq(context);
            if (packageInfoNoq == null) {
                str = "";
            } else {
                str = packageInfoNoq.versionName;
            }
            while (!atomicReference.compareAndSet(null, str) && atomicReference.get() == null) {
            }
            return str;
        } catch (Throwable unused) {
            AtomicReference<String> atomicReference2 = ahm;
            while (!atomicReference2.compareAndSet(null, "") && atomicReference2.get() == null) {
            }
            return "";
        }
    }

    public static PackageInfo noq(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return WebView.getCurrentWebViewPackage();
            }
            PackageInfo packageInfo = (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
            return packageInfo != null ? packageInfo : nu(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static PackageInfo nu(Context context) {
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean gf(Context context) {
        try {
            Class.forName("io.flutter.embedding.android.FlutterActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libflutter.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    public static String kgy() {
        try {
            return Build.SUPPORTED_ABIS[0];
        } catch (Exception unused) {
            return "";
        }
    }

    public static void kgy(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (ahm()) {
                com.bytedance.sdk.openadsdk.core.rz rzVarKgy = com.bytedance.sdk.openadsdk.core.rz.kgy();
                rzVarKgy.kgy("w_ver", ct(context));
                rzVarKgy.kgy("bp", ahm(context));
                rzVarKgy.kgy("is_fold", yo(context) ? 1 : 0);
                rzVarKgy.kgy("abi", kgy());
                rzVarKgy.kgy("t_ver", rz(context));
                rzVarKgy.kgy(CampaignEx.JSON_KEY_AAB, uq(context));
            }
        } catch (Throwable unused) {
        }
    }

    public static int uq(Context context) {
        try {
            Class.forName("com.google.android.play.core.splitinstall.SplitInstallManager");
            return 1;
        } catch (ClassNotFoundException unused) {
            return 0;
        }
    }

    private static boolean yo() {
        try {
            return "foldable".equals(Class.forName("android.util.FtDeviceInfo").getMethod("getDeviceType", null).invoke(null, null));
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sx.rz("BED", "isVIVOFoldDevice return false " + th.getMessage());
            return false;
        }
    }
}
