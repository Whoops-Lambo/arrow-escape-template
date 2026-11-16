package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class qs0 extends v0 implements Runnable {
    public ListenableFuture h;

    @Override // defpackage.c1
    public final void d() {
        this.h = null;
    }

    @Override // defpackage.c1
    public final String k() {
        ListenableFuture listenableFuture = this.h;
        if (listenableFuture == null) {
            return null;
        }
        return "delegate=[" + listenableFuture + C4664b4.j.e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.h;
        if (listenableFuture != null) {
            o(listenableFuture);
        }
    }
}
