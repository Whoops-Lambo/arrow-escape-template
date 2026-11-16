package com.adsurge.adn.oversea_ad;

import android.os.Build;
import android.view.MotionEvent;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class Cherry {
    public static final Object j = new Object();
    public static int k;
    public static Cherry l;
    public Cherry a;
    public String b;
    public int c;
    public int d;
    public int e;
    public float f;
    public float g;
    public long h;
    public int i = 0;

    public static Cherry a(String str, MotionEvent motionEvent) {
        Cherry cherry;
        Object objInvoke;
        synchronized (j) {
            try {
                cherry = l;
                objInvoke = null;
                if (cherry == null) {
                    cherry = new Cherry();
                } else {
                    l = cherry.a;
                    k--;
                    cherry.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        cherry.b = str;
        cherry.c = motionEvent.getAction();
        cherry.d = motionEvent.getDeviceId();
        cherry.e = motionEvent.getToolType(0);
        cherry.f = motionEvent.getPressure();
        cherry.g = motionEvent.getSize();
        cherry.h = System.currentTimeMillis();
        cherry.i = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                Method methodA = Hickory.a((Class) motionEvent.getClass(), "getId", (Class[]) null);
                if (methodA != null) {
                    objInvoke = methodA.invoke(motionEvent, null);
                }
            } catch (Throwable unused) {
            }
            if (objInvoke instanceof Integer) {
                cherry.i = ((Integer) objInvoke).intValue();
            }
        }
        return cherry;
    }
}
