package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Persimmon extends UrsaMinor {
    public String a = "";
    public int b = 0;

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(UrsaMajor ursaMajor) {
        String str = this.a;
        if (str != null) {
            ursaMajor.a(str, 0);
        }
        int i = this.b;
        if (i != 0) {
            ursaMajor.a(i, 1);
        }
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(Triangulum triangulum) {
        this.a = triangulum.b(0, false);
        this.b = triangulum.a(this.b, 1, false);
    }
}
