package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class z3 {
    private final List a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface a {
        void a(c3 c3Var);
    }

    public void a(c3 c3Var) {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((a) obj).a(c3Var);
        }
    }

    public void b(a aVar) {
        this.a.remove(aVar);
    }

    public void a(a aVar) {
        this.a.add(aVar);
    }
}
