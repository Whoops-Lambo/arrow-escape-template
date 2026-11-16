package com.fyber.inneractive.sdk.player.ui;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d implements Runnable {
    public final boolean a;
    public final /* synthetic */ e b;

    public d(e eVar, boolean z) {
        this.b = eVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a == this.b.hasWindowFocus()) {
            this.b.f();
        }
    }
}
