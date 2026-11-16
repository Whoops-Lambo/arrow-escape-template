package com.adsurge.adn.T0;

import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a {
    public final int a;
    public final byte[] b;

    public boolean c(int i) {
        if (i >= 0 && i < this.a) {
            if (((1 << a(i)) & this.b[b(i)]) != 0) {
                return true;
            }
        }
        return false;
    }

    public void a(int i, boolean z) {
        if (i < 0 || i >= this.a) {
            return;
        }
        byte[] bArr = this.b;
        if (z) {
            int iB = b(i);
            bArr[iB] = (byte) ((1 << a(i)) | bArr[iB]);
        } else {
            int iB2 = b(i);
            bArr[iB2] = (byte) ((~(1 << a(i))) & bArr[iB2]);
        }
    }

    public int b() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(C4664b4.j.d);
        for (int i = 0; i < this.a; i++) {
            sb.append(c(i) ? "1" : "0");
            if (i < this.a - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public a(int i) {
        this.a = i;
        int i2 = 1;
        if (i > 8) {
            if (i % 8 == 0) {
                i2 = i / 8;
            } else {
                i2 = 1 + (i / 8);
            }
        }
        this.b = new byte[i2];
    }

    public final int b(int i) {
        return i / 8;
    }

    public int a() {
        int i = 0;
        for (byte b : this.b) {
            while (b != 0) {
                b = (byte) (b & (b - 1));
                i++;
            }
        }
        return i;
    }

    public final int a(int i) {
        return i % 8;
    }
}
