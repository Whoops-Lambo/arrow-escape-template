package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends UrsaMinor {
    public int a = 0;
    public String b = "";

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(UrsaMajor ursaMajor) {
        int i = this.a;
        if (i != 0) {
            ursaMajor.a(i, 0);
        }
        String str = this.b;
        if (str != null) {
            ursaMajor.a(str, 1);
        }
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(Triangulum triangulum) {
        this.a = triangulum.a(this.a, 0, false);
        this.b = triangulum.b(1, false);
    }
}
