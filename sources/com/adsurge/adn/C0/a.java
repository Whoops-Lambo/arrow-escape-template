package com.adsurge.adn.C0;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import defpackage.h50;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class a extends ContextWrapper {
    public final String a;

    @Override // android.content.ContextWrapper, android.content.Context
    public SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        int i2 = (i & 8) != 0 ? C.ENCODING_PCM_32BIT : 268435456;
        File databasePath = getDatabasePath(str);
        SQLiteDatabase sQLiteDatabaseOpenDatabase = databasePath != null ? SQLiteDatabase.openDatabase(databasePath.getPath(), cursorFactory, i2, databaseErrorHandler) : null;
        StringBuilder sbR = h50.r("openOrCreateDatabase(", str, ",,) = ");
        sbR.append(sQLiteDatabaseOpenDatabase != null ? sQLiteDatabaseOpenDatabase.getPath() : null);
        com.adsurge.adn.J0.a.a(sbR.toString(), new Object[0]);
        return sQLiteDatabaseOpenDatabase;
    }

    public a(Context context, String str) {
        super(context);
        if (TextUtils.isEmpty(str)) {
            this.a = "gdt_database";
        } else {
            this.a = str;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public File getDatabasePath(String str) {
        File filesDir = getFilesDir();
        String path = null;
        if (filesDir != null) {
            if (this.a != null) {
                File file = new File(filesDir, this.a);
                if (file.exists() || file.mkdir()) {
                    filesDir = file;
                }
            }
            File file2 = new File(filesDir, str);
            if (!file2.exists()) {
                com.adsurge.adn.J0.a.a("create database file", new Object[0]);
                try {
                    if (!file2.createNewFile()) {
                        file2 = super.getDatabasePath(str);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    file2 = super.getDatabasePath(str);
                }
            }
            StringBuilder sbR = h50.r("getDatabasePath(", str, ") = ");
            if (file2 != null) {
                path = file2.getPath();
            }
            sbR.append(path);
            sbR.append(", this:");
            sbR.append(this);
            com.adsurge.adn.J0.a.a(sbR.toString(), new Object[0]);
            return file2;
        }
        File databasePath = super.getDatabasePath(str);
        StringBuilder sbR2 = h50.r("getDatabasePath(", str, ") = ");
        if (databasePath != null) {
            path = databasePath.getPath();
        }
        sbR2.append(path);
        com.adsurge.adn.J0.a.a(sbR2.toString(), new Object[0]);
        return databasePath;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        return openOrCreateDatabase(str, i, cursorFactory, null);
    }
}
