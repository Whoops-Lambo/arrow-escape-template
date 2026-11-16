package com.vungle.ads.internal.executor;

import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends com.vungle.ads.internal.task.i {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ Runnable b;

    public e(Runnable runnable, Runnable runnable2) {
        this.a = runnable;
        this.b = runnable2;
    }

    @Override // com.vungle.ads.internal.task.i
    public final int a() {
        return ((com.vungle.ads.internal.task.i) this.a).a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = j.b;
        Runnable runnable = this.a;
        Runnable runnable2 = this.b;
        try {
            runnable.run();
        } catch (OutOfMemoryError unused) {
            runnable2.run();
        }
    }

    @Override // com.vungle.ads.internal.task.i, java.lang.Comparable
    public final int compareTo(Object obj) {
        obj.getClass();
        if (obj instanceof com.vungle.ads.internal.task.i) {
            return s71.h(((com.vungle.ads.internal.task.i) obj).a(), a());
        }
        return 0;
    }
}
