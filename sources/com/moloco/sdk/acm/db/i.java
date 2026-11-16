package com.moloco.sdk.acm.db;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.facebook.appevents.n;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class i {
    public final MetricsDb_Impl a;
    public final f b;
    public final n c = new n(7);
    public final g d;

    public final void a(c cVar) {
        MetricsDb_Impl metricsDb_Impl = this.a;
        metricsDb_Impl.assertNotSuspendingTransaction();
        metricsDb_Impl.beginTransaction();
        try {
            f fVar = this.b;
            SupportSQLiteStatement supportSQLiteStatementA = fVar.a();
            try {
                fVar.d(supportSQLiteStatementA, cVar);
                supportSQLiteStatementA.a0();
                fVar.c(supportSQLiteStatementA);
                metricsDb_Impl.setTransactionSuccessful();
                metricsDb_Impl.endTransaction();
            } catch (Throwable th) {
                fVar.c(supportSQLiteStatementA);
                throw th;
            }
        } catch (Throwable th2) {
            metricsDb_Impl.endTransaction();
            throw th2;
        }
    }

    public i(MetricsDb_Impl metricsDb_Impl) {
        this.a = metricsDb_Impl;
        this.b = new f(this, metricsDb_Impl, 0);
        new f(this, metricsDb_Impl, 1);
        new g(metricsDb_Impl, 0);
        this.d = new g(metricsDb_Impl, 1);
    }
}
