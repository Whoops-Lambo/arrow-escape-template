package androidx.compose.material;

import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@t50(c = "androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1", f = "Swipeable.kt", l = {882}, m = "onPostFling-RZ2iAVY")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 extends fy {
    public long r;
    public /* synthetic */ Object s;
    public final /* synthetic */ SwipeableKt$PreUpPostDownNestedScrollConnection$1 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(SwipeableKt$PreUpPostDownNestedScrollConnection$1 swipeableKt$PreUpPostDownNestedScrollConnection$1, fy fyVar) {
        super(fyVar);
        this.t = swipeableKt$PreUpPostDownNestedScrollConnection$1;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.d(0L, 0L, this);
    }
}
