package androidx.room;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/DatabaseConfiguration;", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class DatabaseConfiguration {
    public final Context a;
    public final String b;
    public final SupportSQLiteOpenHelper.Factory c;
    public final RoomDatabase.MigrationContainer d;
    public final List e;
    public final boolean f;
    public final RoomDatabase.JournalMode g;
    public final Executor h;
    public final Executor i;
    public final boolean j;
    public final boolean k;
    public final Set l;
    public final List m;
    public final List n;

    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, ArrayList arrayList, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z2, boolean z3, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        migrationContainer.getClass();
        executor.getClass();
        executor2.getClass();
        arrayList2.getClass();
        arrayList3.getClass();
        this.a = context;
        this.b = str;
        this.c = factory;
        this.d = migrationContainer;
        this.e = arrayList;
        this.f = z;
        this.g = journalMode;
        this.h = executor;
        this.i = executor2;
        this.j = z2;
        this.k = z3;
        this.l = linkedHashSet;
        this.m = arrayList2;
        this.n = arrayList3;
    }
}
