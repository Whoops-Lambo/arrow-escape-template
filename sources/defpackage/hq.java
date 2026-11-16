package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hq extends iq {
    public final Throwable a;

    public final boolean equals(Object obj) {
        if (obj instanceof hq) {
            return s71.b(this.a, ((hq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.iq
    public final String toString() {
        return "Closed(" + this.a + ')';
    }

    public hq(Throwable th) {
        this.a = th;
    }
}
