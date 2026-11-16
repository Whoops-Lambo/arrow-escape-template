package com.moloco.sdk.xenoss.sdkdevkit.android.core.services;

import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class g {
    public final float a;
    public final float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.a, gVar.a) == 0 && Float.compare(this.b, gVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Position(topLeftXDp=");
        sb.append(this.a);
        sb.append(", topLeftYDp=");
        return h50.k(sb, this.b, ')');
    }

    public g(float f, float f2) {
        this.a = f;
        this.b = f2;
    }
}
