package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class Papaya extends UrsaMinor implements Cloneable {
    public static final Chamaeleon d = new Chamaeleon();
    public static final /* synthetic */ boolean e = true;
    public int a = 0;
    public Chamaeleon b = null;
    public long c = 0;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Papaya papaya = (Papaya) obj;
        int i = this.a;
        int i2 = papaya.a;
        int i3 = Vulpecula.a;
        return i == i2 && this.b.equals(papaya.b) && this.c == papaya.c;
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(Triangulum triangulum) {
        this.a = triangulum.a(this.a, 0, true);
        this.b = (Chamaeleon) triangulum.a((UrsaMinor) d, 1, false);
        this.c = triangulum.a(this.c, 2, true);
    }

    public final int hashCode() {
        try {
            throw new Exception("");
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (e) {
                return null;
            }
            io.p071bidmachine.media3.extractor.ts.y.o();
            return null;
        }
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(UrsaMajor ursaMajor) {
        ursaMajor.a(this.a, 0);
        Chamaeleon chamaeleon = this.b;
        if (chamaeleon != null) {
            ursaMajor.a((UrsaMinor) chamaeleon, 1);
        }
        ursaMajor.a(2, this.c);
    }
}
