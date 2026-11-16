package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import defpackage.h50;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class wy {
    public static boolean ahm = false;
    private static String ct = null;
    public static boolean kgy = false;
    private static int noq = Integer.MAX_VALUE;
    private static final CharSequence rz = "amigo";
    private static final CharSequence uq = "funtouch";
    private static final ConcurrentHashMap<String, String> yo = new ConcurrentHashMap<>();

    public static boolean gm() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("huawei")) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2) || !str2.toLowerCase().startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy implements Callable<String> {
        private final String kgy;

        public kgy(String str) {
            this.kgy = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            String str = (String) wy.yo.get(this.kgy);
            if (str != null) {
                return str;
            }
            System.currentTimeMillis();
            String strRz = wy.rz(this.kgy);
            System.currentTimeMillis();
            if (strRz != null) {
                wy.yo.put(this.kgy, strRz);
            }
            return strRz;
        }
    }

    public static boolean at() {
        return !TextUtils.isEmpty(uq("ro.letv.release.version"));
    }

    public static boolean ct() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static boolean dg() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static boolean fi() {
        String strUq = uq("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(strUq) && strUq.toLowerCase().contains(uq);
    }

    public static boolean fpp() {
        if (noq == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String strGf = ftg.gf("kllk");
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(strGf)) {
                noq = 0;
            } else {
                noq = 1;
            }
        }
        return noq == 1;
    }

    public static boolean gf() {
        String str = Build.DISPLAY;
        return !TextUtils.isEmpty(str) && str.toLowerCase().contains(rz);
    }

    public static String kgy() {
        if (!TextUtils.isEmpty(ct)) {
            return ct;
        }
        String strKgy = com.bytedance.sdk.openadsdk.core.ra.kgy("sdk_local_rom_info", 604800000L);
        ct = strKgy;
        if (TextUtils.isEmpty(strKgy)) {
            String strIoy = ioy();
            ct = strIoy;
            com.bytedance.sdk.openadsdk.core.ra.kgy("sdk_local_rom_info", strIoy);
        }
        return ct;
    }

    public static boolean noq() {
        if (!ahm) {
            try {
                Class.forName("miui.os.Build");
                kgy = true;
                ahm = true;
                return true;
            } catch (Exception unused) {
                ahm = true;
            }
        }
        return kgy;
    }

    public static String ra() {
        return Build.DISPLAY + "_" + uq("ro.gn.sv.version");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String rz(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        String line = "";
        Process process = null;
        try {
            try {
                Process processExec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 1024);
                    try {
                        line = bufferedReader.readLine();
                        processExec.exitValue();
                    } catch (IllegalThreadStateException unused) {
                        process = processExec;
                        try {
                            process.destroy();
                        } catch (Throwable unused2) {
                        }
                        if (bufferedReader != null) {
                        }
                        return line;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            com.bytedance.sdk.component.utils.sx.kgy("ToolUtils", "Unable to read sysprop ".concat(String.valueOf(str)), th);
                            return line;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e) {
                                    com.bytedance.sdk.component.utils.sx.kgy("ToolUtils", "Exception while closing InputStream", e);
                                }
                            }
                        }
                    }
                } catch (IllegalThreadStateException unused3) {
                    bufferedReader = null;
                }
            } catch (IllegalThreadStateException unused4) {
                bufferedReader = null;
            }
            try {
                bufferedReader.close();
            } catch (IOException e2) {
                com.bytedance.sdk.component.utils.sx.kgy("ToolUtils", "Exception while closing InputStream", e2);
            }
            return line;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    public static String um() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String uq(String str) {
        String str2;
        String str3 = yo.get(str);
        if (str3 != null) {
            return str3;
        }
        try {
            if (TextUtils.isEmpty("")) {
                final com.bytedance.sdk.component.gf.ahm.ahm ahmVar = new com.bytedance.sdk.component.gf.ahm.ahm(new kgy(str), 5, 2);
                mw.rz((Runnable) new com.bytedance.sdk.component.gf.ahm.rz("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.wy.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ahmVar.run();
                    }
                });
                str2 = (String) ahmVar.get(1L, TimeUnit.SECONDS);
            } else {
                str2 = "";
            }
        } catch (Throwable unused) {
        }
        return str2 == null ? "" : str2;
    }

    public static String vs() {
        return uq("ro.build.version.emui");
    }

    public static String yo() {
        return uq("ro.vivo.os.build.display.id") + "_" + uq("ro.vivo.product.version");
    }

    public static boolean ahm() {
        try {
            String strKgy = kgy();
            if (!TextUtils.isEmpty(strKgy) && strKgy.startsWith("miui")) {
                String str = Build.VERSION.INCREMENTAL;
                if (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("v12")) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String ioy() {
        if (dg()) {
            return xh();
        }
        if (noq()) {
            return twf();
        }
        if (rz()) {
            return um();
        }
        if (fpp()) {
            return sx();
        }
        String strKus = kus();
        if (!TextUtils.isEmpty(strKus)) {
            return strKus;
        }
        if (fi()) {
            return yo();
        }
        if (gf()) {
            return ra();
        }
        if (ct()) {
            return uq();
        }
        String strNu = nu();
        if (!TextUtils.isEmpty(strNu)) {
            return strNu;
        }
        return Build.DISPLAY;
    }

    public static String kus() {
        String strVs = vs();
        if (strVs != null && strVs.toLowerCase().contains("emotionui")) {
            StringBuilder sbQ = h50.q(strVs, "_");
            sbQ.append(Build.DISPLAY);
            return sbQ.toString();
        }
        return "";
    }

    public static String nu() {
        if (at()) {
            return "eui_" + uq("ro.letv.release.version") + "_" + Build.DISPLAY;
        }
        return "";
    }

    public static String sx() {
        if (fpp()) {
            return "coloros_" + uq(ftg.gf("ro.build.version.kllkrom")) + "_" + Build.DISPLAY;
        }
        return "";
    }

    public static String twf() {
        if (noq()) {
            return "miui_" + uq("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
        }
        return "";
    }

    public static String xh() {
        if (dg()) {
            try {
                return "smartisan_".concat(String.valueOf(uq("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static boolean kgy(String str) {
        if (TextUtils.isEmpty(str)) {
            str = vs();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || gm();
    }

    public static String uq() {
        return uq("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static boolean rz() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }
}
