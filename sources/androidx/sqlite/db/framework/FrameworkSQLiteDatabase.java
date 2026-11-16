package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteProgram;
import defpackage.d;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Api30Impl", "Companion", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {
    public static final String[] b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] c = new String[0];
    public final SQLiteDatabase a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Companion;", "", "", "", "CONFLICT_VALUES", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Api30Impl;", "", "Landroid/database/sqlite/SQLiteDatabase;", "sQLiteDatabase", "", "sql", "", "bindArgs", "Laz2;", "a", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Api30Impl {
        @DoNotInline
        public final void a(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull String sql, @Nullable Object[] bindArgs) {
            sQLiteDatabase.getClass();
            sql.getClass();
            sQLiteDatabase.execPerConnectionSQL(sql, bindArgs);
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor A(SupportSQLiteQuery supportSQLiteQuery) {
        final FrameworkSQLiteDatabase$query$cursorFactory$1 frameworkSQLiteDatabase$query$cursorFactory$1 = new FrameworkSQLiteDatabase$query$cursorFactory$1(supportSQLiteQuery);
        Cursor cursorRawQueryWithFactory = this.a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) ((FrameworkSQLiteDatabase$query$cursorFactory$1) frameworkSQLiteDatabase$query$cursorFactory$1).invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, supportSQLiteQuery.getA(), c, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long C() {
        return this.a.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void H(String str) {
        this.a.execSQL(str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean I() {
        return this.a.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long O() {
        return this.a.getPageSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void P() {
        this.a.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void S() {
        this.a.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void c0(int i) {
        this.a.setVersion(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final SupportSQLiteStatement d0(String str) {
        SQLiteStatement sQLiteStatementCompileStatement = this.a.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new FrameworkSQLiteStatement(sQLiteStatementCompileStatement);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean f0() {
        return this.a.isReadOnly();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void g0(Object[] objArr) {
        this.a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final String getPath() {
        return this.a.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int getVersion() {
        return this.a.getVersion();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean h0() {
        return this.a.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor i0(String str) {
        return A(new SimpleSQLiteQuery(str, null));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean j0() {
        return this.a.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean l0() {
        return this.a.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void m0(long j) {
        this.a.setPageSize(j);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void u() {
        this.a.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final List v() {
        return this.a.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void y() {
        this.a.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean z() {
        return this.a.isDbLockedByCurrentThread();
    }

    public FrameworkSQLiteDatabase(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int q0(ContentValues contentValues, Object[] objArr) {
        String str;
        int i = 0;
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            int length = objArr.length + size;
            Object[] objArr2 = new Object[length];
            StringBuilder sb = new StringBuilder("UPDATE ");
            sb.append(b[3]);
            sb.append("WorkSpec SET ");
            for (String str2 : contentValues.keySet()) {
                if (i > 0) {
                    str = ",";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append(str2);
                objArr2[i] = contentValues.get(str2);
                sb.append("=?");
                i++;
            }
            for (int i2 = size; i2 < length; i2++) {
                objArr2[i2] = objArr[i2 - size];
            }
            if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
            }
            SupportSQLiteStatement supportSQLiteStatementD0 = d0(sb.toString());
            SimpleSQLiteQuery.Companion.a(supportSQLiteStatementD0, objArr2);
            return ((FrameworkSQLiteStatement) supportSQLiteStatementD0).b.executeUpdateDelete();
        }
        d.r("Empty values");
        return 0;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor x(final SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        String a = supportSQLiteQuery.getA();
        SQLiteDatabase.CursorFactory cursorFactory = new SQLiteDatabase.CursorFactory() { // from class: qr0
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                sQLiteQuery.getClass();
                supportSQLiteQuery.f(new FrameworkSQLiteProgram(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        };
        a.getClass();
        Cursor cursorRawQueryWithFactory = this.a.rawQueryWithFactory(cursorFactory, a, c, null, cancellationSignal);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }
}
