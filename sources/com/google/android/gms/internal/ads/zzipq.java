package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzipq {
    public final List a;
    public final List b;

    public final void a(zzipo zzipoVar) {
        this.a.add(zzipoVar);
    }

    public final void b(zzipo zzipoVar) {
        this.b.add(zzipoVar);
    }

    public final zzipr c() {
        return new zzipr(this.a, this.b);
    }

    public zzipq(int i, int i2) {
        List arrayList;
        List arrayList2;
        if (i == 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(i);
        }
        this.a = arrayList;
        if (i2 == 0) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            arrayList2 = new ArrayList(i2);
        }
        this.b = arrayList2;
    }
}
