package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ar2 implements l92 {
    public final l92 a;
    public final wr0 b;

    @Override // defpackage.l92
    public final Iterator iterator() {
        return new cb0(this);
    }

    public ar2(l92 l92Var, wr0 wr0Var) {
        l92Var.getClass();
        this.a = l92Var;
        this.b = wr0Var;
    }
}
