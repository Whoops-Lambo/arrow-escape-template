package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class Sorosis extends UrsaMinor {
    public static final t0 l = new t0();
    public int a = 2;
    public int b = 0;
    public String c = "";
    public String d = "";
    public String e = "";
    public int f = 0;
    public int g = 0;
    public long h = 0;
    public int i = 0;
    public String j = "";
    public t0 k = null;

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(Triangulum triangulum) {
        this.a = triangulum.a(this.a, 0, true);
        this.b = triangulum.a(this.b, 1, true);
        this.c = triangulum.b(2, false);
        this.d = triangulum.b(3, false);
        this.e = triangulum.b(4, false);
        this.f = triangulum.a(this.f, 5, false);
        this.g = triangulum.a(this.g, 6, false);
        this.h = triangulum.a(this.h, 7, false);
        this.i = triangulum.a(this.i, 8, false);
        this.j = triangulum.b(9, false);
        this.k = (t0) triangulum.a((UrsaMinor) l, 10, false);
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(UrsaMajor ursaMajor) {
        ursaMajor.a(this.a, 0);
        ursaMajor.a(this.b, 1);
        String str = this.c;
        if (str != null) {
            ursaMajor.a(str, 2);
        }
        String str2 = this.d;
        if (str2 != null) {
            ursaMajor.a(str2, 3);
        }
        String str3 = this.e;
        if (str3 != null) {
            ursaMajor.a(str3, 4);
        }
        int i = this.f;
        if (i != 0) {
            ursaMajor.a(i, 5);
        }
        int i2 = this.g;
        if (i2 != 0) {
            ursaMajor.a(i2, 6);
        }
        long j = this.h;
        if (j != 0) {
            ursaMajor.a(7, j);
        }
        int i3 = this.i;
        if (i3 != 0) {
            ursaMajor.a(i3, 8);
        }
        String str4 = this.j;
        if (str4 != null) {
            ursaMajor.a(str4, 9);
        }
        t0 t0Var = this.k;
        if (t0Var != null) {
            ursaMajor.a((UrsaMinor) t0Var, 10);
        }
    }
}
