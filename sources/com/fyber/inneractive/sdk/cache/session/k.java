package com.fyber.inneractive.sdk.cache.session;

import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class k extends PriorityQueue {
    public final int a;

    public k(int i) {
        super(1, new l());
        this.a = i;
    }

    @Override // java.util.PriorityQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(g gVar) {
        boolean zAdd = super.add(gVar);
        if (size() > this.a) {
            poll();
        }
        return zAdd;
    }
}
