package com.mbridge.msdk.util;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static boolean a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                if (sQLiteDatabase.isOpen() && !sQLiteDatabase.isReadOnly()) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
