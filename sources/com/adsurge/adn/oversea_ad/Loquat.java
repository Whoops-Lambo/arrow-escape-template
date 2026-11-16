package com.adsurge.adn.oversea_ad;

import defpackage.dr0;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class Loquat extends UrsaMinor {
    public static byte[] k = null;
    public static HashMap l = null;
    public static final /* synthetic */ boolean m = true;
    public byte[] g;
    public Map i;
    public Map j;
    public short a = 0;
    public byte b = 0;
    public int c = 0;
    public int d = 0;
    public String e = null;
    public String f = null;
    public int h = 0;

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(Triangulum triangulum) {
        String str;
        try {
            this.a = triangulum.a(this.a, 1, true);
            this.b = triangulum.a(this.b, 2, true);
            this.c = triangulum.a(this.c, 3, true);
            this.d = triangulum.a(this.d, 4, true);
            this.e = triangulum.b(5, true);
            this.f = triangulum.b(6, true);
            if (k == null) {
                k = new byte[]{0};
            }
            this.g = triangulum.a(7, true);
            this.h = triangulum.a(this.h, 8, true);
            if (l == null) {
                HashMap map = new HashMap();
                l = map;
                map.put("", "");
            }
            this.i = (Map) triangulum.a((Object) l, 9, true);
            if (l == null) {
                HashMap map2 = new HashMap();
                l = map2;
                map2.put("", "");
            }
            this.j = (Map) triangulum.a((Object) l, 10, true);
        } catch (Exception e) {
            e.printStackTrace();
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("RequestPacket decode error ");
            byte[] bArr = this.g;
            if (bArr == null || bArr.length == 0) {
                str = null;
            } else {
                char[] cArr = new char[bArr.length * 2];
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    int i2 = i * 2;
                    char[] cArr2 = z0.a;
                    cArr[i2 + 1] = cArr2[b & 15];
                    cArr[i2] = cArr2[((byte) (b >>> 4)) & 15];
                }
                str = new String(cArr);
            }
            sb.append(str);
            printStream.println(sb.toString());
            dr0.m(e);
        }
    }

    public final boolean equals(Object obj) {
        Loquat loquat = (Loquat) obj;
        short s = loquat.a;
        int i = Vulpecula.a;
        Integer num = 1;
        return 1 == s && 1 == loquat.b && 1 == loquat.c && 1 == loquat.d && num.equals(loquat.e) && num.equals(loquat.f) && num.equals(loquat.g) && 1 == loquat.h && num.equals(loquat.i) && num.equals(loquat.j);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (m) {
                return null;
            }
            io.p071bidmachine.media3.extractor.ts.y.o();
            return null;
        }
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(UrsaMajor ursaMajor) {
        ursaMajor.a(this.a, 1);
        ursaMajor.a(this.b, 2);
        ursaMajor.a(this.c, 3);
        ursaMajor.a(this.d, 4);
        ursaMajor.a(this.e, 5);
        ursaMajor.a(this.f, 6);
        ursaMajor.a(7, this.g);
        ursaMajor.a(this.h, 8);
        ursaMajor.a(this.i, 9);
        ursaMajor.a(this.j, 10);
    }
}
