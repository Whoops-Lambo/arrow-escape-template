package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzxl implements zzxr, zzxq {
    public final zzxt a;
    public final long b;
    public final zzabv c;
    public zzxv d;
    public zzxr e;
    public zzxq f;
    public long g = -9223372036854775807L;
    public boolean h;

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzr() {
        this.h = true;
        zzxr zzxrVar = this.e;
        if (zzxrVar != null) {
            zzxrVar.zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzo
    public final void a(long j) {
        zzxr zzxrVar = this.e;
        String str = zzfq.a;
        zzxrVar.a(j);
    }

    public final void b(zzxt zzxtVar) {
        long j = this.g;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        zzxv zzxvVar = this.d;
        zzxvVar.getClass();
        zzxr zzxrVarK = zzxvVar.k(zzxtVar, this.c, j);
        this.e = zzxrVarK;
        if (this.h) {
            zzxrVarK.zzr();
        }
        if (this.f != null) {
            this.e.f(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final long c(long j, zznq zznqVar) {
        zzxr zzxrVar = this.e;
        String str = zzfq.a;
        return zzxrVar.c(j, zznqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final long d(zzabk[] zzabkVarArr, boolean[] zArr, zzzm[] zzzmVarArr, boolean[] zArr2, long j) {
        long j2 = this.g;
        if (j2 != -9223372036854775807L && j == this.b) {
            j = j2;
        }
        this.g = -9223372036854775807L;
        zzxr zzxrVar = this.e;
        String str = zzfq.a;
        return zzxrVar.d(zzabkVarArr, zArr, zzzmVarArr, zArr2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzzo
    public final boolean e(zzmi zzmiVar) {
        zzxr zzxrVar = this.e;
        return zzxrVar != null && zzxrVar.e(zzmiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void f(zzxq zzxqVar, long j) {
        this.f = zzxqVar;
        zzxr zzxrVar = this.e;
        if (zzxrVar != null) {
            long j2 = this.g;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            zzxrVar.f(this, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void g(long j, boolean z) {
        zzxr zzxrVar = this.e;
        String str = zzfq.a;
        zzxrVar.g(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final long h(long j) {
        zzxr zzxrVar = this.e;
        String str = zzfq.a;
        return zzxrVar.h(j);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void i(zzxr zzxrVar) {
        zzxq zzxqVar = this.f;
        String str = zzfq.a;
        zzxqVar.i(this);
    }

    @Override // com.google.android.gms.internal.ads.zzzn
    public final /* bridge */ /* synthetic */ void j(zzzo zzzoVar) {
        zzxq zzxqVar = this.f;
        String str = zzfq.a;
        zzxqVar.j(this);
    }

    @Override // com.google.android.gms.internal.ads.zzzo
    public final long zzb() {
        zzxr zzxrVar = this.e;
        String str = zzfq.a;
        return zzxrVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzzo
    public final long zzc() {
        zzxr zzxrVar = this.e;
        String str = zzfq.a;
        return zzxrVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzo
    public final boolean zze() {
        zzxr zzxrVar = this.e;
        return zzxrVar != null && zzxrVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzm() {
        zzxr zzxrVar = this.e;
        if (zzxrVar != null) {
            zzxrVar.zzm();
            return;
        }
        zzxv zzxvVar = this.d;
        if (zzxvVar != null) {
            zzxvVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final zzzx zzn() {
        zzxr zzxrVar = this.e;
        String str = zzfq.a;
        return zzxrVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final long zzs() {
        zzxr zzxrVar = this.e;
        String str = zzfq.a;
        return zzxrVar.zzs();
    }

    public zzxl(zzxt zzxtVar, zzabv zzabvVar, long j) {
        this.a = zzxtVar;
        this.c = zzabvVar;
        this.b = j;
    }
}
