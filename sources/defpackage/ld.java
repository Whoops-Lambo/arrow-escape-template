package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ld extends nv {
    public final hf a;

    public ld(hf hfVar) {
        mv mvVar = mv.a;
        this.a = hfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nv)) {
            return false;
        }
        if (!this.a.equals(((ld) ((nv) obj)).a)) {
            return false;
        }
        Object obj2 = mv.a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ mv.a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + mv.a + "}";
    }
}
