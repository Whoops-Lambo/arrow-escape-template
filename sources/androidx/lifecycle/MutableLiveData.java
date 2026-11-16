package androidx.lifecycle;

import android.os.Looper;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.executor.DefaultTaskExecutor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class MutableLiveData<T> extends LiveData<T> {
    public final void j(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == LiveData.k;
            this.f = obj;
        }
        if (z) {
            ArchTaskExecutor archTaskExecutorA = ArchTaskExecutor.a();
            Runnable runnable = this.j;
            DefaultTaskExecutor defaultTaskExecutor = archTaskExecutorA.a;
            if (defaultTaskExecutor.c == null) {
                synchronized (defaultTaskExecutor.a) {
                    try {
                        if (defaultTaskExecutor.c == null) {
                            defaultTaskExecutor.c = DefaultTaskExecutor.a(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            defaultTaskExecutor.c.post(runnable);
        }
    }
}
