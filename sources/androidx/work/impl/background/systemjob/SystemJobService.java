package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.StopWorkRunnable;
import defpackage.e32;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@RequiresApi
@RestrictTo
public class SystemJobService extends JobService implements ExecutionListener {
    public static final String d = Logger.g("SystemJobService");
    public WorkManagerImpl a;
    public final HashMap b = new HashMap();
    public final StartStopTokens c = new StartStopTokens();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        public static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        @DoNotInline
        public static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api28Impl {
        @DoNotInline
        public static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    public static WorkGenerationalId a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.a == null) {
            Logger.e().a(d, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        WorkGenerationalId workGenerationalIdA = a(jobParameters);
        if (workGenerationalIdA == null) {
            Logger.e().c(d, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.b) {
            try {
                if (this.b.containsKey(workGenerationalIdA)) {
                    Logger.e().a(d, "Job is already being executed by SystemJobService: " + workGenerationalIdA);
                    return false;
                }
                Logger.e().a(d, "onStartJob for " + workGenerationalIdA);
                this.b.put(workGenerationalIdA, jobParameters);
                WorkerParameters.RuntimeExtras runtimeExtras = new WorkerParameters.RuntimeExtras();
                if (Api24Impl.b(jobParameters) != null) {
                    runtimeExtras.b = Arrays.asList(Api24Impl.b(jobParameters));
                }
                if (Api24Impl.a(jobParameters) != null) {
                    runtimeExtras.a = Arrays.asList(Api24Impl.a(jobParameters));
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    runtimeExtras.c = Api28Impl.a(jobParameters);
                }
                this.a.g(this.c.d(workGenerationalIdA), runtimeExtras);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        if (this.a == null) {
            Logger.e().a(d, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        WorkGenerationalId workGenerationalIdA = a(jobParameters);
        if (workGenerationalIdA == null) {
            Logger.e().c(d, "WorkSpec id not found!");
            return false;
        }
        Logger.e().a(d, "onStopJob for " + workGenerationalIdA);
        synchronized (this.b) {
            this.b.remove(workGenerationalIdA);
        }
        StartStopToken startStopTokenB = this.c.b(workGenerationalIdA);
        if (startStopTokenB != null) {
            WorkManagerImpl workManagerImpl = this.a;
            workManagerImpl.d.a(new StopWorkRunnable(workManagerImpl, startStopTokenB, false));
        }
        Processor processor = this.a.f;
        String str = workGenerationalIdA.a;
        synchronized (processor.l) {
            zContains = processor.j.contains(str);
        }
        return !zContains;
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void e(WorkGenerationalId workGenerationalId, boolean z) {
        JobParameters jobParameters;
        Logger.e().a(d, workGenerationalId.a + " executed on JobScheduler");
        synchronized (this.b) {
            jobParameters = (JobParameters) this.b.remove(workGenerationalId);
        }
        this.c.b(workGenerationalId);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            WorkManagerImpl workManagerImplC = WorkManagerImpl.c(getApplicationContext());
            this.a = workManagerImplC;
            workManagerImplC.f.b(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                Logger.e().h(d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
            } else {
                e32.i("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        WorkManagerImpl workManagerImpl = this.a;
        if (workManagerImpl != null) {
            workManagerImpl.f.f(this);
        }
    }
}
