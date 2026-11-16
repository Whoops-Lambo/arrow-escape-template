package defpackage;

import com.google.android.gms.internal.ads.zzgil;
import com.google.android.gms.internal.ads.zzgsw;
import com.google.android.gms.internal.ads.zzgvq;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ao4 implements zzgvq {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzgsw b;

    public /* synthetic */ ao4(zzgsw zzgswVar, int i) {
        this.a = i;
        this.b = zzgswVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvq
    public final /* synthetic */ Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                this.b.d(20310, th);
                return new byte[0];
            case 1:
                this.b.d(20309, th);
                return new byte[0];
            default:
                this.b.d(20308, th);
                return zzgil.L();
        }
    }
}
