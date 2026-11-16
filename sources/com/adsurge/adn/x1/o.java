package com.adsurge.adn.x1;

import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class o {
    public static final byte[] a = {91, -62};
    public static final ThreadLocal b = new a();
    public static final ThreadLocal c = new c();
    public static final String d = "AES/ECB/PKCS7Padding";
    public static final byte[] e = Base64.decode("4M3PpUC4Vu1uMp+Y0Mxd+vfc6v4ggJAINfgTlH74pis=", 0);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            try {
                Cipher cipher = Cipher.getInstance(o.d);
                cipher.init(1, new SecretKeySpec(o.a(), "AES"));
                return cipher;
            } catch (Exception e) {
                o.a(true, 1, e);
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class c extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            try {
                Cipher cipher = Cipher.getInstance(o.d);
                cipher.init(2, new SecretKeySpec(o.a(), "AES"));
                return cipher;
            } catch (Exception e) {
                o.a(false, 1, e);
                return null;
            }
        }
    }

    public static byte[] b(byte[] bArr) throws d {
        if (bArr == null || bArr.length < 4) {
            throw new d("S2SS Package FormatError", null);
        }
        try {
            byte[] bArr2 = new byte[4];
            if (new DataInputStream(new ByteArrayInputStream(bArr)).read(bArr2) >= 4) {
                byte[] bArr3 = a;
                if (bArr3[0] == bArr2[0] && bArr3[1] == bArr2[1] && 1 == bArr2[2] && 2 == bArr2[3]) {
                    return c(a(Arrays.copyOfRange(bArr, 4, bArr.length)));
                }
            }
            throw new d("S2SS Package Magic/Version FormatError", null);
        } catch (Exception e2) {
            throw new d("Exception while packaging byte array", e2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class b extends Exception {
        public b(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class d extends Exception {
        public d(String str, Throwable th) {
            super(str, th);
        }
    }

    public static byte[] a(byte[] bArr) throws b {
        int i;
        try {
            return ((Cipher) c.get()).doFinal(bArr);
        } catch (Exception e2) {
            c.remove();
            if (e2 instanceof IllegalBlockSizeException) {
                i = 4;
            } else if (e2 instanceof BadPaddingException) {
                i = 5;
            } else {
                i = e2 instanceof NullPointerException ? 2 : 3;
            }
            a(false, i, e2);
            throw new b("Exception While dencrypt byte array", e2);
        }
    }

    public static byte[] c(byte[] bArr) {
        return w.a(bArr);
    }

    public static String a(String str) {
        byte[] bArrB;
        return (TextUtils.isEmpty(str) || (bArrB = b(Base64.decode(str, 10))) == null) ? "" : new String(bArrB, com.adsurge.adn.B0.a.a);
    }

    public static byte[] a() {
        return e;
    }

    public static void a(boolean z, int i, Exception exc) {
        com.adsurge.adn.Y0.e eVar = new com.adsurge.adn.Y0.e(9200009);
        eVar.d(z ? 3 : 4);
        eVar.e(i);
        if (exc != null) {
            com.adsurge.adn.Y0.d dVar = new com.adsurge.adn.Y0.d();
            dVar.a(CmcdConfiguration.KEY_OBJECT_TYPE, exc.toString());
            eVar.a(dVar);
        }
        com.adsurge.adn.w1.b.a(eVar);
    }
}
