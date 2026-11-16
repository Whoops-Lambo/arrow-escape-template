package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {
    public static boolean a(String str, String str2) {
        int iIndexOf;
        if (str2 == null || (iIndexOf = str2.indexOf(47)) == -1) {
            return false;
        }
        String strTrim = str2.substring(iIndexOf).trim();
        if (!strTrim.startsWith("/data/")) {
            return false;
        }
        if (strTrim.startsWith("/data/data/" + str + "/")) {
            return false;
        }
        boolean zEndsWith = strTrim.endsWith(".so");
        return (zEndsWith || (!zEndsWith && strTrim.endsWith(".jar"))) && str2.contains(CanisMinor.a(CanisMinor.m));
    }

    public static int b(Context context) {
        boolean z;
        boolean z2;
        Context context2;
        PackageInfo packageInfo;
        System.currentTimeMillis();
        boolean z3 = true;
        if (context.getPackageManager() != null) {
            String strA = CanisMinor.a(CanisMinor.l);
            try {
                if (!TextUtils.isEmpty(strA)) {
                    synchronized (Cconst.class) {
                        context2 = Cconst.a;
                    }
                    if (context2 != null && (packageInfo = context2.getPackageManager().getPackageInfo(strA, 0)) != null && strA.equals(packageInfo.packageName)) {
                        z = true;
                    }
                }
            } catch (Throwable unused) {
            }
            z = false;
        } else {
            z = false;
        }
        int iA = Cimport.a(0, 0, z);
        System.currentTimeMillis();
        try {
            try {
                List listB = Grapefruit.b();
                if (!listB.isEmpty()) {
                    String packageName = context.getPackageName();
                    Iterator it = listB.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (a(packageName, (String) it.next())) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    int iA2 = Cimport.a(iA, 1, z2);
                    System.currentTimeMillis();
                    int iA3 = Cimport.a(iA2, 2, a(context));
                    System.currentTimeMillis();
                    ClassLoader.getSystemClassLoader().loadClass(CanisMinor.a(CanisMinor.C0));
                    return Cimport.a(iA3, 3, z3);
                }
            } catch (Throwable unused2) {
            }
            ClassLoader.getSystemClassLoader().loadClass(CanisMinor.a(CanisMinor.C0));
        } catch (Throwable unused3) {
            z3 = false;
        }
        z2 = false;
        int iA4 = Cimport.a(iA, 1, z2);
        System.currentTimeMillis();
        int iA5 = Cimport.a(iA4, 2, a(context));
        System.currentTimeMillis();
        return Cimport.a(iA5, 3, z3);
    }

    public static boolean a(Context context) {
        Object obj = new Object();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        atomicReference.set(Boolean.FALSE);
        Handler handler = new Handler(context.getMainLooper());
        System.currentTimeMillis();
        handler.post(new c1(atomicBoolean, atomicReference, obj));
        synchronized (obj) {
            try {
                obj.wait(100L);
            } catch (InterruptedException unused) {
            }
        }
        atomicBoolean.set(true);
        return ((Boolean) atomicReference.get()).booleanValue();
    }
}
