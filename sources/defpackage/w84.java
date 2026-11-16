package defpackage;

import com.google.android.gms.internal.auth.zzdj;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class w84 implements Serializable, zzdj {
    public final Object a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof w84)) {
            return false;
        }
        Object obj2 = ((w84) obj).a;
        Object obj3 = this.a;
        return obj3 == obj2 || obj3.equals(obj2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return pv1.n("Suppliers.ofInstance(", this.a.toString(), ")");
    }

    public w84(Object obj) {
        this.a = obj;
    }
}
