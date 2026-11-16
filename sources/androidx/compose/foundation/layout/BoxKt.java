package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;
import defpackage.nj;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class BoxKt {
    public static final MeasurePolicy a = new BoxKt$boxMeasurePolicy$1(false, Alignment.Companion.a);
    public static final MeasurePolicy b = BoxKt$EmptyBoxMeasurePolicy$1.a;

    public static final void a(Modifier modifier, Composer composer, int i) {
        int i2;
        modifier.getClass();
        ComposerImpl composerImplT = composer.t(-211209833);
        if (composerImplT.l(modifier)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        if (((i2 | i) & 11) == 2 && composerImplT.b()) {
            composerImplT.h();
        } else {
            composerImplT.B(-1323940314);
            Density density = (Density) composerImplT.v(CompositionLocalsKt.e);
            LayoutDirection layoutDirection = (LayoutDirection) composerImplT.v(CompositionLocalsKt.k);
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerImplT.v(CompositionLocalsKt.o);
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
            Updater.a(ComposeUiNode.Companion.e, composerImplT, b);
            Updater.a(ComposeUiNode.Companion.d, composerImplT, density);
            Updater.a(ComposeUiNode.Companion.f, composerImplT, layoutDirection);
            nj.u(0, composableLambdaImplA, h50.g(composerImplT, viewConfiguration, ComposeUiNode.Companion.g, composerImplT), composerImplT, 2058660585);
            composerImplT.B(1021196736);
            composerImplT.R(false);
            composerImplT.R(false);
            composerImplT.R(true);
            composerImplT.R(false);
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new BoxKt$Box$3(modifier, i);
    }

    public static final void b(Placeable.PlacementScope placementScope, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int i, int i2, Alignment alignment) {
        BoxChildData boxChildData;
        Alignment alignment2;
        Alignment alignment3;
        Object objA = measurable.a();
        if (objA instanceof BoxChildData) {
            boxChildData = (BoxChildData) objA;
        } else {
            boxChildData = null;
        }
        if (boxChildData != null && (alignment3 = boxChildData.b) != null) {
            alignment2 = alignment3;
        } else {
            alignment2 = alignment;
        }
        long jA = alignment2.a(IntSizeKt.a(placeable.a, placeable.b), IntSizeKt.a(i, i2), layoutDirection);
        placementScope.getClass();
        Placeable.PlacementScope.d(placeable, jA, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static final MeasurePolicy c(Alignment alignment, boolean z, Composer composer) {
        MeasurePolicy measurePolicy;
        alignment.getClass();
        composer.B(56522820);
        if (alignment.equals(Alignment.Companion.a) && !z) {
            measurePolicy = a;
        } else {
            Boolean boolValueOf = Boolean.valueOf(z);
            composer.B(511388516);
            boolean zL = composer.l(boolValueOf) | composer.l(alignment);
            Object objC = composer.C();
            if (zL || objC == Composer.Companion.a) {
                objC = new BoxKt$boxMeasurePolicy$1(z, alignment);
                composer.x(objC);
            }
            composer.J();
            measurePolicy = (MeasurePolicy) objC;
        }
        composer.J();
        return measurePolicy;
    }
}
