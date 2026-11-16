package com.adsurge.adn.oversea_ad;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.extends, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Cextends extends UrsaMinor {
    public static final Sorosis e = new Sorosis();
    public static final ArrayList f;
    public int a = 0;
    public int b = 0;
    public Sorosis c = null;
    public ArrayList d = null;

    static {
        ArrayList arrayList = new ArrayList();
        f = arrayList;
        arrayList.add(new Cthrows());
    }

    @Override // com.adsurge.adn.oversea_ad.UrsaMinor
    public final void a(Triangulum triangulum) {
        this.a = triangulum.a(this.a, 0, false);
        this.b = triangulum.a(this.b, 1, false);
        this.c = (Sorosis) triangulum.a((UrsaMinor) e, 2, false);
        this.d = (ArrayList) triangulum.a((Object) f, 3, false);
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
        Sorosis sorosis = this.c;
        if (sorosis != null) {
            ursaMajor.a((UrsaMinor) sorosis, 2);
        }
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            ursaMajor.a((Collection) arrayList, 3);
        }
    }
}
