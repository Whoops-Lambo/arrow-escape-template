package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzdef;
import com.google.android.gms.internal.ads.zzdeg;
import com.google.android.gms.internal.ads.zzdes;
import com.google.android.gms.internal.ads.zzdjz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y74 implements zzdjz {
    public final /* synthetic */ int a;
    public final /* synthetic */ zze b;

    public /* synthetic */ y74(int i, zze zzeVar) {
        this.a = i;
        this.b = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public final /* synthetic */ void mo82zza(Object obj) {
        int i = this.a;
        zze zzeVar = this.b;
        switch (i) {
            case 0:
                ((zzdef) obj).m(zzeVar);
                break;
            case 1:
                ((zzdes) obj).n(zzeVar);
                break;
            default:
                ((zzdeg) obj).zzc(zzeVar);
                break;
        }
    }
}
