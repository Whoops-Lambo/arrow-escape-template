package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c81 extends f91 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(c81.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final wr0 e;

    @Override // defpackage.f91
    public final boolean i() {
        return true;
    }

    @Override // defpackage.f91
    public final void j(Throwable th) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.invoke(th);
        }
    }

    public c81(wr0 wr0Var) {
        this.e = wr0Var;
    }
}
