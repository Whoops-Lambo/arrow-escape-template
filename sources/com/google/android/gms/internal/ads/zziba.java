package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zziba implements zzhhb {
    public static final byte[] e = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};
    public final PublicKey a;
    public final byte[] b;
    public final byte[] c;
    public final Provider d;

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        if (bArr.length != length + 64) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Invalid signature length: 64");
            return;
        }
        if (!zzhqq.a(bArr3, bArr)) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Invalid signature (output prefix mismatch)");
            return;
        }
        Signature signature = Signature.getInstance("Ed25519", this.d);
        signature.initVerify(this.a);
        signature.update(bArr2);
        signature.update(this.c);
        try {
            if (signature.verify(bArr, length, 64)) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("Signature check failed.");
    }

    public zziba(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (zzhnn.a(1)) {
            if (bArr.length == 32) {
                this.a = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(zzicj.a(e, bArr)));
                this.b = bArr2;
                this.c = bArr3;
                this.d = provider;
                return;
            }
            defpackage.d.r("Given public key's length is not 32.");
            throw null;
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("Can not use Ed25519 in FIPS-mode.");
        throw null;
    }

    public static zziba b(zzhyb zzhybVar) throws GeneralSecurityException {
        byte[] bArr;
        Provider providerA = zzhnr.a();
        if (providerA != null) {
            if (zzhnn.a(1)) {
                byte[] bArrB = zzhybVar.b.b();
                byte[] bArrB2 = zzhybVar.c.b();
                if (zzhybVar.a.a.equals(zzhxt.d)) {
                    bArr = new byte[]{0};
                } else {
                    bArr = new byte[0];
                }
                return new zziba(bArrB, bArrB2, bArr, providerA);
            }
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Can not use Ed25519 in FIPS-mode.");
            return null;
        }
        throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
    }
}
