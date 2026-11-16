package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class CLObject extends CLContainer implements Iterable<CLKey> {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class CLObjectIterator implements Iterator {
        public CLObject a;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            this.a.getClass();
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.a.getClass();
            throw null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<CLKey> iterator() {
        CLObjectIterator cLObjectIterator = new CLObjectIterator();
        cLObjectIterator.a = this;
        return cLObjectIterator;
    }
}
