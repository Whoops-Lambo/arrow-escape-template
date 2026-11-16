package androidx.compose.ui.input.nestedscroll;

import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@t50(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {202}, m = "dispatchPreFling-QWom1Mo")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class NestedScrollDispatcher$dispatchPreFling$1 extends fy {
    public /* synthetic */ Object r;
    public final /* synthetic */ NestedScrollDispatcher s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPreFling$1(NestedScrollDispatcher nestedScrollDispatcher, fy fyVar) {
        super(fyVar);
        this.s = nestedScrollDispatcher;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.b(0L, this);
    }
}
