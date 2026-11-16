package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/constraints/trackers/Trackers;", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
public final class Trackers {
    public final ConstraintTracker a;
    public final BatteryNotLowTracker b;
    public final ConstraintTracker c;
    public final ConstraintTracker d;

    public Trackers(Context context, WorkManagerTaskExecutor workManagerTaskExecutor) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        BatteryChargingTracker batteryChargingTracker = new BatteryChargingTracker(applicationContext, workManagerTaskExecutor);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        BatteryNotLowTracker batteryNotLowTracker = new BatteryNotLowTracker(applicationContext2, workManagerTaskExecutor);
        Context applicationContext3 = context.getApplicationContext();
        applicationContext3.getClass();
        String str = NetworkStateTrackerKt.a;
        NetworkStateTracker24 networkStateTracker24 = new NetworkStateTracker24(applicationContext3, workManagerTaskExecutor);
        Context applicationContext4 = context.getApplicationContext();
        applicationContext4.getClass();
        StorageNotLowTracker storageNotLowTracker = new StorageNotLowTracker(applicationContext4, workManagerTaskExecutor);
        this.a = batteryChargingTracker;
        this.b = batteryNotLowTracker;
        this.c = networkStateTracker24;
        this.d = storageNotLowTracker;
    }
}
