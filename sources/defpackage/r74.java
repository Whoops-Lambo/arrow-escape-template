package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzat;
import com.google.android.gms.internal.ads.zzcly;
import com.google.android.gms.internal.ads.zzcwb;
import com.google.android.gms.internal.ads.zzdnl;
import com.google.android.gms.internal.ads.zzdwy;
import com.google.android.gms.internal.ads.zzflq;
import com.google.android.gms.internal.ads.zzfmj;
import com.google.android.gms.internal.ads.zzgvq;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r74 implements zzgvq {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r74(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.zzgvq
    public final /* synthetic */ Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                zzflq zzflqVar = (zzflq) obj;
                zzat zzatVar = new zzat((Context) obj4);
                zzatVar.zze(zzflqVar.B);
                zzatVar.zzf(zzflqVar.C.toString());
                zzatVar.zzd(((VersionInfoParcel) obj3).afmaVersion);
                zzatVar.zzc(((zzfmj) obj2).g);
                return zzatVar;
            case 1:
                zzcly zzclyVar = (zzcly) obj4;
                if (((zzflq) obj3).M) {
                    zzclyVar.e();
                }
                zzclyVar.zzJ();
                zzclyVar.onPause();
                return ((zzcwb) obj2).d();
            case 2:
                zzcly zzclyVar2 = (zzcly) obj4;
                if (((zzflq) obj3).M) {
                    zzclyVar2.e();
                }
                zzclyVar2.zzJ();
                zzclyVar2.onPause();
                return ((zzdnl) obj2).d();
            default:
                zzcly zzclyVar3 = (zzcly) obj4;
                if (((zzflq) obj3).M) {
                    zzclyVar3.e();
                }
                zzclyVar3.zzJ();
                zzclyVar3.onPause();
                return ((zzdwy) obj2).d();
        }
    }
}
