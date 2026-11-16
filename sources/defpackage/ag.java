package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class ag extends aj2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final uf1 f;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aj2) {
            ag agVar = (ag) ((aj2) obj);
            return this.a.equals(agVar.a) && this.b.equals(agVar.b) && this.c.equals(agVar.c) && this.d.equals(agVar.d) && this.e == agVar.e && this.f == agVar.f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }

    public ag(String str, String str2, String str3, String str4, int i, uf1 uf1Var) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i;
                        this.f = uf1Var;
                        return;
                    }
                    d.w("Null installUuid");
                    throw null;
                }
                d.w("Null versionName");
                throw null;
            }
            d.w("Null versionCode");
            throw null;
        }
        d.w("Null appIdentifier");
        throw null;
    }
}
