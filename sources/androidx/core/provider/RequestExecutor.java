package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.Consumer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
class RequestExecutor {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class DefaultThreadFactory implements ThreadFactory {
        public String a;
        public int b;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class ProcessPriorityThread extends Thread {
            public final int a;

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(this.a);
                super.run();
            }

            public ProcessPriorityThread(int i, String str, Runnable runnable) {
                super(runnable, str);
                this.a = i;
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new ProcessPriorityThread(this.b, this.a, runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ReplyRunnable<T> implements Runnable {
        public Callable a;
        public Consumer b;
        public Handler c;

        @Override // java.lang.Runnable
        public final void run() {
            final Object objCall;
            try {
                objCall = ((FontRequestWorker.AnonymousClass3) this.a).call();
            } catch (Exception unused) {
                objCall = null;
            }
            final Consumer consumer = this.b;
            this.c.post(new Runnable() { // from class: androidx.core.provider.RequestExecutor.ReplyRunnable.1
                @Override // java.lang.Runnable
                public final void run() {
                    consumer.accept(objCall);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class HandlerExecutor implements Executor {
        public final Handler a;

        public HandlerExecutor(Handler handler) {
            this.a = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.getClass();
            Handler handler = this.a;
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(handler + " is shutting down");
        }
    }
}
