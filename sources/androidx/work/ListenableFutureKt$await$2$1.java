package androidx.work;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.j52;
import defpackage.qo;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Laz2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class ListenableFutureKt$await$2$1 implements Runnable {
    public final /* synthetic */ qo a;
    public final /* synthetic */ ListenableFuture b;

    @Override // java.lang.Runnable
    public final void run() {
        qo qoVar = this.a;
        try {
            qoVar.resumeWith(this.b.get());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                qoVar.a(cause);
            } else {
                qoVar.resumeWith(new j52(cause));
            }
        }
    }

    public ListenableFutureKt$await$2$1(qo qoVar, ListenableFuture listenableFuture) {
        this.a = qoVar;
        this.b = listenableFuture;
    }
}
