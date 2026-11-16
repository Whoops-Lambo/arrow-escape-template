package com.adsurge.adn.Q0;

import android.os.HandlerThread;
import android.os.Looper;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a {
    public static int c = 4;
    public ArrayList a = new ArrayList();
    public AtomicInteger b = new AtomicInteger(0);

    /* JADX INFO: renamed from: com.adsurge.adn.Q0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0089a {
        public static final a a = new a();
    }

    public static a b() {
        return C0089a.a;
    }

    public Looper a(int i) {
        int i2 = i % c;
        if (i2 < this.a.size()) {
            if (this.a.get(i2) == null) {
                return Looper.getMainLooper();
            }
            Looper looper = ((HandlerThread) this.a.get(i2)).getLooper();
            return looper != null ? looper : Looper.getMainLooper();
        }
        HandlerThread handlerThread = new HandlerThread(pv1.k(i2, "FrameDecoderExecutor-"));
        handlerThread.start();
        this.a.add(handlerThread);
        Looper looper2 = handlerThread.getLooper();
        return looper2 != null ? looper2 : Looper.getMainLooper();
    }

    public int a() {
        return this.b.getAndIncrement();
    }
}
