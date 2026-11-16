package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import defpackage.az2;
import defpackage.j32;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Laz2;", "invoke", "(Landroidx/compose/animation/core/AnimationScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class DefaultFlingBehavior$performFling$2 extends rc1 implements wr0 {
    public final /* synthetic */ j32 i;
    public final /* synthetic */ ScrollScope j;
    public final /* synthetic */ j32 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(j32 j32Var, ScrollScope scrollScope, j32 j32Var2) {
        super(1);
        this.i = j32Var;
        this.j = scrollScope;
        this.k = j32Var2;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        AnimationScope animationScope = (AnimationScope) obj;
        animationScope.getClass();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = animationScope.e;
        float fFloatValue = ((Number) parcelableSnapshotMutableState.getA()).floatValue();
        j32 j32Var = this.i;
        float f = fFloatValue - j32Var.a;
        float fA = this.j.a(f);
        j32Var.a = ((Number) parcelableSnapshotMutableState.getA()).floatValue();
        this.k.a = ((Number) animationScope.a.getB().invoke(animationScope.f)).floatValue();
        if (Math.abs(f - fA) > 0.5f) {
            animationScope.a();
        }
        return az2.a;
    }
}
