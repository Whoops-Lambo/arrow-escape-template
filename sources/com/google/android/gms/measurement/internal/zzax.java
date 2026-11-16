package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcd;
import defpackage.d;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzax {
    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: SQLiteException -> 0x00b7, LOOP:0: B:29:0x0080->B:32:0x008a, LOOP_END, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:38:0x00bc->B:43:0x00ce, LOOP_START, PHI: r1
  0x00bc: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:37:0x00ba, B:43:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:69:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[SYNTHETIC] */
    public static void a(zzgu zzguVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        Throwable th;
        Cursor cursorQuery;
        HashSet hashSet;
        Cursor cursorRawQuery;
        int i;
        int i2;
        if (zzguVar == null) {
            d.r("Monitor must not be null");
            return;
        }
        Cursor cursor = null;
        try {
            try {
                sQLiteDatabase2 = sQLiteDatabase;
                try {
                    cursorQuery = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                    try {
                        try {
                            boolean zMoveToFirst = cursorQuery.moveToFirst();
                            cursorQuery.close();
                            if (!zMoveToFirst) {
                                sQLiteDatabase2.execSQL(str2);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        zzguVar.i.c(str, e, "Error querying for table");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    cursorQuery = null;
                    zzguVar.i.c(str, e, "Error querying for table");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    sQLiteDatabase2.execSQL(str2);
                    hashSet = new HashSet();
                    StringBuilder sb = new StringBuilder(str.length() + 22);
                    sb.append("SELECT * FROM ");
                    sb.append(str);
                    sb.append(" LIMIT 0");
                    cursorRawQuery = sQLiteDatabase2.rawQuery(sb.toString(), null);
                    try {
                        Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                        cursorRawQuery.close();
                        for (String str4 : str3.split(",")) {
                            if (hashSet.remove(str4)) {
                                StringBuilder sb2 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                                sb2.append("Table ");
                                sb2.append(str);
                                sb2.append(" is missing required column: ");
                                sb2.append(str4);
                                throw new SQLiteException(sb2.toString());
                            }
                        }
                        if (strArr != null) {
                            for (i = 0; i < strArr.length; i += 2) {
                                if (!hashSet.remove(strArr[i])) {
                                    sQLiteDatabase2.execSQL(strArr[i + 1]);
                                }
                            }
                        }
                        if (hashSet.isEmpty()) {
                        }
                        zzguVar.i.c(str, TextUtils.join(", ", hashSet), "Table has extra columns. table, columns");
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                sQLiteDatabase2 = sQLiteDatabase;
            }
            try {
                hashSet = new HashSet();
                StringBuilder sb3 = new StringBuilder(str.length() + 22);
                sb3.append("SELECT * FROM ");
                sb3.append(str);
                sb3.append(" LIMIT 0");
                cursorRawQuery = sQLiteDatabase2.rawQuery(sb3.toString(), null);
                Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                cursorRawQuery.close();
                while (i2 < r0) {
                    if (hashSet.remove(str4)) {
                        StringBuilder sb4 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                        sb4.append("Table ");
                        sb4.append(str);
                        sb4.append(" is missing required column: ");
                        sb4.append(str4);
                        throw new SQLiteException(sb4.toString());
                    }
                }
                if (strArr != null) {
                    while (i < strArr.length) {
                        if (!hashSet.remove(strArr[i])) {
                            sQLiteDatabase2.execSQL(strArr[i + 1]);
                        }
                    }
                }
                if (hashSet.isEmpty()) {
                    zzguVar.i.c(str, TextUtils.join(", ", hashSet), "Table has extra columns. table, columns");
                }
            } catch (SQLiteException e4) {
                zzguVar.f.b(str, "Failed to verify columns on table that was just created");
                throw e4;
            }
        } catch (Throwable th4) {
            th = th4;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    public static void b(zzgu zzguVar, SQLiteDatabase sQLiteDatabase) {
        if (zzguVar == null) {
            d.r("Monitor must not be null");
            return;
        }
        zzgs zzgsVar = zzguVar.i;
        String path = sQLiteDatabase.getPath();
        int i = zzcd.a;
        File file = new File(path);
        if (!file.setReadable(false, false)) {
            zzgsVar.a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzgsVar.a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzgsVar.a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzgsVar.a("Failed to turn on database write permission for owner");
    }
}
