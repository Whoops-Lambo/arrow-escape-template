package defpackage;

import com.google.android.gms.internal.ads.zzabk;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzmh;
import com.google.android.gms.internal.ads.zzmi;
import com.google.android.gms.internal.ads.zznq;
import com.google.android.gms.internal.ads.zzxq;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzzm;
import com.google.android.gms.internal.ads.zzzo;
import com.google.android.gms.internal.ads.zzzx;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kd5 implements zzxr, zzxq {
    public final zzxr a;
    public final long b;
    public zzxq c;

    @Override // com.google.android.gms.internal.ads.zzxr
    public final long d(zzabk[] zzabkVarArr, boolean[] zArr, zzzm[] zzzmVarArr, boolean[] zArr2, long j) {
        zzzm[] zzzmVarArr2 = new zzzm[zzzmVarArr.length];
        int i = 0;
        while (true) {
            zzzm zzzmVar = null;
            if (i >= zzzmVarArr.length) {
                break;
            }
            id5 id5Var = (id5) zzzmVarArr[i];
            if (id5Var != null) {
                zzzmVar = id5Var.a;
            }
            zzzmVarArr2[i] = zzzmVar;
            i++;
        }
        long j2 = this.b;
        long jD = this.a.d(zzabkVarArr, zArr, zzzmVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < zzzmVarArr.length; i2++) {
            zzzm zzzmVar2 = zzzmVarArr2[i2];
            if (zzzmVar2 == null) {
                zzzmVarArr[i2] = null;
            } else {
                zzzm zzzmVar3 = zzzmVarArr[i2];
                if (zzzmVar3 == null || ((id5) zzzmVar3).a != zzzmVar2) {
                    zzzmVarArr[i2] = new id5(zzzmVar2, j2);
                }
            }
        }
        return jD + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzzo
    public final void a(long j) {
        this.a.a(j - this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final long c(long j, zznq zznqVar) {
        zzxr zzxrVar = this.a;
        long j2 = this.b;
        return zzxrVar.c(j - j2, zznqVar) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzzo
    public final boolean e(zzmi zzmiVar) {
        long j = zzmiVar.a;
        zzmh zzmhVar = new zzmh();
        zzmhVar.b = zzmiVar.b;
        zzmhVar.c = zzmiVar.c;
        zzmhVar.a = j - this.b;
        return this.a.e(new zzmi(zzmhVar));
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void f(zzxq zzxqVar, long j) {
        this.c = zzxqVar;
        this.a.f(this, j - this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void g(long j, boolean z) {
        this.a.g(j - this.b, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final long h(long j) {
        zzxr zzxrVar = this.a;
        long j2 = this.b;
        return zzxrVar.h(j - j2) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void i(zzxr zzxrVar) {
        zzxq zzxqVar = this.c;
        zzxqVar.getClass();
        zzxqVar.i(this);
    }

    @Override // com.google.android.gms.internal.ads.zzzn
    public final /* bridge */ /* synthetic */ void j(zzzo zzzoVar) {
        zzxq zzxqVar = this.c;
        zzxqVar.getClass();
        zzxqVar.j(this);
    }

    @Override // com.google.android.gms.internal.ads.zzzo
    public final long zzb() {
        long jZzb = this.a.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzzo
    public final long zzc() {
        long jZzc = this.a.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzzo
    public final boolean zze() {
        return this.a.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzm() {
        this.a.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final zzzx zzn() {
        return this.a.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzr() {
        String str = zzfq.a;
        this.a.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final long zzs() {
        long jZzs = this.a.zzs();
        if (jZzs == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzs + this.b;
    }

    public kd5(zzxr zzxrVar, long j) {
        this.a = zzxrVar;
        this.b = j;
    }
}
