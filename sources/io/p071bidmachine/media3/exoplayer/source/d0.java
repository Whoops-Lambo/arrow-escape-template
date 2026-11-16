package io.p071bidmachine.media3.exoplayer.source;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class d0 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.a.equals(d0Var.a) && this.b == d0Var.b && this.c == d0Var.c && this.d == d0Var.d && this.e == d0Var.e;
    }

    public final d0 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new d0(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public d0(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public d0(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public d0(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public d0(Object obj) {
        this(obj, -1L);
    }
}
