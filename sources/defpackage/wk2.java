package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class wk2 implements l92, se0 {
    public final l92 a;
    public final int b;
    public final int c;

    @Override // defpackage.se0
    public final l92 a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? jg0.a : new wk2(this.a, i3 + i, i2);
    }

    @Override // defpackage.se0
    public final l92 b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? this : new wk2(this.a, i3, i + i3);
    }

    @Override // defpackage.l92
    public final Iterator iterator() {
        return new st0(this);
    }

    public wk2(l92 l92Var, int i, int i2) {
        l92Var.getClass();
        this.a = l92Var;
        this.b = i;
        this.c = i2;
        if (i >= 0) {
            if (i2 >= 0) {
                if (i2 >= i) {
                    return;
                }
                ak1.n(nj.i(i2, i, "endIndex should be not less than startIndex, but was ", " < "));
                throw null;
            }
            ak1.n(pv1.k(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        ak1.n(pv1.k(i, "startIndex should be non-negative, but is "));
        throw null;
    }
}
