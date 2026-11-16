package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.internal.k0;
import defpackage.ai0;
import defpackage.bi0;
import defpackage.du;
import defpackage.f32;
import defpackage.i52;
import defpackage.l71;
import defpackage.lz;
import defpackage.os2;
import defpackage.qh1;
import defpackage.rh1;
import defpackage.s71;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class f implements Serializable {
    public static final HashSet f = new HashSet();
    public final JSONObject a;
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final String e;

    /* JADX WARN: Code duplicated, block: B:104:0x01de A[Catch: all -> 0x01c0, Exception -> 0x01ee, TRY_LEAVE, TryCatch #1 {all -> 0x01c0, blocks: (B:78:0x0181, B:80:0x0185, B:83:0x018c, B:84:0x019d, B:86:0x01a3, B:88:0x01af, B:90:0x01b9, B:95:0x01c2, B:99:0x01cc, B:100:0x01d0, B:101:0x01d7, B:102:0x01d8, B:104:0x01de), top: B:169:0x0181 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0208  */
    /* JADX WARN: Code duplicated, block: B:113:0x0209 A[Catch: all -> 0x0235, TryCatch #6 {all -> 0x0235, blocks: (B:110:0x01fe, B:113:0x0209, B:115:0x021e, B:117:0x022e, B:120:0x0237, B:122:0x023d, B:123:0x024a, B:125:0x0250, B:126:0x0266), top: B:176:0x01fe }] */
    /* JADX WARN: Code duplicated, block: B:115:0x021e A[Catch: all -> 0x0235, TryCatch #6 {all -> 0x0235, blocks: (B:110:0x01fe, B:113:0x0209, B:115:0x021e, B:117:0x022e, B:120:0x0237, B:122:0x023d, B:123:0x024a, B:125:0x0250, B:126:0x0266), top: B:176:0x01fe }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0250 A[Catch: all -> 0x0235, JSONException -> 0x0273, LOOP:6: B:123:0x024a->B:125:0x0250, LOOP_END, TryCatch #4 {JSONException -> 0x0273, blocks: (B:122:0x023d, B:123:0x024a, B:125:0x0250, B:126:0x0266), top: B:173:0x023d }] */
    /* JADX WARN: Code duplicated, block: B:134:0x028e  */
    /* JADX WARN: Code duplicated, block: B:135:0x028f A[Catch: all -> 0x02d2, TryCatch #3 {all -> 0x02d2, blocks: (B:132:0x0284, B:135:0x028f, B:137:0x02a6, B:140:0x02b7, B:142:0x02be, B:144:0x02ce), top: B:171:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02a6 A[Catch: all -> 0x02d2, TryCatch #3 {all -> 0x02d2, blocks: (B:132:0x0284, B:135:0x028f, B:137:0x02a6, B:140:0x02b7, B:142:0x02be, B:144:0x02ce), top: B:171:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02be A[Catch: all -> 0x02d2, TryCatch #3 {all -> 0x02d2, blocks: (B:132:0x0284, B:135:0x028f, B:137:0x02a6, B:140:0x02b7, B:142:0x02be, B:144:0x02ce), top: B:171:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x02e4 A[LOOP:2: B:149:0x02de->B:151:0x02e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:156:0x0301  */
    /* JADX WARN: Code duplicated, block: B:159:0x030a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0310  */
    /* JADX WARN: Code duplicated, block: B:162:0x031c A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:169:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0284 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x023d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x01fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x021c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9 A[Catch: all -> 0x0101, TRY_LEAVE, TryCatch #2 {all -> 0x0101, blocks: (B:38:0x00c5, B:40:0x00c9, B:52:0x00fb, B:43:0x00d2, B:44:0x00dc, B:46:0x00e2, B:48:0x00f2), top: B:170:0x00c5, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2 A[Catch: all -> 0x00fa, TryCatch #8 {all -> 0x00fa, blocks: (B:43:0x00d2, B:44:0x00dc, B:46:0x00e2, B:48:0x00f2), top: B:179:0x00d2, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x0123  */
    /* JADX WARN: Code duplicated, block: B:64:0x012a  */
    /* JADX WARN: Code duplicated, block: B:67:0x013f  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a3 A[Catch: all -> 0x01c0, Exception -> 0x01ee, TryCatch #1 {all -> 0x01c0, blocks: (B:78:0x0181, B:80:0x0185, B:83:0x018c, B:84:0x019d, B:86:0x01a3, B:88:0x01af, B:90:0x01b9, B:95:0x01c2, B:99:0x01cc, B:100:0x01d0, B:101:0x01d7, B:102:0x01d8, B:104:0x01de), top: B:169:0x0181 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01af A[Catch: all -> 0x01c0, Exception -> 0x01ee, TryCatch #1 {all -> 0x01c0, blocks: (B:78:0x0181, B:80:0x0185, B:83:0x018c, B:84:0x019d, B:86:0x01a3, B:88:0x01af, B:90:0x01b9, B:95:0x01c2, B:99:0x01cc, B:100:0x01d0, B:101:0x01d7, B:102:0x01d8, B:104:0x01de), top: B:169:0x0181 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ca  */
    public f(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid, w wVar) throws JSONException {
        JSONObject jSONObject;
        String str3;
        boolean zContains;
        String str4;
        HashMap map;
        JSONObject jSONObject2;
        Object obj;
        String str5;
        l71 l71Var;
        Map mapH;
        HashMap map2;
        ArrayList arrayList;
        int size;
        int i;
        JSONObject jSONObject3;
        String str6;
        String strA;
        Map mapH2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int size2;
        int i2;
        ai0 ai0Var;
        int size3;
        int i3;
        String str7;
        Object obj2;
        Set set;
        f32 f32Var;
        HashSet hashSet;
        str.getClass();
        str2.getClass();
        this.c = z;
        this.d = z2;
        this.e = str2;
        String str8 = null;
        if (wVar != null) {
            try {
                LinkedHashMap linkedHashMap = wVar.a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(rh1.U(linkedHashMap.size()));
                for (Object obj3 : linkedHashMap.entrySet()) {
                    ((x) ((Map.Entry) obj3).getKey()).getClass();
                    linkedHashMap2.put("iap_parameters", ((Map.Entry) obj3).getValue());
                }
                jSONObject = new JSONObject(qh1.h0(linkedHashMap2));
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        this.b = jSONObject;
        io.p071bidmachine.media3.common.audio.c.C(str2);
        JSONObject jSONObject4 = new JSONObject();
        i52 i52Var = i52.a;
        Set set2 = lz.a;
        if (set2.contains(i52.class)) {
            str3 = null;
        } else {
            try {
                if (i52.b) {
                    i52 i52Var2 = i52.a;
                    if (set2.contains(i52Var2)) {
                        zContains = false;
                    } else {
                        try {
                            zContains = i52.d.contains(str2);
                        } catch (Throwable th) {
                            lz.a(i52Var2, th);
                            zContains = false;
                            if (zContains) {
                                str3 = "_removed_";
                            } else {
                                str3 = str2;
                            }
                            if (s71.b(str3, str2)) {
                                f32 f32Var2 = f32.a;
                                set = lz.a;
                                if (!set.contains(f32.class)) {
                                    try {
                                        if (f32.b) {
                                            f32Var = f32.a;
                                            if (!set.contains(f32Var)) {
                                                try {
                                                    for (String str9 : f32.c.keySet()) {
                                                        hashSet = (HashSet) f32.c.get(str9);
                                                        if (hashSet == null) {
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    lz.a(f32Var, th2);
                                                }
                                            }
                                            if (str8 == null) {
                                                str8 = str2;
                                            }
                                        } else {
                                            str8 = str2;
                                        }
                                    } catch (Throwable th3) {
                                        lz.a(f32.class, th3);
                                    }
                                }
                                str3 = str8;
                            }
                            jSONObject4.put("_eventName", str3);
                            jSONObject4.put("_logTime", System.currentTimeMillis() / 1000);
                            jSONObject4.put("_ui", str);
                            if (uuid != null) {
                                jSONObject4.put("_session_id", uuid);
                            }
                            if (bundle != null) {
                                str4 = this.e;
                                map = new HashMap();
                                while (r0.hasNext()) {
                                    str.getClass();
                                    io.p071bidmachine.media3.common.audio.c.C(str);
                                    obj2 = bundle.get(str);
                                    if (obj2 instanceof String) {
                                    }
                                    map.put(str, obj2.toString());
                                }
                                if (!lz.a.contains(l71.class)) {
                                    try {
                                        if (l71.c) {
                                            try {
                                                List<String> listZ0 = du.z0(map.keySet());
                                                jSONObject2 = new JSONObject();
                                                for (String str10 : listZ0) {
                                                    obj = map.get(str10);
                                                    if (obj != null) {
                                                        throw new IllegalStateException("Required value was null.");
                                                    }
                                                    str5 = (String) obj;
                                                    l71Var = l71.b;
                                                    if (!l71Var.l(str10)) {
                                                    }
                                                    map.remove(str10);
                                                    if (l71.d) {
                                                        str5 = "";
                                                    }
                                                    jSONObject2.put(str10, str5);
                                                }
                                                if (jSONObject2.length() != 0) {
                                                    String string = jSONObject2.toString();
                                                    string.getClass();
                                                    map.put("_onDeviceParams", string);
                                                }
                                            } catch (Exception unused2) {
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        lz.a(l71.class, th4);
                                    }
                                }
                                mapH = os2.h(map);
                                i52 i52Var3 = i52.a;
                                if (!lz.a.contains(i52.class)) {
                                    try {
                                        mapH.getClass();
                                        str4.getClass();
                                        if (!i52.b) {
                                            map2 = new HashMap();
                                            arrayList = new ArrayList(mapH.keySet());
                                            size = arrayList.size();
                                            i = 0;
                                            while (i < size) {
                                                Object obj4 = arrayList.get(i);
                                                i++;
                                                str6 = (String) obj4;
                                                strA = i52.a.a(str4, str6);
                                                if (strA != null) {
                                                    map2.put(str6, strA);
                                                    mapH.remove(str6);
                                                }
                                            }
                                            if (!map2.isEmpty()) {
                                                try {
                                                    jSONObject3 = new JSONObject();
                                                    for (Map.Entry entry : map2.entrySet()) {
                                                        jSONObject3.put((String) entry.getKey(), (String) entry.getValue());
                                                    }
                                                    mapH.put("_restrictedParams", jSONObject3.toString());
                                                } catch (JSONException unused3) {
                                                }
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        lz.a(i52.class, th5);
                                    }
                                }
                                mapH2 = os2.h(map);
                                bi0 bi0Var = bi0.a;
                                if (!lz.a.contains(bi0.class)) {
                                    try {
                                        mapH2.getClass();
                                        str4.getClass();
                                        if (!bi0.b) {
                                            arrayList2 = new ArrayList(mapH2.keySet());
                                            arrayList3 = new ArrayList(bi0.c);
                                            size2 = arrayList3.size();
                                            i2 = 0;
                                            while (i2 < size2) {
                                                Object obj5 = arrayList3.get(i2);
                                                i2++;
                                                ai0Var = (ai0) obj5;
                                                if (!s71.b(ai0Var.a, str4)) {
                                                    size3 = arrayList2.size();
                                                    i3 = 0;
                                                    while (i3 < size3) {
                                                        Object obj6 = arrayList2.get(i3);
                                                        i3++;
                                                        str7 = (String) obj6;
                                                        if (ai0Var.b.contains(str7)) {
                                                            mapH2.remove(str7);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        lz.a(bi0.class, th6);
                                    }
                                }
                                for (String str11 : map.keySet()) {
                                    jSONObject4.put(str11, map.get(str11));
                                }
                            }
                            if (d != null) {
                                jSONObject4.put("_valueToSum", d.doubleValue());
                            }
                            if (this.d) {
                                jSONObject4.put("_inBackground", "1");
                            }
                            if (this.c) {
                                jSONObject4.put("_implicitlyLogged", "1");
                            } else {
                                n nVar = k0.c;
                                jSONObject4.toString().getClass();
                                synchronized (com.facebook.a0.b) {
                                }
                            }
                            this.a = jSONObject4;
                        }
                    }
                    if (zContains) {
                        str3 = "_removed_";
                    } else {
                        str3 = str2;
                    }
                } else {
                    str3 = str2;
                }
            } catch (Throwable th7) {
                lz.a(i52.class, th7);
                str3 = null;
            }
        }
        if (s71.b(str3, str2)) {
            f32 f32Var3 = f32.a;
            set = lz.a;
            if (!set.contains(f32.class)) {
                if (f32.b) {
                    f32Var = f32.a;
                    if (!set.contains(f32Var)) {
                        while (r0.hasNext()) {
                            hashSet = (HashSet) f32.c.get(str9);
                            if (hashSet == null && hashSet.contains(str2)) {
                                str8 = str9;
                                break;
                            }
                        }
                    }
                    if (str8 == null) {
                        str8 = str2;
                    }
                } else {
                    str8 = str2;
                }
            }
            str3 = str8;
        }
        jSONObject4.put("_eventName", str3);
        jSONObject4.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject4.put("_ui", str);
        if (uuid != null) {
            jSONObject4.put("_session_id", uuid);
        }
        if (bundle != null) {
            str4 = this.e;
            map = new HashMap();
            for (String str12 : bundle.keySet()) {
                str12.getClass();
                io.p071bidmachine.media3.common.audio.c.C(str12);
                obj2 = bundle.get(str12);
                if ((obj2 instanceof String) && !(obj2 instanceof Number)) {
                    throw new com.facebook.u(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj2, str12}, 2)));
                }
                map.put(str12, obj2.toString());
            }
            if (!lz.a.contains(l71.class)) {
                if (l71.c && !map.isEmpty()) {
                    List<String> listZ1 = du.z0(map.keySet());
                    jSONObject2 = new JSONObject();
                    while (r0.hasNext()) {
                        obj = map.get(str10);
                        if (obj != null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        str5 = (String) obj;
                        l71Var = l71.b;
                        if (!l71Var.l(str10) || l71Var.l(str5)) {
                            map.remove(str10);
                            if (l71.d) {
                                str5 = "";
                            }
                            jSONObject2.put(str10, str5);
                        }
                    }
                    if (jSONObject2.length() != 0) {
                        String string2 = jSONObject2.toString();
                        string2.getClass();
                        map.put("_onDeviceParams", string2);
                    }
                }
            }
            mapH = os2.h(map);
            i52 i52Var4 = i52.a;
            if (!lz.a.contains(i52.class)) {
                mapH.getClass();
                str4.getClass();
                if (!i52.b) {
                    map2 = new HashMap();
                    arrayList = new ArrayList(mapH.keySet());
                    size = arrayList.size();
                    i = 0;
                    while (i < size) {
                        Object obj7 = arrayList.get(i);
                        i++;
                        str6 = (String) obj7;
                        strA = i52.a.a(str4, str6);
                        if (strA != null) {
                            map2.put(str6, strA);
                            mapH.remove(str6);
                        }
                    }
                    if (!map2.isEmpty()) {
                        jSONObject3 = new JSONObject();
                        while (r3.hasNext()) {
                            jSONObject3.put((String) entry.getKey(), (String) entry.getValue());
                        }
                        mapH.put("_restrictedParams", jSONObject3.toString());
                    }
                }
            }
            mapH2 = os2.h(map);
            bi0 bi0Var2 = bi0.a;
            if (!lz.a.contains(bi0.class)) {
                mapH2.getClass();
                str4.getClass();
                if (!bi0.b) {
                    arrayList2 = new ArrayList(mapH2.keySet());
                    arrayList3 = new ArrayList(bi0.c);
                    size2 = arrayList3.size();
                    i2 = 0;
                    while (i2 < size2) {
                        Object obj8 = arrayList3.get(i2);
                        i2++;
                        ai0Var = (ai0) obj8;
                        if (!s71.b(ai0Var.a, str4)) {
                            size3 = arrayList2.size();
                            i3 = 0;
                            while (i3 < size3) {
                                Object obj9 = arrayList2.get(i3);
                                i3++;
                                str7 = (String) obj9;
                                if (ai0Var.b.contains(str7)) {
                                    mapH2.remove(str7);
                                }
                            }
                        }
                    }
                }
            }
            while (r0.hasNext()) {
                jSONObject4.put(str11, map.get(str11));
            }
        }
        if (d != null) {
            jSONObject4.put("_valueToSum", d.doubleValue());
        }
        if (this.d) {
            jSONObject4.put("_inBackground", "1");
        }
        if (this.c) {
            jSONObject4.put("_implicitlyLogged", "1");
        } else {
            n nVar2 = k0.c;
            jSONObject4.toString().getClass();
            synchronized (com.facebook.a0.b) {
            }
        }
        this.a = jSONObject4;
    }

    private final Object writeReplace() throws ObjectStreamException {
        String string = this.a.toString();
        string.getClass();
        String string2 = this.b.toString();
        string2.getClass();
        return new e(string, string2, this.c, this.d);
    }

    public final String toString() {
        JSONObject jSONObject = this.a;
        return String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{jSONObject.optString("_eventName"), Boolean.valueOf(this.c), jSONObject.toString()}, 3));
    }

    public f(String str, String str2, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject(str);
        this.a = jSONObject;
        this.b = new JSONObject(str2);
        this.c = z;
        String strOptString = jSONObject.optString("_eventName");
        strOptString.getClass();
        this.e = strOptString;
        this.d = z2;
    }
}
