package io.p071bidmachine.media3.exoplayer;

import io.p071bidmachine.media3.common.b;
import io.p071bidmachine.media3.common.p0;
import io.p071bidmachine.media3.common.q0;
import io.p071bidmachine.media3.common.r0;
import io.p071bidmachine.media3.common.v;
import io.p071bidmachine.media3.common.y;
import io.p071bidmachine.media3.exoplayer.source.s;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class y0 extends s {
    public final /* synthetic */ int c = 0;
    public final Object d;

    public y0(r0 r0Var) {
        super(r0Var);
        this.d = new q0();
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.s, io.p071bidmachine.media3.common.r0
    public p0 f(int i, p0 p0Var, boolean z) {
        switch (this.c) {
            case 0:
                r0 r0Var = this.b;
                p0 p0VarF = r0Var.f(i, p0Var, z);
                if (r0Var.m(p0VarF.c, (q0) this.d, 0L).a()) {
                    p0VarF.h(p0Var.a, p0Var.b, p0Var.c, p0Var.d, p0Var.e, b.c, true);
                } else {
                    p0VarF.f = true;
                }
                return p0VarF;
            default:
                return super.f(i, p0Var, z);
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.s, io.p071bidmachine.media3.common.r0
    public q0 m(int i, q0 q0Var, long j) {
        switch (this.c) {
            case 1:
                super.m(i, q0Var, j);
                y yVar = (y) this.d;
                q0Var.b = yVar;
                v vVar = yVar.b;
                return q0Var;
            default:
                return super.m(i, q0Var, j);
        }
    }

    public y0(r0 r0Var, y yVar) {
        super(r0Var);
        this.d = yVar;
    }
}
