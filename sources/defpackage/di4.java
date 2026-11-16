package defpackage;

import com.google.android.gms.internal.ads.zzdjz;
import com.google.android.gms.internal.ads.zzfqc;
import com.google.android.gms.internal.ads.zzfqp;
import com.google.android.gms.internal.ads.zzfqw;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class di4 implements zzdjz {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzfqc b;

    public /* synthetic */ di4(zzfqc zzfqcVar, int i) {
        this.a = i;
        this.b = zzfqcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public final void mo82zza(Object obj) {
        int i = this.a;
        zzfqc zzfqcVar = this.b;
        zzfqw zzfqwVar = (zzfqw) obj;
        switch (i) {
            case 0:
                zzfqwVar.f((zzfqp) zzfqcVar.a, zzfqcVar.b);
                break;
            case 1:
                zzfqwVar.n((zzfqp) zzfqcVar.a, zzfqcVar.b);
                break;
            default:
                zzfqwVar.H(zzfqcVar.b);
                break;
        }
    }
}
