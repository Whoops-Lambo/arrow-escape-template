package com.bytedance.sdk.openadsdk.um.kgy;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.bytedance.sdk.openadsdk.fpz.rz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ahm extends com.bytedance.sdk.component.uq.kgy {
    private static volatile ahm kgy;

    @Override // com.bytedance.sdk.component.uq.kgy
    public int uq() {
        return 2;
    }

    public static ahm fi() {
        if (kgy == null) {
            synchronized (ahm.class) {
                try {
                    if (kgy == null) {
                        kgy = new ahm(com.bytedance.sdk.openadsdk.um.kgy.kgy());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }

    @Override // com.bytedance.sdk.component.uq.kgy
    public void ahm(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )");
    }

    @Override // com.bytedance.sdk.component.uq.kgy
    public String kgy() {
        return "MonitorSQLiteOpenHelper";
    }

    private ahm(Context context) {
        super(context);
    }

    public SQLiteDatabase gf() {
        try {
            SQLiteOpenHelper sQLiteOpenHelperYo = yo();
            if (sQLiteOpenHelperYo != null) {
                SQLiteDatabase writableDatabase = sQLiteOpenHelperYo.getWritableDatabase();
                if (writableDatabase.isOpen()) {
                    return writableDatabase;
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EeriFP4T/bB74=", "duEjnBeze/SxZt5JiT6wLVXGKJkTuXvx0g==", "XOs5uAyyYNOPWOBPhQWhKlfrCZQXvWvGk08=", 93);
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    public SQLiteDatabase ra() {
        try {
            SQLiteOpenHelper sQLiteOpenHelperYo = yo();
            if (sQLiteOpenHelperYo != null) {
                SQLiteDatabase readableDatabase = sQLiteOpenHelperYo.getReadableDatabase();
                if (readableDatabase.isOpen()) {
                    return readableDatabase;
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EeriFP4T/bB74=", "duEjnBeze/SxZt5JiT6wLVXGKJkTuXvx0g==", "XOs5uAyyYNOPWOVYjRWhKlfrCZQXvWvGk08=", 109);
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.uq.kgy
    public void kgy(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // com.bytedance.sdk.component.uq.kgy
    public String ahm() {
        return "pag_monitor";
    }
}
