package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ag0 implements v51 {
    public final boolean a;

    @Override // defpackage.v51
    public final br1 b() {
        return null;
    }

    @Override // defpackage.v51
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        return jc1.q(new StringBuilder("Empty{"), this.a ? "Active" : "New", '}');
    }

    public ag0(boolean z) {
        this.a = z;
    }
}
