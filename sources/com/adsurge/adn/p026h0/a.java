package com.adsurge.adn.p026h0;

import com.adsurge.adn.p011c0.b;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static final String q = null;
    public final int a;
    public final String b;
    public final JSONArray c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final JSONArray j;
    public final int k;
    public final int l;
    public final int m;
    public final String n;
    public JSONArray o;
    public final JSONObject p;

    /* JADX INFO: renamed from: com.adsurge.adn.h0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0114a {
        public int a;
        public String b;
        public JSONArray c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h = 1;
        public int i;
        public JSONArray j;
        public JSONObject k;

        public a a() {
            return new a(this);
        }
    }

    public JSONArray a() {
        JSONArray jSONArray = this.o;
        return jSONArray != null ? jSONArray : this.c;
    }

    public JSONObject b() {
        return this.p;
    }

    public String c() {
        return this.n;
    }

    public final boolean d() {
        return this.h == 1;
    }

    public final boolean e() {
        return this.h == 2;
    }

    public a(C0114a c0114a) {
        int i;
        this.a = c0114a.a;
        this.b = c0114a.b;
        JSONArray jSONArray = c0114a.c;
        this.c = jSONArray;
        if (jSONArray != null) {
            this.n = jSONArray.toString();
        } else {
            this.n = null;
        }
        if (com.adsurge.adn.J0.a.a) {
            float fB = b.e().a().b();
            this.d = (int) (c0114a.d * fB);
            this.e = (int) (c0114a.e * fB);
            this.f = (int) (fB * c0114a.f);
        } else {
            this.d = c0114a.d;
            this.e = c0114a.e;
            this.f = c0114a.f;
        }
        int i2 = c0114a.g;
        this.g = i2;
        this.h = c0114a.h;
        this.i = c0114a.i;
        this.j = c0114a.j;
        this.p = c0114a.k;
        if (i2 < 0) {
            i = -1;
        } else {
            int i3 = this.d;
            int i4 = this.e;
            i = i3 + i4 + ((this.f + i4) * i2);
        }
        this.k = i;
        int i5 = this.d;
        int i6 = this.e;
        this.l = i5 + i6;
        this.m = this.f + i6;
    }

    public void a(JSONArray jSONArray) {
        this.o = jSONArray;
    }
}
