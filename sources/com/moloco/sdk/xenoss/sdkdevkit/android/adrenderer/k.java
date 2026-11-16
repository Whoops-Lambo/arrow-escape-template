package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import defpackage.h50;
import defpackage.jc1;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class k {
    public final boolean a;
    public final float b;
    public final int c;
    public final int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && Float.compare(this.b, kVar.b) == 0 && this.c == kVar.c && this.d == kVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + jc1.d(this.c, n30.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdaptiveBlurConfig(enabled=");
        sb.append(this.a);
        sb.append(", gapThresholdFraction=");
        sb.append(this.b);
        sb.append(", creativeWidthPx=");
        sb.append(this.c);
        sb.append(", creativeHeightPx=");
        return h50.l(sb, this.d, ')');
    }

    public k(boolean z, int i, float f, int i2) {
        this.a = z;
        this.b = f;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ k() {
        this(false, 0, 0.1f, 0);
    }
}
