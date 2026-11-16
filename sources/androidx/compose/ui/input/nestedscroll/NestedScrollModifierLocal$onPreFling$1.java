package androidx.compose.ui.input.nestedscroll;

import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@t50(c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", f = "NestedScrollModifierLocal.kt", l = {88, 89}, m = "onPreFling-QWom1Mo")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class NestedScrollModifierLocal$onPreFling$1 extends fy {
    public NestedScrollModifierLocal r;
    public long s;
    public /* synthetic */ Object t;
    public final /* synthetic */ NestedScrollModifierLocal u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollModifierLocal$onPreFling$1(NestedScrollModifierLocal nestedScrollModifierLocal, fy fyVar) {
        super(fyVar);
        this.u = nestedScrollModifierLocal;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.e(0L, this);
    }
}
