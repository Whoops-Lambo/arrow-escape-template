package androidx.compose.animation.core;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class TransitionKt$createChildTransitionInternal$1 extends rc1 implements wr0 {
    public final /* synthetic */ Transition i;
    public final /* synthetic */ Transition j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$createChildTransitionInternal$1(Transition transition, Transition transition2) {
        super(1);
        this.i = transition;
        this.j = transition2;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((DisposableEffectScope) obj).getClass();
        final Transition transition = this.j;
        transition.getClass();
        final Transition transition2 = this.i;
        transition2.i.add(transition);
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                Transition transition3 = transition;
                transition3.getClass();
                transition2.i.remove(transition3);
            }
        };
    }
}
