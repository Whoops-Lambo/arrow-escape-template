package com.applovin.mediation;

import com.applovin.impl.sdk.p;
import defpackage.pv1;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class MaxSegment {
    private final int a;
    private final List b;

    private void a(int i) {
        if (i >= 0) {
            return;
        }
        p.h("MaxSegment", "Please ensure that the segment value entered is a non-negative number in the range of [0, 2147483647]: " + i);
    }

    public int getKey() {
        return this.a;
    }

    public List<Integer> getValues() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MaxSegment{key=");
        sb.append(this.a);
        sb.append(", values=");
        return pv1.q(sb, this.b, '}');
    }

    public MaxSegment(int i, List<Integer> list) {
        this.a = i;
        this.b = list;
        a(i);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            a(it.next().intValue());
        }
    }
}
