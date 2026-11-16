package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbai extends zzbag {
    public String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;

    @Override // com.google.android.gms.internal.ads.zzbag
    public final HashMap a() {
        HashMap map = new HashMap();
        map.put(0, this.a);
        map.put(4, this.e);
        map.put(3, this.d);
        map.put(2, this.c);
        map.put(1, Long.valueOf(this.b));
        return map;
    }

    public zzbai(String str) {
        String str2;
        String str3;
        String str4;
        this.a = "E";
        this.b = -1L;
        this.c = "E";
        this.d = "E";
        this.e = "E";
        HashMap mapB = zzbag.b(str);
        if (mapB != null) {
            if (mapB.get(0) == null) {
                str2 = "E";
            } else {
                str2 = (String) mapB.get(0);
            }
            this.a = str2;
            this.b = mapB.get(1) != null ? ((Long) mapB.get(1)).longValue() : -1L;
            if (mapB.get(2) == null) {
                str3 = "E";
            } else {
                str3 = (String) mapB.get(2);
            }
            this.c = str3;
            if (mapB.get(3) == null) {
                str4 = "E";
            } else {
                str4 = (String) mapB.get(3);
            }
            this.d = str4;
            this.e = mapB.get(4) != null ? (String) mapB.get(4) : "E";
        }
    }

    public zzbai() {
        this.a = "E";
        this.b = -1L;
        this.c = "E";
        this.d = "E";
        this.e = "E";
    }
}
