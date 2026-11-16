package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import defpackage.bc1;
import defpackage.d;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/GroupIterator;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class GroupIterator implements Iterator<CompositionGroup>, bc1 {
    public final SlotTable a;
    public final int b;
    public int c;
    public final int d;

    /* JADX INFO: renamed from: androidx.compose.runtime.GroupIterator$next$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\b\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002¨\u0006\u0003"}, d2 = {"androidx/compose/runtime/GroupIterator$next$1", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class AnonymousClass1 implements CompositionGroup, Iterable<CompositionGroup>, bc1 {
        public final /* synthetic */ int b;

        @Override // java.lang.Iterable
        public final Iterator<CompositionGroup> iterator() {
            GroupIterator groupIterator = GroupIterator.this;
            SlotTable slotTable = groupIterator.a;
            if (slotTable.g == groupIterator.d) {
                int i = this.b;
                return new GroupIterator(slotTable, i + 1, slotTable.a[(i * 5) + 3] + i);
            }
            d.o();
            return null;
        }

        public AnonymousClass1(int i) {
            this.b = i;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final CompositionGroup next() {
        SlotTable slotTable = this.a;
        if (slotTable.g != this.d) {
            d.o();
            return null;
        }
        int i = this.c;
        this.c = slotTable.a[(i * 5) + 3] + i;
        return new AnonymousClass1(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public GroupIterator(SlotTable slotTable, int i, int i2) {
        this.a = slotTable;
        this.b = i2;
        this.c = i;
        this.d = slotTable.g;
        if (!slotTable.f) {
            return;
        }
        d.o();
        throw null;
    }
}
