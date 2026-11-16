package com.vungle.ads.internal.task;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class q implements Runnable {
    public WeakReference a;

    @Override // java.lang.Runnable
    public final void run() {
        r rVar = (r) this.a.get();
        if (rVar != null) {
            rVar.a();
        }
    }

    public q(WeakReference weakReference) {
        weakReference.getClass();
        this.a = weakReference;
    }
}
