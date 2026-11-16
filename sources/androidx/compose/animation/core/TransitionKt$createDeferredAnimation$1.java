package androidx.compose.animation.core;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class TransitionKt$createDeferredAnimation$1 extends rc1 implements wr0 {
    public final /* synthetic */ Transition i;
    public final /* synthetic */ Transition.DeferredAnimation j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$createDeferredAnimation$1(Transition transition, Transition.DeferredAnimation deferredAnimation) {
        super(1);
        this.i = transition;
        this.j = deferredAnimation;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((DisposableEffectScope) obj).getClass();
        final Transition transition = this.i;
        final Transition.DeferredAnimation deferredAnimation = this.j;
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                Transition.DeferredAnimation deferredAnimation2 = deferredAnimation;
                deferredAnimation2.getClass();
                Transition.DeferredAnimation.DeferredAnimationData deferredAnimationData = deferredAnimation2.c;
                if (deferredAnimationData != null) {
                    transition.h.remove(deferredAnimationData.a);
                }
            }
        };
    }
}
