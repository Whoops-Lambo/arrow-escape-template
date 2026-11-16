package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.utils.j;
import defpackage.ak1;
import defpackage.b8;
import defpackage.d;
import defpackage.e32;
import defpackage.gg0;
import defpackage.hg0;
import defpackage.hl2;
import defpackage.kg0;
import defpackage.pv1;
import defpackage.rc1;
import defpackage.s71;
import defpackage.wr0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001d\b&\u0018\u0000 o2\u00020\u0001:\u0007pqorstuJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0013\u0010\u0011J+\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0017\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0015\u0010\u0019J#\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b\u0015\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0017¢\u0006\u0004\b\"\u0010\u0011J\u000f\u0010#\u001a\u00020\rH\u0017¢\u0006\u0004\b#\u0010\u0011J\u000f\u0010$\u001a\u00020\rH\u0017¢\u0006\u0004\b$\u0010\u0011J\u0017\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J#\u0010'\u001a\u00028\u0000\"\u0004\b\u0000\u0010)2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0016¢\u0006\u0004\b'\u0010+J\u0017\u0010.\u001a\u00020\r2\u0006\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\u001e\u00103\u001a\u0004\u0018\u00010,8\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u0010\u0011R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u00108R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010>\u001a\u00020=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010B\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR$\u0010G\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010E8\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\bG\u0010H\u0012\u0004\bI\u0010\u0011R6\u0010L\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020K0\u0007\u0012\u0004\u0012\u00020K0J8\u0004@\u0004X\u0085\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0X8G¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R#\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010J8G¢\u0006\f\n\u0004\b^\u0010M\u001a\u0004\b_\u0010OR$\u0010`\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\u00010J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010MR\u0014\u0010c\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010e\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010bR\u0014\u0010h\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u001a\u0010i\u001a\u0002008VX\u0096\u0004¢\u0006\f\u0012\u0004\bj\u0010\u0011\u001a\u0004\bi\u00102R\u0017\u0010k\u001a\u0002008G¢\u0006\f\u0012\u0004\bl\u0010\u0011\u001a\u0004\bk\u00102R\u0014\u0010n\u001a\u0002008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bm\u00102¨\u0006v"}, d2 = {"Landroidx/room/RoomDatabase;", "", "Ljava/util/concurrent/locks/Lock;", "getCloseLock$room_runtime_release", "()Ljava/util/concurrent/locks/Lock;", "getCloseLock", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/Class;", "klass", "getTypeConverter", "(Ljava/lang/Class;)Ljava/lang/Object;", "Landroidx/room/DatabaseConfiguration;", j.c, "Laz2;", "init", "(Landroidx/room/DatabaseConfiguration;)V", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "()V", "assertNotMainThread", "assertNotSuspendingTransaction", "", "query", "", "args", "Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroid/os/CancellationSignal;", "signal", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "beginTransaction", "endTransaction", "setTransactionSuccessful", "Ljava/lang/Runnable;", "body", "runInTransaction", "(Ljava/lang/Runnable;)V", "V", "Ljava/util/concurrent/Callable;", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "internalInitInvalidationTracker", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "", "inTransaction", "()Z", "mDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getMDatabase$annotations", "Ljava/util/concurrent/Executor;", "internalQueryExecutor", "Ljava/util/concurrent/Executor;", "internalTransactionExecutor", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "internalOpenHelper", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/InvalidationTracker;", "invalidationTracker", "Landroidx/room/InvalidationTracker;", "getInvalidationTracker", "()Landroidx/room/InvalidationTracker;", "allowMainThreadQueries", "Z", "writeAheadLoggingEnabled", "", "Landroidx/room/RoomDatabase$Callback;", "mCallbacks", "Ljava/util/List;", "getMCallbacks$annotations", "", "Landroidx/room/migration/AutoMigrationSpec;", "autoMigrationSpecs", "Ljava/util/Map;", "getAutoMigrationSpecs", "()Ljava/util/Map;", "setAutoMigrationSpecs", "(Ljava/util/Map;)V", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "readWriteLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Landroidx/room/AutoCloser;", "autoCloser", "Landroidx/room/AutoCloser;", "Ljava/lang/ThreadLocal;", "", "suspendingTransactionId", "Ljava/lang/ThreadLocal;", "getSuspendingTransactionId", "()Ljava/lang/ThreadLocal;", "backingFieldMap", "getBackingFieldMap", "typeConverters", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "queryExecutor", "getTransactionExecutor", "transactionExecutor", "getOpenHelper", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "openHelper", "isOpen", "isOpen$annotations", "isOpenInternal", "isOpenInternal$annotations", "isMainThread$room_runtime_release", "isMainThread", "Companion", "Builder", "Callback", "JournalMode", "MigrationContainer", "PrepackagedDatabaseCallback", "QueryCallback", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class RoomDatabase {

    @RestrictTo
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;

    @Nullable
    private AutoCloser autoCloser;

    @NotNull
    private final Map<String, Object> backingFieldMap;
    private SupportSQLiteOpenHelper internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;

    @RestrictTo
    @Nullable
    protected List<? extends Callback> mCallbacks;

    @Nullable
    protected volatile SupportSQLiteDatabase mDatabase;

    @NotNull
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;

    @NotNull
    private final InvalidationTracker invalidationTracker = createInvalidationTracker();

    @RestrictTo
    @NotNull
    private Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs = new LinkedHashMap();

    @NotNull
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    @NotNull
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/RoomDatabase$Builder;", "Landroidx/room/RoomDatabase;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static class Builder<T extends RoomDatabase> {
        public final Context a;
        public final Class b;
        public final String c;
        public Executor g;
        public Executor h;
        public hl2 i;
        public boolean j;
        public boolean m;
        public HashSet q;
        public final ArrayList d = new ArrayList();
        public final ArrayList e = new ArrayList();
        public final ArrayList f = new ArrayList();
        public final JournalMode k = JournalMode.a;
        public boolean l = true;
        public final long n = -1;
        public final MigrationContainer o = new MigrationContainer();
        public final LinkedHashSet p = new LinkedHashSet();

        public final void a(Migration... migrationArr) {
            if (this.q == null) {
                this.q = new HashSet();
            }
            for (Migration migration : migrationArr) {
                HashSet hashSet = this.q;
                hashSet.getClass();
                hashSet.add(Integer.valueOf(migration.a));
                HashSet hashSet2 = this.q;
                hashSet2.getClass();
                hashSet2.add(Integer.valueOf(migration.b));
            }
            this.o.a((Migration[]) Arrays.copyOf(migrationArr, migrationArr.length));
        }

        public final RoomDatabase b() {
            String str;
            Executor executor = this.g;
            if (executor == null && this.h == null) {
                b8 b8Var = ArchTaskExecutor.c;
                this.h = b8Var;
                this.g = b8Var;
            } else if (executor != null && this.h == null) {
                this.h = executor;
            } else if (executor == null) {
                this.g = this.h;
            }
            HashSet hashSet = this.q;
            LinkedHashSet linkedHashSet = this.p;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                        ak1.n(pv1.k(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "));
                        return null;
                    }
                }
            }
            SupportSQLiteOpenHelper.Factory frameworkSQLiteOpenHelperFactory = this.i;
            if (frameworkSQLiteOpenHelperFactory == null) {
                frameworkSQLiteOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            }
            SupportSQLiteOpenHelper.Factory factory = frameworkSQLiteOpenHelperFactory;
            if (this.n > 0) {
                if (this.c != null) {
                    d.r("Required value was null.");
                    return null;
                }
                d.r("Cannot create auto-closing database for an in-memory database.");
                return null;
            }
            boolean z = this.j;
            JournalMode journalMode = this.k;
            journalMode.getClass();
            JournalMode journalMode2 = JournalMode.a;
            Context context = this.a;
            if (journalMode == journalMode2) {
                Object systemService = context.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                journalMode = (activityManager == null || activityManager.isLowRamDevice()) ? JournalMode.b : JournalMode.c;
            }
            JournalMode journalMode3 = journalMode;
            Executor executor2 = this.g;
            if (executor2 == null) {
                d.r("Required value was null.");
                return null;
            }
            Executor executor3 = this.h;
            if (executor3 == null) {
                d.r("Required value was null.");
                return null;
            }
            DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, this.c, factory, this.o, this.d, z, journalMode3, executor2, executor3, this.l, this.m, linkedHashSet, this.e, this.f);
            Class cls = this.b;
            Package r2 = cls.getPackage();
            r2.getClass();
            String name = r2.getName();
            String canonicalName = cls.getCanonicalName();
            canonicalName.getClass();
            name.getClass();
            if (name.length() != 0) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String strReplace = canonicalName.replace('.', '_');
            strReplace.getClass();
            String strConcat = strReplace.concat("_Impl");
            try {
                if (name.length() == 0) {
                    str = strConcat;
                } else {
                    str = name + '.' + strConcat;
                }
                Class<?> cls2 = Class.forName(str, true, cls.getClassLoader());
                cls2.getClass();
                RoomDatabase roomDatabase = (RoomDatabase) cls2.newInstance();
                roomDatabase.init(databaseConfiguration);
                return roomDatabase;
            } catch (ClassNotFoundException unused) {
                throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist");
            } catch (IllegalAccessException unused2) {
                throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
            } catch (InstantiationException unused3) {
                throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
            }
        }

        public Builder(Context context, Class cls, String str) {
            this.a = context;
            this.b = cls;
            this.c = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomDatabase$Callback;", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class Callback {
        public void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class JournalMode {
        public static final JournalMode a;
        public static final JournalMode b;
        public static final JournalMode c;
        public static final /* synthetic */ JournalMode[] d;

        static {
            JournalMode journalMode = new JournalMode("AUTOMATIC", 0);
            a = journalMode;
            JournalMode journalMode2 = new JournalMode("TRUNCATE", 1);
            b = journalMode2;
            JournalMode journalMode3 = new JournalMode("WRITE_AHEAD_LOGGING", 2);
            c = journalMode3;
            d = new JournalMode[]{journalMode, journalMode2, journalMode3};
        }

        public static JournalMode valueOf(String str) {
            return (JournalMode) Enum.valueOf(JournalMode.class, str);
        }

        public static JournalMode[] values() {
            return (JournalMode[]) d.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomDatabase$MigrationContainer;", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static class MigrationContainer {
        public final LinkedHashMap a = new LinkedHashMap();

        public final void a(Migration... migrationArr) {
            for (Migration migration : migrationArr) {
                int i = migration.a;
                int i2 = migration.b;
                Integer numValueOf = Integer.valueOf(i);
                LinkedHashMap linkedHashMap = this.a;
                Object treeMap = linkedHashMap.get(numValueOf);
                if (treeMap == null) {
                    treeMap = new TreeMap();
                    linkedHashMap.put(numValueOf, treeMap);
                }
                TreeMap treeMap2 = (TreeMap) treeMap;
                if (treeMap2.containsKey(Integer.valueOf(i2))) {
                    Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + migration);
                }
                treeMap2.put(Integer.valueOf(i2), migration);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class PrepackagedDatabaseCallback {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/room/RoomDatabase$QueryCallback;", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface QueryCallback {
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabase$beginTransaction$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends rc1 implements wr0 {
        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            ((SupportSQLiteDatabase) obj).getClass();
            RoomDatabase.access$internalBeginTransaction(null);
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabase$endTransaction$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C16241 extends rc1 implements wr0 {
        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            ((SupportSQLiteDatabase) obj).getClass();
            ((RoomDatabase) null).a();
            return null;
        }
    }

    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    public static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public abstract InvalidationTracker createInvalidationTracker();

    public abstract SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration);

    public static /* synthetic */ Cursor query$default(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj != null) {
            d.u("Super calls with default arguments not supported in this target, function: query");
            return null;
        }
        if ((i & 2) != 0) {
            cancellationSignal = null;
        }
        return roomDatabase.query(supportSQLiteQuery, cancellationSignal);
    }

    @RestrictTo
    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            e32.i("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void endTransaction() {
        /*
            r1 = this;
            androidx.room.AutoCloser r0 = r1.autoCloser
            if (r0 != 0) goto L8
            r1.a()
            return
        L8:
            r1 = 0
            throw r1     // Catch: java.lang.Throwable -> La
        La:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.endTransaction():void");
    }

    @NotNull
    public final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    @RestrictTo
    @NotNull
    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    @NotNull
    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock lock = this.readWriteLock.readLock();
        lock.getClass();
        return lock;
    }

    @NotNull
    public InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @NotNull
    public SupportSQLiteOpenHelper getOpenHelper() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.internalOpenHelper;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        s71.D("internalOpenHelper");
        throw null;
    }

    @NotNull
    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        s71.D("internalQueryExecutor");
        throw null;
    }

    public Set getRequiredAutoMigrationSpecs() {
        return kg0.a;
    }

    public Map getRequiredTypeConverters() {
        return hg0.a;
    }

    @RestrictTo
    @NotNull
    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    @NotNull
    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        s71.D("internalTransactionExecutor");
        throw null;
    }

    public boolean isOpen() {
        Boolean boolValueOf;
        boolean zIsOpen;
        if (this.autoCloser == null) {
            SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
            if (supportSQLiteDatabase != null) {
                zIsOpen = supportSQLiteDatabase.isOpen();
            } else {
                boolValueOf = null;
            }
            return s71.b(boolValueOf, Boolean.TRUE);
        }
        zIsOpen = true;
        boolValueOf = Boolean.valueOf(zIsOpen);
        return s71.b(boolValueOf, Boolean.TRUE);
    }

    @RestrictTo
    public final boolean isOpenInternal() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
        return supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen();
    }

    public RoomDatabase() {
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        mapSynchronizedMap.getClass();
        this.backingFieldMap = mapSynchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    public static final void access$internalBeginTransaction(RoomDatabase roomDatabase) {
        roomDatabase.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = roomDatabase.getOpenHelper().getWritableDatabase();
        roomDatabase.getInvalidationTracker().d(writableDatabase);
        if (writableDatabase.l0()) {
            writableDatabase.y();
        } else {
            writableDatabase.u();
        }
    }

    public static Object b(Class cls, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (cls.isInstance(supportSQLiteOpenHelper)) {
            return supportSQLiteOpenHelper;
        }
        if (supportSQLiteOpenHelper instanceof DelegatingOpenHelper) {
            return b(cls, ((DelegatingOpenHelper) supportSQLiteOpenHelper).getDelegate());
        }
        return null;
    }

    public final void a() {
        getOpenHelper().getWritableDatabase().S();
        if (!inTransaction()) {
            InvalidationTracker invalidationTracker = getInvalidationTracker();
            if (invalidationTracker.e.compareAndSet(false, true)) {
                invalidationTracker.a.getQueryExecutor().execute(invalidationTracker.m);
            }
        }
    }

    @RestrictTo
    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            e32.i("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void beginTransaction() {
        /*
            r1 = this;
            r1.assertNotMainThread()
            androidx.room.AutoCloser r0 = r1.autoCloser
            if (r0 != 0) goto L27
            r1.assertNotMainThread()
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.getOpenHelper()
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableDatabase()
            androidx.room.InvalidationTracker r1 = r1.getInvalidationTracker()
            r1.d(r0)
            boolean r1 = r0.l0()
            if (r1 == 0) goto L23
            r0.y()
            return
        L23:
            r0.u()
            return
        L27:
            r1 = 0
            throw r1     // Catch: java.lang.Throwable -> L29
        L29:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.beginTransaction():void");
    }

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            writeLock.getClass();
            writeLock.lock();
            try {
                InvalidationTracker invalidationTracker = getInvalidationTracker();
                if (invalidationTracker.j == null) {
                    invalidationTracker.j = null;
                    getOpenHelper().close();
                    writeLock.unlock();
                    return;
                }
                throw null;
            } catch (Throwable th) {
                writeLock.unlock();
                throw th;
            }
        }
    }

    @NotNull
    public SupportSQLiteStatement compileStatement(@NotNull String sql) {
        sql.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().d0(sql);
    }

    public List getAutoMigrations(Map map) {
        map.getClass();
        return gg0.a;
    }

    @Nullable
    public <T> T getTypeConverter(@NotNull Class<T> klass) {
        klass.getClass();
        return (T) this.typeConverters.get(klass);
    }

    public boolean inTransaction() {
        return getOpenHelper().getWritableDatabase().j0();
    }

    @CallSuper
    public void init(@NotNull DatabaseConfiguration configuration) {
        boolean z;
        boolean z2;
        configuration.getClass();
        MigrationContainer migrationContainer = configuration.d;
        List list = configuration.n;
        List list2 = configuration.m;
        this.internalOpenHelper = createOpenHelper(configuration);
        Set requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i = -1;
            if (it.hasNext()) {
                Class<? extends AutoMigrationSpec> cls = (Class) it.next();
                int size = list.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        if (cls.isAssignableFrom(list.get(size).getClass())) {
                            bitSet.set(size);
                            i = size;
                            break;
                        } else if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                }
                if (i >= 0) {
                    this.autoMigrationSpecs.put(cls, (AutoMigrationSpec) list.get(i));
                } else {
                    e32.n(cls.getCanonicalName(), ") is missing in the database configuration.", "A required auto migration spec (");
                    return;
                }
            } else {
                int size2 = list.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (bitSet.get(size2)) {
                            if (i3 < 0) {
                                break;
                            } else {
                                size2 = i3;
                            }
                        } else {
                            d.r("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            return;
                        }
                    }
                }
                Iterator it2 = getAutoMigrations(this.autoMigrationSpecs).iterator();
                while (true) {
                    boolean zContainsKey = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Migration migration = (Migration) it2.next();
                    int i4 = migration.a;
                    int i5 = migration.b;
                    LinkedHashMap linkedHashMap = migrationContainer.a;
                    if (linkedHashMap.containsKey(Integer.valueOf(i4))) {
                        Map map = (Map) linkedHashMap.get(Integer.valueOf(i4));
                        if (map == null) {
                            map = hg0.a;
                        }
                        zContainsKey = map.containsKey(Integer.valueOf(i5));
                    }
                    if (!zContainsKey) {
                        migrationContainer.a(migration);
                    }
                }
                if (((AutoClosingRoomOpenHelper) b(AutoClosingRoomOpenHelper.class, getOpenHelper())) == null) {
                    if (configuration.g == JournalMode.c) {
                        z = true;
                    } else {
                        z = false;
                    }
                    getOpenHelper().setWriteAheadLoggingEnabled(z);
                    this.mCallbacks = configuration.e;
                    this.internalQueryExecutor = configuration.h;
                    this.internalTransactionExecutor = new TransactionExecutor(configuration.i);
                    this.allowMainThreadQueries = configuration.f;
                    this.writeAheadLoggingEnabled = z;
                    Map requiredTypeConverters = getRequiredTypeConverters();
                    BitSet bitSet2 = new BitSet();
                    for (Map.Entry entry : requiredTypeConverters.entrySet()) {
                        Class cls2 = (Class) entry.getKey();
                        for (Class<?> cls3 : (List) entry.getValue()) {
                            int size3 = list2.size() - 1;
                            if (size3 < 0) {
                                size3 = -1;
                                break;
                            }
                            while (true) {
                                int i6 = size3 - 1;
                                if (cls3.isAssignableFrom(list2.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i6 >= 0) {
                                    size3 = i6;
                                } else {
                                    size3 = -1;
                                    break;
                                }
                            }
                            if (size3 >= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                this.typeConverters.put(cls3, list2.get(size3));
                            } else {
                                StringBuilder sb = new StringBuilder("A required type converter (");
                                sb.append(cls3);
                                String canonicalName = cls2.getCanonicalName();
                                sb.append(") for ");
                                sb.append(canonicalName);
                                sb.append(" is missing in the database configuration.");
                                throw new IllegalArgumentException(sb.toString().toString());
                            }
                        }
                    }
                    int size4 = list2.size() - 1;
                    if (size4 < 0) {
                        return;
                    }
                    while (true) {
                        int i7 = size4 - 1;
                        if (bitSet2.get(size4)) {
                            if (i7 >= 0) {
                                size4 = i7;
                            } else {
                                return;
                            }
                        } else {
                            e32.o(list2.get(size4), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.", "Unexpected type converter ");
                            return;
                        }
                    }
                } else {
                    throw null;
                }
            }
        }
    }

    public void internalInitInvalidationTracker(@NotNull SupportSQLiteDatabase db) {
        db.getClass();
        InvalidationTracker invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        synchronized (invalidationTracker.l) {
            if (invalidationTracker.f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            db.H("PRAGMA temp_store = MEMORY;");
            db.H("PRAGMA recursive_triggers='ON';");
            db.H("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            invalidationTracker.d(db);
            invalidationTracker.g = db.d0("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            invalidationTracker.f = true;
        }
    }

    public final boolean isMainThread$room_runtime_release() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    @NotNull
    public Cursor query(@NotNull SupportSQLiteQuery query, @Nullable CancellationSignal signal) {
        query.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (signal != null) {
            return getOpenHelper().getWritableDatabase().x(query, signal);
        }
        return getOpenHelper().getWritableDatabase().A(query);
    }

    public <V> V runInTransaction(@NotNull Callable<V> body) {
        body.getClass();
        beginTransaction();
        try {
            V vCall = body.call();
            setTransactionSuccessful();
            return vCall;
        } finally {
            endTransaction();
        }
    }

    public final void setAutoMigrationSpecs(@NotNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        map.getClass();
        this.autoMigrationSpecs = map;
    }

    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().P();
    }

    public void runInTransaction(@NotNull Runnable body) {
        body.getClass();
        beginTransaction();
        try {
            body.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @NotNull
    public Cursor query(@NotNull String query, @Nullable Object[] args) {
        query.getClass();
        return getOpenHelper().getWritableDatabase().A(new SimpleSQLiteQuery(query, args));
    }

    @NotNull
    public final Cursor query(@NotNull SupportSQLiteQuery supportSQLiteQuery) {
        supportSQLiteQuery.getClass();
        return query$default(this, supportSQLiteQuery, null, 2, null);
    }
}
