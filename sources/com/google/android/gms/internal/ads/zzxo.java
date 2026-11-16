package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzxo extends zzzz {
    public final boolean l;
    public final zzbe m;
    public final zzbd n;
    public f0 o;
    public zzxl p;
    public boolean q;
    public boolean r;
    public boolean s;

    @Override // com.google.android.gms.internal.ads.zzzz, com.google.android.gms.internal.ads.zzxv
    public final void i(zzxr zzxrVar) {
        zzxl zzxlVar = (zzxl) zzxrVar;
        zzxr zzxrVar2 = zzxlVar.e;
        if (zzxrVar2 != null) {
            zzxv zzxvVar = zzxlVar.d;
            zzxvVar.getClass();
            zzxvVar.i(zzxrVar2);
        }
        if (zzxrVar == this.p) {
            this.p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzwt
    public final void o() {
        this.r = false;
        this.q = false;
        super.o();
    }

    @Override // com.google.android.gms.internal.ads.zzzz, com.google.android.gms.internal.ads.zzxv
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final zzxl k(zzxt zzxtVar, zzabv zzabvVar, long j) {
        zzxl zzxlVar = new zzxl(zzxtVar, zzabvVar, j);
        zzgvz.f(zzxlVar.d == null);
        zzxv zzxvVar = this.k;
        zzxlVar.d = zzxvVar;
        if (!this.r) {
            this.p = zzxlVar;
            if (!this.q) {
                this.q = true;
                r(null, zzxvVar);
            }
            return zzxlVar;
        }
        Object obj = zzxtVar.a;
        if (this.o.d != null && obj.equals(f0.e)) {
            obj = this.o.d;
        }
        zzxlVar.b(zzxtVar.a(obj));
        return zzxlVar;
    }

    public final boolean B(long j) {
        zzxl zzxlVar = this.p;
        int iE = this.o.e(zzxlVar.a.a);
        if (iE == -1) {
            return false;
        }
        f0 f0Var = this.o;
        zzbd zzbdVar = this.n;
        f0Var.d(iE, zzbdVar, false);
        long j2 = zzbdVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzxlVar.g = j;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void f(zzak zzakVar) {
        if (this.s) {
            f0 f0Var = this.o;
            zzbf zzbfVar = f0Var.b;
            this.o = new f0(zzbfVar instanceof zzzv ? new zzzv(((zzzv) zzbfVar).b, zzakVar) : new zzzv(zzbfVar, zzakVar), f0Var.c, f0Var.d);
        } else {
            this.o = new f0(new zzxn(zzakVar), zzbe.m, f0.e);
        }
        this.k.f(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final void x() {
        if (this.l) {
            return;
        }
        this.q = true;
        r(null, this.k);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    @Override // com.google.android.gms.internal.ads.zzzz
    public final void y(zzbf zzbfVar) {
        long j;
        f0 f0Var;
        f0 f0Var2;
        zzxt zzxtVarA = null;
        if (this.r) {
            f0 f0Var3 = this.o;
            this.o = new f0(zzbfVar, f0Var3.c, f0Var3.d);
            zzxl zzxlVar = this.p;
            if (zzxlVar != null) {
                B(zzxlVar.g);
            }
        } else if (zzbfVar.g()) {
            if (this.s) {
                f0 f0Var4 = this.o;
                f0Var2 = new f0(zzbfVar, f0Var4.c, f0Var4.d);
            } else {
                f0Var2 = new f0(zzbfVar, zzbe.m, f0.e);
            }
            this.o = f0Var2;
        } else {
            zzbe zzbeVar = this.m;
            zzbfVar.b(0, zzbeVar, 0L);
            Object obj = zzbeVar.a;
            zzxl zzxlVar2 = this.p;
            if (zzxlVar2 != null) {
                j = zzxlVar2.b;
                this.o.o(zzxlVar2.a.a, this.n);
                this.o.b(0, zzbeVar, 0L);
                if (j == 0) {
                    j = 0;
                }
            } else {
                j = 0;
            }
            Pair pairM = zzbfVar.m(zzbeVar, this.n, 0, j);
            Object obj2 = pairM.first;
            long jLongValue = ((Long) pairM.second).longValue();
            if (this.s) {
                f0 f0Var5 = this.o;
                f0Var = new f0(zzbfVar, f0Var5.c, f0Var5.d);
            } else {
                f0Var = new f0(zzbfVar, obj, obj2);
            }
            this.o = f0Var;
            zzxl zzxlVar3 = this.p;
            if (zzxlVar3 != null && B(jLongValue)) {
                zzxt zzxtVar = zzxlVar3.a;
                Object obj3 = zzxtVar.a;
                if (this.o.d != null && obj3.equals(f0.e)) {
                    obj3 = this.o.d;
                }
                zzxtVarA = zzxtVar.a(obj3);
            }
        }
        this.s = true;
        this.r = true;
        p(this.o);
        if (zzxtVarA != null) {
            zzxl zzxlVar4 = this.p;
            zzxlVar4.getClass();
            zzxlVar4.b(zzxtVarA);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final zzxt z(zzxt zzxtVar) {
        Object obj = this.o.d;
        Object obj2 = zzxtVar.a;
        if (obj != null && obj.equals(obj2)) {
            obj2 = f0.e;
        }
        return zzxtVar.a(obj2);
    }

    public zzxo(zzxv zzxvVar, boolean z) {
        boolean z2;
        super(zzxvVar);
        if (z) {
            zzxvVar.zzJ();
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new zzbe();
        this.n = new zzbd();
        zzxvVar.w();
        this.o = new f0(new zzxn(zzxvVar.v()), zzbe.m, f0.e);
    }
}
