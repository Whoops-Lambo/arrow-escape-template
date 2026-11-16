package com.ironsource;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import defpackage.e80;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class H4 {

    @NotNull
    public static final a a = new a(null);

    @NotNull
    private static final Object b = new Object();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        private a() {
        }
    }

    @Nullable
    public final SQLiteDatabase a(boolean z, @NotNull SQLiteOpenHelper sQLiteOpenHelper) {
        SQLiteDatabase readableDatabase;
        sQLiteOpenHelper.getClass();
        synchronized (b) {
            try {
                if (z) {
                    readableDatabase = sQLiteOpenHelper.getWritableDatabase();
                } else {
                    readableDatabase = sQLiteOpenHelper.getReadableDatabase();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return readableDatabase;
    }

    public static /* synthetic */ SQLiteDatabase a(H4 h4, boolean z, SQLiteOpenHelper sQLiteOpenHelper, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return h4.a(z, sQLiteOpenHelper);
    }

    @Nullable
    public final SQLiteDatabase a(@NotNull SQLiteOpenHelper sQLiteOpenHelper) {
        sQLiteOpenHelper.getClass();
        return a(this, false, sQLiteOpenHelper, 1, null);
    }
}
