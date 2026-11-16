package androidx.compose.material;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "intrinsicMeasurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "w", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class TextFieldMeasurePolicy$minIntrinsicHeight$1 extends rc1 implements zr0 {
    public static final TextFieldMeasurePolicy$minIntrinsicHeight$1 i = new TextFieldMeasurePolicy$minIntrinsicHeight$1(2);

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj;
        int iIntValue = ((Number) obj2).intValue();
        intrinsicMeasurable.getClass();
        return Integer.valueOf(intrinsicMeasurable.F(iIntValue));
    }
}
