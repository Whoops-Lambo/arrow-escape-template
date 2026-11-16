package io.p071bidmachine.media3.common;

import defpackage.d31;
import defpackage.y32;
import defpackage.z21;
import io.p071bidmachine.media3.common.util.x;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class y0 {
    public static final y0 b;
    public final d31 a;

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            d31 d31Var = this.a;
            if (i2 >= d31Var.size()) {
                return false;
            }
            x0 x0Var = (x0) d31Var.get(i2);
            for (boolean z : x0Var.e) {
                if (z) {
                    if (x0Var.b.c != i) {
                        break;
                    }
                    return true;
                }
            }
            i2++;
        }
    }

    static {
        z21 z21Var = d31.b;
        b = new y0(y32.e);
        x.G(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((y0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public y0(y32 y32Var) {
        this.a = d31.A(y32Var);
    }
}
