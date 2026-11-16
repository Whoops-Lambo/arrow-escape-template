package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class yo {
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
            super(context, str, (SQLiteDatabase.CursorFactory) null, 12);
            this.kgy = context;
        }

        private ArrayList<String> uq(SQLiteDatabase sQLiteDatabase) {
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
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "f8wFkA+sbNXEbtZJjROhO17GKJkTuXs=", "V+c+gSeeXcaCRtJO", 368);
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
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "f8wFkA+sbNXEbtZJjROhO17GKJkTuXs=", "VOAOhwa9fcI=", Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
                com.bytedance.sdk.component.utils.sx.rz("DBHelper", th.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    rz(sQLiteDatabase);
                    kgy(sQLiteDatabase, yo.this.ahm);
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "f8wFkA+sbNXEbtZJjROhO17GKJkTuXs=", "VOAJmhSybtWBTtI=", 256);
                    com.bytedance.sdk.component.utils.sx.rz(th.getMessage(), new Object[0]);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b A[Catch: all -> 0x000c, TryCatch #0 {all -> 0x000c, blocks: (B:4:0x0008, B:7:0x000e, B:8:0x0017, B:10:0x001b, B:11:0x001f, B:12:0x002a, B:13:0x0035, B:14:0x0040, B:15:0x0049), top: B:25:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:11:0x001f A[Catch: all -> 0x000c, TryCatch #0 {all -> 0x000c, blocks: (B:4:0x0008, B:7:0x000e, B:8:0x0017, B:10:0x001b, B:11:0x001f, B:12:0x002a, B:13:0x0035, B:14:0x0040, B:15:0x0049), top: B:25:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:12:0x002a A[Catch: all -> 0x000c, TryCatch #0 {all -> 0x000c, blocks: (B:4:0x0008, B:7:0x000e, B:8:0x0017, B:10:0x001b, B:11:0x001f, B:12:0x002a, B:13:0x0035, B:14:0x0040, B:15:0x0049), top: B:25:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:13:0x0035 A[Catch: all -> 0x000c, TryCatch #0 {all -> 0x000c, blocks: (B:4:0x0008, B:7:0x000e, B:8:0x0017, B:10:0x001b, B:11:0x001f, B:12:0x002a, B:13:0x0035, B:14:0x0040, B:15:0x0049), top: B:25:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:14:0x0040 A[Catch: all -> 0x000c, TryCatch #0 {all -> 0x000c, blocks: (B:4:0x0008, B:7:0x000e, B:8:0x0017, B:10:0x001b, B:11:0x001f, B:12:0x002a, B:13:0x0035, B:14:0x0040, B:15:0x0049), top: B:25:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:15:0x0049 A[Catch: all -> 0x000c, TRY_LEAVE, TryCatch #0 {all -> 0x000c, blocks: (B:4:0x0008, B:7:0x000e, B:8:0x0017, B:10:0x001b, B:11:0x001f, B:12:0x002a, B:13:0x0035, B:14:0x0040, B:15:0x0049), top: B:25:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x001a A[DONT_GENERATE] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i <= i2) {
                kgy(sQLiteDatabase, yo.this.ahm);
                switch (i) {
                    case 1:
                        kgy(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                        kgy(sQLiteDatabase);
                        break;
                    case 3:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uq.dg.kgy());
                        kgy(sQLiteDatabase);
                        break;
                    case 4:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.kgy.ahm.ahm.rz());
                        kgy(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uq.vs.kgy());
                        kgy(sQLiteDatabase);
                        break;
                    case 6:
                        kgy(sQLiteDatabase);
                        break;
                }
            } else {
                try {
                    rz(sQLiteDatabase);
                    kgy(sQLiteDatabase, yo.this.ahm);
                    switch (i) {
                        case 1:
                            kgy(sQLiteDatabase);
                            break;
                        case 2:
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                            kgy(sQLiteDatabase);
                            break;
                        case 3:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uq.dg.kgy());
                            kgy(sQLiteDatabase);
                            break;
                        case 4:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.kgy.ahm.ahm.rz());
                            kgy(sQLiteDatabase);
                            break;
                        case 5:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uq.vs.kgy());
                            kgy(sQLiteDatabase);
                            break;
                        case 6:
                            kgy(sQLiteDatabase);
                            break;
                    }
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "f8wFkA+sbNXEbtZJjROhO17GKJkTuXs=", "VOAYhQSuaMOF", 308);
                }
            }
            if (i < 11) {
                try {
                    ahm(sQLiteDatabase);
                    com.bytedance.sdk.openadsdk.fpz.ahm.kgy(sQLiteDatabase);
                } catch (Throwable th2) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "f8wFkA+sbNXEbtZJjROhO17GKJkTuXs=", "VOAYhQSuaMOF", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE);
                    com.bytedance.sdk.component.utils.sx.rz("DBHelper", th2.getMessage());
                }
            }
        }

        private void ahm(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.at.kgy.rz.uq());
        }

        private void kgy(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uq.uq.kgy());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uq.nu.rz());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uq.dg.kgy());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uq.vs.kgy());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fpz.ahm.kgy());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uq.fpp.rz());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.kgy.ahm.ahm.rz());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.at.kgy.rz.rz());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uq.um.kgy());
        }

        private void rz(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayListUq = uq(sQLiteDatabase);
            if (arrayListUq != null && arrayListUq.size() > 0) {
                int size = arrayListUq.size();
                int i = 0;
                while (i < size) {
                    String str = arrayListUq.get(i);
                    i++;
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str + " ;");
                }
            }
        }

        private void kgy(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uq.uq.ahm());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uq.nu.uq());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uq.dg.ahm());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uq.vs.ahm());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class rz implements com.bytedance.sdk.component.uq.ahm {
        private SQLiteDatabase ahm = null;

        private synchronized void kgy() {
            kgy kgyVar;
            try {
                synchronized (yo.rz) {
                    try {
                        SQLiteDatabase sQLiteDatabase = this.ahm;
                        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                            if (com.bytedance.sdk.component.utils.gm.kgy(yo.this.rz())) {
                                yo yoVar = yo.this;
                                kgyVar = yoVar.new kgy(yoVar.rz(), "ttopensdk.db");
                            } else {
                                yo yoVar2 = yo.this;
                                kgyVar = yoVar2.new kgy(yoVar2.rz(), "ttopensdk_" + com.bytedance.sdk.component.utils.gm.rz(yo.this.rz()) + ".db");
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
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "f8wFkA+sbNXEZ85uvT2pPF7KLIECvmjUhQ==", "WOYolgiYS+6TZcdYgg==", 75);
                com.bytedance.sdk.component.utils.sx.rz("DBHelper", th2.getMessage());
                if (ahm()) {
                    throw th2;
                }
            }
        }

        @Override // com.bytedance.sdk.component.uq.ahm
        public synchronized long ahm(String str, String str2, ContentValues contentValues) {
            long jInsertWithOnConflict;
            try {
                kgy();
                jInsertWithOnConflict = this.ahm.insertWithOnConflict(str, str2, contentValues, 5);
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "f8wFkA+sbNXEZ85uvT2pPF7KLIECvmjUhQ==", "UuA+kBGoRtWyT8dRjRKl", 168);
                com.bytedance.sdk.component.utils.sx.rz("DBHelper", e.getMessage());
                if (ahm()) {
                    throw e;
                }
                jInsertWithOnConflict = -1;
            }
            return jInsertWithOnConflict;
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
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "f8wFkA+sbNXEZ85uvT2pPF7KLIECvmjUhQ==", "Svsohxo=", 116);
                com.bytedance.sdk.component.utils.sx.rz("DBHelper", th.getMessage());
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
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "f8wFkA+sbNXEZ85uvT2pPF7KLIECvmjUhQ==", "Tv4plBe5", 134);
                com.bytedance.sdk.component.utils.sx.rz("DBHelper", e.getMessage());
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
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "f8wFkA+sbNXEZ85uvT2pPF7KLIECvmjUhQ==", "UuA+kBGo", 151);
                com.bytedance.sdk.component.utils.sx.rz("DBHelper", e.getMessage());
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
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "f8wFkA+sbNXEZ85uvT2pPF7KLIECvmjUhQ==", "X+shkBe5", ModuleDescriptor.MODULE_VERSION);
                com.bytedance.sdk.component.utils.sx.rz("DBHelper", e.getMessage());
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

    public yo(Context context) {
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
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "f8wFkA+sbNU=", "B+cjnBfi", 49);
        }
    }

    public rz kgy() {
        return this.kgy;
    }
}
