package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class l {
    public f a;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r b;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j c;
    public h d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public j j;
    public long k;
    public boolean l;
    public boolean m;

    public abstract long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar);

    public abstract boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j, j jVar);

    public void a(boolean z) {
        if (z) {
            this.j = new j();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    public void a(long j) {
        this.g = j;
    }
}
