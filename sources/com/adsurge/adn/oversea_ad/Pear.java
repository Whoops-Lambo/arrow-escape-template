package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class Pear extends UrsaMinor {
    public static final Shaddock k = new Shaddock();
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public byte[] f = null;
    public Shaddock g = null;
    public byte[] h = null;
    public int i = 0;
    public String j = "";

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(Triangulum triangulum) {
        this.a = triangulum.a(this.a, 0, true);
        this.b = triangulum.a(this.b, 1, false);
        this.c = triangulum.a(this.c, 2, false);
        this.d = triangulum.a(this.d, 3, false);
        this.e = triangulum.a(this.e, 4, false);
        this.f = triangulum.a(5, false);
        this.g = (Shaddock) triangulum.a((UrsaMinor) k, 6, false);
        this.h = triangulum.a(7, false);
        this.i = triangulum.a(this.i, 8, false);
        this.j = triangulum.b(9, false);
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
        ursaMajor.a(this.d, 3);
        int i3 = this.e;
        if (i3 != 0) {
            ursaMajor.a(i3, 4);
        }
        byte[] bArr = this.f;
        if (bArr != null) {
            ursaMajor.a(5, bArr);
        }
        Shaddock shaddock = this.g;
        if (shaddock != null) {
            ursaMajor.a((UrsaMinor) shaddock, 6);
        }
        byte[] bArr2 = this.h;
        if (bArr2 != null) {
            ursaMajor.a(7, bArr2);
        }
        int i4 = this.i;
        if (i4 != 0) {
            ursaMajor.a(i4, 8);
        }
        String str = this.j;
        if (str != null) {
            ursaMajor.a(str, 9);
        }
    }
}
