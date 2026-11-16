package io.p071bidmachine.media3.extractor;

import io.p071bidmachine.media3.common.g0;
import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.container.n;
import io.p071bidmachine.media3.container.o;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
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

    public static c a(q qVar) {
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
            qVar.G(4);
            int iT = (qVar.t() & 3) + 1;
            if (iT == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iT2 = qVar.t() & 31;
            for (int i9 = 0; i9 < iT2; i9++) {
                int iZ = qVar.z();
                int i10 = qVar.b;
                qVar.G(iZ);
                byte[] bArr = qVar.a;
                byte[] bArr2 = new byte[iZ + 4];
                System.arraycopy(io.p071bidmachine.media3.common.util.c.a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, iZ);
                arrayList.add(bArr2);
            }
            int iT3 = qVar.t();
            for (int i11 = 0; i11 < iT3; i11++) {
                int iZ2 = qVar.z();
                int i12 = qVar.b;
                qVar.G(iZ2);
                byte[] bArr3 = qVar.a;
                byte[] bArr4 = new byte[iZ2 + 4];
                System.arraycopy(io.p071bidmachine.media3.common.util.c.a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, iZ2);
                arrayList.add(bArr4);
            }
            if (iT2 > 0) {
                n nVarK = o.k(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i13 = nVarK.e;
                int i14 = nVarK.f;
                int i15 = nVarK.h + 8;
                int i16 = nVarK.i + 8;
                int i17 = nVarK.p;
                int i18 = nVarK.q;
                int i19 = nVarK.r;
                int i20 = nVarK.s;
                float f2 = nVarK.g;
                int i21 = nVarK.a;
                int i22 = nVarK.b;
                int i23 = nVarK.c;
                byte[] bArr5 = io.p071bidmachine.media3.common.util.c.a;
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
            return new c(arrayList, iT, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw g0.a("Error parsing AVC config", e);
        }
    }

    public c(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
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
