package defpackage;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n71 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof n71) {
            return Objects.equal(this.a, ((n71) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public n71(String str) {
        this.a = str;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("token", this.a).toString();
    }
}
