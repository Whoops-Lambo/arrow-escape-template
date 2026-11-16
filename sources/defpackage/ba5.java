package defpackage;

import com.google.android.gms.internal.measurement.zzadf;
import com.google.android.gms.internal.measurement.zzafc;
import com.google.android.gms.internal.measurement.zzve;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ba5 extends zzve {
    public final zzafc a;
    public final zzadf b;

    @Override // com.google.android.gms.internal.measurement.zzve
    public final zzafc a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.zzve
    public final zzadf b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzve)) {
            return false;
        }
        zzve zzveVar = (zzve) obj;
        return this.a.equals(zzveVar.a()) && this.b.equals(zzveVar.b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String string2 = this.b.toString();
        StringBuilder sb = new StringBuilder(length + 53 + string2.length() + 1);
        q63.y(sb, "ProtoSerializer{defaultValue=", string, ", extensionRegistryLite=", string2);
        sb.append("}");
        return sb.toString();
    }

    public ba5(zzafc zzafcVar, zzadf zzadfVar) {
        this.a = zzafcVar;
        if (zzadfVar != null) {
            this.b = zzadfVar;
        } else {
            d.w("Null extensionRegistryLite");
            throw null;
        }
    }
}
