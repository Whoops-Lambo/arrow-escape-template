package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.IdentityScopeMap;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "Laz2;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class SnapshotStateObserver$readObserver$1 extends rc1 implements wr0 {
    public final /* synthetic */ SnapshotStateObserver i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$readObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(1);
        this.i = snapshotStateObserver;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        obj.getClass();
        SnapshotStateObserver snapshotStateObserver = this.i;
        synchronized (snapshotStateObserver.d) {
            SnapshotStateObserver.ApplyMap applyMap = snapshotStateObserver.f;
            applyMap.getClass();
            IdentityScopeMap identityScopeMap = applyMap.b;
            Object obj2 = applyMap.d;
            obj2.getClass();
            identityScopeMap.a(obj, obj2);
        }
        return az2.a;
    }
}
