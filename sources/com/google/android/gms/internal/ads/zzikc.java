package com.google.android.gms.internal.ads;

import defpackage.bc1;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzikc implements Iterator, bc1 {
    public final /* synthetic */ Iterator a;
    public final /* synthetic */ Iterator b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new zzike((Map.Entry) this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public zzikc(Iterator it) {
        this.b = it;
        this.a = it;
    }
}
