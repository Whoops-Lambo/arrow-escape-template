package defpackage;

import com.google.android.gms.internal.ads.zzhav;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class pq4 extends zzhav implements Serializable {
    public final xm4 a = xm4.h;
    public final zzhav b;

    public pq4(zzhav zzhavVar) {
        this.b = zzhavVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        xm4 xm4Var = this.a;
        return this.b.compare(xm4Var.apply(obj), xm4Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pq4)) {
            return false;
        }
        pq4 pq4Var = (pq4) obj;
        return this.a.equals(pq4Var.a) && this.b.equals(pq4Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        String string = this.b.toString();
        int length = string.length();
        String string2 = this.a.toString();
        return pv1.p(new StringBuilder(length + 12 + string2.length() + 1), string, ".onResultOf(", string2, ")");
    }
}
