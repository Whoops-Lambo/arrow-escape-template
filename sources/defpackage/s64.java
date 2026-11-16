package defpackage;

import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.internal.ads.zzcly;
import com.google.android.gms.internal.ads.zzdhd;
import com.google.android.gms.internal.ads.zzdiz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s64 implements zzdiz {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s64(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzdiz
    public final /* synthetic */ void zza() {
        zzm zzmVarZzL;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((zzdhd) obj).zzc();
                break;
            default:
                zzcly zzclyVar = (zzcly) obj;
                if (zzclyVar != null && (zzmVarZzL = zzclyVar.zzL()) != null) {
                    zzmVarZzL.zza();
                    break;
                }
                break;
        }
    }
}
