package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ze extends z00 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z00)) {
            return false;
        }
        return this.a.equals(((ze) ((z00) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return nj.q(new StringBuilder("User{identifier="), this.a, "}");
    }

    public ze(String str) {
        this.a = str;
    }
}
