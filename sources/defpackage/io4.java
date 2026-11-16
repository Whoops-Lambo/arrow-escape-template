package defpackage;

import com.google.android.gms.internal.ads.zzavq;
import com.google.android.gms.internal.ads.zzavx;
import com.google.android.gms.internal.ads.zzgil;
import com.google.android.gms.internal.ads.zzgri;
import com.google.android.gms.internal.ads.zzgsw;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class io4 implements zzgri {
    public final zzgsw a;

    @Override // com.google.android.gms.internal.ads.zzgri
    public final boolean a(zzgil zzgilVar) {
        zzgsw zzgswVar = this.a;
        if (zzgilVar == null || zzgilVar.equals(zzgil.L())) {
            zzgswVar.b(20204);
            return false;
        }
        if (zzavq.a((short) zzgilVar.F().E().E(), zzgilVar.F().E().F(), zzavx.a())) {
            return true;
        }
        zzgswVar.b(20206);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgri
    public final boolean b(zzgil zzgilVar) {
        return false;
    }

    public io4(zzgsw zzgswVar) {
        this.a = zzgswVar;
    }
}
