package com.adsurge.adn.z1;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a extends e {
    public boolean o;

    @Override // com.adsurge.adn.z1.e, com.adsurge.adn.z1.d, com.adsurge.adn.C1.c
    public void a() {
        if (this.o) {
            return;
        }
        super.a();
        this.o = true;
    }

    @Override // com.adsurge.adn.z1.e, com.adsurge.adn.z1.d, com.adsurge.adn.C1.c
    public void h() {
        if (this.f) {
            a(e.b.PLAYING);
        } else {
            super.h();
        }
    }

    @Override // com.adsurge.adn.z1.d, com.adsurge.adn.C1.c
    public void k() {
        a(e.b.SUSPEND);
    }

    public a(com.adsurge.adn.u1.c cVar, List list) {
        super(cVar, list);
        this.o = false;
    }
}
