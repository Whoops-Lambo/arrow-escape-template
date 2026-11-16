package io.p071bidmachine.media3.exoplayer.source;

import defpackage.h10;
import defpackage.p70;
import defpackage.w60;
import io.p071bidmachine.internal.p;
import io.p071bidmachine.media3.exoplayer.drm.e;
import io.p071bidmachine.media3.exoplayer.drm.f;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class j implements h0, f {
    public final Object a;
    public e b;
    public e c;
    public final /* synthetic */ l d;

    public final boolean b(int i, d0 d0Var) {
        d0 d0VarT;
        Object obj = this.a;
        l lVar = this.d;
        if (d0Var != null) {
            d0VarT = lVar.t(obj, d0Var);
            if (d0VarT == null) {
                return false;
            }
        } else {
            d0VarT = null;
        }
        int iV = lVar.v(obj, i);
        e eVar = this.b;
        if (eVar.a != iV || !Objects.equals(eVar.b, d0VarT)) {
            this.b = new e(lVar.c.c, iV, d0VarT);
        }
        e eVar2 = this.c;
        if (eVar2.a == iV && Objects.equals(eVar2.b, d0VarT)) {
            return true;
        }
        this.c = new e(lVar.d.c, iV, d0VarT);
        return true;
    }

    public final z c(z zVar, d0 d0Var) {
        long j = zVar.f;
        l lVar = this.d;
        Object obj = this.a;
        long jU = lVar.u(obj, j);
        long j2 = zVar.g;
        long jU2 = lVar.u(obj, j2);
        return (jU == j && jU2 == j2) ? zVar : new z(zVar.a, zVar.b, zVar.c, zVar.d, zVar.e, jU, jU2);
    }

    public j(l lVar, Object obj) {
        this.d = lVar;
        this.b = lVar.a(null);
        this.c = new e(lVar.d.c, 0, null);
        this.a = obj;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.h0
    public final void a(int i, d0 d0Var, u uVar, z zVar) {
        if (b(i, d0Var)) {
            e eVar = this.b;
            z zVarC = c(zVar, d0Var);
            eVar.getClass();
            eVar.a(new f0(eVar, uVar, zVarC, 0));
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.h0
    public final void g(int i, d0 d0Var, u uVar, z zVar) {
        if (b(i, d0Var)) {
            e eVar = this.b;
            z zVarC = c(zVar, d0Var);
            eVar.getClass();
            eVar.a(new f0(eVar, uVar, zVarC, 1));
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.h0
    public final void h(int i, d0 d0Var, u uVar, z zVar, IOException iOException, boolean z) {
        if (b(i, d0Var)) {
            e eVar = this.b;
            z zVarC = c(zVar, d0Var);
            eVar.getClass();
            eVar.a(new w60(eVar, uVar, zVarC, iOException, z, 3));
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.h0
    public final void m(int i, d0 d0Var, z zVar) {
        if (b(i, d0Var)) {
            e eVar = this.b;
            z zVarC = c(zVar, d0Var);
            eVar.getClass();
            eVar.a(new p(eVar, zVarC));
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.h0
    public final void q(int i, d0 d0Var, u uVar, z zVar, int i2) {
        if (b(i, d0Var)) {
            e eVar = this.b;
            z zVarC = c(zVar, d0Var);
            eVar.getClass();
            eVar.a(new p70(eVar, uVar, zVarC, i2, 4));
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.h0
    public final void r(int i, d0 d0Var, z zVar) {
        if (b(i, d0Var)) {
            e eVar = this.b;
            z zVarC = c(zVar, d0Var);
            d0 d0Var2 = eVar.b;
            d0Var2.getClass();
            eVar.a(new h10(14, eVar, d0Var2, zVarC));
        }
    }
}
