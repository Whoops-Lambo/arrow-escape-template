package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzgyt extends zzgyq implements Queue {
    @Override // com.google.android.gms.internal.ads.zzgyq
    public /* bridge */ /* synthetic */ Collection d() {
        throw null;
    }

    public abstract LinkedList e();

    @Override // java.util.Queue
    public final Object element() {
        return e().element();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return e().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return e().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return e().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return e().remove();
    }
}
