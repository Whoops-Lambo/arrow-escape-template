package com.bytedance.sdk.openadsdk.kus.kgy.kgy;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.core.noq.uq;
import com.bytedance.sdk.openadsdk.core.xh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ahm {
    private static volatile ahm kgy;
    private final WeakReference<ConcurrentHashMap<String, ioy>> ahm = new WeakReference<>(new ConcurrentHashMap());

    private int ra() {
        com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar = null;
        try {
            com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar2 = new com.bytedance.sdk.openadsdk.fpp.kgy.kgy(uq.kgy(xh.kgy(), "iab_history", new String[]{"COUNT(*)"}, null, null, null, null, null));
            try {
                if (kgyVar2.moveToFirst()) {
                    int i = kgyVar2.getInt(0);
                    kgyVar2.close();
                    return i;
                }
                kgyVar2.close();
            } catch (Throwable th) {
                th = th;
                kgyVar = kgyVar2;
                try {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "XOs5vQqvfciSU/RSmR+0", 586);
                } finally {
                    if (kgyVar != null) {
                        kgyVar.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return 0;
    }

    public static String fi() {
        return "CREATE TABLE IF NOT EXISTS iab_history (_id INTEGER PRIMARY KEY AUTOINCREMENT,url TEXT,main_title TEXT,material_key TEXT,time TEXT,item_index INTEGER,sdk_version TEXT)";
    }

    public static String gf() {
        return "CREATE TABLE IF NOT EXISTS iab_history_material (material_key TEXT PRIMARY KEY,material TEXT,sdk_version TEXT,count INTEGER DEFAULT 0)";
    }

    public void ahm(com.bytedance.sdk.openadsdk.kus.kgy.kgy kgyVar) {
        Throwable th;
        int columnIndex;
        if (kgyVar == null || TextUtils.isEmpty(kgyVar.yo())) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", kgyVar.ct());
            contentValues.put("main_title", kgyVar.uq());
            contentValues.put("material_key", kgyVar.yo());
            contentValues.put("time", kgyVar.noq());
            contentValues.put("item_index", Integer.valueOf(kgyVar.ahm()));
            contentValues.put("sdk_version", kgyVar.kgy());
            uq.kgy(xh.kgy(), "iab_history", contentValues);
            String strRz = kgyVar.rz();
            if (TextUtils.isEmpty(strRz)) {
                return;
            }
            com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar2 = null;
            try {
                com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar3 = new com.bytedance.sdk.openadsdk.fpp.kgy.kgy(uq.kgy(xh.kgy(), "iab_history_material", new String[]{"count"}, "material_key=?", new String[]{kgyVar.yo()}, null, null, null));
                try {
                    int i = (!kgyVar3.moveToFirst() || (columnIndex = kgyVar3.getColumnIndex("count")) == -1) ? 0 : kgyVar3.getInt(columnIndex);
                    kgyVar3.close();
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("material_key", kgyVar.yo());
                    contentValues2.put("material", strRz);
                    contentValues2.put("sdk_version", kgyVar.kgy());
                    contentValues2.put("count", Integer.valueOf(i + 1));
                    uq.ahm(xh.kgy(), "iab_history_material", contentValues2);
                } catch (Throwable th2) {
                    th = th2;
                    kgyVar2 = kgyVar3;
                    if (kgyVar2 == null) {
                        throw th;
                    }
                    kgyVar2.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th4, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "UuA+kBGoRtW1WtNcmBSIIUj6Ioca", 258);
        }
    }

    public void kgy(com.bytedance.sdk.openadsdk.kus.kgy.kgy kgyVar) {
        Throwable th;
        int i;
        boolean z;
        if (kgyVar == null || TextUtils.isEmpty(kgyVar.yo())) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", kgyVar.ct());
            contentValues.put("main_title", kgyVar.uq());
            contentValues.put("material_key", kgyVar.yo());
            contentValues.put("time", kgyVar.noq());
            contentValues.put("item_index", Integer.valueOf(kgyVar.ahm()));
            contentValues.put("sdk_version", kgyVar.kgy());
            uq.kgy(xh.kgy(), "iab_history", contentValues);
            String strRz = kgyVar.rz();
            if (TextUtils.isEmpty(strRz)) {
                return;
            }
            com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar2 = null;
            try {
                com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar3 = new com.bytedance.sdk.openadsdk.fpp.kgy.kgy(uq.kgy(xh.kgy(), "iab_history_material", new String[]{"count"}, "material_key=?", new String[]{kgyVar.yo()}, null, null, null));
                try {
                    if (kgyVar3.moveToFirst()) {
                        int columnIndex = kgyVar3.getColumnIndex("count");
                        if (columnIndex != -1) {
                            i = kgyVar3.getInt(columnIndex);
                            z = true;
                        } else {
                            z = true;
                            i = 0;
                        }
                    } else {
                        i = 0;
                        z = false;
                    }
                    kgyVar3.close();
                    if (z) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("count", Integer.valueOf(i + 1));
                        uq.kgy(xh.kgy(), "iab_history_material", contentValues2, "material_key=?", new String[]{kgyVar.yo()});
                    } else {
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("material_key", kgyVar.yo());
                        contentValues3.put("material", strRz);
                        contentValues3.put("sdk_version", kgyVar.kgy());
                        contentValues3.put("count", (Integer) 0);
                        uq.kgy(xh.kgy(), "iab_history_material", contentValues3);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    kgyVar2 = kgyVar3;
                    if (kgyVar2 == null) {
                        throw th;
                    }
                    kgyVar2.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th4, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "UuA+kBGoQc6TXthPlQ==", 206);
        }
    }

    public void noq() {
        try {
            ArrayList arrayList = new ArrayList();
            int iRa = ra();
            if (iRa > 1000) {
                arrayList.addAll(kgy(iRa - 1000));
            }
            for (String str : kgy(System.currentTimeMillis() - 2592000000L)) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.utils.ahm.ct()) {
                rz(arrayList);
            } else {
                ahm(arrayList);
            }
            kgy(arrayList);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "WOYolgidZ8OjRtJcgjmpO0/hP4w=", 502);
        }
    }

    public List<com.bytedance.sdk.openadsdk.kus.kgy.kgy> rz() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor cursorQuery = com.bytedance.sdk.openadsdk.core.noq.ahm.ahm(xh.kgy()).noq().query("iab_history", new String[]{"_id", "url", "main_title", "material_key", "time", "item_index"}, null, null, null, null, "time DESC");
            if (cursorQuery == null) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            }
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("url");
            int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("main_title");
            int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("material_key");
            int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow("time");
            int columnIndexOrThrow6 = cursorQuery.getColumnIndexOrThrow("item_index");
            while (cursorQuery.moveToNext()) {
                com.bytedance.sdk.openadsdk.kus.kgy.kgy kgyVar = new com.bytedance.sdk.openadsdk.kus.kgy.kgy();
                kgyVar.kgy(cursorQuery.getInt(columnIndexOrThrow));
                kgyVar.ct(cursorQuery.getString(columnIndexOrThrow2));
                kgyVar.uq(cursorQuery.getString(columnIndexOrThrow3));
                kgyVar.ahm(cursorQuery.getString(columnIndexOrThrow4));
                kgyVar.rz(cursorQuery.getString(columnIndexOrThrow5));
                kgyVar.ahm(cursorQuery.getInt(columnIndexOrThrow6));
                arrayList.add(kgyVar);
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    public void uq(com.bytedance.sdk.openadsdk.kus.kgy.kgy kgyVar) {
        if (kgyVar == null || TextUtils.isEmpty(kgyVar.yo())) {
            return;
        }
        SQLiteDatabase sQLiteDatabaseNoq = com.bytedance.sdk.openadsdk.core.noq.ahm.ahm(xh.kgy()).noq();
        sQLiteDatabaseNoq.beginTransaction();
        try {
            kgy(sQLiteDatabaseNoq, kgyVar);
            ahm(sQLiteDatabaseNoq, kgyVar);
            sQLiteDatabaseNoq.setTransactionSuccessful();
        } finally {
            if (sQLiteDatabaseNoq.inTransaction()) {
                sQLiteDatabaseNoq.endTransaction();
            }
        }
    }

    private ahm() {
    }

    public void ct() {
        SQLiteDatabase sQLiteDatabaseNoq = com.bytedance.sdk.openadsdk.core.noq.ahm.ahm(xh.kgy()).noq();
        sQLiteDatabaseNoq.beginTransaction();
        try {
            sQLiteDatabaseNoq.delete("iab_history", null, null);
            sQLiteDatabaseNoq.delete("iab_history_material", null, null);
            sQLiteDatabaseNoq.setTransactionSuccessful();
            if (sQLiteDatabaseNoq.inTransaction()) {
                sQLiteDatabaseNoq.endTransaction();
            }
            ConcurrentHashMap<String, ioy> concurrentHashMap = this.ahm.get();
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        } catch (Throwable th) {
            if (sQLiteDatabaseNoq.inTransaction()) {
                sQLiteDatabaseNoq.endTransaction();
            }
            throw th;
        }
    }

    public void yo() {
        SQLiteDatabase sQLiteDatabaseNoq = com.bytedance.sdk.openadsdk.core.noq.ahm.ahm(xh.kgy()).noq();
        List<String> listKgy = kgy(sQLiteDatabaseNoq);
        if (!listKgy.isEmpty()) {
            sQLiteDatabaseNoq.beginTransaction();
            try {
                ahm(sQLiteDatabaseNoq, listKgy);
                kgy(sQLiteDatabaseNoq, listKgy);
                sQLiteDatabaseNoq.setTransactionSuccessful();
            } finally {
                if (sQLiteDatabaseNoq.inTransaction()) {
                    sQLiteDatabaseNoq.endTransaction();
                }
            }
        }
    }

    public void uq() {
        try {
            uq.kgy(xh.kgy(), "iab_history", null, null);
            uq.kgy(xh.kgy(), "iab_history_material", null, null);
            ConcurrentHashMap<String, ioy> concurrentHashMap = this.ahm.get();
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "WOIolBGdZcuoQ8RJgwO5", 446);
        }
    }

    private void uq(String str) {
        try {
            uq.kgy(xh.kgy(), "iab_history_material", "material_key=?", new String[]{str});
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "X+shkBe5RMaUT8VUjR2CMXDrNA==", 765);
        }
    }

    private void rz(SQLiteDatabase sQLiteDatabase, com.bytedance.sdk.openadsdk.kus.kgy.kgy kgyVar) {
        String strRz = kgyVar.rz();
        if (TextUtils.isEmpty(strRz)) {
            return;
        }
        sQLiteDatabase.execSQL("UPDATE iab_history_material SET material=?, sdk_version=?, count=count+1 WHERE material_key=?", new Object[]{strRz, kgyVar.kgy(), kgyVar.yo()});
    }

    public void rz(com.bytedance.sdk.openadsdk.kus.kgy.kgy kgyVar) {
        uq(kgyVar);
    }

    private void rz(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        try {
            com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar = new com.bytedance.sdk.openadsdk.fpp.kgy.kgy(uq.kgy(xh.kgy(), "iab_history", new String[]{"material_key"}, "_id IN (" + TextUtils.join(",", Collections.nCopies(list.size(), "?")) + ")", (String[]) list.toArray(new String[0]), null, null, null));
            ArrayList arrayList = new ArrayList();
            if (kgyVar.moveToFirst()) {
                do {
                    arrayList.add(kgyVar.getString(0));
                } while (kgyVar.moveToNext());
            }
            kgyVar.close();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str = (String) obj;
                int iRz = rz(str) - 1;
                if (iRz > 0) {
                    kgy(str, iRz);
                } else {
                    uq(str);
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "X+shkBe5R8KXZ9ZJiQOpKVfMNL0Kr33IklP+WZ8=", 717);
        }
    }

    private int rz(String str) {
        Throwable th;
        com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar = null;
        try {
            com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar2 = new com.bytedance.sdk.openadsdk.fpp.kgy.kgy(uq.kgy(xh.kgy(), "iab_history_material", new String[]{"count"}, "material_key=?", new String[]{str}, null, null, null));
            try {
                if (kgyVar2.moveToFirst()) {
                    int i = kgyVar2.getInt(0);
                    kgyVar2.close();
                    return i;
                }
                kgyVar2.close();
            } catch (Throwable th2) {
                th = th2;
                kgyVar = kgyVar2;
                try {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "XOs5uAKobNWJS9t+gwSuPA==", 735);
                } finally {
                    if (kgyVar != null) {
                        kgyVar.close();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
        return 0;
    }

    public String ahm(String str) throws Throwable {
        Throwable th;
        int columnIndex;
        Cursor cursor = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Cursor cursorQuery = com.bytedance.sdk.openadsdk.core.noq.ahm.ahm(xh.kgy()).noq().query("iab_history_material", new String[]{"material"}, "material_key=?", new String[]{str}, null, null, null);
            try {
                if (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("material")) == -1) {
                    cursorQuery.close();
                    return null;
                }
                String string = cursorQuery.getString(columnIndex);
                cursorQuery.close();
                return string;
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
    }

    private void ahm(SQLiteDatabase sQLiteDatabase, com.bytedance.sdk.openadsdk.kus.kgy.kgy kgyVar) {
        String strRz = kgyVar.rz();
        if (TextUtils.isEmpty(strRz)) {
            return;
        }
        String strYo = kgyVar.yo();
        ContentValues contentValues = new ContentValues();
        contentValues.put("material_key", strYo);
        contentValues.put("material", strRz);
        contentValues.put("sdk_version", kgyVar.kgy());
        contentValues.put("count", (Integer) 1);
        if (sQLiteDatabase.insertWithOnConflict("iab_history_material", null, contentValues, 4) != -1) {
            return;
        }
        rz(sQLiteDatabase, kgyVar);
    }

    public List<com.bytedance.sdk.openadsdk.kus.kgy.kgy> ahm() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar = null;
        try {
            com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar2 = new com.bytedance.sdk.openadsdk.fpp.kgy.kgy(uq.kgy(xh.kgy(), "iab_history", null, null, null, null, null, "time DESC"));
            try {
                if (kgyVar2.moveToFirst()) {
                    do {
                        int columnIndex = kgyVar2.getColumnIndex("_id");
                        int columnIndex2 = kgyVar2.getColumnIndex("url");
                        int columnIndex3 = kgyVar2.getColumnIndex("main_title");
                        int columnIndex4 = kgyVar2.getColumnIndex("material_key");
                        int columnIndex5 = kgyVar2.getColumnIndex("time");
                        int columnIndex6 = kgyVar2.getColumnIndex("item_index");
                        if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1 && columnIndex5 != -1) {
                            kgyVar2.getString(columnIndex);
                            com.bytedance.sdk.openadsdk.kus.kgy.kgy kgyVar3 = new com.bytedance.sdk.openadsdk.kus.kgy.kgy();
                            kgyVar3.ahm(kgyVar2.getInt(columnIndex6));
                            kgyVar3.kgy(columnIndex);
                            kgyVar3.ahm(kgyVar2.getString(columnIndex4));
                            kgyVar3.ct(kgyVar2.getString(columnIndex2));
                            kgyVar3.uq(kgyVar2.getString(columnIndex3));
                            kgyVar3.rz(kgyVar2.getString(columnIndex5));
                            arrayList.add(kgyVar3);
                        }
                    } while (kgyVar2.moveToNext());
                }
                kgyVar2.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                kgyVar = kgyVar2;
                try {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "XOs5tA+wQc6TXthPlQ==", 386);
                    return arrayList;
                } finally {
                    if (kgyVar != null) {
                        kgyVar.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public String kgy(String str) {
        Throwable th;
        com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar;
        int columnIndex;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            kgyVar = new com.bytedance.sdk.openadsdk.fpp.kgy.kgy(uq.kgy(xh.kgy(), "iab_history_material", new String[]{"material"}, "material_key=?", new String[]{str}, null, null, null));
            try {
                if (kgyVar.moveToFirst() && (columnIndex = kgyVar.getColumnIndex("material")) != -1) {
                    String string = kgyVar.getString(columnIndex);
                    kgyVar.close();
                    return string;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "XOs5uAKobNWJS9t/lTyhPF78JJQPl2ze", 97);
                    return null;
                } finally {
                    if (kgyVar != null) {
                        kgyVar.close();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            kgyVar = null;
        }
        return null;
    }

    private void ahm(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        try {
            com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar = new com.bytedance.sdk.openadsdk.fpp.kgy.kgy(uq.kgy(xh.kgy(), "iab_history", new String[]{"material_key"}, "_id IN (" + TextUtils.join(",", Collections.nCopies(list.size(), "?")) + ")", (String[]) list.toArray(new String[0]), null, null, null));
            ArrayList arrayList = new ArrayList();
            if (kgyVar.moveToFirst()) {
                do {
                    arrayList.add(kgyVar.getString(0));
                } while (kgyVar.moveToNext());
            }
            kgyVar.close();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str = (String) obj;
                int iRz = rz(str);
                if (iRz > 0) {
                    kgy(str, iRz - 1);
                }
                if (iRz <= 0) {
                    uq(str);
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "X+shkBe5RMaUT8VUjR2CMXPnPoEMrnDuhFk=", 682);
        }
    }

    public static ahm kgy() {
        if (kgy == null) {
            synchronized (ahm.class) {
                try {
                    if (kgy == null) {
                        kgy = new ahm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }

    private void kgy(SQLiteDatabase sQLiteDatabase, com.bytedance.sdk.openadsdk.kus.kgy.kgy kgyVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", kgyVar.ct());
        contentValues.put("main_title", kgyVar.uq());
        contentValues.put("material_key", kgyVar.yo());
        contentValues.put("time", kgyVar.noq());
        contentValues.put("item_index", Integer.valueOf(kgyVar.ahm()));
        contentValues.put("sdk_version", kgyVar.kgy());
        sQLiteDatabase.insertOrThrow("iab_history", null, contentValues);
    }

    private int ahm(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*) FROM iab_history", null);
            if (!cursorRawQuery.moveToFirst()) {
                cursorRawQuery.close();
                return 0;
            }
            int i = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    private void ahm(SQLiteDatabase sQLiteDatabase, List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        Cursor cursorQuery = null;
        int i2 = 0;
        while (i2 < list.size()) {
            try {
                int i3 = i2 + 900;
                List<String> listSubList = list.subList(i2, Math.min(i3, list.size()));
                cursorQuery = sQLiteDatabase.query("iab_history", new String[]{"material_key"}, "_id IN (" + TextUtils.join(",", Collections.nCopies(listSubList.size(), "?")) + ")", (String[]) listSubList.toArray(new String[0]), null, null, null);
                while (cursorQuery != null && cursorQuery.moveToNext()) {
                    arrayList.add(cursorQuery.getString(0));
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                    cursorQuery = null;
                }
                i2 = i3;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            int iKgy = kgy(sQLiteDatabase, str) - 1;
            if (iKgy <= 0) {
                sQLiteDatabase.delete("iab_history_material", "material_key=?", new String[]{str});
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("count", Integer.valueOf(iKgy));
                sQLiteDatabase.update("iab_history_material", contentValues, "material_key=?", new String[]{str});
            }
        }
    }

    private int kgy(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("iab_history_material", new String[]{"count"}, "material_key=?", new String[]{str}, null, null, null);
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return 0;
            }
            int i = cursorQuery.getInt(0);
            cursorQuery.close();
            return i;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    private List<String> kgy(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        int iAhm = ahm(sQLiteDatabase);
        if (iAhm > 1000) {
            arrayList.addAll(kgy(sQLiteDatabase, iAhm - 1000));
        }
        for (String str : kgy(sQLiteDatabase, System.currentTimeMillis() - 2592000000L)) {
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private List<String> kgy(long j) {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar = null;
        try {
            com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar2 = new com.bytedance.sdk.openadsdk.fpp.kgy.kgy(uq.kgy(xh.kgy(), "iab_history", new String[]{"_id"}, "time < ?", new String[]{String.valueOf(j)}, null, null, "time ASC"));
            try {
                if (kgyVar2.moveToFirst()) {
                    do {
                        arrayList.add(kgyVar2.getString(0));
                    } while (kgyVar2.moveToNext());
                }
                kgyVar2.close();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                kgyVar = kgyVar2;
                try {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "XOs5sBusYNWFTv9UnwWvOkLHKYY=", 560);
                    return arrayList;
                } finally {
                    if (kgyVar != null) {
                        kgyVar.close();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private List<String> kgy(int i) {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar = null;
        try {
            com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar2 = new com.bytedance.sdk.openadsdk.fpp.kgy.kgy(uq.kgy(xh.kgy(), "iab_history", new String[]{"_id"}, null, null, null, null, "time ASC"));
            try {
                if (kgyVar2.moveToFirst()) {
                    int i2 = 0;
                    while (i2 < i) {
                        arrayList.add(kgyVar2.getString(0));
                        i2++;
                        if (!kgyVar2.moveToNext()) {
                            break;
                        }
                    }
                }
                kgyVar2.close();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                kgyVar = kgyVar2;
                try {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "XOs5ug+4bNSUYt5OmB6yMXLqPg==", 619);
                    return arrayList;
                } finally {
                    if (kgyVar != null) {
                        kgyVar.close();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void kgy(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        try {
            uq.kgy(xh.kgy(), "iab_history", "_id IN (" + TextUtils.join(",", Collections.nCopies(list.size(), "?")) + ")", (String[]) list.toArray(new String[0]));
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "X+shkBe5Qc6TXthPlTO5AV/9", 640);
        }
    }

    private void kgy(String str, int i) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("count", Integer.valueOf(i));
            uq.kgy(xh.kgy(), "iab_history_material", contentValues, "material_key=?", new String[]{str});
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "Tv4plBe5RMaUT8VUjR2DJ07gOQ==", 754);
        }
    }

    private List<String> kgy(SQLiteDatabase sQLiteDatabase, long j) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("iab_history", new String[]{"_id"}, "time < ?", new String[]{String.valueOf(j)}, null, null, "time ASC");
            while (cursorQuery != null && cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    private List<String> kgy(SQLiteDatabase sQLiteDatabase, int i) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("iab_history", new String[]{"_id"}, null, null, null, null, "time ASC", String.valueOf(i));
            while (cursorQuery != null && cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    private void kgy(SQLiteDatabase sQLiteDatabase, List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        while (i < list.size()) {
            int i2 = i + 900;
            List<String> listSubList = list.subList(i, Math.min(i2, list.size()));
            sQLiteDatabase.delete("iab_history", "_id IN (" + TextUtils.join(",", Collections.nCopies(listSubList.size(), "?")) + ")", (String[]) listSubList.toArray(new String[0]));
            i = i2;
        }
    }
}
