package androidx.compose.foundation.gestures;

import com.unity3d.services.UnityAdsConstants;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@t50(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {378, 383, 385, 387, 393}, m = "onDragStopped")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ScrollingLogic$onDragStopped$1 extends fy {
    public Object r;
    public Object s;
    public float t;
    public long u;
    public /* synthetic */ Object v;
    public final /* synthetic */ ScrollingLogic w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onDragStopped$1(ScrollingLogic scrollingLogic, fy fyVar) {
        super(fyVar);
        this.w = scrollingLogic;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this);
    }
}
