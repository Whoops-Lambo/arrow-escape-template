package com.inmobi.media;

import defpackage.s71;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.v1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4452v1 {
    public final Map a;
    public final C4479w1 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4452v1)) {
            return false;
        }
        C4452v1 c4452v1 = (C4452v1) obj;
        return s71.b(this.a, c4452v1.a) && s71.b(this.b, c4452v1.b);
    }

    public final int hashCode() {
        Map map = this.a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        C4479w1 c4479w1 = this.b;
        return iHashCode + (c4479w1 != null ? c4479w1.hashCode() : 0);
    }

    public final String toString() {
        return "BannerLoadResolution(extras=" + this.a + ", adaptiveSize=" + this.b + ")";
    }

    public C4452v1(Map map, C4479w1 c4479w1) {
        this.a = map;
        this.b = c4479w1;
    }
}
