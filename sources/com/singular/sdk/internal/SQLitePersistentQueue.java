package com.singular.sdk.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class SQLitePersistentQueue implements Queue {
    private static final SingularLog logger = SingularLog.getLogger("SQLitePersistentQueue");
    private SQLiteManager sqlite;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class SQLiteHelper extends SQLiteOpenHelper implements BaseColumns {
        private static final String COLUMN_NAME_VALUE = "value";
        private static final String COMMA_SEP = ",";
        private static final String DATABASE_NAME = "singular-1.db";
        private static final int DATABASE_VERSION = 1;
        private static final String SQL_CREATE_ENTRIES = "CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,value TEXT )";
        private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS events";
        private static final String TABLE_NAME = "events";
        private static final String TEXT_TYPE = " TEXT";

        public SQLiteHelper(Context context) {
            super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class SQLiteManager {
        private final SQLiteHelper helper;

        public String getHead() throws Throwable {
            SQLiteDatabase readableDatabase;
            Cursor cursor = null;
            String string = null;
            cursor = null;
            cursor = null;
            cursor = null;
            try {
                readableDatabase = this.helper.getReadableDatabase();
                try {
                    try {
                        long minId = getMinId(readableDatabase);
                        Cursor cursorQuery = readableDatabase.query("events", new String[]{"value"}, "_id = ?", new String[]{String.valueOf(minId)}, null, null, null);
                        try {
                            cursorQuery.moveToFirst();
                            if (cursorQuery.getCount() != 0) {
                                string = cursorQuery.getString(0);
                            }
                            SQLitePersistentQueue.logger.debug("getHead() _id = %d, value = %s", Long.valueOf(minId), string);
                            cursorQuery.close();
                            readableDatabase.close();
                            return string;
                        } catch (SQLException e) {
                            e = e;
                            cursor = cursorQuery;
                            SingularInstance.collectError("fe65");
                            throw new IOException(e);
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (readableDatabase != null) {
                                readableDatabase.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (SQLException e2) {
                    e = e2;
                }
            } catch (SQLException e3) {
                e = e3;
                readableDatabase = null;
            } catch (Throwable th3) {
                th = th3;
                readableDatabase = null;
            }
        }

        private long getCount(SQLiteDatabase sQLiteDatabase) throws IOException {
            Cursor cursorRawQuery = null;
            try {
                try {
                    cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(_id) FROM events", null);
                    cursorRawQuery.moveToFirst();
                    long j = cursorRawQuery.getLong(0);
                    SQLitePersistentQueue.logger.debug("getCount() = %d", Long.valueOf(j));
                    cursorRawQuery.close();
                    return j;
                } catch (SQLException e) {
                    SingularInstance.collectError("fe58");
                    throw new IOException(e);
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        }

        private long getMinId(SQLiteDatabase sQLiteDatabase) throws IOException {
            Cursor cursorRawQuery = null;
            try {
                try {
                    cursorRawQuery = sQLiteDatabase.rawQuery("SELECT MIN(_id) FROM events", null);
                    cursorRawQuery.moveToFirst();
                    long j = cursorRawQuery.getLong(0);
                    SQLitePersistentQueue.logger.debug("getMinId() id = %d", Long.valueOf(j));
                    cursorRawQuery.close();
                    return j;
                } catch (SQLException e) {
                    SingularInstance.collectError("fe57");
                    throw new IOException(e);
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        }

        private String removeHead(SQLiteDatabase sQLiteDatabase) throws Throwable {
            Throwable th;
            SQLException sQLException;
            Cursor cursor = null;
            try {
                try {
                    long minId = getMinId(sQLiteDatabase);
                    String[] strArr = {String.valueOf(minId)};
                    Cursor cursorQuery = sQLiteDatabase.query("events", new String[]{"value"}, "_id = ?", strArr, null, null, null);
                    try {
                        cursorQuery.moveToFirst();
                        if (cursorQuery.getCount() == 0) {
                            cursorQuery.close();
                            return null;
                        }
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                        sQLiteDatabase.delete("events", "_id = ?", strArr);
                        SQLitePersistentQueue.logger.debug("removeHead() _id = %d", Long.valueOf(minId));
                        cursorQuery.close();
                        return string;
                    } catch (SQLException e) {
                        sQLException = e;
                        cursor = cursorQuery;
                        SingularInstance.collectError("fe70");
                        throw new IOException(sQLException);
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor == null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (SQLException e2) {
                sQLException = e2;
            }
        }

        public long insert(String str) throws Throwable {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", str);
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase writableDatabase = this.helper.getWritableDatabase();
                    try {
                        long jInsert = writableDatabase.insert("events", null, contentValues);
                        SQLitePersistentQueue.logger.debug("insert() row = " + jInsert);
                        long count = getCount(writableDatabase);
                        if (count > 10000) {
                            SQLitePersistentQueue.logger.debug("Pruning Queue; current size = %d; max size = %d", Long.valueOf(count), 10000);
                            SingularInstance.collectError("e55");
                            removeHead(writableDatabase);
                        }
                        writableDatabase.close();
                        return jInsert;
                    } catch (SQLException e) {
                        e = e;
                        SingularInstance.collectError("fe55");
                        throw new IOException(e);
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabase = writableDatabase;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                } catch (SQLException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public SQLiteManager(SQLiteHelper sQLiteHelper) {
            this.helper = sQLiteHelper;
        }

        public String removeHead() throws IOException {
            SQLiteDatabase writableDatabase = null;
            try {
                writableDatabase = this.helper.getWritableDatabase();
                return removeHead(writableDatabase);
            } finally {
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }
    }

    @Override // com.singular.sdk.internal.Queue
    public synchronized String peek() throws IOException {
        return this.sqlite.getHead();
    }

    @Override // com.singular.sdk.internal.Queue
    public synchronized void remove() throws IOException {
        this.sqlite.removeHead();
    }

    @Override // com.singular.sdk.internal.Queue
    public synchronized void add(String str) throws IOException {
        if (this.sqlite.insert(str) == -1) {
            SingularInstance.collectError("fe50");
            throw new IOException("Failed to add element = " + str);
        }
    }

    public SQLitePersistentQueue(Context context) {
        this.sqlite = new SQLiteManager(new SQLiteHelper(context.getApplicationContext()));
    }
}
