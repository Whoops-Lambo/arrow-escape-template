package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.DecayAnimation;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.j32;
import defpackage.wz2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class DefaultFlingBehavior implements FlingBehavior {
    public final DecayAnimationSpec a;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public final Object a(ScrollingLogic$doFlingAnimation$2$scope$1 scrollingLogic$doFlingAnimation$2$scope$1, float f, fy fyVar) {
        DefaultFlingBehavior$performFling$1 defaultFlingBehavior$performFling$1;
        j32 j32Var;
        if (fyVar instanceof DefaultFlingBehavior$performFling$1) {
            defaultFlingBehavior$performFling$1 = (DefaultFlingBehavior$performFling$1) fyVar;
            int i = defaultFlingBehavior$performFling$1.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultFlingBehavior$performFling$1.u = i - Integer.MIN_VALUE;
            } else {
                defaultFlingBehavior$performFling$1 = new DefaultFlingBehavior$performFling$1(this, fyVar);
            }
        } else {
            defaultFlingBehavior$performFling$1 = new DefaultFlingBehavior$performFling$1(this, fyVar);
        }
        DefaultFlingBehavior$performFling$1 defaultFlingBehavior$performFling$2 = defaultFlingBehavior$performFling$1;
        Object obj = defaultFlingBehavior$performFling$2.s;
        int i2 = defaultFlingBehavior$performFling$2.u;
        if (i2 == 0) {
            wz2.a0(obj);
            if (Math.abs(f) > 1.0f) {
                j32 j32Var2 = new j32();
                j32Var2.a = f;
                j32 j32Var3 = new j32();
                AnimationState animationStateA = AnimationStateKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 28);
                DefaultFlingBehavior$performFling$2 defaultFlingBehavior$performFling$3 = new DefaultFlingBehavior$performFling$2(j32Var3, scrollingLogic$doFlingAnimation$2$scope$1, j32Var2);
                defaultFlingBehavior$performFling$2.r = j32Var2;
                defaultFlingBehavior$performFling$2.u = 1;
                Object a = animationStateA.b.getA();
                AnimationVector animationVector = animationStateA.c;
                Object objA = SuspendAnimationKt.a(animationStateA, new DecayAnimation(this.a, animationStateA.a, a, animationVector), Long.MIN_VALUE, defaultFlingBehavior$performFling$3, defaultFlingBehavior$performFling$2);
                Object obj2 = dz.a;
                if (objA != obj2) {
                    objA = az2.a;
                }
                if (objA == obj2) {
                    return obj2;
                }
                j32Var = j32Var2;
            }
            return new Float(f);
        }
        if (i2 != 1) {
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j32Var = defaultFlingBehavior$performFling$2.r;
        wz2.a0(obj);
        f = j32Var.a;
        return new Float(f);
    }

    public DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec) {
        decayAnimationSpec.getClass();
        this.a = decayAnimationSpec;
    }
}
