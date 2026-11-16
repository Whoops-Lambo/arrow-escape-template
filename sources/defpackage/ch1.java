package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ch1 implements nl1 {
    public nl1[] a;

    @Override // defpackage.nl1
    public final ml1 a(Class cls) {
        for (nl1 nl1Var : this.a) {
            if (nl1Var.b(cls)) {
                return nl1Var.a(cls);
            }
        }
        d.u("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.nl1
    public final boolean b(Class cls) {
        for (nl1 nl1Var : this.a) {
            if (nl1Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
