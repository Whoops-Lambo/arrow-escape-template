package defpackage;

import com.ironsource.C4664b4;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class rr2 extends rq0 implements RunnableFuture {
    public volatile q71 i;

    @Override // defpackage.c1
    public final String k() {
        q71 q71Var = this.i;
        if (q71Var == null) {
            return super.k();
        }
        return "task=[" + q71Var + C4664b4.j.e;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        q71 q71Var = this.i;
        if (q71Var != null) {
            q71Var.run();
        }
        this.i = null;
    }

    public rr2(Callable callable) {
        this.i = new qr2(this, callable);
    }

    @Override // defpackage.c1
    public final void d() {
        q71 q71Var;
        if (q() && (q71Var = this.i) != null) {
            q71Var.d();
        }
        this.i = null;
    }
}
