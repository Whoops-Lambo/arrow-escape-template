package defpackage;

import com.google.android.gms.internal.ads.zzaxf;
import com.google.android.gms.internal.ads.zzhav;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lr4 extends zzhav implements Serializable {
    public final zzaxf a;

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Iterator it = ((Iterable) obj).iterator();
        Iterator it2 = ((Iterable) obj2).iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int iCompare = this.a.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lr4) {
            return this.a.equals(((lr4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 2075626741;
    }

    public final String toString() {
        return this.a.toString().concat(".lexicographical()");
    }

    public lr4(zzaxf zzaxfVar) {
        this.a = zzaxfVar;
    }
}
