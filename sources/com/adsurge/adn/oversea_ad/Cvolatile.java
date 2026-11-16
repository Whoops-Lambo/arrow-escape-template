package com.adsurge.adn.oversea_ad;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.volatile, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class Cvolatile extends UrsaMinor {
    public long a = 0;

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(UrsaMajor ursaMajor) {
        long j = this.a;
        if (j != 0) {
            ursaMajor.a(0, j);
        }
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(Triangulum triangulum) {
        this.a = triangulum.a(this.a, 0, false);
    }
}
