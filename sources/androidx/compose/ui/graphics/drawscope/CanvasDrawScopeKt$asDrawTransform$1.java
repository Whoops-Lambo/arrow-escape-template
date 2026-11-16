package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/graphics/drawscope/CanvasDrawScopeKt$asDrawTransform$1", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CanvasDrawScopeKt$asDrawTransform$1 implements DrawTransform {
    public final /* synthetic */ CanvasDrawScope$drawContext$1 a;

    public final void a(int i, float f, float f2, float f3, float f4) {
        this.a.a().g(i, f, f2, f3, f4);
    }

    public final void b(float f, float f2, float f3, float f4) {
        CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1 = this.a;
        Canvas canvasA = canvasDrawScope$drawContext$1.a();
        long jA = SizeKt.a(Size.d(canvasDrawScope$drawContext$1.b()) - (f3 + f), Size.b(canvasDrawScope$drawContext$1.b()) - (f4 + f2));
        if (Size.d(jA) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Size.b(jA) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            d.r("Width and height must be greater than or equal to zero");
        } else {
            canvasDrawScope$drawContext$1.c(jA);
            canvasA.c(f, f2);
        }
    }

    public final void c(float f, float f2, long j) {
        Canvas canvasA = this.a.a();
        canvasA.c(Offset.c(j), Offset.d(j));
        canvasA.k(f, f2);
        canvasA.c(-Offset.c(j), -Offset.d(j));
    }

    public final void d(float f, float f2) {
        this.a.a().c(f, f2);
    }

    public CanvasDrawScopeKt$asDrawTransform$1(CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1) {
        this.a = canvasDrawScope$drawContext$1;
    }
}
