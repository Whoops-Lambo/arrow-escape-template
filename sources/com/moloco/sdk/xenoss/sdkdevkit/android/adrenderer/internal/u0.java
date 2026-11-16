package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class u0 {
    public final Integer a;
    public final String b;
    public final v0 c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return s71.b(this.a, u0Var.a) && s71.b(this.b, u0Var.b) && s71.b(this.c, u0Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        v0 v0Var = this.c;
        return iHashCode2 + (v0Var != null ? v0Var.hashCode() : 0);
    }

    public final String toString() {
        return "DECAppIcon(size=" + this.a + ", appIconUri=" + this.b + ", border=" + this.c + ')';
    }

    public u0(Integer num, String str, v0 v0Var) {
        this.a = num;
        this.b = str;
        this.c = v0Var;
    }
}
