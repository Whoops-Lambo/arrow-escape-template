package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.annotation.RequiresApi;
import defpackage.d;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class JobIntentService extends Service {
    public static final HashMap b = new HashMap();
    public JobServiceEngineImpl a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) {
            throw null;
        }

        @Override // android.os.AsyncTask
        public final void onCancelled(Void r1) {
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r1) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface CompatJobEngine {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class CompatWorkEnqueuer extends WorkEnqueuer {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class CompatWorkItem implements GenericWorkItem {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface GenericWorkItem {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {
        public final JobIntentService a;
        public final Object b;
        public JobParameters c;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public final class WrapperWorkItem implements GenericWorkItem {
            public final JobWorkItem a;

            public WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.a = jobWorkItem;
            }
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            this.c = jobParameters;
            this.a.getClass();
            return true;
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            this.a.getClass();
            throw null;
        }

        public JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.b = new Object();
            this.a = jobIntentService;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static final class JobWorkEnqueuer extends WorkEnqueuer {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class WorkEnqueuer {
    }

    public abstract void a();

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        JobServiceEngineImpl jobServiceEngineImpl = this.a;
        if (jobServiceEngineImpl != null) {
            return jobServiceEngineImpl.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.a = new JobServiceEngineImpl(this);
            return;
        }
        this.a = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap map = b;
        if (((WorkEnqueuer) map.get(componentName)) == null) {
            if (i < 26) {
                CompatWorkEnqueuer compatWorkEnqueuer = new CompatWorkEnqueuer();
                getApplicationContext();
                PowerManager powerManager = (PowerManager) getSystemService("power");
                powerManager.newWakeLock(1, componentName.getClassName() + ":launch").setReferenceCounted(false);
                powerManager.newWakeLock(1, componentName.getClassName() + ":run").setReferenceCounted(false);
                map.put(componentName, compatWorkEnqueuer);
                return;
            }
            d.r("Can't be here without a job id");
        }
    }
}
