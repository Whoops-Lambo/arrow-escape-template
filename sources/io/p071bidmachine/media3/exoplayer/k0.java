package io.p071bidmachine.media3.exoplayer;

import com.ironsource.mediationsdk.logger.IronSourceError;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.exoplayer.source.d0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class k0 {
    public final d0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            if (this.b == k0Var.b && this.c == k0Var.c && this.d == k0Var.d && this.e == k0Var.e && this.f == k0Var.f && this.g == k0Var.g && this.h == k0Var.h && this.i == k0Var.i && this.j == k0Var.j && Objects.equals(this.a, k0Var.a)) {
                return true;
            }
        }
        return false;
    }

    public k0(d0 d0Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        a.c(!z5 || z3);
        a.c(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        a.c(z6);
        this.a = d0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
    }

    public final k0 a(long j) {
        if (j == this.c) {
            return this;
        }
        return new k0(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final k0 b(long j) {
        if (j == this.b) {
            return this;
        }
        return new k0(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
