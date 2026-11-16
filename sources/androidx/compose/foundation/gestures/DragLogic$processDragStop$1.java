package androidx.compose.foundation.gestures;

import defpackage.cz;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@t50(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {400, 403}, m = "processDragStop")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class DragLogic$processDragStop$1 extends fy {
    public Object r;
    public cz s;
    public DragEvent.DragStopped t;
    public /* synthetic */ Object u;
    public final /* synthetic */ DragLogic v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragLogic$processDragStop$1(DragLogic dragLogic, fy fyVar) {
        super(fyVar);
        this.v = dragLogic;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(null, null, this);
    }
}
