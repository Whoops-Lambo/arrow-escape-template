package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class p15 {
    public final Context a;
    public final ol2 b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p15)) {
            return false;
        }
        p15 p15Var = (p15) obj;
        if (!this.a.equals(p15Var.a)) {
            return false;
        }
        ol2 ol2Var = p15Var.b;
        ol2 ol2Var2 = this.b;
        if (ol2Var2 == null) {
            return ol2Var == null;
        }
        return ol2Var2.equals(ol2Var);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        ol2 ol2Var = this.b;
        return (ol2Var == null ? 0 : ol2Var.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        q63.y(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb.append("}");
        return sb.toString();
    }

    public p15(Context context, ol2 ol2Var) {
        this.a = context;
        this.b = ol2Var;
    }
}
