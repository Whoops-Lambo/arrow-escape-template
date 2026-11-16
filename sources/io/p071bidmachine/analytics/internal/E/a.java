package io.p071bidmachine.analytics.internal.E;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.ironsource.G5;
import defpackage.az2;
import defpackage.e80;
import defpackage.j52;
import defpackage.nq2;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends SQLiteOpenHelper {
    public static final C1570a a = new C1570a(null);

    public a(Context context) {
        super(context, "BMAnalytics.db", (SQLiteDatabase.CursorFactory) null, 3);
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.E.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class C1570a {
        public /* synthetic */ C1570a(e80 e80Var) {
            this();
        }

        private C1570a() {
        }
    }

    private final Object a(SQLiteDatabase sQLiteDatabase) {
        try {
            Cursor cursorQuery = sQLiteDatabase.query("sqlite_master", new String[]{"name"}, "type = ?", new String[]{G5.R}, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    try {
                        String string = cursorQuery.getString(0);
                        if (!s71.b(string, "android_metadata") && !s71.b(string, "sqlite_master")) {
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + string);
                        }
                    } catch (Throwable unused) {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        nq2.e(cursorQuery, th);
                        throw th2;
                    }
                }
            }
            az2 az2Var = az2.a;
            cursorQuery.close();
            return az2Var;
        } catch (Throwable th3) {
            return new j52(th3);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE monitor_record (id TEXT,name TEXT,timestamp INTEGER,session_id TEXT,data BLOB,error BLOB,is_reserved INTEGER DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE TABLE reader_record (id TEXT,name TEXT,timestamp INTEGER,data_hash TEXT,rule TEXT,error BLOB,is_dirty INTEGER,is_reserved INTEGER DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE TABLE irec (id TEXT,sid TEXT,itm TEXT,iat INTEGER,irv INTEGER,itp INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        a(sQLiteDatabase);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS monitor_record");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS reader_record");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS irec");
        onCreate(sQLiteDatabase);
    }
}
