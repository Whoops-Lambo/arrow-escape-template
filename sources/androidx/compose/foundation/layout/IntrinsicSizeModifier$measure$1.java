package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Laz2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class IntrinsicSizeModifier$measure$1 extends rc1 implements wr0 {
    public final /* synthetic */ Placeable i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntrinsicSizeModifier$measure$1(Placeable placeable) {
        super(1);
        this.i = placeable;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        placementScope.getClass();
        long j = IntOffset.b;
        LayoutDirection layoutDirectionA = placementScope.a();
        LayoutDirection layoutDirection = LayoutDirection.a;
        Placeable placeable = this.i;
        if (layoutDirectionA == layoutDirection || placementScope.b() == 0) {
            long jL0 = placeable.l0();
            placeable.t0(IntOffsetKt.a(((int) (j >> 32)) + ((int) (jL0 >> 32)), ((int) (j & 4294967295L)) + ((int) (jL0 & 4294967295L))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
        } else {
            long jA = IntOffsetKt.a((placementScope.b() - ((int) (placeable.c >> 32))) - ((int) (j >> 32)), (int) (j & 4294967295L));
            long jL1 = placeable.l0();
            placeable.t0(IntOffsetKt.a(((int) (jA >> 32)) + ((int) (jL1 >> 32)), ((int) (jA & 4294967295L)) + ((int) (jL1 & 4294967295L))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
        }
        return az2.a;
    }
}
