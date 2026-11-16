package com.fyber.inneractive.sdk.player.exoplayer2.util;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.e32;
import defpackage.jc1;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class n {
    public byte[] a;
    public int b;
    public int c;

    public final String a(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String str = new String(this.a, i2, (i3 >= this.c || this.a[i3] != 0) ? i : i - 1);
        this.b += i;
        return str;
    }

    public final int b() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        this.b = i + 4;
        return (bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i7;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    public final String c() {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        if (i2 - i3 == 0) {
            return null;
        }
        while (i3 < this.c) {
            byte b = this.a[i3];
            int i4 = z.a;
            if (b == 10 || b == 13) {
                break;
            }
            i3++;
        }
        int i5 = this.b;
        if (i3 - i5 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i5] == -17 && bArr[i5 + 1] == -69 && bArr[i5 + 2] == -65) {
                this.b = i5 + 3;
            }
        }
        byte[] bArr2 = this.a;
        int i6 = this.b;
        String str = new String(bArr2, i6, i3 - i6);
        this.b = i3;
        int i7 = this.c;
        if (i3 != i7) {
            byte[] bArr3 = this.a;
            if (bArr3[i3] == 13) {
                int i8 = i3 + 1;
                this.b = i8;
                if (i8 != i7) {
                    i = this.b;
                    if (bArr3[i] == 10) {
                        this.b = i + 1;
                    }
                }
            } else {
                i = this.b;
                if (bArr3[i] == 10) {
                    this.b = i + 1;
                }
            }
        }
        return str;
    }

    public final int d() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        this.b = i + 4;
        return ((bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | i7;
    }

    public final long e() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    public final int f() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.b = i + 2;
        return ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i3;
    }

    public final long g() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.b = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    public final void h() {
        int i = this.c;
        int i2 = this.b;
        if (i - i2 == 0) {
            return;
        }
        while (i2 < this.c && this.a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.a;
        int i3 = this.b;
        new String(bArr, i3, i2 - i3);
        this.b = i2;
        if (i2 < this.c) {
            this.b = i2 + 1;
        }
    }

    public final int j() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final long k() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.b = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    public final int l() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i5;
    }

    public final int o() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.b = i + 2;
        return (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i3;
    }

    public n(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public final int i() {
        return j() | (j() << 21) | (j() << 14) | (j() << 7);
    }

    public final int m() {
        int iB = b();
        if (iB >= 0) {
            return iB;
        }
        e32.i(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Top bit not zero: ", iB));
        return 0;
    }

    public final long n() {
        long jG = g();
        if (jG >= 0) {
            return jG;
        }
        e32.i(jc1.l(jG, "Top bit not zero: "));
        return 0L;
    }

    public n() {
    }

    public n(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public n(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
    }

    public final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final int a() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final String b(int i) {
        String str = new String(this.a, this.b, i, Charset.defaultCharset());
        this.b += i;
        return str;
    }

    public final void d(int i) {
        if (i >= 0 && i <= this.a.length) {
            this.c = i;
        } else {
            e32.a();
        }
    }

    public final void e(int i) {
        if (i >= 0 && i <= this.c) {
            this.b = i;
        } else {
            e32.a();
        }
    }

    public final void c(int i) {
        this.a = a() < i ? new byte[i] : this.a;
        this.c = i;
        this.b = 0;
    }
}
