package com.google.android.gms.internal.ads;

import defpackage.jy4;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzifw extends OutputStream {
    public static final byte[] f = new byte[0];
    public int c;
    public int e;
    public final int a = 128;
    public final ArrayList b = new ArrayList();
    public byte[] d = new byte[128];

    public final synchronized zzifx d() {
        try {
            int i = this.e;
            byte[] bArr = this.d;
            if (i >= bArr.length) {
                this.b.add(new jy4(this.d));
                this.d = f;
            } else if (i > 0) {
                this.b.add(new jy4(Arrays.copyOf(bArr, i)));
            }
            this.c += this.e;
            this.e = 0;
        } catch (Throwable th) {
            throw th;
        }
        return zzifx.J(this.b);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.d;
        int length = bArr2.length;
        int i3 = this.e;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.e += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        f(i5);
        System.arraycopy(bArr, i + i4, this.d, 0, i5);
        this.e = i5;
    }

    public final void f(int i) {
        this.b.add(new jy4(this.d));
        int length = this.c + this.d.length;
        this.c = length;
        this.d = new byte[Math.max(this.a, Math.max(i, length >>> 1))];
        this.e = 0;
    }

    public final String toString() {
        int i;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.c + this.e;
        }
        return "<ByteString.Output@" + hexString + " size=" + i + ">";
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.e == this.d.length) {
                f(1);
            }
            byte[] bArr = this.d;
            int i2 = this.e;
            this.e = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }
}
