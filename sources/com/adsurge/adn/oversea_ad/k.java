package com.adsurge.adn.oversea_ad;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class k extends UrsaMinor {
    public static ArrayList e;
    public long a = 0;
    public int b = 0;
    public ArrayList c = null;
    public int d = 0;

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(Triangulum triangulum) {
        this.a = triangulum.a(this.a, 0, true);
        this.b = triangulum.a(this.b, 1, true);
        if (e == null) {
            ArrayList arrayList = new ArrayList();
            e = arrayList;
            arrayList.add(new l());
        }
        this.c = (ArrayList) triangulum.a((Object) e, 2, true);
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(UrsaMajor ursaMajor) {
        ursaMajor.a(0, this.a);
        ursaMajor.a(this.b, 1);
        ursaMajor.a((Collection) this.c, 2);
    }
}
