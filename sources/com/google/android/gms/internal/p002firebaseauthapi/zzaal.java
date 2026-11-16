package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.yk3;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaal implements zzsz {
    public final yk3 a;
    public final String b;
    public final SecretKeySpec c;
    public final int d;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzsz
    public final byte[] c(int i, byte[] bArr) throws InvalidAlgorithmParameterException {
        if (i > this.d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        yk3 yk3Var = this.a;
        ((Mac) yk3Var.get()).update(bArr);
        return Arrays.copyOf(((Mac) yk3Var.get()).doFinal(), i);
    }

    public zzaal(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        byte b = 0;
        yk3 yk3Var = new yk3(this, 0);
        this.a = yk3Var;
        if (zzjd.zza.b.zza()) {
            this.b = str;
            this.c = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        if (!str.equals("HMACSHA1")) {
                            b = -1;
                        }
                        break;
                    case 392315023:
                        b = !str.equals("HMACSHA224") ? (byte) -1 : (byte) 1;
                        break;
                    case 392315118:
                        b = !str.equals("HMACSHA256") ? (byte) -1 : (byte) 2;
                        break;
                    case 392316170:
                        b = !str.equals("HMACSHA384") ? (byte) -1 : (byte) 3;
                        break;
                    case 392317873:
                        b = !str.equals("HMACSHA512") ? (byte) -1 : (byte) 4;
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        this.d = 20;
                        break;
                    case 1:
                        this.d = 28;
                        break;
                    case 2:
                        this.d = 32;
                        break;
                    case 3:
                        this.d = 48;
                        break;
                    case 4:
                        this.d = 64;
                        break;
                    default:
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                }
                yk3Var.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        e.d("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }
}
