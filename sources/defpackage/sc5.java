package defpackage;

import com.google.android.gms.internal.measurement.zzabr;
import com.google.android.gms.internal.measurement.zzyd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class sc5 implements zzyd {
    public final zzyd a;
    public final Object b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof sc5)) {
            return false;
        }
        sc5 sc5Var = (sc5) obj;
        return this.a.equals(sc5Var.a) && this.b.equals(sc5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String string2 = this.b.toString();
        StringBuilder sb = new StringBuilder(length + 47 + string2.length() + 3);
        q63.y(sb, "SpecializedLogSiteKey{ delegate='", string, "', qualifier='", string2);
        sb.append("' }");
        return sb.toString();
    }

    public sc5(zzyd zzydVar, Object obj) {
        zzabr.a(zzydVar, "log site key");
        this.a = zzydVar;
        zzabr.a(obj, "log site qualifier");
        this.b = obj;
    }
}
