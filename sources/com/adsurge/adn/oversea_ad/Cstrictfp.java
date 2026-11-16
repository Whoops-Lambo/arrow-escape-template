package com.adsurge.adn.oversea_ad;

import android.app.Application;
import android.os.HandlerThread;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.strictfp, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class Cstrictfp {
    public static final WeakHashMap a = new WeakHashMap();
    public static final AtomicReference b = new AtomicReference(null);

    public static synchronized void a(Mandarin mandarin) {
        if (mandarin != null) {
            Application applicationB = Cconst.b();
            if (applicationB != null) {
                AtomicReference atomicReference = b;
                synchronized (atomicReference) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                    HandlerThread handlerThread = new HandlerThread("TuringDispatch");
                    handlerThread.start();
                    Ccontinue ccontinue = new Ccontinue(new Cpackage(handlerThread.getLooper(), mandarin));
                    atomicReference.set(ccontinue);
                    applicationB.registerActivityLifecycleCallbacks(ccontinue);
                }
            }
        }
    }
}
