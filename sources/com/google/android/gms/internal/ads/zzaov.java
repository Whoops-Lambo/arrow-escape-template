package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import defpackage.ip;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaov implements zzaoh {
    public final zzey a = new zzey();
    public final zzey b = new zzey();
    public final io.p071bidmachine.media3.extractor.text.pgs.a c = new io.p071bidmachine.media3.extractor.text.pgs.a(1);
    public Inflater d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzaoh
    public final void a(int i, int i2, ip ipVar, byte[] bArr) {
        zzey zzeyVar;
        zzcy zzcyVarB;
        int i3;
        zzey zzeyVar2;
        int i4;
        int i5;
        int iO;
        zzey zzeyVar3 = this.a;
        zzeyVar3.z(i + i2, bArr);
        zzeyVar3.E(i);
        if (this.d == null) {
            this.d = new Inflater();
        }
        Inflater inflater = this.d;
        zzey zzeyVar4 = this.b;
        if (zzfq.i(zzeyVar3, zzeyVar4, inflater)) {
            zzeyVar3.z(zzeyVar4.c, zzeyVar4.a);
        }
        io.p071bidmachine.media3.extractor.text.pgs.a aVar = this.c;
        int i6 = 0;
        aVar.c = 0;
        zzey zzeyVar5 = (zzey) aVar.i;
        aVar.d = 0;
        aVar.e = 0;
        aVar.f = 0;
        aVar.g = 0;
        aVar.h = 0;
        zzeyVar5.y(0);
        aVar.b = false;
        int[] iArr = aVar.a;
        ArrayList arrayList = new ArrayList();
        while (zzeyVar3.B() >= 3) {
            int i7 = zzeyVar3.c;
            int iK = zzeyVar3.K();
            int iL = zzeyVar3.L();
            int i8 = zzeyVar3.b + iL;
            if (i8 > i7) {
                zzeyVar3.E(i7);
                zzeyVar = zzeyVar3;
                zzcyVarB = null;
                i3 = i6;
            } else {
                if (iK != 128) {
                    switch (iK) {
                        case 20:
                            if (iL % 5 != 2) {
                                zzeyVar2 = zzeyVar5;
                                zzeyVar = zzeyVar3;
                            } else {
                                zzeyVar3.G(2);
                                Arrays.fill(iArr, i6);
                                int i9 = iL / 5;
                                int i10 = i6;
                                while (i10 < i9) {
                                    int iK2 = zzeyVar3.K();
                                    int iK3 = zzeyVar3.K();
                                    int iK4 = zzeyVar3.K();
                                    int iK5 = zzeyVar3.K();
                                    double d = iK3;
                                    int iK6 = zzeyVar3.K() << 24;
                                    String str = zzfq.a;
                                    zzey zzeyVar6 = zzeyVar5;
                                    double d2 = iK4 - 128;
                                    double d3 = iK5 - 128;
                                    iArr[iK2] = (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8) | iK6 | (Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)) << 16) | Math.max(0, Math.min((int) (d + (1.772d * d3)), 255));
                                    i10++;
                                    zzeyVar5 = zzeyVar6;
                                    zzeyVar3 = zzeyVar3;
                                }
                                zzeyVar2 = zzeyVar5;
                                zzeyVar = zzeyVar3;
                                aVar.b = true;
                            }
                            zzeyVar5 = zzeyVar2;
                            i3 = 0;
                            zzcyVarB = null;
                            break;
                        case 21:
                            if (iL >= 4) {
                                zzeyVar3.G(3);
                                int i11 = iL - 4;
                                if ((128 & zzeyVar3.K()) == 0) {
                                    i4 = zzeyVar5.b;
                                    i5 = zzeyVar5.c;
                                    if (i4 < i5 && i11 > 0) {
                                        int iMin = Math.min(i11, i5 - i4);
                                        zzeyVar3.H(i4, iMin, zzeyVar5.a);
                                        zzeyVar5.E(i4 + iMin);
                                    }
                                } else if (i11 >= 7 && (iO = zzeyVar3.O()) >= 4) {
                                    aVar.g = zzeyVar3.L();
                                    aVar.h = zzeyVar3.L();
                                    zzeyVar5.y(iO - 4);
                                    i11 = iL - 11;
                                    i4 = zzeyVar5.b;
                                    i5 = zzeyVar5.c;
                                    if (i4 < i5) {
                                        int iMin2 = Math.min(i11, i5 - i4);
                                        zzeyVar3.H(i4, iMin2, zzeyVar5.a);
                                        zzeyVar5.E(i4 + iMin2);
                                    }
                                }
                            }
                            zzeyVar = zzeyVar3;
                            zzcyVarB = null;
                            i3 = i6;
                            break;
                        case 22:
                            if (iL >= 19) {
                                aVar.c = zzeyVar3.L();
                                aVar.d = zzeyVar3.L();
                                zzeyVar3.G(11);
                                aVar.e = zzeyVar3.L();
                                aVar.f = zzeyVar3.L();
                            }
                            zzeyVar = zzeyVar3;
                            zzcyVarB = null;
                            i3 = i6;
                            break;
                        default:
                            zzeyVar = zzeyVar3;
                            zzcyVarB = null;
                            i3 = i6;
                            break;
                    }
                } else {
                    zzey zzeyVar7 = zzeyVar5;
                    zzeyVar = zzeyVar3;
                    if (aVar.c == 0 || aVar.d == 0 || aVar.g == 0 || aVar.h == 0) {
                        zzeyVar5 = zzeyVar7;
                    } else {
                        zzeyVar5 = zzeyVar7;
                        int i12 = zzeyVar5.c;
                        if (i12 != 0 && zzeyVar5.b == i12 && aVar.b) {
                            zzeyVar5.E(0);
                            int i13 = aVar.g * aVar.h;
                            int[] iArr2 = new int[i13];
                            int i14 = 0;
                            while (i14 < i13) {
                                int iK7 = zzeyVar5.K();
                                if (iK7 != 0) {
                                    iArr2[i14] = iArr[iK7];
                                    i14++;
                                } else {
                                    int iK8 = zzeyVar5.K();
                                    if (iK8 != 0) {
                                        int iK9 = iK8 & 63;
                                        if ((iK8 & 64) != 0) {
                                            iK9 = (iK9 << 8) | zzeyVar5.K();
                                        }
                                        int i15 = (iK8 & 128) == 0 ? iArr[0] : iArr[zzeyVar5.K()];
                                        int i16 = i14 + iK9;
                                        Arrays.fill(iArr2, i14, i16, i15);
                                        i14 = i16;
                                    }
                                }
                            }
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, aVar.g, aVar.h, Bitmap.Config.ARGB_8888);
                            zzcx zzcxVar = new zzcx();
                            zzcxVar.b = bitmapCreateBitmap;
                            zzcxVar.a = null;
                            float f = aVar.e;
                            float f2 = aVar.c;
                            zzcxVar.h = f / f2;
                            zzcxVar.i = 0;
                            float f3 = aVar.f;
                            float f4 = aVar.d;
                            zzcxVar.e = f3 / f4;
                            zzcxVar.f = 0;
                            zzcxVar.g = 0;
                            zzcxVar.l = aVar.g / f2;
                            zzcxVar.m = aVar.h / f4;
                            zzcyVarB = zzcxVar.b();
                        }
                        i3 = 0;
                        aVar.c = 0;
                        aVar.d = 0;
                        aVar.e = 0;
                        aVar.f = 0;
                        aVar.g = 0;
                        aVar.h = 0;
                        zzeyVar5.y(0);
                        aVar.b = false;
                    }
                    zzcyVarB = null;
                    i3 = 0;
                    aVar.c = 0;
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f = 0;
                    aVar.g = 0;
                    aVar.h = 0;
                    zzeyVar5.y(0);
                    aVar.b = false;
                }
                zzeyVar.E(i8);
            }
            if (zzcyVarB != null) {
                arrayList.add(zzcyVarB);
            }
            i6 = i3;
            zzeyVar3 = zzeyVar;
        }
        ipVar.mo82zza(new zzanz(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
