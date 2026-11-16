package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Ꮀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0774 {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final HashMap f2042;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final HashMap f2043;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final ArrayList f2044;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ArrayList f2045;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean f2046;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String f2047;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String f2048;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String f2049;

    static {
        StringFog.decrypt("AJpoyqfS3bIPnHXYq9s=\n", "TPMbvsK8uMA=\n");
        StringFog.decrypt("NRzIAkw=\n", "Rmm4Zz6RrQg=\n");
        StringFog.decrypt("hOjUOgt++r8=\n", "5YqnTnkfmcs=\n");
        StringFog.decrypt("HY8T234big==\n", "cOp+uRtp+bA=\n");
        StringFog.decrypt("K/6sv4U=\n", "WJvYyvWjys8=\n");
        StringFog.decrypt("rx4f30H9\n", "ymh6sTWObeQ=\n");
        StringFog.decrypt("ZB9VcYx46A==\n", "CXohGeMcm6g=\n");
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList(this.f2042.values());
        Collections.sort(arrayList, new C0780());
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append(((C1130) obj).toString());
            sb.append("\n\n");
        }
        return sb.toString();
    }

    public C0774(String str, String str2, JSONObject jSONObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        HashMap linkedHashMap;
        this.f2049 = AbstractC0475.m485(str2);
        this.f2048 = AbstractC0475.m485(str);
        this.f2047 = AbstractC0475.m485(jSONObject.optString(StringFog.decrypt("9y9brP8=\n", "hForyY21THw=\n")));
        this.f2046 = jSONObject.optBoolean(StringFog.decrypt("BQxeR20wMnU=\n", "ZG4tMx9RUQE=\n"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(StringFog.decrypt("1cyYBGkc3g==\n", "uKn1ZgxurRI=\n"));
        HashMap linkedHashMap2 = null;
        if (jSONArrayOptJSONArray != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                String strM485 = AbstractC0475.m485(jSONArrayOptJSONArray.optString(i));
                if (strM485 != null) {
                    arrayList.add(strM485);
                }
            }
        } else {
            arrayList = null;
        }
        this.f2045 = arrayList == null ? new ArrayList() : arrayList;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(StringFog.decrypt("jo9ElJ4=\n", "/eow4e4sYJM=\n"));
        if (jSONArrayOptJSONArray2 != null) {
            arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayList2.add(new C0766(jSONArrayOptJSONArray2.optJSONObject(i2)));
            }
        } else {
            arrayList2 = null;
        }
        this.f2044 = arrayList2 == null ? new ArrayList() : arrayList2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(StringFog.decrypt("7+zVz/o2\n", "ipqwoY5FeIk=\n"));
        if (jSONObjectOptJSONObject != null) {
            linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, new C1221(jSONObjectOptJSONObject.optJSONObject(next)));
            }
        } else {
            linkedHashMap = null;
        }
        this.f2043 = linkedHashMap == null ? new HashMap() : linkedHashMap;
        C1130[] c1130Arr = {null};
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(StringFog.decrypt("TgUYieDVlw==\n", "I2Bs4Y+x5NE=\n"));
        if (jSONObjectOptJSONObject2 != null) {
            linkedHashMap2 = new LinkedHashMap();
            Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                C1130 c1130 = new C1130(this, next2, jSONObjectOptJSONObject2.optJSONObject(next2), c1130Arr[0]);
                c1130Arr[0] = c1130;
                linkedHashMap2.put(next2, c1130);
            }
        }
        this.f2042 = linkedHashMap2 == null ? new HashMap() : linkedHashMap2;
    }
}
