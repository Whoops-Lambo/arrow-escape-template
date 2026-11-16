package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class du4 extends q71 {
    public final Executor f;
    public final /* synthetic */ eu4 g;
    public final Callable h;
    public final /* synthetic */ eu4 i;

    @Override // defpackage.q71
    public final void r(Throwable th) {
        eu4 eu4Var = this.g;
        eu4Var.p = null;
        if (th instanceof ExecutionException) {
            eu4Var.f(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            eu4Var.cancel(false);
        } else {
            eu4Var.f(th);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du4(eu4 eu4Var, Callable callable, Executor executor) {
        super(1);
        this.i = eu4Var;
        this.g = eu4Var;
        executor.getClass();
        this.f = executor;
        this.h = callable;
    }

    @Override // defpackage.q71
    public final Object j() {
        return this.h.call();
    }

    @Override // defpackage.q71
    public final String n() {
        return this.h.toString();
    }

    @Override // defpackage.q71
    public final boolean o() {
        return this.g.isDone();
    }

    @Override // defpackage.q71
    public final void q(Object obj) {
        this.g.p = null;
        this.i.e(obj);
    }
}
