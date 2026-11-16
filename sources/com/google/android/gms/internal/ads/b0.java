package com.google.android.gms.internal.ads;

import defpackage.c62;
import defpackage.iy4;
import defpackage.iz4;
import defpackage.oy4;
import defpackage.zy4;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b0 extends zzifx {
    public static final int[] h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int c;
    public final zzifx d;
    public final zzifx e;
    public final int f;
    public final int g;

    public static int K(int i) {
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return h[i];
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final boolean A(zzifx zzifxVar) {
        iy4 iy4VarB;
        c62 c62Var = new c62(this);
        iy4 iy4VarB2 = c62Var.b();
        c62 c62Var2 = new c62(zzifxVar);
        iy4 iy4VarB3 = c62Var2.b();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iN = iy4VarB2.n() - i;
            int iN2 = iy4VarB3.n() - i2;
            int iMin = Math.min(iN, iN2);
            if (!(i == 0 ? iy4VarB2.K(iy4VarB3, i2, iMin) : iy4VarB3.K(iy4VarB2, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.c;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                io.p071bidmachine.media3.extractor.ts.y.b();
                return false;
            }
            if (iMin == iN) {
                iy4VarB = c62Var.b();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == iN2) {
                iy4VarB2 = iy4VarB2;
                iy4VarB2 = iy4VarB;
                iy4VarB3 = c62Var2.b();
                i2 = 0;
            } else {
                iy4VarB2 = iy4VarB2;
                iy4VarB2 = iy4VarB;
                i2 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final int C(int i, int i2, int i3) {
        int i4 = i2 + i3;
        zzifx zzifxVar = this.d;
        int i5 = this.f;
        if (i4 <= i5) {
            return zzifxVar.C(i, i2, i3);
        }
        zzifx zzifxVar2 = this.e;
        if (i2 >= i5) {
            return zzifxVar2.C(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return zzifxVar2.C(zzifxVar.C(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final zzigb D() {
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.g);
        arrayDeque.push(this);
        zzifx zzifxVar = this.d;
        while (zzifxVar instanceof b0) {
            b0 b0Var = (b0) zzifxVar;
            arrayDeque.push(b0Var);
            zzifxVar = b0Var.d;
        }
        iy4 iy4Var = (iy4) zzifxVar;
        while (true) {
            if (!(iy4Var != null)) {
                zy4 zy4Var = new zy4();
                zy4Var.a = arrayList.iterator();
                zy4Var.c = 0;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    zy4Var.c++;
                }
                zy4Var.d = -1;
                if (!zy4Var.d()) {
                    zy4Var.b = zzihp.b;
                    zy4Var.e = 0;
                }
                return new oy4(zy4Var);
            }
            iy4 iy4Var2 = null;
            if (iy4Var == null) {
                defpackage.d.v();
                return null;
            }
            while (!arrayDeque.isEmpty()) {
                zzifx zzifxVar2 = ((b0) arrayDeque.pop()).e;
                while (zzifxVar2 instanceof b0) {
                    b0 b0Var2 = (b0) zzifxVar2;
                    arrayDeque.push(b0Var2);
                    zzifxVar2 = b0Var2.d;
                }
                iy4 iy4Var3 = (iy4) zzifxVar2;
                if (iy4Var3.n() != 0) {
                    iy4Var2 = iy4Var3;
                    break;
                }
            }
            arrayList.add(iy4Var.x());
            iy4Var = iy4Var2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final int E() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final boolean F() {
        return this.c >= K(this.g);
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    /* JADX INFO: renamed from: G */
    public final zzifs iterator() {
        return new iz4(this);
    }

    @Override // com.google.android.gms.internal.ads.zzifx, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new iz4(this);
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final byte k(int i) {
        int i2 = this.f;
        return i < i2 ? this.d.k(i) : this.e.k(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final int n() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final zzifx r(int i, int i2) {
        int i3 = this.c;
        int iH = zzifx.h(i, i2, i3);
        if (iH == 0) {
            return zzifx.b;
        }
        if (iH == i3) {
            return this;
        }
        zzifx zzifxVar = this.d;
        int i4 = this.f;
        if (i2 <= i4) {
            return zzifxVar.o(i, i2);
        }
        int i5 = i2 - i4;
        zzifx zzifxVar2 = this.e;
        return i >= i4 ? zzifxVar2.o(i - i4, i5) : new b0(zzifxVar.o(i, zzifxVar.n()), zzifxVar2.o(0, i5));
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final void t(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        zzifx zzifxVar = this.d;
        int i5 = this.f;
        if (i4 <= i5) {
            zzifxVar.t(bArr, i, i2, i3);
            return;
        }
        zzifx zzifxVar2 = this.e;
        if (i >= i5) {
            zzifxVar2.t(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        zzifxVar.t(bArr, i, i2, i6);
        zzifxVar2.t(bArr, 0, i2 + i6, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final void y(zzigh zzighVar) {
        this.d.y(zzighVar);
        this.e.y(zzighVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final String z() {
        return new String(d(), StandardCharsets.ISO_8859_1);
    }

    public b0(zzifx zzifxVar, zzifx zzifxVar2) {
        this.d = zzifxVar;
        this.e = zzifxVar2;
        int iN = zzifxVar.n();
        this.f = iN;
        this.c = zzifxVar2.n() + iN;
        this.g = Math.max(zzifxVar.E(), zzifxVar2.E()) + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final zzifx o(int i, int i2) {
        return r(i, i2);
    }
}
