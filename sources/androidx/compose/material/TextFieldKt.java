package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.C;
import com.unity3d.services.UnityAdsConstants;
import defpackage.as0;
import defpackage.h50;
import defpackage.nj;
import defpackage.rd1;
import defpackage.sr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TextFieldKt {
    public static final void a(Modifier modifier, zr0 zr0Var, zr0 zr0Var2, as0 as0Var, zr0 zr0Var3, zr0 zr0Var4, boolean z, float f, PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        boolean z2;
        zr0 zr0Var5;
        boolean z3;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal2;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal3;
        zr0 zr0Var6;
        boolean z4;
        zr0 zr0Var7;
        zr0 zr0Var8;
        zr0 zr0Var9 = zr0Var;
        modifier.getClass();
        zr0Var9.getClass();
        paddingValues.getClass();
        ComposerImpl composerImplT = composer.t(-2112507061);
        if ((i & 14) == 0) {
            i2 = (composerImplT.l(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerImplT.l(zr0Var9) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerImplT.l(zr0Var2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerImplT.l(as0Var) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= composerImplT.l(zr0Var3) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= composerImplT.l(zr0Var4) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= composerImplT.m(z) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= composerImplT.n(f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i2 |= composerImplT.l(paddingValues) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((191739611 & i2) == 38347922 && composerImplT.b()) {
            composerImplT.h();
            zr0Var7 = zr0Var2;
            zr0Var8 = zr0Var9;
        } else {
            Boolean boolValueOf = Boolean.valueOf(z);
            Float fValueOf = Float.valueOf(f);
            composerImplT.B(1618982084);
            boolean zL = composerImplT.l(boolValueOf) | composerImplT.l(fValueOf) | composerImplT.l(paddingValues);
            Object objB0 = composerImplT.b0();
            if (zL || objB0 == Composer.Companion.a) {
                objB0 = new TextFieldMeasurePolicy(z, f, paddingValues);
                composerImplT.C0(objB0);
            }
            composerImplT.R(false);
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) objB0;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal4 = CompositionLocalsKt.k;
            LayoutDirection layoutDirection = (LayoutDirection) composerImplT.v(staticProvidableCompositionLocal4);
            composerImplT.B(-1323940314);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal5 = CompositionLocalsKt.e;
            Density density = (Density) composerImplT.v(staticProvidableCompositionLocal5);
            LayoutDirection layoutDirection2 = (LayoutDirection) composerImplT.v(staticProvidableCompositionLocal4);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal6 = CompositionLocalsKt.o;
            int i3 = i2;
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerImplT.v(staticProvidableCompositionLocal6);
            ComposeUiNode.X8.getClass();
            sr0 sr0Var = ComposeUiNode.Companion.b;
            ComposableLambdaImpl composableLambdaImplA = LayoutKt.a(modifier);
            composerImplT.g();
            if (composerImplT.K) {
                composerImplT.E(sr0Var);
            } else {
                composerImplT.d();
            }
            composerImplT.x = false;
            zr0 zr0Var10 = ComposeUiNode.Companion.e;
            Updater.a(zr0Var10, composerImplT, textFieldMeasurePolicy);
            zr0 zr0Var11 = ComposeUiNode.Companion.d;
            Updater.a(zr0Var11, composerImplT, density);
            zr0 zr0Var12 = ComposeUiNode.Companion.f;
            Updater.a(zr0Var12, composerImplT, layoutDirection2);
            zr0 zr0Var13 = ComposeUiNode.Companion.g;
            composableLambdaImplA.invoke(h50.g(composerImplT, viewConfiguration, zr0Var13, composerImplT), composerImplT, 0);
            h50.u(composerImplT, 2058660585, 642667778, 254816194);
            Modifier.Companion companion = Modifier.Companion.a;
            BiasAlignment biasAlignment = Alignment.Companion.e;
            if (zr0Var3 != null) {
                Modifier modifierN = LayoutIdKt.b(companion, "Leading").N(TextFieldImplKt.d);
                composerImplT.B(733328855);
                MeasurePolicy measurePolicyC = BoxKt.c(biasAlignment, false, composerImplT);
                composerImplT.B(-1323940314);
                Density density2 = (Density) composerImplT.v(staticProvidableCompositionLocal5);
                LayoutDirection layoutDirection3 = (LayoutDirection) composerImplT.v(staticProvidableCompositionLocal4);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerImplT.v(staticProvidableCompositionLocal6);
                ComposableLambdaImpl composableLambdaImplA2 = LayoutKt.a(modifierN);
                composerImplT.g();
                if (composerImplT.K) {
                    composerImplT.E(sr0Var);
                } else {
                    composerImplT.d();
                }
                composerImplT.x = false;
                Updater.a(zr0Var10, composerImplT, measurePolicyC);
                Updater.a(zr0Var11, composerImplT, density2);
                Updater.a(zr0Var12, composerImplT, layoutDirection3);
                composableLambdaImplA2.invoke(h50.g(composerImplT, viewConfiguration2, zr0Var13, composerImplT), composerImplT, 0);
                h50.u(composerImplT, 2058660585, -2137368960, 822730659);
                zr0Var3.invoke(composerImplT, Integer.valueOf((i3 >> 12) & 14));
                z2 = false;
                composerImplT.R(false);
                composerImplT.R(false);
                nj.z(composerImplT, false, true, false, false);
            } else {
                z2 = false;
            }
            composerImplT.R(z2);
            composerImplT.B(254816479);
            if (zr0Var4 != null) {
                Modifier modifierN2 = LayoutIdKt.b(companion, "Trailing").N(TextFieldImplKt.d);
                composerImplT.B(733328855);
                MeasurePolicy measurePolicyC2 = BoxKt.c(biasAlignment, z2, composerImplT);
                composerImplT.B(-1323940314);
                Density density3 = (Density) composerImplT.v(staticProvidableCompositionLocal3);
                staticProvidableCompositionLocal2 = staticProvidableCompositionLocal4;
                LayoutDirection layoutDirection4 = (LayoutDirection) composerImplT.v(staticProvidableCompositionLocal2);
                staticProvidableCompositionLocal = staticProvidableCompositionLocal6;
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerImplT.v(staticProvidableCompositionLocal);
                ComposableLambdaImpl composableLambdaImplA3 = LayoutKt.a(modifierN2);
                composerImplT.g();
                if (composerImplT.K) {
                    staticProvidableCompositionLocal3 = staticProvidableCompositionLocal5;
                    composerImplT.E(sr0Var);
                } else {
                    staticProvidableCompositionLocal3 = staticProvidableCompositionLocal5;
                    composerImplT.d();
                }
                composerImplT.x = false;
                Updater.a(zr0Var10, composerImplT, measurePolicyC2);
                Updater.a(zr0Var11, composerImplT, density3);
                Updater.a(zr0Var12, composerImplT, layoutDirection4);
                composableLambdaImplA3.invoke(h50.g(composerImplT, viewConfiguration3, zr0Var13, composerImplT), composerImplT, 0);
                h50.u(composerImplT, 2058660585, -2137368960, -1007916070);
                zr0 zr0Var14 = zr0Var4;
                zr0Var14.invoke(composerImplT, Integer.valueOf((i3 >> 15) & 14));
                z3 = false;
                composerImplT.R(false);
                composerImplT.R(false);
                nj.z(composerImplT, false, true, false, false);
                zr0Var5 = zr0Var14;
            } else {
                zr0Var5 = zr0Var4;
                z3 = z2;
                staticProvidableCompositionLocal = staticProvidableCompositionLocal6;
                staticProvidableCompositionLocal2 = staticProvidableCompositionLocal4;
                staticProvidableCompositionLocal3 = staticProvidableCompositionLocal5;
            }
            composerImplT.R(z3);
            float fC = PaddingKt.c(paddingValues, layoutDirection);
            float fB = PaddingKt.b(paddingValues, layoutDirection);
            if (zr0Var3 != null) {
                fC -= TextFieldImplKt.c;
                if (fC < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    fC = 0.0f;
                }
            }
            if (zr0Var5 != null) {
                fB -= TextFieldImplKt.c;
                if (fB < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    fB = 0.0f;
                }
            }
            Modifier modifierH = PaddingKt.h(companion, fC, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fB, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            composerImplT.B(254817490);
            if (as0Var != null) {
                as0Var.invoke(LayoutIdKt.b(companion, "Hint").N(modifierH), composerImplT, Integer.valueOf((i3 >> 6) & 112));
            }
            boolean z5 = false;
            composerImplT.R(false);
            composerImplT.B(254817619);
            BiasAlignment biasAlignment2 = Alignment.Companion.a;
            if (zr0Var2 != null) {
                Modifier modifierN3 = LayoutIdKt.b(companion, "Label").N(modifierH);
                composerImplT.B(733328855);
                MeasurePolicy measurePolicyC3 = BoxKt.c(biasAlignment2, false, composerImplT);
                composerImplT.B(-1323940314);
                Density density4 = (Density) composerImplT.v(staticProvidableCompositionLocal3);
                LayoutDirection layoutDirection5 = (LayoutDirection) composerImplT.v(staticProvidableCompositionLocal2);
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerImplT.v(staticProvidableCompositionLocal);
                ComposableLambdaImpl composableLambdaImplA4 = LayoutKt.a(modifierN3);
                composerImplT.g();
                if (composerImplT.K) {
                    composerImplT.E(sr0Var);
                } else {
                    composerImplT.d();
                }
                composerImplT.x = false;
                Updater.a(zr0Var10, composerImplT, measurePolicyC3);
                Updater.a(zr0Var11, composerImplT, density4);
                Updater.a(zr0Var12, composerImplT, layoutDirection5);
                composableLambdaImplA4.invoke(h50.g(composerImplT, viewConfiguration4, zr0Var13, composerImplT), composerImplT, 0);
                h50.u(composerImplT, 2058660585, -2137368960, 1319246300);
                zr0 zr0Var15 = zr0Var2;
                zr0Var15.invoke(composerImplT, Integer.valueOf((i3 >> 6) & 14));
                z5 = false;
                composerImplT.R(false);
                composerImplT.R(false);
                z4 = true;
                nj.z(composerImplT, false, true, false, false);
                zr0Var6 = zr0Var15;
            } else {
                zr0Var6 = zr0Var2;
                z4 = true;
            }
            composerImplT.R(z5);
            Modifier modifierN4 = LayoutIdKt.b(companion, "TextField").N(modifierH);
            composerImplT.B(733328855);
            MeasurePolicy measurePolicyC4 = BoxKt.c(biasAlignment2, z4, composerImplT);
            composerImplT.B(-1323940314);
            Density density5 = (Density) composerImplT.v(staticProvidableCompositionLocal3);
            LayoutDirection layoutDirection6 = (LayoutDirection) composerImplT.v(staticProvidableCompositionLocal2);
            ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerImplT.v(staticProvidableCompositionLocal);
            ComposableLambdaImpl composableLambdaImplA5 = LayoutKt.a(modifierN4);
            composerImplT.g();
            if (composerImplT.K) {
                composerImplT.E(sr0Var);
            } else {
                composerImplT.d();
            }
            composerImplT.x = false;
            Updater.a(zr0Var10, composerImplT, measurePolicyC4);
            Updater.a(zr0Var11, composerImplT, density5);
            Updater.a(zr0Var12, composerImplT, layoutDirection6);
            composableLambdaImplA5.invoke(h50.g(composerImplT, viewConfiguration5, zr0Var13, composerImplT), composerImplT, 0);
            h50.u(composerImplT, 2058660585, -2137368960, -2048931960);
            zr0 zr0Var16 = zr0Var;
            zr0Var16.invoke(composerImplT, Integer.valueOf((i3 >> 3) & 14));
            composerImplT.R(false);
            composerImplT.R(false);
            nj.z(composerImplT, false, true, false, false);
            nj.z(composerImplT, false, false, true, false);
            zr0Var8 = zr0Var16;
            zr0Var7 = zr0Var6;
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new TextFieldKt$TextFieldLayout$2(modifier, zr0Var8, zr0Var7, as0Var, zr0Var3, zr0Var4, z, f, paddingValues, i);
    }

    public static final int b(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, PaddingValues paddingValues) {
        float f2 = 4.0f * f;
        float b = paddingValues.getB() * f;
        float d = paddingValues.getD() * f;
        int iMax = Math.max(i, i5);
        return Math.max(rd1.p(z ? i2 + f2 + iMax + d : b + iMax + d), Math.max(Math.max(i3, i4), Constraints.i(j)));
    }
}
