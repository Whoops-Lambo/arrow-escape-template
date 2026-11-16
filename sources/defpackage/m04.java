package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m04 {
    public final String a;
    public final Status b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m04)) {
            return false;
        }
        m04 m04Var = (m04) obj;
        return Objects.equal(this.b, m04Var.b) && Objects.equal(this.a, m04Var.a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, this.a);
    }

    public m04(Status status, String str) {
        this.b = status;
        this.a = str;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("status", this.b).add("gameRunToken", this.a).toString();
    }
}
