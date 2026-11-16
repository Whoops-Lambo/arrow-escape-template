package androidx.compose.foundation.gestures;

import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@t50(c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", f = "Scrollable.kt", l = {477}, m = "onPostFling-RZ2iAVY")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 extends fy {
    public long r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ScrollableKt$scrollableNestedScrollConnection$1 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(ScrollableKt$scrollableNestedScrollConnection$1 scrollableKt$scrollableNestedScrollConnection$1, fy fyVar) {
        super(fyVar);
        this.t = scrollableKt$scrollableNestedScrollConnection$1;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.d(0L, 0L, this);
    }
}
