package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import defpackage.d;
import defpackage.zr0;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState;", "", "PrecomposedSlotHandle", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SubcomposeLayoutState {
    public final SubcomposeSlotReusePolicy a;
    public LayoutNodeSubcompositionsState b;
    public final zr0 c = new SubcomposeLayoutState$setRoot$1(this);
    public final zr0 d = new SubcomposeLayoutState$setCompositionContext$1(this);
    public final zr0 e = new SubcomposeLayoutState$setMeasurePolicy$1(this);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface PrecomposedSlotHandle {
    }

    public final LayoutNodeSubcompositionsState a() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.b;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        d.r("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }

    public SubcomposeLayoutState(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.a = subcomposeSlotReusePolicy;
    }

    public final LayoutNodeSubcompositionsState$precompose$1 b(Object obj, zr0 zr0Var) {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsStateA = a();
        LayoutNode layoutNode = layoutNodeSubcompositionsStateA.a;
        layoutNodeSubcompositionsStateA.b();
        if (!layoutNodeSubcompositionsStateA.f.containsKey(obj)) {
            LinkedHashMap linkedHashMap = layoutNodeSubcompositionsStateA.h;
            Object objD = linkedHashMap.get(obj);
            if (objD == null) {
                objD = layoutNodeSubcompositionsStateA.d(obj);
                if (objD != null) {
                    int iIndexOf = layoutNode.c.e().indexOf(objD);
                    int size = layoutNode.c.e().size();
                    layoutNode.k = true;
                    layoutNode.E(iIndexOf, size, 1);
                    layoutNode.k = false;
                    layoutNodeSubcompositionsStateA.k++;
                } else {
                    int size2 = layoutNode.c.e().size();
                    LayoutNode layoutNode2 = new LayoutNode(true);
                    layoutNode.k = true;
                    layoutNode.w(size2, layoutNode2);
                    layoutNode.k = false;
                    layoutNodeSubcompositionsStateA.k++;
                    objD = layoutNode2;
                }
                linkedHashMap.put(obj, objD);
            }
            layoutNodeSubcompositionsStateA.c((LayoutNode) objD, obj, zr0Var);
        }
        return new LayoutNodeSubcompositionsState$precompose$1(layoutNodeSubcompositionsStateA, obj);
    }
}
