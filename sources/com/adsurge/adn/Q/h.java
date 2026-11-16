package com.adsurge.adn.Q;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class h {
    public String b;
    public JSONObject a = new JSONObject();
    public int c = -1;
    public int d = -1;
    public int e = -1;

    public i a() {
        i iVar = new i(this.a);
        if (!TextUtils.isEmpty(this.b)) {
            iVar.b(this.b);
        }
        int i = this.c;
        if (i >= 0) {
            iVar.d = i;
        } else {
            iVar.d = TextUtils.isEmpty(iVar.e()) ? 4 : 1;
        }
        int i2 = this.d;
        if (i2 >= 0) {
            iVar.b(i2);
        }
        int i3 = this.e;
        if (i3 >= 0) {
            iVar.e = i3;
        }
        return iVar;
    }

    public h b(int i) {
        this.c = i;
        return this;
    }

    public h c(int i) {
        this.d = i;
        return this;
    }

    public h a(String str) {
        this.b = str;
        return this;
    }

    public h a(int i) {
        this.e = i;
        return this;
    }

    public h a(JSONObject jSONObject) {
        this.a = jSONObject;
        return this;
    }
}
