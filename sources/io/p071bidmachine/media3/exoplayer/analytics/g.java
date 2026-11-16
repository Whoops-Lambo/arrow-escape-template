package io.p071bidmachine.media3.exoplayer.analytics;

import io.p071bidmachine.media3.common.q0;
import io.p071bidmachine.media3.common.r0;
import io.p071bidmachine.media3.exoplayer.source.d0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {
    public final String a;
    public int b;
    public long c;
    public final d0 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ h g;

    public final boolean a(a aVar) {
        d0 d0Var = aVar.d;
        r0 r0Var = aVar.b;
        if (d0Var == null) {
            return this.b != aVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (d0Var.d > j) {
            return true;
        }
        d0 d0Var2 = this.d;
        if (d0Var2 == null) {
            return false;
        }
        int i = d0Var2.b;
        int iB = r0Var.b(d0Var.a);
        int iB2 = r0Var.b(d0Var2.a);
        if (d0Var.d < d0Var2.d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        if (!d0Var.b()) {
            int i2 = d0Var.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = d0Var.b;
        int i4 = d0Var.c;
        if (i3 <= i) {
            return i3 == i && i4 > d0Var2.c;
        }
        return true;
    }

    public final boolean b(r0 r0Var, r0 r0Var2) {
        d0 d0Var;
        int i = this.b;
        if (i < r0Var.o()) {
            h hVar = this.g;
            q0 q0Var = hVar.a;
            r0Var.n(i, q0Var);
            int i2 = q0Var.m;
            while (true) {
                if (i2 > q0Var.n) {
                    i = -1;
                    break;
                }
                int iB = r0Var2.b(r0Var.l(i2));
                if (iB != -1) {
                    i = r0Var2.f(iB, hVar.b, false).c;
                    break;
                }
                i2++;
            }
        } else if (i >= r0Var2.o()) {
            i = -1;
            break;
        }
        this.b = i;
        return i != -1 && ((d0Var = this.d) == null || r0Var2.b(d0Var.a) != -1);
    }

    public g(h hVar, String str, int i, d0 d0Var) {
        long j;
        this.g = hVar;
        this.a = str;
        this.b = i;
        if (d0Var == null) {
            j = -1;
        } else {
            j = d0Var.d;
        }
        this.c = j;
        if (d0Var != null && d0Var.b()) {
            this.d = d0Var;
        }
    }
}
