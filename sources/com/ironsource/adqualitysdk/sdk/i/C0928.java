package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᖬ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0928 extends AbstractC0945 {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static final String f2504 = StringFog.decrypt("NcCZ\n", "RrTqRjOHtug=\n");

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2503 = StringFog.decrypt("9uQ=\n", "gpfh0v1C/EM=\n");

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static final String f2502 = StringFog.decrypt("pEw=\n", "0TiuRGeoqCs=\n");

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static final String f2501 = StringFog.decrypt("iwVqoQ==\n", "5mgL11lZUCg=\n");

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final int f2507 = 120000;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String f2506 = StringFog.decrypt("F8SkpoOAnQ==\n", "Z7bL0uzu7lE=\n");

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String f2505 = StringFog.decrypt("Sx3rLMUtOWJd\n", "LnGOT7FfVgw=\n");

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final String m694() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(StringFog.decrypt("cf1W\n", "BI86S8qYGlQ=\n"));
        return jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString(StringFog.decrypt("gQ==\n", "5B0x+/273qo=\n"), this.f2505) : this.f2505;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final long m695() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject.optLong(f2502, 0L);
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final long m696() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject.optLong(f2503, 0L);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final int m698() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject.optInt(StringFog.decrypt("lTiJ\n", "+F35FdKCfvI=\n"), 40);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m701() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject.optInt(StringFog.decrypt("WBnHe8T/gw==\n", "PHCmHKmJ8OA=\n"), 1000000);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final HashMap m699() {
        JSONObject jSONObject;
        HashMap map = new HashMap();
        synchronized (this) {
            jSONObject = this.f2544;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(StringFog.decrypt("yB7MvA==\n", "rmqlyDla3Ng=\n"));
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                int iOptInt = jSONObjectOptJSONObject.optInt(next, -1);
                if (iOptInt >= 0) {
                    map.put(next, Integer.valueOf(iOptInt));
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List m700() {
        JSONObject jSONObject;
        C1127 c1127 = this.f2543;
        JSONObject jSONObject2 = c1127.f3271;
        String str = c1127.f3272;
        List arrayList = new ArrayList();
        String str2 = AbstractC1125.f3265;
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            arrayList = AbstractC1125.m831(jSONArrayOptJSONArray);
        }
        synchronized (this) {
            jSONObject = this.f2544;
        }
        String strDecrypt = StringFog.decrypt("UC/4\n", "NVuAVTHzoak=\n");
        List arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(strDecrypt);
        if (jSONArrayOptJSONArray2 != null) {
            arrayList2 = AbstractC1125.m831(jSONArrayOptJSONArray2);
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public C0928(C1127 c1127) {
        this.f2543 = c1127;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final int m697() {
        JSONObject jSONObject;
        if (((C1082) AbstractC1081.m765()).f3120) {
            synchronized (this) {
                jSONObject = this.f2544;
            }
            if (jSONObject.optBoolean(StringFog.decrypt("dTKIrw==\n", "EVvpyMoH4hI=\n"), false)) {
                return m701();
            }
        }
        return m705().optInt(StringFog.decrypt("0Xdu\n", "vAEdoXw8vXc=\n"), 9850);
    }
}
