package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import defpackage.bc1;
import defpackage.n30;
import defpackage.pv1;
import defpackage.s71;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Immutable
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorGroup;", "Landroidx/compose/ui/graphics/vector/VectorNode;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VectorGroup extends VectorNode implements Iterable<VectorNode>, bc1 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final List j;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.VectorGroup$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/compose/ui/graphics/vector/VectorGroup$iterator$1", "", "Landroidx/compose/ui/graphics/vector/VectorNode;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class AnonymousClass1 implements Iterator<VectorNode>, bc1 {
        public final Iterator a;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public final VectorNode next() {
            return (VectorNode) this.a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public AnonymousClass1(VectorGroup vectorGroup) {
            this.a = vectorGroup.j.iterator();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof VectorGroup)) {
            VectorGroup vectorGroup = (VectorGroup) obj;
            return s71.b(this.a, vectorGroup.a) && this.b == vectorGroup.b && this.c == vectorGroup.c && this.d == vectorGroup.d && this.e == vectorGroup.e && this.f == vectorGroup.f && this.g == vectorGroup.g && this.h == vectorGroup.h && s71.b(this.i, vectorGroup.i) && s71.b(this.j, vectorGroup.j);
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode() + pv1.e(n30.b(this.h, n30.b(this.g, n30.b(this.f, n30.b(this.e, n30.b(this.d, n30.b(this.c, n30.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.i);
    }

    @Override // java.lang.Iterable
    public final Iterator<VectorNode> iterator() {
        return new AnonymousClass1(this);
    }

    public VectorGroup(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = list;
        this.j = list2;
    }
}
