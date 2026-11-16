package io.p071bidmachine.media3.extractor.avi;

import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.extractor.a0;
import io.p071bidmachine.media3.extractor.e0;
import io.p071bidmachine.media3.extractor.y;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public final d a;
    public final e0 b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public e(int i, d dVar, e0 e0Var) {
        int i2 = dVar.d;
        this.a = dVar;
        int iA = dVar.a();
        boolean z = true;
        if (iA != 1 && iA != 2) {
            z = false;
        }
        a.c(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (iA == 2 ? 1667497984 : 1651965952) | i3;
        long j = ((long) dVar.b) * 1000000;
        long j2 = dVar.c;
        int i4 = x.a;
        this.e = x.T(i2, j, j2, RoundingMode.DOWN);
        this.b = e0Var;
        this.d = iA == 2 ? i3 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i2;
    }

    public final a0 a(int i) {
        return new a0((this.e / ((long) this.f)) * ((long) this.n[i]), this.m[i]);
    }

    public final y b(long j) {
        if (this.k == 0) {
            a0 a0Var = new a0(0L, this.l);
            return new y(a0Var, a0Var);
        }
        int i = (int) (j / (this.e / ((long) this.f)));
        int iD = x.d(this.n, i, true, true);
        if (this.n[iD] == i) {
            a0 a0VarA = a(iD);
            return new y(a0VarA, a0VarA);
        }
        a0 a0VarA2 = a(iD);
        int i2 = iD + 1;
        return i2 < this.m.length ? new y(a0VarA2, a(i2)) : new y(a0VarA2, a0VarA2);
    }
}
