package io.p071bidmachine.media3.extractor;

import io.p071bidmachine.media3.common.f0;
import io.p071bidmachine.media3.common.m;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.b;
import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class b0 implements m {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public o f;
    public e0 g;

    @Override // io.p071bidmachine.media3.extractor.m
    public final boolean b(n nVar) {
        int i = this.b;
        int i2 = this.a;
        a.i((i2 == -1 || i == -1) ? false : true);
        q qVar = new q(i);
        ((j) nVar).peekFully(qVar.a, 0, i, false);
        return qVar.z() == i2;
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final void release() {
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final int a(n nVar, io.p071bidmachine.media3.common.q qVar) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            y.b();
            return 0;
        }
        e0 e0Var = this.g;
        e0Var.getClass();
        int iA = e0Var.a(nVar, 1024, true);
        if (iA != -1) {
            this.d += iA;
            return 0;
        }
        this.e = 2;
        this.g.b(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final void c(o oVar) {
        this.f = oVar;
        e0 e0VarTrack = oVar.track(1024, 4);
        this.g = e0VarTrack;
        m mVar = new m();
        String str = this.c;
        mVar.l = f0.p(str);
        mVar.m = f0.p(str);
        b.d(mVar, e0VarTrack);
        this.f.endTracks();
        this.f.h(new c0());
        this.e = 1;
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final void seek(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    public b0(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }
}
