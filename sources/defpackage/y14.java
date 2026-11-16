package defpackage;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.zzbjr;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class y14 {
    public final zzg a;

    public final void a(int i, long j) {
        if (((Boolean) zzba.zzc().a(zzbjr.l1)).booleanValue()) {
            return;
        }
        zzg zzgVar = this.a;
        if (j - zzgVar.zzF() < 0) {
            zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) zzba.zzc().a(zzbjr.m1)).booleanValue()) {
            zzgVar.zzE(i);
            zzgVar.zzG(j);
        } else {
            zzgVar.zzE(-1);
            zzgVar.zzG(j);
        }
    }

    public y14(zzg zzgVar) {
        this.a = zzgVar;
    }
}
