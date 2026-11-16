package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import defpackage.sr0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OwnerSnapshotObserver {
    public final SnapshotStateObserver a;
    public final wr0 b = OwnerSnapshotObserver$onCommitAffectingMeasure$1.i;
    public final wr0 c = OwnerSnapshotObserver$onCommitAffectingLayout$1.i;
    public final wr0 d = OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1.i;

    public final void a() {
        this.a.c(OwnerSnapshotObserver$clearInvalidObservations$1.i);
    }

    public OwnerSnapshotObserver(wr0 wr0Var) {
        this.a = new SnapshotStateObserver(wr0Var);
    }

    public final void b(OwnerScope ownerScope, wr0 wr0Var, sr0 sr0Var) {
        ownerScope.getClass();
        wr0Var.getClass();
        sr0Var.getClass();
        this.a.d(ownerScope, wr0Var, sr0Var);
    }
}
