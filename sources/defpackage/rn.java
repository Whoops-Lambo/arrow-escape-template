package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.database.VersionTable;
import com.google.android.exoplayer2.util.Assertions;
import com.ironsource.C4664b4;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class rn implements tn {
    public static final String[] e = {"id", C4664b4.i.W, "metadata"};
    public final DatabaseProvider a;
    public final SparseArray b = new SparseArray();
    public String c;
    public String d;

    public static void d(DatabaseProvider databaseProvider, String str) {
        try {
            String str2 = "ExoPlayerCacheIndex" + str;
            SQLiteDatabase writableDatabase = databaseProvider.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                VersionTable.removeVersion(writableDatabase, 1, str);
                writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    @Override // defpackage.tn
    public final void a(qn qnVar) {
        this.b.put(qnVar.a, qnVar);
    }

    @Override // defpackage.tn
    public final void b(qn qnVar, boolean z) {
        int i = qnVar.a;
        SparseArray sparseArray = this.b;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    public final void c(SQLiteDatabase sQLiteDatabase, qn qnVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        un.b(qnVar.e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(qnVar.a));
        contentValues.put(C4664b4.i.W, qnVar.b);
        contentValues.put("metadata", byteArray);
        sQLiteDatabase.replaceOrThrow((String) Assertions.checkNotNull(this.d), null, contentValues);
    }

    @Override // defpackage.tn
    public final void delete() {
        d(this.a, (String) Assertions.checkNotNull(this.c));
    }

    public final void e(SQLiteDatabase sQLiteDatabase) throws DatabaseIOException {
        VersionTable.setVersion(sQLiteDatabase, 1, (String) Assertions.checkNotNull(this.c), 1);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) Assertions.checkNotNull(this.d)));
        sQLiteDatabase.execSQL("CREATE TABLE " + this.d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    @Override // defpackage.tn
    public final boolean exists() {
        return VersionTable.getVersion(this.a.getReadableDatabase(), 1, (String) Assertions.checkNotNull(this.c)) != -1;
    }

    @Override // defpackage.tn
    public final void load(HashMap map, SparseArray sparseArray) throws DatabaseIOException {
        DatabaseProvider databaseProvider = this.a;
        Assertions.checkState(this.b.size() == 0);
        try {
            if (VersionTable.getVersion(databaseProvider.getReadableDatabase(), 1, (String) Assertions.checkNotNull(this.c)) != 1) {
                SQLiteDatabase writableDatabase = databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    e(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            Cursor cursorQuery = databaseProvider.getReadableDatabase().query((String) Assertions.checkNotNull(this.d), e, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i = cursorQuery.getInt(0);
                    String str = (String) Assertions.checkNotNull(cursorQuery.getString(1));
                    map.put(str, new qn(i, str, un.a(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                    sparseArray.put(i, str);
                } catch (Throwable th2) {
                    if (cursorQuery == null) {
                        throw th2;
                    }
                    try {
                        cursorQuery.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            cursorQuery.close();
        } catch (SQLiteException e2) {
            map.clear();
            sparseArray.clear();
            throw new DatabaseIOException(e2);
        }
    }

    @Override // defpackage.tn
    public final void storeFully(HashMap map) throws DatabaseIOException {
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                e(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    c(writableDatabase, (qn) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.b.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    @Override // defpackage.tn
    public final void storeIncremental(HashMap map) throws DatabaseIOException {
        SparseArray sparseArray = this.b;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    qn qnVar = (qn) sparseArray.valueAt(i);
                    if (qnVar == null) {
                        writableDatabase.delete((String) Assertions.checkNotNull(this.d), "id = ?", new String[]{Integer.toString(sparseArray.keyAt(i))});
                    } else {
                        c(writableDatabase, qnVar);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public rn(DatabaseProvider databaseProvider) {
        this.a = databaseProvider;
    }

    @Override // defpackage.tn
    public final void initialize(long j) {
        String hexString = Long.toHexString(j);
        this.c = hexString;
        this.d = n30.y("ExoPlayerCacheIndex", hexString);
    }
}
