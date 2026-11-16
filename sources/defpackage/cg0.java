package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class cg0 implements sy, Serializable {
    public static final cg0 a = new cg0();

    @Override // defpackage.sy
    public final Object fold(Object obj, zr0 zr0Var) {
        return obj;
    }

    public final int hashCode() {
        return 0;
    }

    private final Object readResolve() {
        return a;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.sy
    public final qy get(ry ryVar) {
        ryVar.getClass();
        return null;
    }

    @Override // defpackage.sy
    public final sy minusKey(ry ryVar) {
        ryVar.getClass();
        return this;
    }

    @Override // defpackage.sy
    public final sy plus(sy syVar) {
        syVar.getClass();
        return syVar;
    }
}
