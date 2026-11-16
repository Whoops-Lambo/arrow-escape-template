package com.adsurge.adn.D;

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static boolean a(String str, String str2, String str3) {
        try {
            byte[] bArrA = a(str2, str);
            byte[] bArrDecode = Base64.decode(str3, 0);
            if (bArrDecode.length == 0) {
                return false;
            }
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEhrkLCclsRXHN6278YNhH9vPtFsf/jPmIqanTIz/O98jMxswmP/AdwPkq6lqgD+CXKxTOEZqzUXTqwDc+w/RUTw==", 0)));
            Signature signature = Signature.getInstance("SHA256withECDSA");
            signature.initVerify(publicKeyGeneratePublic);
            signature.update(bArrA);
            return signature.verify(bArrDecode);
        } catch (RuntimeException | GeneralSecurityException unused) {
            return false;
        }
    }

    public static byte[] a(String str, String str2) {
        Charset charset = com.adsurge.adn.B0.a.a;
        byte[] bytes = str.getBytes(charset);
        byte[] bytes2 = str2.getBytes(charset);
        byte[] bArr = new byte[bytes.length + 1 + bytes2.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        bArr[bytes.length] = 10;
        System.arraycopy(bytes2, 0, bArr, bytes.length + 1, bytes2.length);
        return bArr;
    }
}
