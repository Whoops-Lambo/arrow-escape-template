package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/QueryInterceptorStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class QueryInterceptorStatement implements SupportSQLiteStatement {
    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long B() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final String Q() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long a0() {
        throw null;
    }

    public final void b(int i, Object obj) {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final void execute() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void s(int i) {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final int w() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void J(int i, double d) {
        b(i, Double.valueOf(d));
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void l(int i, String str) {
        str.getClass();
        b(i, str);
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void m(int i, long j) {
        b(i, Long.valueOf(j));
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void p(int i, byte[] bArr) {
        b(i, bArr);
        throw null;
    }
}
