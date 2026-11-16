package defpackage;

import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zznv;
import com.google.android.gms.internal.ads.zznx;
import com.google.android.gms.internal.ads.zzv;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v45 implements zzeb {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzv b;

    public /* synthetic */ v45(zznv zznvVar, zzv zzvVar, zzjj zzjjVar, int i) {
        this.a = i;
        this.b = zzvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    /* JADX INFO: renamed from: zza */
    public final /* synthetic */ void mo1229zza(Object obj) {
        zznx zznxVar = (zznx) obj;
        switch (this.a) {
            case 0:
                zznxVar.o(this.b);
                break;
            default:
                zznxVar.m(this.b);
                break;
        }
    }
}
