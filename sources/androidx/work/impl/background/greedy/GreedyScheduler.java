package androidx.work.impl.background.greedy;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.WorkInfo;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Scheduler;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTrackerImpl;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.ProcessUtils;
import androidx.work.impl.utils.StopWorkRunnable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RestrictTo
public class GreedyScheduler implements Scheduler, WorkConstraintsCallback, ExecutionListener {
    public static final String j = Logger.g("GreedyScheduler");
    public final Context a;
    public final WorkManagerImpl b;
    public final WorkConstraintsTrackerImpl c;
    public final DelayedWorkTracker e;
    public boolean f;
    public Boolean i;
    public final HashSet d = new HashSet();
    public final StartStopTokens h = new StartStopTokens();
    public final Object g = new Object();

    @Override // androidx.work.impl.Scheduler
    public final boolean b() {
        return false;
    }

    @Override // androidx.work.impl.Scheduler
    public final void c(String str) {
        Runnable runnable;
        Boolean bool = this.i;
        WorkManagerImpl workManagerImpl = this.b;
        if (bool == null) {
            this.i = Boolean.valueOf(ProcessUtils.a(this.a, workManagerImpl.b));
        }
        boolean zBooleanValue = this.i.booleanValue();
        String str2 = j;
        if (!zBooleanValue) {
            Logger.e().f(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f) {
            workManagerImpl.f.b(this);
            this.f = true;
        }
        Logger.e().a(str2, "Cancelling work ID " + str);
        DelayedWorkTracker delayedWorkTracker = this.e;
        if (delayedWorkTracker != null && (runnable = (Runnable) delayedWorkTracker.c.remove(str)) != null) {
            delayedWorkTracker.b.a(runnable);
        }
        Iterator it = this.h.c(str).iterator();
        while (it.hasNext()) {
            workManagerImpl.d.a(new StopWorkRunnable(workManagerImpl, (StartStopToken) it.next(), false));
        }
    }

    @Override // androidx.work.impl.Scheduler
    public final void d(WorkSpec... workSpecArr) {
        if (this.i == null) {
            this.i = Boolean.valueOf(ProcessUtils.a(this.a, this.b.b));
        }
        if (!this.i.booleanValue()) {
            Logger.e().f(j, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f) {
            this.b.f.b(this);
            this.f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (final WorkSpec workSpec : workSpecArr) {
            if (!this.h.a(WorkSpecKt.a(workSpec))) {
                long jA = workSpec.a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (workSpec.b == WorkInfo.State.a) {
                    if (jCurrentTimeMillis < jA) {
                        final DelayedWorkTracker delayedWorkTracker = this.e;
                        if (delayedWorkTracker != null) {
                            RunnableScheduler runnableScheduler = delayedWorkTracker.b;
                            HashMap map = delayedWorkTracker.c;
                            Runnable runnable = (Runnable) map.remove(workSpec.a);
                            if (runnable != null) {
                                runnableScheduler.a(runnable);
                            }
                            Runnable runnable2 = new Runnable() { // from class: androidx.work.impl.background.greedy.DelayedWorkTracker.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Logger loggerE = Logger.e();
                                    String str = DelayedWorkTracker.d;
                                    StringBuilder sb = new StringBuilder("Scheduling work ");
                                    WorkSpec workSpec2 = workSpec;
                                    sb.append(workSpec2.a);
                                    loggerE.a(str, sb.toString());
                                    DelayedWorkTracker.this.a.d(workSpec2);
                                }
                            };
                            map.put(workSpec.a, runnable2);
                            runnableScheduler.b(workSpec.a() - System.currentTimeMillis(), runnable2);
                        }
                    } else if (workSpec.b()) {
                        Constraints constraints = workSpec.j;
                        if (constraints.c) {
                            Logger.e().a(j, "Ignoring " + workSpec + ". Requires device idle.");
                        } else if (constraints.h.isEmpty()) {
                            hashSet.add(workSpec);
                            hashSet2.add(workSpec.a);
                        } else {
                            Logger.e().a(j, "Ignoring " + workSpec + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.h.a(WorkSpecKt.a(workSpec))) {
                        Logger.e().a(j, "Starting work for " + workSpec.a);
                        WorkManagerImpl workManagerImpl = this.b;
                        StartStopTokens startStopTokens = this.h;
                        startStopTokens.getClass();
                        workManagerImpl.g(startStopTokens.d(WorkSpecKt.a(workSpec)), null);
                    }
                }
            }
        }
        synchronized (this.g) {
            try {
                if (!hashSet.isEmpty()) {
                    Logger.e().a(j, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.d.addAll(hashSet);
                    this.c.d(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void e(WorkGenerationalId workGenerationalId, boolean z) {
        this.h.b(workGenerationalId);
        synchronized (this.g) {
            try {
                for (WorkSpec workSpec : this.d) {
                    if (WorkSpecKt.a(workSpec).equals(workGenerationalId)) {
                        Logger.e().a(j, "Stopping tracking for " + workGenerationalId);
                        this.d.remove(workSpec);
                        this.c.d(this.d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public final void f(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            WorkGenerationalId workGenerationalIdA = WorkSpecKt.a((WorkSpec) obj);
            StartStopTokens startStopTokens = this.h;
            if (!startStopTokens.a(workGenerationalIdA)) {
                Logger.e().a(j, "Constraints met: Scheduling work ID " + workGenerationalIdA);
                this.b.g(startStopTokens.d(workGenerationalIdA), null);
            }
        }
    }

    public GreedyScheduler(Context context, Configuration configuration, Trackers trackers, WorkManagerImpl workManagerImpl) {
        this.a = context;
        this.b = workManagerImpl;
        this.c = new WorkConstraintsTrackerImpl(trackers, this);
        this.e = new DelayedWorkTracker(this, configuration.e);
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WorkGenerationalId workGenerationalIdA = WorkSpecKt.a((WorkSpec) it.next());
            Logger.e().a(j, "Constraints not met: Cancelling work ID " + workGenerationalIdA);
            StartStopToken startStopTokenB = this.h.b(workGenerationalIdA);
            if (startStopTokenB != null) {
                WorkManagerImpl workManagerImpl = this.b;
                workManagerImpl.d.a(new StopWorkRunnable(workManagerImpl, startStopTokenB, false));
            }
        }
    }
}
