package defpackage;

import com.google.android.gms.internal.play_billing.zzo;
import com.google.android.gms.internal.play_billing.zzp;
import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class s75 extends zzo {
    public final /* synthetic */ o85 h;

    public s75(o85 o85Var) {
        this.h = o85Var;
    }

    @Override // com.google.android.gms.internal.play_billing.zzo
    public final String b() {
        zzp zzpVar = (zzp) this.h.a.get();
        return zzpVar == null ? "Completer object has been garbage collected, future will fail soon" : pv1.n("tag=[", String.valueOf(zzpVar.a), C4664b4.j.e);
    }
}
