package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.e32;
import defpackage.kf4;
import defpackage.pv1;
import defpackage.q63;
import defpackage.xm4;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzey {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final zzgzl f = zzgzl.B(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public static final AtomicReference g = new AtomicReference();
    public byte[] a;
    public int b;
    public int c;

    public final void C(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        }
        zzgvz.a(z);
        this.c = i;
    }

    public final void E(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.c) {
            z = true;
        }
        zzgvz.a(z);
        this.b = i;
    }

    public final int I() {
        v(1, xm4.n);
        return this.a[this.b] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final int K() {
        v(1, xm4.n);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final long p() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.b == this.c) {
                e32.i("Attempting to read a byte over the limit.");
                return 0L;
            }
            long jK = K();
            j |= (127 & jK) << (i * 7);
            if ((jK & 128) == 0) {
                return j;
            }
        }
        return j;
    }

    public final char r(int i, ByteOrder byteOrder) {
        byte b;
        byte b2;
        v(2, xm4.n);
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.a;
        int i2 = this.b;
        if (byteOrder == byteOrder2) {
            int i3 = i2 + i;
            b = bArr[i3];
            b2 = bArr[i3 + 1];
        } else {
            int i4 = i2 + i;
            b = bArr[i4 + 1];
            b2 = bArr[i4];
        }
        return (char) ((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (b << 8));
    }

    public static int u(Charset charset) {
        zzgvz.e(f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean w(byte b) {
        return (b & 192) == 128;
    }

    public static int x(int i, int i2, int i3, int i4) {
        return ((zzhcv.a(((i & 7) << 2) | ((i2 & 48) >> 4)) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((zzhcv.a(((i2 & 15) << 4) | ((i3 & 60) >> 2)) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (zzhcv.a(((i3 & 3) << 6) | (i4 & 63)) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public final void A(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final int B() {
        return Math.max(this.c - this.b, 0);
    }

    public final int D() {
        return this.b;
    }

    public final byte[] F() {
        return this.a;
    }

    public final void G(int i) {
        E(this.b + i);
    }

    public final void H(int i, int i2, byte[] bArr) {
        v(i2, xm4.n);
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final int L() {
        v(2, xm4.n);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.b = i + 2;
        return (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i3 << 8);
    }

    public final int M() {
        v(2, xm4.n);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.b = i + 2;
        return ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i3;
    }

    public final short N() {
        v(2, xm4.n);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.b = i + 2;
        return (short) ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i3 << 8));
    }

    public final int O() {
        v(3, xm4.n);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.b = i + 3;
        return (bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i3 << 16) | (i5 << 8);
    }

    public final long P() {
        v(4, xm4.n);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.b = i4;
        long j3 = bArr[i3];
        this.b = i + 4;
        return (((long) bArr[i4]) & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public final long a() {
        v(4, xm4.n);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.b = i4;
        long j3 = bArr[i3];
        this.b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | (255 & j) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final int b() {
        v(4, xm4.n);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i6 = i + 3;
        this.b = i6;
        int i7 = bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.b = i + 4;
        return (bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i3 << 24) | (i5 << 16) | (i7 << 8);
    }

    public final int c() {
        v(4, xm4.n);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i6 = i + 3;
        this.b = i6;
        int i7 = bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.b = i + 4;
        return ((bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    public final long d() {
        v(8, xm4.n);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.b = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.b = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.b = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.b = i7;
        long j6 = bArr[i6];
        int i8 = i + 7;
        this.b = i8;
        long j7 = bArr[i7];
        this.b = i + 8;
        return ((j7 & 255) << 8) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | (((long) bArr[i8]) & 255);
    }

    public final long e() {
        v(8, xm4.n);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.b = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.b = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.b = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.b = i7;
        long j6 = bArr[i6];
        int i8 = i + 7;
        this.b = i8;
        long j7 = bArr[i7];
        this.b = i + 8;
        return ((j7 & 255) << 48) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40) | ((((long) bArr[i8]) & 255) << 56);
    }

    public final int f() {
        v(4, xm4.n);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.b = i + 2;
        int i4 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.b = i + 4;
        return (i3 << 8) | i4;
    }

    public final String k(int i, Charset charset) {
        v(i, xm4.p);
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = new String(bArr, i2, i, charset);
        this.b = i2 + i;
        return str;
    }

    public final String l(int i) {
        v(i, xm4.o);
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.c || this.a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.a;
        String str = zzfq.a;
        String str2 = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.b += i;
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:41:0x009d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc A[ADDED_TO_REGION, EDGE_INSN: B:62:0x00bc->B:53:0x00bc BREAK  A[LOOP:0: B:23:0x0058->B:51:0x00b9], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc A[ADDED_TO_REGION, EDGE_INSN: B:64:0x00bc->B:53:0x00bc BREAK  A[LOOP:0: B:23:0x0058->B:51:0x00b9], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9 A[SYNTHETIC] */
    public final String n(Charset charset) {
        byte[] bArr;
        byte b;
        byte[] bArr2;
        byte b2;
        zzgvz.e(f.contains(charset), "Unsupported charset: %s", charset);
        if (B() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            q();
        }
        int i = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            i = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                defpackage.d.r("Unsupported charset: ".concat(String.valueOf(charset)));
                return null;
            }
        }
        int i2 = this.b;
        while (true) {
            int i3 = this.c;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
                byte b3 = this.a[i2];
                String str = zzfq.a;
                if (b3 == 10 || b3 == 13) {
                    break;
                }
                if (!charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    bArr = this.a;
                    if (bArr[i2] == 0) {
                        b = bArr[i2 + 1];
                        String str2 = zzfq.a;
                        if (b != 10 || b == 13) {
                            break;
                        }
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr2 = this.a;
                            if (bArr2[i2 + 1] == 0) {
                                b2 = bArr2[i2];
                                String str3 = zzfq.a;
                                if (b2 != 10 || b2 == 13) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i2 += i;
                    } else {
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr2 = this.a;
                            if (bArr2[i2 + 1] == 0) {
                                b2 = bArr2[i2];
                                String str4 = zzfq.a;
                                if (b2 != 10) {
                                    break;
                                }
                                break;
                                break;
                            }
                            continue;
                        }
                        i2 += i;
                    }
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        bArr2 = this.a;
                        if (bArr2[i2 + 1] == 0) {
                            b2 = bArr2[i2];
                            String str5 = zzfq.a;
                            if (b2 != 10) {
                                break;
                                break;
                            }
                            break;
                            break;
                        }
                        continue;
                    }
                    i2 += i;
                }
            } else if (charset.equals(StandardCharsets.UTF_16)) {
                bArr = this.a;
                if (bArr[i2] == 0) {
                    b = bArr[i2 + 1];
                    String str6 = zzfq.a;
                    if (b != 10) {
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr2 = this.a;
                    if (bArr2[i2 + 1] == 0) {
                        b2 = bArr2[i2];
                        String str7 = zzfq.a;
                        if (b2 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i2 += i;
            } else {
                bArr = this.a;
                if (bArr[i2] == 0) {
                    b = bArr[i2 + 1];
                    String str8 = zzfq.a;
                    if (b != 10) {
                        break;
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr2 = this.a;
                    if (bArr2[i2 + 1] == 0) {
                        b2 = bArr2[i2];
                        String str9 = zzfq.a;
                        if (b2 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i2 += i;
            }
        }
        String strK = k(i2 - this.b, charset);
        if (this.b != this.c && s(charset, d) == '\r') {
            s(charset, e);
        }
        return strK;
    }

    public final long o() {
        int i;
        xm4 xm4Var = xm4.n;
        v(1, xm4Var);
        long j = this.a[this.b];
        int i2 = 7;
        while (true) {
            i = 0;
            if (i2 < 0) {
                break;
            }
            int i3 = 1 << i2;
            if ((((long) i3) & j) == 0) {
                if (i2 >= 6) {
                    if (i2 != 7) {
                        break;
                    }
                    i = 1;
                    break;
                }
                j &= (long) (i3 - 1);
                i = 7 - i2;
                break;
            }
            i2--;
        }
        if (i == 0) {
            throw new NumberFormatException(q63.g(j, "Invalid UTF-8 sequence first byte: ", new StringBuilder(String.valueOf(j).length() + 35)));
        }
        v(i, xm4Var);
        for (int i4 = 1; i4 < i; i4++) {
            byte b = this.a[this.b + i4];
            if ((b & 192) != 128) {
                throw new NumberFormatException(q63.g(j, "Invalid UTF-8 sequence continuation byte: ", new StringBuilder(String.valueOf(j).length() + 42)));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.b += i;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    public final int t(Charset charset) {
        int codePoint;
        int i;
        zzgvz.e(f.contains(charset), "Unsupported charset: %s", charset);
        if (B() < u(charset)) {
            int i2 = this.b;
            int i3 = this.c;
            io.p071bidmachine.media3.extractor.ts.y.p(pv1.j(i2, i3, "position=", ", limit=", new StringBuilder(String.valueOf(i2).length() + 17 + String.valueOf(i3).length())));
            return 0;
        }
        int i4 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.a[this.b];
            if ((b & 128) == 0) {
                codePoint = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                return (codePoint << 8) | i4;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b2 = this.a[this.b];
            if ((b2 & 128) == 0) {
                i = 1;
            } else if ((b2 & 224) == 192 && B() >= 2 && w(this.a[this.b + 1])) {
                i = 2;
            } else if ((this.a[this.b] & 240) == 224 && B() >= 3) {
                byte[] bArr = this.a;
                int i5 = this.b;
                if (w(bArr[i5 + 1]) && w(bArr[i5 + 2])) {
                    i = 3;
                } else if ((this.a[this.b] & 248) == 240) {
                    i = 0;
                } else {
                    i = 0;
                }
            } else if ((this.a[this.b] & 248) == 240 || B() < 4) {
                i = 0;
            } else {
                byte[] bArr2 = this.a;
                int i6 = this.b;
                if (w(bArr2[i6 + 1]) && w(bArr2[i6 + 2]) && w(bArr2[i6 + 3])) {
                    i = 4;
                } else {
                    i = 0;
                }
            }
            if (i == 1) {
                codePoint = this.a[this.b] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            } else if (i == 2) {
                byte[] bArr3 = this.a;
                int i7 = this.b;
                codePoint = x(0, 0, bArr3[i7], bArr3[i7 + 1]);
            } else {
                if (i != 3) {
                    if (i == 4) {
                        byte[] bArr4 = this.a;
                        int i8 = this.b;
                        codePoint = x(bArr4[i8], bArr4[i8 + 1], bArr4[i8 + 2], bArr4[i8 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.a;
                int i9 = this.b;
                codePoint = x(0, bArr5[i9] & 15, bArr5[i9 + 1], bArr5[i9 + 2]);
            }
            i4 = i;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cR = r(0, byteOrder);
            if (!Character.isHighSurrogate(cR) || B() < 4) {
                codePoint = cR;
                i4 = 2;
            } else {
                codePoint = Character.toCodePoint(cR, r(2, byteOrder));
                i4 = 4;
            }
        }
        return (codePoint << 8) | i4;
    }

    public final void v(int i, zzgvq zzgvqVar) {
        Boolean bool = (Boolean) g.get();
        if (!(bool != null ? bool.booleanValue() : kf4.a) || B() >= i) {
            return;
        }
        int iB = B();
        throw ((RuntimeException) zzgvqVar.apply(pv1.j(i, iB, "bytesNeeded= ", ", bytesLeft=", new StringBuilder(String.valueOf(i).length() + 25 + String.valueOf(iB).length()))));
    }

    public final void y(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        z(i, bArr);
    }

    public final void z(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public zzey(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public final int J() {
        if (B() >= 4) {
            int iB = b();
            this.b -= 4;
            return iB;
        }
        int i = this.b;
        int i2 = this.c;
        io.p071bidmachine.media3.extractor.ts.y.p(pv1.j(i, i2, "position=", ", limit=", new StringBuilder(String.valueOf(i).length() + 17 + String.valueOf(i2).length())));
        return 0;
    }

    public final int g() {
        return K() | (K() << 21) | (K() << 14) | (K() << 7);
    }

    public final int h() {
        int iB = b();
        if (iB >= 0) {
            return iB;
        }
        e32.i(pv1.l(iB, "Top bit not zero: ", new StringBuilder(String.valueOf(iB).length() + 18)));
        return 0;
    }

    public final int i() {
        int iC = c();
        if (iC >= 0) {
            return iC;
        }
        e32.i(pv1.l(iC, "Top bit not zero: ", new StringBuilder(String.valueOf(iC).length() + 18)));
        return 0;
    }

    public final long j() {
        long jD = d();
        if (jD >= 0) {
            return jD;
        }
        e32.i(q63.g(jD, "Top bit not zero: ", new StringBuilder(String.valueOf(jD).length() + 18)));
        return 0L;
    }

    public final String m() {
        if (B() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = zzfq.a;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str2;
    }

    public final Charset q() {
        if (B() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (B() >= 2) {
            byte[] bArr2 = this.a;
            int i2 = this.b;
            byte b = bArr2[i2];
            if (b == -2) {
                if (bArr2[i2 + 1] == -1) {
                    this.b = i2 + 2;
                    return StandardCharsets.UTF_16BE;
                }
                return null;
            }
            if (b == -1 && bArr2[i2 + 1] == -2) {
                this.b = i2 + 2;
                return StandardCharsets.UTF_16LE;
            }
            return null;
        }
        return null;
    }

    public final char s(Charset charset, char[] cArr) {
        int iT;
        boolean z;
        if (B() >= u(charset) && (iT = t(charset)) != 0) {
            int i = iT >>> 8;
            if (!Character.isSupplementaryCodePoint(i)) {
                long j = i;
                char c = (char) j;
                if (c == j) {
                    z = true;
                } else {
                    z = false;
                }
                zzgvz.d(j, z, "Out of range: %s");
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.b = zzhcr.a(iT & 255) + this.b;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    public zzey() {
        this.a = zzfq.b;
    }

    public zzey(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public zzey(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }
}
