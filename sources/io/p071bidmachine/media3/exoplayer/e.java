package io.p071bidmachine.media3.exoplayer;

import com.facebook.internal.j0;
import io.p071bidmachine.media3.common.m;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.common.r0;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.s;
import io.p071bidmachine.media3.exoplayer.analytics.j;
import io.p071bidmachine.media3.exoplayer.source.b1;
import io.p071bidmachine.media3.exoplayer.source.d0;
import io.p071bidmachine.media3.exoplayer.trackselection.o;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class e implements w0 {
    public final int b;
    public a1 d;
    public int e;
    public j f;
    public s g;
    public int h;
    public b1 i;
    public n[] j;
    public long k;
    public long l;
    public boolean n;
    public boolean o;
    public o q;
    public final Object a = new Object();
    public final j0 c = new j0(24);
    public long m = Long.MIN_VALUE;
    public r0 p = r0.a;

    public static int b(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    public void d() {
    }

    public i0 e() {
        return null;
    }

    public abstract String f();

    public abstract boolean h();

    @Override // io.p071bidmachine.media3.exoplayer.w0
    public void handleMessage(int i, Object obj) {
    }

    public abstract boolean j();

    public abstract void k();

    public void l(boolean z, boolean z2) {
    }

    public abstract void m(long j, boolean z);

    public void n() {
    }

    public void o() {
    }

    public void p() {
    }

    public void q() {
    }

    public void r(n[] nVarArr, long j, long j2, d0 d0Var) {
    }

    public abstract void t(long j, long j2);

    public void v(float f, float f2) {
    }

    public abstract int w(n nVar);

    public int x() {
        return 0;
    }

    public static boolean i(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public final m c(Exception exc, n nVar, boolean z, int i) {
        int iW;
        if (nVar == null || this.o) {
            iW = 4;
        } else {
            this.o = true;
            try {
                iW = w(nVar) & 7;
                this.o = false;
            } catch (m unused) {
                this.o = false;
                iW = 4;
            } catch (Throwable th) {
                this.o = false;
                throw th;
            }
        }
        return m.b(exc, f(), this.e, nVar, iW, z, i);
    }

    public final boolean g() {
        return this.m == Long.MIN_VALUE;
    }

    public final int s(j0 j0Var, io.p071bidmachine.media3.decoder.e eVar, int i) {
        b1 b1Var = this.i;
        b1Var.getClass();
        int iG = b1Var.g(j0Var, eVar, i);
        if (iG == -4) {
            if (eVar.d(4)) {
                this.m = Long.MIN_VALUE;
                return this.n ? -4 : -3;
            }
            long j = eVar.g + this.k;
            eVar.g = j;
            this.m = Math.max(this.m, j);
            return iG;
        }
        if (iG == -5) {
            n nVar = (n) j0Var.b;
            nVar.getClass();
            long j2 = nVar.s;
            if (j2 != Long.MAX_VALUE) {
                m mVarA = nVar.a();
                mVarA.r = j2 + this.k;
                j0Var.b = new n(mVarA);
            }
        }
        return iG;
    }

    public final void u(n[] nVarArr, b1 b1Var, long j, long j2, d0 d0Var) {
        a.i(!this.n);
        this.i = b1Var;
        if (this.m == Long.MIN_VALUE) {
            this.m = j;
        }
        this.j = nVarArr;
        this.k = j2;
        r(nVarArr, j, j2, d0Var);
    }

    public e(int i) {
        this.b = i;
    }
}
