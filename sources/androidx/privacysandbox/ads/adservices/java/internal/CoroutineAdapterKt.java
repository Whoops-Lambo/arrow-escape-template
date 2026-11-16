package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ya0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ads-adservices-java_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutineAdapterKt {
    public static ListenableFuture a(final ya0 ya0Var) {
        return CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver() { // from class: androidx.privacysandbox.ads.adservices.java.internal.a
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object b(CallbackToFutureAdapter.Completer completer) {
                ya0 ya0Var2 = ya0Var;
                ya0Var2.invokeOnCompletion(new CoroutineAdapterKt$asListenableFuture$1$1(completer, ya0Var2));
                return "Deferred.asListenableFuture";
            }
        });
    }
}
