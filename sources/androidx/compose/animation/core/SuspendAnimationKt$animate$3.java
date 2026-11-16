package androidx.compose.animation.core;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/AnimationScope;", "Laz2;", "invoke", "(Landroidx/compose/animation/core/AnimationScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class SuspendAnimationKt$animate$3 extends rc1 implements wr0 {
    public final /* synthetic */ zr0 i;
    public final /* synthetic */ TwoWayConverter j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$3(zr0 zr0Var, TwoWayConverter twoWayConverter) {
        super(1);
        this.i = zr0Var;
        this.j = twoWayConverter;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        AnimationScope animationScope = (AnimationScope) obj;
        animationScope.getClass();
        this.i.invoke(animationScope.e.getA(), this.j.getB().invoke(animationScope.f));
        return az2.a;
    }
}
