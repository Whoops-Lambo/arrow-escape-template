package com.adsurge.adn.p044n0;

import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class i {
    public final JSONArray a;
    public int b;
    public final int c;

    public static boolean a(int i) {
        return i == 1 || i == 2;
    }

    public JSONArray b() {
        return this.a;
    }

    public int c() {
        return this.c;
    }

    public i(int i, int i2, JSONArray jSONArray) {
        this.c = i2;
        this.a = jSONArray;
        if (jSONArray != null && jSONArray.length() > 0) {
            this.b = 2;
        } else {
            this.b = i;
        }
    }

    public void b(int i) {
        this.b = i;
    }

    public int a() {
        return this.b;
    }
}
