package com.bytedance.sdk.component.ct;

import android.util.Log;
import com.bytedance.sdk.openadsdk.fpz.rz;
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ahm {
    private static final Random kgy = new SecureRandom();

    public static byte[] ahm(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            byte[] bArr3 = new byte[12];
            kgy.nextBytes(bArr3);
            cipher.init(1, secretKeySpec, new GCMParameterSpec(128, bArr3));
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            byte[] bArr4 = new byte[bArrDoFinal.length + 12];
            System.arraycopy(bArr3, 0, bArr4, 0, 12);
            System.arraycopy(bArrDoFinal, 0, bArr4, 12, bArrDoFinal.length);
            return bArr4;
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4kfozpC/jk=", "essesiCR", "XuAuhxqsfeWZa/JuqzKN", 45);
            Log.e("AESGCM", "encryptByAESGCM: ", th);
            return null;
        }
    }

    public static byte[] kgy(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            byte[] bArr3 = new byte[12];
            System.arraycopy(bArr, 0, bArr3, 0, 12);
            cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bArr3));
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4kfozpC/jk=", "essesiCR", "X+suhxqsfeWZa/JuqzKN", 27);
            Log.e("AESGCM", "decryptByAESGCM: ", th);
            return null;
        }
    }
}
