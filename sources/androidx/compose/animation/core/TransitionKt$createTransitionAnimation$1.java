package androidx.compose.animation.core;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class TransitionKt$createTransitionAnimation$1 extends rc1 implements wr0 {
    public final /* synthetic */ Transition i;
    public final /* synthetic */ Transition.TransitionAnimationState j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$createTransitionAnimation$1(Transition transition, Transition.TransitionAnimationState transitionAnimationState) {
        super(1);
        this.i = transition;
        this.j = transitionAnimationState;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((DisposableEffectScope) obj).getClass();
        final Transition.TransitionAnimationState transitionAnimationState = this.j;
        transitionAnimationState.getClass();
        final Transition transition = this.i;
        transition.h.add(transitionAnimationState);
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                Transition.TransitionAnimationState transitionAnimationState2 = transitionAnimationState;
                transitionAnimationState2.getClass();
                transition.h.remove(transitionAnimationState2);
            }
        };
    }
}
