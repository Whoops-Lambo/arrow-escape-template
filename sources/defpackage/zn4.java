package defpackage;

import com.google.android.gms.internal.ads.zzgho;
import com.google.android.gms.internal.ads.zzgil;
import com.google.android.gms.internal.ads.zzgqp;
import com.google.android.gms.internal.ads.zzgsw;
import com.google.android.gms.internal.ads.zzgzb;
import com.google.android.gms.internal.ads.zzhdy;
import com.google.android.gms.internal.ads.zzheh;
import com.google.android.gms.internal.ads.zzioz;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zn4 implements zzgqp {
    public final zzgho a;
    public final zzgho b;
    public final zzioz c;
    public final zzgsw d;
    public final ExecutorService e;

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final ListenableFuture a(zzgil zzgilVar, byte[] bArr, byte[] bArr2) {
        xu4 xu4VarB = ((zzgho) this.c.zzb()).b(bArr);
        zzgsw zzgswVar = this.d;
        zzgswVar.e(20307, xu4VarB);
        xu4 xu4VarB2 = this.b.b(bArr2);
        zzgswVar.e(20305, xu4VarB2);
        return zzheh.h(zzhdy.s(new bu4(zzgzb.C(new ListenableFuture[]{xu4VarB, xu4VarB2}), true)), new yn4(this, zzgilVar, 1), fu4.a);
    }

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final ListenableFuture b(zzgil zzgilVar, byte[] bArr) {
        xu4 xu4VarB = this.b.b(bArr);
        this.d.e(20305, xu4VarB);
        return zzheh.h(zzhdy.s(xu4VarB), new yn4(this, zzgilVar, 0), fu4.a);
    }

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final nu4 zza() {
        return zzheh.a(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final ListenableFuture zzb() {
        xu4 xu4VarA = this.a.a();
        this.d.e(20302, xu4VarA);
        return xu4VarA;
    }

    @Override // com.google.android.gms.internal.ads.zzgqp
    public final ListenableFuture zze() {
        xu4 xu4VarA = this.b.a();
        this.d.e(20304, xu4VarA);
        return xu4VarA;
    }

    @Override // com.google.android.gms.internal.ads.zzgqp
    public final xu4 zzf() {
        xu4 xu4VarC = zzheh.c(this.e, ry3.h);
        this.d.e(20312, xu4VarC);
        return xu4VarC;
    }

    public zn4(zzgho zzghoVar, zzgho zzghoVar2, zzioz zziozVar, ExecutorService executorService, zzgsw zzgswVar) {
        this.a = zzghoVar;
        this.b = zzghoVar2;
        this.c = zziozVar;
        this.d = zzgswVar;
        this.e = executorService;
    }
}
