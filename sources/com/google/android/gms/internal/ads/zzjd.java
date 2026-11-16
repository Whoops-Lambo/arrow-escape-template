package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzjd extends zzbf {
    public final int b;
    public final zzzp c;

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int j(boolean z) {
        int iX;
        int i = this.b;
        if (i != 0) {
            if (z) {
                int[] iArr = this.c.b;
                int length = iArr.length;
                iX = length > 0 ? iArr[length - 1] : -1;
            } else {
                iX = i - 1;
            }
            while (s(iX).g()) {
                iX = x(iX, z);
                if (iX == -1) {
                }
            }
            return s(iX).j(z) + u(iX);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbd o(Object obj, zzbd zzbdVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iR = r(obj2);
        int iU = u(iR);
        s(iR).o(obj3, zzbdVar);
        zzbdVar.c += iU;
        zzbdVar.b = obj;
        return zzbdVar;
    }

    public abstract int p(int i);

    public abstract int q(int i);

    public abstract int r(Object obj);

    public abstract zzbf s(int i);

    public abstract int t(int i);

    public abstract int u(int i);

    public abstract Object v(int i);

    public final int w(int i, boolean z) {
        if (!z) {
            if (i >= this.b - 1) {
                return -1;
            }
            return i + 1;
        }
        zzzp zzzpVar = this.c;
        int i2 = zzzpVar.c[i] + 1;
        int[] iArr = zzzpVar.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int x(int i, boolean z) {
        if (!z) {
            if (i <= 0) {
                return -1;
            }
            return i - 1;
        }
        zzzp zzzpVar = this.c;
        int i2 = zzzpVar.c[i] - 1;
        if (i2 >= 0) {
            return zzzpVar.b[i2];
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int e(Object obj) {
        int iE;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int iR = r(obj2);
            if (iR != -1 && (iE = s(iR).e(obj3)) != -1) {
                return t(iR) + iE;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int k(boolean z) {
        if (this.b != 0) {
            int iW = 0;
            if (z) {
                int[] iArr = this.c.b;
                iW = iArr.length > 0 ? iArr[0] : -1;
            }
            while (s(iW).g()) {
                iW = w(iW, z);
                if (iW == -1) {
                }
            }
            return s(iW).k(z) + u(iW);
        }
        return -1;
    }

    public zzjd(zzzp zzzpVar) {
        this.c = zzzpVar;
        this.b = zzzpVar.b.length;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbe b(int i, zzbe zzbeVar, long j) {
        int iQ = q(i);
        int iU = u(iQ);
        int iT = t(iQ);
        s(iQ).b(i - iU, zzbeVar, j);
        Object objV = v(iQ);
        Object obj = zzbe.m;
        Object obj2 = zzbeVar.a;
        if (obj != obj2) {
            objV = Pair.create(objV, obj2);
        }
        zzbeVar.a = objV;
        zzbeVar.k += iT;
        zzbeVar.l += iT;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbd d(int i, zzbd zzbdVar, boolean z) {
        int iP = p(i);
        int iU = u(iP);
        s(iP).d(i - t(iP), zzbdVar, z);
        zzbdVar.c += iU;
        if (z) {
            Object objV = v(iP);
            Object obj = zzbdVar.b;
            obj.getClass();
            zzbdVar.b = Pair.create(objV, obj);
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final Object f(int i) {
        int iP = p(i);
        return Pair.create(v(iP), s(iP).f(i - t(iP)));
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int h(int i, int i2, boolean z) {
        int i3;
        int iQ = q(i);
        int iU = u(iQ);
        zzbf zzbfVarS = s(iQ);
        int i4 = i - iU;
        if (i2 == 2) {
            i3 = 0;
        } else {
            i3 = i2;
        }
        int iH = zzbfVarS.h(i4, i3, z);
        if (iH != -1) {
            return iU + iH;
        }
        int iW = w(iQ, z);
        while (iW != -1 && s(iW).g()) {
            iW = w(iW, z);
        }
        if (iW != -1) {
            return s(iW).k(z) + u(iW);
        }
        if (i2 != 2) {
            return -1;
        }
        return k(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int i(int i) {
        int iQ = q(i);
        int iU = u(iQ);
        int i2 = s(iQ).i(i - iU);
        if (i2 != -1) {
            return iU + i2;
        }
        int iX = x(iQ, false);
        while (iX != -1 && s(iX).g()) {
            iX = x(iX, false);
        }
        if (iX == -1) {
            return -1;
        }
        return s(iX).j(false) + u(iX);
    }
}
