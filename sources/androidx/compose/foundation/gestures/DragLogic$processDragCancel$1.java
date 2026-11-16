package androidx.compose.foundation.gestures;

import defpackage.cz;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@t50(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {408, 411}, m = "processDragCancel")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class DragLogic$processDragCancel$1 extends fy {
    public Object r;
    public cz s;
    public /* synthetic */ Object t;
    public final /* synthetic */ DragLogic u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragLogic$processDragCancel$1(DragLogic dragLogic, fy fyVar) {
        super(fyVar);
        this.u = dragLogic;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(null, this);
    }
}
