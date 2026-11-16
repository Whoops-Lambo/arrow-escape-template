package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzje implements zzni, zznk {
    public final int b;
    public zznl d;
    public int e;
    public zzqn f;
    public zzdp g;
    public int h;
    public zzzm i;
    public zzv[] j;
    public long k;
    public long l;
    public boolean n;
    public boolean o;
    public zzxt q;
    public zznj s;
    public final Object a = new Object();
    public final zzme c = new zzme();
    public long m = Long.MIN_VALUE;
    public zzbf p = zzbf.a;
    public long r = -9223372036854775807L;

    public void A() {
    }

    public void B() {
    }

    public final zzjr E(Exception exc, zzv zzvVar, boolean z, int i) {
        int iB = 4;
        if (zzvVar != null && !this.o) {
            this.o = true;
            try {
                iB = ((zzwf) this).b(zzvVar) & 7;
            } catch (zzjr unused) {
            } finally {
                this.o = false;
            }
        }
        return zzjr.b(exc, a(), this.e, zzvVar, iB, this.q, z, i);
    }

    public void H(boolean z, boolean z2) {
    }

    public void I(zzv[] zzvVarArr, long j, long j2, zzxt zzxtVar) {
    }

    @Override // com.google.android.gms.internal.ads.zznd
    public void c(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzni
    public final void g(long j, boolean z) {
        this.n = false;
        this.l = j;
        this.m = j;
        if (!z) {
            zzzm zzzmVar = this.i;
            zzzmVar.getClass();
            z = zzzmVar.a(j - this.k) != 0;
        }
        v(j, false, z);
    }

    public void v(long j, boolean z, boolean z2) {
        throw null;
    }

    public void w() {
    }

    public void x() {
    }

    public void y() {
        throw null;
    }

    public void z() {
    }

    @Override // com.google.android.gms.internal.ads.zzni
    public final zzje zzb() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzni
    public zzmj zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzni
    public final void zzl() {
        this.n = true;
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public int zzu() {
        return 0;
    }

    public final void C() {
        this.d.getClass();
    }

    public final long D() {
        return this.r;
    }

    public final int F(zzme zzmeVar, zzjc zzjcVar, int i) {
        zzzm zzzmVar = this.i;
        zzzmVar.getClass();
        int iB = zzzmVar.b(zzmeVar, zzjcVar, i);
        if (iB == -4) {
            int i2 = i & 1;
            if (zzjcVar.b(4)) {
                if (i2 == 0) {
                    this.m = Long.MIN_VALUE;
                }
                return this.n ? -4 : -3;
            }
            long j = zzjcVar.e + this.k;
            zzjcVar.e = j;
            if (i2 == 0) {
                this.m = Math.max(this.m, j);
                return -4;
            }
        } else if (iB == -5) {
            zzv zzvVar = zzmeVar.b;
            zzvVar.getClass();
            long j2 = zzvVar.t;
            if (j2 != Long.MAX_VALUE) {
                zzt zztVar = new zzt(zzvVar);
                zztVar.s = j2 + this.k;
                zzmeVar.b = new zzv(zztVar);
                return -5;
            }
        }
        return iB;
    }

    public final void G() {
        zzxt zzxtVar;
        int iE;
        if (this.p.g() || (zzxtVar = this.q) == null || (iE = this.p.e(zzxtVar.a)) == -1) {
            this.r = -9223372036854775807L;
            return;
        }
        zzbd zzbdVarD = this.p.d(iE, new zzbd(), false);
        this.r = zzbdVarD.d;
        int i = zzxtVar.b;
        if (i != -1) {
            this.r = zzbdVarD.f.a(i).e[zzxtVar.c];
            return;
        }
        int i2 = zzxtVar.e;
        if (i2 != -1) {
            zzbdVarD.f.a(i2).getClass();
            this.r = 0L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzni
    public final void h(int i, zzqn zzqnVar, zzdp zzdpVar) {
        this.e = i;
        this.f = zzqnVar;
        this.g = zzdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzni
    public final void i(zznl zznlVar, zzv[] zzvVarArr, zzzm zzzmVar, boolean z, boolean z2, long j, long j2, zzxt zzxtVar) {
        zzgvz.f(this.h == 0);
        this.d = zznlVar;
        this.q = zzxtVar;
        this.h = 1;
        H(z, z2);
        n(zzvVarArr, zzzmVar, j, j2, zzxtVar);
        this.n = false;
        this.l = j;
        this.m = j;
        v(j, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzni
    public final void k(zzbf zzbfVar) {
        if (Objects.equals(this.p, zzbfVar)) {
            return;
        }
        this.p = zzbfVar;
        G();
        B();
    }

    @Override // com.google.android.gms.internal.ads.zzni
    public final void n(zzv[] zzvVarArr, zzzm zzzmVar, long j, long j2, zzxt zzxtVar) {
        zzgvz.f(!this.n);
        this.i = zzzmVar;
        this.q = zzxtVar;
        G();
        if (this.m == Long.MIN_VALUE) {
            this.m = j;
        }
        this.j = zzvVarArr;
        this.k = j2;
        I(zzvVarArr, j, j2, zzxtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzni
    public final void o() {
        zzgvz.f(this.h == 1);
        this.h = 2;
        w();
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void s(zznj zznjVar) {
        synchronized (this.a) {
            this.s = zznjVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzni
    public final boolean t() {
        return this.m == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzni
    public final zzzm u() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.zzni, com.google.android.gms.internal.ads.zznk
    public final int zza() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzni
    public final int zze() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.zzni
    public final long zzk() {
        return this.m;
    }

    @Override // com.google.android.gms.internal.ads.zzni
    public final boolean zzm() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.zzni
    public final void zzn() {
        zzzm zzzmVar = this.i;
        zzzmVar.getClass();
        zzzmVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzni
    public final void zzq() {
        zzgvz.f(this.h == 2);
        this.h = 1;
        x();
    }

    @Override // com.google.android.gms.internal.ads.zzni
    public final void zzr() {
        zzgvz.f(this.h == 1);
        zzme zzmeVar = this.c;
        zzmeVar.a = null;
        zzmeVar.b = null;
        this.h = 0;
        this.i = null;
        this.j = null;
        this.n = false;
        y();
        this.q = null;
        this.r = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzni
    public final void zzs() {
        zzgvz.f(this.h == 0);
        zzme zzmeVar = this.c;
        zzmeVar.a = null;
        zzmeVar.b = null;
        z();
    }

    @Override // com.google.android.gms.internal.ads.zzni
    public final void zzt() {
        zzgvz.f(this.h == 0);
        A();
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzw() {
        synchronized (this.a) {
            this.s = null;
        }
    }

    public zzje(int i) {
        this.b = i;
    }
}
