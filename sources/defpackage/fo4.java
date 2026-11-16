package defpackage;

import com.google.android.gms.internal.ads.zzgil;
import com.google.android.gms.internal.ads.zzgqp;
import com.google.android.gms.internal.ads.zzgsw;
import com.google.android.gms.internal.ads.zzheh;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class fo4 implements zzgqp {
    public final ExecutorService a;
    public final zzgsw b;

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final ListenableFuture a(zzgil zzgilVar, byte[] bArr, byte[] bArr2) {
        return nu4.b;
    }

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final ListenableFuture b(zzgil zzgilVar, byte[] bArr) {
        return nu4.b;
    }

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final nu4 zza() {
        return zzheh.a(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final ListenableFuture zzb() {
        xu4 xu4VarC = zzheh.c(this.a, ry3.j);
        this.b.e(20311, xu4VarC);
        return xu4VarC;
    }

    @Override // com.google.android.gms.internal.ads.zzgqp
    public final xu4 zzf() {
        xu4 xu4VarC = zzheh.c(this.a, ry3.i);
        this.b.e(20312, xu4VarC);
        return xu4VarC;
    }

    public fo4(ExecutorService executorService, zzgsw zzgswVar) {
        this.a = executorService;
        this.b = zzgswVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqp
    public final ListenableFuture zze() {
        return zzf();
    }
}
