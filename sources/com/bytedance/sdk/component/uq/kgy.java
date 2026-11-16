package com.bytedance.sdk.component.uq;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.utils.gm;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kgy implements com.bytedance.sdk.component.uq.ahm {
    private final Context kgy;
    private final Object ahm = new Object();
    private SQLiteDatabase rz = null;
    private C0218kgy uq = null;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ahm extends AbstractCursor {
        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i) {
            return true;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i) {
            return 0L;
        }

        private ahm() {
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.uq.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class C0218kgy extends SQLiteOpenHelper {
        public C0218kgy(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, kgy.this.uq());
            setWriteAheadLoggingEnabled(kgy.this.ct());
        }

        private ArrayList<String> rz(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        String string = cursorRawQuery.getString(0);
                        if (!"android_metadata".equals(string) && !"sqlite_sequence".equals(string)) {
                            arrayList.add(string);
                        }
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    return arrayList;
                }
            } catch (Throwable th) {
                try {
                    rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4gT", "ee8+kCe+QcKMWtJPyDWhPFrsLIYGk3nCjmLSUZwUsg==", "V+c+gSeeXcaCRtJO", 247);
                } finally {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                }
            }
            return arrayList;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                kgy.this.ahm(sQLiteDatabase);
            } catch (Throwable th) {
                rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4gT", "ee8+kCe+QcKMWtJPyDWhPFrsLIYGk3nCjmLSUZwUsg==", "VOAOhwa9fcI=", ModuleDescriptor.MODULE_VERSION);
                sx.rz(kgy.this.kgy(), th.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            try {
                if (i > i2) {
                    kgy(sQLiteDatabase);
                    return;
                }
                kgy.this.ahm(sQLiteDatabase);
                kgy.this.kgy();
                kgy.this.kgy(sQLiteDatabase, i, i2);
            } catch (Throwable th) {
                rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4gT", "ee8+kCe+QcKMWtJPyDWhPFrsLIYGk3nCjmLSUZwUsg==", "VOAYhQSuaMOF", 210);
                kgy(sQLiteDatabase);
                sx.rz(kgy.this.kgy(), th.getMessage());
            }
        }

        private void ahm(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayListRz = rz(sQLiteDatabase);
            int size = arrayListRz.size();
            int i = 0;
            while (i < size) {
                String str = arrayListRz.get(i);
                i++;
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str + " ;");
            }
        }

        private void kgy(SQLiteDatabase sQLiteDatabase) {
            try {
                ahm(sQLiteDatabase);
                kgy.this.ahm(sQLiteDatabase);
            } catch (Throwable th) {
                rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4gT", "ee8+kCe+QcKMWtJPyDWhPFrsLIYGk3nCjmLSUZwUsg==", "SesvgAqwbQ==", Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
                sx.rz(kgy.this.kgy(), th.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            super.onConfigure(sQLiteDatabase);
            kgy.this.kgy(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            try {
                kgy(sQLiteDatabase);
            } catch (Throwable th) {
                rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4gT", "ee8+kCe+QcKMWtJPyDWhPFrsLIYGk3nCjmLSUZwUsg==", "VOAJmhSybtWBTtI=", 194);
                sx.rz(kgy.this.kgy(), th.getMessage());
            }
        }
    }

    private synchronized void fi() {
        try {
            synchronized (this.ahm) {
                try {
                    SQLiteDatabase sQLiteDatabase = this.rz;
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                        C0218kgy c0218kgy = new C0218kgy(this.kgy, rz());
                        this.uq = c0218kgy;
                        SQLiteDatabase writableDatabase = c0218kgy.getWritableDatabase();
                        this.rz = writableDatabase;
                        writableDatabase.setLockingEnabled(false);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4gT", "ee8+kCe+QcKMWtJP", "WOYolgiYS+6TZcdYgg==", 63);
            sx.rz(kgy(), th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.uq.ahm
    public synchronized long ahm(String str, String str2, ContentValues contentValues) {
        long jInsertWithOnConflict;
        try {
            fi();
            jInsertWithOnConflict = this.rz.insertWithOnConflict(str, str2, contentValues, 5);
        } catch (Exception e) {
            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4gT", "ee8+kCe+QcKMWtJP", "UuA+kBGoRtWyT8dRjRKl", 148);
            sx.rz(kgy(), e.getMessage());
            jInsertWithOnConflict = -1;
        }
        return jInsertWithOnConflict;
    }

    public abstract String ahm();

    public abstract void ahm(SQLiteDatabase sQLiteDatabase);

    public boolean ct() {
        return false;
    }

    @Override // com.bytedance.sdk.component.uq.ahm
    public synchronized Cursor kgy(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        Cursor ahmVar;
        try {
            fi();
            ahmVar = this.rz.query(str, strArr, str2, strArr2, str3, str4, str5);
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4gT", "ee8+kCe+QcKMWtJP", "Svsohxo=", 109);
            sx.rz(kgy(), th.getMessage());
            ahmVar = new ahm();
        }
        return ahmVar;
    }

    public abstract String kgy();

    public abstract void kgy(SQLiteDatabase sQLiteDatabase, int i, int i2);

    @Override // com.bytedance.sdk.component.uq.ahm
    public synchronized SQLiteDatabase noq() {
        fi();
        return this.rz;
    }

    public abstract int uq();

    public String rz() {
        if (gm.kgy(this.kgy)) {
            return ahm() + ".db";
        }
        return ahm() + "_" + gm.rz(this.kgy) + ".db";
    }

    public kgy(Context context) {
        this.kgy = context;
    }

    public SQLiteOpenHelper yo() {
        fi();
        return this.uq;
    }

    public void kgy(SQLiteDatabase sQLiteDatabase) {
    }

    public void kgy(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4gT", "ee8+kCe+QcKMWtJP", "XvYoljC9b8I=", 97);
            sx.rz("DBHelper", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.uq.ahm
    public synchronized int kgy(String str, ContentValues contentValues, String str2, String[] strArr) {
        int iUpdate;
        try {
            fi();
            iUpdate = this.rz.update(str, contentValues, str2, strArr);
        } catch (Exception e) {
            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4gT", "ee8+kCe+QcKMWtJP", "Tv4plBe5", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            sx.rz(kgy(), e.getMessage());
            iUpdate = 0;
        }
        return iUpdate;
    }

    @Override // com.bytedance.sdk.component.uq.ahm
    public synchronized long kgy(String str, String str2, ContentValues contentValues) {
        long jReplace;
        try {
            fi();
            jReplace = this.rz.replace(str, str2, contentValues);
        } catch (Exception e) {
            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4gT", "ee8+kCe+QcKMWtJP", "UuA+kBGo", 135);
            sx.rz(kgy(), e.getMessage());
            jReplace = -1;
        }
        return jReplace;
    }

    @Override // com.bytedance.sdk.component.uq.ahm
    public synchronized int kgy(String str, String str2, String[] strArr) {
        int iDelete;
        try {
            fi();
            iDelete = this.rz.delete(str, str2, strArr);
        } catch (Exception e) {
            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4gT", "ee8+kCe+QcKMWtJP", "X+shkBe5", 161);
            sx.rz(kgy(), e.getMessage());
            iDelete = 0;
        }
        return iDelete;
    }
}
