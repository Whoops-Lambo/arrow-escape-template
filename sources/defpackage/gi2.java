package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class gi2 implements dy, ez {
    public final dy a;
    public final sy b;

    @Override // defpackage.ez
    public final ez getCallerFrame() {
        dy dyVar = this.a;
        if (dyVar instanceof ez) {
            return (ez) dyVar;
        }
        return null;
    }

    @Override // defpackage.dy
    public final sy getContext() {
        return this.b;
    }

    @Override // defpackage.dy
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }

    public gi2(dy dyVar, sy syVar) {
        this.a = dyVar;
        this.b = syVar;
    }
}
