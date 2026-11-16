package com.inmobi.media;

import android.util.Base64;
import android.util.Log;
import defpackage.dk2;
import defpackage.er;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.inmobi.media.y6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4538y6 {
    public static final /* synthetic */ int a = 0;

    public static byte[] a(String str) {
        int i;
        if (str != null) {
            int length = str.length() % 4;
            i = length + ((((length ^ 4) & ((-length) | length)) >> 31) & 4);
        } else {
            i = 0;
        }
        String strValueOf = String.valueOf(str != null ? dk2.k0(str).toString() : null);
        for (int i2 = 0; i2 < i; i2++) {
            strValueOf = ((Object) strValueOf) + "=";
        }
        byte[] bytes = strValueOf.getBytes(er.a);
        bytes.getClass();
        return Base64.decode(bytes, 2);
    }

    public static String b(String str, byte[] bArr) {
        byte[] bArrDoFinal;
        str.getClass();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            cipher.getClass();
            cipher.init(1, secretKeySpec);
            byte[] bytes = str.getBytes(er.a);
            bytes.getClass();
            bArrDoFinal = cipher.doFinal(bytes);
        } catch (Throwable th) {
            Log.d("y6", "SDK encountered unexpected error in getting encrypted AES bytes; " + th.getMessage());
            bArrDoFinal = null;
        }
        byte[] bArrEncode = Base64.encode(bArrDoFinal, 2);
        bArrEncode.getClass();
        return new String(bArrEncode, er.a);
    }

    public static String a(String str, byte[] bArr) {
        byte[] bArrDoFinal;
        str.getClass();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            cipher.getClass();
            cipher.init(2, secretKeySpec);
            bArrDoFinal = cipher.doFinal(Base64.decode(str, 2));
        } catch (Throwable th) {
            Log.d("y6", "SDK encountered unexpected error in getting encrypted AES bytes; " + th.getMessage());
            bArrDoFinal = null;
        }
        if (bArrDoFinal != null) {
            return new String(bArrDoFinal, er.a);
        }
        return null;
    }
}
