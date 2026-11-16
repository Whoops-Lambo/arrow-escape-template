package com.adsurge.adn.oversea_ad;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Pineapple extends UrsaMinor {
    public static final ArrayList d;
    public int a = 0;
    public int b = 0;
    public ArrayList c = null;

    static {
        ArrayList arrayList = new ArrayList();
        d = arrayList;
        arrayList.add(new Pear());
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(Triangulum triangulum) {
        this.a = triangulum.a(this.a, 0, false);
        this.b = triangulum.a(this.b, 1, false);
        this.c = (ArrayList) triangulum.a((Object) d, 2, false);
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(UrsaMajor ursaMajor) {
        int i = this.a;
        if (i != 0) {
            ursaMajor.a(i, 0);
        }
        int i2 = this.b;
        if (i2 != 0) {
            ursaMajor.a(i2, 1);
        }
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            ursaMajor.a((Collection) arrayList, 2);
        }
    }
}
