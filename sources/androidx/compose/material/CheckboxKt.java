package androidx.compose.material;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.state.ToggleableState;
import com.unity3d.services.UnityAdsConstants;
import defpackage.wr0;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class CheckboxKt {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Code duplicated, block: B:70:0x013f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0171  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b5 A[LOOP:0: B:76:0x01b2->B:78:0x01b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7  */
    public static final void a(boolean z, ToggleableState toggleableState, Modifier modifier, CheckboxColors checkboxColors, Composer composer, int i) {
        float f;
        float f2;
        int i2;
        float f3;
        int iOrdinal;
        Transition.TransitionAnimationState transitionAnimationStateC;
        Object objB0;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        CheckDrawingCache checkDrawingCache;
        AnimationState animationStateB;
        State stateA;
        State stateC;
        Object[] objArr;
        int i3;
        boolean zL;
        Object objB1;
        ComposerImpl composerImplT = composer.t(-2118895727);
        int i4 = (i & 14) == 0 ? (composerImplT.m(z) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i4 |= composerImplT.l(toggleableState) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i4 |= composerImplT.l(modifier) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i4 |= composerImplT.l(checkboxColors) ? 2048 : 1024;
        }
        if ((i4 & 5851) == 1170 && composerImplT.b()) {
            composerImplT.h();
        } else {
            Transition transitionE = TransitionKt.e(toggleableState, null, composerImplT, (i4 >> 3) & 14, 2);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = transitionE.c;
            composerImplT.B(1399891485);
            TwoWayConverter twoWayConverter = VectorConvertersKt.a;
            composerImplT.B(1847725064);
            ToggleableState toggleableState2 = (ToggleableState) transitionE.b();
            composerImplT.B(-1798345588);
            int iOrdinal2 = toggleableState2.ordinal();
            float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (iOrdinal2 == 0) {
                f = 1.0f;
            } else if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    e.b();
                    return;
                }
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            composerImplT.R(false);
            Float fValueOf = Float.valueOf(f);
            ToggleableState toggleableState3 = (ToggleableState) parcelableSnapshotMutableState.getA();
            composerImplT.B(-1798345588);
            int iOrdinal3 = toggleableState3.ordinal();
            if (iOrdinal3 == 0) {
                f2 = 1.0f;
            } else if (iOrdinal3 != 1) {
                if (iOrdinal3 != 2) {
                    e.b();
                    return;
                }
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            composerImplT.R(false);
            Transition.TransitionAnimationState transitionAnimationStateC2 = TransitionKt.c(transitionE, fValueOf, Float.valueOf(f2), (FiniteAnimationSpec) CheckboxKt$CheckboxImpl$checkDrawFraction$2.i.invoke(transitionE.c(), composerImplT, 0), twoWayConverter, "FloatAnimation", composerImplT);
            composerImplT.R(false);
            composerImplT.R(false);
            composerImplT.B(1399891485);
            composerImplT.B(1847725064);
            ToggleableState toggleableState4 = (ToggleableState) transitionE.b();
            composerImplT.B(-2098942571);
            int iOrdinal4 = toggleableState4.ordinal();
            if (iOrdinal4 != 0) {
                i2 = 1;
                if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        e.b();
                        return;
                    }
                    f3 = 1.0f;
                }
                composerImplT.R(false);
                Float fValueOf2 = Float.valueOf(f3);
                ToggleableState toggleableState5 = (ToggleableState) parcelableSnapshotMutableState.getA();
                composerImplT.B(-2098942571);
                iOrdinal = toggleableState5.ordinal();
                if (iOrdinal != 0 && iOrdinal != i2) {
                    if (iOrdinal == 2) {
                        e.b();
                        return;
                    }
                    f4 = 1.0f;
                }
                composerImplT.R(false);
                transitionAnimationStateC = TransitionKt.c(transitionE, fValueOf2, Float.valueOf(f4), (FiniteAnimationSpec) CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2.i.invoke(transitionE.c(), composerImplT, 0), twoWayConverter, "FloatAnimation", composerImplT);
                composerImplT.R(false);
                composerImplT.R(false);
                composerImplT.B(-492369756);
                objB0 = composerImplT.b0();
                composer$Companion$Empty$1 = Composer.Companion.a;
                if (objB0 == composer$Companion$Empty$1) {
                    objB0 = new CheckDrawingCache();
                    composerImplT.C0(objB0);
                }
                composerImplT.R(false);
                checkDrawingCache = (CheckDrawingCache) objB0;
                animationStateB = checkboxColors.b(toggleableState, composerImplT);
                stateA = checkboxColors.a(z, toggleableState, composerImplT);
                stateC = checkboxColors.c(z, toggleableState, composerImplT);
                Modifier modifierH = SizeKt.h(SizeKt.p(modifier, Alignment.Companion.e), 20.0f);
                objArr = new Object[]{stateA, stateC, animationStateB, transitionAnimationStateC2, transitionAnimationStateC, checkDrawingCache};
                composerImplT.B(-568225417);
                zL = false;
                for (i3 = 0; i3 < 6; i3++) {
                    zL |= composerImplT.l(objArr[i3]);
                }
                objB1 = composerImplT.b0();
                if (zL || objB1 == composer$Companion$Empty$1) {
                    objB1 = new CheckboxKt$CheckboxImpl$1$1(checkDrawingCache, stateA, stateC, animationStateB, transitionAnimationStateC2, transitionAnimationStateC);
                    composerImplT.C0(objB1);
                }
                composerImplT.R(false);
                CanvasKt.a(modifierH, (wr0) objB1, composerImplT, 0);
            } else {
                i2 = 1;
            }
            f3 = 0.0f;
            composerImplT.R(false);
            Float fValueOf3 = Float.valueOf(f3);
            ToggleableState toggleableState6 = (ToggleableState) parcelableSnapshotMutableState.getA();
            composerImplT.B(-2098942571);
            iOrdinal = toggleableState6.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 2) {
                    e.b();
                    return;
                }
                f4 = 1.0f;
            }
            composerImplT.R(false);
            transitionAnimationStateC = TransitionKt.c(transitionE, fValueOf3, Float.valueOf(f4), (FiniteAnimationSpec) CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2.i.invoke(transitionE.c(), composerImplT, 0), twoWayConverter, "FloatAnimation", composerImplT);
            composerImplT.R(false);
            composerImplT.R(false);
            composerImplT.B(-492369756);
            objB0 = composerImplT.b0();
            composer$Companion$Empty$1 = Composer.Companion.a;
            if (objB0 == composer$Companion$Empty$1) {
                objB0 = new CheckDrawingCache();
                composerImplT.C0(objB0);
            }
            composerImplT.R(false);
            checkDrawingCache = (CheckDrawingCache) objB0;
            animationStateB = checkboxColors.b(toggleableState, composerImplT);
            stateA = checkboxColors.a(z, toggleableState, composerImplT);
            stateC = checkboxColors.c(z, toggleableState, composerImplT);
            Modifier modifierH2 = SizeKt.h(SizeKt.p(modifier, Alignment.Companion.e), 20.0f);
            objArr = new Object[]{stateA, stateC, animationStateB, transitionAnimationStateC2, transitionAnimationStateC, checkDrawingCache};
            composerImplT.B(-568225417);
            zL = false;
            while (i3 < 6) {
                zL |= composerImplT.l(objArr[i3]);
            }
            objB1 = composerImplT.b0();
            if (zL) {
                objB1 = new CheckboxKt$CheckboxImpl$1$1(checkDrawingCache, stateA, stateC, animationStateB, transitionAnimationStateC2, transitionAnimationStateC);
                composerImplT.C0(objB1);
            } else {
                objB1 = new CheckboxKt$CheckboxImpl$1$1(checkDrawingCache, stateA, stateC, animationStateB, transitionAnimationStateC2, transitionAnimationStateC);
                composerImplT.C0(objB1);
            }
            composerImplT.R(false);
            CanvasKt.a(modifierH2, (wr0) objB1, composerImplT, 0);
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new CheckboxKt$CheckboxImpl$2(z, toggleableState, modifier, checkboxColors, i);
    }
}
