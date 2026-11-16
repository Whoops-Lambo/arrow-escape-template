package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "obj", "Landroidx/sqlite/db/SupportSQLiteStatement;", "invoke", "(Landroidx/sqlite/db/SupportSQLiteStatement;)Ljava/lang/Long;"}, k = 3, mv = {1, 7, 1}, xi = 48)
final class AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForLong$1 extends rc1 implements wr0 {
    static {
        new AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForLong$1(1);
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        SupportSQLiteStatement supportSQLiteStatement = (SupportSQLiteStatement) obj;
        supportSQLiteStatement.getClass();
        return Long.valueOf(supportSQLiteStatement.B());
    }
}
