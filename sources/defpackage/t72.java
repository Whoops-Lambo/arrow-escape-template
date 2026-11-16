package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class t72 extends k0 implements ez {
    public final dy d;

    public t72(dy dyVar, sy syVar) {
        super(syVar, true);
        this.d = dyVar;
    }

    @Override // defpackage.o91
    public final boolean L() {
        return true;
    }

    public void d0() {
    }

    @Override // defpackage.ez
    public final ez getCallerFrame() {
        dy dyVar = this.d;
        if (dyVar instanceof ez) {
            return (ez) dyVar;
        }
        return null;
    }

    @Override // defpackage.o91
    public void i(Object obj) {
        l41.p(kc2.q(this.d), wz2.T(obj));
    }

    @Override // defpackage.o91
    public void l(Object obj) {
        this.d.resumeWith(wz2.T(obj));
    }
}
