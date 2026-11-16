package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class rg0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg0)) {
            return false;
        }
        return this.a.equals(((rg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return nj.q(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }

    public rg0(String str) {
        if (str != null) {
            this.a = str;
        } else {
            d.w("name is null");
            throw null;
        }
    }
}
