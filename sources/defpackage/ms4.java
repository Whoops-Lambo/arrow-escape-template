package defpackage;

import com.google.android.gms.internal.ads.zzgwz;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ms4 extends zzgwz {
    public final Iterator c;
    public final /* synthetic */ Set d;
    public final /* synthetic */ Set e;

    public ms4(ns4 ns4Var, Set set, Set set2) {
        this.d = set;
        this.e = set2;
        this.c = set.iterator();
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final Object a() {
        Object next;
        do {
            Iterator it = this.c;
            if (!it.hasNext()) {
                this.b = 3;
                return null;
            }
            next = it.next();
        } while (!this.e.contains(next));
        return next;
    }
}
