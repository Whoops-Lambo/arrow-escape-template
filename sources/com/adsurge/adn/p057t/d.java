package com.adsurge.adn.p057t;

import com.adsurge.adn.ads.AdConfig;
import com.adsurge.adn.p053r.j;
import com.adsurge.adn.p055s.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class d extends a {
    @Override // com.adsurge.adn.p057t.a
    public boolean a(boolean z) {
        j jVar = this.a.b;
        AdConfig adConfig = jVar.q;
        if ((adConfig != null && !adConfig.autoplay) || !z) {
            return false;
        }
        jVar.E();
        return true;
    }

    @Override // com.adsurge.adn.p057t.a
    public boolean e() {
        this.a.b.E();
        return true;
    }

    public d(b bVar) {
        super(bVar);
    }
}
