package com.moloco.sdk.internal.error.crash;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.error.crash.delivery.m;
import defpackage.ar1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public final com.moloco.sdk.acm.recorder.c a;

    public final void a(m mVar, String str) {
        mVar.getClass();
        str.getClass();
        try {
            boolean z = mVar instanceof com.moloco.sdk.internal.error.crash.delivery.j;
            com.moloco.sdk.acm.recorder.c cVar = this.a;
            if (z) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "CrashReportingMetrics", "Crash report delivered via ".concat(str), null, false, 12, null);
                com.moloco.sdk.acm.e eVar = new com.moloco.sdk.acm.e("crash_report_sent");
                eVar.a("result", "success");
                eVar.a("delivery_path", str);
                cVar.a(eVar);
                return;
            }
            if (!(mVar instanceof com.moloco.sdk.internal.error.crash.delivery.k)) {
                if (!(mVar instanceof com.moloco.sdk.internal.error.crash.delivery.l)) {
                    throw new ar1();
                }
            } else {
                com.moloco.sdk.acm.e eVar2 = new com.moloco.sdk.acm.e("crash_report_sent");
                eVar2.a("result", "failure");
                eVar2.a("reason", ((com.moloco.sdk.internal.error.crash.delivery.k) mVar).a);
                cVar.a(eVar2);
            }
        } catch (Throwable unused) {
        }
    }

    public final void b(String str) {
        try {
            com.moloco.sdk.acm.recorder.c cVar = this.a;
            com.moloco.sdk.acm.e eVar = new com.moloco.sdk.acm.e("crash_reporting_internal_error");
            eVar.a("step", str);
            cVar.a(eVar);
        } catch (Throwable unused) {
        }
    }

    public final void c(boolean z) {
        try {
            com.moloco.sdk.acm.recorder.c cVar = this.a;
            com.moloco.sdk.acm.e eVar = new com.moloco.sdk.acm.e("sdk_feature_enabled");
            eVar.a("feature", "crash_reporting");
            eVar.a("result", z ? "success" : "failure");
            cVar.a(eVar);
        } catch (Throwable unused) {
        }
    }

    public c(com.moloco.sdk.acm.recorder.c cVar) {
        this.a = cVar;
    }
}
