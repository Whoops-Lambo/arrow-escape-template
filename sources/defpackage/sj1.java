package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class sj1 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == sj1.class) {
            sj1 sj1Var = (sj1) obj;
            if (TextUtils.equals(this.a, sj1Var.a) && this.b == sj1Var.b && this.c == sj1Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((n30.c(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }

    public sj1(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }
}
