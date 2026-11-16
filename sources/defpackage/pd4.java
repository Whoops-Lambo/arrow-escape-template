package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class pd4 {
    public final String a;
    public final String b;
    public final Drawable c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pd4) {
            pd4 pd4Var = (pd4) obj;
            String str = pd4Var.a;
            String str2 = this.a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.b.equals(pd4Var.b)) {
                    Drawable drawable = pd4Var.c;
                    Drawable drawable2 = this.c;
                    if (drawable2 != null ? drawable2.equals(drawable) : drawable == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
        Drawable drawable = this.c;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String str = this.a;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str2.length() + length + 42 + 7 + length2 + 1);
        q63.y(sb, "OfflineAdAssets{advertiserName=", str, ", imageUrl=", str2);
        return jc1.o(", icon=", strValueOf, sb, "}");
    }

    public pd4(String str, String str2, Drawable drawable) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
            this.c = drawable;
        } else {
            d.w("Null imageUrl");
            throw null;
        }
    }
}
