package androidx.work.impl.background.greedy;

import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.impl.DefaultRunnableScheduler;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RestrictTo
public class DelayedWorkTracker {
    public static final String d = Logger.g("DelayedWorkTracker");
    public final GreedyScheduler a;
    public final RunnableScheduler b;
    public final HashMap c = new HashMap();

    public DelayedWorkTracker(GreedyScheduler greedyScheduler, DefaultRunnableScheduler defaultRunnableScheduler) {
        this.a = greedyScheduler;
        this.b = defaultRunnableScheduler;
    }
}
