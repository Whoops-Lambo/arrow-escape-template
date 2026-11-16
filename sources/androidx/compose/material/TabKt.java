package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;
import defpackage.hg0;
import defpackage.nj;
import defpackage.s71;
import defpackage.sr0;
import defpackage.vq2;
import defpackage.zr0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TabKt {
    public static final long a = TextUnitKt.c(20);
    public static final /* synthetic */ int b = 0;

    public static final void a(final zr0 zr0Var, final zr0 zr0Var2, Composer composer, int i) {
        int i2;
        boolean z;
        zr0 zr0Var3;
        boolean z2;
        ComposerImpl composerImplT = composer.t(1249848471);
        if ((i & 14) == 0) {
            i2 = i | (composerImplT.l(zr0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerImplT.l(zr0Var2) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerImplT.b()) {
            composerImplT.h();
            zr0Var3 = zr0Var2;
        } else {
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final MeasureResult a(MeasureScope measureScope, List list, long j) {
                    Placeable placeableY;
                    Placeable placeableY2;
                    int i3;
                    float f;
                    Integer numValueOf;
                    Measurable measurable;
                    Measurable measurable2;
                    measureScope.getClass();
                    list.getClass();
                    Integer numValueOf2 = null;
                    if (zr0Var != null) {
                        Iterator it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                measurable2 = (Measurable) it.next();
                            } else {
                                vq2.s("Collection contains no element matching the predicate.");
                                return null;
                            }
                        } while (!s71.b(LayoutIdKt.a(measurable2), "text"));
                        placeableY = measurable2.Y(Constraints.a(0, j, 0, 0, 0, 11));
                    } else {
                        placeableY = null;
                    }
                    if (zr0Var2 != null) {
                        Iterator it2 = list.iterator();
                        do {
                            if (it2.hasNext()) {
                                measurable = (Measurable) it2.next();
                            } else {
                                vq2.s("Collection contains no element matching the predicate.");
                                return null;
                            }
                        } while (!s71.b(LayoutIdKt.a(measurable), "icon"));
                        placeableY2 = measurable.Y(j);
                    } else {
                        placeableY2 = null;
                    }
                    int i4 = 0;
                    if (placeableY != null) {
                        i3 = placeableY.a;
                    } else {
                        i3 = 0;
                    }
                    if (placeableY2 != null) {
                        i4 = placeableY2.a;
                    }
                    int iMax = Math.max(i3, i4);
                    if (placeableY != null && placeableY2 != null) {
                        int i5 = TabKt.b;
                        f = 72.0f;
                    } else {
                        int i6 = TabKt.b;
                        f = 48.0f;
                    }
                    int iMo1roundToPx0680j_4 = measureScope.mo1roundToPx0680j_4(f);
                    if (placeableY != null) {
                        numValueOf = Integer.valueOf(placeableY.f0(AlignmentLineKt.a));
                    } else {
                        numValueOf = null;
                    }
                    if (placeableY != null) {
                        numValueOf2 = Integer.valueOf(placeableY.f0(AlignmentLineKt.b));
                    }
                    return measureScope.C(iMax, iMo1roundToPx0680j_4, hg0.a, new TabKt$TabBaselineLayout$2$measure$1(placeableY, placeableY2, measureScope, iMax, iMo1roundToPx0680j_4, numValueOf, numValueOf2));
                }
            };
            composerImplT.B(-1323940314);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.e;
            Density density = (Density) composerImplT.v(staticProvidableCompositionLocal);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = CompositionLocalsKt.k;
            LayoutDirection layoutDirection = (LayoutDirection) composerImplT.v(staticProvidableCompositionLocal2);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = CompositionLocalsKt.o;
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerImplT.v(staticProvidableCompositionLocal3);
            ComposeUiNode.X8.getClass();
            sr0 sr0Var = ComposeUiNode.Companion.b;
            Modifier.Companion companion = Modifier.Companion.a;
            ComposableLambdaImpl composableLambdaImplA = LayoutKt.a(companion);
            composerImplT.g();
            int i3 = i2;
            if (composerImplT.K) {
                composerImplT.E(sr0Var);
            } else {
                composerImplT.d();
            }
            composerImplT.x = false;
            zr0 zr0Var4 = ComposeUiNode.Companion.e;
            Updater.a(zr0Var4, composerImplT, measurePolicy);
            zr0 zr0Var5 = ComposeUiNode.Companion.d;
            Updater.a(zr0Var5, composerImplT, density);
            zr0 zr0Var6 = ComposeUiNode.Companion.f;
            Updater.a(zr0Var6, composerImplT, layoutDirection);
            zr0 zr0Var7 = ComposeUiNode.Companion.g;
            composableLambdaImplA.invoke(h50.g(composerImplT, viewConfiguration, zr0Var7, composerImplT), composerImplT, 0);
            h50.u(composerImplT, 2058660585, 1142473408, -2141028452);
            BiasAlignment biasAlignment = Alignment.Companion.a;
            if (zr0Var != null) {
                Modifier modifierG = PaddingKt.g(LayoutIdKt.b(companion, "text"), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                composerImplT.B(733328855);
                MeasurePolicy measurePolicyC = BoxKt.c(biasAlignment, false, composerImplT);
                composerImplT.B(-1323940314);
                Density density2 = (Density) composerImplT.v(staticProvidableCompositionLocal);
                LayoutDirection layoutDirection2 = (LayoutDirection) composerImplT.v(staticProvidableCompositionLocal2);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerImplT.v(staticProvidableCompositionLocal3);
                ComposableLambdaImpl composableLambdaImplA2 = LayoutKt.a(modifierG);
                composerImplT.g();
                if (composerImplT.K) {
                    composerImplT.E(sr0Var);
                } else {
                    composerImplT.d();
                }
                composerImplT.x = false;
                Updater.a(zr0Var4, composerImplT, measurePolicyC);
                Updater.a(zr0Var5, composerImplT, density2);
                Updater.a(zr0Var6, composerImplT, layoutDirection2);
                composableLambdaImplA2.invoke(h50.g(composerImplT, viewConfiguration2, zr0Var7, composerImplT), composerImplT, 0);
                h50.u(composerImplT, 2058660585, -2137368960, -459869377);
                zr0Var.invoke(composerImplT, Integer.valueOf(i3 & 14));
                z = false;
                composerImplT.R(false);
                composerImplT.R(false);
                nj.z(composerImplT, false, true, false, false);
            } else {
                z = false;
            }
            composerImplT.R(z);
            if (zr0Var2 != null) {
                Modifier modifierB = LayoutIdKt.b(companion, "icon");
                composerImplT.B(733328855);
                MeasurePolicy measurePolicyC2 = BoxKt.c(biasAlignment, z, composerImplT);
                composerImplT.B(-1323940314);
                Density density3 = (Density) composerImplT.v(staticProvidableCompositionLocal);
                LayoutDirection layoutDirection3 = (LayoutDirection) composerImplT.v(staticProvidableCompositionLocal2);
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerImplT.v(staticProvidableCompositionLocal3);
                ComposableLambdaImpl composableLambdaImplA3 = LayoutKt.a(modifierB);
                composerImplT.g();
                if (composerImplT.K) {
                    composerImplT.E(sr0Var);
                } else {
                    composerImplT.d();
                }
                composerImplT.x = false;
                Updater.a(zr0Var4, composerImplT, measurePolicyC2);
                Updater.a(zr0Var5, composerImplT, density3);
                Updater.a(zr0Var6, composerImplT, layoutDirection3);
                composableLambdaImplA3.invoke(h50.g(composerImplT, viewConfiguration3, zr0Var7, composerImplT), composerImplT, 0);
                h50.u(composerImplT, 2058660585, -2137368960, 892169960);
                zr0Var3 = zr0Var2;
                zr0Var3.invoke(composerImplT, Integer.valueOf((i3 >> 3) & 14));
                z = false;
                composerImplT.R(false);
                composerImplT.R(false);
                z2 = true;
                nj.z(composerImplT, false, true, false, false);
            } else {
                zr0Var3 = zr0Var2;
                z2 = true;
            }
            nj.z(composerImplT, z, z, z2, z);
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new TabKt$TabBaselineLayout$3(zr0Var, zr0Var3, i);
    }
}
