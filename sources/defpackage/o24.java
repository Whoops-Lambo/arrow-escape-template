package defpackage;

import com.google.android.gms.internal.ads.zzhdc;
import com.ironsource.C4664b4;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class o24 extends zzhdc {
    public final /* synthetic */ int a = 0;
    public final Executor b;

    public o24(ExecutorService executorService) {
        executorService.getClass();
        this.b = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.b).awaitTermination(j, timeUnit);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                this.b.execute(runnable);
                break;
            default:
                ((ExecutorService) this.b).execute(runnable);
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.b).isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.b).isTerminated();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((ExecutorService) this.b).shutdown();
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.b).shutdownNow();
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                ExecutorService executorService = (ExecutorService) this.b;
                String string = super.toString();
                String strValueOf = String.valueOf(executorService);
                return pv1.p(new StringBuilder(h50.d(String.valueOf(string).length(), 1, strValueOf.length(), 1)), string, C4664b4.j.d, strValueOf, C4664b4.j.e);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ o24(Executor executor) {
        this.b = executor;
    }
}
