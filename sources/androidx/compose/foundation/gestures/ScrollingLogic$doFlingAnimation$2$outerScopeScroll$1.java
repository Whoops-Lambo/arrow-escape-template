package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "delta", "invoke-MK-Hz9U", "(J)J"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1 extends rc1 implements wr0 {
    public final /* synthetic */ ScrollingLogic i;
    public final /* synthetic */ ScrollScope j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1(ScrollingLogic scrollingLogic, ScrollScope scrollScope) {
        super(1);
        this.i = scrollingLogic;
        this.j = scrollScope;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        long j = ((Offset) obj).a;
        ScrollingLogic scrollingLogic = this.i;
        boolean z = scrollingLogic.b;
        long jA = scrollingLogic.a(this.j, z ? Offset.g(j, -1.0f) : j, null, 2);
        if (z) {
            jA = Offset.g(jA, -1.0f);
        }
        return new Offset(Offset.e(j, jA));
    }
}
