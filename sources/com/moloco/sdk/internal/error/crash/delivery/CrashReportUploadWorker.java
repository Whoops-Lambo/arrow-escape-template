package com.moloco.sdk.internal.error.crash.delivery;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.CoroutineWorker;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.ar1;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.j52;
import defpackage.s71;
import defpackage.wr0;
import defpackage.wz2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/moloco/sdk/internal/error/crash/delivery/CrashReportUploadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class CrashReportUploadWorker extends CoroutineWorker {
    /* JADX WARN: Code duplicated, block: B:57:0x011b A[Catch: all -> 0x00bf, TryCatch #2 {all -> 0x00bf, blocks: (B:55:0x0115, B:57:0x011b, B:58:0x0120, B:60:0x0124, B:61:0x0148, B:63:0x014c, B:64:0x0155, B:65:0x015a, B:19:0x0049, B:21:0x005b, B:23:0x0063, B:32:0x0096, B:36:0x009d, B:38:0x00a7, B:42:0x00c4, B:44:0x00d8, B:45:0x00df, B:46:0x00e6, B:52:0x00f5, B:66:0x015b, B:67:0x0160, B:68:0x0165, B:31:0x0090, B:24:0x0076, B:26:0x0083), top: B:79:0x0049, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0120 A[Catch: all -> 0x00bf, TryCatch #2 {all -> 0x00bf, blocks: (B:55:0x0115, B:57:0x011b, B:58:0x0120, B:60:0x0124, B:61:0x0148, B:63:0x014c, B:64:0x0155, B:65:0x015a, B:19:0x0049, B:21:0x005b, B:23:0x0063, B:32:0x0096, B:36:0x009d, B:38:0x00a7, B:42:0x00c4, B:44:0x00d8, B:45:0x00df, B:46:0x00e6, B:52:0x00f5, B:66:0x015b, B:67:0x0160, B:68:0x0165, B:31:0x0090, B:24:0x0076, B:26:0x0083), top: B:79:0x0049, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0124 A[Catch: all -> 0x00bf, TryCatch #2 {all -> 0x00bf, blocks: (B:55:0x0115, B:57:0x011b, B:58:0x0120, B:60:0x0124, B:61:0x0148, B:63:0x014c, B:64:0x0155, B:65:0x015a, B:19:0x0049, B:21:0x005b, B:23:0x0063, B:32:0x0096, B:36:0x009d, B:38:0x00a7, B:42:0x00c4, B:44:0x00d8, B:45:0x00df, B:46:0x00e6, B:52:0x00f5, B:66:0x015b, B:67:0x0160, B:68:0x0165, B:31:0x0090, B:24:0x0076, B:26:0x0083), top: B:79:0x0049, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0148 A[Catch: all -> 0x00bf, TryCatch #2 {all -> 0x00bf, blocks: (B:55:0x0115, B:57:0x011b, B:58:0x0120, B:60:0x0124, B:61:0x0148, B:63:0x014c, B:64:0x0155, B:65:0x015a, B:19:0x0049, B:21:0x005b, B:23:0x0063, B:32:0x0096, B:36:0x009d, B:38:0x00a7, B:42:0x00c4, B:44:0x00d8, B:45:0x00df, B:46:0x00e6, B:52:0x00f5, B:66:0x015b, B:67:0x0160, B:68:0x0165, B:31:0x0090, B:24:0x0076, B:26:0x0083), top: B:79:0x0049, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x014c A[Catch: all -> 0x00bf, TryCatch #2 {all -> 0x00bf, blocks: (B:55:0x0115, B:57:0x011b, B:58:0x0120, B:60:0x0124, B:61:0x0148, B:63:0x014c, B:64:0x0155, B:65:0x015a, B:19:0x0049, B:21:0x005b, B:23:0x0063, B:32:0x0096, B:36:0x009d, B:38:0x00a7, B:42:0x00c4, B:44:0x00d8, B:45:0x00df, B:46:0x00e6, B:52:0x00f5, B:66:0x015b, B:67:0x0160, B:68:0x0165, B:31:0x0090, B:24:0x0076, B:26:0x0083), top: B:79:0x0049, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0155 A[Catch: all -> 0x00bf, TryCatch #2 {all -> 0x00bf, blocks: (B:55:0x0115, B:57:0x011b, B:58:0x0120, B:60:0x0124, B:61:0x0148, B:63:0x014c, B:64:0x0155, B:65:0x015a, B:19:0x0049, B:21:0x005b, B:23:0x0063, B:32:0x0096, B:36:0x009d, B:38:0x00a7, B:42:0x00c4, B:44:0x00d8, B:45:0x00df, B:46:0x00e6, B:52:0x00f5, B:66:0x015b, B:67:0x0160, B:68:0x0165, B:31:0x0090, B:24:0x0076, B:26:0x0083), top: B:79:0x0049, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x017c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0182  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x0124, please report this as an issue */
    @Override // androidx.work.CoroutineWorker
    public final Object doWork(dy dyVar) {
        a aVar;
        CrashReportUploadWorker crashReportUploadWorker;
        long jLongValue;
        String strB;
        Object j52Var;
        m mVar;
        CrashReportUploadWorker crashReportUploadWorker2 = this;
        if (dyVar instanceof a) {
            aVar = (a) dyVar;
            int i = aVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.w = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(crashReportUploadWorker2, (fy) dyVar);
            }
        } else {
            aVar = new a(crashReportUploadWorker2, (fy) dyVar);
        }
        Object objB = aVar.u;
        dz dzVar = dz.a;
        int i2 = aVar.w;
        Object obj = null;
        if (i2 != 0) {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j = aVar.t;
            String str = aVar.s;
            crashReportUploadWorker = aVar.r;
            try {
                wz2.a0(objB);
                jLongValue = j;
                strB = str;
                crashReportUploadWorker2 = crashReportUploadWorker;
                mVar = (m) objB;
                if (mVar instanceof j) {
                    return ListenableWorker.Result.a();
                }
                if (mVar instanceof k) {
                    if (mVar instanceof l) {
                        return crashReportUploadWorker2.c(jLongValue, ((l) mVar).a, strB);
                    }
                    throw new ar1();
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "CrashReportUploadWorker", "Crash report dropped: " + ((k) mVar).a, null, false, 12, null);
                return ListenableWorker.Result.a();
            } catch (Throwable th) {
                th = th;
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "CrashReportUploadWorker", "Crash report delivery attempt failed", th, false, 8, null);
                return crashReportUploadWorker.getRunAttemptCount() >= 10 ? new ListenableWorker.Result.Failure() : new ListenableWorker.Result.Retry();
            }
        }
        wz2.a0(objB);
        try {
            Object obj2 = crashReportUploadWorker2.getInputData().a.get("crash_report_row_id");
            jLongValue = obj2 instanceof Long ? ((Long) obj2).longValue() : -1L;
            strB = crashReportUploadWorker2.getInputData().b("crash_report_event_id");
            Context applicationContext = crashReportUploadWorker2.getApplicationContext();
            applicationContext.getClass();
            try {
                SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("moloco_crash_reporting", 0);
                j52Var = sharedPreferences.contains("wm_delivery_enabled") ? Boolean.valueOf(sharedPreferences.getBoolean("wm_delivery_enabled", false)) : null;
            } catch (Throwable th2) {
                j52Var = new j52(th2);
            }
            if (!(j52Var instanceof j52)) {
                obj = j52Var;
            }
            Boolean bool = (Boolean) obj;
            if (s71.b(bool, Boolean.FALSE)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "CrashReportUploadWorker", "Crash report delivery disabled by last-known config — stopping", null, false, 12, null);
                return new ListenableWorker.Result.Failure();
            }
            if (bool == null) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "CrashReportUploadWorker", "Crash report delivery deferred — config not yet known", null, false, 12, null);
                return crashReportUploadWorker2.getRunAttemptCount() >= 10 ? new ListenableWorker.Result.Failure() : new ListenableWorker.Result.Retry();
            }
            if (!bool.equals(Boolean.TRUE)) {
                throw new ar1();
            }
            if (jLongValue != -1 && strB != null) {
                wr0 wr0Var = f.a;
                Context applicationContext2 = crashReportUploadWorker2.getApplicationContext();
                applicationContext2.getClass();
                r rVar = (r) wr0Var.invoke(applicationContext2);
                aVar.r = crashReportUploadWorker2;
                aVar.s = strB;
                aVar.t = jLongValue;
                aVar.w = 1;
                objB = rVar.b(jLongValue, "workmanager", aVar);
                if (objB == dzVar) {
                    return dzVar;
                }
                mVar = (m) objB;
                if (mVar instanceof j) {
                    return ListenableWorker.Result.a();
                }
                if (mVar instanceof k) {
                    if (mVar instanceof l) {
                        return crashReportUploadWorker2.c(jLongValue, ((l) mVar).a, strB);
                    }
                    throw new ar1();
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "CrashReportUploadWorker", "Crash report dropped: " + ((k) mVar).a, null, false, 12, null);
                return ListenableWorker.Result.a();
            }
            return ListenableWorker.Result.a();
        } catch (Throwable th3) {
            th = th3;
            crashReportUploadWorker = crashReportUploadWorker2;
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "CrashReportUploadWorker", "Crash report delivery attempt failed", th, false, 8, null);
            if (crashReportUploadWorker.getRunAttemptCount() >= 10) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrashReportUploadWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    public final ListenableWorker.Result c(long j, Long l, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (l != null && l.longValue() > jCurrentTimeMillis) {
            wr0 wr0Var = f.b;
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            b bVar = (b) wr0Var.invoke(applicationContext);
            long jLongValue = l.longValue() - jCurrentTimeMillis;
            i iVar = (i) bVar;
            iVar.getClass();
            str.getClass();
            iVar.b(j, str, jLongValue, ExistingWorkPolicy.c);
            return ListenableWorker.Result.a();
        }
        return new ListenableWorker.Result.Retry();
    }
}
