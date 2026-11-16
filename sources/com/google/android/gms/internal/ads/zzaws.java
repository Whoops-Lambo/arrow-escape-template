package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.ak1;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzaws {
    public int a;
    public zzawn b;
    public zzawb c;
    public zzawe d;

    public final long e() {
        int i = 0;
        long j = 0;
        while (i < 64) {
            try {
                zzawb zzawbVar = this.c;
                zzawn zzawnVar = this.b;
                int i2 = this.a;
                this.a = i2 + 1;
                byte b = zzawbVar.b(zzawnVar, i2);
                j |= ((long) (b & 127)) << i;
                if (i == 63) {
                    if (b > 1) {
                        throw new zzawp();
                    }
                    i = 63;
                }
                if ((b & 128) == 0) {
                    return (-(j & 1)) ^ (j >>> 1);
                }
                i += 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzawr(e);
            }
        }
        throw new zzawp();
    }

    public zzaws(zzawe zzaweVar) {
        this(zzawn.b, 0, new zzawc());
        this.d = zzaweVar;
    }

    public static final void g(long j) throws zzawq {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        if (j % (((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + jArr[6]) ^ (jArr[7] % 477127367)) != 0) {
            throw new zzawq();
        }
    }

    public final void a(long j) {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = jArr[7];
        g(j);
        long j10 = j / (((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + j8) ^ (j9 % 899334107));
        if (j10 < 0 || j10 > this.b.a.length) {
            throw new zzawr();
        }
        this.a = (int) j10;
    }

    public final long b() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        return ((long) this.a) * (((((((~j) & j2) | j3) + ((j & j4) | j5)) - j6) + jArr[6]) ^ (jArr[7] % 1780695788));
    }

    public final long c() throws zzawr {
        try {
            zzawb zzawbVar = this.c;
            zzawn zzawnVar = this.b;
            int i = this.a;
            this.a = i + 1;
            return zzawbVar.b(zzawnVar, i);
        } catch (IndexOutOfBoundsException e) {
            throw new zzawr(e);
        }
    }

    public final int d() {
        try {
            zzawb zzawbVar = this.c;
            zzawn zzawnVar = this.b;
            int i = this.a;
            this.a = i + 1;
            int iB = zzawbVar.b(zzawnVar, i) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            zzawb zzawbVar2 = this.c;
            zzawn zzawnVar2 = this.b;
            int i2 = this.a;
            this.a = i2 + 1;
            int iB2 = iB | ((zzawbVar2.b(zzawnVar2, i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
            zzawb zzawbVar3 = this.c;
            zzawn zzawnVar3 = this.b;
            int i3 = this.a;
            this.a = i3 + 1;
            int iB3 = iB2 | ((zzawbVar3.b(zzawnVar3, i3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
            zzawb zzawbVar4 = this.c;
            zzawn zzawnVar4 = this.b;
            int i4 = this.a;
            this.a = i4 + 1;
            return (zzawbVar4.b(zzawnVar4, i4) << 24) | iB3;
        } catch (IndexOutOfBoundsException e) {
            throw new zzawr(e);
        }
    }

    public final zzawn f(long j) {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iB = h50.B((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        g(b() + j);
        int i9 = this.a;
        long j2 = i9;
        zzawn zzawnVar = this.b;
        long j3 = (j >> ((i8 % 774318984) ^ iB)) + j2;
        if (j3 > zzawnVar.a.length || j3 < j2) {
            throw new zzawr();
        }
        try {
            int i10 = (int) j3;
            zzawn zzawnVarA = this.c.a(zzawnVar, i9, i10);
            this.a = i10;
            return zzawnVarA;
        } catch (IndexOutOfBoundsException e) {
            ak1.l(zzawl.a("CEiv6BFfPnitUE+D"), e);
            return null;
        }
    }

    public zzaws() {
        this(new zzawe(1));
    }

    public zzaws(zzawn zzawnVar, int i, zzawb zzawbVar) {
        this.b = zzawnVar;
        this.a = i;
        this.c = zzawbVar;
    }
}
