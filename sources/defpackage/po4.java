package defpackage;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class po4 {
    public final String a;
    public final long b;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof po4) {
            po4 po4Var = (po4) obj;
            if (Objects.equal(this.a, po4Var.a) && Objects.equal(Long.valueOf(this.b), Long.valueOf(po4Var.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, Long.valueOf(this.b));
    }

    public po4(String str, long j) {
        this.a = str;
        this.b = j;
    }
}
