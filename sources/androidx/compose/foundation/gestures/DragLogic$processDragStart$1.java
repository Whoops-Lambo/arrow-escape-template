package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.DragInteraction;
import defpackage.cz;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@t50(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {390, 393, 395}, m = "processDragStart")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class DragLogic$processDragStart$1 extends fy {
    public Object r;
    public cz s;
    public DragEvent.DragStarted t;
    public DragInteraction.Start u;
    public /* synthetic */ Object v;
    public final /* synthetic */ DragLogic w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragLogic$processDragStart$1(DragLogic dragLogic, fy fyVar) {
        super(fyVar);
        this.w = dragLogic;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.b(null, null, this);
    }
}
