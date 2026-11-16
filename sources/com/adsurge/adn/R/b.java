package com.adsurge.adn.R;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class b implements com.adsurge.adn.S.a.InterfaceC0091a {
    public final int a;
    public final List b;
    public final com.adsurge.adn.H0.a c;

    @Override // com.adsurge.adn.S.a.InterfaceC0091a
    public com.adsurge.adn.H0.b a(com.adsurge.adn.H0.a aVar) {
        if (this.a >= this.b.size()) {
            return null;
        }
        return ((com.adsurge.adn.S.a) this.b.get(this.a)).a(new b(this.a + 1, this.b, aVar));
    }

    public b(int i, List list, com.adsurge.adn.H0.a aVar) {
        this.a = i;
        this.b = list;
        this.c = aVar;
    }

    @Override // com.adsurge.adn.S.a.InterfaceC0091a
    public com.adsurge.adn.H0.a a() {
        return this.c;
    }
}
