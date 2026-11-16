package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import defpackage.pv1;
import defpackage.s71;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class v0 {
    public final Integer a;
    public final List b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return s71.b(this.a, v0Var.a) && this.b.equals(v0Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DECBorder(borderWidth=");
        sb.append(this.a);
        sb.append(", gradient=");
        return pv1.q(sb, this.b, ')');
    }

    public v0(Integer num, List list) {
        this.a = num;
        this.b = list;
    }
}
