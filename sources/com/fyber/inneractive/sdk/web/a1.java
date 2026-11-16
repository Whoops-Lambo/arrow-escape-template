package com.fyber.inneractive.sdk.web;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a1 implements Runnable {
    public final /* synthetic */ b1 a;

    public a1(b1 b1Var) {
        this.a = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a.evictAll();
        } catch (Throwable unused) {
        }
    }
}
