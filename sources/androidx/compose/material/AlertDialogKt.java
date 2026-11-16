package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightImpl;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;
import defpackage.nj;
import defpackage.sr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AlertDialogKt {
    public static final Modifier a;
    public static final Modifier b;
    public static final long c;
    public static final long d;
    public static final long e;

    static {
        Modifier.Companion companion = Modifier.Companion.a;
        a = PaddingKt.h(companion, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
        b = PaddingKt.h(companion, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 28.0f, 2);
        c = TextUnitKt.c(40);
        d = TextUnitKt.c(36);
        e = TextUnitKt.c(38);
    }

    public static final void a(zr0 zr0Var, zr0 zr0Var2, Composer composer, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        zr0 zr0Var3;
        zr0 zr0Var4;
        zr0 zr0Var5 = zr0Var2;
        ComposerImpl composerImplT = composer.t(-555573207);
        if (((i | (composerImplT.l(zr0Var) ? 32 : 16) | (composerImplT.l(zr0Var5) ? 256 : 128)) & 731) == 146 && composerImplT.b()) {
            composerImplT.h();
            zr0Var4 = zr0Var5;
        } else {
            LayoutWeightImpl layoutWeightImpl = new LayoutWeightImpl(false, InspectableValueKt.a());
            composerImplT.B(-1323940314);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.e;
            Density density = (Density) composerImplT.v(staticProvidableCompositionLocal);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = CompositionLocalsKt.k;
            LayoutDirection layoutDirection = (LayoutDirection) composerImplT.v(staticProvidableCompositionLocal2);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = CompositionLocalsKt.o;
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerImplT.v(staticProvidableCompositionLocal3);
            ComposeUiNode.X8.getClass();
            sr0 sr0Var = ComposeUiNode.Companion.b;
            ComposableLambdaImpl composableLambdaImplA = LayoutKt.a(layoutWeightImpl);
            composerImplT.g();
            if (composerImplT.K) {
                composerImplT.E(sr0Var);
            } else {
                composerImplT.d();
            }
            composerImplT.x = false;
            zr0 zr0Var6 = ComposeUiNode.Companion.e;
            Updater.a(zr0Var6, composerImplT, AlertDialogKt$AlertDialogBaselineLayout$2.a);
            zr0 zr0Var7 = ComposeUiNode.Companion.d;
            Updater.a(zr0Var7, composerImplT, density);
            zr0 zr0Var8 = ComposeUiNode.Companion.f;
            Updater.a(zr0Var8, composerImplT, layoutDirection);
            zr0 zr0Var9 = ComposeUiNode.Companion.g;
            composableLambdaImplA.invoke(h50.g(composerImplT, viewConfiguration, zr0Var9, composerImplT), composerImplT, 0);
            h50.u(composerImplT, 2058660585, 1454034642, -1160646206);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.a;
            BiasAlignment biasAlignment = Alignment.Companion.a;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.l;
            if (zr0Var == null) {
                z = false;
            } else {
                Modifier modifierA = columnScopeInstance.a(LayoutIdKt.b(a, "title"), horizontal);
                composerImplT.B(733328855);
                MeasurePolicy measurePolicyC = BoxKt.c(biasAlignment, false, composerImplT);
                composerImplT.B(-1323940314);
                Density density2 = (Density) composerImplT.v(staticProvidableCompositionLocal);
                LayoutDirection layoutDirection2 = (LayoutDirection) composerImplT.v(staticProvidableCompositionLocal2);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerImplT.v(staticProvidableCompositionLocal3);
                ComposableLambdaImpl composableLambdaImplA2 = LayoutKt.a(modifierA);
                composerImplT.g();
                if (composerImplT.K) {
                    composerImplT.E(sr0Var);
                } else {
                    composerImplT.d();
                }
                z = false;
                composerImplT.x = false;
                Updater.a(zr0Var6, composerImplT, measurePolicyC);
                Updater.a(zr0Var7, composerImplT, density2);
                Updater.a(zr0Var8, composerImplT, layoutDirection2);
                composableLambdaImplA2.invoke(h50.g(composerImplT, viewConfiguration2, zr0Var9, composerImplT), composerImplT, 0);
                h50.u(composerImplT, 2058660585, -2137368960, 472489145);
                zr0Var.invoke(composerImplT, 0);
                composerImplT.R(false);
                composerImplT.R(false);
                nj.z(composerImplT, false, true, false, false);
            }
            composerImplT.R(z);
            if (zr0Var2 == null) {
                zr0Var3 = zr0Var2;
                z2 = z;
                z3 = true;
            } else {
                Modifier modifierA2 = columnScopeInstance.a(LayoutIdKt.b(b, "text"), horizontal);
                composerImplT.B(733328855);
                MeasurePolicy measurePolicyC2 = BoxKt.c(biasAlignment, z, composerImplT);
                composerImplT.B(-1323940314);
                Density density3 = (Density) composerImplT.v(staticProvidableCompositionLocal);
                LayoutDirection layoutDirection3 = (LayoutDirection) composerImplT.v(staticProvidableCompositionLocal2);
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerImplT.v(staticProvidableCompositionLocal3);
                ComposableLambdaImpl composableLambdaImplA3 = LayoutKt.a(modifierA2);
                composerImplT.g();
                if (composerImplT.K) {
                    composerImplT.E(sr0Var);
                } else {
                    composerImplT.d();
                }
                z2 = false;
                composerImplT.x = false;
                Updater.a(zr0Var6, composerImplT, measurePolicyC2);
                Updater.a(zr0Var7, composerImplT, density3);
                Updater.a(zr0Var8, composerImplT, layoutDirection3);
                composableLambdaImplA3.invoke(h50.g(composerImplT, viewConfiguration3, zr0Var9, composerImplT), composerImplT, 0);
                h50.u(composerImplT, 2058660585, -2137368960, -272722206);
                zr0 zr0Var10 = zr0Var2;
                zr0Var10.invoke(composerImplT, 0);
                composerImplT.R(false);
                composerImplT.R(false);
                z3 = true;
                nj.z(composerImplT, false, true, false, false);
                zr0Var3 = zr0Var10;
            }
            nj.z(composerImplT, z2, z2, z3, z2);
            zr0Var4 = zr0Var3;
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new AlertDialogKt$AlertDialogBaselineLayout$3(zr0Var, zr0Var4, i);
    }

    public static final void b(ComposableLambdaImpl composableLambdaImpl, Modifier modifier, zr0 zr0Var, zr0 zr0Var2, Shape shape, long j, long j2, Composer composer, int i) {
        int i2;
        Shape shape2;
        long j3;
        long j4;
        ComposerImpl composerImpl;
        ComposerImpl composerImplT = composer.t(-453679601);
        if ((i & 14) == 0) {
            i2 = (composerImplT.l(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerImplT.l(modifier) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerImplT.l(zr0Var) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerImplT.l(zr0Var2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            shape2 = shape;
            i2 |= composerImplT.l(shape2) ? 16384 : 8192;
        } else {
            shape2 = shape;
        }
        if ((458752 & i) == 0) {
            j3 = j;
            i2 |= composerImplT.q(j3) ? 131072 : 65536;
        } else {
            j3 = j;
        }
        if ((3670016 & i) == 0) {
            j4 = j2;
            i2 |= composerImplT.q(j4) ? 1048576 : 524288;
        } else {
            j4 = j2;
        }
        if ((2995931 & i2) == 599186 && composerImplT.b()) {
            composerImplT.h();
            composerImpl = composerImplT;
        } else {
            composerImplT.r0();
            if ((i & 1) != 0 && !composerImplT.X()) {
                composerImplT.h();
            }
            composerImplT.S();
            ComposableLambdaImpl composableLambdaImplB = ComposableLambdaKt.b(composerImplT, 629950291, new AlertDialogKt$AlertDialogContent$1(zr0Var, zr0Var2, composableLambdaImpl, i2));
            int i3 = ((i2 >> 3) & 14) | 1572864;
            int i4 = i2 >> 9;
            composerImpl = composerImplT;
            SurfaceKt.a(modifier, shape2, j3, j4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, composableLambdaImplB, composerImpl, i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 48);
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImpl.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new AlertDialogKt$AlertDialogContent$2(composableLambdaImpl, modifier, zr0Var, zr0Var2, shape, j, j2, i);
    }
}
