package defpackage;

import com.google.firebase.auth.internal.zzh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n15 extends zzh {
    public final String a;
    public final String b;
    public final String c;

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        return iHashCode2 ^ (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.firebase.auth.internal.zzh
    public final String a() {
        return this.b;
    }

    @Override // com.google.firebase.auth.internal.zzh
    public final String b() {
        return this.c;
    }

    @Override // com.google.firebase.auth.internal.zzh
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        String str = this.a;
        if (str == null) {
            if (zzhVar.c() != null) {
                return false;
            }
        } else if (!str.equals(zzhVar.c())) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            if (zzhVar.a() != null) {
                return false;
            }
        } else if (!str2.equals(zzhVar.a())) {
            return false;
        }
        String str3 = this.c;
        if (str3 == null) {
            return zzhVar.b() == null;
        }
        return str3.equals(zzhVar.b());
    }

    public final String toString() {
        return nj.q(pv1.r("AttestationResult{recaptchaV2Token=", this.a, ", playIntegrityToken=", this.b, ", recaptchaEnterpriseToken="), this.c, "}");
    }

    public n15(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
