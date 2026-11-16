package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jf {
    public final String a;
    public final ArrayList b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jf)) {
            return false;
        }
        jf jfVar = (jf) obj;
        return this.a.equals(jfVar.a) && this.b.equals(jfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }

    public jf(String str, ArrayList arrayList) {
        if (str != null) {
            this.a = str;
            this.b = arrayList;
        } else {
            d.w("Null userAgent");
            throw null;
        }
    }
}
