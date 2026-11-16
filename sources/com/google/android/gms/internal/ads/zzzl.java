package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import defpackage.ad5;
import defpackage.cd5;
import defpackage.dd5;
import defpackage.eb1;
import defpackage.ip;
import defpackage.yc5;
import io.p071bidmachine.media3.exoplayer.source.w0;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzzl implements zzaia {
    public zzv B;
    public boolean D;
    public boolean E;
    public long F;
    public int G;
    public final ad5 a;
    public final zzux d;
    public yc5 e;
    public zzv f;
    public zzuq g;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean y;
    public final ip b = new ip(8);
    public int h = 1000;
    public long[] i = new long[1000];
    public long[] j = new long[1000];
    public long[] m = new long[1000];
    public int[] l = new int[1000];
    public int[] k = new int[1000];
    public zzahz[] n = new zzahz[1000];
    public final eb1 c = new eb1();
    public long s = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean A = true;
    public boolean z = true;
    public boolean C = true;
    public long t = Long.MIN_VALUE;
    public int w = -1;
    public int x = -1;

    /* JADX WARN: Code duplicated, block: B:18:0x004f A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:4:0x0002, B:8:0x000e, B:13:0x0020, B:15:0x0038, B:19:0x0051, B:21:0x005f, B:25:0x0068, B:18:0x004f), top: B:35:0x0002 }] */
    @Override // com.google.android.gms.internal.ads.zzaia
    public final void f(zzv zzvVar) {
        boolean z;
        synchronized (this) {
            z = false;
            try {
                this.A = false;
                if (!Objects.equals(zzvVar, this.B)) {
                    eb1 eb1Var = this.c;
                    if (((SparseArray) eb1Var.c).size() == 0) {
                        this.B = zzvVar;
                    } else {
                        SparseArray sparseArray = (SparseArray) eb1Var.c;
                        if (((dd5) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(zzvVar)) {
                            SparseArray sparseArray2 = (SparseArray) eb1Var.c;
                            this.B = ((dd5) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                        } else {
                            this.B = zzvVar;
                        }
                    }
                    boolean z2 = this.C;
                    zzv zzvVar2 = this.B;
                    String str = zzvVar2.o;
                    this.C = z2 & (zzas.f(str) == 1 && zzas.d(str, zzvVar2.k));
                    this.D = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        yc5 yc5Var = this.e;
        if (yc5Var == null || !z) {
            return;
        }
        yc5Var.o.post(yc5Var.m);
    }

    public final int j(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.m[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.l[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.h) {
                i = 0;
            }
        }
        return i3;
    }

    public final synchronized zzv n() {
        if (this.A) {
            return null;
        }
        return this.B;
    }

    public final synchronized boolean o(boolean z) {
        int i;
        try {
            int i2 = this.p;
            int i3 = this.r;
            int i4 = i2 + i3;
            int i5 = this.w;
            boolean z2 = true;
            if (i5 != -1 && i4 >= i5) {
                return true;
            }
            if (i3 != this.o) {
                if (!(i5 == -1 && (i = this.x) != -1 && i2 + i3 >= i)) {
                    if (((dd5) this.c.i(i4)).a != this.f) {
                        return true;
                    }
                    int iL = l(this.r);
                    if (this.g != null) {
                        int i6 = this.l[iL];
                        z2 = false;
                    }
                    return z2;
                }
            }
            if (!z && !this.y) {
                zzv zzvVar = this.B;
                if (zzvVar == null) {
                    z2 = false;
                } else if (zzvVar == this.f) {
                    return false;
                }
            }
            return z2;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0094 */
    /* JADX WARN: Code duplicated, block: B:26:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean p(long r12, boolean r14) throws java.lang.Throwable {
        /*
            r11 = this;
            monitor-enter(r11)
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L85
            r0 = 0
            r11.r = r0     // Catch: java.lang.Throwable -> L8d
            ad5 r1 = r11.a     // Catch: java.lang.Throwable -> L8d
            io.bidmachine.media3.exoplayer.source.w0 r2 = r1.c     // Catch: java.lang.Throwable -> L8d
            r1.d = r2     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L8a
            int r4 = r11.l(r0)     // Catch: java.lang.Throwable -> L80
            long r1 = r11.t     // Catch: java.lang.Throwable -> L80
            r5 = -9223372036854775808
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            long r5 = r11.v
            if (r3 == 0) goto L24
            long r5 = java.lang.Math.min(r5, r1)     // Catch: java.lang.Throwable -> L1f
            goto L24
        L1f:
            r0 = move-exception
            r12 = r0
            r3 = r11
            goto L96
        L24:
            int r1 = r11.r     // Catch: java.lang.Throwable -> L85
            int r2 = r11.o     // Catch: java.lang.Throwable -> L85
            r9 = 1
            if (r1 == r2) goto L2d
            r3 = r9
            goto L2e
        L2d:
            r3 = r0
        L2e:
            if (r3 == 0) goto L40
            long[] r3 = r11.m     // Catch: java.lang.Throwable -> L80
            r7 = r3[r4]     // Catch: java.lang.Throwable -> L80
            int r3 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r3 < 0) goto L40
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 <= 0) goto L42
            if (r14 == 0) goto L40
            r14 = r9
            goto L42
        L40:
            r3 = r11
            goto L83
        L42:
            boolean r3 = r11.C     // Catch: java.lang.Throwable -> L80
            r10 = -1
            if (r3 == 0) goto L68
            int r2 = r2 - r1
            r1 = r0
        L49:
            if (r1 >= r2) goto L61
            long[] r3 = r11.m     // Catch: java.lang.Throwable -> L1f
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L1f
            int r3 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r3 >= 0) goto L5d
            int r4 = r4 + 1
            int r3 = r11.h     // Catch: java.lang.Throwable -> L1f
            if (r4 != r3) goto L5a
            r4 = r0
        L5a:
            int r1 = r1 + 1
            goto L49
        L5d:
            r3 = r11
            r6 = r12
            r2 = r1
            goto L71
        L61:
            r3 = r11
            r6 = r12
            if (r14 == 0) goto L66
            goto L71
        L66:
            r2 = r10
            goto L71
        L68:
            int r5 = r2 - r1
            r8 = 1
            r3 = r11
            r6 = r12
            int r2 = r3.j(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L7d
        L71:
            if (r2 != r10) goto L74
            goto L83
        L74:
            r3.s = r6     // Catch: java.lang.Throwable -> L7d
            int r11 = r3.r     // Catch: java.lang.Throwable -> L7d
            int r11 = r11 + r2
            r3.r = r11     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r3)
            return r9
        L7d:
            r0 = move-exception
        L7e:
            r12 = r0
            goto L96
        L80:
            r0 = move-exception
            r3 = r11
            goto L7e
        L83:
            monitor-exit(r3)
            return r0
        L85:
            r0 = move-exception
            r3 = r11
        L87:
            r11 = r0
            r12 = r11
            goto L96
        L8a:
            r0 = move-exception
            r3 = r11
            goto L87
        L8d:
            r0 = move-exception
            r3 = r11
        L8f:
            r11 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L94
            throw r11     // Catch: java.lang.Throwable -> L92
        L92:
            r0 = move-exception
            goto L87
        L94:
            r0 = move-exception
            goto L8f
        L96:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7d
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzl.p(long, boolean):boolean");
    }

    public final void a() {
        long jK;
        ad5 ad5Var = this.a;
        synchronized (this) {
            int i = this.o;
            jK = i == 0 ? -1L : k(i);
        }
        ad5Var.a(jK);
    }

    @Override // com.google.android.gms.internal.ads.zzaia
    public final int c(zzj zzjVar, int i, boolean z) throws EOFException {
        ad5 ad5Var = this.a;
        int iB = ad5Var.b(i);
        w0 w0Var = ad5Var.e;
        zzabt zzabtVar = (zzabt) w0Var.c;
        byte[] bArr = zzabtVar.a;
        long j = ad5Var.f - w0Var.a;
        zzabtVar.getClass();
        int i2 = zzjVar.i(bArr, (int) j, iB);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            defpackage.d.s();
            return 0;
        }
        long j2 = ad5Var.f + ((long) i2);
        ad5Var.f = j2;
        w0 w0Var2 = ad5Var.e;
        if (j2 == w0Var2.b) {
            ad5Var.e = (w0) w0Var2.d;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:82:0x0136 A[Catch: all -> 0x009e, TryCatch #0 {all -> 0x009e, blocks: (B:39:0x0080, B:41:0x0084, B:45:0x009a, B:48:0x00a1, B:52:0x00a9, B:75:0x00ee, B:80:0x011d, B:101:0x0186, B:103:0x018f, B:82:0x0136, B:84:0x013a, B:86:0x014c, B:90:0x0155, B:91:0x015a, B:93:0x0160, B:97:0x016e, B:99:0x0173, B:100:0x0183, B:109:0x01fd, B:55:0x00c1, B:74:0x00ec, B:60:0x00ca, B:62:0x00ce, B:63:0x00d1, B:65:0x00db, B:69:0x00e2, B:73:0x00ea), top: B:112:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x013a A[Catch: all -> 0x009e, TryCatch #0 {all -> 0x009e, blocks: (B:39:0x0080, B:41:0x0084, B:45:0x009a, B:48:0x00a1, B:52:0x00a9, B:75:0x00ee, B:80:0x011d, B:101:0x0186, B:103:0x018f, B:82:0x0136, B:84:0x013a, B:86:0x014c, B:90:0x0155, B:91:0x015a, B:93:0x0160, B:97:0x016e, B:99:0x0173, B:100:0x0183, B:109:0x01fd, B:55:0x00c1, B:74:0x00ec, B:60:0x00ca, B:62:0x00ce, B:63:0x00d1, B:65:0x00db, B:69:0x00e2, B:73:0x00ea), top: B:112:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x014c A[Catch: all -> 0x009e, TryCatch #0 {all -> 0x009e, blocks: (B:39:0x0080, B:41:0x0084, B:45:0x009a, B:48:0x00a1, B:52:0x00a9, B:75:0x00ee, B:80:0x011d, B:101:0x0186, B:103:0x018f, B:82:0x0136, B:84:0x013a, B:86:0x014c, B:90:0x0155, B:91:0x015a, B:93:0x0160, B:97:0x016e, B:99:0x0173, B:100:0x0183, B:109:0x01fd, B:55:0x00c1, B:74:0x00ec, B:60:0x00ca, B:62:0x00ce, B:63:0x00d1, B:65:0x00db, B:69:0x00e2, B:73:0x00ea), top: B:112:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0152  */
    /* JADX WARN: Code duplicated, block: B:89:0x0154  */
    /* JADX WARN: Code duplicated, block: B:93:0x0160 A[Catch: all -> 0x009e, TryCatch #0 {all -> 0x009e, blocks: (B:39:0x0080, B:41:0x0084, B:45:0x009a, B:48:0x00a1, B:52:0x00a9, B:75:0x00ee, B:80:0x011d, B:101:0x0186, B:103:0x018f, B:82:0x0136, B:84:0x013a, B:86:0x014c, B:90:0x0155, B:91:0x015a, B:93:0x0160, B:97:0x016e, B:99:0x0173, B:100:0x0183, B:109:0x01fd, B:55:0x00c1, B:74:0x00ec, B:60:0x00ca, B:62:0x00ce, B:63:0x00d1, B:65:0x00db, B:69:0x00e2, B:73:0x00ea), top: B:112:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x016b  */
    /* JADX WARN: Code duplicated, block: B:96:0x016d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0173 A[Catch: all -> 0x009e, TryCatch #0 {all -> 0x009e, blocks: (B:39:0x0080, B:41:0x0084, B:45:0x009a, B:48:0x00a1, B:52:0x00a9, B:75:0x00ee, B:80:0x011d, B:101:0x0186, B:103:0x018f, B:82:0x0136, B:84:0x013a, B:86:0x014c, B:90:0x0155, B:91:0x015a, B:93:0x0160, B:97:0x016e, B:99:0x0173, B:100:0x0183, B:109:0x01fd, B:55:0x00c1, B:74:0x00ec, B:60:0x00ca, B:62:0x00ce, B:63:0x00d1, B:65:0x00db, B:69:0x00e2, B:73:0x00ea), top: B:112:0x0080 }] */
    @Override // com.google.android.gms.internal.ads.zzaia
    public final void e(long j, int i, int i2, int i3, zzahz zzahzVar) {
        int i4;
        int i5;
        zzv zzvVar;
        int i6;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z;
        boolean z2;
        if (this.E) {
            if (Math.abs(j - this.F) <= 1000) {
                int i7 = this.G;
                if (i7 > 1) {
                    this.G = i7 - 1;
                } else {
                    this.E = false;
                }
                h(i2, i3);
                return;
            }
            if ((i & 1) == 0 || j <= this.v + 1000) {
                h(i2, i3);
                return;
            }
            this.E = false;
        }
        int i8 = i & 1;
        if (this.z) {
            if (i8 == 0) {
                h(i2, i3);
                return;
            }
            this.z = false;
        }
        if (!this.C) {
            i4 = i;
        } else if (j < this.s) {
            h(i2, i3);
            return;
        } else if (i8 == 0) {
            if (!this.D) {
                zzeh.c("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.B)));
                this.D = true;
            }
            i4 = i | 1;
        } else {
            i4 = i;
        }
        long j2 = (this.a.f - ((long) i2)) - ((long) i3);
        synchronized (this) {
            try {
                int i9 = this.o;
                if (i9 > 0) {
                    int iL = l(i9 - 1);
                    zzgvz.a(this.j[iL] + ((long) this.k[iL]) <= j2);
                }
                int i10 = 536870912 & i4;
                this.y = i10 != 0;
                this.v = Math.max(this.v, j);
                int i11 = this.p;
                int i12 = this.o;
                int i13 = i11 + i12;
                long j3 = this.t;
                if (j3 != Long.MIN_VALUE && this.w == -1) {
                    if (j >= j3) {
                        int i14 = this.x;
                        if (i14 == -1) {
                            this.x = i13;
                            i14 = i13;
                        }
                        int i15 = (i13 - i14) + 1;
                        int i16 = i4 & 1;
                        zzv zzvVar2 = this.B;
                        int i17 = 16;
                        if (zzvVar2 != null && (i5 = zzvVar2.q) != -1) {
                            i17 = i5;
                        }
                        if (i15 >= i17 + 1 || i16 != 0 || i10 != 0) {
                            this.w = i14;
                        }
                    }
                    this.x = -1;
                }
                int iL2 = l(i12);
                this.m[iL2] = j;
                this.j[iL2] = j2;
                this.k[iL2] = i2;
                this.l[iL2] = i4;
                this.n[iL2] = zzahzVar;
                this.i[iL2] = 0;
                eb1 eb1Var = this.c;
                if (((SparseArray) eb1Var.c).size() == 0) {
                    zzvVar = this.B;
                    if (zzvVar != null) {
                        throw null;
                    }
                    i6 = this.p + this.o;
                    dd5 dd5Var = new dd5(zzvVar);
                    sparseArray = (SparseArray) eb1Var.c;
                    if (eb1Var.b == -1) {
                        if (sparseArray.size() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zzgvz.f(z2);
                        eb1Var.b = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i6 >= iKeyAt) {
                            z = true;
                        } else {
                            z = false;
                        }
                        zzgvz.a(z);
                        if (iKeyAt == i6) {
                            ((cd5) eb1Var.d).mo82zza(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i6, dd5Var);
                } else {
                    SparseArray sparseArray2 = (SparseArray) eb1Var.c;
                    if (!((dd5) sparseArray2.valueAt(sparseArray2.size() - 1)).a.equals(this.B)) {
                        zzvVar = this.B;
                        if (zzvVar != null) {
                            throw null;
                        }
                        i6 = this.p + this.o;
                        dd5 dd5Var2 = new dd5(zzvVar);
                        sparseArray = (SparseArray) eb1Var.c;
                        if (eb1Var.b == -1) {
                            if (sparseArray.size() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zzgvz.f(z2);
                            eb1Var.b = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i6 >= iKeyAt) {
                                z = true;
                            } else {
                                z = false;
                            }
                            zzgvz.a(z);
                            if (iKeyAt == i6) {
                                ((cd5) eb1Var.d).mo82zza(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i6, dd5Var2);
                    }
                }
                int i18 = this.o + 1;
                this.o = i18;
                int i19 = this.h;
                if (i18 == i19) {
                    int i20 = i19 + 1000;
                    long[] jArr = new long[i20];
                    long[] jArr2 = new long[i20];
                    long[] jArr3 = new long[i20];
                    int[] iArr = new int[i20];
                    int[] iArr2 = new int[i20];
                    zzahz[] zzahzVarArr = new zzahz[i20];
                    int i21 = this.q;
                    int i22 = i19 - i21;
                    System.arraycopy(this.j, i21, jArr2, 0, i22);
                    System.arraycopy(this.m, this.q, jArr3, 0, i22);
                    System.arraycopy(this.l, this.q, iArr, 0, i22);
                    System.arraycopy(this.k, this.q, iArr2, 0, i22);
                    System.arraycopy(this.n, this.q, zzahzVarArr, 0, i22);
                    System.arraycopy(this.i, this.q, jArr, 0, i22);
                    int i23 = this.q;
                    System.arraycopy(this.j, 0, jArr2, i22, i23);
                    System.arraycopy(this.m, 0, jArr3, i22, i23);
                    System.arraycopy(this.l, 0, iArr, i22, i23);
                    System.arraycopy(this.k, 0, iArr2, i22, i23);
                    System.arraycopy(this.n, 0, zzahzVarArr, i22, i23);
                    System.arraycopy(this.i, 0, jArr, i22, i23);
                    this.j = jArr2;
                    this.m = jArr3;
                    this.l = iArr;
                    this.k = iArr2;
                    this.n = zzahzVarArr;
                    this.i = jArr;
                    this.q = 0;
                    this.h = i20;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaia
    public final void g(zzey zzeyVar, int i, int i2) {
        while (true) {
            ad5 ad5Var = this.a;
            if (i <= 0) {
                ad5Var.getClass();
                return;
            }
            int iB = ad5Var.b(i);
            w0 w0Var = ad5Var.e;
            zzabt zzabtVar = (zzabt) w0Var.c;
            byte[] bArr = zzabtVar.a;
            long j = ad5Var.f - w0Var.a;
            zzabtVar.getClass();
            zzeyVar.H((int) j, iB, bArr);
            i -= iB;
            long j2 = ad5Var.f + ((long) iB);
            ad5Var.f = j2;
            w0 w0Var2 = ad5Var.e;
            if (j2 == w0Var2.b) {
                ad5Var.e = (w0) w0Var2.d;
            }
        }
    }

    public final void h(int i, int i2) {
        w0 w0Var;
        if (i2 == 0) {
            ad5 ad5Var = this.a;
            long j = ad5Var.f;
            long j2 = j - ((long) i);
            zzabv zzabvVar = ad5Var.a;
            zzgvz.a(j2 <= j);
            ad5Var.f = j2;
            if (j2 != 0) {
                w0 w0Var2 = ad5Var.c;
                if (j2 != w0Var2.a) {
                    while (true) {
                        long j3 = ad5Var.f;
                        long j4 = w0Var2.b;
                        w0Var = (w0) w0Var2.d;
                        if (j3 <= j4) {
                            break;
                        } else {
                            w0Var2 = w0Var;
                        }
                    }
                    w0Var.getClass();
                    if (((zzabt) w0Var.c) != null) {
                        zzabvVar.b(w0Var);
                        w0Var.c = null;
                        w0Var.d = null;
                    }
                    w0 w0Var3 = new w0(w0Var2.b);
                    w0Var2.d = w0Var3;
                    if (ad5Var.f == w0Var2.b) {
                        w0Var2 = w0Var3;
                    }
                    ad5Var.e = w0Var2;
                    if (ad5Var.d == w0Var) {
                        ad5Var.d = w0Var3;
                        return;
                    }
                    return;
                }
            }
            w0 w0Var4 = ad5Var.c;
            if (((zzabt) w0Var4.c) != null) {
                zzabvVar.b(w0Var4);
                w0Var4.c = null;
                w0Var4.d = null;
            }
            w0 w0Var5 = new w0(ad5Var.f);
            ad5Var.c = w0Var5;
            ad5Var.d = w0Var5;
            ad5Var.e = w0Var5;
        }
    }

    public final void i(zzv zzvVar, zzme zzmeVar) {
        zzv zzvVar2 = this.f;
        zzq zzqVar = zzvVar2 == null ? null : zzvVar2.s;
        this.f = zzvVar;
        zzq zzqVar2 = zzvVar.s;
        zzux zzuxVar = this.d;
        int iC = zzuxVar.c(zzvVar);
        zzt zztVar = new zzt(zzvVar);
        zztVar.O = iC;
        zzmeVar.b = new zzv(zztVar);
        zzmeVar.a = this.g;
        if (zzvVar2 == null || !Objects.equals(zzqVar, zzqVar2)) {
            zzuy zzuyVarB = zzuxVar.b(zzvVar);
            this.g = zzuyVarB;
            zzmeVar.a = zzuyVarB;
        }
    }

    public final long k(int i) {
        long j = this.u;
        int i2 = 0;
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int iL = l(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                jMax = Math.max(jMax, this.m[iL]);
                if ((this.l[iL] & 1) != 0) {
                    break;
                }
                iL--;
                if (iL == -1) {
                    iL = this.h - 1;
                }
            }
        }
        this.u = Math.max(j, jMax);
        this.o -= i;
        int i4 = this.p + i;
        this.p = i4;
        int i5 = this.q + i;
        this.q = i5;
        int i6 = this.h;
        if (i5 >= i6) {
            this.q = i5 - i6;
        }
        int i7 = this.r - i;
        this.r = i7;
        if (i7 < 0) {
            this.r = 0;
        }
        while (true) {
            eb1 eb1Var = this.c;
            SparseArray sparseArray = (SparseArray) eb1Var.c;
            if (i2 >= sparseArray.size() - 1) {
                break;
            }
            int i8 = i2 + 1;
            if (i4 < sparseArray.keyAt(i8)) {
                break;
            }
            ((cd5) eb1Var.d).mo82zza(sparseArray.valueAt(i2));
            sparseArray.removeAt(i2);
            int i9 = eb1Var.b;
            if (i9 > 0) {
                eb1Var.b = i9 - 1;
            }
            i2 = i8;
        }
        if (this.o != 0) {
            return this.j[this.q];
        }
        int i10 = this.q;
        if (i10 == 0) {
            i10 = this.h;
        }
        int i11 = i10 - 1;
        return this.j[i11] + ((long) this.k[i11]);
    }

    public final int l(int i) {
        int i2 = this.q + i;
        int i3 = this.h;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final void m(boolean z) {
        eb1 eb1Var;
        SparseArray sparseArray;
        ad5 ad5Var = this.a;
        w0 w0Var = ad5Var.c;
        zzabv zzabvVar = ad5Var.a;
        if (((zzabt) w0Var.c) != null) {
            zzabvVar.b(w0Var);
            w0Var.c = null;
            w0Var.d = null;
        }
        w0 w0Var2 = ad5Var.c;
        int i = 0;
        zzgvz.f(((zzabt) w0Var2.c) == null);
        w0Var2.a = 0L;
        w0Var2.b = 65536L;
        w0 w0Var3 = ad5Var.c;
        ad5Var.d = w0Var3;
        ad5Var.e = w0Var3;
        ad5Var.f = 0L;
        zzabvVar.zzd();
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.w = -1;
        this.x = -1;
        this.z = true;
        this.s = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.y = false;
        this.E = false;
        while (true) {
            eb1Var = this.c;
            sparseArray = (SparseArray) eb1Var.c;
            if (i >= sparseArray.size()) {
                break;
            }
            ((cd5) eb1Var.d).mo82zza(sparseArray.valueAt(i));
            i++;
        }
        eb1Var.b = -1;
        sparseArray.clear();
        if (z) {
            this.B = null;
            this.A = true;
            this.C = true;
        }
    }

    public zzzl(zzabv zzabvVar, zzux zzuxVar, zzus zzusVar) {
        this.d = zzuxVar;
        this.a = new ad5(zzabvVar);
    }
}
