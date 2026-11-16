package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import defpackage.cm2;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/SharedSQLiteStatement;", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
public abstract class SharedSQLiteStatement {
    public final RoomDatabase a;
    public final AtomicBoolean b;
    public final cm2 c;

    public abstract String b();

    public final SupportSQLiteStatement a() {
        RoomDatabase roomDatabase = this.a;
        roomDatabase.assertNotMainThread();
        return this.b.compareAndSet(false, true) ? (SupportSQLiteStatement) this.c.getValue() : roomDatabase.compileStatement(b());
    }

    public SharedSQLiteStatement(RoomDatabase roomDatabase) {
        roomDatabase.getClass();
        this.a = roomDatabase;
        this.b = new AtomicBoolean(false);
        this.c = new cm2(new SharedSQLiteStatement$stmt$2(this));
    }

    public final void c(SupportSQLiteStatement supportSQLiteStatement) {
        supportSQLiteStatement.getClass();
        if (supportSQLiteStatement == ((SupportSQLiteStatement) this.c.getValue())) {
            this.b.set(false);
        }
    }
}
