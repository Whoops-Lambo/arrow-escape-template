package androidx.compose.ui.layout;

import android.view.ViewGroup;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import androidx.compose.ui.platform.Wrapper_androidKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dr0;
import defpackage.e32;
import defpackage.s71;
import defpackage.zr0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "", "NodeState", "Scope", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LayoutNodeSubcompositionsState {
    public final LayoutNode a;
    public CompositionContext b;
    public SubcomposeSlotReusePolicy c;
    public int d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;
    public final Scope g;
    public final LinkedHashMap h;
    public final SubcomposeSlotReusePolicy.SlotIdsSet i;
    public int j;
    public int k;
    public final String l;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class Scope implements SubcomposeMeasureScope {
        public LayoutDirection a = LayoutDirection.b;
        public float b;
        public float c;

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: getDensity, reason: from getter */
        public final float getB() {
            return this.b;
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: getFontScale, reason: from getter */
        public final float getC() {
            return this.c;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        /* JADX INFO: renamed from: getLayoutDirection, reason: from getter */
        public final LayoutDirection getA() {
            return this.a;
        }

        public Scope() {
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public final List w(Object obj, zr0 zr0Var) {
            zr0Var.getClass();
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
            layoutNodeSubcompositionsState.b();
            LayoutNode layoutNode = layoutNodeSubcompositionsState.a;
            LayoutNode.LayoutState layoutState = layoutNode.i;
            if (layoutState != LayoutNode.LayoutState.a && layoutState != LayoutNode.LayoutState.b) {
                e32.i("subcompose can only be used inside the measure or layout blocks");
                return null;
            }
            LinkedHashMap linkedHashMap = layoutNodeSubcompositionsState.f;
            Object objD = linkedHashMap.get(obj);
            if (objD == null) {
                objD = (LayoutNode) layoutNodeSubcompositionsState.h.remove(obj);
                if (objD != null) {
                    int i = layoutNodeSubcompositionsState.k;
                    if (i > 0) {
                        layoutNodeSubcompositionsState.k = i - 1;
                    } else {
                        e32.i("Check failed.");
                        return null;
                    }
                } else {
                    objD = layoutNodeSubcompositionsState.d(obj);
                    if (objD == null) {
                        int i2 = layoutNodeSubcompositionsState.d;
                        LayoutNode layoutNode2 = new LayoutNode(true);
                        layoutNode.k = true;
                        layoutNode.w(i2, layoutNode2);
                        layoutNode.k = false;
                        objD = layoutNode2;
                    }
                }
                linkedHashMap.put(obj, objD);
            }
            LayoutNode layoutNode3 = (LayoutNode) objD;
            int iIndexOf = layoutNode.c.e().indexOf(layoutNode3);
            int i3 = layoutNodeSubcompositionsState.d;
            if (iIndexOf >= i3) {
                if (i3 != iIndexOf) {
                    layoutNode.k = true;
                    layoutNode.E(iIndexOf, i3, 1);
                    layoutNode.k = false;
                }
                layoutNodeSubcompositionsState.d++;
                layoutNodeSubcompositionsState.c(layoutNode3, obj, zr0Var);
                return layoutNode3.r();
            }
            e32.o(obj, " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.", "Key ");
            return null;
        }
    }

    public final void a(int i) {
        this.j = 0;
        LayoutNode layoutNode = this.a;
        int size = (layoutNode.c.e().size() - this.k) - 1;
        if (i <= size) {
            SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet = this.i;
            slotIdsSet.clear();
            Set set = slotIdsSet.a;
            LinkedHashMap linkedHashMap = this.e;
            if (i <= size) {
                int i2 = i;
                while (true) {
                    Object obj = linkedHashMap.get((LayoutNode) layoutNode.c.e().get(i2));
                    obj.getClass();
                    set.add(((NodeState) obj).a);
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.c.a(slotIdsSet);
            while (size >= i) {
                LayoutNode layoutNode2 = (LayoutNode) layoutNode.c.e().get(size);
                Object obj2 = linkedHashMap.get(layoutNode2);
                obj2.getClass();
                NodeState nodeState = (NodeState) obj2;
                Object obj3 = nodeState.a;
                if (set.contains(obj3)) {
                    layoutNode2.getClass();
                    layoutNode2.y = LayoutNode.UsageByParent.c;
                    this.j++;
                    nodeState.e.setValue(Boolean.FALSE);
                } else {
                    layoutNode.k = true;
                    linkedHashMap.remove(layoutNode2);
                    Composition composition = nodeState.c;
                    if (composition != null) {
                        composition.dispose();
                    }
                    layoutNode.K(size, 1);
                    layoutNode.k = false;
                }
                this.f.remove(obj3);
                size--;
            }
        }
        b();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class NodeState {
        public Object a;
        public zr0 b;
        public Composition c;
        public boolean d;
        public final ParcelableSnapshotMutableState e;

        public NodeState(Object obj, zr0 zr0Var) {
            zr0Var.getClass();
            this.a = obj;
            this.b = zr0Var;
            this.c = null;
            this.e = SnapshotStateKt.c(Boolean.TRUE, StructuralEqualityPolicy.a);
        }
    }

    public final void b() {
        LinkedHashMap linkedHashMap = this.e;
        int size = linkedHashMap.size();
        LayoutNode layoutNode = this.a;
        MutableVector mutableVector = layoutNode.c;
        MutableVector mutableVector2 = layoutNode.c;
        if (size != mutableVector.e().size()) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + linkedHashMap.size() + ") and the children count on the SubcomposeLayout (" + mutableVector2.e().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((mutableVector2.e().size() - this.j) - this.k >= 0) {
            LinkedHashMap linkedHashMap2 = this.h;
            if (linkedHashMap2.size() == this.k) {
                return;
            }
            dr0.g(". Map size ", "Incorrect state. Precomposed children ", this.k, linkedHashMap2.size());
            return;
        }
        throw new IllegalArgumentException(("Incorrect state. Total children " + mutableVector2.e().size() + ". Reusable children " + this.j + ". Precomposed children " + this.k).toString());
    }

    public final void c(LayoutNode layoutNode, Object obj, zr0 zr0Var) {
        LinkedHashMap linkedHashMap = this.e;
        Object nodeState = linkedHashMap.get(layoutNode);
        if (nodeState == null) {
            nodeState = new NodeState(obj, ComposableSingletons$SubcomposeLayoutKt.a);
            linkedHashMap.put(layoutNode, nodeState);
        }
        NodeState nodeState2 = (NodeState) nodeState;
        Composition composition = nodeState2.c;
        boolean zM = composition != null ? composition.m() : true;
        if (nodeState2.b != zr0Var || zM || nodeState2.d) {
            zr0Var.getClass();
            nodeState2.b = zr0Var;
            Snapshot snapshotA = Snapshot.Companion.a();
            try {
                Snapshot snapshotI = snapshotA.i();
                try {
                    LayoutNode layoutNode2 = this.a;
                    layoutNode2.k = true;
                    zr0 zr0Var2 = nodeState2.b;
                    Composition compositionImpl = nodeState2.c;
                    CompositionContext compositionContext = this.b;
                    if (compositionContext == null) {
                        throw new IllegalStateException("parent composition reference not set");
                    }
                    ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-34810602, new LayoutNodeSubcompositionsState$subcompose$2$1$1(nodeState2, zr0Var2), true);
                    if (compositionImpl == null || compositionImpl.getR()) {
                        ViewGroup.LayoutParams layoutParams = Wrapper_androidKt.a;
                        compositionImpl = new CompositionImpl(compositionContext, new UiApplier(layoutNode));
                    }
                    compositionImpl.n(composableLambdaImplC);
                    nodeState2.c = compositionImpl;
                    layoutNode2.k = false;
                    Snapshot.o(snapshotI);
                    snapshotA.c();
                    nodeState2.d = false;
                } catch (Throwable th) {
                    Snapshot.o(snapshotI);
                    throw th;
                }
            } catch (Throwable th2) {
                snapshotA.c();
                throw th2;
            }
        }
    }

    public final LayoutNode d(Object obj) {
        LinkedHashMap linkedHashMap;
        int i;
        if (this.j == 0) {
            return null;
        }
        LayoutNode layoutNode = this.a;
        MutableVector mutableVector = layoutNode.c;
        MutableVector mutableVector2 = layoutNode.c;
        int size = mutableVector.e().size() - this.k;
        int i2 = size - this.j;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            linkedHashMap = this.e;
            if (i4 < i2) {
                i = -1;
                break;
            }
            Object obj2 = linkedHashMap.get((LayoutNode) layoutNode.c.e().get(i4));
            obj2.getClass();
            if (s71.b(((NodeState) obj2).a, obj)) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (true) {
                if (i3 < i2) {
                    i4 = i3;
                    break;
                }
                Object obj3 = linkedHashMap.get((LayoutNode) mutableVector2.e().get(i3));
                obj3.getClass();
                NodeState nodeState = (NodeState) obj3;
                if (this.c.b(obj, nodeState.a)) {
                    nodeState.a = obj;
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            layoutNode.k = true;
            layoutNode.E(i4, i2, 1);
            layoutNode.k = false;
        }
        this.j--;
        LayoutNode layoutNode2 = (LayoutNode) mutableVector2.e().get(i2);
        Object obj4 = linkedHashMap.get(layoutNode2);
        obj4.getClass();
        ((NodeState) obj4).e.setValue(Boolean.TRUE);
        Snapshot.Companion.e();
        return layoutNode2;
    }

    public LayoutNodeSubcompositionsState(LayoutNode layoutNode, SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        layoutNode.getClass();
        this.a = layoutNode;
        this.c = subcomposeSlotReusePolicy;
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new Scope();
        this.h = new LinkedHashMap();
        this.i = new SubcomposeSlotReusePolicy.SlotIdsSet();
        this.l = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }
}
