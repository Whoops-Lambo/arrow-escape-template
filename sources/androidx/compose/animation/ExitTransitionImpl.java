package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/ExitTransitionImpl;", "Landroidx/compose/animation/ExitTransition;", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class ExitTransitionImpl extends ExitTransition {
    public final TransitionData a;

    @Override // androidx.compose.animation.ExitTransition
    /* JADX INFO: renamed from: a, reason: from getter */
    public final TransitionData getA() {
        return this.a;
    }

    public ExitTransitionImpl(TransitionData transitionData) {
        this.a = transitionData;
    }
}
