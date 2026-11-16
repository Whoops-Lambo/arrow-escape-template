package androidx.compose.foundation.lazy;

import androidx.compose.foundation.MutatePriority;
import defpackage.fy;
import defpackage.t50;
import defpackage.ul2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@t50(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {257, 258}, m = "scroll")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class LazyListState$scroll$1 extends fy {
    public LazyListState r;
    public MutatePriority s;
    public ul2 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ LazyListState v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$scroll$1(LazyListState lazyListState, fy fyVar) {
        super(fyVar);
        this.v = lazyListState;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(null, null, this);
    }
}
