package com.google.android.gms.internal.ads;

import defpackage.gl0;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzicc implements zzidi {
    public static final gl0 d = new gl0(11);
    public final SecretKeySpec a;
    public final int b;
    public final int c;

    public zzicc(byte[] bArr, int i) throws GeneralSecurityException {
        if (zzhnn.a(2)) {
            zzidv.a(bArr.length);
            this.a = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) d.get()).getBlockSize();
            this.c = blockSize;
            if (i <= blockSize) {
                this.b = i;
                return;
            } else {
                io.p071bidmachine.ads.networks.adaptiverendering.e.d("invalid IV size");
                throw null;
            }
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }
}
