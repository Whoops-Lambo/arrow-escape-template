package com.adsurge.adn.D1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class m implements g {
    public boolean a = false;
    public boolean b = true;
    public boolean c = false;

    @Override // com.adsurge.adn.D1.g
    public void a(com.adsurge.adn.C1.k kVar, g gVar, int i, int i2) {
        if (!this.a && this.b) {
            kVar.a(i, i2);
            this.a = true;
        }
        if (gVar instanceof j) {
            kVar.g();
        }
        if (this.c) {
            kVar.c();
        }
    }

    public void a() {
        this.a = false;
    }
}
