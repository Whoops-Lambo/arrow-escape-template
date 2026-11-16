package androidx.compose.runtime;

import defpackage.bc1;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/compose/runtime/SlotWriter$groupSlots$1", "", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SlotWriter$groupSlots$1 implements Iterator<Object>, bc1 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ SlotWriter c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public SlotWriter$groupSlots$1(int i, int i2, SlotWriter slotWriter) {
        this.b = i2;
        this.c = slotWriter;
        this.a = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            SlotWriter slotWriter = this.c;
            Object[] objArr = slotWriter.c;
            int i = this.a;
            this.a = i + 1;
            return objArr[slotWriter.h(i)];
        }
        return null;
    }
}
