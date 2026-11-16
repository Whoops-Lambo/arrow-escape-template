package com.adsurge.adn.oversea_ad;

import com.ironsource.C4778ha;
import com.ironsource.G5;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Arbutus {
    public final Sorgo a = new Sorgo();
    public Segment b = null;

    public final synchronized void b() {
        a();
    }

    public final void a() {
        byte[] bArrDoFinal;
        b bVar = c.a;
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(secureRandom.nextInt(62)));
        }
        String string = sb.toString();
        Cdefault cdefault = new Cdefault();
        cdefault.a = 1;
        Sorgo sorgo = this.a;
        cdefault.d = 0;
        cdefault.c = "test_keyid";
        try {
            if (sorgo.a == null) {
                try {
                    sorgo.a = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Cthrow.a()));
                } catch (Exception unused) {
                }
            }
            Sorgo sorgo2 = this.a;
            byte[] bytes = string.getBytes(G5.O);
            try {
                Cipher cipher = Cipher.getInstance(C4778ha.b);
                cipher.init(1, sorgo2.a);
                bArrDoFinal = cipher.doFinal(bytes);
            } catch (Exception unused2) {
                bArrDoFinal = null;
            }
            cdefault.b = bArrDoFinal;
            Segment segment = new Segment(Virgo.a(cdefault), string, null, 0);
            synchronized (this) {
                this.b = segment;
            }
        } catch (UnsupportedEncodingException unused3) {
        }
    }
}
