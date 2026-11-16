package com.bytedance.sdk.component.yo.kgy.kgy.kgy;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.yo.kgy.yo;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
class ahm {
    private Context ahm;
    private C0222ahm kgy;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.yo.kgy.kgy.kgy.ahm$ahm, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class C0222ahm {
        private volatile SQLiteDatabase ahm = null;

        public synchronized void kgy(String str, String str2, List<com.bytedance.sdk.component.yo.kgy.uq.kgy> list) {
            JSONObject jSONObjectNoq;
            try {
                try {
                    kgy();
                    this.ahm.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i = 0; i < list.size(); i++) {
                        com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar = list.get(i);
                        if (kgyVar != null && (jSONObjectNoq = kgyVar.noq()) != null) {
                            contentValues.put("id", kgyVar.rz());
                            String strAhm = yo.noq().vs().ahm(jSONObjectNoq.toString());
                            if (!TextUtils.isEmpty(strAhm)) {
                                contentValues.put("value", strAhm);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.yo.kgy.rz.kgy.uq() && kgyVar.gf() > 0 && (kgyVar.uq() == 0 || kgyVar.uq() == 3)) {
                                    contentValues.put("channel", Integer.valueOf(kgyVar.gf()));
                                }
                                this.ahm.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.ahm.setTransactionSuccessful();
                    list.size();
                    if (this.ahm != null) {
                        this.ahm.endTransaction();
                    }
                } catch (Exception e) {
                    list.size();
                    if (ahm()) {
                        throw e;
                    }
                    if (this.ahm != null) {
                        this.ahm.endTransaction();
                    }
                }
            } catch (Throwable th) {
                if (this.ahm != null) {
                    this.ahm.endTransaction();
                }
                throw th;
            }
        }

        public C0222ahm() {
        }

        private boolean ahm() {
            SQLiteDatabase sQLiteDatabase = this.ahm;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        public void kgy(String str) throws SQLException {
            try {
                kgy();
                this.ahm.execSQL(str);
            } catch (Throwable th) {
                if (ahm()) {
                    throw th;
                }
            }
        }

        public Cursor kgy(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                kgy();
                return this.ahm.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                kgy kgyVar = new kgy();
                if (ahm()) {
                    throw th;
                }
                return kgyVar;
            }
        }

        public int kgy(String str, ContentValues contentValues, String str2, String[] strArr) throws Exception {
            try {
                kgy();
                return this.ahm.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                if (ahm()) {
                    throw e;
                }
                return 0;
            }
        }

        public long kgy(String str, String str2, ContentValues contentValues) throws Exception {
            try {
                kgy();
                return this.ahm.insert(str, str2, contentValues);
            } catch (Exception e) {
                if (ahm()) {
                    throw e;
                }
                return -1L;
            }
        }

        private void kgy() {
            try {
                if (this.ahm != null && this.ahm.isOpen()) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.ahm == null || !this.ahm.isOpen()) {
                            this.ahm = yo.noq().rz().kgy(yo.noq().ct());
                            this.ahm.setLockingEnabled(false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                if (ahm()) {
                    throw th2;
                }
            }
        }

        public int kgy(String str, String str2, String[] strArr) throws Exception {
            try {
                kgy();
                return this.ahm.delete(str, str2, strArr);
            } catch (Exception e) {
                if (ahm()) {
                    throw e;
                }
                return 0;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class kgy extends AbstractCursor {
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

        private kgy() {
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

    public C0222ahm kgy() {
        return this.kgy;
    }

    public ahm(Context context) {
        try {
            this.ahm = context.getApplicationContext();
            if (this.kgy == null) {
                this.kgy = new C0222ahm();
            }
        } catch (Throwable unused) {
        }
    }
}
