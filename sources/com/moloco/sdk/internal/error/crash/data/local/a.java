package com.moloco.sdk.internal.error.crash.data.local;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public final CrashReportDb a(Context context) {
        CrashReportDb crashReportDb;
        context.getClass();
        CrashReportDb crashReportDb2 = CrashReportDb.b;
        if (crashReportDb2 == null) {
            synchronized (this) {
                crashReportDb = CrashReportDb.b;
                if (crashReportDb == null) {
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    RoomDatabase.Builder builderA = Room.a(applicationContext, CrashReportDb.class, "moloco-crash-reports-db");
                    builderA.j = true;
                    RoomDatabase roomDatabaseB = builderA.b();
                    CrashReportDb.b = (CrashReportDb) roomDatabaseB;
                    crashReportDb = (CrashReportDb) roomDatabaseB;
                }
            }
            return crashReportDb;
        }
        return crashReportDb2;
    }
}
