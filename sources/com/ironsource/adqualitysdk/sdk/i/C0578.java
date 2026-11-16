package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.vq2;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ҭ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0578 {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static final String f1412;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static final byte[] f1413;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static final String f1414;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static final String f1415;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final SecretKeySpec f1416;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public Cipher f1417;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public Cipher f1418;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized String m524(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            try {
                try {
                    String str2 = new String(this.f1417.doFinal(AbstractC0575.m523(str)), f1415);
                    String str3 = f1412;
                    if (str2.indexOf(str3) == 0) {
                        return str2.substring(str3.length(), str2.length());
                    }
                    throw new C0579(StringFog.decrypt("3khWgCw/obf5WReCJjjvvbYFXoo/LO2w8g1ThT0sobbkDVyBMGS7\n", "li035ElNgdk=\n") + str);
                } catch (C0572 e) {
                    m526();
                    StringBuilder sb = new StringBuilder();
                    sb.append(e.getMessage());
                    throw new C0579(AbstractC0529.m515("6A==\n", "0qgj7TEhzBM=\n", sb, str));
                } catch (UnsupportedEncodingException e2) {
                    throw new RuntimeException(StringFog.decrypt("9luH7H8t8OXaW4fkYSv6qNpbhQ==\n", "vzXxjRNElMU=\n"), e2);
                }
            } catch (IllegalBlockSizeException e3) {
                m526();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e3.getMessage());
                throw new C0579(AbstractC0529.m515("pA==\n", "nkI2dKENP9o=\n", sb2, str));
            }
        } catch (BadPaddingException e4) {
            m526();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e4.getMessage());
            throw new C0579(AbstractC0529.m515("5A==\n", "3sjnbgzg0GE=\n", sb3, str));
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized String m525(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return AbstractC0575.m522(this.f1418.doFinal((f1412 + str).getBytes(f1415)));
        } catch (UnsupportedEncodingException e) {
            m526();
            throw new RuntimeException(StringFog.decrypt("K40SVlJTd48HjRJeTFV9wgeNEA==\n", "YuNkNz46E68=\n"), e);
        } catch (GeneralSecurityException e2) {
            m526();
            throw new RuntimeException(StringFog.decrypt("gm2i2CKQRouubaLQPJZMxq5toA==\n", "ywPUuU75Iqs=\n"), e2);
        }
    }

    static {
        StringFog.decrypt("ji5PRiwyhtKEOQBjOhil4ccVc2k6DrzCgSlTSx4pnNI=\n", "51wgKH9d86A=\n");
        f1415 = StringFog.decrypt("OhCXorg=\n", "b0TRj4CqA0o=\n");
        StringFog.decrypt("0vZrmGIhVEPK9W+Bb0cpJsD9eo5uJjFTwPcDjWg=\n", "grQuzyt1HBA=\n");
        f1414 = StringFog.decrypt("zr7vMfcT59DfsP9NgQHFm+uS0nk=\n", "j/u8HrRRpP8=\n");
        f1412 = StringFog.decrypt("L6hh4ir5bgwgpiKuMPptCCKgIrkt/21PDYJfgzvwdBIvpnijK7swHQ==\n", "TMcMzFmWAWE=\n");
        f1413 = new byte[]{16, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};
    }

    public C0578(byte[] bArr, String str, String str2, String str3) {
        byte[] bArrDigest;
        try {
            bArrDigest = SecretKeyFactory.getInstance(StringFog.decrypt("YjRQL2v4XXN6N1Q2Zp4gFnA/QTln/zhjcDU4OmE=\n", "MnYVeCKsFSA=\n")).generateSecret(new PBEKeySpec((str + str2 + str3).toCharArray(), bArr, 1024, 256)).getEncoded();
        } catch (GeneralSecurityException unused) {
            String strDecrypt = StringFog.decrypt("2L46s2LDE37AtB2DVpAxWueUDQ==\n", "k/t/5SPjUjs=\n");
            String strDecrypt2 = StringFog.decrypt("8uJzFlPeu6WC8XJUW9K0s8/gfQBb3ru5gvR5AlvfsvKCxG4NW9Kw/Mb5ehJXzrKy1rB9BELOuL3B\n+DI=\n", "opAcdDK819w=\n");
            String str4 = AbstractC0453.f917;
            AbstractC0509.m489(strDecrypt, strDecrypt2);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(StringFog.decrypt("mGq+\n", "1S6L5EgdTZA=\n"));
                char[] charArray = (str + str2 + str3).toCharArray();
                for (char c : charArray) {
                    messageDigest.update((byte) c);
                }
                bArrDigest = messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                vq2.n(StringFog.decrypt("zANV5nVHWbDgA1Xua0FT/eADVw==\n", "hW0jhxkuPZA=\n"), e);
                throw null;
            }
        }
        this.f1416 = new SecretKeySpec(bArrDigest, StringFog.decrypt("7cH6\n", "rISp2rg9ynA=\n"));
        m526();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m526() {
        try {
            String str = f1414;
            Cipher cipher = Cipher.getInstance(str);
            this.f1418 = cipher;
            SecretKeySpec secretKeySpec = this.f1416;
            byte[] bArr = f1413;
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr));
            Cipher cipher2 = Cipher.getInstance(str);
            this.f1417 = cipher2;
            cipher2.init(2, this.f1416, new IvParameterSpec(bArr));
        } catch (GeneralSecurityException e) {
            vq2.n(StringFog.decrypt("iw58iAkwoXynDnyAFzarMacOfslX\n", "wmAK6WVZxVw=\n"), e);
        }
    }
}
