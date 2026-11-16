package com.bytedance.sdk.openadsdk.core.noq;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.utils.gm;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.xh;
import com.explorestack.protobuf.openrtb.LossReason;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ct {
    private static final Object rz = new Object();
    private Context ahm;
    private rz kgy;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ahm extends AbstractCursor {
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

        private ahm() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i) {
            return 0L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class kgy extends SQLiteOpenHelper {
        final Context kgy;

        public kgy(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
            this.kgy = context;
        }

        private ArrayList<String> ahm(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = null;
            try {
                try {
                    cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                    if (cursorRawQuery != null) {
                        while (cursorRawQuery.moveToNext()) {
                            String string = cursorRawQuery.getString(0);
                            if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                                arrayList.add(string);
                            }
                        }
                    }
                    if (cursorRawQuery != null) {
                        return arrayList;
                    }
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJN5jQWhKlr9KL0GsHnCkg==", "V+c+gSeeXcaCRtJO", Sdk.SDKError.Reason.MRAID_ERROR_VALUE);
                }
                return arrayList;
            } finally {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                kgy(sQLiteDatabase, this.kgy);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJN5jQWhKlr9KL0GsHnCkg==", "VOAOhwa9fcI=", LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE);
                th.getMessage();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    kgy(sQLiteDatabase);
                    kgy(sQLiteDatabase, ct.this.ahm);
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJN5jQWhKlr9KL0GsHnCkg==", "VOAJmhSybtWBTtI=", 236);
                    th.getMessage();
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            try {
                if (i <= i2) {
                    kgy(sQLiteDatabase, ct.this.ahm);
                } else {
                    kgy(sQLiteDatabase);
                    kgy(sQLiteDatabase, ct.this.ahm);
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJN5jQWhKlr9KL0GsHnCkg==", "VOAYhQSuaMOF", 259);
            }
        }

        private void kgy(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayListAhm = ahm(sQLiteDatabase);
            if (arrayListAhm != null && arrayListAhm.size() > 0) {
                int size = arrayListAhm.size();
                int i = 0;
                while (i < size) {
                    String str = arrayListAhm.get(i);
                    i++;
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str + " ;");
                }
            }
        }

        private void kgy(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.kus.kgy.kgy.ahm.fi());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.kus.kgy.kgy.ahm.gf());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class rz implements com.bytedance.sdk.component.uq.ahm {
        private SQLiteDatabase ahm = null;

        private synchronized void kgy() {
            kgy kgyVar;
            try {
                synchronized (ct.rz) {
                    try {
                        SQLiteDatabase sQLiteDatabase = this.ahm;
                        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                            if (gm.kgy(ct.this.rz())) {
                                ct ctVar = ct.this;
                                kgyVar = ctVar.new kgy(ctVar.rz(), "pag_business.db");
                            } else {
                                ct ctVar2 = ct.this;
                                kgyVar = ctVar2.new kgy(ctVar2.rz(), "pag_business_" + gm.rz(ct.this.rz()) + ".db");
                            }
                            SQLiteDatabase writableDatabase = kgyVar.getWritableDatabase();
                            this.ahm = writableDatabase;
                            writableDatabase.setLockingEnabled(false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJNwlSKRBFL6KLECqGjFgVnS", "WOYolgiYS+6TZcdYgg==", 65);
                th2.getMessage();
                if (ahm()) {
                    throw th2;
                }
            }
        }

        @Override // com.bytedance.sdk.component.uq.ahm
        public synchronized long ahm(String str, String str2, ContentValues contentValues) {
            try {
                kgy();
                SQLiteDatabase sQLiteDatabase = this.ahm;
                if (sQLiteDatabase == null) {
                    return -1L;
                }
                return sQLiteDatabase.insertWithOnConflict(str, str2, contentValues, 5);
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJNwlSKRBFL6KLECqGjFgVnS", "UuA+kBGoRtWyT8dRjRKl", 160);
                e.getMessage();
                return -1L;
            }
        }

        public rz() {
        }

        @Override // com.bytedance.sdk.component.uq.ahm
        public SQLiteDatabase noq() {
            kgy();
            return this.ahm;
        }

        private synchronized boolean ahm() {
            SQLiteDatabase sQLiteDatabase = this.ahm;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        @Override // com.bytedance.sdk.component.uq.ahm
        public synchronized Cursor kgy(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursorQuery;
            try {
                kgy();
                cursorQuery = this.ahm.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJNwlSKRBFL6KLECqGjFgVnS", "Svsohxo=", 106);
                th.getMessage();
                ahm ahmVar = new ahm();
                if (ahm()) {
                    throw th;
                }
                cursorQuery = ahmVar;
            }
            return cursorQuery;
        }

        @Override // com.bytedance.sdk.component.uq.ahm
        public synchronized int kgy(String str, ContentValues contentValues, String str2, String[] strArr) {
            int iUpdate;
            try {
                kgy();
                iUpdate = this.ahm.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJNwlSKRBFL6KLECqGjFgVnS", "Tv4plBe5", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                e.getMessage();
                if (ahm()) {
                    throw e;
                }
                iUpdate = 0;
            }
            return iUpdate;
        }

        @Override // com.bytedance.sdk.component.uq.ahm
        public synchronized long kgy(String str, String str2, ContentValues contentValues) {
            long jReplace;
            try {
                kgy();
                jReplace = this.ahm.replace(str, str2, contentValues);
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJNwlSKRBFL6KLECqGjFgVnS", "UuA+kBGo", 141);
                e.getMessage();
                if (ahm()) {
                    throw e;
                }
                jReplace = -1;
            }
            return jReplace;
        }

        @Override // com.bytedance.sdk.component.uq.ahm
        public synchronized int kgy(String str, String str2, String[] strArr) {
            int iDelete;
            try {
                kgy();
                iDelete = this.ahm.delete(str, str2, strArr);
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJNwlSKRBFL6KLECqGjFgVnS", "X+shkBe5", TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173);
                e.getMessage();
                if (ahm()) {
                    throw e;
                }
                iDelete = 0;
            }
            return iDelete;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context rz() {
        Context context = this.ahm;
        return context == null ? xh.kgy() : context;
    }

    public ct(Context context) {
        Context applicationContext;
        try {
            if (context == null) {
                applicationContext = xh.kgy();
            } else {
                applicationContext = context.getApplicationContext();
            }
            this.ahm = applicationContext;
            if (this.kgy == null) {
                this.kgy = new rz();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWA==", "B+cjnBfi", 39);
        }
    }

    public rz kgy() {
        return this.kgy;
    }
}
