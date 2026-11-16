package defpackage;

import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzfa;
import com.google.android.gms.internal.play_billing.zzfc;
import com.google.android.gms.internal.play_billing.zzhb;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tf4 extends zzfc {
    public final byte[] c;
    public final int d;
    public int e;

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final int b() {
        return this.d - this.e;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void c(byte b) throws zzfa {
        int i = this.e;
        try {
            int i2 = i + 1;
            try {
                this.c[i] = b;
                this.e = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzfa(i, this.d, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void d(int i, boolean z) throws zzfa {
        u(i << 3);
        c(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void f(int i, zzev zzevVar) throws zzfa {
        u((i << 3) | 2);
        g(zzevVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void h(int i, int i2) throws zzfa {
        u((i << 3) | 5);
        i(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void i(int i) throws zzfa {
        int i2 = this.e;
        try {
            byte[] bArr = this.c;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.e = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzfa(i2, this.d, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void j(int i, long j) throws zzfa {
        u((i << 3) | 1);
        k(j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void k(long j) throws zzfa {
        int i = this.e;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new zzfa(i, this.d, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void l(int i, int i2) throws zzfa {
        u(i << 3);
        m(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void m(int i) throws zzfa {
        if (i >= 0) {
            u(i);
        } else {
            w(i);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void o(int i, zzhb zzhbVar) throws zzfa {
        u(11);
        t(2, i);
        u(26);
        n(zzhbVar);
        u(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void p(int i, zzev zzevVar) throws zzfa {
        u(11);
        t(2, i);
        f(3, zzevVar);
        u(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void q(int i, String str) throws zzfa {
        u((i << 3) | 2);
        r(str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void r(String str) throws zzfa {
        int i = this.e;
        try {
            int iX = zzfc.x(str.length() * 3);
            int iX2 = zzfc.x(str.length());
            int i2 = this.d;
            byte[] bArr = this.c;
            if (iX2 != iX) {
                u(xz4.b(str));
                int i3 = this.e;
                this.e = xz4.a(str, bArr, i3, i2 - i3);
            } else {
                int i4 = i + iX2;
                this.e = i4;
                int iA = xz4.a(str, bArr, i4, i2 - i4);
                this.e = i;
                u((iA - i) - iX2);
                this.e = iA;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new zzfa(e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void s(int i, int i2) throws zzfa {
        u((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void t(int i, int i2) throws zzfa {
        u(i << 3);
        u(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void u(int i) throws zzfa {
        int i2;
        int i3 = this.e;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.c;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.e = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzfa(i2, this.d, 1, e);
                }
            }
            throw new zzfa(i2, this.d, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void v(int i, long j) throws zzfa {
        u(i << 3);
        w(j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void w(long j) throws zzfa {
        int i;
        int i2 = this.e;
        boolean z = zzfc.b;
        byte[] bArr = this.c;
        int i3 = this.d;
        if (!z || i3 - i2 < 10) {
            int i4 = i2;
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                int i5 = i4 + 1;
                try {
                    bArr[i4] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                    i4 = i5;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i5;
                    throw new zzfa(i, i3, 1, e);
                }
            }
            i = i4 + 1;
            try {
                bArr[i4] = (byte) j2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new zzfa(i, i3, 1, e);
            }
        } else {
            int i6 = i2;
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                az4.c.j(bArr, az4.f + ((long) i6), (byte) (((int) j3) | 128));
                j3 >>>= 7;
                i6++;
            }
            i = i6 + 1;
            az4.c.j(bArr, az4.f + ((long) i6), (byte) j3);
        }
        this.e = i;
    }

    public final void z(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.c, this.e, i2);
            this.e += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzfa(this.e, this.d, i2, e);
        }
    }

    public tf4(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.c = bArr;
            this.e = 0;
            this.d = i;
        } else {
            Locale locale = Locale.US;
            d.r(nj.i(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void e(int i, byte[] bArr) throws zzfa {
        u(i);
        z(bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void g(zzev zzevVar) throws zzfa {
        u(zzevVar.i());
        zzevVar.n(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void n(zzhb zzhbVar) throws zzfa {
        u(zzhbVar.zzn());
        zzhbVar.a(this);
    }
}
