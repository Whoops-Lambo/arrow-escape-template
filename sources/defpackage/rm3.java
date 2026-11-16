package defpackage;

import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzacy;
import com.google.android.gms.internal.measurement.zzada;
import com.google.android.gms.internal.measurement.zzafc;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class rm3 extends zzada {
    public final byte[] c;
    public final int d;
    public int e;
    public final OutputStream f;

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void v(int i) {
        F(5);
        H(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void w(int i) {
        F(4);
        C(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final int A() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void B(long j) {
        boolean z = zzada.b;
        byte[] bArr = this.c;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = (int) j;
                int i2 = this.e;
                if (j2 == 0) {
                    this.e = i2 + 1;
                    mp3.k(bArr, i2, (byte) i);
                    return;
                } else {
                    this.e = i2 + 1;
                    mp3.k(bArr, i2, (byte) (i | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i3 = (int) j;
                int i4 = this.e;
                if (j3 == 0) {
                    this.e = i4 + 1;
                    bArr[i4] = (byte) i3;
                    return;
                } else {
                    this.e = i4 + 1;
                    bArr[i4] = (byte) (i3 | 128);
                    j >>>= 7;
                }
            }
        }
    }

    public final void C(int i) {
        int i2 = this.e;
        byte[] bArr = this.c;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.e = i2 + 4;
    }

    public final void D(long j) {
        int i = this.e;
        byte[] bArr = this.c;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.e = i + 8;
    }

    public final void E(int i, int i2, byte[] bArr) throws IOException {
        int i3 = this.e;
        int i4 = this.d;
        int i5 = i4 - i3;
        byte[] bArr2 = this.c;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.e += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        this.e = i4;
        G();
        int i7 = i2 - i5;
        if (i7 > i4) {
            this.f.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.e = i7;
        }
    }

    public final void F(int i) {
        if (this.d - this.e < i) {
            G();
        }
    }

    public final void G() {
        this.f.write(this.c, 0, this.e);
        this.e = 0;
    }

    public final void H(int i) {
        boolean z = zzada.b;
        byte[] bArr = this.c;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.e;
                if (i2 == 0) {
                    this.e = i3 + 1;
                    mp3.k(bArr, i3, (byte) i);
                    return;
                } else {
                    this.e = i3 + 1;
                    mp3.k(bArr, i3, (byte) (i | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.e;
                if (i4 == 0) {
                    this.e = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.e = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void f(int i, int i2) {
        v((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void g(int i, int i2) {
        F(20);
        H(i << 3);
        if (i2 >= 0) {
            H(i2);
        } else {
            B(i2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void h(int i, int i2) {
        F(20);
        H(i << 3);
        H(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void i(int i, int i2) {
        F(14);
        H((i << 3) | 5);
        C(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void j(int i, long j) {
        F(20);
        H(i << 3);
        B(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void k(int i, long j) {
        F(18);
        H((i << 3) | 1);
        D(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void l(int i, boolean z) {
        F(11);
        H(i << 3);
        int i2 = this.e;
        this.c[i2] = z ? (byte) 1 : (byte) 0;
        this.e = i2 + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void m(int i, String str) throws IOException {
        v((i << 3) | 2);
        z(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void n(int i, zzacr zzacrVar) {
        v((i << 3) | 2);
        o(zzacrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void q(int i, zzafc zzafcVar) {
        v(11);
        h(2, i);
        v(26);
        s(zzafcVar);
        v(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void r(int i, zzacr zzacrVar) {
        v(11);
        h(2, i);
        n(3, zzacrVar);
        v(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void t(byte b) {
        if (this.e == this.d) {
            G();
        }
        int i = this.e;
        this.c[i] = b;
        this.e = i + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void u(int i) {
        if (i >= 0) {
            v(i);
        } else {
            x(i);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void x(long j) {
        F(10);
        B(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void y(long j) {
        F(8);
        D(j);
    }

    public rm3(OutputStream outputStream, int i) {
        if (outputStream != null) {
            this.f = outputStream;
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.c = bArr;
                this.d = bArr.length;
                return;
            }
            d.r("bufferSize must be >= 0");
            throw null;
        }
        d.w("out");
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzacj
    public final void a(byte[] bArr, int i, int i2) throws IOException {
        E(i, i2, bArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void o(zzacr zzacrVar) {
        v(zzacrVar.d());
        zzacrVar.k(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void p(int i, byte[] bArr) throws IOException {
        v(i);
        E(0, i, bArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void s(zzafc zzafcVar) {
        v(zzafcVar.i());
        zzafcVar.j(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void z(String str) throws IOException {
        int length = str.length() * 3;
        int iB = zzada.b(length);
        int i = iB + length;
        int i2 = this.d;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int iC = qp3.c(str, bArr, 0, length);
            v(iC);
            E(0, iC, bArr);
            return;
        }
        if (i > i2 - this.e) {
            G();
        }
        int iB2 = zzada.b(str.length());
        int i3 = this.e;
        byte[] bArr2 = this.c;
        try {
            if (iB2 == iB) {
                int i4 = i3 + iB2;
                this.e = i4;
                int iC2 = qp3.c(str, bArr2, i4, i2 - i4);
                this.e = i3;
                H((iC2 - i3) - iB2);
                this.e = iC2;
            } else {
                int iB3 = qp3.b(str);
                H(iB3);
                this.e = qp3.c(str, bArr2, this.e, iB3);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzacy(e);
        }
    }
}
