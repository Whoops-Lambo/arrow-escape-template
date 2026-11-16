package com.adsurge.adn.Y0;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public final int a;
    public final JSONObject b = new JSONObject();
    public c c;
    public d d;
    public long e;

    public abstract String b();

    public JSONObject c() {
        return this.b;
    }

    public String toString() {
        return this.b.toString();
    }

    public b(int i) {
        this.a = i;
        a(b(), Integer.valueOf(i));
    }

    public void a(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            try {
                this.b.put(str, obj);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void a(d dVar) {
        if (dVar != null) {
            this.d = dVar;
            a("ext", dVar.toString());
        }
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.c = cVar;
            a("biz", cVar.c());
        }
    }

    public void a(int i) {
        a("seq", Integer.valueOf(i));
    }

    public void a(long j) {
        this.e = j;
        a("ts", Long.valueOf(j));
    }

    public int a() {
        return this.a;
    }

    public void a(com.adsurge.adn.E0.c cVar) {
        if (cVar != null) {
            a("ct", Integer.valueOf(cVar.b()));
        }
    }
}
