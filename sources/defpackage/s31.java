package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class s31 implements Serializable {
    public final Comparator a;
    public final Object[] b;

    public Object readResolve() {
        r31 r31Var = new r31(this.a);
        r31Var.b(this.b);
        return r31Var.j();
    }

    public s31(Comparator comparator, Object[] objArr) {
        this.a = comparator;
        this.b = objArr;
    }
}
