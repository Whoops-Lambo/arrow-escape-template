package defpackage;

import com.google.android.gms.internal.ads.zzbiw;
import com.google.android.gms.internal.ads.zzdjt;
import com.google.android.gms.internal.ads.zzdjz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o84 implements zzdjz {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbiw.zzb b;

    public /* synthetic */ o84(zzbiw.zzb zzbVar, int i) {
        this.a = i;
        this.b = zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public final /* synthetic */ void mo82zza(Object obj) {
        int i = this.a;
        zzbiw.zzb zzbVar = this.b;
        zzdjt zzdjtVar = (zzdjt) obj;
        switch (i) {
            case 0:
                zzdjtVar.d(zzbVar);
                break;
            case 1:
                zzdjtVar.f(zzbVar);
                break;
            default:
                zzdjtVar.V(zzbVar);
                break;
        }
    }
}
