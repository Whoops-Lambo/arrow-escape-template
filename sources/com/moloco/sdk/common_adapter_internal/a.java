package com.moloco.sdk.common_adapter_internal;

import defpackage.h50;
import defpackage.jc1;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final int e;
    public final float f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0 && this.e == aVar.e && Float.compare(this.f, aVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + jc1.d(this.e, n30.b(this.d, n30.b(this.c, jc1.d(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenData(widthPx=");
        sb.append(this.a);
        sb.append(", heightPx=");
        sb.append(this.b);
        sb.append(", widthDp=");
        sb.append(this.c);
        sb.append(", heightDp=");
        sb.append(this.d);
        sb.append(", dpi=");
        sb.append(this.e);
        sb.append(", pxRatio=");
        return h50.k(sb, this.f, ')');
    }

    public a(float f, int i, int i2, float f2, float f3, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i3;
        this.f = f3;
    }
}
