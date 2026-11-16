package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.d;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class q implements zzlu {
    public final zzjp a;
    public final int b;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlu
    public final byte[] a(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrC;
        byte[] bArrC2;
        if (bArr2.length < i) {
            e.d("ciphertext too short");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, i, bArr2.length);
        zzji.zza zzaVar = new zzji.zza(0);
        zzaVar.a = this.a;
        zzdd zzddVar = zzdd.a;
        zzaVar.b = zzaav.b(bArr, zzddVar);
        zzji zzjiVarA = zzaVar.a();
        zzzg zzzgVar = new zzzg(zzjiVarA.b.c(zzddVar), zzjiVarA.c);
        byte[][] bArr3 = {zzlq.a};
        int length = bArrCopyOfRange.length;
        byte[] bArr4 = zzzgVar.c;
        if (length < bArr4.length + 16) {
            e.d("Ciphertext too short.");
            return null;
        }
        if (!zzqu.b(bArr4, bArrCopyOfRange)) {
            e.d("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        Cipher cipher = (Cipher) zzzg.f.get();
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrCopyOfRange, bArr4.length, bArr4.length + 16);
        byte[] bArr5 = (byte[]) bArrCopyOfRange2.clone();
        bArr5[8] = (byte) (bArr5[8] & 127);
        bArr5[12] = (byte) (bArr5[12] & 127);
        cipher.init(2, new SecretKeySpec(zzzgVar.b, "AES"), new IvParameterSpec(bArr5));
        int length2 = bArr4.length + 16;
        int length3 = bArrCopyOfRange.length - length2;
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange, length2, length3);
        if (length3 == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        byte[][] bArr6 = (byte[][]) Arrays.copyOf(bArr3, 2);
        bArr6[1] = bArrDoFinal;
        int length4 = bArr6.length;
        zzsz zzszVar = zzzgVar.a;
        if (length4 == 0) {
            bArrC2 = zzszVar.c(16, zzzg.e);
        } else {
            byte[] bArrC3 = zzszVar.c(16, zzzg.d);
            for (int i2 = 0; i2 < bArr6.length - 1; i2++) {
                byte[] bArr7 = bArr6[i2];
                if (bArr7 == null) {
                    bArr7 = new byte[0];
                }
                bArrC3 = zzzi.c(zzse.a(bArrC3), zzszVar.c(16, bArr7));
            }
            byte[] bArr8 = bArr6[bArr6.length - 1];
            if (bArr8.length >= 16) {
                if (bArr8.length < bArrC3.length) {
                    d.r("xorEnd requires a.length >= b.length");
                    return null;
                }
                int length5 = bArr8.length - bArrC3.length;
                bArrC = Arrays.copyOf(bArr8, bArr8.length);
                for (int i3 = 0; i3 < bArrC3.length; i3++) {
                    int i4 = length5 + i3;
                    bArrC[i4] = (byte) (bArrC[i4] ^ bArrC3[i3]);
                }
            } else {
                if (bArr8.length >= 16) {
                    d.r("x must be smaller than a block.");
                    return null;
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr8, 16);
                bArrCopyOf[bArr8.length] = -128;
                bArrC = zzzi.c(bArrCopyOf, zzse.a(bArrC3));
            }
            bArrC2 = zzszVar.c(16, bArrC);
        }
        if (MessageDigest.isEqual(bArrCopyOfRange2, bArrC2)) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlu
    public final int zza() {
        return this.b;
    }

    public q(zzjp zzjpVar) {
        this.a = zzjpVar;
        this.b = zzjpVar.a;
    }
}
