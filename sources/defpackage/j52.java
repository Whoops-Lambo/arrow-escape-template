package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class j52 implements Serializable {
    public final Throwable a;

    public final boolean equals(Object obj) {
        if (obj instanceof j52) {
            return s71.b(this.a, ((j52) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ')';
    }

    public j52(Throwable th) {
        th.getClass();
        this.a = th;
    }
}
