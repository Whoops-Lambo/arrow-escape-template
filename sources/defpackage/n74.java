package defpackage;

import com.google.android.gms.internal.play_billing.zzdc;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n74 implements zzdc {
    public static final ld1 b = new ld1(1, n74.class);
    public final Object a;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdc
    public final void a(Runnable runnable, Executor executor) {
        if (executor == null) {
            d.w("Executor was null.");
            return;
        }
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            b.b().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", pv1.o("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    public n74(Object obj) {
        this.a = obj;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a;
    }

    public final String toString() {
        return pv1.w(super.toString(), "[status=SUCCESS, result=[", this.a.toString(), "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.a;
    }
}
