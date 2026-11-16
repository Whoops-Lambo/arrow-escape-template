package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.aw4;
import defpackage.e32;
import defpackage.uv4;
import defpackage.wv4;
import defpackage.xv4;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhny {
    public static final uv4 a = new uv4(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final wv4 b = new wv4(new xv4(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, (Serializable) new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 0), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final byte[] c = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static byte[] a(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 + i2;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4);
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 63) {
            byte b2 = (byte) (bArr2[i4] + i5);
            bArr2[i4] = b2;
            int i6 = (b2 + 8) >> 4;
            bArr2[i4] = (byte) (b2 - (i6 << 4));
            i4++;
            i5 = i6;
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        wv4 wv4Var = new wv4(0);
        wv4 wv4Var2 = new wv4(1);
        for (i = 1; i < 64; i += 2) {
            uv4 uv4Var = new uv4();
            g(uv4Var, i / 2, bArr2[i]);
            wv4.a(wv4Var2, wv4Var);
            d(wv4Var, wv4Var2, uv4Var);
        }
        xv4 xv4Var = new xv4();
        xv4.e(wv4Var, xv4Var);
        f(wv4Var, xv4Var);
        xv4.e(wv4Var, xv4Var);
        f(wv4Var, xv4Var);
        xv4.e(wv4Var, xv4Var);
        f(wv4Var, xv4Var);
        xv4.e(wv4Var, xv4Var);
        f(wv4Var, xv4Var);
        for (int i7 = 0; i7 < 64; i7 += 2) {
            uv4 uv4Var2 = new uv4();
            g(uv4Var2, i7 / 2, bArr2[i7]);
            wv4.a(wv4Var2, wv4Var);
            d(wv4Var, wv4Var2, uv4Var2);
        }
        xv4 xv4Var2 = new xv4(wv4Var);
        long[] jArr = new long[10];
        zzhof.f(jArr, (long[]) xv4Var2.b);
        long[] jArr2 = new long[10];
        zzhof.f(jArr2, (long[]) xv4Var2.c);
        long[] jArr3 = new long[10];
        zzhof.f(jArr3, (long[]) xv4Var2.d);
        long[] jArr4 = new long[10];
        zzhof.f(jArr4, jArr3);
        long[] jArr5 = new long[10];
        zzhof.b(jArr5, jArr2, jArr);
        zzhof.e(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        zzhof.e(jArr6, jArr, jArr2);
        zzhof.e(jArr6, jArr6, aw4.a);
        zzhof.a(jArr6, jArr6, jArr4);
        zzhof.c(jArr6, jArr6);
        if (MessageDigest.isEqual(zzhof.h(jArr5), zzhof.h(jArr6))) {
            return xv4Var2.f();
        }
        e32.i("arithmetic error in scalar multiplication");
        return null;
    }

    public static byte[] b(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) zzicx.e.a.a("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i = bArrDigest[31] & 127;
        bArrDigest[31] = (byte) i;
        bArrDigest[31] = (byte) (i | 64);
        return bArrDigest;
    }

    public static /* synthetic */ boolean c(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        zzhof.d(jArr2);
        byte[] bArrH = zzhof.h(jArr2);
        for (int i = 0; i < 32; i++) {
            if (bArrH[i] != 0) {
                return true;
            }
        }
        return false;
    }

    public static void d(wv4 wv4Var, wv4 wv4Var2, uv4 uv4Var) {
        xv4 xv4Var = wv4Var2.a;
        xv4 xv4Var2 = wv4Var.a;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) xv4Var2.b;
        long[] jArr3 = (long[]) xv4Var.c;
        long[] jArr4 = (long[]) xv4Var.b;
        zzhof.a(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) xv4Var2.c;
        zzhof.b(jArr5, jArr3, jArr4);
        zzhof.e(jArr5, jArr5, uv4Var.b);
        long[] jArr6 = uv4Var.a;
        long[] jArr7 = (long[]) xv4Var2.d;
        zzhof.e(jArr7, jArr2, jArr6);
        long[] jArr8 = wv4Var.b;
        zzhof.e(jArr8, wv4Var2.b, uv4Var.c);
        uv4Var.a(jArr2, (long[]) xv4Var.d);
        zzhof.a(jArr, jArr2, jArr2);
        zzhof.b(jArr2, jArr7, jArr5);
        zzhof.a(jArr5, jArr7, jArr5);
        zzhof.a(jArr7, jArr, jArr8);
        zzhof.b(jArr8, jArr, jArr8);
    }

    public static void e(wv4 wv4Var, wv4 wv4Var2, uv4 uv4Var) {
        xv4 xv4Var = wv4Var2.a;
        xv4 xv4Var2 = wv4Var.a;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) xv4Var2.b;
        long[] jArr3 = (long[]) xv4Var.c;
        long[] jArr4 = (long[]) xv4Var.b;
        zzhof.a(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) xv4Var2.c;
        zzhof.b(jArr5, jArr3, jArr4);
        zzhof.e(jArr5, jArr5, uv4Var.a);
        long[] jArr6 = uv4Var.b;
        long[] jArr7 = (long[]) xv4Var2.d;
        zzhof.e(jArr7, jArr2, jArr6);
        long[] jArr8 = wv4Var.b;
        zzhof.e(jArr8, wv4Var2.b, uv4Var.c);
        uv4Var.a(jArr2, (long[]) xv4Var.d);
        zzhof.a(jArr, jArr2, jArr2);
        zzhof.b(jArr2, jArr7, jArr5);
        zzhof.a(jArr5, jArr7, jArr5);
        zzhof.b(jArr7, jArr, jArr8);
        zzhof.a(jArr8, jArr, jArr8);
    }

    public static void f(wv4 wv4Var, xv4 xv4Var) {
        xv4 xv4Var2 = wv4Var.a;
        long[] jArr = (long[]) xv4Var2.b;
        long[] jArr2 = (long[]) xv4Var.b;
        long[] jArr3 = new long[10];
        zzhof.f(jArr, jArr2);
        long[] jArr4 = (long[]) xv4Var2.d;
        long[] jArr5 = (long[]) xv4Var.c;
        zzhof.f(jArr4, jArr5);
        long[] jArr6 = wv4Var.b;
        zzhof.f(jArr6, (long[]) xv4Var.d);
        zzhof.a(jArr6, jArr6, jArr6);
        long[] jArr7 = (long[]) xv4Var2.c;
        zzhof.a(jArr7, jArr2, jArr5);
        zzhof.f(jArr3, jArr7);
        zzhof.a(jArr7, jArr4, jArr);
        zzhof.b(jArr4, jArr4, jArr);
        zzhof.b(jArr, jArr3, jArr7);
        zzhof.b(jArr6, jArr6, jArr4);
    }

    public static void g(uv4 uv4Var, int i, byte b2) {
        uv4[][] uv4VarArr = aw4.d;
        uv4 uv4Var2 = uv4VarArr[i][0];
        int i2 = (b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 7;
        int i3 = (-i2) & b2;
        int i4 = b2 - (i3 + i3);
        int i5 = (i4 ^ (-2)) & 255;
        int i6 = i5 & (i5 << 4);
        int i7 = i6 & (i6 << 2);
        uv4Var.b(uv4Var2, (i7 & (i7 + i7)) >> 7);
        int i8 = (i4 ^ (-3)) & 255;
        int i9 = i8 & (i8 << 4);
        int i10 = i9 & (i9 << 2);
        uv4Var.b(uv4VarArr[i][1], (i10 & (i10 + i10)) >> 7);
        int i11 = (i4 ^ (-4)) & 255;
        int i12 = i11 & (i11 << 4);
        int i13 = i12 & (i12 << 2);
        uv4Var.b(uv4VarArr[i][2], (i13 & (i13 + i13)) >> 7);
        int i14 = (i4 ^ (-5)) & 255;
        int i15 = i14 & (i14 << 4);
        int i16 = i15 & (i15 << 2);
        uv4Var.b(uv4VarArr[i][3], (i16 & (i16 + i16)) >> 7);
        int i17 = (i4 ^ (-6)) & 255;
        int i18 = i17 & (i17 << 4);
        int i19 = i18 & (i18 << 2);
        uv4Var.b(uv4VarArr[i][4], (i19 & (i19 + i19)) >> 7);
        int i20 = (i4 ^ (-7)) & 255;
        int i21 = i20 & (i20 << 4);
        int i22 = i21 & (i21 << 2);
        uv4Var.b(uv4VarArr[i][5], (i22 & (i22 + i22)) >> 7);
        int i23 = (i4 ^ (-8)) & 255;
        int i24 = i23 & (i23 << 4);
        int i25 = i24 & (i24 << 2);
        uv4Var.b(uv4VarArr[i][6], (i25 & (i25 + i25)) >> 7);
        int i26 = (i4 ^ (-9)) & 255;
        int i27 = i26 & (i26 << 4);
        int i28 = i27 & (i27 << 2);
        uv4Var.b(uv4VarArr[i][7], (i28 & (i28 + i28)) >> 7);
        long[] jArr = uv4Var.b;
        long[] jArr2 = uv4Var.a;
        long[] jArr3 = uv4Var.c;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr3, 10);
        for (int i29 = 0; i29 < jArrCopyOf3.length; i29++) {
            jArrCopyOf3[i29] = -jArrCopyOf3[i29];
        }
        zzhns.a(jArr2, jArrCopyOf, i2);
        zzhns.a(jArr, jArrCopyOf2, i2);
        zzhns.a(jArr3, jArrCopyOf3, i2);
    }

    public static byte[] h(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b2 = bArr2[i];
                    if (b2 != 0) {
                        byte b3 = bArr2[i3];
                        int i5 = b2 << i4;
                        int i6 = b3 + i5;
                        if (i6 > 15) {
                            int i7 = b3 - i5;
                            if (i7 < -15) {
                                break;
                            }
                            bArr2[i3] = (byte) i7;
                            while (i < 256) {
                                if (bArr2[i] == 0) {
                                    bArr2[i] = 1;
                                    break;
                                }
                                bArr2[i] = 0;
                                i++;
                            }
                        } else {
                            bArr2[i3] = (byte) i6;
                            bArr2[i] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static long i(int i, byte[] bArr) {
        return (((long) (bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 16) | (bArr[i] & 255) | (((long) (bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8);
    }

    public static long j(int i, byte[] bArr) {
        return (((long) (bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 24) | i(i, bArr);
    }
}
