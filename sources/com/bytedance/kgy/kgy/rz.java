package com.bytedance.kgy.kgy;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import defpackage.h50;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class rz extends SQLiteOpenHelper implements gf {
    private final ConcurrentHashMap<Class<? extends com.bytedance.kgy.kgy>, fi<? extends com.bytedance.kgy.kgy>> ahm;
    private final Context kgy;

    public rz(Context context, ahm ahmVar, com.bytedance.kgy.rz.ct ctVar) {
        super(context, ahm("events_" + ctVar.uq()), (SQLiteDatabase.CursorFactory) null, 2);
        this.kgy = context;
        this.ahm = ahmVar.ahm();
        setWriteAheadLoggingEnabled(ctVar.yo());
    }

    private static String ahm(String str) {
        StringBuilder sbQ = h50.q(str, "_");
        sbQ.append(com.bytedance.kgy.kgy.ahm.ahm.kgy());
        return sbQ.toString();
    }

    public static void kgy(SQLiteDatabase sQLiteDatabase, ConcurrentHashMap<Class<? extends com.bytedance.kgy.kgy>, fi<? extends com.bytedance.kgy.kgy>> concurrentHashMap) {
        for (fi<? extends com.bytedance.kgy.kgy> fiVar : concurrentHashMap.values()) {
            try {
                sQLiteDatabase.execSQL(fiVar.yo());
                String strFi = fiVar.fi();
                String str = "CREATE INDEX IF NOT EXISTS idx_" + strFi + "_data_id ON " + strFi + " (data_id);";
                String str2 = "CREATE INDEX IF NOT EXISTS idx_" + strFi + "_create_time ON " + strFi + " (create_time);";
                sQLiteDatabase.execSQL(str);
                sQLiteDatabase.execSQL(str2);
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS idx_" + strFi + "_priority ON " + strFi + " (priority);");
            } catch (Exception unused) {
            }
        }
    }

    private void rz(SQLiteDatabase sQLiteDatabase) {
        Iterator<fi<? extends com.bytedance.kgy.kgy>> it = this.ahm.values().iterator();
        while (it.hasNext()) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(it.next().fi())));
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            rz(sQLiteDatabase);
            ahm(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            rz(sQLiteDatabase);
        } else if (i == 1) {
            try {
                Iterator<fi<? extends com.bytedance.kgy.kgy>> it = this.ahm.values().iterator();
                while (it.hasNext()) {
                    sQLiteDatabase.execSQL("ALTER TABLE " + it.next().fi() + " ADD COLUMN cypher_type INTEGER DEFAULT 0;");
                }
            } catch (Exception unused) {
                rz(sQLiteDatabase);
            }
        }
        ahm(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        kgy(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        ahm(sQLiteDatabase);
    }

    private void ahm(SQLiteDatabase sQLiteDatabase) {
        kgy(sQLiteDatabase, this.ahm);
    }

    public static void kgy(SQLiteDatabase sQLiteDatabase) {
        try {
            if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
                sQLiteDatabase.execSQL("PRAGMA synchronous = NORMAL;");
            }
        } catch (Exception unused) {
        }
    }

    public static String kgy(String str) {
        return ahm("events_".concat(String.valueOf(str)));
    }
}
