package androidx.compose.ui.node;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ak1;
import defpackage.az2;
import defpackage.d;
import defpackage.e32;
import defpackage.jc1;
import defpackage.s71;
import defpackage.sr0;
import defpackage.wr0;
import defpackage.x;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "Companion", "LayoutState", "NoIntrinsicsMeasurePolicy", "UsageByParent", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LayoutNode implements Measurable, Remeasurement, OwnerScope, LayoutInfo, ComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final LayoutNode$Companion$ErrorMeasurePolicy$1 T = new LayoutNode$Companion$ErrorMeasurePolicy$1("Undefined intrinsics block and it is required");
    public static final sr0 U = LayoutNode$Companion$Constructor$1.i;
    public static final LayoutNode$Companion$DummyViewConfiguration$1 V = new LayoutNode$Companion$DummyViewConfiguration$1();
    public static final ProvidableModifierLocal W = new ProvidableModifierLocal(LayoutNode$Companion$ModifierLocalNothing$1.i);
    public static final LayoutNode$Companion$SentinelModifierLocalProvider$1 X = new LayoutNode$Companion$SentinelModifierLocalProvider$1();
    public UsageByParent A;
    public boolean B;
    public final InnerPlaceable C;
    public final OuterMeasurablePlaceable D;
    public float E;
    public LayoutNodeSubcompositionsState F;
    public LayoutNodeWrapper G;
    public boolean H;
    public final ModifierLocalProviderEntity I;
    public ModifierLocalProviderEntity J;
    public Modifier K;
    public wr0 L;
    public wr0 M;
    public MutableVector N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final x S;
    public final boolean a;
    public int b;
    public final MutableVector c;
    public MutableVector d;
    public boolean e;
    public LayoutNode f;
    public Owner g;
    public int h;
    public LayoutState i;
    public final MutableVector j;
    public boolean k;
    public final MutableVector l;
    public boolean m;
    public MeasurePolicy n;
    public final IntrinsicsPolicy o;
    public Density p;
    public final LayoutNode$measureScope$1 q;
    public LayoutDirection r;
    public ViewConfiguration s;
    public final LayoutNodeAlignmentLines t;
    public boolean u;
    public int v;
    public int w;
    public int x;
    public UsageByParent y;
    public UsageByParent z;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\f\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "", "ModifierLocalNothing", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "", "NotPlacedPlaceOrder", "I", "androidx/compose/ui/node/LayoutNode$Companion$SentinelModifierLocalProvider$1", "SentinelModifierLocalProvider", "Landroidx/compose/ui/node/LayoutNode$Companion$SentinelModifierLocalProvider$1;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class LayoutState {
        public static final LayoutState a;
        public static final LayoutState b;
        public static final LayoutState c;
        public static final /* synthetic */ LayoutState[] d;

        static {
            LayoutState layoutState = new LayoutState("Measuring", 0);
            a = layoutState;
            LayoutState layoutState2 = new LayoutState("LayingOut", 1);
            b = layoutState2;
            LayoutState layoutState3 = new LayoutState("Idle", 2);
            c = layoutState3;
            d = new LayoutState[]{layoutState, layoutState2, layoutState3};
        }

        public static LayoutState valueOf(String str) {
            return (LayoutState) Enum.valueOf(LayoutState.class, str);
        }

        public static LayoutState[] values() {
            return (LayoutState[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class UsageByParent {
        public static final UsageByParent a;
        public static final UsageByParent b;
        public static final UsageByParent c;
        public static final /* synthetic */ UsageByParent[] d;

        static {
            UsageByParent usageByParent = new UsageByParent("InMeasureBlock", 0);
            a = usageByParent;
            UsageByParent usageByParent2 = new UsageByParent("InLayoutBlock", 1);
            b = usageByParent2;
            UsageByParent usageByParent3 = new UsageByParent("NotUsed", 2);
            c = usageByParent3;
            d = new UsageByParent[]{usageByParent, usageByParent2, usageByParent3};
        }

        public static UsageByParent valueOf(String str) {
            return (UsageByParent) Enum.valueOf(UsageByParent.class, str);
        }

        public static UsageByParent[] values() {
            return (UsageByParent[]) d.clone();
        }
    }

    public final void C() {
        Owner owner;
        this.u = true;
        this.C.getClass();
        for (LayoutNodeWrapper layoutNodeWrapperQ0 = this.D.f; !s71.b(layoutNodeWrapperQ0, null) && layoutNodeWrapperQ0 != null; layoutNodeWrapperQ0 = layoutNodeWrapperQ0.getB()) {
            if (layoutNodeWrapperQ0.u) {
                layoutNodeWrapperQ0.U0();
            }
        }
        MutableVector mutableVectorU = u();
        int i = mutableVectorU.c;
        if (i > 0) {
            Object[] objArr = mutableVectorU.a;
            int i2 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                if (layoutNode.v != Integer.MAX_VALUE) {
                    layoutNode.C();
                    if (WhenMappings.$EnumSwitchMapping$0[layoutNode.i.ordinal()] != 1) {
                        e32.m(layoutNode.i, "Unexpected state ");
                        return;
                    } else if (layoutNode.Q) {
                        layoutNode.O(true);
                    } else if (layoutNode.R && !layoutNode.a && (owner = layoutNode.g) != null) {
                        owner.k(layoutNode, true);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    @Override // androidx.compose.ui.layout.Remeasurement
    public final void b() {
        O(false);
        OuterMeasurablePlaceable outerMeasurablePlaceable = this.D;
        Constraints constraints = outerMeasurablePlaceable.g ? new Constraints(outerMeasurablePlaceable.d) : null;
        Owner owner = this.g;
        if (constraints != null) {
            if (owner != null) {
                owner.b(this, constraints.a);
            }
        } else if (owner != null) {
            owner.a(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        public final String a;

        public NoIntrinsicsMeasurePolicy(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int b(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
            layoutNode$measureScope$1.getClass();
            throw new IllegalStateException(this.a.toString());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int c(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
            layoutNode$measureScope$1.getClass();
            throw new IllegalStateException(this.a.toString());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int d(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
            layoutNode$measureScope$1.getClass();
            throw new IllegalStateException(this.a.toString());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int e(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
            layoutNode$measureScope$1.getClass();
            throw new IllegalStateException(this.a.toString());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            iArr[2] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static boolean J(LayoutNode layoutNode) {
        OuterMeasurablePlaceable outerMeasurablePlaceable = layoutNode.D;
        Constraints constraints = outerMeasurablePlaceable.g ? new Constraints(outerMeasurablePlaceable.d) : null;
        if (constraints == null) {
            layoutNode.getClass();
            return false;
        }
        if (layoutNode.z == UsageByParent.c) {
            layoutNode.l();
        }
        return layoutNode.D.C0(constraints.a);
    }

    public static void M(LayoutNode layoutNode) {
        Owner owner;
        if (layoutNode.a || (owner = layoutNode.g) == null) {
            return;
        }
        owner.k(layoutNode, false);
    }

    public static final void i(LayoutNode layoutNode, ModifierLocalConsumer modifierLocalConsumer, ModifierLocalProviderEntity modifierLocalProviderEntity, MutableVector mutableVector) {
        int i;
        ModifierLocalConsumerEntity modifierLocalConsumerEntity;
        int i2 = mutableVector.c;
        if (i2 <= 0) {
            i = -1;
            break;
        }
        Object[] objArr = mutableVector.a;
        i = 0;
        while (((ModifierLocalConsumerEntity) objArr[i]).b != modifierLocalConsumer) {
            i++;
            if (i >= i2) {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            modifierLocalConsumerEntity = new ModifierLocalConsumerEntity(modifierLocalProviderEntity, modifierLocalConsumer);
        } else {
            modifierLocalConsumerEntity = (ModifierLocalConsumerEntity) mutableVector.q(i);
            modifierLocalConsumerEntity.getClass();
            modifierLocalProviderEntity.getClass();
            modifierLocalConsumerEntity.a = modifierLocalProviderEntity;
        }
        modifierLocalProviderEntity.f.b(modifierLocalConsumerEntity);
    }

    public static final ModifierLocalProviderEntity j(LayoutNode layoutNode, ModifierLocalProvider modifierLocalProvider, ModifierLocalProviderEntity modifierLocalProviderEntity) {
        ModifierLocalProviderEntity modifierLocalProviderEntity2 = modifierLocalProviderEntity.c;
        while (modifierLocalProviderEntity2 != null && modifierLocalProviderEntity2.b != modifierLocalProvider) {
            modifierLocalProviderEntity2 = modifierLocalProviderEntity2.c;
        }
        if (modifierLocalProviderEntity2 == null) {
            modifierLocalProviderEntity2 = new ModifierLocalProviderEntity(layoutNode, modifierLocalProvider);
        } else {
            ModifierLocalProviderEntity modifierLocalProviderEntity3 = modifierLocalProviderEntity2.d;
            if (modifierLocalProviderEntity3 != null) {
                modifierLocalProviderEntity3.c = modifierLocalProviderEntity2.c;
            }
            ModifierLocalProviderEntity modifierLocalProviderEntity4 = modifierLocalProviderEntity2.c;
            if (modifierLocalProviderEntity4 != null) {
                modifierLocalProviderEntity4.d = modifierLocalProviderEntity3;
            }
        }
        modifierLocalProviderEntity2.c = modifierLocalProviderEntity.c;
        ModifierLocalProviderEntity modifierLocalProviderEntity5 = modifierLocalProviderEntity.c;
        if (modifierLocalProviderEntity5 != null) {
            modifierLocalProviderEntity5.d = modifierLocalProviderEntity2;
        }
        modifierLocalProviderEntity.c = modifierLocalProviderEntity2;
        modifierLocalProviderEntity2.d = modifierLocalProviderEntity;
        return modifierLocalProviderEntity2;
    }

    public final boolean A() {
        return this.g != null;
    }

    public final void B() {
        MutableVector mutableVectorU;
        int i;
        boolean zC0;
        LayoutNodeAlignmentLines layoutNodeAlignmentLines = this.t;
        layoutNodeAlignmentLines.c();
        if (this.R && (i = (mutableVectorU = u()).c) > 0) {
            Object[] objArr = mutableVectorU.a;
            int i2 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                boolean z = layoutNode.Q;
                OuterMeasurablePlaceable outerMeasurablePlaceable = layoutNode.D;
                if (z && layoutNode.y == UsageByParent.a) {
                    Constraints constraints = outerMeasurablePlaceable.g ? new Constraints(outerMeasurablePlaceable.d) : null;
                    if (constraints != null) {
                        if (layoutNode.z == UsageByParent.c) {
                            layoutNode.l();
                        }
                        zC0 = outerMeasurablePlaceable.C0(constraints.a);
                    } else {
                        zC0 = false;
                    }
                    if (zC0) {
                        O(false);
                    }
                }
                i2++;
            } while (i2 < i);
        }
        if (this.R) {
            this.R = false;
            this.i = LayoutState.b;
            OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.a(this).getSnapshotObserver();
            LayoutNode$layoutChildren$1 layoutNode$layoutChildren$1 = new LayoutNode$layoutChildren$1(this);
            snapshotObserver.getClass();
            snapshotObserver.b(this, snapshotObserver.c, layoutNode$layoutChildren$1);
            this.i = LayoutState.c;
        }
        if (layoutNodeAlignmentLines.d) {
            layoutNodeAlignmentLines.e = true;
        }
        if (layoutNodeAlignmentLines.b) {
            layoutNodeAlignmentLines.c();
            if (layoutNodeAlignmentLines.h != null) {
                HashMap map = layoutNodeAlignmentLines.i;
                map.clear();
                LayoutNode layoutNode2 = layoutNodeAlignmentLines.a;
                MutableVector mutableVectorU2 = layoutNode2.u();
                InnerPlaceable innerPlaceable = layoutNode2.C;
                int i3 = mutableVectorU2.c;
                if (i3 > 0) {
                    Object[] objArr2 = mutableVectorU2.a;
                    int i4 = 0;
                    do {
                        LayoutNode layoutNode3 = (LayoutNode) objArr2[i4];
                        boolean z2 = layoutNode3.u;
                        InnerPlaceable innerPlaceable2 = layoutNode3.C;
                        LayoutNodeAlignmentLines layoutNodeAlignmentLines2 = layoutNode3.t;
                        if (z2) {
                            if (layoutNodeAlignmentLines2.b) {
                                layoutNode3.B();
                            }
                            for (Map.Entry entry : layoutNodeAlignmentLines2.i.entrySet()) {
                                LayoutNodeAlignmentLines.b(layoutNodeAlignmentLines, (AlignmentLine) entry.getKey(), ((Number) entry.getValue()).intValue(), innerPlaceable2);
                            }
                            LayoutNodeWrapper layoutNodeWrapper = innerPlaceable2.f;
                            layoutNodeWrapper.getClass();
                            while (!layoutNodeWrapper.equals(innerPlaceable)) {
                                for (AlignmentLine alignmentLine : layoutNodeWrapper.M0().getC().keySet()) {
                                    LayoutNodeAlignmentLines.b(layoutNodeAlignmentLines, alignmentLine, layoutNodeWrapper.f0(alignmentLine), layoutNodeWrapper);
                                }
                                layoutNodeWrapper = layoutNodeWrapper.f;
                                layoutNodeWrapper.getClass();
                            }
                        }
                        i4++;
                    } while (i4 < i3);
                }
                map.putAll(innerPlaceable.M0().getC());
                layoutNodeAlignmentLines.b = false;
            }
        }
    }

    public final void D() {
        if (this.u) {
            int i = 0;
            this.u = false;
            MutableVector mutableVectorU = u();
            int i2 = mutableVectorU.c;
            if (i2 > 0) {
                Object[] objArr = mutableVectorU.a;
                do {
                    ((LayoutNode) objArr[i]).D();
                    i++;
                } while (i < i2);
            }
        }
    }

    public final void E(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            MutableVector mutableVector = this.c;
            mutableVector.a(i6, (LayoutNode) mutableVector.q(i5));
        }
        I();
        z();
        O(false);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int F(int i) {
        return this.D.F(i);
    }

    public final void G() {
        LayoutNodeAlignmentLines layoutNodeAlignmentLines = this.t;
        if (layoutNodeAlignmentLines.b) {
            return;
        }
        layoutNodeAlignmentLines.b = true;
        LayoutNode layoutNodeS = s();
        if (layoutNodeS == null) {
            return;
        }
        if (layoutNodeAlignmentLines.c) {
            layoutNodeS.O(false);
        } else if (layoutNodeAlignmentLines.e) {
            M(layoutNodeS);
        }
        if (layoutNodeAlignmentLines.f) {
            O(false);
        }
        if (layoutNodeAlignmentLines.g) {
            M(layoutNodeS);
        }
        layoutNodeS.G();
    }

    public final void H(LayoutNode layoutNode) {
        if (this.g != null) {
            layoutNode.o();
        }
        layoutNode.f = null;
        layoutNode.D.f.f = null;
        if (layoutNode.a) {
            this.b--;
            MutableVector mutableVector = layoutNode.c;
            int i = mutableVector.c;
            if (i > 0) {
                Object[] objArr = mutableVector.a;
                int i2 = 0;
                do {
                    ((LayoutNode) objArr[i2]).D.f.f = null;
                    i2++;
                } while (i2 < i);
            }
        }
        z();
        I();
    }

    public final void I() {
        if (!this.a) {
            this.m = true;
            return;
        }
        LayoutNode layoutNodeS = s();
        if (layoutNodeS != null) {
            layoutNodeS.I();
        }
    }

    public final void K(int i, int i2) {
        if (i2 < 0) {
            ak1.n(jc1.k(i2, "count (", ") must be greater than 0"));
            return;
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            H((LayoutNode) this.c.q(i3));
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void L() {
        if (this.z == UsageByParent.c) {
            m();
        }
        try {
            this.P = true;
            OuterMeasurablePlaceable outerMeasurablePlaceable = this.D;
            if (!outerMeasurablePlaceable.h) {
                throw new IllegalStateException("Check failed.");
            }
            outerMeasurablePlaceable.t0(outerMeasurablePlaceable.j, outerMeasurablePlaceable.l, outerMeasurablePlaceable.k);
            this.P = false;
        } catch (Throwable th) {
            this.P = false;
            throw th;
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int N(int i) {
        return this.D.N(i);
    }

    public final void O(boolean z) {
        Owner owner;
        Owner owner2;
        LayoutNode layoutNodeS;
        if (this.k || this.a || (owner = this.g) == null) {
            return;
        }
        owner.o(this, z);
        LayoutNode layoutNode = this.D.e;
        LayoutNode layoutNodeS2 = layoutNode.s();
        UsageByParent usageByParent = layoutNode.z;
        if (layoutNodeS2 == null || usageByParent == UsageByParent.c) {
            return;
        }
        while (layoutNodeS2.z == usageByParent && (layoutNodeS = layoutNodeS2.s()) != null) {
            layoutNodeS2 = layoutNodeS;
        }
        int iOrdinal = usageByParent.ordinal();
        if (iOrdinal == 0) {
            layoutNodeS2.O(z);
            return;
        }
        if (iOrdinal != 1) {
            e32.i("Intrinsics isn't used by the parent");
        } else {
            if (layoutNodeS2.a || (owner2 = layoutNodeS2.g) == null) {
                return;
            }
            owner2.k(layoutNodeS2, z);
        }
    }

    public final boolean Q() {
        this.C.getClass();
        for (LayoutNodeWrapper layoutNodeWrapperQ0 = this.D.f; !s71.b(layoutNodeWrapperQ0, null) && layoutNodeWrapperQ0 != null; layoutNodeWrapperQ0 = layoutNodeWrapperQ0.getB()) {
            if (layoutNodeWrapperQ0.v != null) {
                return false;
            }
            if (EntityList.b(layoutNodeWrapperQ0.s, 0)) {
                return true;
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int R(int i) {
        return this.D.R(i);
    }

    @Override // androidx.compose.ui.layout.Measurable
    public final Placeable Y(long j) {
        if (this.z == UsageByParent.c) {
            l();
        }
        OuterMeasurablePlaceable outerMeasurablePlaceable = this.D;
        outerMeasurablePlaceable.Y(j);
        return outerMeasurablePlaceable;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    /* JADX INFO: renamed from: a */
    public final Object getM() {
        return this.D.m;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void e(Modifier modifier) {
        InnerPlaceable innerPlaceable;
        MutableVector mutableVector;
        boolean z;
        LayoutNode layoutNodeS;
        LayoutNode layoutNodeS2;
        Owner owner;
        modifier.getClass();
        if (modifier.equals(this.K)) {
            return;
        }
        if (!s71.b(this.K, Modifier.Companion.a) && this.a) {
            d.r("Modifiers are not supported on virtual LayoutNodes");
            return;
        }
        this.K = modifier;
        boolean zQ = Q();
        OuterMeasurablePlaceable outerMeasurablePlaceable = this.D;
        LayoutNodeWrapper layoutNodeWrapper = outerMeasurablePlaceable.f;
        while (true) {
            innerPlaceable = this.C;
            boolean zB = s71.b(layoutNodeWrapper, innerPlaceable);
            mutableVector = this.j;
            if (zB) {
                break;
            }
            ModifiedLayoutNode modifiedLayoutNode = (ModifiedLayoutNode) layoutNodeWrapper;
            mutableVector.b(modifiedLayoutNode);
            layoutNodeWrapper = modifiedLayoutNode.B;
        }
        LayoutNodeWrapper layoutNodeWrapperQ0 = outerMeasurablePlaceable.f;
        innerPlaceable.getClass();
        while (true) {
            if (s71.b(layoutNodeWrapperQ0, null) || layoutNodeWrapperQ0 == null) {
                break;
            }
            LayoutNodeEntity[] layoutNodeEntityArr = layoutNodeWrapperQ0.s;
            for (LayoutNodeEntity layoutNodeEntity : layoutNodeEntityArr) {
                for (; layoutNodeEntity != null; layoutNodeEntity = layoutNodeEntity.c) {
                    if (layoutNodeEntity.d) {
                        layoutNodeEntity.b();
                    }
                }
            }
            int length = layoutNodeEntityArr.length;
            for (int i = 0; i < length; i++) {
                layoutNodeEntityArr[i] = null;
            }
            layoutNodeWrapperQ0 = layoutNodeWrapperQ0.getB();
        }
        int i2 = mutableVector.c;
        boolean z2 = true;
        if (i2 > 0) {
            Object[] objArr = mutableVector.a;
            int i3 = 0;
            do {
                ((ModifiedLayoutNode) objArr[i3]).D = false;
                i3++;
            } while (i3 < i2);
        }
        modifier.m(az2.a, new LayoutNode$markReusedModifiers$2(this));
        LayoutNodeWrapper layoutNodeWrapper2 = outerMeasurablePlaceable.f;
        if (SemanticsNodeKt.c(this) != null && A()) {
            Owner owner2 = this.g;
            owner2.getClass();
            owner2.n();
        }
        boolean zBooleanValue = ((Boolean) this.K.k(Boolean.FALSE, new LayoutNode$hasNewPositioningCallback$1(this.N))).booleanValue();
        MutableVector mutableVector2 = this.N;
        if (mutableVector2 != null) {
            mutableVector2.h();
        }
        OwnedLayer ownedLayer = innerPlaceable.v;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
        LayoutNodeWrapper layoutNodeWrapper3 = (LayoutNodeWrapper) this.K.k(innerPlaceable, new LayoutNode$modifier$outerWrapper$1(this));
        MutableVector mutableVector3 = new MutableVector();
        mutableVector3.a = new ModifierLocalConsumerEntity[16];
        mutableVector3.c = 0;
        ModifierLocalProviderEntity modifierLocalProviderEntity = this.I;
        ModifierLocalProviderEntity modifierLocalProviderEntity2 = modifierLocalProviderEntity;
        while (modifierLocalProviderEntity2 != null) {
            MutableVector mutableVector4 = modifierLocalProviderEntity2.f;
            mutableVector3.c(mutableVector3.c, mutableVector4);
            mutableVector4.h();
            modifierLocalProviderEntity2 = modifierLocalProviderEntity2.c;
            z2 = z2;
        }
        boolean z3 = z2;
        ModifierLocalProviderEntity modifierLocalProviderEntity3 = (ModifierLocalProviderEntity) modifier.m(modifierLocalProviderEntity, new LayoutNode$setModifierLocals$1(this, mutableVector3));
        this.J = modifierLocalProviderEntity3;
        modifierLocalProviderEntity3.c = null;
        if (A()) {
            int i4 = mutableVector3.c;
            if (i4 > 0) {
                Object[] objArr2 = mutableVector3.a;
                int i5 = 0;
                while (true) {
                    ModifierLocalConsumerEntity modifierLocalConsumerEntity = (ModifierLocalConsumerEntity) objArr2[i5];
                    z = zQ;
                    modifierLocalConsumerEntity.b.s0(ModifierLocalConsumerEntity.f);
                    modifierLocalConsumerEntity.d = false;
                    i5++;
                    if (i5 >= i4) {
                        break;
                    } else {
                        zQ = z;
                    }
                }
            } else {
                z = zQ;
            }
            for (ModifierLocalProviderEntity modifierLocalProviderEntity4 = modifierLocalProviderEntity3.c; modifierLocalProviderEntity4 != null; modifierLocalProviderEntity4 = modifierLocalProviderEntity4.c) {
                modifierLocalProviderEntity4.a();
            }
            while (modifierLocalProviderEntity != null) {
                modifierLocalProviderEntity.e = z3;
                Owner owner3 = modifierLocalProviderEntity.a.g;
                if (owner3 != null) {
                    owner3.d(modifierLocalProviderEntity);
                }
                MutableVector mutableVector5 = modifierLocalProviderEntity.f;
                int i6 = mutableVector5.c;
                if (i6 > 0) {
                    Object[] objArr3 = mutableVector5.a;
                    int i7 = 0;
                    do {
                        ModifierLocalConsumerEntity modifierLocalConsumerEntity2 = (ModifierLocalConsumerEntity) objArr3[i7];
                        modifierLocalConsumerEntity2.d = true;
                        Owner owner4 = modifierLocalConsumerEntity2.a.a.g;
                        if (owner4 != null) {
                            owner4.d(modifierLocalConsumerEntity2);
                        }
                        i7++;
                    } while (i7 < i6);
                }
                modifierLocalProviderEntity = modifierLocalProviderEntity.c;
                z3 = true;
            }
        } else {
            z = zQ;
        }
        LayoutNode layoutNodeS3 = s();
        layoutNodeWrapper3.f = layoutNodeS3 != null ? layoutNodeS3.C : null;
        outerMeasurablePlaceable.f = layoutNodeWrapper3;
        if (A()) {
            int i8 = mutableVector.c;
            if (i8 > 0) {
                Object[] objArr4 = mutableVector.a;
                int i9 = 0;
                do {
                    ((ModifiedLayoutNode) objArr4[i9]).G0();
                    i9++;
                } while (i9 < i8);
            }
            for (LayoutNodeWrapper layoutNodeWrapperQ1 = outerMeasurablePlaceable.f; !s71.b(layoutNodeWrapperQ1, null) && layoutNodeWrapperQ1 != null; layoutNodeWrapperQ1 = layoutNodeWrapperQ1.getB()) {
                if (layoutNodeWrapperQ1.s()) {
                    for (LayoutNodeEntity layoutNodeEntity2 : layoutNodeWrapperQ1.s) {
                        for (; layoutNodeEntity2 != null; layoutNodeEntity2 = layoutNodeEntity2.c) {
                            layoutNodeEntity2.a();
                        }
                    }
                } else {
                    layoutNodeWrapperQ1.D0();
                }
            }
        }
        mutableVector.h();
        for (LayoutNodeWrapper layoutNodeWrapperQ2 = outerMeasurablePlaceable.f; !s71.b(layoutNodeWrapperQ2, null) && layoutNodeWrapperQ2 != null; layoutNodeWrapperQ2 = layoutNodeWrapperQ2.getB()) {
            layoutNodeWrapperQ2.Y0();
        }
        if (!s71.b(layoutNodeWrapper2, innerPlaceable) || !layoutNodeWrapper3.equals(innerPlaceable)) {
            O(false);
        } else if (this.i == LayoutState.c && !this.Q && zBooleanValue) {
            O(false);
        } else if (EntityList.b(innerPlaceable.s, 4) && (owner = this.g) != null) {
            owner.g(this);
        }
        Object obj = outerMeasurablePlaceable.m;
        Object objA = outerMeasurablePlaceable.f.getM();
        outerMeasurablePlaceable.m = objA;
        if (!s71.b(obj, objA) && (layoutNodeS2 = s()) != null) {
            layoutNodeS2.O(false);
        }
        if ((z || Q()) && (layoutNodeS = s()) != null) {
            layoutNodeS.x();
        }
    }

    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public final void h() {
        InnerPlaceable innerPlaceable = this.C;
        for (LayoutNodeEntity layoutNodeEntity = innerPlaceable.s[4]; layoutNodeEntity != null; layoutNodeEntity = layoutNodeEntity.c) {
            ((OnPlacedModifier) ((SimpleEntity) layoutNodeEntity).b).F(innerPlaceable);
        }
    }

    public final void l() {
        this.A = this.z;
        UsageByParent usageByParent = UsageByParent.c;
        this.z = usageByParent;
        MutableVector mutableVectorU = u();
        int i = mutableVectorU.c;
        if (i > 0) {
            Object[] objArr = mutableVectorU.a;
            int i2 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                if (layoutNode.z != usageByParent) {
                    layoutNode.l();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void m() {
        this.A = this.z;
        this.z = UsageByParent.c;
        MutableVector mutableVectorU = u();
        int i = mutableVectorU.c;
        if (i > 0) {
            Object[] objArr = mutableVectorU.a;
            int i2 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                if (layoutNode.z == UsageByParent.b) {
                    layoutNode.m();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final String n(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        MutableVector mutableVectorU = u();
        int i3 = mutableVectorU.c;
        if (i3 > 0) {
            Object[] objArr = mutableVectorU.a;
            int i4 = 0;
            do {
                sb.append(((LayoutNode) objArr[i4]).n(i + 1));
                i4++;
            } while (i4 < i3);
        }
        String string = sb.toString();
        return i == 0 ? jc1.j(1, 0, string) : string;
    }

    public final void o() {
        Owner owner = this.g;
        if (owner == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            LayoutNode layoutNodeS = s();
            sb.append(layoutNodeS != null ? layoutNodeS.n(0) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        LayoutNode layoutNodeS2 = s();
        if (layoutNodeS2 != null) {
            layoutNodeS2.x();
            layoutNodeS2.O(false);
        }
        LayoutNodeAlignmentLines layoutNodeAlignmentLines = this.t;
        layoutNodeAlignmentLines.b = true;
        layoutNodeAlignmentLines.c = false;
        layoutNodeAlignmentLines.e = false;
        layoutNodeAlignmentLines.d = false;
        layoutNodeAlignmentLines.f = false;
        layoutNodeAlignmentLines.g = false;
        layoutNodeAlignmentLines.h = null;
        wr0 wr0Var = this.M;
        if (wr0Var != null) {
            wr0Var.invoke(owner);
        }
        for (ModifierLocalProviderEntity modifierLocalProviderEntity = this.I; modifierLocalProviderEntity != null; modifierLocalProviderEntity = modifierLocalProviderEntity.c) {
            modifierLocalProviderEntity.a();
        }
        this.C.getClass();
        for (LayoutNodeWrapper layoutNodeWrapperQ0 = this.D.f; !s71.b(layoutNodeWrapperQ0, null) && layoutNodeWrapperQ0 != null; layoutNodeWrapperQ0 = layoutNodeWrapperQ0.getB()) {
            layoutNodeWrapperQ0.G0();
        }
        if (SemanticsNodeKt.c(this) != null) {
            owner.n();
        }
        owner.m(this);
        this.g = null;
        this.h = 0;
        MutableVector mutableVector = this.c;
        int i = mutableVector.c;
        if (i > 0) {
            Object[] objArr = mutableVector.a;
            int i2 = 0;
            do {
                ((LayoutNode) objArr[i2]).o();
                i2++;
            } while (i2 < i);
        }
        this.v = Integer.MAX_VALUE;
        this.w = Integer.MAX_VALUE;
        this.u = false;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int p(int i) {
        return this.D.p(i);
    }

    public final LayoutNode s() {
        LayoutNode layoutNode = this.f;
        return (layoutNode == null || !layoutNode.a) ? layoutNode : layoutNode.s();
    }

    public final MutableVector t() {
        boolean z = this.m;
        MutableVector mutableVector = this.l;
        if (z) {
            mutableVector.h();
            mutableVector.c(mutableVector.c, u());
            x xVar = this.S;
            xVar.getClass();
            Arrays.sort(mutableVector.a, 0, mutableVector.c, xVar);
            this.m = false;
        }
        return mutableVector;
    }

    public final String toString() {
        return JvmActuals_jvmKt.a(this, null) + " children: " + r().size() + " measurePolicy: " + this.n;
    }

    public final MutableVector u() {
        int i = this.b;
        MutableVector mutableVector = this.c;
        if (i == 0) {
            return mutableVector;
        }
        if (this.e) {
            int i2 = 0;
            this.e = false;
            MutableVector mutableVector2 = this.d;
            if (mutableVector2 == null) {
                mutableVector2 = new MutableVector();
                mutableVector2.a = new LayoutNode[16];
                mutableVector2.c = 0;
                this.d = mutableVector2;
            }
            mutableVector2.h();
            int i3 = mutableVector.c;
            if (i3 > 0) {
                Object[] objArr = mutableVector.a;
                do {
                    LayoutNode layoutNode = (LayoutNode) objArr[i2];
                    if (layoutNode.a) {
                        mutableVector2.c(mutableVector2.c, layoutNode.u());
                    } else {
                        mutableVector2.b(layoutNode);
                    }
                    i2++;
                } while (i2 < i3);
            }
        }
        MutableVector mutableVector3 = this.d;
        mutableVector3.getClass();
        return mutableVector3;
    }

    public final void x() {
        if (this.H) {
            LayoutNodeWrapper layoutNodeWrapper = this.D.f.f;
            this.G = null;
            LayoutNodeWrapper layoutNodeWrapper2 = this.C;
            while (!s71.b(layoutNodeWrapper2, layoutNodeWrapper)) {
                if ((layoutNodeWrapper2 != null ? layoutNodeWrapper2.v : null) != null) {
                    this.G = layoutNodeWrapper2;
                    break;
                }
                layoutNodeWrapper2 = layoutNodeWrapper2 != null ? layoutNodeWrapper2.f : null;
            }
        }
        LayoutNodeWrapper layoutNodeWrapper3 = this.G;
        if (layoutNodeWrapper3 != null && layoutNodeWrapper3.v == null) {
            d.r("Required value was null.");
            return;
        }
        if (layoutNodeWrapper3 != null) {
            layoutNodeWrapper3.U0();
            return;
        }
        LayoutNode layoutNodeS = s();
        if (layoutNodeS != null) {
            layoutNodeS.x();
        }
    }

    public final void y() {
        InnerPlaceable innerPlaceable;
        LayoutNodeWrapper layoutNodeWrapper = this.D.f;
        while (true) {
            innerPlaceable = this.C;
            if (s71.b(layoutNodeWrapper, innerPlaceable)) {
                break;
            }
            ModifiedLayoutNode modifiedLayoutNode = (ModifiedLayoutNode) layoutNodeWrapper;
            OwnedLayer ownedLayer = modifiedLayoutNode.v;
            if (ownedLayer != null) {
                ownedLayer.invalidate();
            }
            layoutNodeWrapper = modifiedLayoutNode.B;
        }
        OwnedLayer ownedLayer2 = innerPlaceable.v;
        if (ownedLayer2 != null) {
            ownedLayer2.invalidate();
        }
    }

    public final void z() {
        LayoutNode layoutNodeS;
        if (this.b > 0) {
            this.e = true;
        }
        if (!this.a || (layoutNodeS = s()) == null) {
            return;
        }
        layoutNodeS.e = true;
    }

    public LayoutNode(boolean z) {
        this.a = z;
        MutableVector mutableVector = new MutableVector();
        mutableVector.a = new LayoutNode[16];
        mutableVector.c = 0;
        this.c = mutableVector;
        this.i = LayoutState.c;
        MutableVector mutableVector2 = new MutableVector();
        mutableVector2.a = new ModifiedLayoutNode[16];
        mutableVector2.c = 0;
        this.j = mutableVector2;
        MutableVector mutableVector3 = new MutableVector();
        mutableVector3.a = new LayoutNode[16];
        mutableVector3.c = 0;
        this.l = mutableVector3;
        this.m = true;
        this.n = T;
        this.o = new IntrinsicsPolicy(this);
        this.p = DensityKt.b();
        this.q = new LayoutNode$measureScope$1(this);
        this.r = LayoutDirection.a;
        this.s = V;
        this.t = new LayoutNodeAlignmentLines(this);
        this.v = Integer.MAX_VALUE;
        this.w = Integer.MAX_VALUE;
        UsageByParent usageByParent = UsageByParent.c;
        this.y = usageByParent;
        this.z = usageByParent;
        this.A = usageByParent;
        InnerPlaceable innerPlaceable = new InnerPlaceable(this);
        this.C = innerPlaceable;
        this.D = new OuterMeasurablePlaceable(this, innerPlaceable);
        this.H = true;
        ModifierLocalProviderEntity modifierLocalProviderEntity = new ModifierLocalProviderEntity(this, X);
        this.I = modifierLocalProviderEntity;
        this.J = modifierLocalProviderEntity;
        this.K = Modifier.Companion.a;
        this.S = new x(19);
    }

    public final void P() {
        MutableVector mutableVectorU = u();
        int i = mutableVectorU.c;
        if (i > 0) {
            Object[] objArr = mutableVectorU.a;
            int i2 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                UsageByParent usageByParent = layoutNode.A;
                layoutNode.z = usageByParent;
                if (usageByParent != UsageByParent.c) {
                    layoutNode.P();
                }
                i2++;
            } while (i2 < i);
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void c(LayoutDirection layoutDirection) {
        layoutDirection.getClass();
        if (this.r != layoutDirection) {
            this.r = layoutDirection;
            O(false);
            LayoutNode layoutNodeS = s();
            if (layoutNodeS != null) {
                layoutNodeS.x();
            }
            y();
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void d(MeasurePolicy measurePolicy) {
        measurePolicy.getClass();
        if (!s71.b(this.n, measurePolicy)) {
            this.n = measurePolicy;
            IntrinsicsPolicy intrinsicsPolicy = this.o;
            intrinsicsPolicy.getClass();
            MutableState mutableState = intrinsicsPolicy.b;
            if (mutableState != null) {
                mutableState.setValue(measurePolicy);
            } else {
                intrinsicsPolicy.c = measurePolicy;
            }
            O(false);
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void f(Density density) {
        density.getClass();
        if (!s71.b(this.p, density)) {
            this.p = density;
            O(false);
            LayoutNode layoutNodeS = s();
            if (layoutNodeS != null) {
                layoutNodeS.x();
            }
            y();
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void g(ViewConfiguration viewConfiguration) {
        viewConfiguration.getClass();
        this.s = viewConfiguration;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    /* JADX INFO: renamed from: isValid */
    public final boolean getD() {
        return A();
    }

    public final void k(Owner owner) {
        int i;
        Owner owner2;
        owner.getClass();
        if (this.g == null) {
            LayoutNode layoutNode = this.f;
            String strN = null;
            if (layoutNode != null && !s71.b(layoutNode.g, owner)) {
                StringBuilder sb = new StringBuilder("Attaching to a different owner(");
                sb.append(owner);
                sb.append(") than the parent's owner(");
                LayoutNode layoutNodeS = s();
                if (layoutNodeS != null) {
                    owner2 = layoutNodeS.g;
                } else {
                    owner2 = null;
                }
                sb.append(owner2);
                sb.append("). This tree: ");
                sb.append(n(0));
                sb.append(" Parent tree: ");
                LayoutNode layoutNode2 = this.f;
                if (layoutNode2 != null) {
                    strN = layoutNode2.n(0);
                }
                sb.append(strN);
                throw new IllegalStateException(sb.toString().toString());
            }
            LayoutNode layoutNodeS2 = s();
            if (layoutNodeS2 == null) {
                this.u = true;
            }
            this.g = owner;
            if (layoutNodeS2 != null) {
                i = layoutNodeS2.h;
            } else {
                i = -1;
            }
            this.h = i + 1;
            if (SemanticsNodeKt.c(this) != null) {
                owner.n();
            }
            owner.l(this);
            MutableVector mutableVector = this.c;
            int i2 = mutableVector.c;
            if (i2 > 0) {
                Object[] objArr = mutableVector.a;
                int i3 = 0;
                do {
                    ((LayoutNode) objArr[i3]).k(owner);
                    i3++;
                } while (i3 < i2);
            }
            O(false);
            if (layoutNodeS2 != null) {
                layoutNodeS2.O(false);
            }
            this.C.getClass();
            for (LayoutNodeWrapper layoutNodeWrapperQ0 = this.D.f; !s71.b(layoutNodeWrapperQ0, null) && layoutNodeWrapperQ0 != null; layoutNodeWrapperQ0 = layoutNodeWrapperQ0.getB()) {
                layoutNodeWrapperQ0.D0();
            }
            for (ModifierLocalProviderEntity modifierLocalProviderEntity = this.I; modifierLocalProviderEntity != null; modifierLocalProviderEntity = modifierLocalProviderEntity.c) {
                modifierLocalProviderEntity.e = true;
                modifierLocalProviderEntity.c(modifierLocalProviderEntity.b.getD(), false);
                MutableVector mutableVector2 = modifierLocalProviderEntity.f;
                int i4 = mutableVector2.c;
                if (i4 > 0) {
                    Object[] objArr2 = mutableVector2.a;
                    int i5 = 0;
                    do {
                        ModifierLocalConsumerEntity modifierLocalConsumerEntity = (ModifierLocalConsumerEntity) objArr2[i5];
                        modifierLocalConsumerEntity.d = true;
                        modifierLocalConsumerEntity.b();
                        i5++;
                    } while (i5 < i4);
                }
            }
            wr0 wr0Var = this.L;
            if (wr0Var != null) {
                wr0Var.invoke(owner);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Cannot attach ");
        sb2.append(this);
        String strN2 = n(0);
        sb2.append(" as it already is attached.  Tree: ");
        sb2.append(strN2);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public final void q(Canvas canvas) {
        canvas.getClass();
        this.D.f.I0(canvas);
    }

    public final List r() {
        return u().e();
    }

    public final void v(long j, HitTestResult hitTestResult, boolean z, boolean z2) {
        hitTestResult.getClass();
        OuterMeasurablePlaceable outerMeasurablePlaceable = this.D;
        outerMeasurablePlaceable.f.S0(LayoutNodeWrapper.z, outerMeasurablePlaceable.f.L0(j), hitTestResult, z, z2);
    }

    public final void w(int i, LayoutNode layoutNode) {
        MutableVector mutableVector;
        int i2;
        layoutNode.getClass();
        boolean z = layoutNode.a;
        int i3 = 0;
        String strN = null;
        InnerPlaceable innerPlaceable = null;
        if (layoutNode.f == null) {
            if (layoutNode.g == null) {
                layoutNode.f = this;
                this.c.a(i, layoutNode);
                I();
                boolean z2 = this.a;
                if (z) {
                    if (!z2) {
                        this.b++;
                    } else {
                        d.r("Virtual LayoutNode can't be added into a virtual parent");
                        return;
                    }
                }
                z();
                LayoutNodeWrapper layoutNodeWrapper = layoutNode.D.f;
                InnerPlaceable innerPlaceable2 = this.C;
                if (z2) {
                    LayoutNode layoutNode2 = this.f;
                    if (layoutNode2 != null) {
                        innerPlaceable = layoutNode2.C;
                    }
                } else {
                    innerPlaceable = innerPlaceable2;
                }
                layoutNodeWrapper.f = innerPlaceable;
                if (z && (i2 = (mutableVector = layoutNode.c).c) > 0) {
                    Object[] objArr = mutableVector.a;
                    do {
                        ((LayoutNode) objArr[i3]).D.f.f = innerPlaceable2;
                        i3++;
                    } while (i3 < i2);
                }
                Owner owner = this.g;
                if (owner != null) {
                    layoutNode.k(owner);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Cannot insert ");
            sb.append(layoutNode);
            String strN2 = n(0);
            String strN3 = layoutNode.n(0);
            sb.append(" because it already has an owner. This tree: ");
            sb.append(strN2);
            sb.append(" Other tree: ");
            sb.append(strN3);
            throw new IllegalStateException(sb.toString().toString());
        }
        StringBuilder sb2 = new StringBuilder("Cannot insert ");
        sb2.append(layoutNode);
        sb2.append(" because it already has a parent. This tree: ");
        sb2.append(n(0));
        sb2.append(" Other tree: ");
        LayoutNode layoutNode3 = layoutNode.f;
        if (layoutNode3 != null) {
            strN = layoutNode3.n(0);
        }
        sb2.append(strN);
        throw new IllegalStateException(sb2.toString().toString());
    }
}
