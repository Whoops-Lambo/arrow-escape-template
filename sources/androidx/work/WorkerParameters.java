package androidx.work;

import android.net.Network;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class WorkerParameters {
    public UUID a;
    public Data b;
    public HashSet c;
    public RuntimeExtras d;
    public int e;
    public ExecutorService f;
    public WorkManagerTaskExecutor g;
    public WorkerFactory h;
    public WorkProgressUpdater i;
    public WorkForegroundUpdater j;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RestrictTo
    public static class RuntimeExtras {
        public List a;
        public List b;
        public Network c;

        public RuntimeExtras() {
            List list = Collections.EMPTY_LIST;
            this.a = list;
            this.b = list;
        }
    }
}
