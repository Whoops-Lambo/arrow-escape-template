package androidx.compose.material;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class TabKt$TabBaselineLayout$2$measure$1 extends rc1 implements wr0 {
    public final /* synthetic */ Placeable i;
    public final /* synthetic */ Placeable j;
    public final /* synthetic */ MeasureScope k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ Integer o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabKt$TabBaselineLayout$2$measure$1(Placeable placeable, Placeable placeable2, MeasureScope measureScope, int i, int i2, Integer num, Integer num2) {
        super(1);
        this.i = placeable;
        this.j = placeable2;
        this.k = measureScope;
        this.l = i;
        this.m = i2;
        this.n = num;
        this.o = num2;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        placementScope.getClass();
        Placeable placeable = this.j;
        int i = this.m;
        Placeable placeable2 = this.i;
        if (placeable2 != null && placeable != null) {
            Integer num = this.n;
            num.getClass();
            int iIntValue = num.intValue();
            Integer num2 = this.o;
            num2.getClass();
            int iIntValue2 = num2.intValue();
            int i2 = TabKt.b;
            float f = iIntValue == iIntValue2 ? 14.0f : 6.0f;
            MeasureScope measureScope = this.k;
            int iMo1roundToPx0680j_4 = measureScope.mo1roundToPx0680j_4(2.0f) + measureScope.mo1roundToPx0680j_4(f);
            int iMo0roundToPxR2X_6o = (measureScope.mo0roundToPxR2X_6o(TabKt.a) + placeable.b) - iIntValue;
            int i3 = placeable2.a;
            int i4 = this.l;
            int i5 = (i - iIntValue2) - iMo1roundToPx0680j_4;
            Placeable.PlacementScope.e(placementScope, placeable2, (i4 - i3) / 2, i5);
            Placeable.PlacementScope.e(placementScope, placeable, (i4 - placeable.a) / 2, i5 - iMo0roundToPxR2X_6o);
        } else if (placeable2 != null) {
            int i6 = TabKt.b;
            Placeable.PlacementScope.e(placementScope, placeable2, 0, (i - placeable2.b) / 2);
        } else if (placeable != null) {
            int i7 = TabKt.b;
            Placeable.PlacementScope.e(placementScope, placeable, 0, (i - placeable.b) / 2);
        }
        return az2.a;
    }
}
