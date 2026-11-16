package com.adsurge.adn.oversea_ad;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a1 {
    public static HashMap d;
    public final Loquat a;
    public HashMap b;
    public final HashMap c;

    public final Object a(Peanut peanut) throws Exception {
        if (!this.b.containsKey("resp")) {
            return null;
        }
        if (this.c.containsKey("resp")) {
            return this.c.get("resp");
        }
        byte[] bArr = (byte[]) this.b.get("resp");
        try {
            Triangulum triangulum = new Triangulum();
            triangulum.a = ByteBuffer.wrap(bArr);
            triangulum.b = "UTF-8";
            Serializable serializableA = triangulum.a((Object) peanut, 0, true);
            if (serializableA != null) {
                this.c.put("resp", serializableA);
            }
            return serializableA;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public a1() {
        Loquat loquat = new Loquat();
        this.a = loquat;
        this.b = new HashMap();
        this.c = new HashMap();
        loquat.a = (short) 3;
        loquat.d = 3;
    }
}
