package com.inmobi.media;

import defpackage.s71;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Gm {
    public final String a;
    public final Map b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gm)) {
            return false;
        }
        Gm gm = (Gm) obj;
        return s71.b(this.a, gm.a) && s71.b(this.b, gm.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map map = this.b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "TokenMetaData(keywords=" + this.a + ", extras=" + this.b + ")";
    }

    public Gm(String str, Map map) {
        this.a = str;
        this.b = map;
    }
}
