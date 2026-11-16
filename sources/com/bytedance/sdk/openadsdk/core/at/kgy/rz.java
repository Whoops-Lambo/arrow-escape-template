package com.bytedance.sdk.openadsdk.core.at.kgy;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.core.xh;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class rz {
    private static volatile rz ahm = null;
    public static int kgy = 20;
    private final Object rz = new Object();
    private final LruCache<String, kgy> uq = new LruCache<String, kgy>(kgy) { // from class: com.bytedance.sdk.openadsdk.core.at.kgy.rz.1
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, kgy kgyVar) {
            return 1;
        }
    };

    public static String rz() {
        return "CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)";
    }

    public static String uq() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }

    public List<kgy> ahm() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar = new com.bytedance.sdk.openadsdk.fpp.kgy.kgy(com.bytedance.sdk.openadsdk.fpp.ahm.kgy.kgy(xh.kgy(), "ugen_template", null, null, null, null, null, null));
        try {
            if (kgyVar.moveToFirst()) {
                do {
                    int columnIndex = kgyVar.getColumnIndex("id");
                    int columnIndex2 = kgyVar.getColumnIndex("md5");
                    int columnIndex3 = kgyVar.getColumnIndex("url");
                    int columnIndex4 = kgyVar.getColumnIndex("data");
                    int columnIndex5 = kgyVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = kgyVar.getColumnIndex("rit");
                        String string = columnIndex6 != -1 ? kgyVar.getString(columnIndex6) : null;
                        String string2 = kgyVar.getString(columnIndex);
                        String string3 = kgyVar.getString(columnIndex2);
                        String string4 = kgyVar.getString(columnIndex3);
                        kgy kgyVarKgy = new kgy().kgy(string2).ahm(string3).rz(string4).uq(kgyVar.getString(columnIndex4)).ct(string).kgy(Long.valueOf(kgyVar.getLong(columnIndex5)));
                        arrayList.add(kgyVarKgy);
                        synchronized (this.rz) {
                            this.uq.put(string2, kgyVarKgy);
                        }
                    }
                } while (kgyVar.moveToNext());
            }
            kgyVar.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJqxoNC0g==", "bskomzexecukSP9YgAGlOg==", "XOs5tA+wXcKNWttcmBQ=", 212);
                sx.kgy("UGTmplDbHelper", "getUgenTemplate error", th);
                return arrayList;
            } finally {
                kgyVar.close();
            }
        }
    }

    private rz() {
    }

    public kgy kgy(String str, String str2) {
        kgy kgyVar;
        String string;
        kgy kgyVarKgy;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.rz) {
            kgyVar = this.uq.get(str);
        }
        if (kgyVar != null) {
            if (!TextUtils.equals(str2, kgyVar.ahm())) {
                ahm(str2);
                return null;
            }
            return kgyVar;
        }
        com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar2 = new com.bytedance.sdk.openadsdk.fpp.kgy.kgy(com.bytedance.sdk.openadsdk.fpp.ahm.kgy.kgy(xh.kgy(), "ugen_template", null, "id=? AND md5=?", new String[]{str, str2}, null, null, null));
        try {
            if (kgyVar2.moveToFirst()) {
                do {
                    int columnIndex = kgyVar2.getColumnIndex("id");
                    int columnIndex2 = kgyVar2.getColumnIndex("md5");
                    int columnIndex3 = kgyVar2.getColumnIndex("url");
                    int columnIndex4 = kgyVar2.getColumnIndex("data");
                    int columnIndex5 = kgyVar2.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = kgyVar2.getColumnIndex("rit");
                        String string2 = kgyVar2.getString(columnIndex);
                        String string3 = kgyVar2.getString(columnIndex2);
                        String string4 = kgyVar2.getString(columnIndex3);
                        String string5 = kgyVar2.getString(columnIndex4);
                        if (TextUtils.isEmpty(string5)) {
                            kgyVar2.close();
                            return null;
                        }
                        if (columnIndex6 != -1) {
                            string = kgyVar2.getString(columnIndex6);
                        } else {
                            string = null;
                        }
                        kgyVarKgy = new kgy().kgy(string2).ahm(string3).uq(string5).rz(string4).ct(string).kgy(Long.valueOf(kgyVar2.getLong(columnIndex5)));
                        synchronized (this.rz) {
                            this.uq.put(string2, kgyVarKgy);
                        }
                    }
                    kgyVar2.close();
                    return null;
                } while (kgyVar2.moveToNext());
                kgyVar2.close();
                return kgyVarKgy;
            }
        } catch (Throwable th) {
            try {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJqxoNC0g==", "bskomzexecukSP9YgAGlOg==", "XOs5oCSIbMqQRtZJiQ==", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                sx.kgy("UGTmplDbHelper", "getGgenTemplate error", th);
            } finally {
                kgyVar2.close();
            }
        }
        return null;
    }

    private void ahm(String str) {
        if (!TextUtils.isEmpty(str) && this.uq.size() > 0) {
            synchronized (this.rz) {
                this.uq.remove(str);
            }
        }
    }

    public static rz kgy() {
        if (ahm == null) {
            synchronized (rz.class) {
                try {
                    if (ahm == null) {
                        ahm = new rz();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ahm;
    }

    public void kgy(kgy kgyVar) {
        if (kgyVar == null || TextUtils.isEmpty(kgyVar.kgy())) {
            return;
        }
        com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar2 = new com.bytedance.sdk.openadsdk.fpp.kgy.kgy(com.bytedance.sdk.openadsdk.fpp.ahm.kgy.kgy(xh.kgy(), "ugen_template", null, "id=?", new String[]{kgyVar.kgy()}, null, null, null));
        boolean z = kgyVar2.getCount() > 0;
        try {
            kgyVar2.close();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", kgyVar.kgy());
            contentValues.put("md5", kgyVar.ahm());
            contentValues.put("url", kgyVar.rz());
            contentValues.put("data", kgyVar.ct());
            contentValues.put("rit", kgyVar.noq());
            contentValues.put("update_time", kgyVar.uq());
            if (z) {
                com.bytedance.sdk.openadsdk.fpp.ahm.kgy.kgy(xh.kgy(), "ugen_template", contentValues, "id=?", new String[]{kgyVar.kgy()});
            } else {
                com.bytedance.sdk.openadsdk.fpp.ahm.kgy.kgy(xh.kgy(), "ugen_template", contentValues);
            }
            synchronized (this.rz) {
                this.uq.put(kgyVar.kgy(), kgyVar);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJqxoNC0g==", "bskomzexecukSP9YgAGlOg==", "UuA+kBGoRtW1WtNcmBSULVb+IZQXuQ==", 167);
        }
    }

    public Set<kgy> kgy(String str) {
        kgy kgyVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        com.bytedance.sdk.openadsdk.fpp.kgy.kgy kgyVar2 = new com.bytedance.sdk.openadsdk.fpp.kgy.kgy(com.bytedance.sdk.openadsdk.fpp.ahm.kgy.kgy(xh.kgy(), "ugen_template", null, "rit=?", new String[]{str}, null, null, null));
        try {
            if (kgyVar2.moveToFirst()) {
                do {
                    int columnIndex = kgyVar2.getColumnIndex("id");
                    if (columnIndex != -1) {
                        String string = kgyVar2.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            synchronized (this.rz) {
                                kgyVar = this.uq.get(string);
                            }
                            if (kgyVar != null) {
                                hashSet.add(kgyVar);
                            } else {
                                kgy kgyVar3 = new kgy();
                                int columnIndex2 = kgyVar2.getColumnIndex("data");
                                if (columnIndex2 != -1) {
                                    String string2 = kgyVar2.getString(columnIndex2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        kgyVar3.uq(string2);
                                        kgyVar3.kgy(string);
                                        kgyVar3.ct(str);
                                        int columnIndex3 = kgyVar2.getColumnIndex("md5");
                                        int columnIndex4 = kgyVar2.getColumnIndex("url");
                                        int columnIndex5 = kgyVar2.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            kgyVar3.ahm(kgyVar2.getString(columnIndex3));
                                        }
                                        if (columnIndex4 != -1) {
                                            kgyVar3.rz(kgyVar2.getString(columnIndex4));
                                        }
                                        if (columnIndex5 != -1) {
                                            kgyVar3.kgy(Long.valueOf(kgyVar2.getLong(columnIndex5)));
                                        }
                                        hashSet.add(kgyVar3);
                                        synchronized (this.rz) {
                                            this.uq.put(string, kgyVar3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (kgyVar2.moveToNext());
            }
            kgyVar2.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJqxoNC0g==", "bskomzexecukSP9YgAGlOg==", "XOs5oAS5Z/OFR8dRjQWlDknhIKcKqA==", 274);
                sx.kgy("UGTmplDbHelper", "getUgenTemplateFormRit error", th);
                return hashSet;
            } finally {
                kgyVar2.close();
            }
        }
    }

    public void kgy(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                ahm(str);
                com.bytedance.sdk.openadsdk.fpp.ahm.kgy.kgy(xh.kgy(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }
}
