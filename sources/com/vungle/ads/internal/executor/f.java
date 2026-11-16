package com.vungle.ads.internal.executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements h {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ Runnable b;

    public f(Runnable runnable, Runnable runnable2) {
        this.a = runnable;
        this.b = runnable2;
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

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        obj.getClass();
        Runnable runnable = this.a;
        if (runnable instanceof com.vungle.ads.internal.task.i) {
            return ((com.vungle.ads.internal.task.i) runnable).compareTo(obj);
        }
        return 0;
    }
}
