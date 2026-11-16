package androidx.compose.runtime;

import androidx.compose.runtime.internal.ThreadMap;
import androidx.compose.runtime.internal.ThreadMapKt;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/SnapshotThreadLocal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SnapshotThreadLocal<T> {
    public final AtomicReference a = new AtomicReference(ThreadMapKt.a);
    public final Object b = new Object();

    public final Object a() {
        ThreadMap threadMap = (ThreadMap) this.a.get();
        int iA = threadMap.a(Thread.currentThread().getId());
        if (iA >= 0) {
            return threadMap.c[iA];
        }
        return null;
    }

    public final void b(Object obj) {
        long id = Thread.currentThread().getId();
        synchronized (this.b) {
            ThreadMap threadMap = (ThreadMap) this.a.get();
            int iA = threadMap.a(id);
            if (iA < 0) {
                this.a.set(threadMap.b(id, obj));
            } else {
                threadMap.c[iA] = obj;
            }
        }
    }
}
