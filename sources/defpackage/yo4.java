package defpackage;

import com.google.android.gms.internal.ads.zzgun;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yo4 extends zzgun {
    public final String a;
    public final String b;

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgun
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgun
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgun)) {
            return false;
        }
        zzgun zzgunVar = (zzgun) obj;
        String str = this.a;
        if (str == null) {
            if (zzgunVar.a() != null) {
                return false;
            }
        } else if (!str.equals(zzgunVar.a())) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            return zzgunVar.b() == null;
        }
        return str2.equals(zzgunVar.b());
    }

    public final String toString() {
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 49 + String.valueOf(str2).length() + 1);
        q63.y(sb, "OverlayDisplayUpdateRequest{sessionToken=", str, ", appId=", str2);
        sb.append("}");
        return sb.toString();
    }

    public /* synthetic */ yo4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
