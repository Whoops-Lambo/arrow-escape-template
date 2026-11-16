package androidx.compose.foundation.gestures;

import defpackage.fy;
import defpackage.l32;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@t50(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {399}, m = "doFlingAnimation-QWom1Mo")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ScrollingLogic$doFlingAnimation$1 extends fy {
    public l32 r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ScrollingLogic t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$1(ScrollingLogic scrollingLogic, fy fyVar) {
        super(fyVar);
        this.t = scrollingLogic;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.b(0L, this);
    }
}
