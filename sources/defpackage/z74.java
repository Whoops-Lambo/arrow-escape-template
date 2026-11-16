package defpackage;

import com.google.android.gms.internal.ads.zzdeg;
import com.google.android.gms.internal.ads.zzdes;
import com.google.android.gms.internal.ads.zzdjz;
import com.google.android.gms.internal.ads.zzdoy;
import com.google.android.gms.internal.ads.zzfnl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class z74 implements zzdjz {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzdoy b;

    public /* synthetic */ z74(zzdoy zzdoyVar, int i) {
        this.a = i;
        this.b = zzdoyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public final /* synthetic */ void mo82zza(Object obj) {
        int i = this.a;
        zzdoy zzdoyVar = this.b;
        switch (i) {
            case 0:
                zzdes zzdesVar = (zzdes) obj;
                String message = zzdoyVar.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                zzdesVar.n(zzfnl.d(12, message, null));
                break;
            default:
                ((zzdeg) obj).A(zzdoyVar);
                break;
        }
    }
}
