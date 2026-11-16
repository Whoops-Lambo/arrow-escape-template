package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Dp;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Laz2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class AlignmentLineKt$alignmentLineOffsetMeasure$1 extends rc1 implements wr0 {
    public final /* synthetic */ AlignmentLine i;
    public final /* synthetic */ float j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Placeable n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLineKt$alignmentLineOffsetMeasure$1(AlignmentLine alignmentLine, float f, int i, int i2, int i3, Placeable placeable, int i4) {
        super(1);
        this.i = alignmentLine;
        this.j = f;
        this.k = i;
        this.l = i2;
        this.m = i3;
        this.n = placeable;
        this.o = i4;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        placementScope.getClass();
        boolean z = this.i instanceof HorizontalAlignmentLine;
        Placeable placeable = this.n;
        int i2 = this.m;
        int i3 = this.k;
        float f = this.j;
        if (z) {
            i = 0;
        } else {
            i = !Dp.a(f, Float.NaN) ? i3 : (this.l - i2) - placeable.a;
        }
        if (!z) {
            i3 = 0;
        } else if (Dp.a(f, Float.NaN)) {
            i3 = (this.o - i2) - placeable.b;
        }
        Placeable.PlacementScope.e(placementScope, placeable, i, i3);
        return az2.a;
    }
}
