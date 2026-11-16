package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.media3.exoplayer.upstream.CmcdData;
import defpackage.as0;
import defpackage.rc1;
import defpackage.zr0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "availableHeight", "mainAxisSpacing", "invoke", "(Ljava/util/List;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class IntrinsicMeasureBlocks$VerticalMinWidth$1 extends rc1 implements as0 {
    public static final IntrinsicMeasureBlocks$VerticalMinWidth$1 i = new IntrinsicMeasureBlocks$VerticalMinWidth$1(3);

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", CmcdData.STREAMING_FORMAT_HLS, "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements zr0 {
        public static final AnonymousClass1 i = new AnonymousClass1(2);

        @Override // defpackage.zr0
        public final Object invoke(Object obj, Object obj2) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj;
            int iIntValue = ((Number) obj2).intValue();
            intrinsicMeasurable.getClass();
            return Integer.valueOf(intrinsicMeasurable.N(iIntValue));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "w", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass2 extends rc1 implements zr0 {
        public static final AnonymousClass2 i = new AnonymousClass2(2);

        @Override // defpackage.zr0
        public final Object invoke(Object obj, Object obj2) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj;
            int iIntValue = ((Number) obj2).intValue();
            intrinsicMeasurable.getClass();
            return Integer.valueOf(intrinsicMeasurable.p(iIntValue));
        }
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        list.getClass();
        return Integer.valueOf(RowColumnImplKt.a(list, AnonymousClass1.i, AnonymousClass2.i, iIntValue, iIntValue2, LayoutOrientation.b, LayoutOrientation.a));
    }
}
