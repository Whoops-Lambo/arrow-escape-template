package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import defpackage.az2;
import defpackage.dz;
import defpackage.kc2;
import defpackage.sr0;
import defpackage.ul2;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ClickableKt {
    public static /* synthetic */ Modifier c(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, sr0 sr0Var, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        return b(modifier, mutableInteractionSource, indication, z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : role, sr0Var);
    }

    public static Modifier d(Modifier modifier, Role role, sr0 sr0Var, int i) {
        String str = (i & 2) != 0 ? null : NativeAdContent.ViewTag.CTA;
        if ((i & 4) != 0) {
            role = null;
        }
        modifier.getClass();
        sr0Var.getClass();
        return ComposedModifierKt.a(modifier, InspectableValueKt.a(), new ClickableKt$clickable$2(str, role, sr0Var));
    }

    public static final Object e(PressGestureScope pressGestureScope, long j, MutableInteractionSource mutableInteractionSource, MutableState mutableState, MutableState mutableState2, ul2 ul2Var) {
        Object objJ = kc2.j(new ClickableKt$handlePressInteraction$2(pressGestureScope, j, mutableInteractionSource, mutableState, mutableState2, null), ul2Var);
        return objJ == dz.a ? objJ : az2.a;
    }

    public static final void a(MutableInteractionSource mutableInteractionSource, MutableState mutableState, Composer composer, int i) {
        int i2;
        mutableInteractionSource.getClass();
        mutableState.getClass();
        ComposerImpl composerImplT = composer.t(1761107222);
        if (composerImplT.l(mutableInteractionSource)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        if (((i2 | i) & 91) == 18 && composerImplT.b()) {
            composerImplT.h();
        } else {
            composerImplT.B(511388516);
            boolean zL = composerImplT.l(mutableState) | composerImplT.l(mutableInteractionSource);
            Object objB0 = composerImplT.b0();
            if (zL || objB0 == Composer.Companion.a) {
                objB0 = new ClickableKt$PressedInteractionSourceDisposableEffect$1$1(mutableState, mutableInteractionSource);
                composerImplT.C0(objB0);
            }
            composerImplT.R(false);
            EffectsKt.a(mutableInteractionSource, (wr0) objB0, composerImplT);
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new ClickableKt$PressedInteractionSourceDisposableEffect$2(mutableInteractionSource, mutableState, i);
    }

    public static final Modifier b(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, sr0 sr0Var) {
        modifier.getClass();
        mutableInteractionSource.getClass();
        sr0Var.getClass();
        return ComposedModifierKt.a(modifier, InspectableValueKt.a(), new ClickableKt$clickable$4(sr0Var, z, mutableInteractionSource, indication, str, role));
    }
}
