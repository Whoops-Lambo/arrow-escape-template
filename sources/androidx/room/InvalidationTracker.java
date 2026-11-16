package androidx.room;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import defpackage.d;
import defpackage.e32;
import defpackage.fc2;
import defpackage.jc1;
import defpackage.kc2;
import defpackage.kg0;
import defpackage.n30;
import defpackage.nq2;
import defpackage.qh1;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/room/InvalidationTracker;", "", "Companion", "ObservedTableTracker", "Observer", "ObserverWrapper", "WeakObserver", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class InvalidationTracker {
    public static final String[] n = {"UPDATE", "DELETE", "INSERT"};
    public final RoomDatabase a;
    public final HashMap b;
    public final LinkedHashMap c;
    public final String[] d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public volatile boolean f;
    public volatile SupportSQLiteStatement g;
    public final ObservedTableTracker h;
    public final SafeIterableMap i;
    public MultiInstanceInvalidationClient j;
    public final Object k;
    public final Object l;
    public final InvalidationTracker$refreshRunnable$1 m;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/InvalidationTracker$Observer;", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class Observer {
        public abstract void a(Set set);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/InvalidationTracker$ObserverWrapper;", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ObserverWrapper {
        public final void a(String[] strArr) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Landroidx/room/InvalidationTracker$Companion;", "", "", "CREATE_TRACKING_TABLE_SQL", "Ljava/lang/String;", "INVALIDATED_COLUMN_NAME", "TABLE_ID_COLUMN_NAME", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public static String a(String str, String str2) {
            str.getClass();
            str2.getClass();
            StringBuilder sb = new StringBuilder("`room_table_modification_trigger_");
            sb.append(str);
            sb.append('_');
            return jc1.q(sb, str2, '`');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/InvalidationTracker$ObservedTableTracker;", "", "Companion", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ObservedTableTracker {
        public final long[] a;
        public final boolean[] b;
        public final int[] c;
        public boolean d;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/room/InvalidationTracker$ObservedTableTracker$Companion;", "", "", "ADD", "I", "NO_OP", "REMOVE", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.d) {
                        return null;
                    }
                    long[] jArr = this.a;
                    int length = jArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = i2 + 1;
                        boolean z = jArr[i] > 0;
                        boolean[] zArr = this.b;
                        boolean z2 = zArr[i2];
                        int[] iArr = this.c;
                        if (z != z2) {
                            iArr[i2] = z ? 1 : 2;
                        } else {
                            iArr[i2] = 0;
                        }
                        zArr[i2] = z;
                        i++;
                        i2 = i3;
                    }
                    this.d = false;
                    return (int[]) this.c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public ObservedTableTracker(int i) {
            this.a = new long[i];
            this.b = new boolean[i];
            this.c = new int[i];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/InvalidationTracker$WeakObserver;", "Landroidx/room/InvalidationTracker$Observer;", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class WeakObserver extends Observer {
        @Override // androidx.room.InvalidationTracker.Observer
        public final void a(Set set) {
            set.getClass();
            throw null;
        }
    }

    public final boolean a() {
        if (!this.a.isOpenInternal()) {
            return false;
        }
        if (!this.f) {
            this.a.getOpenHelper().getWritableDatabase();
        }
        if (this.f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(Observer observer) {
        ObserverWrapper observerWrapper;
        synchronized (this.i) {
            observerWrapper = (ObserverWrapper) this.i.d(observer);
        }
        if (observerWrapper != null) {
            throw null;
        }
    }

    public final void c(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        supportSQLiteDatabase.H("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.d[i];
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = n[i2];
            StringBuilder sb = new StringBuilder("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append(Companion.a(str, str2));
            sb.append(" AFTER ");
            sb.append(str2);
            n30.t(i, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ", sb);
            sb.append(" AND invalidated = 0; END");
            supportSQLiteDatabase.H(sb.toString());
        }
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.room.InvalidationTracker$refreshRunnable$1] */
    public InvalidationTracker(RoomDatabase roomDatabase, HashMap map, HashMap map2, String... strArr) {
        String lowerCase;
        this.a = roomDatabase;
        this.b = map;
        this.h = new ObservedTableTracker(strArr.length);
        new InvalidationLiveDataContainer(roomDatabase);
        this.i = new SafeIterableMap();
        this.k = new Object();
        this.l = new Object();
        this.c = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String strP = n30.p(locale, str, locale);
            this.c.put(strP, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                strP = lowerCase;
            }
            strArr2[i] = strP;
        }
        this.d = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String strP2 = n30.p(locale2, str3, locale2);
            if (this.c.containsKey(strP2)) {
                String lowerCase2 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase2.getClass();
                LinkedHashMap linkedHashMap = this.c;
                linkedHashMap.put(lowerCase2, qh1.V(strP2, linkedHashMap));
            }
        }
        this.m = new Runnable() { // from class: androidx.room.InvalidationTracker$refreshRunnable$1
            public final fc2 a() {
                InvalidationTracker invalidationTracker = this.a;
                fc2 fc2Var = new fc2();
                Cursor cursorQuery$default = RoomDatabase.query$default(invalidationTracker.a, new SimpleSQLiteQuery("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", null), null, 2, null);
                try {
                    Cursor cursor = cursorQuery$default;
                    while (cursor.moveToNext()) {
                        fc2Var.add(Integer.valueOf(cursor.getInt(0)));
                    }
                    nq2.e(cursorQuery$default, null);
                    fc2 fc2VarF = kc2.f(fc2Var);
                    if (fc2VarF.a.isEmpty()) {
                        return fc2VarF;
                    }
                    if (this.a.g == null) {
                        e32.i("Required value was null.");
                        return null;
                    }
                    SupportSQLiteStatement supportSQLiteStatement = this.a.g;
                    if (supportSQLiteStatement != null) {
                        supportSQLiteStatement.w();
                        return fc2VarF;
                    }
                    d.r("Required value was null.");
                    return null;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        nq2.e(cursorQuery$default, th);
                        throw th2;
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                Collection collectionA;
                Lock closeLock$room_runtime_release = this.a.a.getCloseLock$room_runtime_release();
                closeLock$room_runtime_release.lock();
                try {
                    try {
                        try {
                            if (!this.a.a()) {
                                closeLock$room_runtime_release.unlock();
                                return;
                            }
                            if (!this.a.e.compareAndSet(true, false)) {
                                closeLock$room_runtime_release.unlock();
                                return;
                            }
                            if (this.a.a.inTransaction()) {
                                closeLock$room_runtime_release.unlock();
                                return;
                            }
                            SupportSQLiteDatabase writableDatabase = this.a.a.getOpenHelper().getWritableDatabase();
                            writableDatabase.y();
                            try {
                                collectionA = a();
                                writableDatabase.P();
                                writableDatabase.S();
                                closeLock$room_runtime_release.unlock();
                                if (collectionA.isEmpty()) {
                                    return;
                                }
                                InvalidationTracker invalidationTracker = this.a;
                                synchronized (invalidationTracker.i) {
                                    Iterator it = invalidationTracker.i.iterator();
                                    if (it.hasNext()) {
                                        ((InvalidationTracker.ObserverWrapper) ((Map.Entry) it.next()).getValue()).getClass();
                                        collectionA.getClass();
                                        throw null;
                                    }
                                }
                            } catch (Throwable th) {
                                writableDatabase.S();
                                throw th;
                            }
                        } catch (IllegalStateException e) {
                            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                            collectionA = kg0.a;
                        }
                    } catch (SQLiteException e2) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                        collectionA = kg0.a;
                    }
                } catch (Throwable th2) {
                    closeLock$room_runtime_release.unlock();
                    throw th2;
                }
            }
        };
    }

    public final void d(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.getClass();
        if (!supportSQLiteDatabase.j0()) {
            try {
                Lock closeLock$room_runtime_release = this.a.getCloseLock$room_runtime_release();
                closeLock$room_runtime_release.lock();
                try {
                    synchronized (this.k) {
                        try {
                            int[] iArrA = this.h.a();
                            if (iArrA != null) {
                                if (supportSQLiteDatabase.l0()) {
                                    supportSQLiteDatabase.y();
                                } else {
                                    supportSQLiteDatabase.u();
                                }
                                try {
                                    int length = iArrA.length;
                                    int i = 0;
                                    int i2 = 0;
                                    while (i < length) {
                                        int i3 = iArrA[i];
                                        int i4 = i2 + 1;
                                        if (i3 != 1) {
                                            if (i3 == 2) {
                                                String str = this.d[i2];
                                                String[] strArr = n;
                                                for (int i5 = 0; i5 < 3; i5++) {
                                                    supportSQLiteDatabase.H("DROP TRIGGER IF EXISTS ".concat(Companion.a(str, strArr[i5])));
                                                }
                                            }
                                        } else {
                                            c(supportSQLiteDatabase, i2);
                                        }
                                        i++;
                                        i2 = i4;
                                    }
                                    supportSQLiteDatabase.P();
                                    supportSQLiteDatabase.S();
                                } catch (Throwable th) {
                                    supportSQLiteDatabase.S();
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    closeLock$room_runtime_release.unlock();
                } catch (Throwable th3) {
                    closeLock$room_runtime_release.unlock();
                    throw th3;
                }
            } catch (SQLiteException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            } catch (IllegalStateException e2) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
            }
        }
    }
}
