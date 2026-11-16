package androidx.compose.foundation.gestures;

import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.t50;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@t50(c = "androidx.compose.foundation.gestures.IgnorePointerDraggableState$drag$2", f = "Draggable.kt", l = {478}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/DragScope;", "Laz2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/DragScope;)V"}, k = 3, mv = {1, 6, 0})
final class IgnorePointerDraggableState$drag$2 extends ul2 implements zr0 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ IgnorePointerDraggableState t;
    public final /* synthetic */ zr0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgnorePointerDraggableState$drag$2(IgnorePointerDraggableState ignorePointerDraggableState, zr0 zr0Var, dy dyVar) {
        super(2, dyVar);
        this.t = ignorePointerDraggableState;
        this.u = zr0Var;
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        IgnorePointerDraggableState$drag$2 ignorePointerDraggableState$drag$2 = new IgnorePointerDraggableState$drag$2(this.t, this.u, dyVar);
        ignorePointerDraggableState$drag$2.s = obj;
        return ignorePointerDraggableState$drag$2;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        return ((IgnorePointerDraggableState$drag$2) create((DragScope) obj, (dy) obj2)).invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        if (i == 0) {
            wz2.a0(obj);
            DragScope dragScope = (DragScope) this.s;
            IgnorePointerDraggableState ignorePointerDraggableState = this.t;
            ignorePointerDraggableState.b = dragScope;
            this.r = 1;
            Object objInvoke = ((DraggableKt$draggable$9.AnonymousClass2.C00092) this.u).invoke(ignorePointerDraggableState, this);
            dz dzVar = dz.a;
            if (objInvoke == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj);
        }
        return az2.a;
    }
}
