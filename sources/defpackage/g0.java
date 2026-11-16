package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4664b4;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g0 extends rq0 implements Runnable {
    public static final /* synthetic */ int l = 0;
    public ListenableFuture i;
    public Class j;
    public Object k;

    public abstract Object r(Object obj, Throwable th);

    public abstract void s(Object obj);

    @Override // defpackage.c1
    public final void d() {
        ListenableFuture listenableFuture = this.i;
        if ((listenableFuture != null) & (this.a instanceof n0)) {
            listenableFuture.cancel(q());
        }
        this.i = null;
        this.j = null;
        this.k = null;
    }

    @Override // defpackage.c1
    public final String k() {
        String str;
        ListenableFuture listenableFuture = this.i;
        Class cls = this.j;
        Object obj = this.k;
        String strK = super.k();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strK != null) {
                return str.concat(strK);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + C4664b4.j.e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objB;
        ListenableFuture listenableFuture = this.i;
        Class cls = this.j;
        Object obj = this.k;
        if (((obj == null) || ((listenableFuture == null) | (cls == null))) || (this.a instanceof n0)) {
            return;
        }
        this.i = null;
        try {
            th = listenableFuture instanceof c1 ? ((c1) listenableFuture).p() : null;
            objB = th == null ? rs0.b(listenableFuture) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + listenableFuture.getClass() + " threw " + e.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            m(objB);
            return;
        }
        if (!cls.isInstance(th)) {
            o(listenableFuture);
            return;
        }
        try {
            Object objR = r(obj, th);
            this.j = null;
            this.k = null;
            s(objR);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                n(th2);
            } finally {
                this.j = null;
                this.k = null;
            }
        }
    }

    public g0(ListenableFuture listenableFuture, Class cls, Object obj) {
        listenableFuture.getClass();
        this.i = listenableFuture;
        this.j = cls;
        this.k = obj;
    }
}
