package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.az2;
import defpackage.cs0;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "totalSize", "", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "<anonymous parameter 2>", "Landroidx/compose/ui/unit/Density;", "density", "outPosition", "Laz2;", "invoke", "(I[ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;[I)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class ColumnKt$DefaultColumnMeasurePolicy$1 extends rc1 implements cs0 {
    public static final ColumnKt$DefaultColumnMeasurePolicy$1 i = new ColumnKt$DefaultColumnMeasurePolicy$1(5);

    @Override // defpackage.cs0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Number) obj).intValue();
        int[] iArr = (int[]) obj2;
        int[] iArr2 = (int[]) obj5;
        iArr.getClass();
        ((LayoutDirection) obj3).getClass();
        ((Density) obj4).getClass();
        iArr2.getClass();
        Arrangement.b(iArr, iArr2, false);
        return az2.a;
    }
}
