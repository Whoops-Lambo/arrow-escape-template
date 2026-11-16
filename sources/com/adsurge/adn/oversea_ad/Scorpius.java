package com.adsurge.adn.oversea_ad;

import android.content.Context;
import defpackage.pv1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Scorpius {
    public static String a(Context context) {
        int i;
        Pattern[] patternArr;
        System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        try {
            String packageName = context.getPackageName();
            Pattern patternCompile = Pattern.compile("^/data/user/\\d+/" + packageName);
            String str = context.getApplicationInfo().nativeLibraryDir;
            Iterator it = Grapefruit.b().iterator();
            while (it.hasNext()) {
                String strA = a((String) it.next(), packageName, patternCompile, str);
                if (strA != null) {
                    hashSet.add(strA);
                }
            }
        } catch (Throwable unused) {
        }
        String[] strArr = Lemon.a;
        synchronized (Lemon.class) {
            try {
                i = 0;
                if (Lemon.b != null) {
                    patternArr = Lemon.b;
                } else {
                    String[] strArr2 = Lemon.a;
                    Lemon.b = new Pattern[strArr2.length];
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < Lemon.b.length; i2++) {
                        try {
                            arrayList.add(Pattern.compile(strArr2[i2]));
                        } catch (Throwable unused2) {
                        }
                    }
                    Lemon.b = (Pattern[]) arrayList.toArray(new Pattern[0]);
                    patternArr = Lemon.b;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            for (Pattern pattern : patternArr) {
                if (pattern.matcher(str2).find()) {
                    it2.remove();
                    break;
                }
            }
        }
        if (hashSet.size() > 0) {
            StringBuilder sb = new StringBuilder();
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                i++;
                sb.append((String) it3.next());
                if (i >= 8) {
                    break;
                }
                if (it3.hasNext()) {
                    sb.append("_");
                }
            }
            return sb.toString();
        }
        return "";
    }

    public static String a() {
        try {
            File file = new File("/system/lib");
            if (!file.canRead()) {
                return "";
            }
            for (File file2 : file.listFiles()) {
                if (file2.getName().contains("rockchip")) {
                    return file2.getAbsolutePath();
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(String str, String str2, Pattern pattern, String str3) {
        int iIndexOf;
        String canonicalPath;
        if (str == null) {
            return null;
        }
        boolean zEndsWith = str.endsWith(".so");
        boolean z = !zEndsWith && str.endsWith(".jar");
        if ((!zEndsWith && !z) || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        String strTrim = str.substring(iIndexOf).trim();
        if (!strTrim.startsWith("/data/")) {
            return null;
        }
        if (zEndsWith && str3 != null && strTrim.startsWith(str3)) {
            return null;
        }
        String strN = pv1.n("/data/data/", str2, "/");
        if (strTrim.startsWith(strN)) {
            return null;
        }
        if (strTrim.startsWith("/data/app/" + str2) || pattern.matcher(strTrim).find()) {
            return null;
        }
        if (zEndsWith) {
            File file = new File(strN.concat("lib"));
            HashMap map = Dorado.a;
            try {
                canonicalPath = file.getCanonicalPath();
            } catch (IOException unused) {
                canonicalPath = null;
            }
            if (canonicalPath == null || strTrim.startsWith(canonicalPath)) {
                return null;
            }
        }
        return strTrim;
    }
}
