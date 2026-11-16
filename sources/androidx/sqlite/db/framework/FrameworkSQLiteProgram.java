package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.db.SupportSQLiteProgram;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteProgram;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class FrameworkSQLiteProgram implements SupportSQLiteProgram {
    public final SQLiteProgram a;

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void J(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void m(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void p(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void s(int i) {
        this.a.bindNull(i);
    }

    public FrameworkSQLiteProgram(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.a = sQLiteProgram;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void l(int i, String str) {
        str.getClass();
        this.a.bindString(i, str);
    }
}
