package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class td extends e00 {
    public final List a;
    public final String b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e00)) {
            return false;
        }
        td tdVar = (td) ((e00) obj);
        if (!this.a.equals(tdVar.a)) {
            return false;
        }
        String str = tdVar.b;
        String str2 = this.b;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return nj.q(sb, this.b, "}");
    }

    public td(List list, String str) {
        this.a = list;
        this.b = str;
    }
}
