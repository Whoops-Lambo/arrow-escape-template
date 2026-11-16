package com.adsurge.adn.oversea_ad;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class Avocado implements Iterable {
    public final int a;
    public final LinkedList b = new LinkedList();

    public final void a(Object obj) {
        if (this.b.size() >= this.a) {
            this.b.poll();
        }
        this.b.offer(obj);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.iterator();
    }

    public Avocado(int i) {
        this.a = i;
    }
}
