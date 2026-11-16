package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4664b4;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q2 extends rq0 implements Runnable {
    public static final /* synthetic */ int k = 0;
    public ListenableFuture i;
    public Object j;

    public abstract Object r(Object obj, Object obj2);

    public abstract void s(Object obj);

    @Override // defpackage.c1
    public final void d() {
        ListenableFuture listenableFuture = this.i;
        if ((listenableFuture != null) & (this.a instanceof n0)) {
            listenableFuture.cancel(q());
        }
        this.i = null;
        this.j = null;
    }

    @Override // defpackage.c1
    public final String k() {
        String str;
        ListenableFuture listenableFuture = this.i;
        Object obj = this.j;
        String strK = super.k();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strK != null) {
                return str.concat(strK);
            }
            return null;
        }
        return str + "function=[" + obj + C4664b4.j.e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.i;
        Object obj = this.j;
        if (((this.a instanceof n0) | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.i = null;
        if (listenableFuture.isCancelled()) {
            o(listenableFuture);
            return;
        }
        try {
            try {
                Object objR = r(obj, rs0.b(listenableFuture));
                this.j = null;
                s(objR);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    n(th);
                } finally {
                    this.j = null;
                }
            }
        } catch (Error e) {
            n(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            n(e2.getCause());
        } catch (Exception e3) {
            n(e3);
        }
    }

    public q2(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.i = listenableFuture;
        obj.getClass();
        this.j = obj;
    }
}
