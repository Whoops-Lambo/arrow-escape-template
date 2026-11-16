package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector2D;", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)Landroidx/compose/animation/core/AnimationVector2D;"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1 extends rc1 implements wr0 {
    public static final SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1 i = new SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1(1);

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        long j = ((Offset) obj).a;
        return OffsetKt.c(j) ? new AnimationVector2D(Offset.c(j), Offset.d(j)) : SelectionMagnifierKt.a;
    }
}
