package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class sd extends c00 {
    public final String a;
    public final String b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c00)) {
            return false;
        }
        sd sdVar = (sd) ((c00) obj);
        return this.a.equals(sdVar.a) && this.b.equals(sdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        return nj.q(sb, this.b, "}");
    }

    public sd(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
