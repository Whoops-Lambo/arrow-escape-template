package androidx.compose.material;

import defpackage.fy;
import defpackage.t50;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@t50(c = "androidx.compose.material.SwipeableState", f = "Swipeable.kt", l = {159, 183, 186}, m = "processNewAnchors$material_release")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class SwipeableState$processNewAnchors$1 extends fy {
    public SwipeableState r;
    public Map s;
    public float t;
    public /* synthetic */ Object u;
    public final /* synthetic */ SwipeableState v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$processNewAnchors$1(SwipeableState swipeableState, fy fyVar) {
        super(fyVar);
        this.v = swipeableState;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.f(null, null, this);
    }
}
