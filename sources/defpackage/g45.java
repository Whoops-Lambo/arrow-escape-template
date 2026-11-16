package defpackage;

import com.google.android.gms.internal.measurement.zznd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class g45 {
    public final zznd a;
    public final m12 b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g45) {
            g45 g45Var = (g45) obj;
            zznd zzndVar = g45Var.a;
            zznd zzndVar2 = this.a;
            if (zzndVar2 != null ? zzndVar2 == zzndVar : zzndVar == null) {
                return this.b == g45Var.b;
            }
        }
        return false;
    }

    public final int hashCode() {
        zznd zzndVar = this.a;
        return this.b.hashCode() ^ (((zzndVar == null ? 0 : zzndVar.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String string = this.b.toString();
        StringBuilder sb = new StringBuilder(strValueOf.length() + 52 + string.length() + 1);
        q63.y(sb, "SnapshotBlobAndResult{snapshotBlob=", strValueOf, ", snapshotResult=", string);
        sb.append("}");
        return sb.toString();
    }

    public g45(zznd zzndVar, m12 m12Var) {
        this.a = zzndVar;
        this.b = m12Var;
    }
}
