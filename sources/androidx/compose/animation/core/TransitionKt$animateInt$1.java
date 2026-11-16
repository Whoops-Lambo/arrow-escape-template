package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import defpackage.as0;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
public final class TransitionKt$animateInt$1 extends rc1 implements as0 {
    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        ((Transition.Segment) obj).getClass();
        composer.B(-785273069);
        SpringSpec springSpecA = AnimationSpecKt.a(3, 1);
        composer.J();
        return springSpecA;
    }
}
