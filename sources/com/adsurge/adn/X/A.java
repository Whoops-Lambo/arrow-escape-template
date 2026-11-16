package com.adsurge.adn.X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class A {
    public static volatile boolean a;
    public static volatile int b;

    public static boolean c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return false;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return Math.sqrt(Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d) + Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d)) >= 7.0d;
    }

    static {
        try {
            a();
        } catch (Throwable unused) {
        }
    }

    public static void a() {
        int i;
        int i2;
        int i3;
        Context contextA = com.adsurge.adn.J.a.d().a();
        boolean zA = a(contextA);
        int i4 = 2;
        boolean z = true;
        if (zA) {
            i = 1;
        } else {
            i = 2;
        }
        int i5 = i * 1000;
        boolean zB = b(contextA);
        if (zB) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        int i6 = (i2 * 100) + i5;
        if (c(contextA)) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        int i7 = (i3 * 10) + i6;
        boolean zC = c();
        if (zC) {
            i4 = 1;
        }
        int i8 = i7 + i4;
        if (!zA && !zB && !zC) {
            z = false;
        }
        a = z;
        b = i8;
    }

    public static boolean b(Context context) {
        if (context.getResources().getConfiguration().smallestScreenWidthDp >= 600) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        return a;
    }

    public static boolean c() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return "tablet".equals((String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.characteristics", "unknown"));
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }
}
