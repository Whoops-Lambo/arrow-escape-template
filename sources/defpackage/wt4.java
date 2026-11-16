package defpackage;

import com.google.android.gms.internal.ads.zzheh;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4664b4;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class wt4 extends gu4 implements Runnable {
    public static final /* synthetic */ int j = 0;
    public ListenableFuture h;
    public Object i;

    public abstract void u(Object obj);

    public abstract Object v(Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.zzhcz
    public final void g() {
        o(this.h);
        this.h = null;
        this.i = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhcz
    public final String h() {
        String strO;
        ListenableFuture listenableFuture = this.h;
        Object obj = this.i;
        String strH = super.h();
        if (listenableFuture != null) {
            String string = listenableFuture.toString();
            strO = jc1.o("inputFuture=[", string, new StringBuilder(string.length() + 16), "], ");
        } else {
            strO = "";
        }
        if (obj == null) {
            if (strH != null) {
                return strO.concat(strH);
            }
            return null;
        }
        int length = strO.length();
        String string2 = obj.toString();
        return pv1.p(new StringBuilder(string2.length() + length + 10 + 1), strO, "function=[", string2, C4664b4.j.e);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.h;
        Object obj = this.i;
        if ((isCancelled() | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.h = null;
        if (listenableFuture.isCancelled()) {
            n(listenableFuture);
            return;
        }
        try {
            try {
                Object objV = v(obj, zzheh.m(listenableFuture));
                this.i = null;
                u(objV);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    f(th);
                } finally {
                    this.i = null;
                }
            }
        } catch (Error e) {
            f(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            f(e2.getCause());
        } catch (Exception e3) {
            f(e3);
        }
    }

    public wt4(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.h = listenableFuture;
        this.i = obj;
    }
}
