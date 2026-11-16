package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class hu0 extends Lifecycle {
    public static final hu0 b = new hu0();
    public static final gu0 c = new gu0();

    @Override // androidx.lifecycle.Lifecycle
    public final void c(LifecycleObserver lifecycleObserver) {
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void a(LifecycleObserver lifecycleObserver) {
        if (!(lifecycleObserver instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((lifecycleObserver + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) lifecycleObserver;
        gu0 gu0Var = c;
        defaultLifecycleObserver.onCreate(gu0Var);
        defaultLifecycleObserver.onStart(gu0Var);
        defaultLifecycleObserver.onResume(gu0Var);
    }

    @Override // androidx.lifecycle.Lifecycle
    /* JADX INFO: renamed from: b */
    public final Lifecycle.State getD() {
        return Lifecycle.State.e;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
