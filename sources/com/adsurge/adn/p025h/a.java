package com.adsurge.adn.p025h;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class a extends SQLiteOpenHelper {
    public static volatile a a;

    public synchronized void a(List list, List list2) {
        SQLiteStatement sQLiteStatement;
        SQLiteDatabase writableDatabase;
        SQLiteStatement sQLiteStatementCompileStatement;
        SQLiteStatement sQLiteStatementCompileStatement2 = null;
        try {
            try {
                writableDatabase = getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    if (list2 == null || list2.isEmpty()) {
                        sQLiteStatementCompileStatement = null;
                    } else {
                        sQLiteStatementCompileStatement = writableDatabase.compileStatement("DELETE FROM behavior_record WHERE cids = ? AND action_types = ? AND timestamps = ? AND action_values = ?");
                        try {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                b bVar = (b) it.next();
                                if (bVar != null) {
                                    sQLiteStatementCompileStatement.clearBindings();
                                    a(sQLiteStatementCompileStatement, 1, bVar.c());
                                    sQLiteStatementCompileStatement.bindLong(2, bVar.a().b());
                                    sQLiteStatementCompileStatement.bindLong(3, bVar.d());
                                    sQLiteStatementCompileStatement.bindLong(4, bVar.b());
                                    sQLiteStatementCompileStatement.execute();
                                }
                            }
                        } catch (Throwable unused) {
                            sQLiteStatement = sQLiteStatementCompileStatement2;
                            sQLiteStatementCompileStatement2 = sQLiteStatementCompileStatement;
                            if (sQLiteStatementCompileStatement2 != null) {
                                sQLiteStatementCompileStatement2.close();
                            }
                            if (sQLiteStatement != null) {
                                sQLiteStatementCompileStatement2 = sQLiteStatement;
                            }
                            c(writableDatabase);
                        }
                    }
                    if (list != null && !list.isEmpty()) {
                        sQLiteStatementCompileStatement2 = writableDatabase.compileStatement("INSERT INTO behavior_record (cids, action_types, timestamps, action_values) VALUES (?, ?, ?, ?)");
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            b bVar2 = (b) it2.next();
                            if (bVar2 != null && !bVar2.e()) {
                                sQLiteStatementCompileStatement2.clearBindings();
                                a(sQLiteStatementCompileStatement2, 1, bVar2.c());
                                sQLiteStatementCompileStatement2.bindLong(2, bVar2.a().b());
                                sQLiteStatementCompileStatement2.bindLong(3, bVar2.d());
                                sQLiteStatementCompileStatement2.bindLong(4, bVar2.b());
                                sQLiteStatementCompileStatement2.executeInsert();
                            }
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    if (sQLiteStatementCompileStatement != null) {
                        sQLiteStatementCompileStatement.close();
                    }
                    if (sQLiteStatementCompileStatement2 != null) {
                        sQLiteStatementCompileStatement2.close();
                    }
                } catch (Throwable unused2) {
                    sQLiteStatement = null;
                }
            } catch (Throwable unused3) {
                sQLiteStatement = null;
                writableDatabase = null;
            }
            c(writableDatabase);
        } catch (Throwable th) {
            throw th;
        }
    }

    public a() {
        super(new com.adsurge.adn.C0.a(com.adsurge.adn.J.a.d().a(), "odc_database"), "odc_behavior.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public final void b(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS behavior_record");
    }

    public final void c(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        b(sQLiteDatabase);
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        b(sQLiteDatabase);
        a(sQLiteDatabase);
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS behavior_record (cids TEXT, action_types INTEGER, timestamps INTEGER, action_values INTEGER)");
    }

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                try {
                    if (a == null) {
                        a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a;
    }

    public final void a(SQLiteStatement sQLiteStatement, int i, String str) {
        if (str == null) {
            sQLiteStatement.bindNull(i);
        } else {
            sQLiteStatement.bindString(i, str);
        }
    }

    public synchronized List a(int i) {
        ArrayList arrayList;
        Cursor cursorRawQuery;
        arrayList = new ArrayList();
        try {
            cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM (SELECT * FROM behavior_record ORDER BY timestamps DESC LIMIT ?) ORDER BY timestamps ASC", new String[]{String.valueOf(i)});
            while (cursorRawQuery.moveToNext()) {
                try {
                    arrayList.add(new b(cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("cids")), d.a(cursorRawQuery.getInt(cursorRawQuery.getColumnIndexOrThrow("action_types"))), cursorRawQuery.getLong(cursorRawQuery.getColumnIndexOrThrow("action_values")), cursorRawQuery.getLong(cursorRawQuery.getColumnIndexOrThrow("timestamps"))));
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            cursorRawQuery = null;
        }
        a(cursorRawQuery);
        return arrayList;
    }

    public final void a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable unused) {
            }
        }
    }
}
