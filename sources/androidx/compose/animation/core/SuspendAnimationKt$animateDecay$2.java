package androidx.compose.animation.core;

import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Laz2;", "invoke", "(Landroidx/compose/animation/core/AnimationScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class SuspendAnimationKt$animateDecay$2 extends rc1 implements wr0 {
    public final /* synthetic */ zr0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animateDecay$2(zr0 zr0Var) {
        super(1);
        this.i = zr0Var;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        AnimationScope animationScope = (AnimationScope) obj;
        animationScope.getClass();
        this.i.invoke(animationScope.e.getA(), Float.valueOf(((AnimationVector1D) animationScope.f).a));
        return az2.a;
    }
}
