package com.inmobi.media;

import defpackage.s71;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.f7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4013f7 {
    public final float a;
    public final C4041g7 b;
    public final ArrayList c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4013f7)) {
            return false;
        }
        C4013f7 c4013f7 = (C4013f7) obj;
        return Float.compare(this.a, c4013f7.a) == 0 && s71.b(this.b, c4013f7.b) && s71.b(this.c, c4013f7.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        C4041g7 c4041g7 = this.b;
        int iHashCode2 = (iHashCode + (c4041g7 == null ? 0 : c4041g7.hashCode())) * 31;
        ArrayList arrayList = this.c;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "ExposureMetrics(exposedPercentage=" + this.a + ", visibleRectangle=" + this.b + ", occlusionRectangles=" + this.c + ")";
    }

    public C4013f7(float f, C4041g7 c4041g7, ArrayList arrayList) {
        this.a = f;
        this.b = c4041g7;
        this.c = arrayList;
    }
}
