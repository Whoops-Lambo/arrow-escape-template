package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.hg0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/SlideModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class SlideModifier extends LayoutModifierWithPassThroughIntrinsics {
    public final Transition.DeferredAnimation a;
    public final MutableState b;
    public final MutableState c;
    public final wr0 d;

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

    public SlideModifier(Transition.DeferredAnimation deferredAnimation, MutableState mutableState, MutableState mutableState2) {
        deferredAnimation.getClass();
        this.a = deferredAnimation;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = new SlideModifier$transitionSpec$1(this);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult s(MeasureScope measureScope, Measurable measurable, long j) {
        measureScope.getClass();
        measurable.getClass();
        Placeable placeableY = measurable.Y(j);
        long jA = IntSizeKt.a(placeableY.a, placeableY.b);
        return measureScope.C(placeableY.a, placeableY.b, hg0.a, new SlideModifier$measure$1(this, placeableY, jA));
    }
}
