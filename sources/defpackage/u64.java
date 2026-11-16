package defpackage;

import com.google.android.gms.internal.fido.zzcs;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class u64 extends zzcs implements Serializable {
    public final zzcs a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // com.google.android.gms.internal.fido.zzcs
    public final zzcs d() {
        return this.a;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u64) {
            return this.a.equals(((u64) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }

    public u64(zzcs zzcsVar) {
        this.a = zzcsVar;
    }
}
