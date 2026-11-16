package defpackage;

import com.google.android.gms.internal.ads.o;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbiw;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class dj0 implements zzbip {
    public static final dj0 c = new dj0(false, 0 == true ? 1 : 0);
    public final boolean a;
    public final int b;

    public /* synthetic */ dj0(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public void a(zzbiw.zzt.zza zzaVar) {
        int i = o.d0;
        zzbiw.zzbl.zza zzaVarF = zzbiw.zzbl.F();
        boolean zE = ((zzbiw.zzbl) zzaVarF.b).E();
        boolean z = this.a;
        if (zE != z) {
            zzaVarF.l();
            ((zzbiw.zzbl) zzaVarF.b).G(z);
        }
        zzaVarF.l();
        ((zzbiw.zzbl) zzaVarF.b).H(this.b);
        zzbiw.zzbl zzblVar = (zzbiw.zzbl) zzaVarF.m();
        zzaVar.l();
        ((zzbiw.zzt) zzaVar.b).O(zzblVar);
    }
}
