package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.hg0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/ExpandShrinkModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class ExpandShrinkModifier extends LayoutModifierWithPassThroughIntrinsics {
    public final Transition.DeferredAnimation a;
    public final Transition.DeferredAnimation b;
    public final MutableState c;
    public final MutableState d;
    public final MutableState e;
    public Alignment f;
    public final wr0 g;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[1] = 1;
            iArr[0] = 2;
            iArr[2] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ExpandShrinkModifier(Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        deferredAnimation.getClass();
        deferredAnimation2.getClass();
        this.a = deferredAnimation;
        this.b = deferredAnimation2;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = new ExpandShrinkModifier$sizeTransitionSpec$1(this);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult s(MeasureScope measureScope, Measurable measurable, long j) {
        long jA;
        measureScope.getClass();
        measurable.getClass();
        Placeable placeableY = measurable.Y(j);
        long jA2 = IntSizeKt.a(placeableY.a, placeableY.b);
        long j2 = ((IntSize) this.a.a(this.g, new ExpandShrinkModifier$measure$currentSize$1(this, jA2)).getA()).a;
        long j3 = ((IntOffset) this.b.a(ExpandShrinkModifier$measure$offsetDelta$1.i, new ExpandShrinkModifier$measure$offsetDelta$2(this, jA2)).getA()).a;
        Alignment alignment = this.f;
        if (alignment != null) {
            jA = alignment.a(jA2, j2, LayoutDirection.a);
        } else {
            jA = IntOffset.b;
        }
        return measureScope.C((int) (j2 >> 32), (int) (j2 & 4294967295L), hg0.a, new ExpandShrinkModifier$measure$1(placeableY, jA, j3));
    }
}
