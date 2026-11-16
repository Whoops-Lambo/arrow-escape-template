package com.google.android.gms.internal.ads;

import defpackage.rl3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzari implements zzase {
    public final zzaqp a;
    public final zzet b = new zzet(new byte[10], 10);
    public int c = 0;
    public int d;
    public zzfn e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    @Override // com.google.android.gms.internal.ads.zzase
    public final void zzb() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final void a(zzfn zzfnVar, zzagr zzagrVar, zzasd zzasdVar) {
        this.e = zzfnVar;
        this.a.c(zzagrVar, zzasdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final void b(int i, zzey zzeyVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        long jC;
        this.e.getClass();
        int i6 = i & 1;
        zzaqp zzaqpVar = this.a;
        int i7 = 0;
        int i8 = -1;
        int i9 = 2;
        int i10 = 1;
        if (i6 != 0) {
            int i11 = this.c;
            if (i11 != 0 && i11 != 1) {
                if (i11 != 2) {
                    int i12 = this.j;
                    if (i12 != -1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i12).length() + 48);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i12);
                        sb.append(" more bytes");
                        zzeh.c("PesReader", sb.toString());
                    }
                    zzaqpVar.zzf();
                } else {
                    zzeh.c("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            if (zzeyVar.c == 0) {
                zzaqpVar.zzm();
            }
            this.c = 1;
            this.d = 0;
        }
        int i13 = i;
        while (zzeyVar.B() > 0) {
            int i14 = this.c;
            if (i14 != 0) {
                zzet zzetVar = this.b;
                if (i14 != i10) {
                    if (i14 != i9) {
                        int iB = zzeyVar.B();
                        int i15 = this.j;
                        int i16 = i15 == i8 ? i7 : iB - i15;
                        if (i16 > 0) {
                            iB -= i16;
                            zzeyVar.C(zzeyVar.b + iB);
                        }
                        zzaqpVar.b(zzeyVar);
                        int i17 = this.j;
                        if (i17 != i8) {
                            int i18 = i17 - iB;
                            this.j = i18;
                            if (i18 == 0) {
                                zzaqpVar.zzf();
                                this.c = i10;
                                this.d = i7;
                            }
                        }
                    } else {
                        if (c(zzeyVar, zzetVar.a, Math.min(10, this.i)) && c(zzeyVar, null, this.i)) {
                            zzetVar.d(i7);
                            if (this.f) {
                                zzetVar.f(4);
                                long jH = zzetVar.h(3);
                                zzetVar.f(i10);
                                int iH = zzetVar.h(15) << 15;
                                zzetVar.f(i10);
                                long jH2 = zzetVar.h(15);
                                zzetVar.f(i10);
                                if (!this.h && this.g) {
                                    zzetVar.f(4);
                                    long jH3 = ((long) zzetVar.h(3)) << 30;
                                    zzetVar.f(i10);
                                    int iH2 = zzetVar.h(15) << 15;
                                    zzetVar.f(i10);
                                    long jH4 = zzetVar.h(15);
                                    zzetVar.f(i10);
                                    this.e.c(jH3 | ((long) iH2) | jH4);
                                    this.h = true;
                                }
                                jC = this.e.c((jH << 30) | ((long) iH) | jH2);
                            } else {
                                jC = -9223372036854775807L;
                            }
                            i13 |= true != this.k ? 0 : 4;
                            zzaqpVar.a(i13, jC);
                            this.c = 3;
                            i7 = 0;
                            this.d = 0;
                            i8 = -1;
                            i9 = 2;
                            i10 = 1;
                        }
                    }
                    int i19 = i8;
                    i2 = i7;
                    i3 = i19;
                    i4 = i10;
                } else if (c(zzeyVar, zzetVar.a, 9)) {
                    zzetVar.d(i7);
                    int iH3 = zzetVar.h(24);
                    i4 = 1;
                    if (iH3 != 1) {
                        rl3.q(new StringBuilder(String.valueOf(iH3).length() + 30), "Unexpected start code prefix: ", iH3, "PesReader");
                        i3 = -1;
                        this.j = -1;
                        i5 = 0;
                        i9 = 2;
                    } else {
                        zzetVar.f(8);
                        int iH4 = zzetVar.h(16);
                        zzetVar.f(5);
                        this.k = zzetVar.g();
                        i9 = 2;
                        zzetVar.f(2);
                        this.f = zzetVar.g();
                        this.g = zzetVar.g();
                        zzetVar.f(6);
                        int iH5 = zzetVar.h(8);
                        this.i = iH5;
                        if (iH4 == 0) {
                            this.j = -1;
                            i5 = 2;
                            i3 = -1;
                        } else {
                            int i20 = (iH4 - 3) - iH5;
                            this.j = i20;
                            if (i20 < 0) {
                                rl3.q(new StringBuilder(String.valueOf(i20).length() + 36), "Found negative packet payload size: ", i20, "PesReader");
                                i3 = -1;
                                this.j = -1;
                            } else {
                                i3 = -1;
                            }
                            i5 = 2;
                        }
                    }
                    this.c = i5;
                    i2 = 0;
                    this.d = 0;
                } else {
                    i2 = i7;
                    i3 = -1;
                    i9 = 2;
                    i4 = 1;
                }
            } else {
                int i21 = i8;
                i2 = i7;
                i3 = i21;
                i4 = i10;
                zzeyVar.G(zzeyVar.B());
            }
            int i22 = i2;
            i8 = i3;
            i7 = i22;
            i10 = i4;
        }
    }

    public zzari(zzaqp zzaqpVar) {
        this.a = zzaqpVar;
    }

    public final boolean c(zzey zzeyVar, byte[] bArr, int i) {
        int iMin = Math.min(zzeyVar.B(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzeyVar.G(iMin);
        } else {
            zzeyVar.H(this.d, iMin, bArr);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }
}
