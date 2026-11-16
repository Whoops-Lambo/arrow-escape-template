package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzigw;
import com.google.android.gms.internal.ads.zzihc;
import defpackage.fz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class zzigw<MessageT extends zzihc<MessageT, BuilderT>, BuilderT extends zzigw<MessageT, BuilderT>> extends zziff<MessageT, BuilderT> {
    public final zzihc a;
    public zzihc b;

    @Override // com.google.android.gms.internal.ads.zziij
    public final boolean c() {
        return zzihc.B(this.b, false);
    }

    @Override // com.google.android.gms.internal.ads.zziff
    public final Object clone() {
        zzigw zzigwVar = (zzigw) this.a.A(zzihb.e, null);
        boolean zO = this.b.o();
        zzihc zzihcVar = this.b;
        if (zO) {
            zzihcVar.getClass();
            fz4.b.a(zzihcVar.getClass()).a(zzihcVar);
            zzihcVar.p();
            zzihcVar = this.b;
        }
        zzigwVar.b = zzihcVar;
        return zzigwVar;
    }

    @Override // com.google.android.gms.internal.ads.zziff
    /* JADX INFO: renamed from: j */
    public final zzigw clone() {
        zzigw zzigwVar = (zzigw) this.a.A(zzihb.e, null);
        boolean zO = this.b.o();
        zzihc zzihcVar = this.b;
        if (zO) {
            zzihcVar.getClass();
            fz4.b.a(zzihcVar.getClass()).a(zzihcVar);
            zzihcVar.p();
            zzihcVar = this.b;
        }
        zzigwVar.b = zzihcVar;
        return zzigwVar;
    }

    @Override // com.google.android.gms.internal.ads.zziih
    public final zzihc k0() {
        boolean zO = this.b.o();
        zzihc zzihcVar = this.b;
        if (!zO) {
            return zzihcVar;
        }
        zzihcVar.getClass();
        fz4.b.a(zzihcVar.getClass()).a(zzihcVar);
        zzihcVar.p();
        return this.b;
    }

    public final void l() {
        if (this.b.o()) {
            return;
        }
        zzihc zzihcVarU = this.a.u();
        fz4.b.a(zzihcVarU.getClass()).b(zzihcVarU, this.b);
        this.b = zzihcVarU;
    }

    public final zzihc m() {
        boolean zO = this.b.o();
        zzihc zzihcVar = this.b;
        if (zO) {
            zzihcVar.getClass();
            fz4.b.a(zzihcVar.getClass()).a(zzihcVar);
            zzihcVar.p();
            zzihcVar = this.b;
        }
        zzihcVar.getClass();
        if (zzihc.B(zzihcVar, true)) {
            return zzihcVar;
        }
        throw new zzijj(zzihcVar);
    }

    public final zzigw n(zzihc zzihcVar) {
        zzihc zzihcVar2 = this.a;
        if (zzihcVar != null && !zzihcVar2.getClass().isInstance(zzihcVar)) {
            defpackage.d.r("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }
        if (zzihcVar2.equals(zzihcVar)) {
            return this;
        }
        l();
        zzihc zzihcVar3 = this.b;
        fz4.b.a(zzihcVar3.getClass()).b(zzihcVar3, zzihcVar);
        return this;
    }

    public zzigw(zzihc zzihcVar) {
        this.a = zzihcVar;
        if (!zzihcVar.o()) {
            this.b = zzihcVar.u();
        } else {
            defpackage.d.r("Default instance must be immutable.");
            throw null;
        }
    }
}
