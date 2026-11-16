package androidx.datastore.core;

import com.explorestack.protobuf.openrtb.LossReason;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@t50(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", l = {LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 47, 48}, m = "lock")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class MultiProcessCoordinator$lock$1<T> extends fy {
    public Object r;
    public Object s;
    public Object t;
    public /* synthetic */ Object u;
    public final /* synthetic */ MultiProcessCoordinator v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$lock$1(MultiProcessCoordinator multiProcessCoordinator, fy fyVar) {
        super(fyVar);
        this.v = multiProcessCoordinator;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.e(null, this);
    }
}
