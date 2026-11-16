package com.adsurge.adn.p064w0;

import com.adsurge.adn.p038l0.d;
import com.adsurge.adn.p038l0.i;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class c implements i.d {
    public final d a;
    public d b;

    @Override // com.adsurge.adn.p038l0.d
    public boolean a(i iVar, com.adsurge.adn.p044n0.c cVar) {
        d dVar = this.b;
        boolean z = dVar != null && dVar.a(iVar, cVar);
        this.a.a(iVar, cVar.e, cVar.f, cVar.g);
        return z;
    }

    @Override // com.adsurge.adn.p038l0.d
    public void b(i iVar, com.adsurge.adn.p044n0.c cVar) {
        d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.b(iVar, cVar);
    }

    @Override // com.adsurge.adn.p038l0.d
    public void c(i iVar, com.adsurge.adn.p044n0.c cVar) {
        d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.c(iVar, cVar);
    }

    public c(d dVar) {
        this.a = dVar;
    }

    public void a(d dVar) {
        this.b = dVar;
    }
}
