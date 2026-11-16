package com.adsurge.adn.oversea_ad;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.throws, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class Cthrows extends UrsaMinor {
    public static final Cvolatile h = new Cvolatile();
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public byte[] d = null;
    public Cvolatile e = null;
    public byte[] f = null;
    public int g = 0;

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(Triangulum triangulum) {
        this.a = triangulum.a(this.a, 0, true);
        this.b = triangulum.a(this.b, 1, false);
        this.c = triangulum.a(this.c, 2, false);
        this.d = triangulum.a(3, false);
        this.e = (Cvolatile) triangulum.a((UrsaMinor) h, 4, false);
        this.f = triangulum.a(5, false);
        this.g = triangulum.a(this.g, 6, false);
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(UrsaMajor ursaMajor) {
        ursaMajor.a(this.a, 0);
        int i = this.b;
        if (i != 0) {
            ursaMajor.a(i, 1);
        }
        int i2 = this.c;
        if (i2 != 0) {
            ursaMajor.a(i2, 2);
        }
        byte[] bArr = this.d;
        if (bArr != null) {
            ursaMajor.a(3, bArr);
        }
        Cvolatile cvolatile = this.e;
        if (cvolatile != null) {
            ursaMajor.a((UrsaMinor) cvolatile, 4);
        }
        byte[] bArr2 = this.f;
        if (bArr2 != null) {
            ursaMajor.a(5, bArr2);
        }
        int i3 = this.g;
        if (i3 != 0) {
            ursaMajor.a(i3, 6);
        }
    }
}
