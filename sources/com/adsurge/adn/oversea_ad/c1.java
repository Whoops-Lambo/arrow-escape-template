package com.adsurge.adn.oversea_ad;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements Runnable {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ Object c;

    public c1(AtomicBoolean atomicBoolean, AtomicReference atomicReference, Object obj) {
        this.a = atomicBoolean;
        this.b = atomicReference;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.get()) {
            return;
        }
        try {
            throw new Exception("");
        } catch (Exception e) {
            String strA = CanisMinor.a(CanisMinor.D0);
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                if (strA.equals(stackTraceElement.getClassName() + "_" + stackTraceElement.getMethodName())) {
                    this.b.set(Boolean.TRUE);
                }
            }
            synchronized (this.c) {
                this.c.notify();
            }
        }
    }
}
