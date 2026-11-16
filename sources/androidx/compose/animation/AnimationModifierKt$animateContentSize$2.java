package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.as0;
import defpackage.cg0;
import defpackage.dn;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class AnimationModifierKt$animateContentSize$2 extends rc1 implements as0 {
    public final /* synthetic */ FiniteAnimationSpec i;

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        modifier.getClass();
        composer.B(-843180607);
        composer.B(773894976);
        composer.B(-492369756);
        Object objC = composer.C();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.a;
        if (objC == composer$Companion$Empty$1) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.h(cg0.a, composer));
            composer.x(compositionScopedCoroutineScopeCanceller);
            objC = compositionScopedCoroutineScopeCanceller;
        }
        composer.J();
        dn dnVar = ((CompositionScopedCoroutineScopeCanceller) objC).a;
        composer.J();
        composer.B(1157296644);
        boolean zL = composer.l(dnVar);
        Object objC2 = composer.C();
        if (zL || objC2 == composer$Companion$Empty$1) {
            objC2 = new SizeAnimationModifier(this.i, dnVar);
            composer.x(objC2);
        }
        composer.J();
        SizeAnimationModifier sizeAnimationModifier = (SizeAnimationModifier) objC2;
        sizeAnimationModifier.getClass();
        Modifier modifierN = GraphicsLayerModifierKt.b(modifier, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 61439).N(sizeAnimationModifier);
        composer.J();
        return modifierN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimationModifierKt$animateContentSize$2(FiniteAnimationSpec finiteAnimationSpec) {
        super(3);
        this.i = finiteAnimationSpec;
    }
}
