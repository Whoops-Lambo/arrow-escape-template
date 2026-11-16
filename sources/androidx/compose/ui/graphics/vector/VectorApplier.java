package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.e32;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/graphics/vector/VNode;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VectorApplier extends AbstractApplier<VNode> {
    public static GroupComponent k(VNode vNode) {
        if (vNode instanceof GroupComponent) {
            return (GroupComponent) vNode;
        }
        e32.i("Cannot only insert VNode into Group");
        return null;
    }

    @Override // androidx.compose.runtime.Applier
    public final void a(int i, int i2) {
        k((VNode) this.c).e(i, i2);
    }

    @Override // androidx.compose.runtime.Applier
    public final void c(int i, int i2, int i3) {
        GroupComponent groupComponentK = k((VNode) this.c);
        ArrayList arrayList = groupComponentK.c;
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                VNode vNode = (VNode) arrayList.get(i);
                arrayList.remove(i);
                arrayList.add(i2, vNode);
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                VNode vNode2 = (VNode) arrayList.get(i);
                arrayList.remove(i);
                arrayList.add(i2 - 1, vNode2);
                i4++;
            }
        }
        groupComponentK.c();
    }

    @Override // androidx.compose.runtime.Applier
    public final void d(int i, Object obj) {
        VNode vNode = (VNode) obj;
        vNode.getClass();
        GroupComponent groupComponentK = k((VNode) this.c);
        ArrayList arrayList = groupComponentK.c;
        if (i < arrayList.size()) {
            arrayList.set(i, vNode);
        } else {
            arrayList.add(vNode);
        }
        vNode.d(groupComponentK.h);
        groupComponentK.c();
    }

    @Override // androidx.compose.runtime.Applier
    public final void f(int i, Object obj) {
        ((VNode) obj).getClass();
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public final void j() {
        GroupComponent groupComponentK = k((VNode) this.a);
        groupComponentK.e(0, groupComponentK.c.size());
    }
}
