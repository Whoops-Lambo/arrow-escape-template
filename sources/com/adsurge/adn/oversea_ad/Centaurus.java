package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class Centaurus {
    public static long a = -1;
    public static Integer b;

    public static String a() {
        String[] strArrSplit;
        try {
            String str = Build.MANUFACTURER;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            if (lowerCase.contains("huawei")) {
                return Ginkgo.a("ro.build.version.emui");
            }
            if (lowerCase.contains("xiaomi")) {
                return Ginkgo.a("ro.miui.ui.version.name");
            }
            if (lowerCase.contains("gionee")) {
                String strA = Ginkgo.a("ro.gn.extvernumber");
                return TextUtils.isEmpty(strA) ? Ginkgo.a("ro.build.display.id") : strA;
            }
            if (!lowerCase.contains("vivo")) {
                if (lowerCase.contains("meizu")) {
                    return Ginkgo.a("ro.build.display.id");
                }
                if (lowerCase.contains("lenovo")) {
                    String strA2 = Ginkgo.a("ro.lenovo.lvp.version");
                    String str2 = (TextUtils.isEmpty(strA2) || (strArrSplit = strA2.split("_")) == null || strArrSplit.length <= 0) ? null : strArrSplit[0];
                    return TextUtils.isEmpty(str2) ? Ginkgo.a("ro.build.version.incremental") : str2;
                }
                if (lowerCase.contains("letv")) {
                    return Ginkgo.a("ro.letv.eui");
                }
                return null;
            }
            String strA3 = Ginkgo.a("ro.vivo.os.name");
            String strA4 = Ginkgo.a("ro.vivo.os.version");
            if (TextUtils.isEmpty(strA3) || TextUtils.isEmpty(strA4)) {
                return Ginkgo.a("ro.vivo.os.build.display.id");
            }
            return strA3 + "_" + strA4;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b() {
        String str = Build.MANUFACTURER;
        return str == null ? "UNKNOWN" : str;
    }

    public static String a(String str) {
        String str2;
        Context context;
        try {
            synchronized (Cconst.class) {
                context = Cconst.a;
            }
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            str2 = (String) clsLoadClass.getMethod("get", String.class, String.class).invoke(clsLoadClass, new String(str), new String(""));
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception unused) {
            str2 = "";
        }
        return str2 == null ? "" : str2;
    }
}
