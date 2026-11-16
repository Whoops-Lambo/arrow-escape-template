package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.d;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ListenableWorker {

    @NonNull
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;

    @NonNull
    private WorkerParameters mWorkerParams;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Result {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @RestrictTo
        public static final class Failure extends Result {
            public final Data a = Data.c;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || Failure.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((Failure) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode() + 846803280;
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.a + '}';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @RestrictTo
        public static final class Retry extends Result {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && Retry.class == obj.getClass();
            }

            public final String toString() {
                return "Retry";
            }

            public final int hashCode() {
                return 25945934;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @RestrictTo
        public static final class Success extends Result {
            public final Data a;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || Success.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((Success) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode() - 1876823561;
            }

            public final String toString() {
                return "Success {mOutputData=" + this.a + '}';
            }

            public Success(Data data) {
                this.a = data;
            }
        }

        public static Success a() {
            return new Success(Data.c);
        }
    }

    public void onStopped() {
    }

    @RestrictTo
    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ListenableFuture startWork();

    @RestrictTo
    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    @RestrictTo
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    public ListenableFuture getForegroundInfoAsync() {
        SettableFuture settableFuture = new SettableFuture();
        settableFuture.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return settableFuture;
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    @NonNull
    public final Data getInputData() {
        return this.mWorkerParams.b;
    }

    @Nullable
    @RequiresApi
    public final Network getNetwork() {
        return this.mWorkerParams.d.c;
    }

    @IntRange
    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    @NonNull
    @RestrictTo
    public TaskExecutor getTaskExecutor() {
        return this.mWorkerParams.g;
    }

    @NonNull
    @RequiresApi
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.d.a;
    }

    @NonNull
    @RequiresApi
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.d.b;
    }

    @NonNull
    @RestrictTo
    public WorkerFactory getWorkerFactory() {
        return this.mWorkerParams.h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    @RestrictTo
    public final boolean isUsed() {
        return this.mUsed;
    }

    @NonNull
    public final ListenableFuture setForegroundAsync(@NonNull ForegroundInfo foregroundInfo) {
        return this.mWorkerParams.j.a(getApplicationContext(), getId(), foregroundInfo);
    }

    @NonNull
    public ListenableFuture setProgressAsync(@NonNull Data data) {
        WorkProgressUpdater workProgressUpdater = this.mWorkerParams.i;
        getApplicationContext();
        return workProgressUpdater.a(getId(), data);
    }

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.mAppContext = context;
                this.mWorkerParams = workerParameters;
                return;
            } else {
                d.r("WorkerParameters is null");
                throw null;
            }
        }
        d.r("Application Context is null");
        throw null;
    }
}
