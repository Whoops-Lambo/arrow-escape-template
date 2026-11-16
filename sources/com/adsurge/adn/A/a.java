package com.adsurge.adn.A;

import android.util.Base64;
import com.safedk.android.analytics.brandsafety.m;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static String b(byte[] bArr, PublicKey publicKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        cipher.init(1, publicKey);
        return Base64.encodeToString(cipher.doFinal(bArr), 10);
    }

    public static String a(byte[] bArr, PublicKey publicKey) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrA = a();
        byte[] bArrA2 = a();
        byte[] bArrA3 = a();
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, new SecretKeySpec(bArrA2, "AES"), new IvParameterSpec(bArrA));
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArrA3, "HmacSHA256"));
        mac.update(bArrA);
        mac.update(bArrDoFinal);
        byte[] bArrDoFinal2 = mac.doFinal();
        byte[] bArr2 = new byte[bArrDoFinal2.length + bArrA.length + bArrDoFinal.length];
        System.arraycopy(bArrDoFinal2, 0, bArr2, 0, bArrDoFinal2.length);
        System.arraycopy(bArrA, 0, bArr2, bArrDoFinal2.length, bArrA.length);
        System.arraycopy(bArrDoFinal, 0, bArr2, bArrDoFinal2.length + bArrA.length, bArrDoFinal.length);
        return "v1|" + b(bArrA2, publicKey) + m.ad + b(bArrA3, publicKey) + m.ad + Base64.encodeToString(bArr2, 10);
    }

    public static String a(String str, PublicKey publicKey) {
        return a(str.getBytes(StandardCharsets.UTF_8), publicKey);
    }

    public static byte[] a() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }
}
