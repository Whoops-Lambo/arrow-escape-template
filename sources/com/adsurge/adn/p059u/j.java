package com.adsurge.adn.p059u;

import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class j implements d {
    public final WeakReference a;

    @Override // com.adsurge.adn.p059u.d
    public void a(List list) {
        d dVar = (d) this.a.get();
        if (dVar == null) {
            return;
        }
        dVar.a(list);
    }

    public j(d dVar) {
        this.a = new WeakReference(dVar);
    }

    @Override // com.adsurge.adn.p059u.d
    public void a(b bVar) {
        d dVar = (d) this.a.get();
        if (dVar == null) {
            return;
        }
        dVar.a(bVar);
    }
}
