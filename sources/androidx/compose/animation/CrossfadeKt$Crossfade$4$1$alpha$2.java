package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import defpackage.as0;
import defpackage.n30;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class CrossfadeKt$Crossfade$4$1$alpha$2 extends rc1 implements as0 {
    public final /* synthetic */ FiniteAnimationSpec i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$4$1$alpha$2(FiniteAnimationSpec finiteAnimationSpec) {
        super(3);
        this.i = finiteAnimationSpec;
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        n30.u((Number) obj3, (Transition.Segment) obj, composer, 438406499);
        composer.J();
        return this.i;
    }
}
