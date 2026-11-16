package com.adsurge.adn.oversea_ad;

import android.os.Handler;
import android.os.Message;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.else, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Celse implements Handler.Callback {
    public final Handler.Callback a;
    public final Ccontinue b;
    public final String c;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (com.adsurge.adn.oversea_ad.Eridanus.c.get() != false) goto L16;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r6) {
        /*
            r5 = this;
            r0 = 0
            int r1 = r6.what     // Catch: java.lang.Throwable -> L3d
            r2 = 1
            if (r1 != r2) goto L2b
            com.adsurge.adn.oversea_ad.continue r1 = r5.b     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = r5.c     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.atomic.AtomicBoolean r4 = r1.a     // Catch: java.lang.Throwable -> L3d
            boolean r4 = r4.get()     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L13
            goto L1c
        L13:
            com.adsurge.adn.oversea_ad.package r1 = r1.b     // Catch: java.lang.Throwable -> L3d
            android.os.Message r1 = r1.obtainMessage(r2, r3)     // Catch: java.lang.Throwable -> L3d
            r1.sendToTarget()     // Catch: java.lang.Throwable -> L3d
        L1c:
            java.util.concurrent.atomic.AtomicBoolean r1 = com.adsurge.adn.oversea_ad.Eridanus.b     // Catch: java.lang.Throwable -> L3d
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L34
            boolean r1 = a(r6)     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L34
            goto L33
        L2b:
            java.util.concurrent.atomic.AtomicBoolean r1 = com.adsurge.adn.oversea_ad.Eridanus.c     // Catch: java.lang.Throwable -> L3d
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L34
        L33:
            return r2
        L34:
            android.os.Handler$Callback r5 = r5.a     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto L3d
            boolean r5 = r5.handleMessage(r6)     // Catch: java.lang.Throwable -> L3d
            return r5
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adsurge.adn.oversea_ad.Celse.handleMessage(android.os.Message):boolean");
    }

    public static boolean a(Message message) {
        Object objA;
        Object obj = message.obj;
        if (obj == null) {
            return false;
        }
        Object objA2 = Hickory.a(obj.getClass(), "argi3", message.obj);
        if (!(objA2 instanceof Integer) || (objA = Hickory.a(message.obj.getClass(), "arg1", message.obj)) == null) {
            return false;
        }
        Class<?> cls = objA.getClass();
        Class[] clsArr = {Boolean.TYPE, Integer.TYPE};
        Object[] objArr = {Boolean.FALSE, objA2};
        try {
            Method methodA = Hickory.a((Class) cls, "setPerformAccessibilityActionResult", clsArr);
            if (methodA == null) {
                return true;
            }
            methodA.invoke(objA, objArr);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public Celse(Handler.Callback callback, Ccontinue ccontinue, String str) {
        this.a = callback;
        this.b = ccontinue;
        this.c = str;
    }
}
