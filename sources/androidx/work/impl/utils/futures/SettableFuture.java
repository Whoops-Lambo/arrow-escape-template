package androidx.work.impl.utils.futures;

import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RestrictTo
public final class SettableFuture<V> extends AbstractFuture<V> {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = AbstractFuture.g;
        }
        if (!AbstractFuture.f.b(this, null, obj)) {
            return false;
        }
        AbstractFuture.c(this);
        return true;
    }

    public final boolean j(Throwable th) {
        if (!AbstractFuture.f.b(this, null, new AbstractFuture.Failure(th))) {
            return false;
        }
        AbstractFuture.c(this);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public final boolean k(ListenableFuture listenableFuture) {
        AbstractFuture.Failure failure;
        listenableFuture.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (AbstractFuture.f.b(this, null, AbstractFuture.f(listenableFuture))) {
                    AbstractFuture.c(this);
                    return true;
                }
            } else {
                AbstractFuture.SetFuture setFuture = new AbstractFuture.SetFuture(this, listenableFuture);
                if (AbstractFuture.f.b(this, null, setFuture)) {
                    try {
                        listenableFuture.addListener(setFuture, DirectExecutor.a);
                        return true;
                    } catch (Throwable th) {
                        try {
                            failure = new AbstractFuture.Failure(th);
                        } catch (Throwable unused) {
                            failure = AbstractFuture.Failure.b;
                        }
                        AbstractFuture.f.b(this, setFuture, failure);
                        return true;
                    }
                }
                obj = this.a;
                if (obj instanceof AbstractFuture.Cancellation) {
                    listenableFuture.cancel(((AbstractFuture.Cancellation) obj).a);
                }
            }
        } else if (obj instanceof AbstractFuture.Cancellation) {
            listenableFuture.cancel(((AbstractFuture.Cancellation) obj).a);
        }
        return false;
    }
}
