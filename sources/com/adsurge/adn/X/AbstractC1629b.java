package com.adsurge.adn.X;

import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.adsurge.adn.X.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC1629b {
    public static final String a = "AES/ECB/PKCS7Padding";

    public static byte[] a(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decode(a(), 0), "AES");
        Cipher cipher = Cipher.getInstance(a);
        cipher.init(2, secretKeySpec);
        return cipher.doFinal(bArr);
    }

    public static String a(String str) {
        try {
            return new String(a(Base64.decode(str, 10)), com.adsurge.adn.B0.a.a);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public static String a() {
        return "Kxge1FYXZWov7gg01ELhcQ==";
    }
}
