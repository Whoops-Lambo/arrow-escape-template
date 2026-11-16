package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class nd extends b10 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final a10 k;
    public final e00 l;
    public final b00 m;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b10) {
            nd ndVar = (nd) ((b10) obj);
            if (this.b.equals(ndVar.b) && this.c.equals(ndVar.c) && this.d == ndVar.d && this.e.equals(ndVar.e)) {
                String str = ndVar.f;
                String str2 = this.f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = ndVar.g;
                    String str4 = this.g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = ndVar.h;
                        String str6 = this.h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.i.equals(ndVar.i) && this.j.equals(ndVar.j)) {
                                a10 a10Var = ndVar.k;
                                a10 a10Var2 = this.k;
                                if (a10Var2 != null ? a10Var2.equals(a10Var) : a10Var == null) {
                                    e00 e00Var = ndVar.l;
                                    e00 e00Var2 = this.l;
                                    if (e00Var2 != null ? e00Var2.equals(e00Var) : e00Var == null) {
                                        b00 b00Var = ndVar.m;
                                        b00 b00Var2 = this.m;
                                        if (b00Var2 != null ? b00Var2.equals(b00Var) : b00Var == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final md a() {
        md mdVar = new md();
        mdVar.a = this.b;
        mdVar.b = this.c;
        mdVar.c = this.d;
        mdVar.d = this.e;
        mdVar.e = this.f;
        mdVar.f = this.g;
        mdVar.g = this.h;
        mdVar.h = this.i;
        mdVar.i = this.j;
        mdVar.j = this.k;
        mdVar.k = this.l;
        mdVar.l = this.m;
        mdVar.m = (byte) 1;
        return mdVar;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        a10 a10Var = this.k;
        int iHashCode5 = (iHashCode4 ^ (a10Var == null ? 0 : a10Var.hashCode())) * 1000003;
        e00 e00Var = this.l;
        int iHashCode6 = (iHashCode5 ^ (e00Var == null ? 0 : e00Var.hashCode())) * 1000003;
        b00 b00Var = this.m;
        return iHashCode6 ^ (b00Var != null ? b00Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }

    public nd(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, a10 a10Var, e00 e00Var, b00 b00Var) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = a10Var;
        this.l = e00Var;
        this.m = b00Var;
    }
}
