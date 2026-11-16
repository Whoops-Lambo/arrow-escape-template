package androidx.compose.animation;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1 extends rc1 implements wr0 {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1(int i) {
        super(1);
        this.i = i;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj;
        intrinsicMeasurable.getClass();
        return Integer.valueOf(intrinsicMeasurable.F(this.i));
    }
}
