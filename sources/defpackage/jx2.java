package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class jx2 extends au2 {
    public final String a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jx2) && s71.b(this.a, ((jx2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return pv1.n("UCSectionTitlePM(title=", this.a, ")");
    }

    public jx2(String str) {
        str.getClass();
        this.a = str;
    }
}
