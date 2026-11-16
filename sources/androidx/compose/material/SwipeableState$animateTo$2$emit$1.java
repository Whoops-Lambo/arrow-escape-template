package androidx.compose.material;

import defpackage.dy;
import defpackage.fy;
import defpackage.t50;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@t50(c = "androidx.compose.material.SwipeableState$animateTo$2", f = "Swipeable.kt", l = {335}, m = "emit")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class SwipeableState$animateTo$2$emit$1 extends fy {
    public Object r;
    public Map s;
    public /* synthetic */ Object t;
    public final /* synthetic */ SwipeableState$animateTo$2 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$animateTo$2$emit$1(SwipeableState$animateTo$2 swipeableState$animateTo$2, dy dyVar) {
        super(dyVar);
        this.u = swipeableState$animateTo$2;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.emit(null, this);
    }
}
