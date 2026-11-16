package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzikd extends zzika implements Set {
    public final Set b;

    @Override // com.google.android.gms.internal.ads.zzika, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.a.contains((Map.Entry) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzika, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new zzikc(this.b.iterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzikd(Set set) {
        super(set);
        set.getClass();
        this.b = set;
    }
}
