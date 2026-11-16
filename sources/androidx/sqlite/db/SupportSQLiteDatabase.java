package androidx.sqlite.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteDatabase;", "Ljava/io/Closeable;", "sqlite_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface SupportSQLiteDatabase extends Closeable {
    Cursor A(SupportSQLiteQuery supportSQLiteQuery);

    long C();

    void H(String str);

    boolean I();

    long O();

    void P();

    void S();

    void c0(int i);

    SupportSQLiteStatement d0(String str);

    boolean f0();

    void g0(Object[] objArr);

    String getPath();

    int getVersion();

    boolean h0();

    Cursor i0(String str);

    boolean isOpen();

    boolean j0();

    boolean l0();

    void m0(long j);

    int q0(ContentValues contentValues, Object[] objArr);

    void u();

    List v();

    Cursor x(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal);

    void y();

    boolean z();
}
