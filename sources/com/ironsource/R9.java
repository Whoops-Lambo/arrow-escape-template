package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class R9 {
    private final boolean a;
    private String b;
    private String c;
    private boolean d;
    private C4794i8 e;
    private Map<String, String> f;
    private Oc g;
    private String h;
    private boolean i;
    private boolean j;

    public Map<String, String> a() {
        HashMap map = new HashMap();
        map.put("instanceId", this.b);
        map.put("instanceName", this.c);
        map.put("rewarded", Boolean.toString(this.a));
        map.put("inAppBidding", Boolean.toString(this.d));
        map.put("isOneFlow", Boolean.toString(this.i));
        map.put(C4664b4.s, String.valueOf(2));
        C4794i8 c4794i8 = this.e;
        map.put("width", c4794i8 != null ? Integer.toString(c4794i8.c()) : "0");
        C4794i8 c4794i9 = this.e;
        map.put("height", c4794i9 != null ? Integer.toString(c4794i9.a()) : "0");
        C4794i8 c4794i10 = this.e;
        map.put("label", c4794i10 != null ? c4794i10.b() : "");
        map.put(C4664b4.w, Boolean.toString(i()));
        if (this.j) {
            map.put("isMultipleAdObjects", "true");
        }
        String str = this.h;
        if (str != null) {
            map.put("adUnitId", str);
        }
        Map<String, String> map2 = this.f;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public final Oc b() {
        return this.g;
    }

    public String c() {
        return this.h;
    }

    public Map<String, String> d() {
        return this.f;
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.c.replaceAll("IronSource_", "");
    }

    public String g() {
        return this.c;
    }

    public C4794i8 h() {
        return this.e;
    }

    public boolean j() {
        return this.d;
    }

    public boolean l() {
        return this.j;
    }

    public boolean m() {
        return this.i;
    }

    public boolean n() {
        return this.a;
    }

    public R9(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, Map<String, String> map, Oc oc, C4794i8 c4794i8) {
        this.b = str;
        this.c = str2;
        this.a = z;
        this.d = z2;
        this.f = map;
        this.g = oc;
        this.e = c4794i8;
        this.i = z3;
        this.j = z4;
        this.h = str3;
    }

    public boolean i() {
        if (h() != null && h().d()) {
            return true;
        }
        return false;
    }

    public boolean k() {
        if (!j() && !m()) {
            return false;
        }
        return true;
    }

    public void a(Oc oc) {
        this.g = oc;
    }

    public void a(String str) {
        this.h = str;
    }
}
