package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/IgnorePointerDraggableState;", "Landroidx/compose/foundation/gestures/PointerAwareDraggableState;", "Landroidx/compose/foundation/gestures/PointerAwareDragScope;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class IgnorePointerDraggableState implements PointerAwareDraggableState, PointerAwareDragScope {
    public final DraggableState a;
    public DragScope b;

    @Override // androidx.compose.foundation.gestures.PointerAwareDragScope
    public final void a(long j, float f) {
        DragScope dragScope = this.b;
        if (dragScope != null) {
            dragScope.a(f);
        }
    }

    @Override // androidx.compose.foundation.gestures.PointerAwareDraggableState
    public final Object b(zr0 zr0Var, dy dyVar) {
        Object objB = this.a.b(MutatePriority.b, new IgnorePointerDraggableState$drag$2(this, zr0Var, null), dyVar);
        return objB == dz.a ? objB : az2.a;
    }

    public IgnorePointerDraggableState(DraggableState draggableState) {
        draggableState.getClass();
        this.a = draggableState;
    }
}
