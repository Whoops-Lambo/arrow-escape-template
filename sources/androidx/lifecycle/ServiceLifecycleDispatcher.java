package androidx.lifecycle;

import android.os.Handler;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/ServiceLifecycleDispatcher;", "", "DispatchRunnable", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ServiceLifecycleDispatcher {
    public final LifecycleRegistry a;
    public final Handler b = new Handler();
    public DispatchRunnable c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/ServiceLifecycleDispatcher$DispatchRunnable;", "Ljava/lang/Runnable;", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DispatchRunnable implements Runnable {
        public final LifecycleRegistry a;
        public final Lifecycle.Event b;
        public boolean c;

        @Override // java.lang.Runnable
        public final void run() {
            if (this.c) {
                return;
            }
            this.a.f(this.b);
            this.c = true;
        }

        public DispatchRunnable(LifecycleRegistry lifecycleRegistry, Lifecycle.Event event) {
            lifecycleRegistry.getClass();
            event.getClass();
            this.a = lifecycleRegistry;
            this.b = event;
        }
    }

    public final void a(Lifecycle.Event event) {
        DispatchRunnable dispatchRunnable = this.c;
        if (dispatchRunnable != null) {
            dispatchRunnable.run();
        }
        DispatchRunnable dispatchRunnable2 = new DispatchRunnable(this.a, event);
        this.c = dispatchRunnable2;
        this.b.postAtFrontOfQueue(dispatchRunnable2);
    }

    public ServiceLifecycleDispatcher(LifecycleService lifecycleService) {
        this.a = new LifecycleRegistry(lifecycleService);
    }
}
