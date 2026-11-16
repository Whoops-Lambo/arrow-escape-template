package com.google.android.gms.internal.ads;

import defpackage.yk3;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzidm implements zzhsw {
    public final yk3 a;
    public final String b;
    public final SecretKeySpec c;
    public final int d;

    @Override // com.google.android.gms.internal.ads.zzhsw
    public final byte[] c(int i, byte[] bArr) throws InvalidAlgorithmParameterException {
        if (i > this.d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        yk3 yk3Var = this.a;
        ((Mac) yk3Var.get()).update(bArr);
        return Arrays.copyOf(((Mac) yk3Var.get()).doFinal(), i);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public zzidm(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        int i;
        yk3 yk3Var = new yk3(this, 1);
        this.a = yk3Var;
        if (zzhnn.a(2)) {
            this.b = str;
            this.c = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            i = 20;
                            this.d = i;
                            yk3Var.get();
                            return;
                        }
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            i = 28;
                            this.d = i;
                            yk3Var.get();
                            return;
                        }
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            i = 32;
                            this.d = i;
                            yk3Var.get();
                            return;
                        }
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            i = 48;
                            this.d = i;
                            yk3Var.get();
                            return;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            i = 64;
                            this.d = i;
                            yk3Var.get();
                            return;
                        }
                        break;
                }
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }
}
