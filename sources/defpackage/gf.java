package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gf extends qk0 {
    public final Integer a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qk0)) {
            return false;
        }
        Integer num = this.a;
        gf gfVar = (gf) ((qk0) obj);
        if (num == null) {
            return gfVar.a == null;
        }
        return num.equals(gfVar.a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }

    public gf(Integer num) {
        this.a = num;
    }
}
