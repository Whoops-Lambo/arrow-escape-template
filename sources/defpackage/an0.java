package defpackage;

import java.io.File;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class an0 implements l92 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final xr0 d;

    public an0(l92 l92Var, wr0 wr0Var, wr0 wr0Var2) {
        l92Var.getClass();
        wr0Var.getClass();
        this.b = l92Var;
        this.c = wr0Var;
        this.d = wr0Var2;
    }

    @Override // defpackage.l92
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new ym0(this);
            default:
                return new en0(this);
        }
    }

    public an0(File file, bn0 bn0Var, dn0 dn0Var) {
        this.b = file;
        this.c = bn0Var;
        this.d = dn0Var;
    }
}
