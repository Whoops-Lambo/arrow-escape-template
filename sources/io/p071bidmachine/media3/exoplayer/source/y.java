package io.p071bidmachine.media3.exoplayer.source;

import android.util.Pair;
import io.p071bidmachine.media3.common.p0;
import io.p071bidmachine.media3.common.q0;
import io.p071bidmachine.media3.common.r0;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.exoplayer.upstream.c;
import io.p071bidmachine.media3.exoplayer.y0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class y extends k1 {
    public final boolean l;
    public final q0 m;
    public final p0 n;
    public w o;
    public v p;
    public boolean q;
    public boolean r;
    public boolean s;

    @Override // io.p071bidmachine.media3.exoplayer.source.l, io.p071bidmachine.media3.exoplayer.source.a
    public final void j() {
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.a
    public final void n(b0 b0Var) {
        v vVar = (v) b0Var;
        if (vVar.e != null) {
            a aVar = vVar.d;
            aVar.getClass();
            aVar.n(vVar.e);
        }
        if (b0Var == this.p) {
            this.p = null;
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.l, io.p071bidmachine.media3.exoplayer.source.a
    public final void p() {
        this.r = false;
        this.q = false;
        super.p();
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.k1
    public final void B() {
        if (this.l) {
            return;
        }
        this.q = true;
        A();
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final v b(d0 d0Var, c cVar, long j) {
        v vVar = new v(d0Var, cVar, j);
        a.i(vVar.d == null);
        vVar.d = this.k;
        if (!this.r) {
            this.p = vVar;
            if (!this.q) {
                this.q = true;
                A();
            }
            return vVar;
        }
        Object obj = d0Var.a;
        if (this.o.d != null && obj.equals(w.e)) {
            obj = this.o.d;
        }
        vVar.c(d0Var.a(obj));
        return vVar;
    }

    public final boolean D(long j) {
        v vVar = this.p;
        int iB = this.o.b(vVar.a.a);
        if (iB == -1) {
            return false;
        }
        w wVar = this.o;
        p0 p0Var = this.n;
        wVar.f(iB, p0Var, false);
        long j2 = p0Var.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        vVar.g = j;
        return true;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.k1, io.p071bidmachine.media3.exoplayer.source.a
    public final void s(io.p071bidmachine.media3.common.y yVar) {
        if (this.s) {
            w wVar = this.o;
            this.o = new w(new y0(this.o.b, yVar), wVar.c, wVar.d);
        } else {
            this.o = new w(new x(yVar), q0.p, w.e);
        }
        this.k.s(yVar);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.k1
    public final d0 y(d0 d0Var) {
        Object obj = d0Var.a;
        Object obj2 = this.o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = w.e;
        }
        return d0Var.a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // io.p071bidmachine.media3.exoplayer.source.k1
    public final void z(r0 r0Var) {
        long j;
        w wVar;
        d0 d0VarA;
        w wVar2;
        if (this.r) {
            w wVar3 = this.o;
            this.o = new w(r0Var, wVar3.c, wVar3.d);
            v vVar = this.p;
            if (vVar != null) {
                D(vVar.g);
            }
        } else {
            if (!r0Var.p()) {
                q0 q0Var = this.m;
                r0Var.n(0, q0Var);
                long j2 = q0Var.k;
                Object obj = q0Var.a;
                v vVar2 = this.p;
                if (vVar2 != null) {
                    long j3 = vVar2.b;
                    w wVar4 = this.o;
                    Object obj2 = vVar2.a.a;
                    p0 p0Var = this.n;
                    wVar4.g(obj2, p0Var);
                    long j4 = p0Var.e + j3;
                    this.o.m(0, q0Var, 0L);
                    if (j4 != q0Var.k) {
                        j = j4;
                    } else {
                        j = j2;
                    }
                } else {
                    j = j2;
                }
                Pair pairI = r0Var.i(this.m, this.n, 0, j);
                Object obj3 = pairI.first;
                long jLongValue = ((Long) pairI.second).longValue();
                if (this.s) {
                    w wVar5 = this.o;
                    wVar = new w(r0Var, wVar5.c, wVar5.d);
                } else {
                    wVar = new w(r0Var, obj, obj3);
                }
                this.o = wVar;
                v vVar3 = this.p;
                if (vVar3 != null && D(jLongValue)) {
                    d0 d0Var = vVar3.a;
                    Object obj4 = d0Var.a;
                    if (this.o.d != null && obj4.equals(w.e)) {
                        obj4 = this.o.d;
                    }
                    d0VarA = d0Var.a(obj4);
                }
                this.s = true;
                this.r = true;
                m(this.o);
                if (d0VarA != null) {
                    v vVar4 = this.p;
                    vVar4.getClass();
                    vVar4.c(d0VarA);
                }
            }
            if (this.s) {
                w wVar6 = this.o;
                wVar2 = new w(r0Var, wVar6.c, wVar6.d);
            } else {
                wVar2 = new w(r0Var, q0.p, w.e);
            }
            this.o = wVar2;
        }
        d0VarA = null;
        this.s = true;
        this.r = true;
        m(this.o);
        if (d0VarA != null) {
            v vVar5 = this.p;
            vVar5.getClass();
            vVar5.c(d0VarA);
        }
    }

    public y(a aVar, boolean z) {
        boolean z2;
        super(aVar);
        if (z && aVar.i()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new q0();
        this.n = new p0();
        r0 r0VarG = aVar.g();
        if (r0VarG != null) {
            this.o = new w(r0VarG, null, null);
            this.s = true;
        } else {
            this.o = new w(new x(aVar.h()), q0.p, w.e);
        }
    }
}
