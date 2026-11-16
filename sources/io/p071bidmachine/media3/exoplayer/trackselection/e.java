package io.p071bidmachine.media3.exoplayer.trackselection;

import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.common.s0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e extends m implements Comparable {
    public final int e;
    public final int f;

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.m
    public final int a() {
        return this.e;
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.m
    public final /* bridge */ /* synthetic */ boolean b(m mVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((e) obj).f);
    }

    public e(int i, s0 s0Var, int i2, h hVar, int i3) {
        int i4;
        super(i, s0Var, i2);
        this.e = io.p071bidmachine.media3.exoplayer.e.i(i3, hVar.z) ? 1 : 0;
        n nVar = this.d;
        int i5 = nVar.u;
        int i6 = -1;
        if (i5 != -1 && (i4 = nVar.v) != -1) {
            i6 = i5 * i4;
        }
        this.f = i6;
    }
}
