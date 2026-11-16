package com.adsurge.adn.p020f0;

import com.adsurge.adn.p035k0.c;
import com.adsurge.adn.p038l0.i;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class d {
    public final i a;
    public final c b;
    public final Object c;

    public abstract void a(c cVar);

    public void a() {
        this.b.c();
    }

    public String toString() {
        return this.b.getClass() + "_" + this.b.d();
    }

    public d(i iVar, c cVar, Object obj) {
        this.a = iVar;
        this.b = cVar;
        this.c = obj;
    }
}
