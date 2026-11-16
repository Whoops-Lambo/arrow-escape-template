package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbct extends zzbag {
    public final Long a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Long k;

    @Override // com.google.android.gms.internal.ads.zzbag
    public final HashMap a() {
        HashMap map = new HashMap();
        map.put(0, this.a);
        map.put(1, this.b);
        map.put(2, this.c);
        map.put(3, this.d);
        map.put(4, this.e);
        map.put(5, this.f);
        map.put(6, this.g);
        map.put(7, this.h);
        map.put(8, this.i);
        map.put(9, this.j);
        map.put(10, this.k);
        return map;
    }

    public zzbct(String str) {
        HashMap mapB = zzbag.b(str);
        if (mapB != null) {
            this.a = (Long) mapB.get(0);
            this.b = (Long) mapB.get(1);
            this.c = (Long) mapB.get(2);
            this.d = (Long) mapB.get(3);
            this.e = (Long) mapB.get(4);
            this.f = (Long) mapB.get(5);
            this.g = (Long) mapB.get(6);
            this.h = (Long) mapB.get(7);
            this.i = (Long) mapB.get(8);
            this.j = (Long) mapB.get(9);
            this.k = (Long) mapB.get(10);
        }
    }

    public zzbct() {
    }
}
