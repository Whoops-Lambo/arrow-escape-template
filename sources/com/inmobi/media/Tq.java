package com.inmobi.media;

import defpackage.gg0;
import defpackage.hg0;
import defpackage.s71;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Tq extends Z2 {
    public final Map a;
    public final List b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tq)) {
            return false;
        }
        Tq tq = (Tq) obj;
        return s71.b(this.a, tq.a) && s71.b(this.b, tq.b);
    }

    public /* synthetic */ Tq(Map map, ArrayList arrayList, int i) {
        this((i & 1) != 0 ? hg0.a : map, (i & 2) != 0 ? gg0.a : arrayList);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WithExtras(macros=" + this.a + ", trackers=" + this.b + ")";
    }

    public Tq(Map map, List list) {
        map.getClass();
        list.getClass();
        this.a = map;
        this.b = list;
    }
}
