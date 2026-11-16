package io.p071bidmachine.media3.exoplayer;

import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class c1 {
    public static final c1 c;
    public final long a;
    public final long b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (this.a == c1Var.a && this.b == c1Var.b) {
                return true;
            }
        }
        return false;
    }

    static {
        c1 c1Var = new c1(0L, 0L);
        new c1(Long.MAX_VALUE, Long.MAX_VALUE);
        new c1(Long.MAX_VALUE, 0L);
        new c1(0L, Long.MAX_VALUE);
        c = c1Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005d A[RETURN] */
    public final long a(long j, long j2, long j3) {
        long j4 = this.a;
        long j5 = this.b;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        int i = x.a;
        long j6 = j - j4;
        if (((j4 ^ j) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j5;
        if (((j5 ^ j7) & (j ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z = false;
        boolean z2 = j6 <= j2 && j2 <= j7;
        if (j6 <= j3 && j3 <= j7) {
            z = true;
        }
        if (z2 && z) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
            return j3;
        }
        if (!z2) {
            if (z) {
                return j3;
            }
            return j6;
        }
        return j2;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public c1(long j, long j2) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        a.c(z);
        a.c(j2 >= 0);
        this.a = j;
        this.b = j2;
    }
}
