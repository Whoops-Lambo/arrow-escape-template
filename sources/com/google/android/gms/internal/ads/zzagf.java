package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagf implements zzagp {
    public final zzj b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzagp
    public final void b(int i) throws EOFException, InterruptedIOException {
        k(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzagp
    public final void f(int i, int i2, byte[] bArr) {
        d(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzagp
    public final void h(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        j(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzagp
    public final void zzf(int i) throws EOFException, InterruptedIOException {
        c(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzagp
    public final void zzl() {
        this.f = 0;
    }

    static {
        zzal.a("media3.extractor");
    }

    @Override // com.google.android.gms.internal.ads.zzagp
    public final boolean c(int i, boolean z) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.g, i);
        m(iMin);
        int iN = iMin;
        while (iN < i && iN != -1) {
            iN = n(this.a, -iN, Math.min(i, iN + 4096), iN, z);
        }
        if (iN != -1) {
            this.d += (long) iN;
        }
        return iN != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int i(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        zzagf zzagfVar;
        int i3 = this.g;
        int iN = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            m(iMin);
            iN = iMin;
        }
        if (iN == 0) {
            zzagfVar = this;
            iN = zzagfVar.n(bArr, i, i2, 0, true);
        } else {
            zzagfVar = this;
        }
        if (iN != -1) {
            zzagfVar.d += (long) iN;
        }
        return iN;
    }

    @Override // com.google.android.gms.internal.ads.zzagp
    public final boolean j(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            m(iMin);
        }
        int iN = iMin;
        while (iN < i2 && iN != -1) {
            iN = n(bArr, i, i2, iN, z);
        }
        if (iN != -1) {
            this.d += (long) iN;
        }
        return iN != -1;
    }

    public final void l(int i) {
        int i2 = this.f + i;
        int length = this.e.length;
        if (i2 > length) {
            String str = zzfq.a;
            this.e = Arrays.copyOf(this.e, Math.max(65536 + i2, Math.min(length + length, i2 + 524288)));
        }
    }

    public final void m(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzagp
    public final int zzd() throws EOFException, InterruptedIOException {
        zzagf zzagfVar;
        int iMin = Math.min(this.g, 1);
        m(iMin);
        if (iMin == 0) {
            zzagfVar = this;
            iMin = zzagfVar.n(this.a, 0, Math.min(1, 4096), 0, true);
        } else {
            zzagfVar = this;
        }
        if (iMin != -1) {
            zzagfVar.d += (long) iMin;
        }
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzagp
    public final long zzm() {
        return this.d + ((long) this.f);
    }

    @Override // com.google.android.gms.internal.ads.zzagp
    public final long zzn() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzagp
    public final long zzo() {
        return this.c;
    }

    public zzagf(zzj zzjVar, long j, long j2) {
        this.b = zzjVar;
        this.d = j;
        this.c = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzagp
    public final boolean d(byte[] bArr, int i, int i2, boolean z) {
        if (!k(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzagp
    public final int g(int i, int i2, byte[] bArr) throws EOFException, InterruptedIOException {
        zzagf zzagfVar;
        int iMin;
        l(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            zzagfVar = this;
            iMin = zzagfVar.n(this.e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            zzagfVar.g += iMin;
        } else {
            zzagfVar = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(zzagfVar.e, zzagfVar.f, bArr, i, iMin);
        zzagfVar.f += iMin;
        return iMin;
    }

    public final boolean k(int i, boolean z) throws EOFException, InterruptedIOException {
        l(i);
        int iN = this.g - this.f;
        while (iN < i) {
            zzagf zzagfVar = this;
            int i2 = i;
            boolean z2 = z;
            iN = zzagfVar.n(this.e, this.f, i2, iN, z2);
            if (iN == -1) {
                return false;
            }
            zzagfVar.g = zzagfVar.f + iN;
            this = zzagfVar;
            i = i2;
            z = z2;
        }
        this.f += i;
        return true;
    }

    public final int n(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (!Thread.interrupted()) {
            int i4 = this.b.i(bArr, i + i3, i2 - i3);
            if (i4 == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                defpackage.d.s();
                return 0;
            }
            return i3 + i4;
        }
        throw new InterruptedIOException();
    }
}
