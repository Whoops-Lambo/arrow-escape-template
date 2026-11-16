package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import defpackage.ya0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "it", "Laz2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CoroutineAdapterKt$asListenableFuture$1$1 extends rc1 implements wr0 {
    public final /* synthetic */ CallbackToFutureAdapter.Completer i;
    public final /* synthetic */ ya0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineAdapterKt$asListenableFuture$1$1(CallbackToFutureAdapter.Completer completer, ya0 ya0Var) {
        super(1);
        this.i = completer;
        this.j = ya0Var;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        CallbackToFutureAdapter.Completer completer = this.i;
        if (th == null) {
            completer.a(this.j.A());
        } else if (th instanceof CancellationException) {
            completer.b();
        } else {
            completer.c(th);
        }
        return az2.a;
    }
}
