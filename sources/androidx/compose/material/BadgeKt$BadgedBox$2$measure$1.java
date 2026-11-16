package androidx.compose.material;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class BadgeKt$BadgedBox$2$measure$1 extends rc1 implements wr0 {
    public final /* synthetic */ Placeable i;
    public final /* synthetic */ MeasureScope j;
    public final /* synthetic */ Placeable k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeKt$BadgedBox$2$measure$1(Placeable placeable, MeasureScope measureScope, Placeable placeable2) {
        super(1);
        this.i = placeable;
        this.j = measureScope;
        this.k = placeable2;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        placementScope.getClass();
        Placeable placeable = this.i;
        int i = placeable.a;
        float f = BadgeKt.b;
        MeasureScope measureScope = this.j;
        float f2 = i > measureScope.mo1roundToPx0680j_4(4.0f) * 2 ? BadgeKt.b : BadgeKt.c;
        Placeable placeable2 = this.k;
        Placeable.PlacementScope.e(placementScope, placeable2, 0, 0);
        Placeable.PlacementScope.e(placementScope, placeable, measureScope.mo1roundToPx0680j_4(f2) + placeable2.a, (-placeable.b) / 2);
        return az2.a;
    }
}
