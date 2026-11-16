package androidx.collection;

import defpackage.at;
import defpackage.bc1;
import defpackage.m92;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010)\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableScatterSet$MutableSetWrapper$iterator$1 implements Iterator<Object>, bc1 {
    public int a = -1;
    public final m92 b = at.t(new MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(this, null));

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.a != -1) {
            throw null;
        }
    }
}
