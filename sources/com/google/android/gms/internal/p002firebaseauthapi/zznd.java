package com.google.android.gms.internal.p002firebaseauthapi;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zznd implements zznb {
    public static final byte[] b = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};
    public static final byte[] c = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};
    public final Provider a;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final byte[] a(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException {
        Provider provider = this.a;
        KeyFactory keyFactory = KeyFactory.getInstance("XDH", provider);
        if (bArr.length != 32) {
            throw new InvalidKeyException("Invalid X25519 private key");
        }
        PrivateKey privateKeyGeneratePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(zzzi.d(b, bArr)));
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Invalid X25519 public key");
        }
        PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new X509EncodedKeySpec(zzzi.d(c, bArr2)));
        KeyAgreement keyAgreement = KeyAgreement.getInstance("XDH", provider);
        keyAgreement.init(privateKeyGeneratePrivate);
        keyAgreement.doPhase(publicKeyGeneratePublic, true);
        return keyAgreement.generateSecret();
    }

    public final zzne b() {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("XDH", this.a);
        keyPairGenerator.initialize(255);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        byte[] encoded = keyPairGenerateKeyPair.getPrivate().getEncoded();
        if (encoded.length != 48) {
            e.d("Invalid encoded private key length");
            return null;
        }
        if (!zzqu.b(b, encoded)) {
            e.d("Invalid encoded private key prefix");
            return null;
        }
        Arrays.copyOfRange(encoded, 16, encoded.length);
        byte[] encoded2 = keyPairGenerateKeyPair.getPublic().getEncoded();
        if (encoded2.length != 44) {
            e.d("Invalid encoded public key length");
            return null;
        }
        if (zzqu.b(c, encoded2)) {
            Arrays.copyOfRange(encoded2, 12, encoded2.length);
            return new zzne();
        }
        e.d("Invalid encoded public key prefix");
        return null;
    }

    public zznd(Provider provider) {
        this.a = provider;
    }
}
