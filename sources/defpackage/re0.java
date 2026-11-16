package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class re0 implements l92, se0 {
    public final /* synthetic */ int a;
    public final l92 b;
    public final int c;

    public re0(l92 l92Var, int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = l92Var;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                ak1.n(n30.k("count must be non-negative, but was ", i, '.'));
                throw null;
            default:
                l92Var.getClass();
                this.b = l92Var;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                ak1.n(n30.k("count must be non-negative, but was ", i, '.'));
                throw null;
        }
    }

    @Override // defpackage.se0
    public final l92 a(int i) {
        int i2 = this.a;
        l92 l92Var = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new re0(this, i, 0) : new re0(l92Var, i4, 0);
            default:
                return i >= i3 ? jg0.a : new wk2(l92Var, i, i3);
        }
    }

    @Override // defpackage.se0
    public final l92 b(int i) {
        int i2 = this.a;
        l92 l92Var = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new re0(this, i, 1) : new wk2(l92Var, i3, i4);
            default:
                return i >= i3 ? this : new re0(l92Var, i, 1);
        }
    }

    @Override // defpackage.l92
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new qe0(this);
            default:
                return new qe0(this, (byte) 0);
        }
    }
}
