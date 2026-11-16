package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.dz4;
import defpackage.vq2;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ῒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1099 {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static final byte[] f3183;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static final byte[] f3184;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final SecureRandom f3190 = new SecureRandom();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static final String f3189 = StringFog.decrypt("y+U=\n", "jqb1BgsWtlQ=\n");

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static final String f3188 = StringFog.decrypt("45Q/KA==\n", "ptd7YFZYcGQ=\n");

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static final String f3187 = StringFog.decrypt("EPAnNMM1BAttqw==\n", "WJ1GV5B9RTk=\n");

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static final String f3186 = StringFog.decrypt("f+ubKXG8IfFwwZhnUpsFsFk=\n", "Pq7IBjb/bN4=\n");

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static final String f3185 = StringFog.decrypt("Qv6iS3oe4sAA\n", "MZvBO0gr1LI=\n");

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C0449 m810(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length != 32) {
            dz4.c(bArr.length, StringFog.decrypt("D/B55VXXkF0jwFmxHtCMXX2HCqdHxowOYpVNqkqS\n", "TrUqxT6y6X0=\n"));
            return null;
        }
        if (bArr2.length != 12) {
            dz4.c(bArr2.length, StringFog.decrypt("XBxDfEbdruZ+f2MpW8bg535/P24I0LnxfiwifE/dtKU=\n", "G18OXCiywIU=\n"));
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance(f3186);
            cipher.init(1, new SecretKeySpec(bArr, StringFog.decrypt("6KVN\n", "qeAew+d5uP0=\n")), new GCMParameterSpec(128, bArr2));
            cipher.updateAAD(bArr4);
            return new C0449(cipher.doFinal(bArr3));
        } catch (GeneralSecurityException e) {
            vq2.n(StringFog.decrypt("iE+DcYn44b+sZLMut8vY9qZk8Dqv0sD6rQ==\n", "yQrQXM67rJ8=\n"), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m812(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            dz4.c(bArr.length, StringFog.decrypt("O474hc07C+UAmejTwTodsUue9NOffU6nEoj0gIBvCaof3A==\n", "a/yR86xPbsU=\n"));
            return null;
        }
        if (bArr2.length != 65) {
            dz4.c(bArr2.length, StringFog.decrypt("1EIuOEwp31jhTmw5UDmLE+ZSbGIQap1K8FI/dA0/kVDrWjwmQDmMVuAeYHRCJYsT\n", "hDdMVCVK/zM=\n"));
            return null;
        }
        if (bArr2[0] != 4) {
            defpackage.d.r(StringFog.decrypt("uV8GtCSfYYWMU0S1OI81zppeBao53DaHnUJE6DXMdQ==\n", "6Spk2E38Qe4=\n"));
            return null;
        }
        try {
            String str = f3189;
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str);
            keyPairGenerator.initialize(new ECGenParameterSpec(f3185));
            ECParameterSpec params = ((ECPublicKey) keyPairGenerator.generateKeyPair().getPublic()).getParams();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) KeyFactory.getInstance(str).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), params));
            ECPublicKey eCPublicKeyM808 = m808(bArr2, params);
            KeyAgreement keyAgreement = KeyAgreement.getInstance(f3188);
            keyAgreement.init(eCPrivateKey);
            keyAgreement.doPhase(eCPublicKeyM808, true);
            byte[] bArrGenerateSecret = keyAgreement.generateSecret();
            if (bArrGenerateSecret.length == 32) {
                return bArrGenerateSecret;
            }
            if (bArrGenerateSecret.length >= 32) {
                return (bArrGenerateSecret.length == 65 && bArrGenerateSecret[0] == 4) ? Arrays.copyOfRange(bArrGenerateSecret, 1, 33) : Arrays.copyOfRange(bArrGenerateSecret, bArrGenerateSecret.length - 32, bArrGenerateSecret.length);
            }
            byte[] bArr3 = new byte[32];
            System.arraycopy(bArrGenerateSecret, 0, bArr3, 32 - bArrGenerateSecret.length, bArrGenerateSecret.length);
            return bArr3;
        } catch (GeneralSecurityException e) {
            vq2.n(StringFog.decrypt("KQcdKA2W+GpMJT4SSJjwdgIweQZMlPF2CA==\n", "bERZYC39nRM=\n"), e);
            return null;
        }
    }

    static {
        String strDecrypt = StringFog.decrypt("vj1KMNaJPo+qOU8l\n", "63wOYfv/D6I=\n");
        Charset charset = StandardCharsets.US_ASCII;
        f3184 = strDecrypt.getBytes(charset);
        f3183 = StringFog.decrypt("QI0NFJ9RQa9HiRoV\n", "FcxJRbIncII=\n").getBytes(charset);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C0431 m811() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(f3189);
            keyPairGenerator.initialize(new ECGenParameterSpec(f3185), this.f3190);
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
            ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
            byte[] bArrM809 = m809(eCPrivateKey.getS());
            ECPoint w = eCPublicKey.getW();
            byte[] bArrM8010 = m809(w.getAffineX());
            byte[] bArrM8011 = m809(w.getAffineY());
            byte[] bArr = new byte[65];
            bArr[0] = 4;
            System.arraycopy(bArrM8010, 0, bArr, 1, 32);
            System.arraycopy(bArrM8011, 0, bArr, 33, 32);
            return new C0431(bArrM809, bArr);
        } catch (GeneralSecurityException e) {
            vq2.n(StringFog.decrypt("UJy/eC2obi953bFxJqk8OmKY9nE4pCs2c4+3eGinKyI2jbd9Og==\n", "Fv3WFEjMTls=\n"), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m814(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 32) {
            if (bArr2.length == 12) {
                if (bArr3.length >= 16) {
                    try {
                        Cipher cipher = Cipher.getInstance(f3186);
                        cipher.init(2, new SecretKeySpec(bArr, StringFog.decrypt("NkqJ\n", "dw/ajMD1Cpc=\n")), new GCMParameterSpec(128, bArr2));
                        cipher.updateAAD(bArr4);
                        return cipher.doFinal(bArr3);
                    } catch (GeneralSecurityException e) {
                        vq2.n(StringFog.decrypt("zQDlyz8bvCroINWUASiFY+MrloAZMZ1v6A==\n", "jEW25nhY8Qo=\n"), e);
                        return null;
                    }
                }
                defpackage.d.r(StringFog.decrypt("62XBDeUOobDQeJES6Qi99dxt1kXtCaahiG7UReEI9bnNbcIRoE3j9cp1xQDz\n", "qAyxZYB81dU=\n"));
                return null;
            }
            dz4.c(bArr2.length, StringFog.decrypt("P5deUbyjXKEd9H4EobgSoB30IkPyrku2Hac/UbWjRuI=\n", "eNQTcdLMMsI=\n"));
            return null;
        }
        dz4.c(bArr.length, StringFog.decrypt("ctKDUQXfutxe4qMFTtim3ACl8BMXzqaPH7e3Hhqa\n", "M5fQcW66w/w=\n"));
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m813(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            String str = f3187;
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(bArr2, str));
            byte[] bArrDoFinal = mac.doFinal(bArr);
            byte[] bArr4 = new byte[bArr3.length + 1];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            bArr4[bArr3.length] = 1;
            Mac mac2 = Mac.getInstance(str);
            mac2.init(new SecretKeySpec(bArrDoFinal, str));
            return mac2.doFinal(bArr4);
        } catch (GeneralSecurityException e) {
            vq2.n(StringFog.decrypt("MLQQMXhFYHhYmzEFMVhkdRGQOlc+T2xtHZs=\n", "eP9Ud1guBQE=\n"), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static ECPublicKey m808(byte[] bArr, ECParameterSpec eCParameterSpec) {
        if (bArr.length == 65 && bArr[0] == 4) {
            return (ECPublicKey) KeyFactory.getInstance(f3189).generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, 33)), new BigInteger(1, Arrays.copyOfRange(bArr, 33, 65))), eCParameterSpec));
        }
        defpackage.d.r(StringFog.decrypt("9DkJFZpU53fIORwbm03xMs4kGhDWeMB3zTgWGoI=\n", "vVd/dPY9g1c=\n"));
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static byte[] m809(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == 32) {
            return byteArray;
        }
        if (byteArray.length > 32) {
            return Arrays.copyOfRange(byteArray, byteArray.length - 32, byteArray.length);
        }
        byte[] bArr = new byte[32];
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        return bArr;
    }
}
