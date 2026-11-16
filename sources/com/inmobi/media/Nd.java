package com.inmobi.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Nd {
    public final Md a;
    public final Ld b;

    public Nd(C4501wn c4501wn, C3951d0 c3951d0, Yj yj) {
        String str;
        String str2;
        c3951d0.getClass();
        yj.getClass();
        ArrayList arrayList = null;
        if (c4501wn != null) {
            str = c4501wn.a;
        } else {
            str = null;
        }
        if (c4501wn != null) {
            str2 = c4501wn.b;
        } else {
            str2 = null;
        }
        this.a = new Md(c3951d0, str, str2, 24);
        if (c4501wn != null) {
            ArrayList arrayList2 = c4501wn.d;
            arrayList = new ArrayList();
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                String str3 = ((C4493wf) obj).b;
                str3.getClass();
                if (str3.equals("Impression")) {
                    arrayList.add(obj);
                }
            }
        }
        this.b = new Ld(this.a, new Pd(yj, arrayList));
    }

    public final void a(short s, List list) {
        list.getClass();
        Map mapSingletonMap = Collections.singletonMap("[EVENTTYPE]", String.valueOf((int) s));
        mapSingletonMap.getClass();
        this.b.c.a(new Tq(mapSingletonMap, list));
    }
}
