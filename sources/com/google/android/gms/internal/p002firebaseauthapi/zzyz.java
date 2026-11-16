package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.gl0;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzyz implements zzaah {
    public static final gl0 d = new gl0(18);
    public final SecretKeySpec a;
    public final int b;
    public final int c;

    public final void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = (Cipher) d.get();
        byte[] bArr4 = new byte[this.c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.a;
        if (z) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) == i2) {
            return;
        }
        e.d("stored output's length does not match input's length");
    }

    public zzyz(byte[] bArr, int i) throws GeneralSecurityException {
        if (zzjd.zza.b.zza()) {
            zzaap.b(bArr.length);
            this.a = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) d.get()).getBlockSize();
            this.c = blockSize;
            if (i >= 12 && i <= blockSize) {
                this.b = i;
                return;
            } else {
                e.d("invalid IV size");
                throw null;
            }
        }
        e.d("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }
}
