package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class Orange extends UrsaMinor implements Cloneable {
    public String a;
    public byte[] b;
    public int c;

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(Triangulum triangulum) {
        this.a = triangulum.b(0, true);
        this.b = triangulum.a(1, true);
        this.c = triangulum.a(this.c, 2, true);
    }

    public Orange() {
        this.a = "";
        this.b = null;
        this.c = 0;
    }

    public Orange(String str, byte[] bArr, int i) {
        this.a = str;
        this.b = bArr;
        this.c = i;
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(UrsaMajor ursaMajor) {
        ursaMajor.a(this.a, 0);
        ursaMajor.a(1, this.b);
        ursaMajor.a(this.c, 2);
    }
}
