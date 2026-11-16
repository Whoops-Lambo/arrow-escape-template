package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class db5 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != db5.class) {
            return false;
        }
        db5 db5Var = (db5) obj;
        return TextUtils.equals(this.a, db5Var.a) && this.b == db5Var.b && this.c == db5Var.c;
    }

    public final int hashCode() {
        return pv1.c(this.a.hashCode() + 31, 31, true != this.b ? 1237 : 1231, 31) + (true != this.c ? 1237 : 1231);
    }

    public db5(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }
}
