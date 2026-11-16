package com.adsurge.adn.oversea_ad;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Chamaeleon extends UrsaMinor implements Cloneable {
    public static final HashMap h;
    public static final HashMap i;
    public static final HashMap j;
    public static final /* synthetic */ boolean k = true;
    public long a = 0;
    public boolean b = true;
    public long c = 0;
    public Map d = null;
    public Map e = null;
    public long f = 0;
    public Map g = null;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Chamaeleon chamaeleon = (Chamaeleon) obj;
        long j2 = this.a;
        long j3 = chamaeleon.a;
        int i2 = Vulpecula.a;
        return j2 == j3 && this.b == chamaeleon.b && this.c == chamaeleon.c && this.d.equals(chamaeleon.d) && this.e.equals(chamaeleon.e) && this.f == chamaeleon.f && this.g.equals(chamaeleon.g);
    }

    static {
        HashMap map = new HashMap();
        h = map;
        map.put("", "");
        HashMap map2 = new HashMap();
        i = map2;
        map2.put(0, 0);
        HashMap map3 = new HashMap();
        j = map3;
        map3.put("", "");
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(Triangulum triangulum) {
        this.a = triangulum.a(this.a, 0, true);
        this.b = triangulum.a(this.b, 1, true);
        this.c = triangulum.a(this.c, 2, true);
        this.d = (Map) triangulum.a((Object) h, 3, true);
        this.e = (Map) triangulum.a((Object) i, 4, true);
        this.f = triangulum.a(this.f, 5, true);
        this.g = (Map) triangulum.a((Object) j, 6, false);
    }

    public final int hashCode() {
        try {
            throw new Exception("");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (k) {
                return null;
            }
            io.p071bidmachine.media3.extractor.ts.y.o();
            return null;
        }
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(UrsaMajor ursaMajor) {
        ursaMajor.a(0, this.a);
        ursaMajor.a(this.b ? (byte) 1 : (byte) 0, 1);
        ursaMajor.a(2, this.c);
        ursaMajor.a(this.d, 3);
        ursaMajor.a(this.e, 4);
        ursaMajor.a(5, this.f);
        Map map = this.g;
        if (map != null) {
            ursaMajor.a(map, 6);
        }
    }
}
