package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.rx3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zzbf {
    public static final rx3 a = new rx3();

    public abstract int a();

    public abstract zzbe b(int i, zzbe zzbeVar, long j);

    public abstract int c();

    public abstract zzbd d(int i, zzbd zzbdVar, boolean z);

    public abstract int e(Object obj);

    public final boolean equals(Object obj) {
        int iJ;
        if (this != obj) {
            if (obj instanceof zzbf) {
                zzbf zzbfVar = (zzbf) obj;
                if (zzbfVar.a() == a() && zzbfVar.c() == c()) {
                    zzbe zzbeVar = new zzbe();
                    zzbd zzbdVar = new zzbd();
                    zzbe zzbeVar2 = new zzbe();
                    zzbd zzbdVar2 = new zzbd();
                    for (int i = 0; i < a(); i++) {
                        if (b(i, zzbeVar, 0L).equals(zzbfVar.b(i, zzbeVar2, 0L))) {
                        }
                    }
                    for (int i2 = 0; i2 < c(); i2++) {
                        if (d(i2, zzbdVar, true).equals(zzbfVar.d(i2, zzbdVar2, true))) {
                        }
                    }
                    int iK = k(true);
                    if (iK == zzbfVar.k(true) && (iJ = j(true)) == zzbfVar.j(true)) {
                        while (iK != iJ) {
                            int iH = h(iK, 0, true);
                            if (iH == zzbfVar.h(iK, 0, true)) {
                                iK = iH;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract Object f(int i);

    public int h(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == j(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == j(z) ? k(z) : i + 1;
        }
        io.p071bidmachine.media3.extractor.ts.y.b();
        return 0;
    }

    public int i(int i) {
        if (i == k(false)) {
            return -1;
        }
        return i - 1;
    }

    public final int l(int i, zzbd zzbdVar, zzbe zzbeVar, int i2, boolean z) {
        int i3 = d(i, zzbdVar, false).c;
        if (b(i3, zzbeVar, 0L).l != i) {
            return i + 1;
        }
        int iH = h(i3, i2, z);
        if (iH == -1) {
            return -1;
        }
        return b(iH, zzbeVar, 0L).k;
    }

    static {
        String str = zzfq.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public final int hashCode() {
        int i;
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        int iA = a() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        int i2 = 0;
        while (true) {
            i = iA * 31;
            if (i2 >= a()) {
                break;
            }
            iA = i + b(i2, zzbeVar, 0L).hashCode();
            i2++;
        }
        int iC = c() + i;
        for (int i3 = 0; i3 < c(); i3++) {
            iC = (iC * 31) + d(i3, zzbdVar, true).hashCode();
        }
        int iK = k(true);
        while (iK != -1) {
            iC = (iC * 31) + iK;
            iK = h(iK, 0, true);
        }
        return iC;
    }

    public final Pair m(zzbe zzbeVar, zzbd zzbdVar, int i, long j) {
        Pair pairN = n(zzbeVar, zzbdVar, i, j, 0L);
        pairN.getClass();
        return pairN;
    }

    public final boolean g() {
        if (a() == 0) {
            return true;
        }
        return false;
    }

    public int j(boolean z) {
        if (g()) {
            return -1;
        }
        return a() - 1;
    }

    public int k(boolean z) {
        if (g()) {
            return -1;
        }
        return 0;
    }

    public final Pair n(zzbe zzbeVar, zzbd zzbdVar, int i, long j, long j2) {
        zzgvz.i(i, a());
        b(i, zzbeVar, j2);
        if (j == -9223372036854775807L) {
            zzbeVar.getClass();
            j = 0;
        }
        int i2 = zzbeVar.k;
        d(i2, zzbdVar, false);
        while (i2 < zzbeVar.l) {
            zzbdVar.getClass();
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            d(i3, zzbdVar, false).getClass();
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        d(i2, zzbdVar, true);
        zzbdVar.getClass();
        long j3 = zzbdVar.d;
        if (j3 != -9223372036854775807L) {
            j = Math.min(j, j3 - 1);
        }
        long jMax = Math.max(0L, j);
        Object obj = zzbdVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public zzbd o(Object obj, zzbd zzbdVar) {
        return d(e(obj), zzbdVar, true);
    }
}
