package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import defpackage.du;
import defpackage.gg0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Node extends NodeParent {
    public final PointerInputFilter b;
    public final MutableVector c;
    public final LinkedHashMap d;
    public LayoutCoordinates e;
    public PointerEvent f;
    public boolean g;
    public boolean h;
    public boolean i;

    /* JADX WARN: Code duplicated, block: B:82:0x01d1  */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public final boolean a(LinkedHashMap linkedHashMap, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z) {
        LinkedHashMap linkedHashMap2;
        MutableVector mutableVector;
        Object obj;
        boolean z2;
        PointerEvent pointerEvent;
        int i;
        layoutCoordinates.getClass();
        boolean zA = super.a(linkedHashMap, layoutCoordinates, internalPointerEvent, z);
        PointerInputFilter pointerInputFilter = this.b;
        boolean z3 = true;
        if (!pointerInputFilter.b) {
            return true;
        }
        this.e = pointerInputFilter.a;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap2 = this.d;
            mutableVector = this.c;
            int i2 = 0;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            long j = ((PointerId) entry.getKey()).a;
            PointerInputChange pointerInputChange = (PointerInputChange) entry.getValue();
            if (mutableVector.i(new PointerId(j))) {
                ArrayList arrayList = new ArrayList();
                List list = pointerInputChange.j;
                if (list == null) {
                    list = gg0.a;
                }
                int size = list.size();
                while (i2 < size) {
                    HistoricalChange historicalChange = (HistoricalChange) list.get(i2);
                    boolean z4 = z3;
                    long j2 = historicalChange.a;
                    boolean z5 = zA;
                    LayoutCoordinates layoutCoordinates2 = this.e;
                    layoutCoordinates2.getClass();
                    arrayList.add(new HistoricalChange(j2, layoutCoordinates2.r(layoutCoordinates, historicalChange.b)));
                    i2++;
                    list = list;
                    size = size;
                    z3 = z4;
                    linkedHashMap2 = linkedHashMap2;
                    zA = z5;
                }
                boolean z6 = zA;
                boolean z7 = z3;
                PointerId pointerId = new PointerId(j);
                LayoutCoordinates layoutCoordinates3 = this.e;
                layoutCoordinates3.getClass();
                long jR = layoutCoordinates3.r(layoutCoordinates, pointerInputChange.f);
                LayoutCoordinates layoutCoordinates4 = this.e;
                layoutCoordinates4.getClass();
                PointerInputChange pointerInputChange2 = new PointerInputChange(pointerInputChange.a, pointerInputChange.b, layoutCoordinates4.r(layoutCoordinates, pointerInputChange.c), pointerInputChange.d, pointerInputChange.e, jR, pointerInputChange.g, pointerInputChange.h, arrayList, pointerInputChange.i);
                pointerInputChange2.k = pointerInputChange.k;
                linkedHashMap2.put(pointerId, pointerInputChange2);
                z3 = z7;
                zA = z6;
            }
        }
        boolean z8 = zA;
        boolean z9 = z3;
        if (linkedHashMap2.isEmpty()) {
            mutableVector.h();
            this.a.h();
            return z9;
        }
        int i3 = mutableVector.c;
        while (true) {
            i3--;
            if (-1 >= i3) {
                break;
            }
            if (!linkedHashMap.containsKey(new PointerId(((PointerId) mutableVector.a[i3]).a))) {
                mutableVector.q(i3);
            }
        }
        List listZ0 = du.z0(linkedHashMap2.values());
        PointerEvent pointerEvent2 = new PointerEvent(listZ0, internalPointerEvent);
        int size2 = listZ0.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj = null;
                break;
            }
            obj = listZ0.get(i4);
            if (internalPointerEvent.a(((PointerInputChange) obj).a)) {
                break;
            }
            i4++;
        }
        PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
        if (pointerInputChange3 != null) {
            boolean z10 = pointerInputChange3.d;
            if (!z) {
                this.h = false;
            } else if (!this.h && (z10 || pointerInputChange3.g)) {
                LayoutCoordinates layoutCoordinates5 = this.e;
                layoutCoordinates5.getClass();
                this.h = !PointerEventKt.e(pointerInputChange3, layoutCoordinates5.d());
            }
            boolean z11 = this.h;
            boolean z12 = this.g;
            if (z11 == z12 || !((i = pointerEvent2.d) == 3 || i == 4 || i == 5)) {
                int i5 = pointerEvent2.d;
                if (i5 == 4 && z12 && !this.i) {
                    pointerEvent2.d = 3;
                } else if (i5 == 5 && z11 && z10) {
                    pointerEvent2.d = 3;
                }
            } else {
                pointerEvent2.d = z11 ? 4 : 5;
            }
        }
        if (!z8 && pointerEvent2.d == 3 && (pointerEvent = this.f) != null) {
            List list2 = pointerEvent.a;
            int size3 = list2.size();
            List list3 = pointerEvent2.a;
            if (size3 == list3.size()) {
                int size4 = list3.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        z2 = false;
                        break;
                    }
                    if (!Offset.a(((PointerInputChange) list2.get(i6)).c, ((PointerInputChange) list3.get(i6)).c)) {
                        z2 = z9;
                        break;
                    }
                    i6++;
                }
            } else {
                z2 = z9;
                break;
            }
        } else {
            z2 = z9;
            break;
        }
        this.f = pointerEvent2;
        return z2;
    }

    public final void d() {
        MutableVector mutableVector = this.a;
        int i = mutableVector.c;
        if (i > 0) {
            Object[] objArr = mutableVector.a;
            int i2 = 0;
            do {
                ((Node) objArr[i2]).d();
                i2++;
            } while (i2 < i);
        }
        this.b.k0();
    }

    public final boolean e(InternalPointerEvent internalPointerEvent) {
        MutableVector mutableVector;
        int i;
        LinkedHashMap linkedHashMap = this.d;
        boolean z = false;
        int i2 = 0;
        z = false;
        if (!linkedHashMap.isEmpty()) {
            PointerInputFilter pointerInputFilter = this.b;
            if (pointerInputFilter.b) {
                PointerEvent pointerEvent = this.f;
                pointerEvent.getClass();
                LayoutCoordinates layoutCoordinates = this.e;
                layoutCoordinates.getClass();
                pointerInputFilter.E0(pointerEvent, PointerEventPass.c, layoutCoordinates.d());
                if (pointerInputFilter.b && (i = (mutableVector = this.a).c) > 0) {
                    Object[] objArr = mutableVector.a;
                    do {
                        ((Node) objArr[i2]).e(internalPointerEvent);
                        i2++;
                    } while (i2 < i);
                }
                z = true;
            }
        }
        b(internalPointerEvent);
        linkedHashMap.clear();
        this.e = null;
        return z;
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.b + ", children=" + this.a + ", pointerIds=" + this.c + ')';
    }

    public Node(PointerInputFilter pointerInputFilter) {
        pointerInputFilter.getClass();
        this.b = pointerInputFilter;
        MutableVector mutableVector = new MutableVector();
        mutableVector.a = new PointerId[16];
        mutableVector.c = 0;
        this.c = mutableVector;
        this.d = new LinkedHashMap();
        this.h = true;
        this.i = true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public final void b(InternalPointerEvent internalPointerEvent) {
        super.b(internalPointerEvent);
        PointerEvent pointerEvent = this.f;
        if (pointerEvent == null) {
            return;
        }
        this.g = this.h;
        List list = pointerEvent.a;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = (PointerInputChange) list.get(i);
            boolean z2 = pointerInputChange.d;
            long j = pointerInputChange.a;
            if (!z2 && (!internalPointerEvent.a(j) || !this.h)) {
                this.c.o(new PointerId(j));
            }
        }
        this.h = false;
        if (pointerEvent.d == 5) {
            z = true;
        }
        this.i = z;
    }

    public final boolean f(Map map, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z) {
        MutableVector mutableVector;
        int i;
        map.getClass();
        layoutCoordinates.getClass();
        LinkedHashMap linkedHashMap = this.d;
        int i2 = 0;
        if (!linkedHashMap.isEmpty()) {
            PointerInputFilter pointerInputFilter = this.b;
            if (pointerInputFilter.b) {
                PointerEvent pointerEvent = this.f;
                pointerEvent.getClass();
                LayoutCoordinates layoutCoordinates2 = this.e;
                layoutCoordinates2.getClass();
                long jD = layoutCoordinates2.d();
                pointerInputFilter.E0(pointerEvent, PointerEventPass.a, jD);
                if (pointerInputFilter.b && (i = (mutableVector = this.a).c) > 0) {
                    Object[] objArr = mutableVector.a;
                    do {
                        Node node = (Node) objArr[i2];
                        LayoutCoordinates layoutCoordinates3 = this.e;
                        layoutCoordinates3.getClass();
                        node.f(linkedHashMap, layoutCoordinates3, internalPointerEvent, z);
                        i2++;
                    } while (i2 < i);
                }
                if (pointerInputFilter.b) {
                    pointerInputFilter.E0(pointerEvent, PointerEventPass.b, jD);
                }
                return true;
            }
        }
        return false;
    }
}
