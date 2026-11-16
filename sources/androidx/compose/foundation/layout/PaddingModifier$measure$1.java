package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Laz2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class PaddingModifier$measure$1 extends rc1 implements wr0 {
    public final /* synthetic */ PaddingModifier i;
    public final /* synthetic */ Placeable j;
    public final /* synthetic */ MeasureScope k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingModifier$measure$1(PaddingModifier paddingModifier, Placeable placeable, MeasureScope measureScope) {
        super(1);
        this.i = paddingModifier;
        this.j = placeable;
        this.k = measureScope;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        placementScope.getClass();
        PaddingModifier paddingModifier = this.i;
        boolean z = paddingModifier.f;
        float f = paddingModifier.c;
        float f2 = paddingModifier.b;
        MeasureScope measureScope = this.k;
        Placeable placeable = this.j;
        if (z) {
            Placeable.PlacementScope.e(placementScope, placeable, measureScope.mo1roundToPx0680j_4(f2), measureScope.mo1roundToPx0680j_4(f));
        } else {
            Placeable.PlacementScope.c(placeable, measureScope.mo1roundToPx0680j_4(f2), measureScope.mo1roundToPx0680j_4(f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return az2.a;
    }
}
