package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jq {
    public static final iq b = new iq();
    public final Object a;

    public static final Object a(Object obj) {
        if (obj instanceof iq) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jq) {
            return s71.b(this.a, ((jq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof hq) {
            return ((hq) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public /* synthetic */ jq(Object obj) {
        this.a = obj;
    }
}
