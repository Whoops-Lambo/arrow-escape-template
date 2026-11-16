package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        WorkManagerImpl workManagerImplC = WorkManagerImpl.c(getApplicationContext());
        workManagerImplC.getClass();
        WorkDatabase workDatabase = workManagerImplC.c;
        workDatabase.getClass();
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        WorkNameDao workNameDao = workDatabase.workNameDao();
        WorkTagDao workTagDao = workDatabase.workTagDao();
        SystemIdInfoDao systemIdInfoDao = workDatabase.systemIdInfoDao();
        ArrayList arrayListL = workSpecDao.l(System.currentTimeMillis() - 86400000);
        ArrayList arrayListU = workSpecDao.u();
        ArrayList arrayListP = workSpecDao.p();
        if (!arrayListL.isEmpty()) {
            Logger loggerE = Logger.e();
            String str = DiagnosticsWorkerKt.a;
            loggerE.f(str, "Recently completed work:\n\n");
            Logger.e().f(str, DiagnosticsWorkerKt.a(workNameDao, workTagDao, systemIdInfoDao, arrayListL));
        }
        if (!arrayListU.isEmpty()) {
            Logger loggerE2 = Logger.e();
            String str2 = DiagnosticsWorkerKt.a;
            loggerE2.f(str2, "Running work:\n\n");
            Logger.e().f(str2, DiagnosticsWorkerKt.a(workNameDao, workTagDao, systemIdInfoDao, arrayListU));
        }
        if (!arrayListP.isEmpty()) {
            Logger loggerE3 = Logger.e();
            String str3 = DiagnosticsWorkerKt.a;
            loggerE3.f(str3, "Enqueued work:\n\n");
            Logger.e().f(str3, DiagnosticsWorkerKt.a(workNameDao, workTagDao, systemIdInfoDao, arrayListP));
        }
        return ListenableWorker.Result.a();
    }
}
