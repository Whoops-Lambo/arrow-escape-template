package androidx.compose.runtime;

import defpackage.bc1;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u0000\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/DataIterator;", "", "", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class DataIterator implements Iterable<Object>, Iterator<Object>, bc1 {
    public int a;

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i >= 0) {
            throw null;
        }
        this.a = i + 1;
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
