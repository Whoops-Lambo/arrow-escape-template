package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class kd extends hs {
    public final hd a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hs)) {
            return false;
        }
        hs hsVar = (hs) obj;
        Object obj2 = gs.a;
        if (obj2.equals(obj2)) {
            return this.a.equals(((kd) hsVar).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ ((gs.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + gs.a + ", androidClientInfo=" + this.a + "}";
    }

    public kd(hd hdVar) {
        this.a = hdVar;
    }
}
