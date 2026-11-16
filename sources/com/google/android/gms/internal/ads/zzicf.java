package com.google.android.gms.internal.ads;

import defpackage.gl0;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzicf implements zzhfw {
    public final SecretKeySpec a;
    public final byte[] b;

    @Override // com.google.android.gms.internal.ads.zzhfw
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            defpackage.d.w("ciphertext is null");
            return null;
        }
        int length = bArr.length;
        byte[] bArr3 = this.b;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("ciphertext too short");
            return null;
        }
        if (!zzhqq.a(bArr3, bArr)) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        gl0 gl0Var = zzhlq.a;
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, length2, 12);
        Cipher cipher = (Cipher) zzhlq.a.get();
        cipher.init(2, this.a, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }

    public zzicf(byte[] bArr, zzidx zzidxVar) throws GeneralSecurityException {
        if (zzhnn.a(2)) {
            gl0 gl0Var = zzhlq.a;
            zzidv.a(bArr.length);
            this.a = new SecretKeySpec(bArr, "AES");
            this.b = zzidxVar.b();
            return;
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }
}
