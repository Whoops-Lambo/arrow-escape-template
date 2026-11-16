package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import com.unity3d.services.UnityAdsConstants;
import defpackage.as0;
import defpackage.az2;
import defpackage.hg0;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2 extends rc1 implements as0 {
    public static final AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2 i = new AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2(3);

    /* JADX INFO: renamed from: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Laz2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    final class AnonymousClass1 extends rc1 implements wr0 {
        public final /* synthetic */ Placeable i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, Placeable placeable) {
            super(1);
            this.i = placeable;
            this.j = i;
        }

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            ((Placeable.PlacementScope) obj).getClass();
            int i = this.j / 2;
            Placeable.PlacementScope.c(this.i, i, i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return az2.a;
        }
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MeasureScope measureScope = (MeasureScope) obj;
        Measurable measurable = (Measurable) obj2;
        long j = ((Constraints) obj3).a;
        measureScope.getClass();
        measurable.getClass();
        Placeable placeableY = measurable.Y(j);
        Modifier modifier = ClipScrollableContainerKt.a;
        int iMo1roundToPx0680j_4 = measureScope.mo1roundToPx0680j_4(60.0f);
        return measureScope.C(placeableY.a + iMo1roundToPx0680j_4, placeableY.b + iMo1roundToPx0680j_4, hg0.a, new AnonymousClass1(iMo1roundToPx0680j_4, placeableY));
    }
}
