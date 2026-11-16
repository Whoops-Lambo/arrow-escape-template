package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class p7 {
    public final String a;
    public final String b;
    public final String c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7)) {
            return false;
        }
        p7 p7Var = (p7) obj;
        return this.a.equals(p7Var.a) && this.b.equals(p7Var.b) && this.c.equals(p7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + n30.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CloudBridgeCredentials(datasetID=");
        sb.append(this.a);
        sb.append(", cloudBridgeURL=");
        sb.append(this.b);
        sb.append(", accessKey=");
        return jc1.q(sb, this.c, ')');
    }

    public p7(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
