package com.moloco.sdk.internal.error.crash.data;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.moloco.sdk.internal.error.crash.data.local.CrashReportDb_Impl;
import com.moloco.sdk.internal.error.crash.data.local.c;
import com.moloco.sdk.internal.error.crash.data.local.e;
import com.moloco.sdk.internal.error.crash.delivery.o;
import com.moloco.sdk.internal.error.crash.k;
import com.moloco.sdk.internal.error.crash.model.g;
import com.moloco.sdk.internal.error.crash.model.h;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.sr0;
import defpackage.wz2;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public final com.facebook.ads.a a;
    public final sr0 b;

    public final Long a(g gVar, String str, String str2, long j) {
        com.facebook.ads.a aVar = this.a;
        com.moloco.sdk.internal.error.crash.data.local.g gVar2 = (com.moloco.sdk.internal.error.crash.data.local.g) aVar.b;
        try {
            String strB = h.a.b(g.Companion.serializer(), gVar);
            gVar2.getClass();
            RoomSQLiteQuery roomSQLiteQueryB = RoomSQLiteQuery.b(0, "SELECT COUNT(*) FROM crash_reports");
            CrashReportDb_Impl crashReportDb_Impl = (CrashReportDb_Impl) gVar2.a;
            crashReportDb_Impl.assertNotSuspendingTransaction();
            Cursor cursorB = DBUtil.b(crashReportDb_Impl, roomSQLiteQueryB, false);
            try {
                int i = cursorB.moveToFirst() ? cursorB.getInt(0) : 0;
                cursorB.close();
                roomSQLiteQueryB.release();
                int i2 = (i - ((k) this.b.invoke()).a) + 1;
                if (i2 > 0) {
                    CrashReportDb_Impl crashReportDb_Impl2 = (CrashReportDb_Impl) gVar2.a;
                    crashReportDb_Impl2.assertNotSuspendingTransaction();
                    com.moloco.sdk.acm.db.g gVar3 = (com.moloco.sdk.acm.db.g) gVar2.c;
                    SupportSQLiteStatement supportSQLiteStatementA = gVar3.a();
                    supportSQLiteStatementA.m(1, i2);
                    crashReportDb_Impl2.beginTransaction();
                    try {
                        supportSQLiteStatementA.w();
                        crashReportDb_Impl2.setTransactionSuccessful();
                    } finally {
                        crashReportDb_Impl2.endTransaction();
                        gVar3.c(supportSQLiteStatementA);
                    }
                }
                return aVar.q(gVar.a, strB, str, str2, gVar.b * 1000, j);
            } catch (Throwable th) {
                cursorB.close();
                roomSQLiteQueryB.release();
                throw th;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Object b(long j, o oVar) {
        com.moloco.sdk.internal.error.crash.data.local.g gVar = (com.moloco.sdk.internal.error.crash.data.local.g) this.a.b;
        Object objA = CoroutinesRoom.a((CrashReportDb_Impl) gVar.a, new e(gVar, j, 1), oVar);
        az2 az2Var = az2.a;
        dz dzVar = dz.a;
        if (objA != dzVar) {
            objA = az2Var;
        }
        return objA == dzVar ? objA : az2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j, fy fyVar) {
        a aVar;
        if (fyVar instanceof a) {
            aVar = (a) fyVar;
            int i = aVar.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.u = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, fyVar);
            }
        } else {
            aVar = new a(this, fyVar);
        }
        Object obj = aVar.s;
        int i2 = aVar.u;
        dz dzVar = dz.a;
        if (i2 == 0) {
            wz2.a0(obj);
            k kVar = (k) this.b.invoke();
            long j2 = j - kVar.c;
            int i3 = kVar.b;
            aVar.r = this;
            aVar.u = 1;
            com.moloco.sdk.internal.error.crash.data.local.g gVar = (com.moloco.sdk.internal.error.crash.data.local.g) this.a.b;
            if (CoroutinesRoom.a((CrashReportDb_Impl) gVar.a, new c(gVar, j2, i3), aVar) != dzVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                wz2.a0(obj);
                return obj;
            }
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = aVar.r;
        wz2.a0(obj);
        com.facebook.ads.a aVar2 = this.a;
        aVar.r = null;
        aVar.u = 2;
        Serializable serializableN = aVar2.n(aVar);
        return serializableN == dzVar ? dzVar : serializableN;
    }

    public b(com.facebook.ads.a aVar, sr0 sr0Var) {
        sr0Var.getClass();
        this.a = aVar;
        this.b = sr0Var;
    }
}
