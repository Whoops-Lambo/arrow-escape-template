package defpackage;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bw implements Provider {
    public final /* synthetic */ int a;

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                Lazy lazy = ExecutorsRegistrar.a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                if (Build.VERSION.SDK_INT >= 26) {
                    builderDetectNetwork.detectUnbufferedIo();
                }
                return new ib0(Executors.newFixedThreadPool(4, new s30("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 2:
                Lazy lazy2 = ExecutorsRegistrar.a;
                return new ib0(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new s30("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                Lazy lazy3 = ExecutorsRegistrar.a;
                return new ib0(Executors.newCachedThreadPool(new s30("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                Lazy lazy4 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new s30("Firebase Scheduler", 0, null));
            default:
                return null;
        }
    }
}
