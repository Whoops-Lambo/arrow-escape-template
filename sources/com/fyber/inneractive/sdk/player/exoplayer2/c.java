package com.fyber.inneractive.sdk.player.exoplayer2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.l a = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.l();
    public final long b = 15000000;
    public final long c = 30000000;
    public final long d = 2500000;
    public final long e = 5000000;
    public int f;
    public boolean g;

    public final void a(boolean z) {
        this.f = 0;
        this.g = false;
        if (z) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = this.a;
            synchronized (lVar) {
                lVar.a(0);
            }
        }
    }
}
