package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzhd {
    public final byte[] a;
    public final int b;
    public final int c;
    public int d;
    public int e = 0;

    public final int g() {
        int i = 0;
        while (!d()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? e(i) : 0);
    }

    public final void a() {
        int i = this.e + 1;
        this.e = i;
        if (i == 8) {
            this.e = 0;
            int i2 = this.d;
            this.d = i2 + (true == h(i2 + 1) ? 2 : 1);
        }
        i();
    }

    public final void b(int i) {
        int i2 = this.d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.d = i4;
        int i5 = (i - (i3 * 8)) + this.e;
        this.e = i5;
        if (i5 > 7) {
            this.d = i4 + 1;
            this.e = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.d) {
                i();
                return;
            } else if (h(i2)) {
                this.d++;
                i2 += 2;
            }
        }
    }

    public final boolean c(int i) {
        int i2;
        int i3 = this.d;
        int i4 = i / 8;
        int i5 = i3 + i4;
        int i6 = (this.e + i) - (i4 * 8);
        if (i6 > 7) {
            i5++;
            i6 -= 8;
        }
        while (true) {
            i3++;
            i2 = this.b;
            if (i3 > i5 || i5 > i2) {
                break;
            }
            if (h(i3)) {
                i5++;
                i3 += 2;
            }
        }
        if (i5 >= i2) {
            return i5 == i2 && i6 == 0;
        }
        return true;
    }

    public final boolean d() {
        int i = this.a[this.d] & (128 >> this.e);
        a();
        return i != 0;
    }

    public final int e(int i) {
        int i2;
        byte[] bArr;
        this.e += i;
        int i3 = 0;
        while (true) {
            i2 = this.e;
            int i4 = 2;
            bArr = this.a;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.e = i5;
            int i6 = this.d;
            i3 |= (bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i5;
            if (true != h(i6 + 1)) {
                i4 = 1;
            }
            this.d = i6 + i4;
        }
        int i7 = this.d;
        int i8 = i3 | ((bArr[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i2));
        int i9 = 32 - i;
        if (i2 == 8) {
            this.e = 0;
            this.d = i7 + (true != h(i7 + 1) ? 1 : 2);
        }
        int i10 = ((-1) >>> i9) & i8;
        i();
        return i10;
    }

    public final boolean h(int i) {
        int i2 = i - 2;
        if (this.c > i2 || i >= this.b) {
            return false;
        }
        byte[] bArr = this.a;
        return bArr[i] == 3 && bArr[i2] == 0 && bArr[i + (-1)] == 0;
    }

    public final void i() {
        int i;
        int i2 = this.d;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.b) || (i2 == i && this.e == 0))) {
            z = true;
        }
        zzgvz.f(z);
    }

    public zzhd(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.c = i;
        this.d = i;
        this.b = i2;
        i();
    }

    public final int f() {
        int iG = g();
        int i = iG % 2;
        int i2 = 1;
        int i3 = iG + 1;
        if (i == 0) {
            i2 = -1;
        }
        return (i3 / 2) * i2;
    }
}
