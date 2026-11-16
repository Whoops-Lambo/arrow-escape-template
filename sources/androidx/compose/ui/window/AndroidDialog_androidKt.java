package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.h50;
import defpackage.nj;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AndroidDialog_androidKt {
    public static final void a(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        ComposerImpl composerImplT = composer.t(-1177876616);
        if ((i & 14) == 0) {
            if (composerImplT.l(modifier)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (composerImplT.l(composableLambdaImpl)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && composerImplT.b()) {
            composerImplT.h();
        } else {
            int i5 = ((i2 << 3) & 112) | ((i2 >> 3) & 14);
            composerImplT.B(-1323940314);
            Density density = (Density) composerImplT.v(CompositionLocalsKt.e);
            LayoutDirection layoutDirection = (LayoutDirection) composerImplT.v(CompositionLocalsKt.k);
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerImplT.v(CompositionLocalsKt.o);
            ComposeUiNode.X8.getClass();
            sr0 sr0Var = ComposeUiNode.Companion.b;
            ComposableLambdaImpl composableLambdaImplA = LayoutKt.a(modifier);
            int i6 = ((i5 << 9) & 7168) | 6;
            composerImplT.g();
            if (composerImplT.K) {
                composerImplT.E(sr0Var);
            } else {
                composerImplT.d();
            }
            composerImplT.x = false;
            Updater.a(ComposeUiNode.Companion.e, composerImplT, AndroidDialog_androidKt$DialogLayout$1.a);
            Updater.a(ComposeUiNode.Companion.d, composerImplT, density);
            Updater.a(ComposeUiNode.Companion.f, composerImplT, layoutDirection);
            nj.u(0, composableLambdaImplA, h50.g(composerImplT, viewConfiguration, ComposeUiNode.Companion.g, composerImplT), composerImplT, 2058660585);
            composableLambdaImpl.invoke(composerImplT, Integer.valueOf((i6 >> 9) & 14));
            composerImplT.R(false);
            composerImplT.R(true);
            composerImplT.R(false);
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new AndroidDialog_androidKt$DialogLayout$2(modifier, composableLambdaImpl, i);
    }
}
