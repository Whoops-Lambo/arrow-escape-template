package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import defpackage.h50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "ChildData", "SizeModifier", "SlideDirection", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalAnimationApi
public final class AnimatedContentScope<S> implements Transition.Segment<S> {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$ChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class ChildData implements ParentDataModifier {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChildData);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return h50.m(new StringBuilder("ChildData(isTarget="), false, ')');
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public final Object t0(MeasureScope measureScope, Object obj) {
            measureScope.getClass();
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$SlideDirection;", "", "Companion", "value", "", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @Immutable
    public static final class SlideDirection {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$SlideDirection$Companion;", "", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final boolean equals(Object obj) {
            return obj instanceof SlideDirection;
        }

        public final String toString() {
            return "Left";
        }
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    /* JADX INFO: renamed from: b */
    public final Object getB() {
        throw null;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    /* JADX INFO: renamed from: c */
    public final Object getA() {
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$SizeModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @ExperimentalAnimationApi
    public final class SizeModifier extends LayoutModifierWithPassThroughIntrinsics {
        @Override // androidx.compose.ui.layout.LayoutModifier
        public final MeasureResult s(MeasureScope measureScope, Measurable measurable, long j) {
            measureScope.getClass();
            measurable.getClass();
            measurable.Y(j);
            new AnimatedContentScope$SizeModifier$measure$size$1(null, this);
            new AnimatedContentScope$SizeModifier$measure$size$2(null);
            throw null;
        }
    }
}
