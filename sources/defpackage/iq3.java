package defpackage;

import com.google.android.gms.internal.ads.zzahp;
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzaij;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class iq3 implements zzahr {
    public final long a;
    public final /* synthetic */ zzaij b;

    @Override // com.google.android.gms.internal.ads.zzahr
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final zzahp a(long j) {
        zzaij zzaijVar = this.b;
        zzahp zzahpVarA = zzaijVar.i[0].a(j);
        int i = 1;
        while (true) {
            lq3[] lq3VarArr = zzaijVar.i;
            if (i >= lq3VarArr.length) {
                return zzahpVarA;
            }
            zzahp zzahpVarA2 = lq3VarArr[i].a(j);
            if (zzahpVarA2.a.b < zzahpVarA.a.b) {
                zzahpVarA = zzahpVarA2;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zza() {
        return this.a;
    }

    public iq3(zzaij zzaijVar, long j) {
        this.b = zzaijVar;
        this.a = j;
    }
}
