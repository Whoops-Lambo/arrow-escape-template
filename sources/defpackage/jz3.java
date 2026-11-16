package defpackage;

import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.internal.ads.zzbnx;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzboj;
import com.google.android.gms.internal.ads.zzbpd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class jz3 extends zzboj {
    public final /* synthetic */ zzbpd a;

    @Override // com.google.android.gms.internal.ads.zzbok
    public final void N(zzbnx zzbnxVar) {
        zzbny zzbnyVar;
        zzbpd zzbpdVar = this.a;
        zze zzeVar = zzbpdVar.a;
        synchronized (zzbpdVar) {
            zzbnyVar = zzbpdVar.c;
            if (zzbnyVar == null) {
                zzbnyVar = new zzbny(zzbnxVar);
                zzbpdVar.c = zzbnyVar;
            }
        }
        zzeVar.zzb(zzbnyVar);
    }
}
