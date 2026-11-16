package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ix implements l92 {
    public final AtomicReference a;

    @Override // defpackage.l92
    public final Iterator iterator() {
        l92 l92Var = (l92) this.a.getAndSet(null);
        if (l92Var != null) {
            return l92Var.iterator();
        }
        e32.i("This sequence can be consumed only once.");
        return null;
    }

    public ix(l92 l92Var) {
        this.a = new AtomicReference(l92Var);
    }
}
