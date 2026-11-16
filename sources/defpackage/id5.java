package defpackage;

import com.google.android.gms.internal.ads.zzjc;
import com.google.android.gms.internal.ads.zzme;
import com.google.android.gms.internal.ads.zzzm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class id5 implements zzzm {
    public final zzzm a;
    public final long b;

    @Override // com.google.android.gms.internal.ads.zzzm
    public final int a(long j) {
        return this.a.a(j - this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final int b(zzme zzmeVar, zzjc zzjcVar, int i) {
        int iB = this.a.b(zzmeVar, zzjcVar, i);
        if (iB != -4) {
            return iB;
        }
        zzjcVar.e += this.b;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final boolean zzc() {
        return this.a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final void zzd() {
        this.a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final int zzg() {
        return this.a.zzg();
    }

    public id5(zzzm zzzmVar, long j) {
        this.a = zzzmVar;
        this.b = j;
    }
}
