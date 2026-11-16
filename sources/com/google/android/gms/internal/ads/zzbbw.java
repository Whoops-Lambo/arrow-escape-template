package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbbw {
    public static final Charset a = StandardCharsets.UTF_8;
    public static Cipher b = null;
    public static final Object c = new Object();
    public static final Object d = new Object();

    public final String a(byte[] bArr, byte[] bArr2) throws zzbbv {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (c) {
                c().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = c().doFinal(bArr2);
                iv = c().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return Base64.encodeToString(bArr3, 2);
        } catch (InvalidKeyException e) {
            throw new zzbbv(this, e);
        } catch (NoSuchAlgorithmException e2) {
            throw new zzbbv(this, e2);
        } catch (BadPaddingException e3) {
            throw new zzbbv(this, e3);
        } catch (IllegalBlockSizeException e4) {
            throw new zzbbv(this, e4);
        } catch (NoSuchPaddingException e5) {
            throw new zzbbv(this, e5);
        }
    }

    public final byte[] b(String str, byte[] bArr) throws zzbbv {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            if (bArrDecode.length == 0 && str.length() > 0) {
                throw new IllegalArgumentException("Unable to decode ".concat(str));
            }
            int length2 = bArrDecode.length;
            if (length2 <= 16) {
                throw new zzbbv(this);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrDecode);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (c) {
                c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = c().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e) {
            throw new zzbbv(this, e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new zzbbv(this, e2);
        } catch (InvalidKeyException e3) {
            throw new zzbbv(this, e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new zzbbv(this, e4);
        } catch (BadPaddingException e5) {
            throw new zzbbv(this, e5);
        } catch (IllegalBlockSizeException e6) {
            throw new zzbbv(this, e6);
        } catch (NoSuchPaddingException e7) {
            throw new zzbbv(this, e7);
        }
    }

    public static final Cipher c() {
        Cipher cipher;
        synchronized (d) {
            try {
                if (b == null) {
                    b = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }
}
