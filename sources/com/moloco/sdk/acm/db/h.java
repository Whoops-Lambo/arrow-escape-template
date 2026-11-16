package com.moloco.sdk.acm.db;

import androidx.sqlite.db.SupportSQLiteStatement;
import defpackage.az2;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class h implements Callable {
    public final /* synthetic */ i a;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        i iVar = this.a;
        g gVar = iVar.d;
        SupportSQLiteStatement supportSQLiteStatementA = gVar.a();
        MetricsDb_Impl metricsDb_Impl = iVar.a;
        metricsDb_Impl.beginTransaction();
        try {
            supportSQLiteStatementA.w();
            metricsDb_Impl.setTransactionSuccessful();
            return az2.a;
        } finally {
            metricsDb_Impl.endTransaction();
            gVar.c(supportSQLiteStatementA);
        }
    }

    public h(i iVar) {
        this.a = iVar;
    }
}
