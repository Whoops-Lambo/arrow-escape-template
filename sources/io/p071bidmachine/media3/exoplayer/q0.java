package io.p071bidmachine.media3.exoplayer;

import android.util.Pair;
import defpackage.bs1;
import defpackage.dj1;
import io.p071bidmachine.media3.exoplayer.drm.f;
import io.p071bidmachine.media3.exoplayer.source.d0;
import io.p071bidmachine.media3.exoplayer.source.h0;
import io.p071bidmachine.media3.exoplayer.source.u;
import io.p071bidmachine.media3.exoplayer.source.z;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 implements h0, f {
    public final s0 a;
    public final /* synthetic */ t0 b;

    public final Pair b(int i, d0 d0Var) {
        d0 d0VarA;
        s0 s0Var = this.a;
        d0 d0Var2 = null;
        if (d0Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= s0Var.c.size()) {
                    d0VarA = null;
                    break;
                }
                if (((d0) s0Var.c.get(i2)).d == d0Var.d) {
                    Object obj = d0Var.a;
                    Object obj2 = s0Var.b;
                    int i3 = z0.k;
                    d0VarA = d0Var.a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (d0VarA == null) {
                return null;
            }
            d0Var2 = d0VarA;
        }
        return Pair.create(Integer.valueOf(i + s0Var.d), d0Var2);
    }

    public q0(t0 t0Var, s0 s0Var) {
        this.b = t0Var;
        this.a = s0Var;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.h0
    public final void a(int i, d0 d0Var, u uVar, z zVar) {
        Pair pairB = b(i, d0Var);
        if (pairB != null) {
            ((io.p071bidmachine.media3.common.util.u) this.b.j).c(new p0(this, pairB, uVar, zVar, 0));
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.h0
    public final void g(int i, d0 d0Var, u uVar, z zVar) {
        Pair pairB = b(i, d0Var);
        if (pairB != null) {
            ((io.p071bidmachine.media3.common.util.u) this.b.j).c(new p0(this, pairB, uVar, zVar, 1));
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.h0
    public final void h(int i, d0 d0Var, u uVar, z zVar, IOException iOException, boolean z) {
        Pair pairB = b(i, d0Var);
        if (pairB != null) {
            ((io.p071bidmachine.media3.common.util.u) this.b.j).c(new dj1(2, this, pairB, uVar, zVar, iOException, z));
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.h0
    public final void m(int i, d0 d0Var, z zVar) {
        Pair pairB = b(i, d0Var);
        if (pairB != null) {
            ((io.p071bidmachine.media3.common.util.u) this.b.j).c(new o0(this, pairB, zVar, 1));
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.h0
    public final void q(int i, d0 d0Var, u uVar, z zVar, int i2) {
        Pair pairB = b(i, d0Var);
        if (pairB != null) {
            ((io.p071bidmachine.media3.common.util.u) this.b.j).c(new bs1(this, pairB, uVar, zVar, i2, 3));
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.h0
    public final void r(int i, d0 d0Var, z zVar) {
        Pair pairB = b(i, d0Var);
        if (pairB != null) {
            ((io.p071bidmachine.media3.common.util.u) this.b.j).c(new o0(this, pairB, zVar, 0));
        }
    }
}
