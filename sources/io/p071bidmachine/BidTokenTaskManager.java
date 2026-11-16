package io.p071bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.p071bidmachine.utils.task.a;
import io.p071bidmachine.utils.task.b;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class BidTokenTaskManager {

    @Nullable
    private static volatile a instance;

    @NonNull
    private static a get() {
        a aVar;
        a aVar2 = instance;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (a.class) {
            try {
                aVar = instance;
                if (aVar == null) {
                    aVar = new a();
                    instance = aVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static void cancel(@NonNull b bVar) {
        Future future;
        a aVar = get();
        aVar.getClass();
        try {
            bVar.a.set(true);
            try {
                future = (Future) aVar.b.remove(bVar);
            } catch (Throwable unused) {
                future = null;
            }
            if (future != null) {
                future.cancel(false);
            }
        } catch (Throwable unused2) {
        }
    }

    public static void execute(@NonNull Runnable runnable) {
        a aVar = get();
        aVar.getClass();
        try {
            aVar.a.execute(runnable);
        } catch (Throwable unused) {
        }
    }

    public static void schedule(@NonNull b bVar, long j, @NonNull TimeUnit timeUnit) {
        a aVar = get();
        aVar.getClass();
        try {
            bVar.a.set(false);
            aVar.b.put(bVar, aVar.a.schedule(new io.p071bidmachine.ads.networks.adaptiverendering.measurer.b(7, aVar, bVar), j, timeUnit));
        } catch (Throwable unused) {
        }
    }
}
