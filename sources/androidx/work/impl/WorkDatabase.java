package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import defpackage.hl2;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@TypeConverters
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Database
@RestrictTo
public abstract class WorkDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/WorkDatabase$Companion;", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    public abstract DependencyDao dependencyDao();

    public abstract PreferenceDao preferenceDao();

    public abstract SystemIdInfoDao systemIdInfoDao();

    public abstract WorkNameDao workNameDao();

    public abstract WorkProgressDao workProgressDao();

    public abstract WorkSpecDao workSpecDao();

    public abstract WorkTagDao workTagDao();

    @NotNull
    public static final WorkDatabase create(@NotNull Context context, @NotNull Executor executor, boolean z) {
        RoomDatabase.Builder builderA;
        INSTANCE.getClass();
        context.getClass();
        executor.getClass();
        int i = 11;
        if (z) {
            builderA = new RoomDatabase.Builder(context, WorkDatabase.class, null);
            builderA.j = true;
        } else {
            builderA = Room.a(context, WorkDatabase.class, "androidx.work.workdb");
            builderA.i = new hl2(context, i);
        }
        builderA.g = executor;
        builderA.d.add(CleanupCallback.a);
        builderA.a(Migration_1_2.c);
        builderA.a(new RescheduleMigration(context, 2, 3));
        builderA.a(Migration_3_4.c);
        builderA.a(Migration_4_5.c);
        builderA.a(new RescheduleMigration(context, 5, 6));
        builderA.a(Migration_6_7.c);
        builderA.a(Migration_7_8.c);
        builderA.a(Migration_8_9.c);
        builderA.a(new WorkMigration9To10(context));
        builderA.a(new RescheduleMigration(context, 10, 11));
        builderA.a(Migration_11_12.c);
        builderA.a(Migration_12_13.c);
        builderA.a(Migration_15_16.c);
        builderA.l = false;
        builderA.m = true;
        return (WorkDatabase) builderA.b();
    }
}
