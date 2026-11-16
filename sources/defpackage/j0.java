package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j0 implements KSerializer {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    public abstract void f(hw hwVar, int i, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);

    @Override // kotlinx.serialization.KSerializer
    public Object deserialize(Decoder decoder) {
        return e(decoder);
    }

    public final Object e(Decoder decoder) {
        Object objA = a();
        int iB = b(objA);
        hw hwVarB = decoder.b(getDescriptor());
        while (true) {
            int iT = hwVarB.t(getDescriptor());
            if (iT != -1) {
                f(hwVarB, iT + iB, objA);
            } else {
                hwVarB.c(getDescriptor());
                return h(objA);
            }
        }
    }
}
