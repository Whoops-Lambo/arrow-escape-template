package com.bytedance.sdk.openadsdk.um.kgy;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.bytedance.sdk.component.utils.gm;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class kgy extends SQLiteOpenHelper {
    private static volatile kgy ahm;
    final Context kgy;

    private kgy(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        this.kgy = context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private ArrayList<String> ahm(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                cursorRawQuery.close();
            }
            return arrayList;
        } catch (Exception e) {
            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EeriFP4T/bB74=", "duEjnBeze/SxZt5JiT6wLVXGKJkTuXs=", "V+c+gSeeXcaCRtJO", 179);
            sx.rz("MonitorSQLiteOpenHelper", e.getMessage());
            return arrayList;
        }
    }

    private static kgy rz() {
        if (ahm == null) {
            synchronized (kgy.class) {
                try {
                    if (ahm == null) {
                        if (gm.kgy(com.bytedance.sdk.openadsdk.um.kgy.kgy())) {
                            ahm = new kgy(com.bytedance.sdk.openadsdk.um.kgy.kgy(), "pag_monitor.db");
                        } else {
                            ahm = new kgy(com.bytedance.sdk.openadsdk.um.kgy.kgy(), "pag_monitor_" + gm.rz(com.bytedance.sdk.openadsdk.um.kgy.kgy()) + ".db");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ahm;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )");
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EeriFP4T/bB74=", "duEjnBeze/SxZt5JiT6wLVXGKJkTuXs=", "VOAOhwa9fcI=", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            Log.e("MonitorSQLiteOpenHelper", th.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i <= i2) {
                onCreate(sQLiteDatabase);
            } else {
                kgy(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            }
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EeriFP4T/bB74=", "duEjnBeze/SxZt5JiT6wLVXGKJkTuXs=", "VOAJmhSybtWBTtI=", 147);
        }
    }

    private void kgy(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListAhm = ahm(sQLiteDatabase);
        if (arrayListAhm != null && arrayListAhm.size() > 0) {
            int size = arrayListAhm.size();
            int i = 0;
            while (i < size) {
                String str = arrayListAhm.get(i);
                i++;
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str + " ;");
            }
        }
    }

    public static SQLiteDatabase kgy() {
        try {
            kgy kgyVarRz = rz();
            if (kgyVarRz == null) {
                return null;
            }
            SQLiteDatabase writableDatabase = kgyVarRz.getWritableDatabase();
            if (writableDatabase.isOpen()) {
                return writableDatabase;
            }
            return null;
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EeriFP4T/bB74=", "duEjnBeze/SxZt5JiT6wLVXGKJkTuXs=", "XOs5uAyyYNOPWOBPhQWhKlfrCZQXvWvGk08=", 75);
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    public static SQLiteDatabase ahm() {
        try {
            kgy kgyVarRz = rz();
            if (kgyVarRz == null) {
                return null;
            }
            SQLiteDatabase readableDatabase = kgyVarRz.getReadableDatabase();
            if (readableDatabase.isOpen()) {
                return readableDatabase;
            }
            return null;
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EeriFP4T/bB74=", "duEjnBeze/SxZt5JiT6wLVXGKJkTuXs=", "XOs5uAyyYNOPWOVYjRWhKlfrCZQXvWvGk08=", 91);
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }
}
