package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzahp;
import com.google.android.gms.internal.p002firebaseauthapi.zzain;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zp3 extends zzain {
    public final String b;
    public final String c;
    public final String e;
    public final String a = "apple.com";
    public final zzahp d = zzahp.ACCESS_TOKEN;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzain
    public final zzahp a() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzain
    public final String b() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzain
    public final String c() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzain
    public final String d() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzain
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzain)) {
            return false;
        }
        zzain zzainVar = (zzain) obj;
        if (!this.a.equals(zzainVar.c())) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (zzainVar.d() != null) {
                return false;
            }
        } else if (!str.equals(zzainVar.d())) {
            return false;
        }
        return this.c.equals(zzainVar.e()) && this.d.equals(zzainVar.a()) && this.e.equals(zzainVar.b());
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return this.e.hashCode() ^ ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.d);
        StringBuilder sbR = pv1.r("RevokeTokenRequest{providerId=", this.a, ", tenantId=", this.b, ", token=");
        q63.y(sbR, this.c, ", tokenType=", strValueOf, ", idToken=");
        return nj.q(sbR, this.e, "}");
    }

    public zp3(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.e = str3;
    }
}
