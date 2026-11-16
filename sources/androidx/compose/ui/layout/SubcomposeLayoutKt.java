package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.az2;
import defpackage.sr0;
import defpackage.wr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SubcomposeLayoutKt {
    public static final void a(Modifier modifier, zr0 zr0Var, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        zr0Var.getClass();
        ComposerImpl composerImplT = composer.t(-1298353104);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (composerImplT.l(modifier)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if (composerImplT.l(zr0Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && composerImplT.b()) {
            composerImplT.h();
        } else {
            if (i6 != 0) {
                modifier = Modifier.Companion.a;
            }
            composerImplT.B(-492369756);
            Object objB0 = composerImplT.b0();
            if (objB0 == Composer.Companion.a) {
                objB0 = new SubcomposeLayoutState(NoOpSubcomposeSlotReusePolicy.a);
                composerImplT.C0(objB0);
            }
            composerImplT.R(false);
            int i7 = i3 << 3;
            b((SubcomposeLayoutState) objB0, modifier, zr0Var, composerImplT, (i7 & 896) | (i7 & 112) | 8);
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new SubcomposeLayoutKt$SubcomposeLayout$2(modifier, zr0Var, i, i2);
    }

    public static final void b(SubcomposeLayoutState subcomposeLayoutState, Modifier modifier, zr0 zr0Var, Composer composer, int i) {
        subcomposeLayoutState.getClass();
        zr0Var.getClass();
        ComposerImpl composerImplT = composer.t(-511989831);
        CompositionContext compositionContextB = ComposablesKt.b(composerImplT);
        Modifier modifierC = ComposedModifierKt.c(composerImplT, modifier);
        Density density = (Density) composerImplT.v(CompositionLocalsKt.e);
        LayoutDirection layoutDirection = (LayoutDirection) composerImplT.v(CompositionLocalsKt.k);
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerImplT.v(CompositionLocalsKt.o);
        sr0 sr0Var = LayoutNode.U;
        composerImplT.B(1886828752);
        composerImplT.t0();
        if (composerImplT.K) {
            composerImplT.E(new SubcomposeLayoutKt$SubcomposeLayout$$inlined$ComposeNode$1(sr0Var));
        } else {
            composerImplT.d();
        }
        Updater.a(subcomposeLayoutState.c, composerImplT, subcomposeLayoutState);
        Updater.a(subcomposeLayoutState.d, composerImplT, compositionContextB);
        ComposeUiNode.X8.getClass();
        Updater.a(ComposeUiNode.Companion.c, composerImplT, modifierC);
        Updater.a(subcomposeLayoutState.e, composerImplT, zr0Var);
        Updater.a(ComposeUiNode.Companion.d, composerImplT, density);
        Updater.a(ComposeUiNode.Companion.f, composerImplT, layoutDirection);
        Updater.a(ComposeUiNode.Companion.g, composerImplT, viewConfiguration);
        composerImplT.R(true);
        composerImplT.R(false);
        composerImplT.B(-607848778);
        if (!composerImplT.b()) {
            EffectsKt.g(new SubcomposeLayoutKt$SubcomposeLayout$4(subcomposeLayoutState), composerImplT);
        }
        composerImplT.R(false);
        MutableState mutableStateI = SnapshotStateKt.i(subcomposeLayoutState, composerImplT);
        composerImplT.B(1157296644);
        boolean zL = composerImplT.l(mutableStateI);
        Object objB0 = composerImplT.b0();
        if (zL || objB0 == Composer.Companion.a) {
            objB0 = new SubcomposeLayoutKt$SubcomposeLayout$5$1(mutableStateI);
            composerImplT.C0(objB0);
        }
        composerImplT.R(false);
        EffectsKt.a(az2.a, (wr0) objB0, composerImplT);
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new SubcomposeLayoutKt$SubcomposeLayout$6(subcomposeLayoutState, modifier, zr0Var, i);
    }
}
