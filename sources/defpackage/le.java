package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class le extends o00 {
    public final String a;
    public final int b;
    public final List c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00) {
            le leVar = (le) ((o00) obj);
            if (this.a.equals(leVar.a) && this.b == leVar.b && this.c.equals(leVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }

    public le(int i, String str, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }
}
