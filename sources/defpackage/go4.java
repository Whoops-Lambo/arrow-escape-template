package defpackage;

import com.google.android.gms.internal.ads.zzgil;
import com.google.android.gms.internal.ads.zzgri;
import com.google.android.gms.internal.ads.zzgsw;
import com.google.android.gms.internal.ads.zzioz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class go4 implements zzgri {
    public final zzioz a;
    public final zzgsw b;
    public final long c;

    @Override // com.google.android.gms.internal.ads.zzgri
    public final boolean a(zzgil zzgilVar) {
        zzgsw zzgswVar = this.b;
        if (zzgilVar == null || zzgilVar.equals(zzgil.L())) {
            zzgswVar.b(15102);
            return false;
        }
        if (zzgilVar.G() == this.a.zzb()) {
            return true;
        }
        zzgswVar.b(15103);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgri
    public final boolean b(zzgil zzgilVar) {
        zzgsw zzgswVar = this.b;
        if (zzgilVar == null || zzgilVar.equals(zzgil.L())) {
            zzgswVar.b(15104);
            return true;
        }
        if (zzgilVar.G() != this.a.zzb()) {
            zzgswVar.b(15105);
            return true;
        }
        boolean z = (zzgilVar.E().G() * 1000) - System.currentTimeMillis() <= this.c;
        if (z) {
            zzgswVar.b(15106);
        }
        return z;
    }

    public go4(zzioz zziozVar, zzgsw zzgswVar, long j) {
        this.a = zziozVar;
        this.b = zzgswVar;
        this.c = j;
    }
}
