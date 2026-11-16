package androidx.room.migration;

import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class Migration {
    public final int a;
    public final int b;

    public abstract void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

    public Migration(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
