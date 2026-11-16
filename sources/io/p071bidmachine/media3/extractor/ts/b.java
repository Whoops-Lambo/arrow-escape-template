package io.p071bidmachine.media3.extractor.ts;

import defpackage.l63;
import io.p071bidmachine.media3.common.f0;
import io.p071bidmachine.media3.common.m;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.p;
import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.extractor.e0;
import io.p071bidmachine.media3.extractor.o;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements h {
    public final /* synthetic */ int a;
    public final p b;
    public final q c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public e0 h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public n m;
    public int n;
    public long o;

    private final void a(boolean z) {
    }

    private final void b(boolean z) {
    }

    public b(String str, int i, String str2, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                p pVar = new p(new byte[16], 16);
                this.b = pVar;
                this.c = new q(pVar.b);
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
            default:
                p pVar2 = new p(new byte[128], 128);
                this.b = pVar2;
                this.c = new q(pVar2.b);
                this.i = 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0369  */
    /* JADX WARN: Code duplicated, block: B:186:0x0377  */
    /* JADX WARN: Code duplicated, block: B:188:0x037f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0395 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:196:0x0397  */
    /* JADX WARN: Code duplicated, block: B:197:0x039c  */
    /* JADX WARN: Code duplicated, block: B:199:0x039f  */
    /* JADX WARN: Code duplicated, block: B:201:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:202:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:204:0x03b1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.p071bidmachine.media3.extractor.ts.h
    public final void c(q qVar) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j;
        qVar = qVar;
        int i20 = this.a;
        int i21 = this.e;
        String str2 = this.d;
        String str3 = this.f;
        p pVar = this.b;
        long j2 = -9223372036854775807L;
        int i22 = 0;
        int i23 = 1;
        int i24 = 2;
        q qVar2 = this.c;
        int i25 = 16;
        switch (i20) {
            case 0:
                a.j(this.h);
                while (qVar.a() > 0) {
                    int i26 = this.i;
                    if (i26 == 0) {
                        while (true) {
                            if (qVar.a() <= 0) {
                                i22 = 0;
                                i23 = 1;
                                i24 = 2;
                            } else if (this.k) {
                                int iT = qVar.t();
                                if (iT == 119) {
                                    this.k = false;
                                    i23 = 1;
                                    this.i = 1;
                                    byte[] bArr = qVar2.a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.j = 2;
                                    i24 = 2;
                                    i22 = 0;
                                } else {
                                    this.k = iT == 11;
                                }
                            } else {
                                this.k = qVar.t() == 11;
                            }
                        }
                    } else if (i26 == i23) {
                        byte[] bArr2 = qVar2.a;
                        int iMin = Math.min(qVar.a(), 128 - this.j);
                        qVar.e(bArr2, this.j, iMin);
                        int i27 = this.j + iMin;
                        this.j = i27;
                        if (i27 == 128) {
                            pVar.q(i22);
                            int[] iArr = io.p071bidmachine.media3.extractor.b.f;
                            int[] iArr2 = io.p071bidmachine.media3.extractor.b.d;
                            int iG = pVar.g();
                            pVar.t(40);
                            int i28 = pVar.i(5) > 10 ? i23 : 0;
                            pVar.q(iG);
                            if (i28 != 0) {
                                pVar.t(i25);
                                int i29 = pVar.i(i24);
                                if (i29 == 0) {
                                    i7 = 0;
                                } else if (i29 != i23) {
                                    i7 = i29 != i24 ? -1 : i24;
                                } else {
                                    i7 = i23;
                                }
                                pVar.t(3);
                                i5 = (pVar.i(11) + i23) * i24;
                                int i30 = pVar.i(i24);
                                if (i30 == 3) {
                                    i6 = io.p071bidmachine.media3.extractor.b.e[pVar.i(i24)];
                                    i8 = 3;
                                    i9 = 6;
                                } else {
                                    int i31 = pVar.i(i24);
                                    int i32 = io.p071bidmachine.media3.extractor.b.c[i31];
                                    i6 = iArr2[i30];
                                    i8 = i31;
                                    i9 = i32;
                                }
                                i4 = i9 * 256;
                                int i33 = (i5 * i6) / (i9 * 32);
                                int i34 = pVar.i(3);
                                boolean zH = pVar.h();
                                int i35 = iArr[i34] + (zH ? 1 : 0);
                                pVar.t(10);
                                if (pVar.h()) {
                                    pVar.t(8);
                                }
                                if (i34 == 0) {
                                    pVar.t(5);
                                    if (pVar.h()) {
                                        pVar.t(8);
                                    }
                                }
                                if (i7 == 1 && pVar.h()) {
                                    pVar.t(16);
                                }
                                if (pVar.h()) {
                                    if (i34 > 2) {
                                        pVar.t(2);
                                    }
                                    if ((i34 & 1) == 0 || i34 <= 2) {
                                        i15 = 6;
                                    } else {
                                        i15 = 6;
                                        pVar.t(6);
                                    }
                                    if ((i34 & 4) != 0) {
                                        pVar.t(i15);
                                    }
                                    if (zH && pVar.h()) {
                                        pVar.t(5);
                                    }
                                    if (i7 == 0) {
                                        if (pVar.h()) {
                                            i16 = 6;
                                            pVar.t(6);
                                        } else {
                                            i16 = 6;
                                        }
                                        if (i34 == 0 && pVar.h()) {
                                            pVar.t(i16);
                                        }
                                        if (pVar.h()) {
                                            pVar.t(i16);
                                        }
                                        i10 = i35;
                                        int i36 = pVar.i(2);
                                        if (i36 == 1) {
                                            pVar.t(5);
                                        } else if (i36 == 2) {
                                            pVar.t(12);
                                        } else {
                                            if (i36 == 3) {
                                                int i37 = pVar.i(5);
                                                if (pVar.h()) {
                                                    pVar.t(5);
                                                    if (pVar.h()) {
                                                        i18 = 4;
                                                        pVar.t(4);
                                                    } else {
                                                        i18 = 4;
                                                    }
                                                    if (pVar.h()) {
                                                        pVar.t(i18);
                                                    }
                                                    if (pVar.h()) {
                                                        pVar.t(i18);
                                                    }
                                                    if (pVar.h()) {
                                                        pVar.t(i18);
                                                    }
                                                    if (pVar.h()) {
                                                        pVar.t(i18);
                                                    }
                                                    if (pVar.h()) {
                                                        pVar.t(i18);
                                                    }
                                                    if (pVar.h()) {
                                                        pVar.t(i18);
                                                    }
                                                    if (pVar.h()) {
                                                        if (pVar.h()) {
                                                            pVar.t(i18);
                                                        }
                                                        if (pVar.h()) {
                                                            pVar.t(i18);
                                                        }
                                                    }
                                                }
                                                if (pVar.h()) {
                                                    pVar.t(5);
                                                    if (pVar.h()) {
                                                        pVar.t(7);
                                                        if (pVar.h()) {
                                                            pVar.t(8);
                                                            i17 = 2;
                                                        } else {
                                                            i17 = 2;
                                                        }
                                                    } else {
                                                        i17 = 2;
                                                    }
                                                } else {
                                                    i17 = 2;
                                                }
                                                pVar.t((i37 + i17) * 8);
                                                pVar.c();
                                            }
                                            if (i34 < i17) {
                                                if (pVar.h()) {
                                                    pVar.t(14);
                                                }
                                                if (i34 == 0 && pVar.h()) {
                                                    pVar.t(14);
                                                }
                                            }
                                            i11 = i8;
                                            if (pVar.h()) {
                                                if (i11 == 0) {
                                                    pVar.t(5);
                                                } else {
                                                    for (i19 = 0; i19 < i9; i19++) {
                                                        if (pVar.h()) {
                                                            pVar.t(5);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i17 = 2;
                                        if (i34 < i17) {
                                            if (pVar.h()) {
                                                pVar.t(14);
                                            }
                                            if (i34 == 0) {
                                                pVar.t(14);
                                            }
                                        }
                                        i11 = i8;
                                        if (pVar.h()) {
                                            if (i11 == 0) {
                                                pVar.t(5);
                                            } else {
                                                while (i19 < i9) {
                                                    if (pVar.h()) {
                                                        pVar.t(5);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i10 = i35;
                                        i11 = i8;
                                    }
                                } else {
                                    i10 = i35;
                                    i11 = i8;
                                }
                                if (pVar.h()) {
                                    pVar.t(5);
                                    if (i34 == 2) {
                                        pVar.t(4);
                                    }
                                    if (i34 >= 6) {
                                        pVar.t(2);
                                    }
                                    if (pVar.h()) {
                                        i14 = 8;
                                        pVar.t(8);
                                    } else {
                                        i14 = 8;
                                    }
                                    if (i34 == 0 && pVar.h()) {
                                        pVar.t(i14);
                                    }
                                    i12 = 3;
                                    if (i30 < 3) {
                                        pVar.s();
                                    }
                                } else {
                                    i12 = 3;
                                }
                                if (i7 == 0 && i11 != i12) {
                                    pVar.s();
                                }
                                if (i7 == 2 && (i11 == i12 || pVar.h())) {
                                    i13 = 6;
                                    pVar.t(6);
                                } else {
                                    i13 = 6;
                                }
                                str = (pVar.h() && pVar.i(i13) == 1 && pVar.i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                i = i33;
                                i3 = i10;
                            } else {
                                pVar.t(32);
                                int i38 = pVar.i(2);
                                String str4 = i38 == 3 ? null : "audio/ac3";
                                int i39 = pVar.i(6);
                                i = io.p071bidmachine.media3.extractor.b.g[i39 / 2] * 1000;
                                int iF = io.p071bidmachine.media3.extractor.b.f(i38, i39);
                                pVar.t(8);
                                int i40 = pVar.i(3);
                                if ((i40 & 1) == 0 || i40 == 1) {
                                    i2 = 2;
                                } else {
                                    i2 = 2;
                                    pVar.t(2);
                                }
                                if ((i40 & 4) != 0) {
                                    pVar.t(i2);
                                }
                                if (i40 == i2) {
                                    pVar.t(i2);
                                }
                                int i41 = i38 < 3 ? iArr2[i38] : -1;
                                i3 = iArr[i40] + (pVar.h() ? 1 : 0);
                                i4 = 1536;
                                str = str4;
                                i5 = iF;
                                i6 = i41;
                            }
                            n nVar = this.m;
                            if (nVar == null || i3 != nVar.D || i6 != nVar.E || !Objects.equals(str, nVar.n)) {
                                m mVar = new m();
                                mVar.a = this.g;
                                mVar.l = f0.p(str3);
                                mVar.m = f0.p(str);
                                mVar.C = i3;
                                mVar.D = i6;
                                mVar.d = str2;
                                mVar.f = i21;
                                mVar.i = i;
                                if ("audio/ac3".equals(str)) {
                                    mVar.h = i;
                                }
                                n nVar2 = new n(mVar);
                                this.m = nVar2;
                                this.h.c(nVar2);
                            }
                            this.n = i5;
                            this.l = (((long) i4) * 1000000) / ((long) this.m.E);
                            qVar2.F(0);
                            this.h.d(qVar2, 128, 0);
                            this.i = 2;
                            i24 = 2;
                            i22 = 0;
                            i23 = 1;
                        } else {
                            qVar = qVar;
                        }
                    } else if (i26 == i24) {
                        int iMin2 = Math.min(qVar.a(), this.n - this.j);
                        this.h.d(qVar, iMin2, i22);
                        int i42 = this.j + iMin2;
                        this.j = i42;
                        if (i42 == this.n) {
                            a.i(this.o != -9223372036854775807L ? i23 : i22);
                            this.h.b(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = i22;
                        }
                    }
                    i25 = 16;
                }
                break;
            default:
                a.j(this.h);
                while (qVar.a() > 0) {
                    int i43 = this.i;
                    if (i43 == 0) {
                        j = j2;
                        while (qVar.a() > 0) {
                            if (this.k) {
                                int iT2 = qVar.t();
                                this.k = iT2 == 172;
                                if (iT2 == 64 || iT2 == 65) {
                                    byte b = iT2 == 65;
                                    this.i = 1;
                                    byte[] bArr3 = qVar2.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (b == true ? 65 : 64);
                                    this.j = 2;
                                }
                            } else {
                                this.k = qVar.t() == 172;
                            }
                        }
                    } else if (i43 == 1) {
                        j = j2;
                        byte[] bArr4 = qVar2.a;
                        int iMin3 = Math.min(qVar.a(), 16 - this.j);
                        qVar.e(bArr4, this.j, iMin3);
                        int i44 = this.j + iMin3;
                        this.j = i44;
                        if (i44 == 16) {
                            pVar.q(0);
                            l63 l63VarL = io.p071bidmachine.media3.extractor.b.l(pVar);
                            int i45 = l63VarL.a;
                            n nVar3 = this.m;
                            if (nVar3 == null || 2 != nVar3.D || i45 != nVar3.E || !"audio/ac4".equals(nVar3.n)) {
                                m mVar2 = new m();
                                mVar2.a = this.g;
                                mVar2.l = f0.p(str3);
                                mVar2.m = f0.p("audio/ac4");
                                mVar2.C = 2;
                                mVar2.D = i45;
                                mVar2.d = str2;
                                mVar2.f = i21;
                                n nVar4 = new n(mVar2);
                                this.m = nVar4;
                                this.h.c(nVar4);
                            }
                            this.n = l63VarL.b;
                            this.l = (((long) l63VarL.c) * 1000000) / ((long) this.m.E);
                            qVar2.F(0);
                            this.h.d(qVar2, 16, 0);
                            this.i = 2;
                        }
                    } else if (i43 == 2) {
                        int iMin4 = Math.min(qVar.a(), this.n - this.j);
                        this.h.d(qVar, iMin4, 0);
                        int i46 = this.j + iMin4;
                        this.j = i46;
                        if (i46 == this.n) {
                            a.i(this.o != j2);
                            j = j2;
                            this.h.b(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = 0;
                        }
                    }
                    j2 = j;
                }
                break;
        }
    }

    @Override // io.p071bidmachine.media3.extractor.ts.h
    public final void d(o oVar, f0 f0Var) {
        switch (this.a) {
            case 0:
                f0Var.a();
                f0Var.b();
                this.g = f0Var.e;
                f0Var.b();
                this.h = oVar.track(f0Var.d, 1);
                break;
            default:
                f0Var.a();
                f0Var.b();
                this.g = f0Var.e;
                f0Var.b();
                this.h = oVar.track(f0Var.d, 1);
                break;
        }
    }

    @Override // io.p071bidmachine.media3.extractor.ts.h
    public final void packetFinished(boolean z) {
        int i = this.a;
    }

    @Override // io.p071bidmachine.media3.extractor.ts.h
    public final void packetStarted(long j, int i) {
        switch (this.a) {
            case 0:
                this.o = j;
                break;
            default:
                this.o = j;
                break;
        }
    }

    @Override // io.p071bidmachine.media3.extractor.ts.h
    public final void seek() {
        switch (this.a) {
            case 0:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
            default:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        this(null, 0, str, 0);
        this.a = 0;
    }
}
