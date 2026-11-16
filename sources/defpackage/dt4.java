package defpackage;

import com.google.android.gms.internal.ads.zzheh;
import com.google.android.gms.internal.ads.zzhfm;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4664b4;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class dt4 extends gu4 implements Runnable {
    public static final /* synthetic */ int k = 0;
    public ListenableFuture h;
    public Class i;
    public Object j;

    public abstract void u(Object obj);

    public abstract Object v(Object obj, Throwable th);

    @Override // com.google.android.gms.internal.ads.zzhcz
    public final void g() {
        o(this.h);
        this.h = null;
        this.i = null;
        this.j = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhcz
    public final String h() {
        String strO;
        ListenableFuture listenableFuture = this.h;
        Class cls = this.i;
        Object obj = this.j;
        String strH = super.h();
        if (listenableFuture != null) {
            String string = listenableFuture.toString();
            strO = jc1.o("inputFuture=[", string, new StringBuilder(string.length() + 16), "], ");
        } else {
            strO = "";
        }
        if (cls == null || obj == null) {
            if (strH != null) {
                return strO.concat(strH);
            }
            return null;
        }
        int length = strO.length();
        String string2 = cls.toString();
        int length2 = string2.length();
        String string3 = obj.toString();
        StringBuilder sb = new StringBuilder(string3.length() + length + 15 + length2 + 13 + 1);
        q63.y(sb, strO, "exceptionType=[", string2, "], fallback=[");
        return nj.q(sb, string3, C4664b4.j.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object objM;
        ListenableFuture listenableFuture = this.h;
        Class cls = this.i;
        Object obj = this.j;
        if (((obj == null) || ((listenableFuture == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.h = null;
        try {
            th = listenableFuture instanceof zzhfm ? ((zzhfm) listenableFuture).c() : null;
            objM = th == null ? zzheh.m(listenableFuture) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(listenableFuture.getClass());
                String strValueOf2 = String.valueOf(e.getClass());
                StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 19 + 16);
                q63.y(sb, "Future type ", strValueOf, " threw ", strValueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            e(objM);
            return;
        }
        if (!cls.isInstance(th)) {
            n(listenableFuture);
            return;
        }
        try {
            Object objV = v(obj, th);
            this.i = null;
            this.j = null;
            u(objV);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                f(th2);
            } finally {
                this.i = null;
                this.j = null;
            }
        }
    }

    public dt4(ListenableFuture listenableFuture, Class cls, Object obj) {
        listenableFuture.getClass();
        this.h = listenableFuture;
        this.i = cls;
        this.j = obj;
    }
}
