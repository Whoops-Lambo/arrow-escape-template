package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yi2 extends n2 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.n2
    public final boolean a(m2 m2Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(qb5.c);
        return true;
    }

    @Override // defpackage.n2
    public final dy[] b(m2 m2Var) {
        this.a.set(null);
        return wz2.c;
    }
}
