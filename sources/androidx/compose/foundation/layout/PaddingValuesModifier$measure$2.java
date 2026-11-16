package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Laz2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class PaddingValuesModifier$measure$2 extends rc1 implements wr0 {
    public final /* synthetic */ Placeable i;
    public final /* synthetic */ MeasureScope j;
    public final /* synthetic */ PaddingValuesModifier k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingValuesModifier$measure$2(Placeable placeable, MeasureScope measureScope, PaddingValuesModifier paddingValuesModifier) {
        super(1);
        this.i = placeable;
        this.j = measureScope;
        this.k = paddingValuesModifier;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((Placeable.PlacementScope) obj).getClass();
        PaddingValues paddingValues = this.k.b;
        MeasureScope measureScope = this.j;
        Placeable.PlacementScope.c(this.i, measureScope.mo1roundToPx0680j_4(paddingValues.b(measureScope.getA())), measureScope.mo1roundToPx0680j_4(paddingValues.getB()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return az2.a;
    }
}
