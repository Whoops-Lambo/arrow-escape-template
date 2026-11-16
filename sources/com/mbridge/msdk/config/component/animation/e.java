package com.mbridge.msdk.config.component.animation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class e {
    private String a;
    private Map<String, Object> b;
    private List<e> c;

    public void a(String str, Object obj) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.put(str, obj);
    }

    public Map<String, Object> b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public e(String str) {
        this.a = "";
        this.b = new HashMap();
        this.c = new ArrayList();
        this.a = str;
    }

    public List<e> a() {
        return this.c;
    }

    public void a(List<e> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.c = list;
    }

    public void a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        this.b = map;
    }

    public e() {
        this.a = "";
        this.b = new HashMap();
        this.c = new ArrayList();
    }
}
