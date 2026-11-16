package com.adsurge.adn.oversea_ad;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class f {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ Object c;

    public f(AtomicBoolean atomicBoolean, AtomicReference atomicReference, Object obj) {
        this.a = atomicBoolean;
        this.b = atomicReference;
        this.c = obj;
    }

    public final void a(r0 r0Var) {
        if (this.a.get()) {
            return;
        }
        this.b.set(r0Var);
        synchronized (this.c) {
            this.c.notify();
        }
    }
}
