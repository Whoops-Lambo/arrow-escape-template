package defpackage;

import com.google.android.gms.internal.ads.zzbnx;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbog;
import com.google.android.gms.internal.ads.zzbpd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class iz3 extends zzbog {
    public final /* synthetic */ zzbpd a;

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void H2(zzbnx zzbnxVar, String str) {
        zzbny zzbnyVar;
        zzbpd zzbpdVar = this.a;
        if (zzbpdVar.b == null) {
            return;
        }
        synchronized (zzbpdVar) {
            zzbnyVar = zzbpdVar.c;
            if (zzbnyVar == null) {
                zzbnyVar = new zzbny(zzbnxVar);
                zzbpdVar.c = zzbnyVar;
            }
        }
        zzbpdVar.b.zzc(zzbnyVar, str);
    }
}
