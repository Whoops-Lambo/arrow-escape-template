package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.jc1;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhk implements zzbm {
    public static final byte[] d = zzaaf.b("7a806c");
    public static final byte[] e = zzaaf.b("46bb91c3c5");
    public static final byte[] f = zzaaf.b("36864200e0eaf5284d884a0e77d31646");
    public static final byte[] g = zzaaf.b("bae8e37fc83441b16034566b");
    public static final byte[] h = zzaaf.b("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    public final zzix a;
    public final SecretKeySpec b;
    public final byte[] c;

    public static boolean c(Cipher cipher) {
        try {
            byte[] bArr = g;
            cipher.init(2, new SecretKeySpec(f, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(e);
            byte[] bArr2 = h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.c;
        if (length < bArr3.length + 28) {
            e.d("ciphertext too short");
            return null;
        }
        if (!zzqu.b(bArr3, bArr)) {
            e.d("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        Cipher cipherA = this.a.a();
        cipherA.init(2, this.b, new GCMParameterSpec(128, bArr, bArr3.length, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipherA.updateAAD(bArr2);
        }
        return cipherA.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipherA = this.a.a();
        int length = bArr.length;
        byte[] bArr3 = this.c;
        if (length > 2147483619 - bArr3.length) {
            e.d("plaintext too long");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + bArr.length + 16);
        byte[] bArrA = zzqm.a(12);
        System.arraycopy(bArrA, 0, bArrCopyOf, bArr3.length, 12);
        cipherA.init(1, this.b, new GCMParameterSpec(128, bArrA, 0, bArrA.length));
        if (bArr2 != null && bArr2.length != 0) {
            cipherA.updateAAD(bArr2);
        }
        int iDoFinal = cipherA.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + 12);
        if (iDoFinal == bArr.length + 16) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException(jc1.k(iDoFinal - bArr.length, "encryption failed; AES-GCM-SIV tag must be 16 bytes, but got only ", " bytes"));
    }

    public zzhk(byte[] bArr, byte[] bArr2, zzix zzixVar) throws InvalidAlgorithmParameterException {
        this.c = bArr2;
        zzaap.b(bArr.length);
        this.b = new SecretKeySpec(bArr, "AES");
        this.a = zzixVar;
    }
}
