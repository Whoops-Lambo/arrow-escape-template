package io.p071bidmachine.ads.networks.gam;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class l {
    public final String a;
    public final float b;
    public final float c;
    public final HashMap d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.a.equals(lVar.a) && Float.compare(lVar.b, this.b) == 0 && Float.compare(lVar.c, this.c) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) + ((Float.floatToIntBits(this.b) + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "adUnitId - " + this.a + ", score - " + this.b + ", price - " + this.c;
    }

    public l(String str, float f, float f2, HashMap map) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = map;
    }
}
