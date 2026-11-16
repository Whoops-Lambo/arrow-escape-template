package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class se extends t00 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t00)) {
            return false;
        }
        return this.a.equals(((se) ((t00) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return nj.q(new StringBuilder("Log{content="), this.a, "}");
    }

    public se(String str) {
        this.a = str;
    }
}
