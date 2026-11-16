package com.adsurge.adn.oversea_ad;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.default, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Cdefault extends UrsaMinor {
    public int a = 0;
    public byte[] b = null;
    public String c = "";
    public int d = 0;

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(UrsaMajor ursaMajor) {
        int i = this.a;
        if (i != 0) {
            ursaMajor.a(i, 0);
        }
        byte[] bArr = this.b;
        if (bArr != null) {
            ursaMajor.a(1, bArr);
        }
        String str = this.c;
        if (str != null) {
            ursaMajor.a(str, 2);
        }
        int i2 = this.d;
        if (i2 != 0) {
            ursaMajor.a(i2, 3);
        }
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(Triangulum triangulum) {
        this.a = triangulum.a(this.a, 0, false);
        this.b = triangulum.a(1, false);
        this.c = triangulum.b(2, false);
        this.d = triangulum.a(this.d, 3, false);
    }
}
