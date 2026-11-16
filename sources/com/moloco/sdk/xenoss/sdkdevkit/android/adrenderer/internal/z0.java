package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class z0 {
    public final Integer a;
    public final w0 b;
    public final u0 c;
    public final y0 d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return s71.b(this.a, z0Var.a) && s71.b(this.b, z0Var.b) && s71.b(this.c, z0Var.c) && s71.b(this.d, z0Var.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        w0 w0Var = this.b;
        int iHashCode2 = (iHashCode + (w0Var == null ? 0 : w0Var.hashCode())) * 31;
        u0 u0Var = this.c;
        int iHashCode3 = (iHashCode2 + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        y0 y0Var = this.d;
        return iHashCode3 + (y0Var != null ? y0Var.hashCode() : 0);
    }

    public final String toString() {
        return "DECRenderingData(appNameFontSize=" + this.a + ", decCTA=" + this.b + ", decAppIcon=" + this.c + ", decRating=" + this.d + ')';
    }

    public z0(Integer num, w0 w0Var, u0 u0Var, y0 y0Var) {
        this.a = num;
        this.b = w0Var;
        this.c = u0Var;
        this.d = y0Var;
    }
}
