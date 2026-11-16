package androidx.work.impl.utils;

import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class SerialExecutorImpl implements SerialExecutor {
    public final Executor b;
    public Runnable c;
    public final ArrayDeque a = new ArrayDeque();
    public final Object d = new Object();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Task implements Runnable {
        public final SerialExecutorImpl a;
        public final Runnable b;

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.b.run();
                synchronized (this.a.d) {
                    this.a.a();
                }
            } catch (Throwable th) {
                synchronized (this.a.d) {
                    this.a.a();
                    throw th;
                }
            }
        }

        public Task(SerialExecutorImpl serialExecutorImpl, Runnable runnable) {
            this.a = serialExecutorImpl;
            this.b = runnable;
        }
    }

    public final void a() {
        Runnable runnable = (Runnable) this.a.poll();
        this.c = runnable;
        if (runnable != null) {
            this.b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.d) {
            try {
                this.a.add(new Task(this, runnable));
                if (this.c == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SerialExecutorImpl(Executor executor) {
        this.b = executor;
    }
}
