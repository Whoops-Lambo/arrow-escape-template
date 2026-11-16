package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import defpackage.az2;
import defpackage.f92;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "event", "Laz2;", "invoke", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class DraggableKt$awaitDrag$dragTick$1 extends rc1 implements wr0 {
    public final /* synthetic */ VelocityTracker i;
    public final /* synthetic */ Orientation j;
    public final /* synthetic */ f92 k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableKt$awaitDrag$dragTick$1(VelocityTracker velocityTracker, Orientation orientation, f92 f92Var, boolean z) {
        super(1);
        this.i = velocityTracker;
        this.j = orientation;
        this.k = f92Var;
        this.l = z;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        pointerInputChange.getClass();
        VelocityTrackerKt.b(this.i, pointerInputChange);
        long jG = PointerEventKt.g(pointerInputChange, false);
        float fD = this.j == Orientation.a ? Offset.d(jG) : Offset.c(jG);
        pointerInputChange.a();
        if (this.l) {
            fD *= -1.0f;
        }
        this.k.c(new DragEvent.DragDelta(pointerInputChange.c, fD));
        return az2.a;
    }
}
