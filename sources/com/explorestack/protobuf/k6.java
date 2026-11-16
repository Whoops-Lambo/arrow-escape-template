package com.explorestack.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class k6 {
    public volatile boolean a;
    public volatile int b;
    public j6 c;
    public ArrayList d;
    public final z5 e;

    public static k6 e(d6 d6Var) {
        return new k6(d6Var, Collections.EMPTY_MAP);
    }

    public static k6 l(d6 d6Var) {
        return new k6(d6Var, new LinkedHashMap());
    }

    public final void a() {
        this.c = new j6(this, new LinkedHashMap());
        this.b = 1;
    }

    public final j6 b(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            this.e.getClass();
            d6 d6Var = (d6) ((Message) obj);
            linkedHashMap.put(d6Var.a, d6Var.b);
        }
        return new j6(this, linkedHashMap);
    }

    public final ArrayList c(j6 j6Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((i6) j6Var.entrySet()).iterator();
        while (true) {
            Iterator it2 = ((h6) it).b;
            if (!it2.hasNext()) {
                return arrayList;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            a6 a6VarNewBuilderForType = ((d6) this.e.b).newBuilderForType();
            a6VarNewBuilderForType.b = key;
            a6VarNewBuilderForType.d = true;
            a6VarNewBuilderForType.c = value;
            a6VarNewBuilderForType.e = true;
            arrayList.add(new d6(a6VarNewBuilderForType.a, key, value));
        }
    }

    public final k6 d() {
        return new k6(this.e, l6.c(h()));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k6) {
            return l6.g(h(), ((k6) obj).h());
        }
        return false;
    }

    public final void f() {
        if (this.a) {
            return;
        }
        defpackage.d.c();
    }

    public final List g() {
        if (this.b == 1) {
            synchronized (this) {
                try {
                    if (this.b == 1) {
                        this.d = c(this.c);
                        this.b = 3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Collections.unmodifiableList(this.d);
    }

    public final Map h() {
        if (this.b == 2) {
            synchronized (this) {
                try {
                    if (this.b == 2) {
                        this.c = b(this.d);
                        this.b = 3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Collections.unmodifiableMap(this.c);
    }

    public final List i() {
        if (this.b != 2) {
            if (this.b == 1) {
                this.d = c(this.c);
            }
            this.c = null;
            this.b = 2;
        }
        return this.d;
    }

    public final j6 j() {
        if (this.b != 1) {
            if (this.b == 2) {
                this.c = b(this.d);
            }
            this.d = null;
            this.b = 1;
        }
        return this.c;
    }

    public k6(z5 z5Var, Map map) {
        this.e = z5Var;
        this.a = true;
        this.b = 1;
        this.c = new j6(this, map);
        this.d = null;
    }

    public final int hashCode() {
        return l6.a(h());
    }

    public final void k(k6 k6Var) {
        j().putAll(l6.c(k6Var.h()));
    }

    public k6(d6 d6Var, Map map) {
        this(new z5(d6Var, 1), map);
    }
}
