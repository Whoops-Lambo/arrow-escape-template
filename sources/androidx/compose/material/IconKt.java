package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class IconKt {
    public static final Modifier a = SizeKt.i(Modifier.Companion.a, 24.0f);

    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    public static final void a(Painter painter, String str, Modifier modifier, long j, Composer composer, int i) {
        Modifier modifierA;
        painter.getClass();
        ComposerImpl composerImplT = composer.t(-1142959010);
        ColorFilter colorFilterA = Color.c(j, Color.i) ? null : ColorFilter.Companion.a(5, j);
        composerImplT.B(1547385429);
        Modifier modifier2 = Modifier.Companion.a;
        if (str != null) {
            composerImplT.B(1157296644);
            boolean zL = composerImplT.l(str);
            Object objB0 = composerImplT.b0();
            if (zL || objB0 == Composer.Companion.a) {
                objB0 = new IconKt$Icon$semantics$1$1(str);
                composerImplT.C0(objB0);
            }
            composerImplT.R(false);
            modifierA = SemanticsModifierKt.a(modifier2, false, (wr0) objB0);
        } else {
            modifierA = modifier2;
        }
        composerImplT.R(false);
        modifier.getClass();
        wr0 wr0Var = InspectableValueKt.a;
        if (Size.a(painter.getI(), Size.c)) {
            modifier2 = a;
        } else {
            long i2 = painter.getI();
            if (Float.isInfinite(Size.d(i2)) && Float.isInfinite(Size.b(i2))) {
                modifier2 = a;
            }
        }
        BoxKt.a(PainterModifierKt.a(modifier.N(modifier2), painter, null, ContentScale.Companion.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, colorFilterA, 22).N(modifierA), composerImplT, 0);
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new IconKt$Icon$1(painter, str, modifier, j, i);
    }

    public static final void b(ImageVector imageVector, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        composer.B(-800853103);
        if ((i2 & 8) != 0) {
            j = Color.b(((Color) composer.v(ContentColorKt.a)).a, ((Number) composer.v(ContentAlphaKt.a)).floatValue());
        }
        a(VectorPainterKt.b(imageVector, composer), str, modifier, j, composer, (i & 112) | 8 | (i & 896) | (i & 7168));
        composer.J();
    }
}
