package com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import defpackage.h50;
import defpackage.pv1;
import defpackage.q63;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class yo extends rz {
    protected List<String> kgy;
    private com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy rz;

    /* JADX WARN: Code duplicated, block: B:15:0x0023 A[EXC_TOP_SPLITTER, PHI: r0 r9
  0x0023: PHI (r0v2 int) = (r0v0 int), (r0v6 int) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0023: PHI (r9v3 android.database.Cursor) = (r9v2 android.database.Cursor), (r9v5 android.database.Cursor) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public int uq() {
        Cursor cursorKgy;
        int i = 0;
        try {
            cursorKgy = com.bytedance.sdk.component.yo.kgy.kgy.kgy.rz.kgy(ct(), ahm(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorKgy != null) {
                try {
                    cursorKgy.moveToFirst();
                    i = cursorKgy.getInt(0);
                } catch (Throwable unused) {
                    if (cursorKgy != null) {
                        try {
                            cursorKgy.close();
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            if (cursorKgy != null) {
                cursorKgy.close();
            }
        } catch (Throwable unused3) {
            cursorKgy = null;
        }
        return i;
    }

    private void noq(List<com.bytedance.sdk.component.yo.kgy.uq.kgy> list) {
        LinkedList linkedList = new LinkedList();
        Iterator<com.bytedance.sdk.component.yo.kgy.uq.kgy> it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().rz());
        }
        com.bytedance.sdk.component.yo.kgy.kgy.kgy.rz.kgy(ct(), "UPDATE " + ahm() + " SET retry = retry+1 WHERE " + kgy("id", linkedList, 1000, true));
    }

    public void ahm(List<com.bytedance.sdk.component.yo.kgy.uq.kgy> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar : list) {
            linkedList.add(kgyVar.rz());
            com.bytedance.sdk.component.yo.kgy.rz.kgy.ra(kgyVar);
        }
        ahm();
        linkedList.size();
        com.bytedance.sdk.component.yo.kgy.kgy.kgy.rz.kgy(ct(), "DELETE FROM " + ahm() + " WHERE " + kgy("id", linkedList, 1000, true));
        uq(linkedList);
    }

    public void rz(List<com.bytedance.sdk.component.yo.kgy.uq.kgy> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        try {
            noq(list);
        } catch (Exception unused) {
        }
    }

    public yo(Context context, com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy kgyVar) {
        super(context);
        this.kgy = new ArrayList();
        this.rz = kgyVar;
        if (kgyVar == null) {
            this.rz = com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy.rz();
        }
    }

    public List<com.bytedance.sdk.component.yo.kgy.uq.kgy> kgy(int i, String str) {
        long jKgy = com.bytedance.sdk.component.yo.kgy.ahm.kgy.kgy(i, ct());
        if (jKgy > 0) {
            if (jKgy > 100) {
                jKgy = 100;
            }
        } else {
            jKgy = 1;
        }
        ArrayList arrayList = new ArrayList();
        this.kgy.clear();
        Cursor cursorKgy = com.bytedance.sdk.component.yo.kgy.kgy.kgy.rz.kgy(ct(), ahm(), new String[]{"id", "value", "encrypt"}, null, null, null, null, str + " DESC limit " + jKgy);
        if (cursorKgy != null) {
            while (cursorKgy.moveToNext()) {
                try {
                    try {
                        String string = cursorKgy.getString(cursorKgy.getColumnIndex("id"));
                        String string2 = cursorKgy.getString(cursorKgy.getColumnIndex("value"));
                        if (cursorKgy.getInt(cursorKgy.getColumnIndex("encrypt")) == 1) {
                            string2 = com.bytedance.sdk.component.yo.kgy.yo.noq().vs().kgy(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.kgy.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.yo.kgy.uq.kgy.kgy kgyVar = new com.bytedance.sdk.component.yo.kgy.uq.kgy.kgy(string, PangleNetworkBridge.jsonObjectInit(string2));
                            kgyVar.rz(rz());
                            kgyVar.ahm(kgy());
                            arrayList.add(kgyVar);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                    try {
                        cursorKgy.close();
                        if (!this.kgy.isEmpty()) {
                            kgy(this.kgy);
                            this.kgy.clear();
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return arrayList;
    }

    public byte rz() {
        return (byte) 2;
    }

    public static String rz(String str) {
        return pv1.n("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.rz
    public long noq() {
        return com.bytedance.sdk.component.yo.kgy.yo.kgy.ahm();
    }

    public List<com.bytedance.sdk.component.yo.kgy.uq.kgy> ahm(String str) {
        com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy kgyVar = this.rz;
        if (kgyVar == null) {
            return new ArrayList();
        }
        return kgy(kgyVar.ahm(), str);
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.rz
    public String ahm() {
        return com.bytedance.sdk.component.yo.kgy.yo.noq().rz().uq();
    }

    private void ahm(int i, long j) {
        com.bytedance.sdk.component.yo.kgy.kgy.kgy.rz.kgy(ct(), ahm(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
    }

    public byte kgy() {
        return (byte) 1;
    }

    public void kgy(List<String> list) {
        ahm();
        list.size();
        com.bytedance.sdk.component.yo.kgy.kgy.kgy.rz.kgy(ct(), "DELETE FROM " + ahm() + " WHERE " + kgy("id", list, 1000, true));
        com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(com.bytedance.sdk.component.yo.kgy.ahm.uq.uq.xrn(), list.size());
        uq(list);
    }

    public void kgy(int i, long j) {
        ahm(i, j);
    }

    public boolean kgy(int i) {
        return this.rz != null && uq() >= this.rz.kgy();
    }

    private static String kgy(String str, List<?> list, int i, boolean z) {
        int i2;
        String str2 = z ? " IN " : " NOT IN ";
        String str3 = z ? " OR " : " AND ";
        int iMin = Math.min(i, 1000);
        int size = list.size();
        if (size % iMin == 0) {
            i2 = size / iMin;
        } else {
            i2 = (size / iMin) + 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * iMin;
            String strKgy = kgy(TextUtils.join("','", list.subList(i4, Math.min(i4 + iMin, size))), "");
            if (i3 != 0) {
                sb.append(str3);
            }
            q63.y(sb, str, str2, "('", strKgy);
            sb.append("')");
        }
        return kgy(sb.toString(), h50.i(str, str2, "('')"));
    }

    private static String kgy(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
