package com.inmobi.media;

import defpackage.dk2;
import defpackage.hg0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class D1 {
    public static Map a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(com.ironsource.R6.E1);
        if (jSONArrayOptJSONArray2 == null) {
            return hg0.a;
        }
        int length = jSONArrayOptJSONArray2.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i);
            if (jSONObjectOptJSONObject2 != null) {
                String strOptString = jSONObjectOptJSONObject2.optString("nn");
                strOptString.getClass();
                String string = dk2.y0(strOptString).toString();
                if (string.length() != 0 && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("activities")) != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        next.getClass();
                        String string2 = dk2.y0(next).toString();
                        if (string2.length() != 0 && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(next)) != null) {
                            int length2 = jSONArrayOptJSONArray.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                String strOptString2 = jSONArrayOptJSONArray.optString(i2);
                                strOptString2.getClass();
                                String string3 = dk2.y0(strOptString2).toString();
                                if (string3.length() != 0) {
                                    C1 c1 = new C1(string, string2);
                                    Object arrayList = linkedHashMap.get(string3);
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                        linkedHashMap.put(string3, arrayList);
                                    }
                                    List list = (List) arrayList;
                                    if (!list.contains(c1)) {
                                        list.add(c1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }
}
