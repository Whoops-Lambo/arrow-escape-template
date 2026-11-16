package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzaii;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xp3 extends zzaii {
    public final String a;
    public final String b;

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
    public final String a() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaii)) {
            return false;
        }
        zzaii zzaiiVar = (zzaii) obj;
        String str = this.a;
        if (str == null) {
            if (zzaiiVar.b() != null) {
                return false;
            }
        } else if (!str.equals(zzaiiVar.b())) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            return zzaiiVar.a() == null;
        }
        return str2.equals(zzaiiVar.a());
    }

    public final String toString() {
        return n30.n("RecaptchaEnforcementState{provider=", this.a, ", enforcementState=", this.b, "}");
    }

    public xp3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
