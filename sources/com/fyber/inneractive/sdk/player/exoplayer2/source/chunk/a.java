package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.h;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.z;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements z {
    public final k a;
    public final int b;
    public final o c;
    public final int d;
    public final Object e;
    public final long f;
    public final long g;
    public final h h;

    public abstract long c();

    public a(int i, int i2, long j, long j2, o oVar, h hVar, k kVar, Object obj) {
        hVar.getClass();
        this.h = hVar;
        this.a = kVar;
        this.b = i;
        this.c = oVar;
        this.d = i2;
        this.e = obj;
        this.f = j;
        this.g = j2;
    }
}
