package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n g;
    public int h;
    public int i;

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f;
        this.d = z ? nVar.n() : nVar.k();
        if (this.b == this.h) {
            this.c = this.g.m();
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.g;
            nVar2.e(nVar2.b + 4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? this.g.m() - 1 : -1;
        }
        return true;
    }

    public d(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2, boolean z) {
        this.g = nVar;
        this.f = nVar2;
        this.e = z;
        nVar2.e(12);
        this.a = nVar2.m();
        nVar.e(12);
        this.i = nVar.m();
        if (nVar.b() == 1) {
            this.b = -1;
        } else {
            e32.i("first_chunk must be 1");
            throw null;
        }
    }
}
