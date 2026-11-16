package com.inmobi.media;

import defpackage.s71;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.f3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4009f3 {
    public final int a;
    public final String b;
    public final Map c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4009f3)) {
            return false;
        }
        C4009f3 c4009f3 = (C4009f3) obj;
        return this.a == c4009f3.a && s71.b(this.b, c4009f3.b) && s71.b(this.c, c4009f3.c);
    }

    public C4009f3(int i, int i2, String str) {
        str = (i2 & 2) != 0 ? null : str;
        this.a = i;
        this.b = str;
        this.c = null;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "BusEvent(eventId=" + this.a + ", eventMessage=" + this.b + ", eventData=" + this.c + ")";
    }

    public C4009f3(int i, String str, Map map) {
        this.a = i;
        this.b = str;
        this.c = map;
    }
}
