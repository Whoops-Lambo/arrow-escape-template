package com.adsurge.adn.L;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import dalvik.system.BaseDexClassLoader;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public static boolean b(String str, String str2) {
        String strSubstring;
        int iIndexOf;
        return str != null && str2 != null && str.startsWith("lib/") && (iIndexOf = (strSubstring = str.substring(4)).indexOf(47)) > 0 && strSubstring.substring(iIndexOf + 1).equals(str2);
    }

    public static boolean a(String str, String str2) {
        try {
            ZipFile zipFile = new ZipFile(str);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    if (b(enumerationEntries.nextElement().getName(), str2)) {
                        zipFile.close();
                        return true;
                    }
                }
                zipFile.close();
                return false;
            } catch (Throwable th) {
                try {
                    zipFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a(String str) {
        return pv1.n("lib", str, ".so");
    }

    public static List a(ApplicationInfo applicationInfo) {
        ArrayList arrayList = new ArrayList();
        if (applicationInfo != null) {
            String str = applicationInfo.sourceDir;
            if (str != null) {
                arrayList.add(str);
            }
            String[] strArr = applicationInfo.splitSourceDirs;
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean a(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (a((String) it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(ClassLoader classLoader, ApplicationInfo applicationInfo, String str) {
        if (classLoader instanceof BaseDexClassLoader) {
            return !TextUtils.isEmpty(((BaseDexClassLoader) classLoader).findLibrary(str));
        }
        return a(a(applicationInfo), a(str));
    }
}
