package coil.request;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import defpackage.c91;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/BaseRequestDelegate;", "Lcoil/request/RequestDelegate;", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BaseRequestDelegate extends RequestDelegate {
    public final Lifecycle a;
    public final c91 b;

    public BaseRequestDelegate(Lifecycle lifecycle, c91 c91Var) {
        super(0);
        this.a = lifecycle;
        this.b = c91Var;
    }

    @Override // coil.request.RequestDelegate
    public final void b() {
        this.a.c(this);
    }

    @Override // coil.request.RequestDelegate
    public final void c() {
        this.a.a(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.b.cancel(null);
    }
}
