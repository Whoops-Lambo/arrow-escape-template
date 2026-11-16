package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class x12 extends y12 implements Serializable {
    @Override // defpackage.y12
    public final int f(int i, int i2) {
        throw null;
    }

    @Override // defpackage.y12
    public final long i() {
        throw null;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return w12.a;
    }

    @Override // defpackage.y12
    public final int a(int i) {
        return y12.b.a(i);
    }

    @Override // defpackage.y12
    public final int d() {
        return y12.b.d();
    }

    @Override // defpackage.y12
    public final long g() {
        return y12.b.g();
    }

    @Override // defpackage.y12
    public final long h(long j, long j2) {
        return y12.b.h(0L, 1000L);
    }
}
