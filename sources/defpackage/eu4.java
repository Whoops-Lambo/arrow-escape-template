package defpackage;

import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class eu4 extends xt4 {
    public du4 p;

    @Override // defpackage.xt4
    public final void s(int i) {
        this.l = null;
        if (i == 1) {
            this.p = null;
        }
    }

    @Override // defpackage.xt4
    public final void y(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcz
    public final void l() {
        du4 du4Var = this.p;
        if (du4Var != null) {
            du4Var.x();
        }
    }

    @Override // defpackage.xt4
    public final void z() {
        du4 du4Var = this.p;
        if (du4Var != null) {
            try {
                du4Var.f.execute(du4Var);
            } catch (RejectedExecutionException e) {
                du4Var.g.f(e);
            }
        }
    }
}
