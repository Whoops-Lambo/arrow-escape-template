package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/NodeParent;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class NodeParent {
    public final MutableVector a;

    public final void c() {
        int i = 0;
        while (true) {
            MutableVector mutableVector = this.a;
            if (i >= mutableVector.c) {
                return;
            }
            Node node = (Node) mutableVector.a[i];
            if (node.b.b) {
                i++;
                node.c();
            } else {
                mutableVector.q(i);
                node.d();
            }
        }
    }

    public void b(InternalPointerEvent internalPointerEvent) {
        MutableVector mutableVector = this.a;
        int i = mutableVector.c;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((Node) mutableVector.a[i]).c.m()) {
                mutableVector.q(i);
            }
        }
    }

    public NodeParent() {
        MutableVector mutableVector = new MutableVector();
        mutableVector.a = new Node[16];
        mutableVector.c = 0;
        this.a = mutableVector;
    }

    public boolean a(LinkedHashMap linkedHashMap, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z) {
        layoutCoordinates.getClass();
        MutableVector mutableVector = this.a;
        int i = mutableVector.c;
        if (i <= 0) {
            return false;
        }
        Object[] objArr = mutableVector.a;
        int i2 = 0;
        boolean z2 = false;
        do {
            if (!((Node) objArr[i2]).a(linkedHashMap, layoutCoordinates, internalPointerEvent, z) && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
            i2++;
        } while (i2 < i);
        return z2;
    }
}
