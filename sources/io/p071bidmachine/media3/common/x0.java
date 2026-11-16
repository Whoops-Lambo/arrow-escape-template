package io.p071bidmachine.media3.common;

import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class x0 {
    public final int a;
    public final s0 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        x.G(0);
        x.G(1);
        x.G(3);
        x.G(4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x0.class == obj.getClass()) {
            x0 x0Var = (x0) obj;
            if (this.c == x0Var.c && this.b.equals(x0Var.b) && Arrays.equals(this.d, x0Var.d) && Arrays.equals(this.e, x0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(int i) {
        return this.d[i] == 4;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }

    public x0(s0 s0Var, boolean z, int[] iArr, boolean[] zArr) {
        boolean z2;
        int i = s0Var.a;
        this.a = i;
        boolean z3 = false;
        if (i == iArr.length && i == zArr.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        a.c(z2);
        this.b = s0Var;
        if (z && i > 1) {
            z3 = true;
        }
        this.c = z3;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }
}
