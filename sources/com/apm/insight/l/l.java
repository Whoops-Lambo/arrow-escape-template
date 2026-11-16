package com.apm.insight.l;

import android.os.Build;
import android.text.TextUtils;
import defpackage.h50;
import defpackage.jc1;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class l {
    private static final CharSequence a = "amigo";
    private static final CharSequence b = "funtouch";

    private static boolean b() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase(Locale.getDefault()).contains("oppo");
    }

    public static String a() {
        String string;
        String strO = "";
        if (d.b()) {
            if (!d.b()) {
                return "";
            }
            return "miui_" + a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
        }
        if (d.c()) {
            String str = Build.DISPLAY;
            if (str == null || !str.toLowerCase(Locale.getDefault()).contains("flyme")) {
                return "";
            }
            return str;
        }
        if (b()) {
            if (!b()) {
                return "";
            }
            return "coloros_" + a("ro.build.version.opporom") + "_" + Build.DISPLAY;
        }
        String strA = d.a();
        if (strA == null || !strA.toLowerCase(Locale.getDefault()).contains("emotionui")) {
            string = "";
        } else {
            StringBuilder sbQ = h50.q(strA, "_");
            sbQ.append(Build.DISPLAY);
            string = sbQ.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strA2 = a("ro.vivo.os.build.display.id");
        if (!TextUtils.isEmpty(strA2) && strA2.toLowerCase(Locale.getDefault()).contains(b)) {
            return a("ro.vivo.os.build.display.id") + "_" + a("ro.vivo.product.version");
        }
        String str2 = Build.DISPLAY;
        if (!TextUtils.isEmpty(str2) && str2.toLowerCase(Locale.getDefault()).contains(a)) {
            StringBuilder sbQ2 = h50.q(str2, "_");
            sbQ2.append(a("ro.gn.sv.version"));
            return sbQ2.toString();
        }
        String str3 = Build.MANUFACTURER + Build.BRAND;
        if (!TextUtils.isEmpty(str3)) {
            String lowerCase = str3.toLowerCase(Locale.getDefault());
            if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
                return jc1.o(a("ro.build.uiversion"), "_", new StringBuilder(), str2);
            }
        }
        if (!TextUtils.isEmpty(a("ro.letv.release.version"))) {
            strO = jc1.o(a("ro.letv.release.version"), "_", new StringBuilder("eui_"), str2);
        }
        if (!TextUtils.isEmpty(strO)) {
            return strO;
        }
        return str2;
    }

    private static String a(String str) {
        BufferedReader bufferedReader;
        String line = "";
        try {
            Process processExec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
            bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 1024);
            try {
                line = bufferedReader.readLine();
                processExec.destroy();
                com.apm.insight.a.a((Closeable) bufferedReader);
                return line;
            } catch (Throwable unused) {
                com.apm.insight.a.a((Closeable) bufferedReader);
                return line;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }
}
