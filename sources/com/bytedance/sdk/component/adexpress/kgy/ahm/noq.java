package com.bytedance.sdk.component.adexpress.kgy.ahm;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class noq {
    private static volatile noq ahm = null;
    public static int kgy = 20;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.kgy.rz.rz> ct;
    private final Object uq = new Object();
    private AtomicBoolean noq = new AtomicBoolean(false);
    private LruCache<String, com.bytedance.sdk.component.adexpress.kgy.rz.ahm> yo = new LruCache<String, com.bytedance.sdk.component.adexpress.kgy.rz.ahm>(kgy) { // from class: com.bytedance.sdk.component.adexpress.kgy.ahm.noq.1
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.kgy.rz.ahm ahmVar) {
            return 1;
        }
    };
    private Set<String> rz = Collections.synchronizedSet(new HashSet());

    public void kgy(com.bytedance.sdk.component.adexpress.kgy.rz.ahm ahmVar, boolean z) {
        if (ahmVar == null || com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().ahm() == null || TextUtils.isEmpty(ahmVar.ahm())) {
            return;
        }
        Cursor cursorKgy = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().ahm().kgy("template_diff_new", null, "id=?", new String[]{ahmVar.ahm()}, null, null, null);
        boolean z2 = cursorKgy != null && cursorKgy.getCount() > 0;
        String string = null;
        if (cursorKgy != null) {
            try {
                string = cursorKgy.moveToFirst() ? cursorKgy.getString(cursorKgy.getColumnIndex("rit")) : null;
                cursorKgy.close();
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+M9mSe+QcKMWtJP", "UuA+kBGoRtW1WtNcmBSULVb+IZQXuQ==", l.i);
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", ahmVar.kgy());
        contentValues.put("id", ahmVar.ahm());
        contentValues.put("md5", ahmVar.rz());
        contentValues.put("url", ahmVar.uq());
        contentValues.put("data", ahmVar.ct());
        contentValues.put("version", ahmVar.noq());
        contentValues.put("update_time", ahmVar.yo());
        if (z2) {
            com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().ahm().kgy("template_diff_new", contentValues, "id=?", new String[]{ahmVar.ahm()});
        } else {
            com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().ahm().kgy("template_diff_new", contentValues);
        }
        synchronized (this.uq) {
            this.yo.put(ahmVar.ahm(), ahmVar);
        }
        this.rz.add(ahmVar.ahm());
        if (z) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().noq() == null) {
                return;
            }
            if (this.ct == null) {
                this.ct = new ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.kgy.rz.rz rzVar = new com.bytedance.sdk.component.adexpress.kgy.rz.rz(ahmVar.kgy(), ahmVar.ahm(), ahmVar.rz());
            this.ct.put(ahmVar.ahm(), rzVar);
            if (string != null) {
                com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().noq();
                rzVar.ahm();
            }
            com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().noq();
            ahmVar.kgy();
        } catch (Throwable th2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+M9mSe+QcKMWtJP", "UuA+kBGoRtW1WtNcmBSULVb+IZQXuQ==", 331);
        }
    }

    public void rz(String str) {
        com.bytedance.sdk.component.adexpress.kgy.rz.rz rzVar;
        try {
            if (this.ct != null && !this.ct.isEmpty() && (rzVar = this.ct.get(str)) != null) {
                if (!TextUtils.isEmpty(rzVar.kgy()) && com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().noq() != null) {
                    com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().noq();
                }
                this.ct.remove(str);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+M9mSe+QcKMWtJP", "SesgmhW5XcKNWvNcmBA=", 395);
        }
    }

    private noq() {
    }

    private void uq(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.kgy.rz.ahm> lruCache;
        if (!TextUtils.isEmpty(str) && (lruCache = this.yo) != null && lruCache.size() > 0) {
            synchronized (this.uq) {
                this.yo.remove(str);
            }
        }
    }

    public List<com.bytedance.sdk.component.adexpress.kgy.rz.ahm> ahm() {
        if (com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().ahm() == null) {
            return null;
        }
        boolean z = this.noq.get();
        this.noq.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor cursorKgy = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().ahm().kgy("template_diff_new", null, null, null, null, null, null);
        if (cursorKgy != null) {
            while (cursorKgy.moveToNext()) {
                try {
                    String string = cursorKgy.getString(cursorKgy.getColumnIndex("rit"));
                    String string2 = cursorKgy.getString(cursorKgy.getColumnIndex("id"));
                    String string3 = cursorKgy.getString(cursorKgy.getColumnIndex("md5"));
                    String string4 = cursorKgy.getString(cursorKgy.getColumnIndex("url"));
                    String string5 = cursorKgy.getString(cursorKgy.getColumnIndex("data"));
                    String string6 = cursorKgy.getString(cursorKgy.getColumnIndex("version"));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.kgy.rz.ahm().kgy(string).ahm(string2).rz(string3).uq(string4).ct(string5).noq(string6).kgy(Long.valueOf(cursorKgy.getLong(cursorKgy.getColumnIndex("update_time")))));
                    synchronized (this.uq) {
                        this.yo.put(string2, (com.bytedance.sdk.component.adexpress.kgy.rz.ahm) arrayList.get(arrayList.size() - 1));
                    }
                    this.rz.add(string2);
                    if (!z && com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().noq() != null) {
                        if (this.ct == null) {
                            this.ct = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.ct.contains(string2)) {
                            this.ct.put(string2, new com.bytedance.sdk.component.adexpress.kgy.rz.rz(string, string2, string3));
                        }
                    }
                } catch (Throwable th) {
                    try {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+M9mSe+QcKMWtJP", "XOs5tA+wXcKNWttcmBQ=", 259);
                        return arrayList;
                    } finally {
                        cursorKgy.close();
                    }
                }
            }
            cursorKgy.close();
            return arrayList;
        }
        return arrayList;
    }

    public static String rz() {
        return "CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)";
    }

    public Set<String> ahm(String str) {
        if (!TextUtils.isEmpty(str) && com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().ahm() != null) {
            HashSet hashSet = new HashSet();
            Cursor cursorKgy = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().ahm().kgy("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            try {
                if (cursorKgy != null) {
                    try {
                        if (cursorKgy.moveToFirst()) {
                            do {
                                hashSet.add(cursorKgy.getString(cursorKgy.getColumnIndex("id")));
                            } while (cursorKgy.moveToNext());
                            return hashSet;
                        }
                    } catch (Exception e) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+M9mSe+QcKMWtJP", "XOs5oQaxecuBXtJ0iDeyJ1bcJIE=", 204);
                        Log.e("TmplDbHelper", "", e);
                    }
                }
            } finally {
                cursorKgy.close();
            }
        }
        return null;
    }

    public static noq kgy() {
        if (ahm == null) {
            synchronized (noq.class) {
                try {
                    if (ahm == null) {
                        ahm = new noq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ahm;
    }

    public com.bytedance.sdk.component.adexpress.kgy.rz.ahm kgy(String str) {
        com.bytedance.sdk.component.adexpress.kgy.rz.ahm ahmVar;
        com.bytedance.sdk.component.adexpress.kgy.rz.ahm ahmVarKgy;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().ahm() == null) {
            return null;
        }
        synchronized (this.uq) {
            ahmVar = this.yo.get(String.valueOf(str));
        }
        if (ahmVar != null) {
            return ahmVar;
        }
        Cursor cursorKgy = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().ahm().kgy("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (cursorKgy != null) {
            try {
                if (cursorKgy.moveToFirst()) {
                    do {
                        String string = cursorKgy.getString(cursorKgy.getColumnIndex("rit"));
                        String string2 = cursorKgy.getString(cursorKgy.getColumnIndex("id"));
                        String string3 = cursorKgy.getString(cursorKgy.getColumnIndex("md5"));
                        String string4 = cursorKgy.getString(cursorKgy.getColumnIndex("url"));
                        String string5 = cursorKgy.getString(cursorKgy.getColumnIndex("data"));
                        String string6 = cursorKgy.getString(cursorKgy.getColumnIndex("version"));
                        ahmVarKgy = new com.bytedance.sdk.component.adexpress.kgy.rz.ahm().kgy(string).ahm(string2).rz(string3).uq(string4).ct(string5).noq(string6).kgy(Long.valueOf(cursorKgy.getLong(cursorKgy.getColumnIndex("update_time"))));
                        synchronized (this.uq) {
                            this.yo.put(string2, ahmVarKgy);
                        }
                        this.rz.add(string2);
                    } while (cursorKgy.moveToNext());
                    cursorKgy.close();
                    return ahmVarKgy;
                }
            } catch (Throwable th) {
                try {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+M9mSe+QcKMWtJP", "XOs5oQaxecuBXtI=", Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
                } finally {
                    cursorKgy.close();
                }
            }
        }
        return null;
    }

    public static void kgy(int i) {
        kgy = i;
    }

    public void kgy(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().ahm() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                uq(strArr[i]);
                com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().ahm().kgy("template_diff_new", "id=?", new String[]{strArr[i]});
                rz(strArr[i]);
            }
        }
    }
}
