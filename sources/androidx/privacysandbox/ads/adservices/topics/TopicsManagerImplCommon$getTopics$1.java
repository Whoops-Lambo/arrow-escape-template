package androidx.privacysandbox.ads.adservices.topics;

import defpackage.dy;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@t50(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", l = {40}, m = "getTopics$suspendImpl")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class TopicsManagerImplCommon$getTopics$1 extends fy {
    public /* synthetic */ Object r;
    public final /* synthetic */ TopicsManagerImplCommon s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicsManagerImplCommon$getTopics$1(TopicsManagerImplCommon topicsManagerImplCommon, dy dyVar) {
        super(dyVar);
        this.s = topicsManagerImplCommon;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return TopicsManagerImplCommon.d(this.s, null, this);
    }
}
