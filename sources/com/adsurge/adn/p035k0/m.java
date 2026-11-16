package com.adsurge.adn.p035k0;

import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class m {
    public static final Map a = new ConcurrentHashMap(20);

    public static h a(Object obj) {
        if (JSONObject.NULL.equals(obj)) {
            return null;
        }
        Map map = a;
        h kVar = (h) map.get(obj);
        if (kVar != null) {
            return kVar.a();
        }
        if (obj instanceof String) {
            kVar = d((String) obj);
        }
        if (obj instanceof JSONArray) {
            kVar = d(obj.toString());
        }
        if (kVar == null) {
            kVar = new k(obj);
        }
        map.put(obj, kVar);
        return kVar;
    }

    public static c b(Object obj) {
        Map map = a;
        h hVarD = (h) map.get(obj);
        if (hVarD instanceof c) {
            return (c) hVarD;
        }
        if (hVarD != null) {
            return null;
        }
        if (obj instanceof String) {
            hVarD = d((String) obj);
        } else if (obj instanceof JSONArray) {
            hVarD = d(obj.toString());
        }
        if (hVarD != null) {
            map.put(obj, hVarD);
        }
        return (c) hVarD;
    }

    public static List c(String str) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '$' && (i2 = i3 + 1) < length && str.charAt(i2) == '{' && !z) {
                int iIndexOf = str.indexOf(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, i3 + 2);
                if (iIndexOf != -1) {
                    if (sb.length() > 0) {
                        arrayList.add(sb.toString());
                        sb.setLength(0);
                    }
                    arrayList.add(str.substring(i3, iIndexOf + 1));
                    i3 = iIndexOf;
                } else {
                    sb.append(cCharAt);
                }
            } else if (cCharAt == ';' && (i = i3 + 1) < length && str.charAt(i) == '{') {
                if (sb.length() > 0) {
                    arrayList.add(str.substring(i5, i3));
                    sb.setLength(0);
                }
                sb.append(cCharAt);
                i5 = i3;
                z = true;
            } else if (cCharAt == '{' && z) {
                i4++;
                sb.append(cCharAt);
            } else if (cCharAt == '}' && z && i4 > 1) {
                i4--;
                sb.append(cCharAt);
            } else if (cCharAt == '}' && z && i4 == 1) {
                i4--;
                sb.append(cCharAt);
                if (sb.length() > 0) {
                    arrayList.add(str.substring(i5, i3 + 1));
                    sb.setLength(0);
                }
                z = false;
            } else {
                sb.append(cCharAt);
            }
            i3++;
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public static h d(String str) {
        if (!a(str)) {
            return null;
        }
        List listC = c(str);
        if (listC.isEmpty()) {
            return null;
        }
        if (listC.size() == 1) {
            return e(str);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            h hVarE = e((String) it.next());
            if (hVarE == null) {
                return null;
            }
            arrayList.add(hVarE);
        }
        return new b(arrayList, str);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x011f  */
    public static h e(String str) {
        k kVarC;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!a(str)) {
            return new k(str);
        }
        int length = str.length();
        if (length < 4) {
            return new k(str);
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        Integer numValueOf = null;
        Character ch = null;
        Character chValueOf = null;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '$') {
                if (cCharAt != '?') {
                    if (cCharAt != '{') {
                        if (cCharAt != '}') {
                            if (cCharAt != ':') {
                                if (cCharAt == ';') {
                                    chValueOf = Character.valueOf(cCharAt);
                                }
                            } else {
                                int i2 = i + 2;
                                if (i2 >= length || str.charAt(i + 1) != '/' || str.charAt(i2) != '/') {
                                    if (ch == null || ch.charValue() != ';') {
                                        return null;
                                    }
                                    if (numValueOf != null) {
                                        if (numValueOf.intValue() != i) {
                                            kVarC = c((Object) str.substring(numValueOf.intValue(), i));
                                        } else {
                                            kVarC = null;
                                        }
                                        linkedList.offerFirst(kVarC);
                                    }
                                    numValueOf = Integer.valueOf(i + 1);
                                }
                            }
                        } else {
                            if (ch == null) {
                                return null;
                            }
                            if ('$' == ch.charValue()) {
                                if (numValueOf == null || numValueOf.intValue() == i) {
                                    return null;
                                }
                                linkedList.offerFirst(b(str.substring(numValueOf.intValue(), i)));
                            } else if (';' == ch.charValue()) {
                                if (numValueOf != null) {
                                    if (numValueOf.intValue() == i) {
                                        return null;
                                    }
                                    linkedList.offerFirst(c((Object) str.substring(numValueOf.intValue(), i)));
                                }
                                h hVar = (h) linkedList.pollFirst();
                                h hVar2 = (h) linkedList.pollFirst();
                                h hVar3 = (h) linkedList.pollFirst();
                                if (hVar3 == null || hVar == null) {
                                    return null;
                                }
                                linkedList.offerFirst(new l(hVar3, hVar2, hVar, str));
                            }
                            ch = (Character) linkedList2.pollFirst();
                            numValueOf = null;
                        }
                    } else {
                        if (chValueOf == null) {
                            return null;
                        }
                        numValueOf = Integer.valueOf(i + 1);
                        if (ch != null) {
                            linkedList2.offerFirst(ch);
                        }
                        ch = chValueOf;
                    }
                    chValueOf = null;
                } else {
                    if (numValueOf != null || ch == null || ch.charValue() != ';') {
                        return null;
                    }
                    numValueOf = Integer.valueOf(i + 1);
                }
            } else {
                chValueOf = Character.valueOf(cCharAt);
            }
        }
        if (!linkedList2.isEmpty() || linkedList.size() != 1) {
            return null;
        }
        return (h) linkedList.pollFirst();
    }

    public static e b(String str) {
        if (str == null) {
            return null;
        }
        Map map = a;
        h hVar = (h) map.get(str);
        if (hVar instanceof e) {
            return (e) hVar;
        }
        e eVar = new e(str);
        map.put(str, eVar);
        return eVar;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("${") || str.contains(";{");
    }

    public static k c(Object obj) {
        if (JSONObject.NULL.equals(obj)) {
            return new i();
        }
        if (!(obj instanceof String) && !(obj instanceof Number)) {
            return new k(obj);
        }
        Map map = a;
        h hVar = (h) map.get(obj);
        if (hVar instanceof k) {
            return (k) hVar;
        }
        k kVar = new k(obj);
        map.put(obj, kVar);
        return kVar;
    }
}
