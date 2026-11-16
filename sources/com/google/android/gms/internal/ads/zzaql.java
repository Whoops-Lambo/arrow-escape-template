package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaql implements zzaqp {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public zzaia h;
    public zzaia i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public zzaia v;
    public long w;
    public final zzet b = new zzet(new byte[7], 7);
    public final zzey c = new zzey(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = 256;

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final void a(int i, long j) {
        this.u = j;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:123:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x030d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzaqp
    public final void b(zzey zzeyVar) throws zzat {
        int i;
        int i2;
        char c;
        int i3;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        int i9;
        int i10;
        this.h.getClass();
        String str = zzfq.a;
        while (zzeyVar.B() > 0) {
            int i11 = this.j;
            zzey zzeyVar2 = this.c;
            zzet zzetVar = this.b;
            byte b = -1;
            int i12 = 4;
            int i13 = 3;
            int i14 = 0;
            int i15 = 1;
            if (i11 == 0) {
                byte[] bArr = zzeyVar.a;
                int i16 = zzeyVar.b;
                int i17 = zzeyVar.c;
                while (true) {
                    if (i16 < i17) {
                        int i18 = i16 + 1;
                        int i19 = i13;
                        byte b2 = bArr[i16];
                        int i20 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (this.l == 512 && (((((((byte) i20) & 255) == true ? 1 : 0) | 65280) == true ? 1 : 0) & 65526) == 65520) {
                            if (!this.n) {
                                int i21 = i16 - 1;
                                zzeyVar.E(i16);
                                byte[] bArr2 = zzetVar.a;
                                if (zzeyVar.B() < i15) {
                                    i15 = i15;
                                } else {
                                    zzeyVar.H(i14, i15, bArr2);
                                    zzetVar.d(i12);
                                    int iH = zzetVar.h(i15);
                                    int i22 = this.o;
                                    if (i22 == -1 || iH == i22) {
                                        if (this.p != -1) {
                                            byte[] bArr3 = zzetVar.a;
                                            if (zzeyVar.B() >= i15) {
                                                zzeyVar.H(i14, i15, bArr3);
                                                zzetVar.d(2);
                                                i8 = 4;
                                                i6 = i15;
                                                if (zzetVar.h(4) == this.p) {
                                                    zzeyVar.E(i18);
                                                } else {
                                                    i15 = i6;
                                                }
                                            }
                                        } else {
                                            i6 = i15;
                                            i8 = 4;
                                        }
                                        byte[] bArr4 = zzetVar.a;
                                        if (zzeyVar.B() >= i8) {
                                            zzeyVar.H(i14, i8, bArr4);
                                            zzetVar.d(14);
                                            int iH2 = zzetVar.h(13);
                                            if (iH2 >= 7) {
                                                byte[] bArr5 = zzeyVar.a;
                                                int i23 = zzeyVar.c;
                                                int i24 = i21 + iH2;
                                                if (i24 < i23) {
                                                    byte b3 = bArr5[i24];
                                                    b = -1;
                                                    if (b3 == -1) {
                                                        int i25 = i24 + 1;
                                                        if (i25 != i23) {
                                                            int i26 = bArr5[i25];
                                                            if ((((((i26 & 255) == true ? 1 : 0) | 65280) == true ? 1 : 0) & 65526) == 65520 && ((i26 & 8) >> 3) == iH) {
                                                            }
                                                        }
                                                    } else if (b3 == 73 && ((i9 = i24 + 1) == i23 || (bArr5[i9] == 68 && ((i10 = i24 + 2) == i23 || bArr5[i10] == 51)))) {
                                                    }
                                                }
                                            } else {
                                                b = -1;
                                            }
                                            i15 = i6;
                                        }
                                        this.q = (b2 & 8) >> 3;
                                        i7 = i6;
                                        if (i7 != ((b2 & 1) ^ 1)) {
                                            z = 0;
                                        } else {
                                            z = i7;
                                        }
                                        this.m = z;
                                        if (this.n) {
                                            this.j = i19;
                                            this.k = 0;
                                        } else {
                                            this.j = i7;
                                            this.k = 0;
                                        }
                                        zzeyVar.E(i18);
                                    } else {
                                        b = -1;
                                    }
                                    i = this.l;
                                    i2 = i20 | i;
                                    if (i2 == 329) {
                                        c = 256;
                                        i3 = 3;
                                        c2 = 2;
                                        i4 = 0;
                                        i5 = 768;
                                    } else if (i2 == 511) {
                                        c = 256;
                                        i3 = 3;
                                        c2 = 2;
                                        i4 = 0;
                                        i5 = 512;
                                    } else if (i2 == 836) {
                                        c = 256;
                                        i3 = 3;
                                        c2 = 2;
                                        i4 = 0;
                                        i5 = 1024;
                                    } else if (i2 != 1075) {
                                        c = 256;
                                        if (i != 256) {
                                            this.l = 256;
                                            i12 = 4;
                                            i13 = 3;
                                            i14 = 0;
                                        } else {
                                            i3 = 3;
                                            c2 = 2;
                                            i4 = 0;
                                            int i27 = i4;
                                            i13 = i3;
                                            i14 = i27;
                                            i16 = i18;
                                            i12 = 4;
                                        }
                                    } else {
                                        this.j = 2;
                                        this.k = 3;
                                        this.t = 0;
                                        zzeyVar2.E(0);
                                        zzeyVar.E(i18);
                                    }
                                    this.l = i5;
                                    int i28 = i4;
                                    i13 = i3;
                                    i14 = i28;
                                    i16 = i18;
                                    i12 = 4;
                                }
                                b = -1;
                                i = this.l;
                                i2 = i20 | i;
                                if (i2 == 329) {
                                    c = 256;
                                    i3 = 3;
                                    c2 = 2;
                                    i4 = 0;
                                    i5 = 768;
                                } else if (i2 == 511) {
                                    c = 256;
                                    i3 = 3;
                                    c2 = 2;
                                    i4 = 0;
                                    i5 = 512;
                                } else if (i2 == 836) {
                                    c = 256;
                                    i3 = 3;
                                    c2 = 2;
                                    i4 = 0;
                                    i5 = 1024;
                                } else if (i2 != 1075) {
                                    c = 256;
                                    if (i != 256) {
                                        this.l = 256;
                                        i12 = 4;
                                        i13 = 3;
                                        i14 = 0;
                                    } else {
                                        i3 = 3;
                                        c2 = 2;
                                        i4 = 0;
                                        int i29 = i4;
                                        i13 = i3;
                                        i14 = i29;
                                        i16 = i18;
                                        i12 = 4;
                                    }
                                } else {
                                    this.j = 2;
                                    this.k = 3;
                                    this.t = 0;
                                    zzeyVar2.E(0);
                                    zzeyVar.E(i18);
                                }
                                this.l = i5;
                                int i210 = i4;
                                i13 = i3;
                                i14 = i210;
                                i16 = i18;
                                i12 = 4;
                            }
                            i6 = i15;
                            this.q = (b2 & 8) >> 3;
                            i7 = i6;
                            if (i7 != ((b2 & 1) ^ 1)) {
                                z = 0;
                            } else {
                                z = i7;
                            }
                            this.m = z;
                            if (this.n) {
                                this.j = i7;
                                this.k = 0;
                            } else {
                                this.j = i19;
                                this.k = 0;
                            }
                            zzeyVar.E(i18);
                        } else {
                            b = b;
                        }
                        i15 = i15;
                        i = this.l;
                        i2 = i20 | i;
                        if (i2 == 329) {
                            c = 256;
                            i3 = 3;
                            c2 = 2;
                            i4 = 0;
                            i5 = 768;
                        } else if (i2 == 511) {
                            c = 256;
                            i3 = 3;
                            c2 = 2;
                            i4 = 0;
                            i5 = 512;
                        } else if (i2 == 836) {
                            c = 256;
                            i3 = 3;
                            c2 = 2;
                            i4 = 0;
                            i5 = 1024;
                        } else if (i2 != 1075) {
                            c = 256;
                            if (i != 256) {
                                this.l = 256;
                                i12 = 4;
                                i13 = 3;
                                i14 = 0;
                            } else {
                                i3 = 3;
                                c2 = 2;
                                i4 = 0;
                                int i211 = i4;
                                i13 = i3;
                                i14 = i211;
                                i16 = i18;
                                i12 = 4;
                            }
                        } else {
                            this.j = 2;
                            this.k = 3;
                            this.t = 0;
                            zzeyVar2.E(0);
                            zzeyVar.E(i18);
                        }
                        this.l = i5;
                        int i212 = i4;
                        i13 = i3;
                        i14 = i212;
                        i16 = i18;
                        i12 = 4;
                    } else {
                        zzeyVar.E(i16);
                    }
                }
            } else if (i11 != 1) {
                if (i11 == 2) {
                    byte[] bArr6 = zzeyVar2.a;
                    int iMin = Math.min(zzeyVar.B(), 10 - this.k);
                    zzeyVar.H(this.k, iMin, bArr6);
                    int i30 = this.k + iMin;
                    this.k = i30;
                    if (i30 == 10) {
                        this.i.b(10, zzeyVar2);
                        zzeyVar2.E(6);
                        zzaia zzaiaVar = this.i;
                        int iG = zzeyVar2.g() + 10;
                        this.j = 4;
                        this.k = 10;
                        this.v = zzaiaVar;
                        this.w = 0L;
                        this.t = iG;
                    }
                } else if (i11 != 3) {
                    int iMin2 = Math.min(zzeyVar.B(), this.t - this.k);
                    this.v.b(iMin2, zzeyVar);
                    int i31 = this.k + iMin2;
                    this.k = i31;
                    if (i31 == this.t) {
                        zzgvz.f(this.u != -9223372036854775807L);
                        this.v.e(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = 0;
                        this.k = 0;
                        this.l = 256;
                    }
                } else {
                    int i32 = true != this.m ? 5 : 7;
                    byte[] bArr7 = zzetVar.a;
                    int iMin3 = Math.min(zzeyVar.B(), i32 - this.k);
                    zzeyVar.H(this.k, iMin3, bArr7);
                    int i33 = this.k + iMin3;
                    this.k = i33;
                    if (i33 == i32) {
                        zzetVar.d(0);
                        if (this.r) {
                            zzetVar.f(10);
                        } else {
                            int iH3 = zzetVar.h(2) + 1;
                            if (iH3 != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(iH3).length() + 50);
                                sb.append("Detected audio object type: ");
                                sb.append(iH3);
                                sb.append(", but assuming AAC LC.");
                                zzeh.c("AdtsReader", sb.toString());
                            }
                            zzetVar.f(5);
                            int iH4 = zzetVar.h(3);
                            int i34 = this.p;
                            byte[] bArr8 = {(byte) (((i34 >> 1) & 7) | 16), (byte) (((iH4 << 3) & com.safedk.android.analytics.brandsafety.b.v) | ((i34 << 7) & 128))};
                            zzafl zzaflVarA = zzafm.a(new zzet(bArr8, 2), false);
                            zzt zztVar = new zzt();
                            zztVar.a = this.g;
                            zztVar.d(this.f);
                            zztVar.e("audio/mp4a-latm");
                            zztVar.j = zzaflVarA.c;
                            zztVar.G = zzaflVarA.b;
                            zztVar.I = zzaflVarA.a;
                            zztVar.q = Collections.singletonList(bArr8);
                            zztVar.d = this.d;
                            zztVar.f = this.e;
                            zzv zzvVar = new zzv(zztVar);
                            this.s = 1024000000 / ((long) zzvVar.J);
                            this.h.f(zzvVar);
                            this.r = true;
                        }
                        zzetVar.f(4);
                        int iH5 = zzetVar.h(13);
                        int i35 = iH5 - 7;
                        if (this.m) {
                            i35 = iH5 - 9;
                        }
                        zzaia zzaiaVar2 = this.h;
                        long j = this.s;
                        this.j = 4;
                        this.k = 0;
                        this.v = zzaiaVar2;
                        this.w = j;
                        this.t = i35;
                    }
                }
            } else if (zzeyVar.B() != 0) {
                zzetVar.a[0] = zzeyVar.a[zzeyVar.b];
                zzetVar.d(2);
                int iH6 = zzetVar.h(4);
                int i36 = this.p;
                if (i36 == -1 || iH6 == i36) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = iH6;
                    }
                    this.j = 3;
                    this.k = 0;
                } else {
                    this.n = false;
                    this.j = 0;
                    this.k = 0;
                    this.l = 256;
                }
            }
        }
    }

    public zzaql(boolean z, String str, int i, String str2) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final void c(zzagr zzagrVar, zzasd zzasdVar) {
        zzasdVar.a();
        zzasdVar.b();
        this.g = zzasdVar.e;
        zzasdVar.b();
        zzaia zzaiaVarB = zzagrVar.b(zzasdVar.d, 1);
        this.h = zzaiaVarB;
        this.v = zzaiaVarB;
        if (this.a) {
            zzasdVar.a();
            zzasdVar.b();
            zzaia zzaiaVarB2 = zzagrVar.b(zzasdVar.d, 5);
            this.i = zzaiaVarB2;
            zzt zztVar = new zzt();
            zzasdVar.b();
            zztVar.a = zzasdVar.e;
            zztVar.d(this.f);
            zztVar.e("application/id3");
            zzaiaVarB2.f(new zzv(zztVar));
            return;
        }
        this.i = new zzagl();
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final void zza() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }
}
