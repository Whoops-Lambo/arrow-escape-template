package com.adsurge.adn.p018e1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class d {
    public final f a;

    public abstract void b(Object obj);

    public void a(Object obj) {
        f fVar = this.a;
        if (fVar == null || fVar.m()) {
            return;
        }
        b(obj);
    }

    public d(f fVar) {
        this.a = fVar;
        if (fVar.e() != null) {
            fVar.e().a(this);
        }
    }
}
