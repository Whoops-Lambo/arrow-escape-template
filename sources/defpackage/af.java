package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class af extends i20 {
    public final Context a;
    public final os b;
    public final os c;
    public final String d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i20) {
            af afVar = (af) ((i20) obj);
            if (this.a.equals(afVar.a) && this.b.equals(afVar.b) && this.c.equals(afVar.c) && this.d.equals(afVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return nj.q(sb, this.d, "}");
    }

    public af(Context context, os osVar, os osVar2, String str) {
        if (context != null) {
            this.a = context;
            if (osVar != null) {
                this.b = osVar;
                if (osVar2 != null) {
                    this.c = osVar2;
                    if (str != null) {
                        this.d = str;
                        return;
                    } else {
                        d.w("Null backendName");
                        throw null;
                    }
                }
                d.w("Null monotonicClock");
                throw null;
            }
            d.w("Null wallClock");
            throw null;
        }
        d.w("Null applicationContext");
        throw null;
    }
}
