package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaft {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public static zzaft a(zzey zzeyVar) throws zzat {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            zzeyVar.G(4);
            int iK = (zzeyVar.K() & 3) + 1;
            if (iK == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iK2 = zzeyVar.K() & 31;
            for (int i9 = 0; i9 < iK2; i9++) {
                int iL = zzeyVar.L();
                int i10 = zzeyVar.b;
                zzeyVar.G(iL);
                byte[] bArr = zzeyVar.a;
                byte[] bArr2 = zzdr.a;
                byte[] bArr3 = new byte[iL + 4];
                System.arraycopy(zzdr.a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i10, bArr3, 4, iL);
                arrayList.add(bArr3);
            }
            int iK3 = zzeyVar.K();
            for (int i11 = 0; i11 < iK3; i11++) {
                int iL2 = zzeyVar.L();
                int i12 = zzeyVar.b;
                zzeyVar.G(iL2);
                byte[] bArr4 = zzeyVar.a;
                byte[] bArr5 = zzdr.a;
                byte[] bArr6 = new byte[iL2 + 4];
                System.arraycopy(zzdr.a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i12, bArr6, 4, iL2);
                arrayList.add(bArr6);
            }
            if (iK2 > 0) {
                zzgu zzguVarD = zzgv.d(5, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i13 = zzguVarD.e;
                int i14 = zzguVarD.f;
                int i15 = zzguVarD.h + 8;
                int i16 = zzguVarD.i + 8;
                int i17 = zzguVarD.j;
                int i18 = zzguVarD.k;
                int i19 = zzguVarD.l;
                int i20 = zzguVarD.m;
                float f2 = zzguVarD.g;
                int i21 = zzguVarD.a;
                int i22 = zzguVarD.b;
                int i23 = zzguVarD.c;
                byte[] bArr7 = zzdr.a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new zzaft(arrayList, iK, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzat.b("Error parsing AVC config", e);
        }
    }

    public zzaft(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }
}
