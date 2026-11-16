package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class py2 implements Comparable {
    public final short a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return s71.h(this.a & 65535, ((py2) obj).a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof py2) {
            return this.a == ((py2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 65535);
    }

    public /* synthetic */ py2(short s) {
        this.a = s;
    }
}
