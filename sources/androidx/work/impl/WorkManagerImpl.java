package androidx.work.impl;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.work.Configuration;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.PreferenceUtils;
import androidx.work.impl.utils.StartWorkRunnable;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.ecffri.arrows.R;
import defpackage.d;
import defpackage.e32;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@RestrictTo
public class WorkManagerImpl extends WorkManager {
    public static WorkManagerImpl k;
    public static WorkManagerImpl l;
    public static final Object m;
    public final Context a;
    public final Configuration b;
    public final WorkDatabase c;
    public final WorkManagerTaskExecutor d;
    public final List e;
    public final Processor f;
    public final PreferenceUtils g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;
    public final Trackers j;

    /* JADX INFO: renamed from: androidx.work.impl.WorkManagerImpl$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes6.dex */
    class AnonymousClass1 implements Runnable {
        /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r0 = this;
                r0 = 0
                throw r0     // Catch: java.lang.Throwable -> L2
            L2:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.WorkManagerImpl.AnonymousClass1.run():void");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkManagerImpl$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes6.dex */
    class AnonymousClass2 implements Function<List<WorkSpec.WorkInfoPojo>, WorkInfo> {
        @Override // androidx.arch.core.util.Function
        public final Object apply(Object obj) {
            List list = (List) obj;
            if (list == null || list.size() <= 0) {
                return null;
            }
            return ((WorkSpec.WorkInfoPojo) list.get(0)).a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        public static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static {
        Logger.g("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static WorkManagerImpl c(Context context) {
        WorkManagerImpl workManagerImplC;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        workManagerImplC = k;
                        if (workManagerImplC == null) {
                            workManagerImplC = l;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return workManagerImplC;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (workManagerImplC == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof Configuration.Provider)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            d(applicationContext, ((Configuration.Provider) applicationContext).a());
            workManagerImplC = c(applicationContext);
        }
        return workManagerImplC;
    }

    public static void d(Context context, Configuration configuration) {
        synchronized (m) {
            try {
                WorkManagerImpl workManagerImpl = k;
                if (workManagerImpl != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (workManagerImpl == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (l == null) {
                        l = new WorkManagerImpl(applicationContext, configuration, new WorkManagerTaskExecutor(configuration.b));
                    }
                    k = l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        ArrayList arrayListE;
        String str = SystemJobScheduler.e;
        Context context = this.a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListE = SystemJobScheduler.e(context, jobScheduler)) != null && !arrayListE.isEmpty()) {
            int size = arrayListE.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListE.get(i);
                i++;
                SystemJobScheduler.a(jobScheduler, ((JobInfo) obj).getId());
            }
        }
        WorkDatabase workDatabase = this.c;
        workDatabase.workSpecDao().o();
        Schedulers.a(this.b, workDatabase, this.e);
    }

    public final void g(StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras) {
        StartWorkRunnable startWorkRunnable = new StartWorkRunnable();
        startWorkRunnable.a = this;
        startWorkRunnable.b = startStopToken;
        startWorkRunnable.c = runtimeExtras;
        this.d.a(startWorkRunnable);
    }

    public WorkManagerImpl(Context context, Configuration configuration, WorkManagerTaskExecutor workManagerTaskExecutor) {
        WorkDatabase workDatabaseCreate = WorkDatabase.create(context.getApplicationContext(), workManagerTaskExecutor.a, context.getResources().getBoolean(R.bool.workmanager_test_configuration));
        Context applicationContext = context.getApplicationContext();
        Logger.LogcatLogger logcatLogger = new Logger.LogcatLogger(configuration.f);
        synchronized (Logger.a) {
            Logger.b = logcatLogger;
        }
        Trackers trackers = new Trackers(applicationContext, workManagerTaskExecutor);
        this.j = trackers;
        String str = Schedulers.a;
        SystemJobScheduler systemJobScheduler = new SystemJobScheduler(applicationContext, this);
        PackageManagerHelper.a(applicationContext, SystemJobService.class, true);
        Logger.e().a(Schedulers.a, "Created SystemJobScheduler and enabled SystemJobService");
        List listAsList = Arrays.asList(systemJobScheduler, new GreedyScheduler(applicationContext, configuration, trackers, this));
        Processor processor = new Processor(context, configuration, workManagerTaskExecutor, workDatabaseCreate, listAsList);
        Context applicationContext2 = context.getApplicationContext();
        this.a = applicationContext2;
        this.b = configuration;
        this.d = workManagerTaskExecutor;
        this.c = workDatabaseCreate;
        this.e = listAsList;
        this.f = processor;
        this.g = new PreferenceUtils(workDatabaseCreate);
        this.h = false;
        if (!Api24Impl.a(applicationContext2)) {
            this.d.a(new ForceStopRunnable(applicationContext2, this));
        } else {
            e32.i("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
    }

    @Override // androidx.work.WorkManager
    public final Operation b(List list) {
        if (!list.isEmpty()) {
            return new WorkContinuationImpl(this, null, ExistingWorkPolicy.a, list, 0).a();
        }
        d.r("enqueue needs at least one WorkRequest.");
        return null;
    }
}
