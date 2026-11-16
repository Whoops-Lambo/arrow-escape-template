package androidx.datastore.core;

import defpackage.fy;
import defpackage.pp1;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@t50(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {66, 41}, m = "lock")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class SingleProcessCoordinator$lock$1<T> extends fy {
    public Object r;
    public pp1 s;
    public /* synthetic */ Object t;
    public final /* synthetic */ SingleProcessCoordinator u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessCoordinator$lock$1(SingleProcessCoordinator singleProcessCoordinator, fy fyVar) {
        super(fyVar);
        this.u = singleProcessCoordinator;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.e(null, this);
    }
}
