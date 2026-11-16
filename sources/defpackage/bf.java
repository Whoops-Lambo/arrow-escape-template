package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class bf {
    public final Object a;
    public final xy1 b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bf)) {
            return false;
        }
        bf bfVar = (bf) obj;
        return this.a.equals(bfVar.a) && this.b.equals(bfVar.b);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + ", productData=null, eventContext=null}";
    }

    public bf(Object obj, xy1 xy1Var) {
        if (obj != null) {
            this.a = obj;
            this.b = xy1Var;
        } else {
            d.w("Null payload");
            throw null;
        }
    }

    public final int hashCode() {
        return (this.b.hashCode() ^ (((1000003 * 1000003) ^ this.a.hashCode()) * 1000003)) * (-721379959);
    }
}
