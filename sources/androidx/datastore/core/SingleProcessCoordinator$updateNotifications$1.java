package androidx.datastore.core;

import defpackage.az2;
import defpackage.cp0;
import defpackage.dy;
import defpackage.t50;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@t50(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcp0;", "Laz2;", "<anonymous>", "(Lcp0;)V"}, k = 3, mv = {1, 8, 0})
final class SingleProcessCoordinator$updateNotifications$1 extends ul2 implements zr0 {
    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        return new SingleProcessCoordinator$updateNotifications$1(2, dyVar);
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        SingleProcessCoordinator$updateNotifications$1 singleProcessCoordinator$updateNotifications$1 = (SingleProcessCoordinator$updateNotifications$1) create((cp0) obj, (dy) obj2);
        az2 az2Var = az2.a;
        singleProcessCoordinator$updateNotifications$1.invokeSuspend(az2Var);
        return az2Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        wz2.a0(obj);
        return az2.a;
    }
}
