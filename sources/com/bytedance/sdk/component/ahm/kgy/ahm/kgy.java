package com.bytedance.sdk.component.ahm.kgy.ahm;

import defpackage.d;
import defpackage.e32;
import defpackage.jc1;
import defpackage.m93;
import defpackage.nj;
import defpackage.vq2;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class kgy implements ahm, rz, Cloneable, ByteChannel {
    private static final byte[] rz = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    long ahm;
    ct kgy;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgy)) {
            return false;
        }
        kgy kgyVar = (kgy) obj;
        long j = this.ahm;
        if (j != kgyVar.ahm) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        ct ctVar = this.kgy;
        ct ctVar2 = kgyVar.kgy;
        int i = ctVar.ahm;
        int i2 = ctVar2.ahm;
        while (j2 < this.ahm) {
            long jMin = Math.min(ctVar.rz - i, ctVar2.rz - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (ctVar.kgy[i] != ctVar2.kgy[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == ctVar.rz) {
                ctVar = ctVar.noq;
                i = ctVar.ahm;
            }
            if (i2 == ctVar2.rz) {
                ctVar2 = ctVar2.noq;
                i2 = ctVar2.ahm;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public kgy kgy(String str, int i, int i2) {
        char cCharAt;
        if (str == null) {
            d.r("string == null");
            return null;
        }
        if (i < 0) {
            d.r("beginIndex < 0: ".concat(String.valueOf(i)));
            return null;
        }
        if (i2 < i) {
            d.r(nj.i(i2, i, "endIndex < beginIndex: ", " < "));
            return null;
        }
        if (i2 > str.length()) {
            m93.g(str.length(), jc1.s(i2, "endIndex > string.length: ", " > "));
            return null;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                ct ctVarRz = rz(1);
                byte[] bArr = ctVarRz.kgy;
                int i3 = ctVarRz.rz - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = ctVarRz.rz;
                int i6 = (i3 + i) - i5;
                ctVarRz.rz = i5 + i6;
                this.ahm += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    ahm((cCharAt2 >> 6) | 192);
                    ahm((cCharAt2 & '?') | 128);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    ahm((cCharAt2 >> '\f') | 224);
                    ahm(((cCharAt2 >> 6) & 63) | 128);
                    ahm((cCharAt2 & '?') | 128);
                } else {
                    int i7 = i + 1;
                    char cCharAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                    if (cCharAt2 > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        ahm(63);
                        i = i7;
                    } else {
                        int i8 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        ahm((i8 >> 18) | 240);
                        ahm(((i8 >> 12) & 63) | 128);
                        ahm(((i8 >> 6) & 63) | 128);
                        ahm((i8 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    public kgy ahm(long j) {
        if (j == 0) {
            return ahm(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        ct ctVarRz = rz(iNumberOfTrailingZeros);
        byte[] bArr = ctVarRz.kgy;
        int i = ctVarRz.rz;
        for (int i2 = (i + iNumberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = rz[(int) (15 & j)];
            j >>>= 4;
        }
        ctVarRz.rz += iNumberOfTrailingZeros;
        this.ahm += (long) iNumberOfTrailingZeros;
        return this;
    }

    public final uq ct() {
        long j = this.ahm;
        if (j <= 2147483647L) {
            return uq((int) j);
        }
        vq2.f(this.ahm, "size > Integer.MAX_VALUE: ");
        return null;
    }

    public int hashCode() {
        ct ctVar = this.kgy;
        if (ctVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = ctVar.rz;
            for (int i3 = ctVar.ahm; i3 < i2; i3++) {
                i = (i * 31) + ctVar.kgy[i3];
            }
            ctVar = ctVar.noq;
        } while (ctVar != this.kgy);
        return i;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        ct ctVar = this.kgy;
        if (ctVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), ctVar.rz - ctVar.ahm);
        byteBuffer.put(ctVar.kgy, ctVar.ahm, iMin);
        int i = ctVar.ahm + iMin;
        ctVar.ahm = i;
        this.ahm -= (long) iMin;
        if (i == ctVar.rz) {
            this.kgy = ctVar.ahm();
            noq.kgy(ctVar);
        }
        return iMin;
    }

    public ct rz(int i) {
        if (i <= 0 || i > 8192) {
            e32.a();
            return null;
        }
        ct ctVar = this.kgy;
        if (ctVar != null) {
            ct ctVar2 = ctVar.yo;
            return (ctVar2.rz + i > 8192 || !ctVar2.ct) ? ctVar2.kgy(noq.kgy()) : ctVar2;
        }
        ct ctVarKgy = noq.kgy();
        this.kgy = ctVarKgy;
        ctVarKgy.yo = ctVarKgy;
        ctVarKgy.noq = ctVarKgy;
        return ctVarKgy;
    }

    /* JADX INFO: renamed from: uq, reason: merged with bridge method [inline-methods] */
    public kgy clone() {
        kgy kgyVar = new kgy();
        if (this.ahm == 0) {
            return kgyVar;
        }
        ct ctVarKgy = this.kgy.kgy();
        kgyVar.kgy = ctVarKgy;
        ctVarKgy.yo = ctVarKgy;
        ctVarKgy.noq = ctVarKgy;
        ct ctVar = this.kgy;
        while (true) {
            ctVar = ctVar.noq;
            if (ctVar == this.kgy) {
                kgyVar.ahm = this.ahm;
                return kgyVar;
            }
            kgyVar.kgy.yo.kgy(ctVar.kgy());
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            d.r("source == null");
            return 0;
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            ct ctVarRz = rz(1);
            int iMin = Math.min(i, 8192 - ctVarRz.rz);
            byteBuffer.get(ctVarRz.kgy, ctVarRz.rz, iMin);
            i -= iMin;
            ctVarRz.rz += iMin;
        }
        this.ahm += (long) iRemaining;
        return iRemaining;
    }

    public String toString() {
        return ct().toString();
    }

    public String rz() {
        try {
            return kgy(this.ahm, gf.kgy);
        } catch (EOFException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VryMV5X7bCrM=", "efsrkwau", "SesskTaob58=", 54);
            d.p(e);
            return null;
        }
    }

    public final uq uq(int i) {
        if (i == 0) {
            return uq.rz;
        }
        return new yo(this, i);
    }

    public kgy ahm(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = i2;
            gf.kgy(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                ct ctVarRz = rz(1);
                int iMin = Math.min(i3 - i, 8192 - ctVarRz.rz);
                System.arraycopy(bArr, i, ctVarRz.kgy, ctVarRz.rz, iMin);
                i += iMin;
                ctVarRz.rz += iMin;
            }
            this.ahm += j;
            return this;
        }
        d.r("source == null");
        return null;
    }

    public kgy ahm(int i) {
        ct ctVarRz = rz(1);
        byte[] bArr = ctVarRz.kgy;
        int i2 = ctVarRz.rz;
        ctVarRz.rz = i2 + 1;
        bArr[i2] = (byte) i;
        this.ahm++;
        return this;
    }

    public byte ahm() {
        long j = this.ahm;
        if (j != 0) {
            ct ctVar = this.kgy;
            int i = ctVar.ahm;
            int i2 = ctVar.rz;
            int i3 = i + 1;
            byte b = ctVar.kgy[i];
            this.ahm = j - 1;
            if (i3 == i2) {
                this.kgy = ctVar.ahm();
                noq.kgy(ctVar);
                return b;
            }
            ctVar.ahm = i3;
            return b;
        }
        e32.i("size == 0");
        return (byte) 0;
    }

    public String kgy(long j, Charset charset) throws EOFException {
        gf.kgy(this.ahm, 0L, j);
        if (charset == null) {
            d.r("charset == null");
            return null;
        }
        if (j > 2147483647L) {
            d.r("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
            return null;
        }
        if (j == 0) {
            return "";
        }
        ct ctVar = this.kgy;
        int i = ctVar.ahm;
        if (((long) i) + j > ctVar.rz) {
            return new String(kgy(j), charset);
        }
        String str = new String(ctVar.kgy, i, (int) j, charset);
        int i2 = (int) (((long) ctVar.ahm) + j);
        ctVar.ahm = i2;
        this.ahm -= j;
        if (i2 == ctVar.rz) {
            this.kgy = ctVar.ahm();
            noq.kgy(ctVar);
        }
        return str;
    }

    public byte[] kgy(long j) throws EOFException {
        gf.kgy(this.ahm, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            kgy(bArr);
            return bArr;
        }
        d.r("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        return null;
    }

    public void kgy(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int iKgy = kgy(bArr, i, bArr.length - i);
            if (iKgy == -1) {
                d.s();
                return;
            }
            i += iKgy;
        }
    }

    public int kgy(byte[] bArr, int i, int i2) {
        gf.kgy(bArr.length, i, i2);
        ct ctVar = this.kgy;
        if (ctVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, ctVar.rz - ctVar.ahm);
        System.arraycopy(ctVar.kgy, ctVar.ahm, bArr, i, iMin);
        int i3 = ctVar.ahm + iMin;
        ctVar.ahm = i3;
        this.ahm -= (long) iMin;
        if (i3 == ctVar.rz) {
            this.kgy = ctVar.ahm();
            noq.kgy(ctVar);
        }
        return iMin;
    }

    public kgy kgy(String str) {
        return kgy(str, 0, str.length());
    }

    public boolean kgy() {
        return this.ahm == 0;
    }

    public kgy kgy(int i) {
        if (i < 128) {
            ahm(i);
            return this;
        }
        if (i < 2048) {
            ahm((i >> 6) | 192);
            ahm((i & 63) | 128);
            return this;
        }
        if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                ahm(63);
                return this;
            }
            ahm((i >> 12) | 224);
            ahm(((i >> 6) & 63) | 128);
            ahm((i & 63) | 128);
            return this;
        }
        if (i <= 1114111) {
            ahm((i >> 18) | 240);
            ahm(((i >> 12) & 63) | 128);
            ahm(((i >> 6) & 63) | 128);
            ahm((i & 63) | 128);
            return this;
        }
        d.r(nj.m(i, new StringBuilder("Unexpected code point: ")));
        return null;
    }

    public kgy kgy(String str, int i, int i2, Charset charset) {
        if (str == null) {
            d.r("string == null");
            return null;
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i2 >= i) {
            if (i2 > str.length()) {
                m93.g(str.length(), jc1.s(i2, "endIndex > string.length: ", " > "));
                return null;
            }
            if (charset != null) {
                if (charset.equals(gf.kgy)) {
                    return kgy(str, i, i2);
                }
                byte[] bytes = str.substring(i, i2).getBytes(charset);
                return ahm(bytes, 0, bytes.length);
            }
            d.r("charset == null");
            return null;
        }
        d.r(nj.i(i2, i, "endIndex < beginIndex: ", " < "));
        return null;
    }
}
