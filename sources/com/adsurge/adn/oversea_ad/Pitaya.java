package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class Pitaya extends UrsaMinor {
    public static final Pistachio d = new Pistachio();
    public Pistachio a = null;
    public byte[] b = null;
    public byte[] c = null;

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(Triangulum triangulum) {
        this.a = (Pistachio) triangulum.a((UrsaMinor) d, 0, false);
        this.b = triangulum.a(1, false);
        this.c = triangulum.a(2, false);
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(UrsaMajor ursaMajor) {
        Pistachio pistachio = this.a;
        if (pistachio != null) {
            ursaMajor.a((UrsaMinor) pistachio, 0);
        }
        byte[] bArr = this.b;
        if (bArr != null) {
            ursaMajor.a(1, bArr);
        }
        byte[] bArr2 = this.c;
        if (bArr2 != null) {
            ursaMajor.a(2, bArr2);
        }
    }
}
