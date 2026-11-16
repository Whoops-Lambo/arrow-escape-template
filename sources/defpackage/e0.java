package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends g0 {
    @Override // defpackage.g0
    public final Object r(Object obj, Throwable th) {
        w8 w8Var = (w8) obj;
        ListenableFuture listenableFutureApply = w8Var.apply(th);
        fs1.j(listenableFutureApply, w8Var, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s");
        return listenableFutureApply;
    }

    @Override // defpackage.g0
    public final void s(Object obj) {
        o((ListenableFuture) obj);
    }
}
