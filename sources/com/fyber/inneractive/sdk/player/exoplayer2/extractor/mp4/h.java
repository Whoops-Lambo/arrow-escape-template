package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h implements e {
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n a;
    public final int b;
    public final int c;
    public int d;
    public int e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final boolean c() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int a() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int b() {
        int i = this.c;
        if (i == 8) {
            return this.a.j();
        }
        if (i == 16) {
            return this.a.o();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int iJ = this.a.j();
        this.e = iJ;
        return (iJ & 240) >> 4;
    }

    public h(b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = bVar.R0;
        this.a = nVar;
        nVar.e(12);
        this.c = nVar.m() & 255;
        this.b = nVar.m();
    }
}
