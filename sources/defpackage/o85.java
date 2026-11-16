package defpackage;

import com.google.android.gms.internal.play_billing.zzdc;
import com.google.android.gms.internal.play_billing.zzp;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class o85 implements zzdc {
    public final WeakReference a;
    public final s75 b = new s75(this);

    @Override // com.google.android.gms.internal.play_billing.zzdc
    public final void a(Runnable runnable, Executor executor) {
        this.b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zzp zzpVar = (zzp) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (!zCancel || zzpVar == null) {
            return zCancel;
        }
        zzpVar.a = null;
        zzpVar.b = null;
        zzpVar.c.h(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof mb4;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    public o85(zzp zzpVar) {
        this.a = new WeakReference(zzpVar);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
