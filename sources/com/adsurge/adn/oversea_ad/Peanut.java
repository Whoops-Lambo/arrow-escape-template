package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class Peanut extends UrsaMinor implements Cloneable {
    public static final Orange h = new Orange();
    public int a = 0;
    public String b = "";
    public int c = 0;
    public int d = 0;
    public String e = "";
    public long f = 0;
    public Orange g = null;

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(Triangulum triangulum) {
        this.a = triangulum.a(this.a, 0, true);
        this.b = triangulum.b(1, true);
        this.c = triangulum.a(this.c, 3, false);
        this.d = triangulum.a(this.d, 4, false);
        this.e = triangulum.b(5, false);
        this.f = triangulum.a(this.f, 6, false);
        this.g = (Orange) triangulum.a((UrsaMinor) h, 8, false);
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(UrsaMajor ursaMajor) {
        ursaMajor.a(this.a, 0);
        ursaMajor.a(this.b, 1);
        int i = this.c;
        if (i != 0) {
            ursaMajor.a(i, 3);
        }
        int i2 = this.d;
        if (i2 != 0) {
            ursaMajor.a(i2, 4);
        }
    }
}
