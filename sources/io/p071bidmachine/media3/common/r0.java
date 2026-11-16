package io.p071bidmachine.media3.common;

import android.util.Pair;
import com.vungle.ads.internal.protos.Sdk;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class r0 {
    public static final o0 a = new o0();

    public abstract int b(Object obj);

    public final int d(int i, p0 p0Var, q0 q0Var, int i2, boolean z) {
        int i3 = f(i, p0Var, false).c;
        if (m(i3, q0Var, 0L).n != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return m(iE, q0Var, 0L).m;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        y.b();
        return 0;
    }

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof r0) {
                r0 r0Var = (r0) obj;
                if (r0Var.o() == o() && r0Var.h() == h()) {
                    q0 q0Var = new q0();
                    p0 p0Var = new p0();
                    q0 q0Var2 = new q0();
                    p0 p0Var2 = new p0();
                    for (int i = 0; i < o(); i++) {
                        if (m(i, q0Var, 0L).equals(r0Var.m(i, q0Var2, 0L))) {
                        }
                    }
                    for (int i2 = 0; i2 < h(); i2++) {
                        if (f(i2, p0Var, true).equals(r0Var.f(i2, p0Var2, true))) {
                        }
                    }
                    int iA = a(true);
                    if (iA == r0Var.a(true) && (iC = c(true)) == r0Var.c(true)) {
                        while (iA != iC) {
                            int iE = e(iA, 0, true);
                            if (iE == r0Var.e(iA, 0, true)) {
                                iA = iE;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract p0 f(int i, p0 p0Var, boolean z);

    public abstract int h();

    public int k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        y.b();
        return 0;
    }

    public abstract Object l(int i);

    public abstract q0 m(int i, q0 q0Var, long j);

    public abstract int o();

    static {
        x.G(0);
        x.G(1);
        x.G(2);
    }

    public int hashCode() {
        q0 q0Var = new q0();
        p0 p0Var = new p0();
        int iO = o() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        for (int i = 0; i < o(); i++) {
            iO = (iO * 31) + m(i, q0Var, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            iH = (iH * 31) + f(i2, p0Var, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(q0 q0Var, p0 p0Var, int i, long j) {
        Pair pairJ = j(q0Var, p0Var, i, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final void n(int i, q0 q0Var) {
        m(i, q0Var, 0L);
    }

    public int a(boolean z) {
        if (p()) {
            return -1;
        }
        return 0;
    }

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public p0 g(Object obj, p0 p0Var) {
        return f(b(obj), p0Var, true);
    }

    public final Pair j(q0 q0Var, p0 p0Var, int i, long j, long j2) {
        a.f(i, o());
        m(i, q0Var, j2);
        if (j == -9223372036854775807L) {
            j = q0Var.k;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = q0Var.m;
        f(i2, p0Var, false);
        while (i2 < q0Var.n && p0Var.e != j) {
            int i3 = i2 + 1;
            if (f(i3, p0Var, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, p0Var, true);
        long jMin = j - p0Var.e;
        long j3 = p0Var.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = p0Var.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public final boolean p() {
        if (o() == 0) {
            return true;
        }
        return false;
    }
}
