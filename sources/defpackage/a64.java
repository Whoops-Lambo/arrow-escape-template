package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class a64 implements r54 {
    public final short[] a;
    public short[] b;
    public short[] c;
    public short[] d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ g64 h;

    @Override // defpackage.r54
    public final void g(int i, int i2) {
        for (int i3 = 0; i3 < this.h.b * i2; i3++) {
            this.b[i + i3] = 0;
        }
    }

    @Override // defpackage.r54
    public final void j(int i, long j, long j2) {
        int i2 = 0;
        while (true) {
            g64 g64Var = this.h;
            int i3 = g64Var.b;
            if (i2 >= i3) {
                return;
            }
            short[] sArr = this.c;
            int i4 = g64Var.k;
            short[] sArr2 = this.d;
            int i5 = (i * i3) + i2;
            short s = sArr2[i5];
            short s2 = sArr2[i5 + i3];
            long j3 = ((long) g64Var.n) * j;
            int i6 = g64Var.m;
            long j4 = ((long) i6) * j2;
            long j5 = ((long) (i6 + 1)) * j2;
            int i7 = i2;
            long j6 = j5 - j4;
            long j7 = j5 - j3;
            sArr[(i4 * i3) + i7] = (short) ((((j6 - j7) * ((long) s2)) + (j7 * ((long) s))) / j6);
            i2 = i7 + 1;
        }
    }

    public final int l(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 255;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                int i9 = this.h.b * i;
                iAbs += Math.abs(sArr[i9 + i8] - sArr[(i9 + i2) + i8]);
            }
            int i10 = iAbs * i6;
            int i11 = i4 * i2;
            if (i10 < i11) {
                i4 = iAbs;
            }
            if (i10 < i11) {
                i6 = i2;
            }
            int i12 = iAbs * i5;
            int i13 = i7 * i2;
            if (i12 > i13) {
                i7 = iAbs;
            }
            if (i12 > i13) {
                i5 = i2;
            }
            i2++;
        }
        this.e = i4 / i6;
        this.f = i7 / i5;
        return i6;
    }

    public final short[] m(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.h.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    @Override // defpackage.r54
    public final int zza() {
        return 2;
    }

    @Override // defpackage.r54
    public final void zzg() {
        this.g = 0;
        this.e = 0;
        this.f = 0;
    }

    @Override // defpackage.r54
    public final void a(int i, int i2) {
        int i3;
        short[] sArr = this.b;
        int i4 = 0;
        while (true) {
            g64 g64Var = this.h;
            if (i4 >= g64Var.h / i2) {
                return;
            }
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = g64Var.b;
                i3 = i7 * i2;
                if (i5 < i3) {
                    i6 += sArr[pv1.v(i4, i3, i7 * i, i5)];
                    i5++;
                }
            }
            this.a[i4] = (short) (i6 / i3);
            i4++;
        }
    }

    @Override // defpackage.r54
    public final void b(int i) {
        this.c = m(this.c, this.h.k, i);
    }

    @Override // defpackage.r54
    public final void c(int i) {
        this.b = m(this.b, this.h.j, i);
    }

    @Override // defpackage.r54
    public final int d(int i, int i2) {
        return l(this.a, 0, i, i2);
    }

    @Override // defpackage.r54
    public final void e(int i) {
        this.d = m(this.d, this.h.l, i);
    }

    @Override // defpackage.r54
    public final void f(int i, ByteBuffer byteBuffer) {
        g64 g64Var = this.h;
        byteBuffer.asShortBuffer().get(this.b, g64Var.j * g64Var.b, i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // defpackage.r54
    public final void h(int i, ByteBuffer byteBuffer) {
        g64 g64Var = this.h;
        byteBuffer.asShortBuffer().put(this.c, 0, g64Var.b * i);
        byteBuffer.position(((i + i) * g64Var.b) + byteBuffer.position());
    }

    @Override // defpackage.r54
    public final int i(int i, int i2, int i3) {
        return l(this.b, i, i2, i3);
    }

    @Override // defpackage.r54
    public final void k(int i, int i2, int i3, int i4, int i5) {
        short[] sArr = this.c;
        short[] sArr2 = this.b;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i8] * i10) + ((i - i10) * sArr2[i7])) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    @Override // defpackage.r54
    public final boolean zzc() {
        int i = this.e;
        return i != 0 && this.h.p != 0 && this.f <= i * 3 && i + i > this.g * 3;
    }

    @Override // defpackage.r54
    public final void zzi() {
        this.g = this.e;
    }

    @Override // defpackage.r54
    public final /* synthetic */ Object zzp() {
        return this.d;
    }

    @Override // defpackage.r54
    public final /* synthetic */ Object zzq() {
        return this.c;
    }

    @Override // defpackage.r54
    public final /* synthetic */ Object zzr() {
        return this.b;
    }

    public a64(g64 g64Var) {
        this.h = g64Var;
        int i = g64Var.h;
        this.a = new short[i];
        int i2 = i * g64Var.b;
        this.b = new short[i2];
        this.c = new short[i2];
        this.d = new short[i2];
    }
}
