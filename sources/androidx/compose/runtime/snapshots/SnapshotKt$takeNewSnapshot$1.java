package androidx.compose.runtime.snapshots;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/Snapshot;", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invoke", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/Snapshot;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class SnapshotKt$takeNewSnapshot$1 extends rc1 implements wr0 {
    public final /* synthetic */ wr0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotKt$takeNewSnapshot$1(wr0 wr0Var) {
        super(1);
        this.i = wr0Var;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        SnapshotIdSet snapshotIdSet = (SnapshotIdSet) obj;
        snapshotIdSet.getClass();
        Snapshot snapshot = (Snapshot) this.i.invoke(snapshotIdSet);
        synchronized (SnapshotKt.c) {
            SnapshotKt.d = SnapshotKt.d.h(snapshot.getB());
        }
        return snapshot;
    }
}
