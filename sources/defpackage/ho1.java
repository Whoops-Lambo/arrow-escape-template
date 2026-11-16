package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ho1 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ ListenableFuture c;

    public /* synthetic */ ho1(Executor executor, ListenableFuture listenableFuture, int i) {
        this.a = i;
        this.b = executor;
        this.c = listenableFuture;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        ListenableFuture listenableFuture = this.c;
        Executor executor = this.b;
        switch (i) {
            case 0:
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e) {
                    ((rq0) listenableFuture).n(e);
                    return;
                }
                break;
            default:
                gu4 gu4Var = (gu4) listenableFuture;
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e2) {
                    gu4Var.f(e2);
                }
                break;
        }
    }
}
