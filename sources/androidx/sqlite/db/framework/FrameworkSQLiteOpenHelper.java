package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.util.ProcessLock;
import defpackage.cm2;
import defpackage.n30;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Companion", "DBRefHolder", "OpenHelper", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FrameworkSQLiteOpenHelper implements SupportSQLiteOpenHelper {
    public final Context a;
    public final String b;
    public final SupportSQLiteOpenHelper.Callback c;
    public final boolean d;
    public final boolean e;
    public final cm2 f;
    public boolean g;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$Companion;", "", "", "TAG", "Ljava/lang/String;", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$DBRefHolder;", "", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class DBRefHolder {
        public FrameworkSQLiteDatabase a = null;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "CallbackException", "CallbackName", "Companion", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class OpenHelper extends SQLiteOpenHelper {
        public static final /* synthetic */ int h = 0;
        public final Context a;
        public final DBRefHolder b;
        public final SupportSQLiteOpenHelper.Callback c;
        public final boolean d;
        public boolean e;
        public final ProcessLock f;
        public boolean g;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "callbackName", "", "cause", "<init>", "(Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;Ljava/lang/Throwable;)V", "a", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "d", "()Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "b", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class CallbackException extends RuntimeException {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final CallbackName callbackName;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            private final Throwable cause;

            @NotNull
            /* JADX INFO: renamed from: d, reason: from getter */
            public final CallbackName getCallbackName() {
                return this.callbackName;
            }

            @Override // java.lang.Throwable
            @NotNull
            public Throwable getCause() {
                return this.cause;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CallbackException(@NotNull CallbackName callbackName, @NotNull Throwable th) {
                super(th);
                callbackName.getClass();
                th.getClass();
                this.callbackName = callbackName;
                this.cause = th;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class CallbackName {
            public static final CallbackName a;
            public static final CallbackName b;
            public static final CallbackName c;
            public static final CallbackName d;
            public static final CallbackName e;
            public static final /* synthetic */ CallbackName[] f;

            static {
                CallbackName callbackName = new CallbackName("ON_CONFIGURE", 0);
                a = callbackName;
                CallbackName callbackName2 = new CallbackName("ON_CREATE", 1);
                b = callbackName2;
                CallbackName callbackName3 = new CallbackName("ON_UPGRADE", 2);
                c = callbackName3;
                CallbackName callbackName4 = new CallbackName("ON_DOWNGRADE", 3);
                d = callbackName4;
                CallbackName callbackName5 = new CallbackName("ON_OPEN", 4);
                e = callbackName5;
                f = new CallbackName[]{callbackName, callbackName2, callbackName3, callbackName4, callbackName5};
            }

            public static CallbackName valueOf(String str) {
                return (CallbackName) Enum.valueOf(CallbackName.class, str);
            }

            public static CallbackName[] values() {
                return (CallbackName[]) f.clone();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$Companion;", "", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CallbackName.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[4] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final SupportSQLiteDatabase b(boolean z) {
            ProcessLock processLock = this.f;
            try {
                processLock.a((this.g || getDatabaseName() == null) ? false : true);
                this.e = false;
                SQLiteDatabase sQLiteDatabaseF = f(z);
                if (!this.e) {
                    return d(sQLiteDatabaseF);
                }
                close();
                return b(z);
            } finally {
                processLock.b();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            ProcessLock processLock = this.f;
            try {
                processLock.a(processLock.a);
                super.close();
                this.b.a = null;
                this.g = false;
            } finally {
                processLock.b();
            }
        }

        public final FrameworkSQLiteDatabase d(SQLiteDatabase sQLiteDatabase) {
            DBRefHolder dBRefHolder = this.b;
            dBRefHolder.getClass();
            FrameworkSQLiteDatabase frameworkSQLiteDatabase = dBRefHolder.a;
            if (frameworkSQLiteDatabase != null && frameworkSQLiteDatabase.a.equals(sQLiteDatabase)) {
                return frameworkSQLiteDatabase;
            }
            FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = new FrameworkSQLiteDatabase(sQLiteDatabase);
            dBRefHolder.a = frameworkSQLiteDatabase2;
            return frameworkSQLiteDatabase2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(Context context, String str, final DBRefHolder dBRefHolder, final SupportSQLiteOpenHelper.Callback callback, boolean z) {
            String strF;
            super(context, str, null, callback.a, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.b
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    int i = FrameworkSQLiteOpenHelper.OpenHelper.h;
                    callback.getClass();
                    sQLiteDatabase.getClass();
                    FrameworkSQLiteOpenHelper.DBRefHolder dBRefHolder2 = dBRefHolder;
                    FrameworkSQLiteDatabase frameworkSQLiteDatabase = dBRefHolder2.a;
                    if (frameworkSQLiteDatabase == null || !frameworkSQLiteDatabase.a.equals(sQLiteDatabase)) {
                        frameworkSQLiteDatabase = new FrameworkSQLiteDatabase(sQLiteDatabase);
                        dBRefHolder2.a = frameworkSQLiteDatabase;
                    }
                    SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabase.a;
                    Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + frameworkSQLiteDatabase + ".path");
                    if (!sQLiteDatabase2.isOpen()) {
                        String path = sQLiteDatabase2.getPath();
                        if (path != null) {
                            SupportSQLiteOpenHelper.Callback.a(path);
                            return;
                        }
                        return;
                    }
                    List<Pair<String, String>> attachedDbs = null;
                    try {
                        try {
                            attachedDbs = sQLiteDatabase2.getAttachedDbs();
                        } finally {
                            if (attachedDbs != null) {
                                Iterator<T> it = attachedDbs.iterator();
                                while (it.hasNext()) {
                                    Object obj = ((Pair) it.next()).second;
                                    obj.getClass();
                                    SupportSQLiteOpenHelper.Callback.a((String) obj);
                                }
                            } else {
                                String path2 = sQLiteDatabase2.getPath();
                                if (path2 != null) {
                                    SupportSQLiteOpenHelper.Callback.a(path2);
                                }
                            }
                        }
                    } catch (SQLiteException unused) {
                    }
                    try {
                        frameworkSQLiteDatabase.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                }
            });
            callback.getClass();
            this.a = context;
            this.b = dBRefHolder;
            this.c = callback;
            this.d = z;
            if (str == null) {
                strF = n30.f();
            } else {
                strF = str;
            }
            this.f = new ProcessLock(context.getCacheDir(), strF, false);
        }

        public final SQLiteDatabase f(boolean z) throws Throwable {
            SQLiteDatabase readableDatabase;
            SQLiteDatabase readableDatabase2;
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z2 = this.g;
            Context context = this.a;
            if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                if (z) {
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    writableDatabase.getClass();
                    return writableDatabase;
                }
                SQLiteDatabase readableDatabase3 = getReadableDatabase();
                readableDatabase3.getClass();
                return readableDatabase3;
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    if (z) {
                        readableDatabase2 = getWritableDatabase();
                        readableDatabase2.getClass();
                    } else {
                        readableDatabase2 = getReadableDatabase();
                        readableDatabase2.getClass();
                    }
                    return readableDatabase2;
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof CallbackException) {
                        CallbackException callbackException = th;
                        Throwable cause = callbackException.getCause();
                        int iOrdinal = callbackException.getCallbackName().ordinal();
                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.d) {
                        throw th;
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        if (z) {
                            readableDatabase = getWritableDatabase();
                            readableDatabase.getClass();
                        } else {
                            readableDatabase = getReadableDatabase();
                            readableDatabase.getClass();
                        }
                        return readableDatabase;
                    } catch (CallbackException e) {
                        throw e.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.getClass();
            boolean z = this.e;
            SupportSQLiteOpenHelper.Callback callback = this.c;
            if (!z && callback.a != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                callback.b(d(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.a, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.getClass();
            try {
                this.c.c(d(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.b, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.getClass();
            this.e = true;
            try {
                this.c.d(d(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.d, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.getClass();
            if (!this.e) {
                try {
                    this.c.e(d(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new CallbackException(CallbackName.e, th);
                }
            }
            this.g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.getClass();
            this.e = true;
            try {
                this.c.f(d(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.c, th);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        cm2 cm2Var = this.f;
        if (cm2Var.isInitialized()) {
            ((OpenHelper) cm2Var.getValue()).close();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getWritableDatabase() {
        return ((OpenHelper) this.f.getValue()).b(true);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z) {
        cm2 cm2Var = this.f;
        if (cm2Var.isInitialized()) {
            OpenHelper openHelper = (OpenHelper) cm2Var.getValue();
            openHelper.getClass();
            openHelper.setWriteAheadLoggingEnabled(z);
        }
        this.g = z;
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.Callback callback, boolean z, boolean z2) {
        callback.getClass();
        this.a = context;
        this.b = str;
        this.c = callback;
        this.d = z;
        this.e = z2;
        this.f = new cm2(new FrameworkSQLiteOpenHelper$lazyDelegate$1(this));
    }
}
