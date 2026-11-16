package com.google.android.gms.internal.ads;

import defpackage.hq3;
import defpackage.iq3;
import defpackage.jq3;
import defpackage.kq3;
import defpackage.lq3;
import defpackage.m12;
import defpackage.mq3;
import defpackage.nq3;
import defpackage.oq3;
import defpackage.rl3;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaij implements zzago {
    public final zzey a;
    public final m12 b;
    public final boolean c;
    public final zzaof d;
    public int e;
    public zzagr f;
    public jq3 g;
    public long h;
    public lq3[] i;
    public long j;
    public lq3 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    @Override // com.google.android.gms.internal.ads.zzago
    public final void d(zzagr zzagrVar) {
        this.e = 0;
        if (this.c) {
            zzagrVar = new zzaoi(zzagrVar, this.d);
        }
        this.f = zzagrVar;
        this.j = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final void a(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (lq3 lq3Var : this.i) {
            if (lq3Var.l == 0) {
                lq3Var.j = 0;
            } else {
                lq3Var.j = lq3Var.o[zzfq.s(lq3Var.n, j, true)];
            }
        }
        if (j == 0) {
            this.e = this.i.length != 0 ? 3 : 0;
        } else {
            this.e = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final boolean b(zzagp zzagpVar) {
        zzey zzeyVar = this.a;
        zzagpVar.f(0, 12, zzeyVar.a);
        zzeyVar.E(0);
        if (zzeyVar.c() != 1179011410) {
            return false;
        }
        zzeyVar.G(4);
        return zzeyVar.c() == 541677121;
    }

    /* JADX WARN: Code duplicated, block: B:193:0x03c5  */
    @Override // com.google.android.gms.internal.ads.zzago
    public final int c(zzagp zzagpVar, zzaho zzahoVar) throws zzat {
        boolean z;
        lq3 lq3Var;
        long j;
        int i;
        lq3 lq3Var2;
        long j2 = this.j;
        int i2 = 0;
        if (j2 != -1) {
            long jZzn = zzagpVar.zzn();
            if (j2 < jZzn || j2 > 262144 + jZzn) {
                zzahoVar.a = j2;
                z = true;
            } else {
                zzagpVar.zzf((int) (j2 - jZzn));
                z = false;
            }
        } else {
            z = false;
        }
        this.j = -1L;
        if (z) {
            return 1;
        }
        int i3 = this.e;
        lq3 lq3Var3 = null;
        if (i3 == 0) {
            if (!b(zzagpVar)) {
                throw zzat.b("AVI Header List not found", null);
            }
            zzagpVar.zzf(12);
            this.e = 1;
            return 0;
        }
        m12 m12Var = this.b;
        zzey zzeyVar = this.a;
        if (i3 == 1) {
            zzagpVar.h(zzeyVar.a, 0, 12);
            zzeyVar.E(0);
            m12Var.getClass();
            m12Var.b = zzeyVar.c();
            m12Var.c = zzeyVar.c();
            int i4 = m12Var.b;
            if (i4 != 1414744396) {
                StringBuilder sb = new StringBuilder(rl3.c(i4, 22));
                sb.append("LIST expected, found: ");
                sb.append(i4);
                throw zzat.b(sb.toString(), null);
            }
            int iC = zzeyVar.c();
            if (iC == 1819436136) {
                this.l = m12Var.c;
                this.e = 2;
                return 0;
            }
            StringBuilder sb2 = new StringBuilder(rl3.c(iC, 22));
            sb2.append("hdrl expected, found: ");
            sb2.append(iC);
            throw zzat.b(sb2.toString(), null);
        }
        if (i3 == 2) {
            int i5 = 2;
            int i6 = this.l - 4;
            zzey zzeyVar2 = new zzey(i6);
            zzagpVar.h(zzeyVar2.a, 0, i6);
            mq3 mq3VarA = mq3.a(1819436136, zzeyVar2);
            int i7 = mq3VarA.b;
            if (i7 != 1819436136) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(i7).length() + 28);
                sb3.append("Unexpected header list type ");
                sb3.append(i7);
                throw zzat.b(sb3.toString(), null);
            }
            jq3 jq3Var = (jq3) mq3VarA.b(jq3.class);
            if (jq3Var == null) {
                throw zzat.b("AviHeader not found", null);
            }
            this.g = jq3Var;
            this.h = ((long) jq3Var.c) * ((long) jq3Var.a);
            ArrayList arrayList = new ArrayList();
            zzgzb zzgzbVar = mq3VarA.a;
            int size = zzgzbVar.size();
            int i8 = 0;
            int i9 = 0;
            while (i8 < size) {
                hq3 hq3Var = (hq3) zzgzbVar.get(i8);
                if (hq3Var.zza() == 1819440243) {
                    mq3 mq3Var = (mq3) hq3Var;
                    int i10 = i9 + 1;
                    kq3 kq3Var = (kq3) mq3Var.b(kq3.class);
                    nq3 nq3Var = (nq3) mq3Var.b(nq3.class);
                    if (kq3Var == null) {
                        zzeh.c("AviExtractor", "Missing Stream Header");
                    } else if (nq3Var == null) {
                        zzeh.c("AviExtractor", "Missing Stream Format");
                    } else {
                        long jW = zzfq.w(kq3Var.d, ((long) kq3Var.b) * 1000000, kq3Var.c, RoundingMode.DOWN);
                        zzv zzvVar = nq3Var.a;
                        zzt zztVar = new zzt(zzvVar);
                        zztVar.c(i9);
                        int i11 = kq3Var.e;
                        if (i11 != 0) {
                            zztVar.o = i11;
                        }
                        oq3 oq3Var = (oq3) mq3Var.b(oq3.class);
                        if (oq3Var != null) {
                            zztVar.b = oq3Var.a;
                        }
                        int iF = zzas.f(zzvVar.o);
                        if (iF != 1) {
                            if (iF == i5) {
                                iF = 2;
                            }
                            if (lq3Var != null) {
                                arrayList.add(lq3Var);
                            }
                            i9 = i10;
                        }
                        zzaia zzaiaVarB = this.f.b(i9, iF);
                        zzv zzvVar2 = new zzv(zztVar);
                        zzaiaVarB.f(zzvVar2);
                        this.h = Math.max(this.h, jW);
                        lq3Var = new lq3(i9, kq3Var, zzaiaVarB, zzas.d(zzvVar2.o, zzvVar2.k));
                        if (lq3Var != null) {
                            arrayList.add(lq3Var);
                        }
                        i9 = i10;
                    }
                    lq3Var = null;
                    if (lq3Var != null) {
                        arrayList.add(lq3Var);
                    }
                    i9 = i10;
                }
                i8++;
                i5 = 2;
            }
            this.i = (lq3[]) arrayList.toArray(new lq3[0]);
            this.f.zzw();
            this.e = 3;
            return 0;
        }
        int i12 = 4;
        if (i3 == 3) {
            long j3 = this.m;
            if (j3 != -1 && zzagpVar.zzn() != j3) {
                this.j = j3;
                return 0;
            }
            zzagpVar.f(0, 12, zzeyVar.a);
            zzagpVar.zzl();
            zzeyVar.E(0);
            m12Var.getClass();
            m12Var.b = zzeyVar.c();
            m12Var.c = zzeyVar.c();
            int iC2 = zzeyVar.c();
            int i13 = m12Var.b;
            if (i13 == 1179011410) {
                zzagpVar.zzf(12);
                return 0;
            }
            if (i13 != 1414744396 || iC2 != 1769369453) {
                this.j = zzagpVar.zzn() + ((long) m12Var.c) + 8;
                return 0;
            }
            long jZzn2 = zzagpVar.zzn();
            this.m = jZzn2;
            long j4 = jZzn2 + ((long) m12Var.c) + 8;
            this.n = j4;
            if (!this.p) {
                jq3 jq3Var2 = this.g;
                jq3Var2.getClass();
                if ((jq3Var2.b & 16) == 16) {
                    this.e = 4;
                    this.j = j4;
                    return 0;
                }
                this.f.j(new zzahq(this.h, 0L));
                this.p = true;
            }
            this.j = zzagpVar.zzn() + 12;
            this.e = 6;
            return 0;
        }
        if (i3 == 4) {
            zzagpVar.h(zzeyVar.a, 0, 8);
            zzeyVar.E(0);
            int iC3 = zzeyVar.c();
            int iC4 = zzeyVar.c();
            if (iC3 != 829973609) {
                this.j = zzagpVar.zzn() + ((long) iC4);
                return 0;
            }
            this.e = 5;
            this.o = iC4;
            return 0;
        }
        if (i3 != 5) {
            if (zzagpVar.zzn() >= this.n) {
                return -1;
            }
            lq3 lq3Var4 = this.k;
            if (lq3Var4 != null) {
                int i14 = lq3Var4.i;
                zzaia zzaiaVar = lq3Var4.b;
                int iD = i14 - zzaiaVar.d(zzagpVar, i14, false);
                lq3Var4.i = iD;
                boolean z2 = iD == 0;
                if (z2) {
                    if (lq3Var4.h > 0) {
                        int i15 = lq3Var4.j;
                        zzaiaVar.e((lq3Var4.e * ((long) i15)) / ((long) lq3Var4.g), (lq3Var4.f || Arrays.binarySearch(lq3Var4.o, i15) >= 0) ? 1 : 0, lq3Var4.h, 0, null);
                    }
                    lq3Var4.j++;
                }
                if (!z2) {
                    return 0;
                }
                this.k = null;
                return 0;
            }
            if ((zzagpVar.zzn() & 1) == 1) {
                zzagpVar.zzf(1);
            }
            zzagpVar.f(0, 12, zzeyVar.a);
            zzeyVar.E(0);
            int iC5 = zzeyVar.c();
            if (iC5 == 1414744396) {
                zzeyVar.E(8);
                zzagpVar.zzf(zzeyVar.c() != 1769369453 ? 8 : 12);
                zzagpVar.zzl();
                return 0;
            }
            int iC6 = zzeyVar.c();
            if (iC5 == 1263424842) {
                this.j = zzagpVar.zzn() + ((long) iC6) + 8;
                return 0;
            }
            zzagpVar.zzf(8);
            zzagpVar.zzl();
            for (lq3 lq3Var5 : this.i) {
                if (lq3Var5.c == iC5 || lq3Var5.d == iC5) {
                    lq3Var3 = lq3Var5;
                    break;
                }
            }
            if (lq3Var3 == null) {
                this.j = zzagpVar.zzn() + ((long) iC6);
                return 0;
            }
            lq3Var3.h = iC6;
            lq3Var3.i = iC6;
            this.k = lq3Var3;
            return 0;
        }
        zzey zzeyVar3 = new zzey(this.o);
        zzagpVar.h(zzeyVar3.a, 0, this.o);
        if (zzeyVar3.B() < 16) {
            j = 0;
        } else {
            int i16 = zzeyVar3.b;
            zzeyVar3.G(8);
            long jC = zzeyVar3.c();
            long j5 = this.m;
            j = jC > j5 ? 0L : j5 + 8;
            zzeyVar3.E(i16);
        }
        while (zzeyVar3.B() >= 16) {
            int iC7 = zzeyVar3.c();
            int iC8 = zzeyVar3.c();
            int i17 = i2;
            long jC2 = ((long) zzeyVar3.c()) + j;
            zzeyVar3.G(i12);
            lq3[] lq3VarArr = this.i;
            int length = lq3VarArr.length;
            int i18 = i17;
            while (true) {
                if (i18 >= length) {
                    lq3Var2 = null;
                    break;
                }
                lq3Var2 = lq3VarArr[i18];
                if (lq3Var2.c == iC7 || lq3Var2.d == iC7) {
                    break;
                }
                i18++;
            }
            if (lq3Var2 != null) {
                int i19 = (iC8 & 16) == 16 ? 1 : i17;
                if (lq3Var2.m == -1) {
                    lq3Var2.m = jC2;
                }
                if (i19 != 0 || lq3Var2.f) {
                    if (lq3Var2.l == lq3Var2.o.length) {
                        long[] jArr = lq3Var2.n;
                        lq3Var2.n = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                        int[] iArr = lq3Var2.o;
                        lq3Var2.o = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                    }
                    long[] jArr2 = lq3Var2.n;
                    int i20 = lq3Var2.l;
                    jArr2[i20] = jC2;
                    lq3Var2.o[i20] = lq3Var2.k;
                    lq3Var2.l = i20 + 1;
                }
                lq3Var2.k++;
            }
            i2 = i17;
            i12 = 4;
        }
        int i21 = i2;
        lq3[] lq3VarArr2 = this.i;
        int length2 = lq3VarArr2.length;
        for (int i22 = i21; i22 < length2; i22++) {
            lq3 lq3Var6 = lq3VarArr2[i22];
            lq3Var6.n = Arrays.copyOf(lq3Var6.n, lq3Var6.l);
            lq3Var6.o = Arrays.copyOf(lq3Var6.o, lq3Var6.l);
            if (lq3Var6.f && lq3Var6.a.f != 0 && (i = lq3Var6.l) > 0) {
                lq3Var6.g = i;
            }
        }
        this.p = true;
        int length3 = this.i.length;
        zzagr zzagrVar = this.f;
        long j6 = this.h;
        if (length3 == 0) {
            zzagrVar.j(new zzahq(j6, 0L));
        } else {
            zzagrVar.j(new iq3(this, j6));
        }
        this.e = 6;
        this.j = this.m;
        return i21;
    }

    public zzaij(int i, zzaof zzaofVar) {
        this.d = zzaofVar;
        this.c = 1 == (i ^ 1);
        this.a = new zzey(12);
        this.b = new m12((byte) 0, 3);
        this.f = new zzahn();
        this.i = new lq3[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Deprecated
    public zzaij() {
        this(1, zzaof.b9);
    }
}
