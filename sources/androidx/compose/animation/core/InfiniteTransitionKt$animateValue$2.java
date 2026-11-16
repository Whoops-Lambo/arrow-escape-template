package androidx.compose.animation.core;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class InfiniteTransitionKt$animateValue$2 extends rc1 implements wr0 {
    public final /* synthetic */ InfiniteTransition i;
    public final /* synthetic */ InfiniteTransition.TransitionAnimationState j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransitionKt$animateValue$2(InfiniteTransition infiniteTransition, InfiniteTransition.TransitionAnimationState transitionAnimationState) {
        super(1);
        this.i = infiniteTransition;
        this.j = transitionAnimationState;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((DisposableEffectScope) obj).getClass();
        final InfiniteTransition.TransitionAnimationState transitionAnimationState = this.j;
        transitionAnimationState.getClass();
        final InfiniteTransition infiniteTransition = this.i;
        infiniteTransition.a.b(transitionAnimationState);
        infiniteTransition.b.setValue(Boolean.TRUE);
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                InfiniteTransition.TransitionAnimationState transitionAnimationState2 = transitionAnimationState;
                transitionAnimationState2.getClass();
                infiniteTransition.a.o(transitionAnimationState2);
            }
        };
    }
}
