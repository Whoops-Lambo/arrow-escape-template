package com.adsurge.adn.p023g0;

import com.adsurge.adn.p038l0.i;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class d implements i.g, b {
    public final i a;
    public final i.f b;
    public final Map c = new HashMap(3);

    @Override // com.adsurge.adn.l0.i.g
    public void a(i iVar, int i, int i2) {
        a aVar;
        if (this.c.size() <= 0 || (aVar = (a) this.c.get(Integer.valueOf(i2))) == null) {
            return;
        }
        aVar.a("lastStateType", Integer.valueOf(i + 1));
        this.b.a(this.a, aVar);
    }

    public d(i iVar, i.f fVar) {
        this.a = iVar;
        this.b = fVar;
        iVar.a(this);
    }

    @Override // com.adsurge.adn.p023g0.b
    public void a(a aVar) {
        this.c.put(Integer.valueOf(aVar.a - 1), aVar);
    }
}
