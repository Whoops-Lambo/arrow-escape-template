package com.bytedance.sdk.component.yo.kgy.kgy.kgy;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.noq;
import com.bytedance.sdk.component.yo.kgy.yo;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class uq extends SQLiteOpenHelper {
    final Context kgy;

    public uq(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.kgy = context;
    }

    private ArrayList<String> rz(SQLiteDatabase sQLiteDatabase) {
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
        } catch (Exception unused) {
        }
        return arrayList;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i <= i2) {
                kgy(sQLiteDatabase);
            } else {
                ahm(sQLiteDatabase);
                kgy(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    private void ahm(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListRz = rz(sQLiteDatabase);
        if (arrayListRz != null && arrayListRz.size() > 0) {
            int size = arrayListRz.size();
            int i = 0;
            while (i < size) {
                String str = arrayListRz.get(i);
                i++;
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str + " ;");
            }
        }
    }

    private void kgy(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.kgy.ahm(yo.noq().rz().ahm()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.uq.rz(yo.noq().rz().kgy()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.yo.rz(yo.noq().rz().uq()));
        sQLiteDatabase.execSQL(noq.kgy(yo.noq().rz().ct()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.yo.kgy.noq.noq.ahm());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            kgy(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }
}
