package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class g implements e {
    public final int a;
    public final int b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int a() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int b() {
        int i = this.a;
        return i == 0 ? this.c.m() : i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final boolean c() {
        return this.a != 0;
    }

    public g(b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = bVar.R0;
        this.c = nVar;
        nVar.e(12);
        this.a = nVar.m();
        this.b = nVar.m();
    }
}
