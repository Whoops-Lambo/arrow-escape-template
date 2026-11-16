package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class EnterExitTransitionKt {
    public static final TwoWayConverter a = VectorConvertersKt.a(EnterExitTransitionKt$TransformOriginVectorConverter$1.i, EnterExitTransitionKt$TransformOriginVectorConverter$2.i);
    public static final ParcelableSnapshotMutableState b = SnapshotStateKt.c(Float.valueOf(1.0f), StructuralEqualityPolicy.a);
    public static final SpringSpec c = AnimationSpecKt.a(5, null);
    public static final SpringSpec d;
    public static final SpringSpec e;

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

    static {
        int i = IntOffset.c;
        Rect rect = VisibilityThresholdsKt.a;
        d = AnimationSpecKt.a(1, new IntOffset(IntOffsetKt.a(1, 1)));
        e = AnimationSpecKt.a(1, new IntSize(IntSizeKt.a(1, 1)));
    }

    public static EnterTransition a(TweenSpec tweenSpec, int i) {
        FiniteAnimationSpec finiteAnimationSpecA = tweenSpec;
        if ((i & 1) != 0) {
            finiteAnimationSpecA = AnimationSpecKt.a(5, null);
        }
        return new EnterTransitionImpl(new TransitionData(new Fade(finiteAnimationSpecA), (ChangeSize) null, (Scale) null, 14));
    }

    public static ExitTransition b(TweenSpec tweenSpec, int i) {
        FiniteAnimationSpec finiteAnimationSpecA = tweenSpec;
        if ((i & 1) != 0) {
            finiteAnimationSpecA = AnimationSpecKt.a(5, null);
        }
        return new ExitTransitionImpl(new TransitionData(new Fade(finiteAnimationSpecA), (ChangeSize) null, (Scale) null, 14));
    }

    public static EnterTransition c(TweenSpec tweenSpec) {
        return new EnterTransitionImpl(new TransitionData((Fade) null, (ChangeSize) null, new Scale(TransformOrigin.b, tweenSpec), 7));
    }
}
