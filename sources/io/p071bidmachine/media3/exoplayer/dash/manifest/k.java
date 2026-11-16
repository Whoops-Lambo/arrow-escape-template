package io.p071bidmachine.media3.exoplayer.dash.manifest;

import defpackage.d31;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.exoplayer.dash.j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class k extends m implements j {
    public final n h;

    @Override // io.p071bidmachine.media3.exoplayer.dash.manifest.m
    public final String a() {
        return null;
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.manifest.m
    public final j b() {
        return this;
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.manifest.m
    public final j d() {
        return null;
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public final long c(long j, long j2) {
        return this.h.e(j, j2);
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public final long e(long j, long j2) {
        return this.h.c(j, j2);
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public final long f(long j, long j2) {
        n nVar = this.h;
        if (nVar.f != null) {
            return -9223372036854775807L;
        }
        long jB = nVar.b(j, j2) + nVar.c(j, j2);
        return (nVar.e(jB, j) + nVar.g(jB)) - nVar.i;
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public final long getTimeUs(long j) {
        return this.h.g(j);
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public final long k(long j, long j2) {
        return this.h.f(j, j2);
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public final long m(long j) {
        return this.h.d(j);
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public final long r() {
        return this.h.d;
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public final j s(long j) {
        return this.h.h(this, j);
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public final boolean w() {
        return this.h.i();
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public final long x(long j, long j2) {
        return this.h.b(j, j2);
    }

    public k(n nVar, d31 d31Var, n nVar2, ArrayList arrayList, List list, List list2) {
        super(nVar, d31Var, nVar2, arrayList, list, list2);
        this.h = nVar2;
    }
}
