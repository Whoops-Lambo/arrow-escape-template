package io.p071bidmachine.media3.common;

import defpackage.d31;
import defpackage.dr0;
import io.p071bidmachine.media3.common.util.x;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class t0 {
    public final s0 a;
    public final d31 b;

    static {
        x.G(0);
        x.G(1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t0.class == obj.getClass()) {
            t0 t0Var = (t0) obj;
            if (this.a.equals(t0Var.a) && this.b.equals(t0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public t0(s0 s0Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= s0Var.a)) {
            dr0.b();
            throw null;
        }
        this.a = s0Var;
        this.b = d31.A(list);
    }
}
