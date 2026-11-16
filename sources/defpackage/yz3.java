package defpackage;

import com.google.android.gms.internal.fido.zzbk;
import com.google.android.gms.internal.fido.zzbp;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yz3 implements Serializable, zzbp {
    public final Object a;

    public final boolean equals(Object obj) {
        if (obj instanceof yz3) {
            return zzbk.a(this.a, ((yz3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return pv1.n("Suppliers.ofInstance(", this.a.toString(), ")");
    }

    public yz3(Object obj) {
        this.a = obj;
    }
}
