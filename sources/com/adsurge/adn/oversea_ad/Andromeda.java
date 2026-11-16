package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class Andromeda extends UrsaMinor {
    public String a = "";
    public String b = "";

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(Triangulum triangulum) {
        this.a = triangulum.b(0, true);
        this.b = triangulum.b(1, true);
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(UrsaMajor ursaMajor) {
        ursaMajor.a(this.a, 0);
        ursaMajor.a(this.b, 1);
    }
}
