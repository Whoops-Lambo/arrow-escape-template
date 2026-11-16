package defpackage;

import com.google.android.gms.internal.ads.zzgil;
import com.google.android.gms.internal.ads.zzgof;
import com.google.android.gms.internal.ads.zzgqh;
import com.google.android.gms.internal.ads.zzgsw;
import com.google.android.gms.internal.ads.zzheh;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xn4 implements zzgqh {
    public final zzgof a;
    public final ExecutorService b;
    public final zzgsw c;

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final ListenableFuture a(zzgil zzgilVar, byte[] bArr, byte[] bArr2) {
        xu4 xu4VarC = zzheh.c(this.b, new ea4(this, zzgilVar, bArr, bArr2, 7));
        this.c.e(15321, xu4VarC);
        return xu4VarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgqg
    public final ListenableFuture b(zzgil zzgilVar, byte[] bArr) {
        xu4 xu4VarC = zzheh.c(this.b, new w74(this, zzgilVar, bArr, 3));
        this.c.e(15305, xu4VarC);
        return xu4VarC;
    }

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final nu4 zza() {
        return zzheh.a(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final ListenableFuture zzb() {
        xu4 xu4VarC = zzheh.c(this.b, new wn4(this, 1));
        this.c.e(15302, xu4VarC);
        return xu4VarC;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final ListenableFuture zze() {
        xu4 xu4VarC = zzheh.c(this.b, new wn4(this, 0));
        this.c.e(15314, xu4VarC);
        return xu4VarC;
    }

    public xn4(zzgof zzgofVar, ExecutorService executorService, zzgsw zzgswVar) {
        this.a = zzgofVar;
        this.b = executorService;
        this.c = zzgswVar;
    }
}
