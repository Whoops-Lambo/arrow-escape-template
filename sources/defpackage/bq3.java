package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.MultiFactor;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzbl;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class bq3 extends MultiFactor {
    public final zzad a;

    @Override // com.google.firebase.auth.MultiFactor
    public final ArrayList a() {
        zzbl zzblVar = this.a.l;
        if (zzblVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = zzblVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add((PhoneMultiFactorInfo) it.next());
        }
        Iterator it2 = zzblVar.b.iterator();
        while (it2.hasNext()) {
            arrayList.add((TotpMultiFactorInfo) it2.next());
        }
        return arrayList;
    }

    public bq3(zzad zzadVar) {
        Preconditions.checkNotNull(zzadVar);
        this.a = zzadVar;
    }
}
