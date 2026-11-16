package com.moloco.sdk.internal.error.crash.delivery;

import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkManagerImpl;
import com.inmobi.media.core.config.models.CrashConfig;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.error.crash.model.s;
import defpackage.az2;
import defpackage.dt1;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.sr0;
import defpackage.wz2;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i implements b {
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.m a;
    public final com.moloco.sdk.internal.error.crash.data.b b;
    public final sr0 c;

    public i(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.m mVar, com.moloco.sdk.internal.error.crash.data.b bVar) {
        g gVar = g.b;
        bVar.getClass();
        this.a = mVar;
        this.b = bVar;
        this.c = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(fy fyVar) {
        h hVar;
        if (fyVar instanceof h) {
            hVar = (h) fyVar;
            int i = hVar.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.u = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, fyVar);
            }
        } else {
            hVar = new h(this, fyVar);
        }
        Object objC = hVar.s;
        int i2 = hVar.u;
        if (i2 == 0) {
            wz2.a0(objC);
            long jLongValue = ((Number) this.c.invoke()).longValue();
            hVar.r = this;
            hVar.u = 1;
            objC = this.b.c(jLongValue, hVar);
            dz dzVar = dz.a;
            if (objC == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = hVar.r;
            wz2.a0(objC);
        }
        i iVar = this;
        for (s sVar : (Iterable) objC) {
            long jLongValue2 = sVar.g - ((Number) iVar.c.invoke()).longValue();
            iVar.b(sVar.a, sVar.b, jLongValue2 < 0 ? 0L : jLongValue2, ExistingWorkPolicy.a);
        }
        return az2.a;
    }

    public final void b(long j, String str, long j2, ExistingWorkPolicy existingWorkPolicy) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            OneTimeWorkRequest.Builder builder = new OneTimeWorkRequest.Builder(CrashReportUploadWorker.class);
            Constraints.Builder builder2 = new Constraints.Builder();
            builder2.a = NetworkType.b;
            builder.c.j = builder2.a();
            OneTimeWorkRequest.Builder builder3 = (OneTimeWorkRequest.Builder) builder.d(BackoffPolicy.a, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
            dt1[] dt1VarArr = {new dt1("crash_report_row_id", Long.valueOf(j)), new dt1("crash_report_event_id", str)};
            Data.Builder builder4 = new Data.Builder();
            for (int i = 0; i < 2; i++) {
                dt1 dt1Var = dt1VarArr[i];
                builder4.b((String) dt1Var.a, dt1Var.b);
            }
            WorkRequest.Builder builderE = builder3.e(builder4.a());
            OneTimeWorkRequest.Builder builder5 = (OneTimeWorkRequest.Builder) builderE;
            if (j2 > 0) {
                timeUnit.getClass();
                builder5.c.g = j2;
                if (Long.MAX_VALUE - System.currentTimeMillis() <= builder5.c.g) {
                    throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
                }
            }
            OneTimeWorkRequest oneTimeWorkRequest = (OneTimeWorkRequest) ((OneTimeWorkRequest.Builder) builderE).a();
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.m mVar = this.a;
            mVar.getClass();
            WorkManagerImpl workManagerImpl = mVar.a;
            workManagerImpl.getClass();
            new WorkContinuationImpl(workManagerImpl, "moloco_crash_report_" + str, existingWorkPolicy, Collections.singletonList(oneTimeWorkRequest), 0).a().getClass();
        } catch (Throwable th) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "CrashReportDelivery", "Failed to enqueue crash report delivery", th, false, 8, null);
        }
    }
}
