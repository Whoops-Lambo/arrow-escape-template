package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbci extends zzbag {
    public final Long a;
    public final Boolean b;
    public final Boolean c;

    @Override // com.google.android.gms.internal.ads.zzbag
    public final HashMap a() {
        HashMap map = new HashMap();
        map.put(0, this.a);
        map.put(1, this.b);
        map.put(2, this.c);
        return map;
    }

    public zzbci(String str) {
        HashMap mapB = zzbag.b(str);
        if (mapB != null) {
            this.a = (Long) mapB.get(0);
            this.b = (Boolean) mapB.get(1);
            this.c = (Boolean) mapB.get(2);
        }
    }

    public zzbci() {
    }
}
