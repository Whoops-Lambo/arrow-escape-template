package io.p071bidmachine.media3.exoplayer.hls.playlist;

import defpackage.d31;
import defpackage.fs1;
import defpackage.i31;
import io.p071bidmachine.media3.common.DrmInitData;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class k extends o {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final DrmInitData q;
    public final d31 r;
    public final d31 s;
    public final i31 t;
    public final long u;
    public final j v;
    public final d31 w;

    public k(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, DrmInitData drmInitData, List list2, List list3, j jVar, Map map, List list4) {
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = drmInitData;
        this.r = d31.A(list2);
        this.s = d31.A(list3);
        this.t = i31.f(map);
        this.w = d31.A(list4);
        if (!list3.isEmpty()) {
            f fVar = (f) fs1.w(list3);
            this.u = fVar.e + fVar.c;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            h hVar = (h) fs1.w(list2);
            this.u = hVar.e + hVar.c;
        }
        long jMin = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            long j6 = this.u;
            jMin = j >= 0 ? Math.min(j6, j) : Math.max(0L, j6 + j);
        }
        this.e = jMin;
        this.f = j >= 0;
        this.v = jVar;
    }

    @Override // io.p071bidmachine.media3.exoplayer.offline.a
    public final Object copy(List list) {
        return this;
    }
}
