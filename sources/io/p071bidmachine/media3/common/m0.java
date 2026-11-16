package io.p071bidmachine.media3.common;

import com.explorestack.protobuf.z;
import io.p071bidmachine.media3.common.util.x;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class m0 {
    public final Object a;
    public final int b;
    public final y c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        z.p(0, 1, 2, 3, 4);
        x.G(5);
        x.G(6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.class == obj.getClass()) {
            m0 m0Var = (m0) obj;
            if (this.b == m0Var.b && this.e == m0Var.e && this.f == m0Var.f && this.g == m0Var.g && this.h == m0Var.h && this.i == m0Var.i && Objects.equals(this.c, m0Var.c) && Objects.equals(this.a, m0Var.a) && Objects.equals(this.d, m0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    public m0(Object obj, int i, y yVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = yVar;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }
}
