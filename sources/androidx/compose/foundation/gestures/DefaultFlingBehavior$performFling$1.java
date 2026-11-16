package androidx.compose.foundation.gestures;

import com.unity3d.services.UnityAdsConstants;
import defpackage.fy;
import defpackage.j32;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@t50(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior", f = "Scrollable.kt", l = {496}, m = "performFling")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class DefaultFlingBehavior$performFling$1 extends fy {
    public j32 r;
    public /* synthetic */ Object s;
    public final /* synthetic */ DefaultFlingBehavior t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$1(DefaultFlingBehavior defaultFlingBehavior, fy fyVar) {
        super(fyVar);
        this.t = defaultFlingBehavior;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this);
    }
}
