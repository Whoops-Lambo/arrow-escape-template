package defpackage;

import com.google.android.gms.internal.ads.zzguk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class wo4 extends zzguk {
    public final int a;
    public final String b;
    public final int c;
    public final Boolean d;

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.d;
        return ((this.c ^ ((iHashCode ^ ((this.a ^ 1000003) * 1000003)) * 1000003)) * 1000003) ^ (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    public final int c() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    public final Boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzguk)) {
            return false;
        }
        zzguk zzgukVar = (zzguk) obj;
        if (this.a != zzgukVar.a()) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (zzgukVar.b() != null) {
                return false;
            }
        } else if (!str.equals(zzgukVar.b())) {
            return false;
        }
        if (this.c != zzgukVar.c()) {
            return false;
        }
        Boolean bool = this.d;
        if (bool == null) {
            return zzgukVar.d() == null;
        }
        return bool.equals(zzgukVar.d());
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        String str = this.b;
        int length2 = String.valueOf(str).length();
        int i2 = this.c;
        int length3 = String.valueOf(i2).length();
        Boolean bool = this.d;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 9 + length3 + 17 + String.valueOf(bool).length() + 1);
        rl3.m(i, "OverlayDisplayState{statusCode=", ", sessionToken=", str, sb);
        sb.append(", uiMode=");
        sb.append(i2);
        sb.append(", userInteracted=");
        sb.append(bool);
        sb.append("}");
        return sb.toString();
    }

    public /* synthetic */ wo4(int i, String str, int i2, Boolean bool) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = bool;
    }
}
