package androidx.compose.runtime.snapshots;

import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class GlobalSnapshot$takeNestedMutableSnapshot$1 extends rc1 implements wr0 {
    public final /* synthetic */ wr0 i;
    public final /* synthetic */ wr0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshot$takeNestedMutableSnapshot$1(wr0 wr0Var, wr0 wr0Var2) {
        super(1);
        this.i = wr0Var;
        this.j = wr0Var2;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i;
        SnapshotIdSet snapshotIdSet = (SnapshotIdSet) obj;
        snapshotIdSet.getClass();
        synchronized (SnapshotKt.c) {
            i = SnapshotKt.e;
            SnapshotKt.e = i + 1;
        }
        return new MutableSnapshot(i, snapshotIdSet, this.i, this.j);
    }
}
