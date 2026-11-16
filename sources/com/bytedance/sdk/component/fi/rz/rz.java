package com.bytedance.sdk.component.fi.rz;

import android.net.Uri;
import android.text.TextUtils;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class rz {
    private static final rz kgy = new rz();
    private final Object ahm = new Object();
    private volatile List<String> rz = new ArrayList();
    private final ConcurrentHashMap<String, Integer> uq = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Long> ct = new ConcurrentHashMap<>();
    private volatile boolean noq = false;
    private volatile int yo = 10;
    private volatile long fi = 1800000;

    public void kgy(String str, String str2, boolean z) {
        if ((z || com.bytedance.sdk.component.fi.kgy.yo()) && this.noq && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String strKgy = kgy(str);
            String strKgy2 = kgy(str2);
            if (strKgy == null || strKgy2 == null) {
                return;
            }
            boolean zEquals = str.equals(str2);
            synchronized (this.ahm) {
                try {
                    ArrayList arrayList = new ArrayList(this.rz);
                    boolean zAhm = false;
                    if (zEquals) {
                        if (z) {
                            this.uq.remove(strKgy2);
                            this.ct.remove(strKgy2);
                            zAhm = kgy(arrayList, strKgy2);
                        } else {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            Long l = this.ct.get(strKgy2);
                            if (l == null || jCurrentTimeMillis >= l.longValue()) {
                                Integer num = this.uq.get(strKgy2);
                                int iIntValue = (num == null ? 0 : num.intValue()) + 1;
                                this.uq.put(strKgy2, Integer.valueOf(iIntValue));
                                if (iIntValue >= this.yo) {
                                    this.ct.put(strKgy2, Long.valueOf(jCurrentTimeMillis + this.fi));
                                    zAhm = ahm(arrayList, strKgy2);
                                    this.uq.remove(strKgy2);
                                }
                            } else {
                                zAhm = ahm(arrayList, strKgy2);
                            }
                        }
                    } else if (z) {
                        Long l2 = this.ct.get(strKgy2);
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if (l2 != null && l2.longValue() > jCurrentTimeMillis2) {
                            zAhm = kgy(arrayList, strKgy);
                        }
                    } else {
                        zAhm = ahm(arrayList, strKgy);
                    }
                    if (zAhm) {
                        while (arrayList.size() > 15) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                        this.rz = arrayList;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private rz() {
    }

    private boolean ahm(List<String> list, String str) {
        if (!list.contains(str)) {
            list.add(str);
            return true;
        }
        if (((String) pv1.i(1, list)).equals(str)) {
            return false;
        }
        list.remove(str);
        list.add(str);
        return true;
    }

    private List<String> ahm(String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public void kgy(ct ctVar) {
        if (this.noq == ctVar.kgy && this.yo == ctVar.ahm && this.fi == ctVar.rz) {
            return;
        }
        this.noq = ctVar.kgy;
        this.yo = ctVar.ahm;
        this.fi = ctVar.rz;
        String.format("Config updated: enable=%b, K=%d, Cooldown=%dms", Boolean.valueOf(this.noq), Integer.valueOf(this.yo), Long.valueOf(this.fi));
    }

    private String kgy(String str) {
        if (str == null) {
            return null;
        }
        try {
            Uri uri = Uri.parse(str);
            String host = uri.getHost();
            String path = uri.getPath();
            if (host != null && path != null) {
                if (path.isEmpty()) {
                    path = "/";
                }
                return host.concat(path);
            }
            return null;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4IUtGZO+iSZEA==", "f+EglAqyRdWVZ9ZTjRalOg==", "XOs5pQKoYeyFUw==", 74);
            return null;
        }
    }

    private String kgy(String str, String str2, List<String> list) {
        if (str.equals(kgy(str2))) {
            return str2;
        }
        for (String str3 : list) {
            if (str.equals(kgy(str3))) {
                return str3;
            }
        }
        return null;
    }

    public List<String> kgy(String str, List<String> list) {
        if (list != null && !list.isEmpty()) {
            if (!this.noq) {
                return ahm(str, list);
            }
            String strKgy = kgy(str);
            if (strKgy == null) {
                return ahm(str, list);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<String> list2 = this.rz;
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                String strKgy2 = kgy(it.next(), str, list);
                if (strKgy2 != null && !arrayList.contains(strKgy2)) {
                    arrayList.add(strKgy2);
                }
            }
            for (String str2 : list) {
                if (!list2.contains(kgy(str2)) && !arrayList.contains(str2)) {
                    arrayList2.add(str2);
                }
            }
            if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                arrayList.addAll(1, arrayList2);
            } else if (arrayList.isEmpty() && !arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList);
            linkedHashSet.add(str);
            linkedHashSet.addAll(list);
            ArrayList arrayList3 = new ArrayList(linkedHashSet);
            Long l = this.ct.get(strKgy);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if ((l == null || jCurrentTimeMillis >= l.longValue()) && arrayList3.remove(str)) {
                arrayList3.add(0, str);
            }
            arrayList3.toString();
            return arrayList3;
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(str);
        return arrayList4;
    }

    public static rz kgy() {
        return kgy;
    }

    private boolean kgy(List<String> list, String str) {
        if (!list.isEmpty() && list.get(0).equals(str)) {
            return false;
        }
        list.remove(str);
        list.add(0, str);
        return true;
    }
}
