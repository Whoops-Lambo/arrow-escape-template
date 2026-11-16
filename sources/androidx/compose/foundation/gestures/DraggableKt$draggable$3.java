package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composer;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/gestures/PointerAwareDraggableState;", "invoke", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/PointerAwareDraggableState;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class DraggableKt$draggable$3 extends rc1 implements zr0 {
    public final /* synthetic */ DraggableState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableKt$draggable$3(DraggableState draggableState) {
        super(2);
        this.i = draggableState;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        composer.B(830271906);
        composer.B(1157296644);
        DraggableState draggableState = this.i;
        boolean zL = composer.l(draggableState);
        Object objC = composer.C();
        if (zL || objC == Composer.Companion.a) {
            objC = new IgnorePointerDraggableState(draggableState);
            composer.x(objC);
        }
        composer.J();
        IgnorePointerDraggableState ignorePointerDraggableState = (IgnorePointerDraggableState) objC;
        composer.J();
        return ignorePointerDraggableState;
    }
}
