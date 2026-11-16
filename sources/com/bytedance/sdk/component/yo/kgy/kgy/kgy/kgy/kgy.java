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
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class kgy extends rz {
    protected List<String> kgy;
    private final Context rz;
    private com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy uq;

    public byte uq() {
        return (byte) 0;
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

    /* JADX WARN: Code duplicated, block: B:42:0x011a A[Catch: all -> 0x00ff, TryCatch #5 {all -> 0x00ff, blocks: (B:33:0x00fa, B:36:0x0103, B:38:0x0109, B:39:0x010f, B:42:0x011a, B:44:0x0142, B:46:0x0148, B:47:0x014b), top: B:79:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:81:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0117 A[EDGE_INSN: B:84:0x0117->B:41:0x0117 BREAK  A[LOOP:0: B:21:0x00bd->B:85:0x00bd], SYNTHETIC] */
    public List<com.bytedance.sdk.component.yo.kgy.uq.kgy> kgy(int i, String str) {
        String str2;
        String[] strArr;
        String str3;
        String str4;
        byte b;
        Cursor cursorKgy;
        ArrayList arrayList;
        ArrayList arrayList2;
        com.bytedance.sdk.component.yo.kgy.uq.kgy.kgy kgyVar;
        long jKgy = com.bytedance.sdk.component.yo.kgy.ahm.kgy.kgy(i, ct());
        ahm();
        if (jKgy <= 0) {
            jKgy = 1;
        } else if (jKgy > 100) {
            jKgy = 100;
        }
        String str5 = str + " DESC limit " + jKgy;
        ArrayList arrayList3 = new ArrayList();
        this.kgy.clear();
        long jDg = com.bytedance.sdk.component.yo.kgy.yo.noq().dg();
        if (jDg > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - jDg)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.yo.kgy.rz.kgy.uq() && uq() == 3) {
            str3 = "value";
            str4 = "id";
            b = 3;
            cursorKgy = com.bytedance.sdk.component.yo.kgy.kgy.kgy.rz.kgy(ct(), ahm(), new String[]{"id", "value", "encrypt", "channel", "retry"}, str2, strArr, null, null, str5);
        } else {
            str3 = "value";
            str4 = "id";
            b = 3;
            cursorKgy = com.bytedance.sdk.component.yo.kgy.kgy.kgy.rz.kgy(ct(), ahm(), new String[]{str4, str3, "encrypt", "retry"}, str2, strArr, null, null, str5);
        }
        Cursor cursor = cursorKgy;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.yo.kgy.ct ctVarVs = com.bytedance.sdk.component.yo.kgy.yo.noq().vs();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str4));
                        String string2 = cursor.getString(cursor.getColumnIndex(str3));
                        int i2 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i3 = (com.bytedance.sdk.component.yo.kgy.rz.kgy.uq() && uq() == b) ? cursor.getInt(cursor.getColumnIndex("channel")) : 0;
                        if (i2 == 1) {
                            try {
                                string2 = ctVarVs.kgy(string2);
                                if (TextUtils.isEmpty(string2)) {
                                    this.kgy.add(string);
                                } else {
                                    if (arrayList3.size() > 100) {
                                        break;
                                    }
                                    int i4 = cursor.getInt(cursor.getColumnIndex("retry"));
                                    JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(string2);
                                    kgyVar = new com.bytedance.sdk.component.yo.kgy.uq.kgy.kgy(string, jSONObjectJsonObjectInit);
                                    kgyVar.ahm(uq());
                                    kgyVar.rz(rz());
                                    kgyVar.kgy(i4);
                                    if (com.bytedance.sdk.component.yo.kgy.rz.kgy.uq() && uq() == b) {
                                        kgyVar.ahm(i3);
                                    }
                                    com.bytedance.sdk.component.yo.kgy.rz.kgy.kgy(jSONObjectJsonObjectInit, kgyVar);
                                    arrayList2 = arrayList3;
                                    try {
                                        arrayList2.add(kgyVar);
                                    } catch (Throwable th) {
                                        th = th;
                                        th.getMessage();
                                    }
                                    arrayList3 = arrayList2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                arrayList2 = arrayList3;
                                th.getMessage();
                                arrayList3 = arrayList2;
                            }
                        } else if (TextUtils.isEmpty(string2)) {
                            this.kgy.add(string);
                        } else {
                            if (arrayList3.size() > 100) {
                                break;
                                break;
                            }
                            int i5 = cursor.getInt(cursor.getColumnIndex("retry"));
                            JSONObject jSONObjectJsonObjectInit2 = PangleNetworkBridge.jsonObjectInit(string2);
                            kgyVar = new com.bytedance.sdk.component.yo.kgy.uq.kgy.kgy(string, jSONObjectJsonObjectInit2);
                            kgyVar.ahm(uq());
                            kgyVar.rz(rz());
                            kgyVar.kgy(i5);
                            if (com.bytedance.sdk.component.yo.kgy.rz.kgy.uq()) {
                                kgyVar.ahm(i3);
                            }
                            com.bytedance.sdk.component.yo.kgy.rz.kgy.kgy(jSONObjectJsonObjectInit2, kgyVar);
                            arrayList2 = arrayList3;
                            arrayList2.add(kgyVar);
                            arrayList3 = arrayList2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        arrayList2 = arrayList3;
                    }
                }
                arrayList = arrayList3;
                try {
                    cursor.close();
                    if (!this.kgy.isEmpty()) {
                        kgy(this.kgy);
                        this.kgy.clear();
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th4) {
                try {
                    cursor.close();
                    if (!this.kgy.isEmpty()) {
                        kgy(this.kgy);
                        this.kgy.clear();
                    }
                } catch (Exception unused2) {
                }
                throw th4;
            }
        } else {
            arrayList = arrayList3;
        }
        ahm();
        arrayList.size();
        return arrayList;
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

    public kgy(Context context, com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy kgyVar) {
        super(context);
        this.kgy = new ArrayList();
        this.rz = context;
        this.uq = kgyVar;
        if (kgyVar == null) {
            this.uq = com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy.rz();
        }
    }

    public byte rz() {
        return (byte) 2;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.rz
    public String ahm() {
        com.bytedance.sdk.component.yo.kgy.kgy.ct ctVarRz = com.bytedance.sdk.component.yo.kgy.yo.noq().rz();
        if (ctVarRz != null) {
            return ctVarRz.ahm();
        }
        return null;
    }

    private void ahm(int i, long j) {
        if (j > 0 || i > 0) {
            com.bytedance.sdk.component.yo.kgy.kgy.kgy.rz.kgy(ct(), ahm(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
            ahm();
        }
    }

    public static String ahm(String str) {
        return pv1.n("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0028 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r0 r1
  0x0028: PHI (r0v3 int) = (r0v0 int), (r0v5 int) binds: [B:15:0x0032, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r1v3 android.database.Cursor) = (r1v2 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:15:0x0032, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public int kgy() {
        Cursor cursorKgy = null;
        int i = 0;
        try {
            cursorKgy = com.bytedance.sdk.component.yo.kgy.kgy.kgy.rz.kgy(ct(), ahm(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorKgy != null) {
                cursorKgy.moveToFirst();
                i = cursorKgy.getInt(0);
            }
        } catch (Exception unused) {
        } finally {
            if (cursorKgy != null) {
                try {
                    cursorKgy.close();
                } catch (Exception unused2) {
                }
            }
        }
        return i;
    }

    public List<com.bytedance.sdk.component.yo.kgy.uq.kgy> kgy(String str) {
        com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy kgyVar = this.uq;
        if (kgyVar == null) {
            return new ArrayList();
        }
        return kgy(kgyVar.ahm(), str);
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
        if (this.uq == null) {
            return false;
        }
        int iKgy = kgy();
        int iKgy2 = this.uq.kgy();
        ahm();
        if (com.bytedance.sdk.component.yo.kgy.rz.kgy.rz() && (i == 1 || i == 2)) {
            return iKgy > 0;
        }
        return iKgy >= iKgy2;
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
