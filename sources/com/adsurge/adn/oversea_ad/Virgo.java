package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class Virgo {
    public static byte[] a(UrsaMinor ursaMinor) {
        if (ursaMinor == null) {
            return null;
        }
        try {
            UrsaMajor ursaMajor = new UrsaMajor();
            ursaMajor.b = "UTF-8";
            ursaMinor.a(ursaMajor);
            byte[] bArr = new byte[ursaMajor.a.position()];
            System.arraycopy(ursaMajor.a.array(), 0, bArr, 0, ursaMajor.a.position());
            return bArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public static UrsaMinor a(byte[] bArr, UrsaMinor ursaMinor) {
        if (bArr != null && ursaMinor != null) {
            try {
                Triangulum triangulum = new Triangulum(bArr);
                triangulum.b = "UTF-8";
                ursaMinor.a(triangulum);
                return ursaMinor;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
