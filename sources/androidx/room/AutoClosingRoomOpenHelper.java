package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "AutoClosingSupportSQLiteDatabase", "AutoClosingSupportSqliteStatement", "KeepAliveCursor", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AutoClosingRoomOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AutoClosingSupportSQLiteDatabase implements SupportSQLiteDatabase {
        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final Cursor A(SupportSQLiteQuery supportSQLiteQuery) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final long C() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void H(String str) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean I() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final long O() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void P() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void S() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void c0(int i) {
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final SupportSQLiteStatement d0(String str) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean f0() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void g0(Object[] objArr) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final String getPath() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final int getVersion() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean h0() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final Cursor i0(String str) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean isOpen() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean j0() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean l0() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void m0(long j) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final int q0(ContentValues contentValues, Object[] objArr) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void u() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final List v() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final Cursor x(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void y() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean z() {
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // androidx.room.DelegatingOpenHelper
    public final SupportSQLiteOpenHelper getDelegate() {
        return null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getWritableDatabase() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z) {
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AutoClosingSupportSqliteStatement implements SupportSQLiteStatement {
        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final long B() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void J(int i, double d) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final String Q() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final long a0() {
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final void execute() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void m(int i, long j) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void p(int i, byte[] bArr) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void s(int i) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final int w() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void l(int i, String str) {
            str.getClass();
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$KeepAliveCursor;", "Landroid/database/Cursor;", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class KeepAliveCursor implements Cursor {
        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // android.database.Cursor
        public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            throw null;
        }

        @Override // android.database.Cursor
        public final void deactivate() {
            throw null;
        }

        @Override // android.database.Cursor
        public final byte[] getBlob(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getColumnCount() {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getColumnIndex(String str) {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getColumnIndexOrThrow(String str) {
            throw null;
        }

        @Override // android.database.Cursor
        public final String getColumnName(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final String[] getColumnNames() {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getCount() {
            throw null;
        }

        @Override // android.database.Cursor
        public final double getDouble(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final Bundle getExtras() {
            throw null;
        }

        @Override // android.database.Cursor
        public final float getFloat(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getInt(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final long getLong(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final Uri getNotificationUri() {
            throw null;
        }

        @Override // android.database.Cursor
        public final List getNotificationUris() {
            SupportSQLiteCompat.Api29Impl.a(null);
            throw null;
        }

        @Override // android.database.Cursor
        public final int getPosition() {
            throw null;
        }

        @Override // android.database.Cursor
        public final short getShort(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final String getString(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getType(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean getWantsAllOnMoveCalls() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isAfterLast() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isBeforeFirst() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isClosed() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isFirst() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isLast() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isNull(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean move(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToFirst() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToLast() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToNext() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToPosition(int i) {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToPrevious() {
            throw null;
        }

        @Override // android.database.Cursor
        public final void registerContentObserver(ContentObserver contentObserver) {
            throw null;
        }

        @Override // android.database.Cursor
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean requery() {
            throw null;
        }

        @Override // android.database.Cursor
        public final Bundle respond(Bundle bundle) {
            throw null;
        }

        @Override // android.database.Cursor
        public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            throw null;
        }

        @Override // android.database.Cursor
        public final void unregisterContentObserver(ContentObserver contentObserver) {
            throw null;
        }

        @Override // android.database.Cursor
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            throw null;
        }

        @Override // android.database.Cursor
        public final void setExtras(Bundle bundle) {
            bundle.getClass();
            throw null;
        }

        @Override // android.database.Cursor
        public final void setNotificationUris(ContentResolver contentResolver, List list) {
            contentResolver.getClass();
            list.getClass();
            SupportSQLiteCompat.Api29Impl.b(null, contentResolver, list);
            throw null;
        }
    }
}
