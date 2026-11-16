package com.mbridge.msdk.tracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
class c {
    private final b a;
    private final String b;
    private final Object c = new Object();

    public long a(i iVar) {
        SQLiteDatabase writableDatabase;
        synchronized (this.c) {
            long jInsert = -1;
            if (y.b(this.a)) {
                return -1L;
            }
            try {
                writableDatabase = this.a.getWritableDatabase();
            } catch (Exception e) {
                if (a.a) {
                    Log.e("TrackManager", "insert getWritableDatabase: " + e.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return -1L;
            }
            try {
                try {
                    a(writableDatabase);
                    ContentValues contentValues = new ContentValues(16);
                    e eVarD = iVar.d();
                    contentValues.put("name", eVarD.f());
                    contentValues.put("type", Integer.valueOf(eVarD.l()));
                    contentValues.put("time_stamp", Long.valueOf(eVarD.k()));
                    contentValues.put("properties", eVarD.h().toString());
                    contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(eVarD.g()));
                    contentValues.put("state", Integer.valueOf(iVar.i()));
                    contentValues.put("report_count", Integer.valueOf(iVar.g()));
                    contentValues.put("uuid", eVarD.m());
                    contentValues.put("ignore_max_timeout", Integer.valueOf(!eVarD.o() ? 1 : 0));
                    contentValues.put("ignore_max_retry_times", Integer.valueOf(!eVarD.n() ? 1 : 0));
                    contentValues.put("invalid_time", Long.valueOf(iVar.f()));
                    jInsert = writableDatabase.insert(this.b, null, contentValues);
                    d(writableDatabase);
                    b(writableDatabase);
                } catch (Throwable th) {
                    b(writableDatabase);
                    throw th;
                }
            } catch (Exception e2) {
                if (a.a) {
                    Log.e("TrackManager", "insert: " + e2.getMessage());
                }
                b(writableDatabase);
            }
            return jInsert;
        }
    }

    public int b() {
        SQLiteDatabase writableDatabase;
        synchronized (this.c) {
            int iMax = 0;
            if (y.b(this.a)) {
                return 0;
            }
            Cursor cursorQuery = null;
            try {
                writableDatabase = this.a.getWritableDatabase();
            } catch (Exception e) {
                if (a.a) {
                    Log.e("TrackManager", "getAvailableCount getWritableDatabase: " + e.getMessage());
                }
                writableDatabase = null;
            }
            try {
                if (c(writableDatabase)) {
                    return 0;
                }
                a(writableDatabase);
                cursorQuery = writableDatabase.query(this.b, null, "state = ? OR state = ?", new String[]{String.valueOf(3), String.valueOf(0)}, null, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToNext()) {
                    iMax = Math.max(cursorQuery.getCount(), 0);
                }
                d(writableDatabase);
                return iMax;
            } catch (Exception e2) {
                if (a.a) {
                    Log.e("TrackManager", "getAvailableCount: " + e2.getMessage());
                }
            } finally {
                b(writableDatabase);
                y.a(cursorQuery);
            }
        }
    }

    public void c(List<i> list) {
        SQLiteDatabase writableDatabase;
        synchronized (this.c) {
            if (y.b(this.a) || y.b((List<?>) list)) {
                return;
            }
            try {
                writableDatabase = this.a.getWritableDatabase();
            } catch (Exception e) {
                if (a.a) {
                    Log.e("TrackManager", "updateReportStateSuccess getWritableDatabase: " + e.getMessage());
                }
                writableDatabase = null;
            }
            try {
                if (c(writableDatabase)) {
                    return;
                }
                a(writableDatabase);
                for (i iVar : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", (Integer) 2);
                    writableDatabase.update(this.b, contentValues, "uuid = ?", new String[]{iVar.j()});
                }
                d(writableDatabase);
            } catch (Exception e2) {
                if (a.a) {
                    Log.e("TrackManager", "updateReportStateSuccess: " + e2.getMessage());
                }
            } finally {
                b(writableDatabase);
            }
        }
    }

    public c(b bVar, String str) {
        this.a = bVar;
        this.b = str;
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        if (!y.b(sQLiteDatabase)) {
            try {
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e) {
                if (a.a) {
                    Log.e("TrackManager", "transactionSuccess: ", e);
                }
            }
        }
    }

    private static boolean c(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase == null || !sQLiteDatabase.isOpen() || sQLiteDatabase.isReadOnly();
    }

    public void b(List<i> list) {
        SQLiteDatabase writableDatabase;
        synchronized (this.c) {
            if (y.b(this.a) || y.b((List<?>) list)) {
                return;
            }
            try {
                writableDatabase = this.a.getWritableDatabase();
            } catch (Exception e) {
                if (a.a) {
                    Log.e("TrackManager", "updateReportStateReporting getWritableDatabase: " + e.getMessage());
                }
                writableDatabase = null;
            }
            try {
                if (c(writableDatabase)) {
                    return;
                }
                a(writableDatabase);
                for (i iVar : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", (Integer) 1);
                    writableDatabase.update(this.b, contentValues, "uuid = ?", new String[]{iVar.j()});
                }
                d(writableDatabase);
            } catch (Exception e2) {
                if (a.a) {
                    Log.e("TrackManager", "updateReportStateReporting: " + e2.getMessage());
                }
            } finally {
                b(writableDatabase);
            }
        }
    }

    public void c() {
        SQLiteDatabase writableDatabase;
        synchronized (this.c) {
            if (y.b(this.a)) {
                return;
            }
            try {
                writableDatabase = this.a.getWritableDatabase();
            } catch (Exception e) {
                if (a.a) {
                    Log.e("TrackManager", "updateReportStateForReporting getWritableDatabase: " + e.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return;
            }
            try {
                try {
                    a(writableDatabase);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", (Integer) 3);
                    contentValues.put("report_error_message", "update from reporting");
                    writableDatabase.update(this.b, contentValues, "state = ?", new String[]{String.valueOf(1)});
                    d(writableDatabase);
                    b(writableDatabase);
                } catch (Throwable th) {
                    b(writableDatabase);
                    throw th;
                }
            } catch (Exception e2) {
                if (a.a) {
                    Log.e("TrackManager", "updateReportStateForReporting: " + e2.getMessage());
                }
                b(writableDatabase);
            }
        }
    }

    private static void b(SQLiteDatabase sQLiteDatabase) {
        if (y.b(sQLiteDatabase) || !sQLiteDatabase.inTransaction()) {
            return;
        }
        try {
            sQLiteDatabase.endTransaction();
        } catch (Exception e) {
            if (a.a) {
                Log.e("TrackManager", "endTransaction: ", e);
            }
        }
    }

    public List<i> a(int i) {
        SQLiteDatabase writableDatabase;
        List<i> list;
        synchronized (this.c) {
            Cursor cursor = null;
            List<i> listB = null;
            cursor = null;
            if (y.b(this.a)) {
                return null;
            }
            try {
                writableDatabase = this.a.getWritableDatabase();
            } catch (Exception e) {
                if (a.a) {
                    Log.e("TrackManager", "getAvailable getWritableDatabase: " + e.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return null;
            }
            try {
                try {
                    a(writableDatabase);
                    Cursor cursorQuery = writableDatabase.query(this.b, null, "state = ? OR state = ?", new String[]{String.valueOf(0), String.valueOf(3)}, null, null, "priority DESC", String.valueOf(i));
                    try {
                        listB = y.b(cursorQuery);
                        d(writableDatabase);
                        b(writableDatabase);
                        y.a(cursorQuery);
                    } catch (Exception e2) {
                        e = e2;
                        List<i> list2 = listB;
                        cursor = cursorQuery;
                        list = list2;
                        if (a.a) {
                            Log.e("TrackManager", "getAvailable: " + e.getMessage());
                        }
                        b(writableDatabase);
                        y.a(cursor);
                        listB = list;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        b(writableDatabase);
                        y.a(cursor);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e = e3;
                list = null;
            }
            return listB;
        }
    }

    public void a(List<i> list) {
        SQLiteDatabase writableDatabase;
        synchronized (this.c) {
            if (y.b(this.a) || y.b((List<?>) list)) {
                return;
            }
            try {
                writableDatabase = this.a.getWritableDatabase();
            } catch (Exception e) {
                if (a.a) {
                    Log.e("TrackManager", "updateReportStateFailed getWritableDatabase: " + e.getMessage());
                }
                writableDatabase = null;
            }
            try {
                if (c(writableDatabase)) {
                    return;
                }
                a(writableDatabase);
                for (i iVar : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", Integer.valueOf(iVar.i()));
                    contentValues.put("report_count", Integer.valueOf(iVar.g()));
                    String strH = iVar.h();
                    if (!TextUtils.isEmpty(strH)) {
                        contentValues.put("report_error_message", strH);
                    }
                    writableDatabase.update(this.b, contentValues, "uuid = ?", new String[]{iVar.j()});
                }
                d(writableDatabase);
            } catch (Exception e2) {
                if (a.a) {
                    Log.e("TrackManager", "updateReportStateFailed: " + e2.getMessage());
                }
            } finally {
                b(writableDatabase);
            }
        }
    }

    public int a() {
        SQLiteDatabase writableDatabase;
        synchronized (this.c) {
            int iDelete = -1;
            if (y.b(this.a)) {
                return -1;
            }
            try {
                writableDatabase = this.a.getWritableDatabase();
            } catch (Exception e) {
                if (a.a) {
                    Log.e("TrackManager", "deleteInvalidEvents getWritableDatabase: " + e.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return -1;
            }
            try {
                try {
                    a(writableDatabase);
                    iDelete = writableDatabase.delete(this.b, "state = ? OR state = ?", new String[]{String.valueOf(-1), String.valueOf(2)});
                    d(writableDatabase);
                    b(writableDatabase);
                } catch (Throwable th) {
                    b(writableDatabase);
                    throw th;
                }
            } catch (Exception e2) {
                if (a.a) {
                    Log.e("TrackManager", "deleteInvalidEvents: " + e2.getMessage());
                }
                b(writableDatabase);
            }
            return iDelete;
        }
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.beginTransaction();
        } catch (Exception e) {
            if (a.a) {
                Log.e("TrackManager", "beginTransaction: ", e);
            }
        }
    }
}
