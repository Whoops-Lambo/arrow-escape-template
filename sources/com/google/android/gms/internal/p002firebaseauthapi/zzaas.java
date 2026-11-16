package com.google.android.gms.internal.p002firebaseauthapi;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.e32;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaas {
    public static byte[] a(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return b(bArr, bArr2);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        int i = 32;
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        int i2 = 0;
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        byte b = (byte) (bArrCopyOf[31] & 127);
        bArrCopyOf[31] = b;
        bArrCopyOf[31] = (byte) (b | 64);
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
        bArrCopyOf2[31] = (byte) (bArrCopyOf2[31] & 127);
        for (int i3 = 0; i3 < 7; i3++) {
            byte[][] bArr3 = zznw.a;
            if (MessageDigest.isEqual(bArr3[i3], bArrCopyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(zzaaf.a(bArr3[i3])));
            }
        }
        int i4 = 10;
        long[] jArr2 = new long[10];
        for (int i5 = 0; i5 < 10; i5++) {
            int i6 = zzoc.a[i5];
            jArr2[i5] = (((((long) (bArrCopyOf2[i6 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 24) | ((((long) (bArrCopyOf2[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) | (((long) (bArrCopyOf2[i6 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8)) | (((long) (bArrCopyOf2[i6 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 16))) >> zzoc.b[i5]) & ((long) zzoc.c[i5 & 1]);
        }
        long[] jArr3 = new long[19];
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        jArr5[0] = 1;
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        long[] jArr8 = new long[19];
        jArr8[0] = 1;
        long[] jArr9 = new long[19];
        long[] jArr10 = new long[19];
        jArr10[0] = 1;
        System.arraycopy(jArr2, 0, jArr3, 0, 10);
        while (i2 < i) {
            int i7 = bArrCopyOf[31 - i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i8 = 0;
            while (i8 < 8) {
                int i9 = (i7 >> (7 - i8)) & 1;
                zznw.a(jArr5, jArr3, i9);
                zznw.a(jArr6, jArr4, i9);
                byte[] bArr4 = bArrCopyOf;
                long[] jArrCopyOf = Arrays.copyOf(jArr5, 10);
                int i10 = i7;
                long[] jArr11 = new long[19];
                int i11 = i2;
                long[] jArr12 = new long[19];
                int i12 = i8;
                long[] jArr13 = new long[19];
                long[] jArr14 = jArr;
                long[] jArr15 = new long[19];
                long[] jArr16 = new long[19];
                long[] jArr17 = jArr10;
                long[] jArr18 = new long[19];
                long[] jArr19 = new long[19];
                zzoc.h(jArr5, jArr5, jArr6);
                zzoc.f(jArr6, jArrCopyOf, jArr6);
                long[] jArrCopyOf2 = Arrays.copyOf(jArr3, 10);
                zzoc.h(jArr3, jArr3, jArr4);
                zzoc.f(jArr4, jArrCopyOf2, jArr4);
                zzoc.e(jArr15, jArr3, jArr6);
                zzoc.e(jArr16, jArr5, jArr4);
                zzoc.c(jArr15);
                zzoc.a(jArr15);
                zzoc.c(jArr16);
                zzoc.a(jArr16);
                long[] jArr20 = jArr3;
                System.arraycopy(jArr15, 0, jArrCopyOf2, 0, 10);
                zzoc.h(jArr15, jArr15, jArr16);
                zzoc.f(jArr16, jArrCopyOf2, jArr16);
                zzoc.d(jArr19, jArr15);
                zzoc.d(jArr18, jArr16);
                zzoc.e(jArr16, jArr18, jArr2);
                zzoc.c(jArr16);
                zzoc.a(jArr16);
                System.arraycopy(jArr19, 0, jArr7, 0, 10);
                System.arraycopy(jArr16, 0, jArr8, 0, 10);
                zzoc.d(jArr12, jArr5);
                zzoc.d(jArr13, jArr6);
                zzoc.e(jArr9, jArr12, jArr13);
                zzoc.c(jArr9);
                zzoc.a(jArr9);
                zzoc.f(jArr13, jArr12, jArr13);
                Arrays.fill(jArr11, 10, 18, 0L);
                int i13 = 0;
                for (int i14 = 10; i13 < i14; i14 = 10) {
                    jArr11[i13] = jArr13[i13] * 121665;
                    i13++;
                }
                zzoc.a(jArr11);
                zzoc.h(jArr11, jArr11, jArr12);
                zzoc.e(jArr17, jArr13, jArr11);
                zzoc.c(jArr17);
                zzoc.a(jArr17);
                zznw.a(jArr9, jArr7, i9);
                zznw.a(jArr17, jArr8, i9);
                i8 = i12 + 1;
                long[] jArr21 = jArr5;
                jArr5 = jArr9;
                jArr9 = jArr21;
                long[] jArr22 = jArr6;
                jArr6 = jArr17;
                jArr10 = jArr22;
                long[] jArr23 = jArr8;
                jArr8 = jArr4;
                jArr4 = jArr23;
                i7 = i10;
                jArr3 = jArr7;
                bArrCopyOf = bArr4;
                i2 = i11;
                jArr = jArr14;
                jArr7 = jArr20;
            }
            i2++;
            i = 32;
            i4 = 10;
        }
        long[] jArr24 = jArr;
        int i15 = i4;
        long[] jArr25 = new long[i15];
        long[] jArr26 = new long[i15];
        long[] jArr27 = new long[i15];
        long[] jArr28 = new long[i15];
        long[] jArr29 = new long[i15];
        long[] jArr30 = new long[i15];
        long[] jArr31 = new long[i15];
        long[] jArr32 = new long[i15];
        long[] jArr33 = new long[i15];
        long[] jArr34 = new long[i15];
        long[] jArr35 = jArr3;
        long[] jArr36 = new long[i15];
        zzoc.d(jArr26, jArr6);
        zzoc.d(jArr36, jArr26);
        zzoc.d(jArr34, jArr36);
        zzoc.b(jArr27, jArr34, jArr6);
        zzoc.b(jArr28, jArr27, jArr26);
        zzoc.d(jArr34, jArr28);
        zzoc.b(jArr29, jArr34, jArr27);
        zzoc.d(jArr34, jArr29);
        zzoc.d(jArr36, jArr34);
        zzoc.d(jArr34, jArr36);
        zzoc.d(jArr36, jArr34);
        zzoc.d(jArr34, jArr36);
        zzoc.b(jArr30, jArr34, jArr29);
        zzoc.d(jArr34, jArr30);
        zzoc.d(jArr36, jArr34);
        for (int i16 = 2; i16 < 10; i16 += 2) {
            zzoc.d(jArr34, jArr36);
            zzoc.d(jArr36, jArr34);
        }
        zzoc.b(jArr31, jArr36, jArr30);
        zzoc.d(jArr34, jArr31);
        zzoc.d(jArr36, jArr34);
        for (int i17 = 2; i17 < 20; i17 += 2) {
            zzoc.d(jArr34, jArr36);
            zzoc.d(jArr36, jArr34);
        }
        zzoc.b(jArr34, jArr36, jArr31);
        zzoc.d(jArr36, jArr34);
        zzoc.d(jArr34, jArr36);
        for (int i18 = 2; i18 < 10; i18 += 2) {
            zzoc.d(jArr36, jArr34);
            zzoc.d(jArr34, jArr36);
        }
        zzoc.b(jArr32, jArr34, jArr30);
        zzoc.d(jArr34, jArr32);
        zzoc.d(jArr36, jArr34);
        for (int i19 = 2; i19 < 50; i19 += 2) {
            zzoc.d(jArr34, jArr36);
            zzoc.d(jArr36, jArr34);
        }
        zzoc.b(jArr33, jArr36, jArr32);
        zzoc.d(jArr36, jArr33);
        zzoc.d(jArr34, jArr36);
        for (int i20 = 2; i20 < 100; i20 += 2) {
            zzoc.d(jArr36, jArr34);
            zzoc.d(jArr34, jArr36);
        }
        zzoc.b(jArr36, jArr34, jArr33);
        zzoc.d(jArr34, jArr36);
        zzoc.d(jArr36, jArr34);
        for (int i21 = 2; i21 < 50; i21 += 2) {
            zzoc.d(jArr34, jArr36);
            zzoc.d(jArr36, jArr34);
        }
        zzoc.b(jArr34, jArr36, jArr32);
        zzoc.d(jArr36, jArr34);
        zzoc.d(jArr34, jArr36);
        zzoc.d(jArr36, jArr34);
        zzoc.d(jArr34, jArr36);
        zzoc.d(jArr36, jArr34);
        zzoc.b(jArr25, jArr36, jArr28);
        zzoc.b(jArr24, jArr5, jArr25);
        long[] jArr37 = new long[10];
        long[] jArr38 = new long[10];
        long[] jArr39 = new long[11];
        long[] jArr40 = new long[11];
        long[] jArr41 = new long[11];
        zzoc.b(jArr37, jArr2, jArr24);
        zzoc.h(jArr38, jArr2, jArr24);
        long[] jArr42 = new long[10];
        jArr42[0] = 486662;
        zzoc.h(jArr40, jArr38, jArr42);
        zzoc.b(jArr40, jArr40, jArr4);
        zzoc.h(jArr40, jArr40, jArr35);
        zzoc.b(jArr40, jArr40, jArr37);
        zzoc.b(jArr40, jArr40, jArr35);
        for (int i22 = 0; i22 < 10; i22++) {
            jArr39[i22] = jArr40[i22] * 4;
        }
        zzoc.a(jArr39);
        zzoc.b(jArr40, jArr37, jArr4);
        zzoc.f(jArr40, jArr40, jArr4);
        zzoc.b(jArr41, jArr38, jArr35);
        zzoc.h(jArr40, jArr40, jArr41);
        zzoc.d(jArr40, jArr40);
        if (MessageDigest.isEqual(zzoc.g(jArr39), zzoc.g(jArr40))) {
            return zzoc.g(jArr24);
        }
        e32.i("Arithmetic error in curve multiplication with the public key: ".concat(zzaaf.a(bArr2)));
        return null;
    }
}
