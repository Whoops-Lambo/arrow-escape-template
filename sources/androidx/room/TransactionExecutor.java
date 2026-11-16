package androidx.room;

import defpackage.ok2;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/TransactionExecutor;", "Ljava/util/concurrent/Executor;", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TransactionExecutor implements Executor {
    public final Executor a;
    public final ArrayDeque b;
    public Runnable c;
    public final Object d;

    public final void a() {
        synchronized (this.d) {
            Object objPoll = this.b.poll();
            Runnable runnable = (Runnable) objPoll;
            this.c = runnable;
            if (objPoll != null) {
                this.a.execute(runnable);
            }
        }
    }

    public TransactionExecutor(Executor executor) {
        executor.getClass();
        this.a = executor;
        this.b = new ArrayDeque();
        this.d = new Object();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.d) {
            this.b.offer(new ok2(3, runnable, this));
            if (this.c == null) {
                a();
            }
        }
    }
}
