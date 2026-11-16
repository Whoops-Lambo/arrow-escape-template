package com.adsurge.adn.p026h0;

import android.text.TextUtils;
import com.adsurge.adn.I0.f;
import com.adsurge.adn.J0.a;
import com.adsurge.adn.p035k0.c;
import com.adsurge.adn.p035k0.k;
import com.adsurge.adn.p035k0.m;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class h {
    public int a;

    public final l a(JSONObject jSONObject, int i, StringBuilder sb, f fVar, g gVar) {
        String str;
        String str2;
        String str3;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        StringBuilder sb2 = sb;
        f fVar2 = fVar;
        Object objRemove = jSONObject2.remove("1");
        String string = objRemove != null ? objRemove.toString() : null;
        if (TextUtils.isEmpty(string)) {
            int i3 = objRemove == null ? 102 : 103;
            this.a = i3;
            gVar.a(i3, jSONObject2);
            return null;
        }
        if (!fVar2.b && TextUtils.equals(string, "6")) {
            fVar2.b = true;
        }
        boolean zEquals = TextUtils.equals(string, "4");
        Object objRemove2 = jSONObject2.remove("38");
        if (objRemove2 != null && (!(objRemove2 instanceof Number) || ((Number) objRemove2).intValue() != 2)) {
            this.a = 104;
            gVar.a(104, jSONObject2);
            return null;
        }
        Object objRemove3 = jSONObject2.remove("43");
        if (objRemove3 != null && (!(objRemove3 instanceof Number) || ((Number) objRemove3).intValue() > 27)) {
            this.a = 105;
            gVar.a(105, jSONObject2);
            return null;
        }
        Object objRemove4 = jSONObject2.remove("44");
        if (objRemove4 != null && (!(objRemove4 instanceof Number) || ((Number) objRemove4).intValue() < 27)) {
            this.a = 106;
            gVar.a(106, jSONObject2);
            return null;
        }
        l.a aVar = new l.a();
        aVar.a = string;
        Object objRemove5 = jSONObject2.remove("javaScript");
        if (objRemove5 instanceof String) {
            String str4 = (String) objRemove5;
            if (a.a) {
                sb2.append("////\n");
            }
            sb2.append(str4);
            if (!str4.endsWith(";")) {
                sb2.append(";");
            }
        }
        aVar.i = i2;
        Object objRemove6 = jSONObject2.remove("68");
        if (objRemove6 instanceof Number) {
            aVar.h = ((Number) objRemove6).intValue();
        }
        if (b.a) {
            Object objRemove7 = jSONObject2.remove("complexComponentType");
            String str5 = objRemove7 instanceof String ? (String) objRemove7 : "";
            Object objRemove8 = jSONObject2.remove("complexComponentVersion");
            String str6 = objRemove8 instanceof String ? (String) objRemove8 : "";
            Object objRemove9 = jSONObject2.remove("complexComponentHash");
            str3 = objRemove9 instanceof String ? (String) objRemove9 : "";
            str2 = str6;
            str = str5;
        } else {
            str = "";
            str2 = str;
            str3 = str2;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next)) {
                Object objOpt = jSONObject2.opt(next);
                if (objOpt != null) {
                    next.getClass();
                    switch (next) {
                        case "complexComponentId":
                            if (b.a && (objOpt instanceof String)) {
                                String str7 = (String) objOpt;
                                if (!TextUtils.isEmpty(str7)) {
                                    aVar.k = new c(str7, str, str2, str3);
                                }
                            }
                            jSONObject2 = jSONObject;
                            i2 = i;
                            sb2 = sb;
                            fVar2 = fVar;
                            break;
                        case "debugInfo":
                            if (a.a && (objOpt instanceof String)) {
                                aVar.j = (String) objOpt;
                            }
                            jSONObject2 = jSONObject;
                            i2 = i;
                            sb2 = sb;
                            fVar2 = fVar;
                            break;
                        case "2":
                            JSONArray jSONArray = (JSONArray) objOpt;
                            int length = jSONArray.length();
                            if (length > 0) {
                                l[] lVarArr = new l[length];
                                int iA = a(aVar.h, i2);
                                int i4 = 0;
                                int i5 = 0;
                                while (i4 < length) {
                                    int i6 = length;
                                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i4);
                                    int i7 = i4;
                                    l[] lVarArr2 = lVarArr;
                                    int i8 = iA;
                                    l lVarA = a(jSONObjectOptJSONObject, i8, sb2, fVar2, gVar);
                                    if (lVarA != null) {
                                        lVarArr2[i5] = lVarA;
                                        gVar.a(lVarA);
                                        i5++;
                                    }
                                    i4 = i7 + 1;
                                    length = i6;
                                    iA = i8;
                                    lVarArr = lVarArr2;
                                    sb2 = sb;
                                    fVar2 = fVar;
                                }
                                l[] lVarArr3 = lVarArr;
                                if (i5 == length) {
                                    aVar.b = lVarArr3;
                                } else {
                                    l[] lVarArr4 = new l[i5];
                                    aVar.b = lVarArr4;
                                    System.arraycopy(lVarArr3, 0, lVarArr4, 0, i5);
                                }
                            }
                            jSONObject2 = jSONObject;
                            i2 = i;
                            sb2 = sb;
                            fVar2 = fVar;
                            break;
                        case "21":
                            JSONArray jSONArray2 = (JSONArray) objOpt;
                            int length2 = jSONArray2.length();
                            if (length2 > 0) {
                                aVar.e = new e[length2];
                                int i9 = 0;
                                while (i9 < length2) {
                                    e eVarB = b(jSONArray2.optJSONObject(i9));
                                    aVar.e[i9] = eVarB;
                                    a(fVar2, eVarB);
                                    i9++;
                                    length2 = length2;
                                }
                                break;
                            }
                            break;
                        case "27":
                            JSONArray jSONArray3 = (JSONArray) objOpt;
                            int length3 = jSONArray3.length();
                            if (length3 > 0) {
                                aVar.g = new a[length3];
                                int i10 = 0;
                                while (i10 < length3) {
                                    aVar.g[i10] = a(jSONArray3.optJSONObject(i10));
                                    i10++;
                                    length3 = length3;
                                }
                                break;
                            }
                            break;
                        case "61":
                            JSONArray jSONArray4 = (JSONArray) objOpt;
                            int length4 = jSONArray4.length();
                            if (length4 > 0) {
                                aVar.f = new i[length4];
                                int i11 = 0;
                                while (i11 < length4) {
                                    aVar.f[i11] = c(jSONArray4.optJSONObject(i11));
                                    i11++;
                                    length4 = length4;
                                }
                                break;
                            }
                            break;
                        default:
                            com.adsurge.adn.p035k0.h hVarA = m.a(objOpt);
                            if (hVarA instanceof c) {
                                aVar.d.put(next, (c) hVarA);
                                break;
                            } else {
                                if (hVarA instanceof k) {
                                    k kVar = (k) hVarA;
                                    aVar.c.put(next, kVar);
                                    a(fVar2, zEquals, next, kVar);
                                }
                                break;
                            }
                            break;
                    }
                }
            } else {
                jSONObject2 = jSONObject;
                i2 = i;
                sb2 = sb;
                fVar2 = fVar;
            }
        }
        this.a = 107;
        return aVar.a();
    }

    public final e b(JSONObject jSONObject) {
        e.a aVar = new e.a();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next)) {
                next.getClass();
                switch (next) {
                    case "22":
                        aVar.a = jSONObject.optInt(next);
                        break;
                    case "23":
                        aVar.b = jSONObject.optString(next);
                        break;
                    case "24":
                        aVar.c = jSONObject.optString(next);
                        break;
                    case "25":
                        a(jSONObject.optJSONObject(next), aVar);
                        break;
                }
            }
        }
        return aVar.a();
    }

    public final i c(JSONObject jSONObject) {
        i.a aVar = new i.a();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next)) {
                next.getClass();
                switch (next) {
                    case "62":
                        aVar.a = jSONObject.optInt(next);
                        break;
                    case "63":
                        aVar.b = jSONObject.optString(next);
                        break;
                    case "64":
                        a(jSONObject.optJSONObject(next), aVar);
                        break;
                }
            }
        }
        return aVar.a();
    }

    public f a(String str, g gVar) {
        if (str != null && str.length() >= 9) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.a = 101;
                if (jSONObject.length() == 0) {
                    gVar.a(this.a, jSONObject);
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                f fVar = new f();
                Object objRemove = jSONObject.remove("ext");
                if (objRemove instanceof JSONObject) {
                    fVar.e = (JSONObject) objRemove;
                }
                l lVarA = a(jSONObject, 0, sb, fVar, gVar);
                if (lVarA != null) {
                    lVarA.l = sb.toString();
                }
                fVar.c = lVarA;
                return fVar;
            } catch (JSONException e) {
                this.a = 100;
                a.a("parse template error", e);
                gVar.a(this.a, null);
            }
        }
        return null;
    }

    public final int a(int i, int i2) {
        return i != 0 ? i : i2;
    }

    public static void a(f fVar, boolean z, String str, k kVar) {
        if (z && TextUtils.equals(str, "91")) {
            String string = kVar.toString();
            if (TextUtils.isEmpty(string) || !a(string)) {
                return;
            }
            fVar.d.add(string);
        }
    }

    public static boolean a(String str) {
        return str.startsWith(d.v) || str.startsWith("https://");
    }

    public final void a(f fVar, e eVar) {
        int i = eVar.a;
        if (i == 8) {
            fVar.a |= 2;
        } else if (i == 5) {
            fVar.a |= 1;
        }
    }

    public final void a(JSONObject jSONObject, e.a aVar) {
        c cVarB;
        if (f.b(jSONObject)) {
            return;
        }
        Object objRemove = jSONObject.remove("sag");
        if (objRemove instanceof String) {
            aVar.f = (String) objRemove;
        }
        Object objRemove2 = jSONObject.remove("brd");
        if (objRemove2 instanceof JSONObject) {
            aVar.g = (JSONObject) objRemove2;
        }
        Object objRemove3 = jSONObject.remove("bsd");
        if (objRemove3 instanceof JSONObject) {
            aVar.h = (JSONObject) objRemove3;
        }
        Object objRemove4 = jSONObject.remove("nl");
        if (objRemove4 instanceof Integer) {
            aVar.i = ((Integer) objRemove4).intValue() == 1;
        }
        Object objRemove5 = jSONObject.remove("saf");
        if (objRemove5 instanceof String) {
            aVar.j = (String) objRemove5;
        }
        Object objRemove6 = jSONObject.remove("bpd");
        if (objRemove6 instanceof String) {
            aVar.k = (String) objRemove6;
        }
        Object objRemove7 = jSONObject.remove("mc");
        if (objRemove7 instanceof Integer) {
            aVar.l = ((Integer) objRemove7).intValue();
        }
        if (f.b(jSONObject)) {
            return;
        }
        aVar.e = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next) && (cVarB = m.b(jSONObject.opt(next))) != null) {
                aVar.e.put(next, cVarB);
                itKeys.remove();
            }
        }
        if (jSONObject.length() > 0) {
            aVar.d = jSONObject.toString();
        }
    }

    public final void a(JSONObject jSONObject, i.a aVar) {
        c cVarB;
        if (f.b(jSONObject)) {
            return;
        }
        Object objRemove = jSONObject.remove("sag");
        if (objRemove instanceof String) {
            aVar.e = (String) objRemove;
        }
        Object objRemove2 = jSONObject.remove("brd");
        if (objRemove2 instanceof JSONObject) {
            aVar.f = (JSONObject) objRemove2;
        }
        Object objRemove3 = jSONObject.remove("bsd");
        if (objRemove3 instanceof JSONObject) {
            aVar.g = (JSONObject) objRemove3;
        }
        if (f.b(jSONObject)) {
            return;
        }
        aVar.d = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next) && (cVarB = m.b(jSONObject.opt(next))) != null) {
                aVar.d.put(next, cVarB);
                itKeys.remove();
            }
        }
        if (jSONObject.length() > 0) {
            aVar.c = jSONObject.toString();
        }
    }

    public final a a(JSONObject jSONObject) {
        a.C0114a c0114a = new a.C0114a();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next)) {
                next.getClass();
                switch (next) {
                    case "28":
                        c0114a.b = jSONObject.optString(next, a.q);
                        break;
                    case "29":
                        c0114a.a = jSONObject.optInt(next);
                        break;
                    case "30":
                        c0114a.c = jSONObject.optJSONArray(next);
                        break;
                    case "31":
                        c0114a.d = jSONObject.optInt(next);
                        break;
                    case "32":
                        c0114a.e = jSONObject.optInt(next);
                        break;
                    case "33":
                        c0114a.g = jSONObject.optInt(next);
                        break;
                    case "34":
                        c0114a.h = jSONObject.optInt(next, 1);
                        break;
                    case "35":
                        c0114a.i = jSONObject.optInt(next);
                        break;
                    case "36":
                        c0114a.j = jSONObject.optJSONArray(next);
                        break;
                    case "39":
                        c0114a.f = jSONObject.optInt(next);
                        break;
                }
            }
        }
        c0114a.k = jSONObject;
        return c0114a.a();
    }
}
