package com.bytedance.sdk.openadsdk.um;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.sdk.component.gf.kgy.noq;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class kgy {
    private static Context uq;
    private Boolean fi;
    private ahm noq;
    private com.bytedance.sdk.openadsdk.um.rz.kgy yo;
    public static final long kgy = com.bytedance.sdk.openadsdk.um.uq.kgy.kgy();
    private static final String[] ahm = {"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", "mediation", "is_init", "extra"};
    private static final long rz = System.currentTimeMillis();
    private final ArrayList<uq> ct = new ArrayList<>();
    private final Runnable gf = new Runnable() { // from class: com.bytedance.sdk.openadsdk.um.kgy.1
        @Override // java.lang.Runnable
        public void run() {
            if (!kgy.this.ahm() || kgy.this.ct.isEmpty()) {
                return;
            }
            kgy kgyVar = kgy.this;
            kgyVar.kgy(kgyVar.ct);
            kgy.this.ct.clear();
        }
    };
    private int ra = 0;
    private int nu = 0;
    private long at = -1;
    private final Runnable twf = new Runnable() { // from class: com.bytedance.sdk.openadsdk.um.kgy.5
        @Override // java.lang.Runnable
        public void run() {
            kgy.this.ahm(false);
        }
    };
    private final Runnable kus = new Runnable() { // from class: com.bytedance.sdk.openadsdk.um.kgy.6
        @Override // java.lang.Runnable
        public void run() {
            kgy.this.ahm(true);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void ahm(boolean z) {
        String str;
        String[] strArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        try {
            SQLiteDatabase sQLiteDatabaseUq = uq();
            if (sQLiteDatabaseUq != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (z) {
                    strArr = new String[]{String.valueOf(jCurrentTimeMillis), "show", "click"};
                    str = "timestamp < ? AND (scene = ? OR scene = ?)";
                } else {
                    str = "timestamp < ?";
                    strArr = new String[]{String.valueOf(this.noq.getUploadIntervalTime() < 86400000 ? rz : kgy)};
                }
                String[] strArr2 = strArr;
                int iMax = Math.max(10, this.noq.getOnceLogCount());
                int i8 = iMax > 100 ? 10 : iMax;
                Cursor cursorQuery = sQLiteDatabaseUq.query("monitor_table", ahm, str, strArr2, null, null, "_id ASC", String.valueOf(i8));
                if (cursorQuery != null) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int columnIndex = cursorQuery.getColumnIndex("_id");
                    int columnIndex2 = cursorQuery.getColumnIndex("sdk_version");
                    int columnIndex3 = cursorQuery.getColumnIndex("scene");
                    int columnIndex4 = cursorQuery.getColumnIndex("start_count");
                    int columnIndex5 = cursorQuery.getColumnIndex("success_count");
                    int columnIndex6 = cursorQuery.getColumnIndex("fail_count");
                    int columnIndex7 = cursorQuery.getColumnIndex("rit");
                    int columnIndex8 = cursorQuery.getColumnIndex("tag");
                    int columnIndex9 = cursorQuery.getColumnIndex("label");
                    int i9 = i8;
                    int columnIndex10 = cursorQuery.getColumnIndex("timestamp");
                    int columnIndex11 = cursorQuery.getColumnIndex("mediation");
                    int columnIndex12 = cursorQuery.getColumnIndex("is_init");
                    ArrayList arrayList3 = arrayList;
                    int columnIndex13 = cursorQuery.getColumnIndex("extra");
                    while (cursorQuery.moveToNext()) {
                        int i10 = columnIndex13;
                        com.bytedance.sdk.openadsdk.um.ahm.kgy kgyVar = new com.bytedance.sdk.openadsdk.um.ahm.kgy();
                        if (columnIndex >= 0) {
                            long j = cursorQuery.getLong(columnIndex);
                            if (!z) {
                                i = columnIndex8;
                                i2 = columnIndex9;
                                if (j == this.at && j > 0) {
                                    break;
                                }
                            } else {
                                i = columnIndex8;
                                i2 = columnIndex9;
                            }
                            kgyVar.kgy(j);
                            arrayList2.add(String.valueOf(j));
                        } else {
                            i = columnIndex8;
                            i2 = columnIndex9;
                        }
                        if (columnIndex2 >= 0) {
                            kgyVar.kgy(cursorQuery.getString(columnIndex2));
                        }
                        if (columnIndex3 >= 0) {
                            kgyVar.ahm(cursorQuery.getString(columnIndex3));
                        }
                        if (columnIndex4 >= 0) {
                            kgyVar.kgy(cursorQuery.getInt(columnIndex4));
                        }
                        if (columnIndex5 >= 0) {
                            kgyVar.ahm(cursorQuery.getInt(columnIndex5));
                        }
                        if (columnIndex6 >= 0) {
                            kgyVar.rz(cursorQuery.getInt(columnIndex6));
                        }
                        if (columnIndex7 >= 0) {
                            kgyVar.rz(cursorQuery.getString(columnIndex7));
                        }
                        if (i >= 0) {
                            i3 = i;
                            kgyVar.uq(cursorQuery.getString(i3));
                        } else {
                            i3 = i;
                        }
                        if (i2 >= 0) {
                            i4 = i2;
                            kgyVar.ct(cursorQuery.getString(i4));
                        } else {
                            i4 = i2;
                        }
                        if (columnIndex10 >= 0) {
                            kgyVar.ahm(cursorQuery.getLong(columnIndex10));
                        }
                        if (columnIndex11 >= 0) {
                            i5 = columnIndex11;
                            kgyVar.noq(cursorQuery.getString(i5));
                        } else {
                            i5 = columnIndex11;
                        }
                        if (columnIndex12 >= 0) {
                            i6 = columnIndex12;
                            kgyVar.uq(cursorQuery.getInt(i6));
                        } else {
                            i6 = columnIndex12;
                        }
                        if (i10 >= 0) {
                            i7 = i10;
                            kgyVar.yo(cursorQuery.getString(i7));
                        } else {
                            i7 = i10;
                        }
                        ArrayList arrayList4 = arrayList3;
                        arrayList4.add(kgyVar);
                        int i11 = i5;
                        columnIndex8 = i3;
                        columnIndex11 = i11;
                        int i12 = i6;
                        columnIndex9 = i4;
                        columnIndex12 = i12;
                        columnIndex13 = i7;
                        arrayList3 = arrayList4;
                        columnIndex2 = columnIndex2;
                        columnIndex = columnIndex;
                    }
                    ArrayList arrayList5 = arrayList3;
                    cursorQuery.close();
                    if (arrayList5.isEmpty()) {
                        return;
                    }
                    this.noq.onMonitorUpload(arrayList5);
                    SQLiteDatabase sQLiteDatabaseRz = rz();
                    if (sQLiteDatabaseRz != null && sQLiteDatabaseRz.isOpen()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("_id IN (");
                        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                            sb.append("?");
                            if (i13 < arrayList2.size() - 1) {
                                sb.append(",");
                            }
                        }
                        sb.append(")");
                        sQLiteDatabaseRz.delete("monitor_table", sb.toString(), (String[]) arrayList2.toArray(new String[0]));
                        com.bytedance.sdk.openadsdk.um.rz.kgy kgyVar2 = this.yo;
                        if (kgyVar2 != null) {
                            if (z) {
                                kgyVar2.ahm(jCurrentTimeMillis);
                            } else {
                                kgyVar2.kgy(rz);
                            }
                        }
                    }
                    if (arrayList5.size() >= i9) {
                        if (z) {
                            if (this.nu > 1000) {
                                return;
                            }
                        } else if (this.ra > 1000) {
                            return;
                        }
                        if (z) {
                            kgy(false, false);
                        } else {
                            kgy(false);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EeriFP4T8=", "efs+uAyyYNOPWPRYggWlOg==", "Ses9mhGoRciH", 590);
        }
    }

    public static /* synthetic */ int gf(kgy kgyVar) {
        int i = kgyVar.nu;
        kgyVar.nu = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgy(List<uq> list) {
        com.bytedance.sdk.openadsdk.um.ahm.kgy kgyVarKgy;
        if (list == null || list.isEmpty()) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseRz = rz();
                if (sQLiteDatabaseRz != null) {
                    try {
                        sQLiteDatabaseRz.beginTransaction();
                        for (int i = 0; i < list.size(); i++) {
                            uq uqVar = list.get(i);
                            if (uqVar != null && (kgyVarKgy = uqVar.kgy()) != null) {
                                Cursor cursorQuery = sQLiteDatabaseRz.query("monitor_table", ahm, "sdk_version = ? AND scene = ? AND rit = ? AND tag = ? AND label = ? AND mediation = ? AND is_init = ? AND timestamp = ? AND extra = ?", new String[]{kgyVarKgy.ahm(), kgyVarKgy.rz(), kgyVarKgy.yo(), kgyVarKgy.fi(), kgyVarKgy.gf(), kgyVarKgy.nu(), String.valueOf(kgyVarKgy.at()), String.valueOf(kgyVarKgy.ra()), kgyVarKgy.twf()}, null, null, null);
                                if (cursorQuery != null) {
                                    if (cursorQuery.moveToNext()) {
                                        int columnIndex = cursorQuery.getColumnIndex("_id");
                                        if (columnIndex >= 0) {
                                            kgyVarKgy.kgy(cursorQuery.getLong(columnIndex));
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("start_count");
                                        if (columnIndex2 >= 0) {
                                            kgyVarKgy.kgy(cursorQuery.getInt(columnIndex2) + kgyVarKgy.uq());
                                        }
                                        int columnIndex3 = cursorQuery.getColumnIndex("success_count");
                                        if (columnIndex3 >= 0) {
                                            kgyVarKgy.ahm(cursorQuery.getInt(columnIndex3) + kgyVarKgy.ct());
                                        }
                                        int columnIndex4 = cursorQuery.getColumnIndex("fail_count");
                                        if (columnIndex4 >= 0) {
                                            kgyVarKgy.rz(cursorQuery.getInt(columnIndex4) + kgyVarKgy.noq());
                                        }
                                    }
                                    cursorQuery.close();
                                }
                                ContentValues contentValues = new ContentValues();
                                if (kgyVarKgy.kgy() > 0) {
                                    contentValues.put("_id", Long.valueOf(kgyVarKgy.kgy()));
                                }
                                contentValues.put("sdk_version", kgyVarKgy.ahm());
                                contentValues.put("scene", kgyVarKgy.rz());
                                contentValues.put("start_count", Integer.valueOf(kgyVarKgy.uq()));
                                contentValues.put("success_count", Integer.valueOf(kgyVarKgy.ct()));
                                contentValues.put("fail_count", Integer.valueOf(kgyVarKgy.noq()));
                                contentValues.put("rit", kgyVarKgy.yo());
                                contentValues.put("tag", kgyVarKgy.fi());
                                contentValues.put("label", kgyVarKgy.gf());
                                contentValues.put("timestamp", Long.valueOf(kgyVarKgy.ra()));
                                contentValues.put("mediation", kgyVarKgy.nu());
                                contentValues.put("is_init", Integer.valueOf(kgyVarKgy.at()));
                                contentValues.put("extra", kgyVarKgy.twf());
                                long jInsertWithOnConflict = sQLiteDatabaseRz.insertWithOnConflict("monitor_table", null, contentValues, 5);
                                if (jInsertWithOnConflict > 0 && this.at < 0 && kgyVarKgy.kgy() < 0) {
                                    this.at = jInsertWithOnConflict;
                                }
                            }
                        }
                        sQLiteDatabaseRz.setTransactionSuccessful();
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabase = sQLiteDatabaseRz;
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EeriFP4T8=", "efs+uAyyYNOPWPRYggWlOg==", "XvYoljC9f8KyT9RSnhU=", 263);
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.endTransaction();
                            return;
                        }
                        return;
                    }
                }
                if (sQLiteDatabaseRz != null) {
                    sQLiteDatabaseRz.endTransaction();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th3, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EeriFP4T8=", "efs+uAyyYNOPWPRYggWlOg==", "XvYoljC9f8KyT9RSnhU=", 272);
        }
    }

    private SQLiteDatabase rz() {
        ahm ahmVar = this.noq;
        return (ahmVar == null || !ahmVar.useNewDb()) ? com.bytedance.sdk.openadsdk.um.kgy.kgy.kgy() : com.bytedance.sdk.openadsdk.um.kgy.ahm.fi().gf();
    }

    private SQLiteDatabase uq() {
        ahm ahmVar = this.noq;
        return (ahmVar == null || !ahmVar.useNewDb()) ? com.bytedance.sdk.openadsdk.um.kgy.kgy.ahm() : com.bytedance.sdk.openadsdk.um.kgy.ahm.fi().ra();
    }

    private kgy(ahm ahmVar) {
        try {
            this.noq = new BusMonitorDependWrapper(ahmVar);
            this.yo = new com.bytedance.sdk.openadsdk.um.rz.kgy(ahmVar.getContext());
            uq = ahmVar.getContext();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EeriFP4T8=", "efs+uAyyYNOPWPRYggWlOg==", "B+cjnBfi", 108);
        }
    }

    public static /* synthetic */ int uq(kgy kgyVar) {
        int i = kgyVar.ra;
        kgyVar.ra = i + 1;
        return i;
    }

    public static kgy kgy(ahm ahmVar) {
        return new kgy(ahmVar);
    }

    public static Context kgy() {
        Context context = uq;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    public void kgy(final uq uqVar) {
        if (uqVar == null || !ahm()) {
            return;
        }
        final noq handler = this.noq.getHandler();
        handler.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.um.kgy.2
            @Override // java.lang.Runnable
            public void run() {
                kgy.this.ct.add(uqVar);
                if (kgy.this.ct.size() >= 10) {
                    handler.ahm(kgy.this.gf);
                    kgy kgyVar = kgy.this;
                    kgyVar.kgy(kgyVar.ct);
                    kgy.this.ct.clear();
                }
            }
        });
        handler.ahm(this.gf);
        handler.kgy(this.gf, 5000L);
    }

    public void kgy(final boolean z) {
        final noq handler = this.noq.getHandler();
        ahm ahmVar = this.noq;
        if (ahmVar == null || handler == null || ahmVar.getContext() == null || this.yo == null || !ahm()) {
            return;
        }
        handler.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.um.kgy.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    kgy.uq(kgy.this);
                    if (z) {
                        long jKgy = kgy.this.yo.kgy();
                        if (jKgy == 0) {
                            kgy.this.yo.kgy(System.currentTimeMillis());
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.um.uq.kgy.kgy(jKgy) && System.currentTimeMillis() - jKgy < kgy.this.noq.getUploadIntervalTime()) {
                            if (System.currentTimeMillis() - kgy.this.yo.ahm() >= kgy.this.noq.getHighUploadIntervalTime() && kgy.this.noq.allowHighUploadReport()) {
                                handler.kgy(kgy.this.kus);
                                return;
                            }
                            return;
                        }
                    }
                    handler.kgy(kgy.this.twf);
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EeriFP4T8=", "efs+uAyyYNOPWPRYggWlOh+9", "Sfsj", 351);
                }
            }
        }, Math.max(this.noq.getOnceLogInterval(), 10000));
    }

    public void kgy(final boolean z, boolean z2) {
        final noq handler = this.noq.getHandler();
        ahm ahmVar = this.noq;
        if (ahmVar == null || handler == null || ahmVar.getContext() == null || this.yo == null || !ahm()) {
            return;
        }
        int iMax = Math.max(this.noq.getOnceLogInterval(), 10000);
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.um.kgy.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    boolean z3 = z;
                    kgy kgyVar = kgy.this;
                    if (z3) {
                        if (System.currentTimeMillis() - kgyVar.yo.ahm() < kgy.this.noq.getHighUploadIntervalTime() || !kgy.this.noq.allowHighUploadReport()) {
                            return;
                        }
                    } else {
                        kgy.gf(kgyVar);
                    }
                    handler.kgy(kgy.this.kus);
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EeriFP4T8=", "efs+uAyyYNOPWPRYggWlOh+6", "Sfsj", 397);
                }
            }
        };
        if (z2) {
            handler.kgy(runnable);
        } else {
            handler.kgy(runnable, iMax);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ahm() {
        if (this.fi == null) {
            ahm ahmVar = this.noq;
            this.fi = Boolean.valueOf((ahmVar == null || ahmVar.getContext() == null || !this.noq.isMonitorOpen() || this.noq.getHandler() == null) ? false : true);
        }
        return this.fi.booleanValue();
    }
}
