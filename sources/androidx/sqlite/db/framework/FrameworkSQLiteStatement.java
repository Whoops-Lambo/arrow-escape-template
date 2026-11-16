package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteStatement;", "Landroidx/sqlite/db/framework/FrameworkSQLiteProgram;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FrameworkSQLiteStatement extends FrameworkSQLiteProgram implements SupportSQLiteStatement {
    public final SQLiteStatement b;

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long B() {
        return this.b.simpleQueryForLong();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final String Q() {
        return this.b.simpleQueryForString();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long a0() {
        return this.b.executeInsert();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final void execute() {
        this.b.execute();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final int w() {
        return this.b.executeUpdateDelete();
    }

    public FrameworkSQLiteStatement(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.b = sQLiteStatement;
    }
}
