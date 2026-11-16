package io.p071bidmachine.media3.exoplayer;

import android.util.Pair;
import io.p071bidmachine.media3.common.p0;
import io.p071bidmachine.media3.common.q0;
import io.p071bidmachine.media3.common.r0;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.source.e1;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class z0 extends r0 {
    public static final /* synthetic */ int k = 0;
    public final int b;
    public final e1 c;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;
    public final r0[] h;
    public final Object[] i;
    public final HashMap j;

    @Override // io.p071bidmachine.media3.common.r0
    public final int c(boolean z) {
        int iR;
        int i = this.b;
        if (i != 0) {
            if (z) {
                int[] iArr = this.c.b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i - 1;
            }
            do {
                r0[] r0VarArr = this.h;
                if (!r0VarArr[iR].p()) {
                    return r0VarArr[iR].c(z) + this.g[iR];
                }
                iR = r(iR, z);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // io.p071bidmachine.media3.common.r0
    public final p0 g(Object obj, p0 p0Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.g[iIntValue];
        this.h[iIntValue].g(obj3, p0Var);
        p0Var.c += i;
        p0Var.b = obj;
        return p0Var;
    }

    public final int q(int i, boolean z) {
        if (!z) {
            if (i < this.b - 1) {
                return i + 1;
            }
            return -1;
        }
        e1 e1Var = this.c;
        int i2 = e1Var.c[i] + 1;
        int[] iArr = e1Var.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int r(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        e1 e1Var = this.c;
        int i2 = e1Var.c[i] - 1;
        if (i2 >= 0) {
            return e1Var.b[i2];
        }
        return -1;
    }

    @Override // io.p071bidmachine.media3.common.r0
    public final int a(boolean z) {
        if (this.b != 0) {
            int iQ = 0;
            if (z) {
                int[] iArr = this.c.b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                r0[] r0VarArr = this.h;
                if (!r0VarArr[iQ].p()) {
                    return r0VarArr[iQ].a(z) + this.g[iQ];
                }
                iQ = q(iQ, z);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // io.p071bidmachine.media3.common.r0
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.h[iIntValue].b(obj3)) != -1) {
                return this.f[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // io.p071bidmachine.media3.common.r0
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int iD = x.d(iArr, i + 1, false, false);
        int i3 = iArr[iD];
        r0[] r0VarArr = this.h;
        int iE = r0VarArr[iD].e(i - i3, i2 != 2 ? i2 : 0, z);
        if (iE != -1) {
            return i3 + iE;
        }
        int iQ = q(iD, z);
        while (iQ != -1 && r0VarArr[iQ].p()) {
            iQ = q(iQ, z);
        }
        if (iQ != -1) {
            return r0VarArr[iQ].a(z) + iArr[iQ];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // io.p071bidmachine.media3.common.r0
    public final p0 f(int i, p0 p0Var, boolean z) {
        int[] iArr = this.f;
        int iD = x.d(iArr, i + 1, false, false);
        int i2 = this.g[iD];
        this.h[iD].f(i - iArr[iD], p0Var, z);
        p0Var.c += i2;
        if (z) {
            Object obj = this.i[iD];
            Object obj2 = p0Var.b;
            obj2.getClass();
            p0Var.b = Pair.create(obj, obj2);
        }
        return p0Var;
    }

    @Override // io.p071bidmachine.media3.common.r0
    public final int h() {
        return this.e;
    }

    @Override // io.p071bidmachine.media3.common.r0
    public final int k(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int iD = x.d(iArr, i + 1, false, false);
        int i3 = iArr[iD];
        r0[] r0VarArr = this.h;
        int iK = r0VarArr[iD].k(i - i3, i2 != 2 ? i2 : 0, z);
        if (iK != -1) {
            return i3 + iK;
        }
        int iR = r(iD, z);
        while (iR != -1 && r0VarArr[iR].p()) {
            iR = r(iR, z);
        }
        if (iR != -1) {
            return r0VarArr[iR].c(z) + iArr[iR];
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // io.p071bidmachine.media3.common.r0
    public final Object l(int i) {
        int[] iArr = this.f;
        int iD = x.d(iArr, i + 1, false, false);
        return Pair.create(this.i[iD], this.h[iD].l(i - iArr[iD]));
    }

    @Override // io.p071bidmachine.media3.common.r0
    public final q0 m(int i, q0 q0Var, long j) {
        int[] iArr = this.g;
        int iD = x.d(iArr, i + 1, false, false);
        int i2 = iArr[iD];
        int i3 = this.f[iD];
        this.h[iD].m(i - i2, q0Var, j);
        Object objCreate = this.i[iD];
        Object obj = q0.p;
        Object obj2 = q0Var.a;
        if (obj != obj2) {
            objCreate = Pair.create(objCreate, obj2);
        }
        q0Var.a = objCreate;
        q0Var.m += i3;
        q0Var.n += i3;
        return q0Var;
    }

    @Override // io.p071bidmachine.media3.common.r0
    public final int o() {
        return this.d;
    }

    public z0(r0[] r0VarArr, Object[] objArr, e1 e1Var) {
        this.c = e1Var;
        this.b = e1Var.b.length;
        int length = r0VarArr.length;
        this.h = r0VarArr;
        this.f = new int[length];
        this.g = new int[length];
        this.i = objArr;
        this.j = new HashMap();
        int length2 = r0VarArr.length;
        int i = 0;
        int iO = 0;
        int iH = 0;
        int i2 = 0;
        while (i < length2) {
            r0 r0Var = r0VarArr[i];
            this.h[i2] = r0Var;
            this.g[i2] = iO;
            this.f[i2] = iH;
            iO += r0Var.o();
            iH += this.h[i2].h();
            this.j.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.d = iO;
        this.e = iH;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z0(ArrayList arrayList, e1 e1Var) {
        r0[] r0VarArr = new r0[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            r0VarArr[i2] = ((m0) obj).getTimeline();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            objArr[i] = ((m0) obj2).getUid();
            i++;
        }
        this(r0VarArr, objArr, e1Var);
    }
}
