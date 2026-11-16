package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class Pistachio extends UrsaMinor {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(Triangulum triangulum) {
        this.a = triangulum.a(this.a, 0, false);
        this.b = triangulum.a(this.b, 1, false);
        this.c = triangulum.a(this.c, 2, false);
        this.d = triangulum.a(this.d, 3, false);
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(UrsaMajor ursaMajor) {
        int i = this.a;
        if (i != 0) {
            ursaMajor.a(i, 0);
        }
        ursaMajor.a(this.b, 1);
        int i2 = this.c;
        if (i2 != 0) {
            ursaMajor.a(i2, 2);
        }
        int i3 = this.d;
        if (i3 != 0) {
            ursaMajor.a(i3, 3);
        }
    }
}
