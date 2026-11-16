package defpackage;

import com.google.android.gms.internal.ads.zzbnx;
import com.google.android.gms.internal.ads.zzbog;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzbzt;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class f14 extends zzbog {
    public final /* synthetic */ zzbzs a;

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void H2(zzbnx zzbnxVar, String str) {
        zzbzt zzbztVar;
        zzbzs zzbzsVar = this.a;
        if (zzbzsVar.b == null) {
            return;
        }
        synchronized (zzbzsVar) {
            zzbztVar = zzbzsVar.c;
            if (zzbztVar == null) {
                zzbztVar = new zzbzt(zzbnxVar);
                zzbzsVar.c = zzbztVar;
            }
        }
        zzbzsVar.b.onCustomClick(zzbztVar, str);
    }
}
