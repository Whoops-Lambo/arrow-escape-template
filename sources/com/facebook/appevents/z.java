package com.facebook.appevents;

import defpackage.lz;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class z implements Serializable {
    public final HashMap a;

    private final Object writeReplace() throws ObjectStreamException {
        if (lz.a.contains(this)) {
            return null;
        }
        try {
            return new y(this.a);
        } catch (Throwable th) {
            lz.a(this, th);
            return null;
        }
    }

    public final void a(b bVar, List list) {
        HashMap map = this.a;
        if (lz.a.contains(this)) {
            return;
        }
        try {
            list.getClass();
            if (!map.containsKey(bVar)) {
                map.put(bVar, new ArrayList(list));
                return;
            }
            List list2 = (List) map.get(bVar);
            if (list2 != null) {
                list2.addAll(list);
            }
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    public z(HashMap map) {
        map.getClass();
        HashMap map2 = new HashMap();
        this.a = map2;
        map2.putAll(map);
    }

    public z() {
        this.a = new HashMap();
    }
}
