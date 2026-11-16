package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zt4 extends u12 {
    @Override // defpackage.u12
    public final void y(xt4 xt4Var, Set set) {
        synchronized (xt4Var) {
            try {
                if (xt4Var.h == null) {
                    xt4Var.h = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.u12
    public final int z(xt4 xt4Var) {
        int i;
        synchronized (xt4Var) {
            i = xt4Var.i - 1;
            xt4Var.i = i;
        }
        return i;
    }
}
