package com.adsurge.adn.p035k0;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class f {
    public final String a;
    public final int b;

    public Object a(Object obj) {
        int i;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) && (i = this.b) >= 0) {
            return ((JSONArray) obj).opt(i);
        }
        if (!(obj instanceof JSONObject) || TextUtils.isEmpty(this.a)) {
            return null;
        }
        return ((JSONObject) obj).opt(this.a);
    }

    public f(String str) {
        this.a = str;
        this.b = -1;
    }

    public f(int i) {
        this.a = null;
        this.b = i;
    }

    public String a() {
        return this.a;
    }
}
