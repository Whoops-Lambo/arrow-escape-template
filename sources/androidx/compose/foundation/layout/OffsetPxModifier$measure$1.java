package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Laz2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class OffsetPxModifier$measure$1 extends rc1 implements wr0 {
    public final /* synthetic */ OffsetPxModifier i;
    public final /* synthetic */ MeasureScope j;
    public final /* synthetic */ Placeable k;

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        placementScope.getClass();
        OffsetPxModifier offsetPxModifier = this.i;
        long j = ((IntOffset) offsetPxModifier.b.invoke(this.j)).a;
        boolean z = offsetPxModifier.c;
        Placeable placeable = this.k;
        if (z) {
            Placeable.PlacementScope.f(placementScope, placeable, (int) (j >> 32), (int) (j & 4294967295L));
        } else {
            Placeable.PlacementScope.h(placementScope, placeable, (int) (j >> 32), (int) (j & 4294967295L), null, 12);
        }
        return az2.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffsetPxModifier$measure$1(OffsetPxModifier offsetPxModifier, MeasureScope measureScope, Placeable placeable) {
        super(1);
        this.i = offsetPxModifier;
        this.j = measureScope;
        this.k = placeable;
    }
}
