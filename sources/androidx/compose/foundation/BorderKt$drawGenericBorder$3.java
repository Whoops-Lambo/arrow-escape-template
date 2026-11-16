package androidx.compose.foundation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.m32;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Laz2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class BorderKt$drawGenericBorder$3 extends rc1 implements wr0 {
    public final /* synthetic */ Rect i;
    public final /* synthetic */ m32 j;
    public final /* synthetic */ long k;
    public final /* synthetic */ ColorFilter l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderKt$drawGenericBorder$3(Rect rect, m32 m32Var, long j, ColorFilter colorFilter) {
        super(1);
        this.i = rect;
        this.j = m32Var;
        this.k = j;
        this.l = colorFilter;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        contentDrawScope.getClass();
        contentDrawScope.W();
        Rect rect = this.i;
        float f = rect.a;
        float f2 = rect.b;
        contentDrawScope.getB().a.d(f, f2);
        DrawScope.u(contentDrawScope, (ImageBitmap) this.j.a, 0L, this.k, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, this.l, 0, 0, 890);
        contentDrawScope.getB().a.d(-f, -f2);
        return az2.a;
    }
}
