package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.pv1;
import defpackage.s71;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class f {
    public final List a;
    public final List b;
    public final List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a) && s71.b(this.b, fVar.b) && this.c.equals(fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + pv1.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatedWrapperChainAdData(impressions=");
        sb.append(this.a);
        sb.append(", errorUrls=");
        sb.append(this.b);
        sb.append(", creativesPerWrapper=");
        return pv1.q(sb, this.c, ')');
    }

    public f(List list, List list2, List list3) {
        list2.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
    }
}
