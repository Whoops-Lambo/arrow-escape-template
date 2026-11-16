package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.az2;
import defpackage.cs0;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ColumnKt$columnMeasurePolicy$1$1 extends rc1 implements cs0 {
    public final /* synthetic */ Arrangement.Vertical i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColumnKt$columnMeasurePolicy$1$1(Arrangement.Vertical vertical) {
        super(5);
        this.i = vertical;
    }

    @Override // defpackage.cs0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = (int[]) obj2;
        Density density = (Density) obj4;
        int[] iArr2 = (int[]) obj5;
        iArr.getClass();
        ((LayoutDirection) obj3).getClass();
        density.getClass();
        iArr2.getClass();
        this.i.c(density, iIntValue, iArr, iArr2);
        return az2.a;
    }
}
