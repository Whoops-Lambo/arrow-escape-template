package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ye extends y00 {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y00) {
            ye yeVar = (ye) ((y00) obj);
            if (this.a == yeVar.a && this.b.equals(yeVar.b) && this.c.equals(yeVar.c) && this.d == yeVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d ? 1231 : 1237) ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", buildVersion=");
        sb.append(this.c);
        sb.append(", jailbroken=");
        return h50.n(sb, this.d, "}");
    }

    public ye(int i, String str, boolean z, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }
}
