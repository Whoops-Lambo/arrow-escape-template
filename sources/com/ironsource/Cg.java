package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class Cg {
    private int b = 4;
    private int c = 4;
    private HashMap<String, Boolean> a = new a();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends HashMap<String, Boolean> {
        public a() {
            put(C4811j8.k, Boolean.valueOf(Cg.this.b == 0));
            put(C4811j8.l, Boolean.valueOf(Cg.this.c == 0));
            Boolean bool = Boolean.FALSE;
            put(C4811j8.m, bool);
            put(C4811j8.n, bool);
        }
    }

    public void a(String str, int i, boolean z) {
        boolean z2 = false;
        if (this.a.containsKey(str)) {
            this.a.put(str, Boolean.valueOf(i == 0));
        }
        this.a.put(C4811j8.m, Boolean.valueOf(z));
        if ((this.a.get(C4811j8.l).booleanValue() || this.a.get(C4811j8.k).booleanValue()) && this.a.get(C4811j8.m).booleanValue()) {
            z2 = true;
        }
        this.a.put(C4811j8.n, Boolean.valueOf(z2));
    }

    public JSONObject a() {
        return new JSONObject(this.a);
    }
}
