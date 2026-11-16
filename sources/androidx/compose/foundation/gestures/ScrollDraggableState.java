package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import defpackage.fy;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollDraggableState;", "Landroidx/compose/foundation/gestures/PointerAwareDraggableState;", "Landroidx/compose/foundation/gestures/PointerAwareDragScope;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class ScrollDraggableState implements PointerAwareDraggableState, PointerAwareDragScope {
    public final MutableState a;
    public ScrollScope b = ScrollableKt.a;

    @Override // androidx.compose.foundation.gestures.PointerAwareDragScope
    public final void a(long j, float f) {
        ScrollingLogic scrollingLogic = (ScrollingLogic) this.a.getA();
        scrollingLogic.a(this.b, scrollingLogic.e(f), new Offset(j), 1);
    }

    @Override // androidx.compose.foundation.gestures.PointerAwareDraggableState
    public final Object b(zr0 zr0Var, dy dyVar) {
        Object objC = ((ScrollingLogic) this.a.getA()).d.c(MutatePriority.b, new ScrollDraggableState$drag$2(this, zr0Var, null), (fy) dyVar);
        return objC == dz.a ? objC : az2.a;
    }

    public ScrollDraggableState(MutableState mutableState) {
        this.a = mutableState;
    }
}
