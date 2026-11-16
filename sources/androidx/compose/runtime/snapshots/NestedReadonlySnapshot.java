package androidx.compose.runtime.snapshots;

import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class NestedReadonlySnapshot extends Snapshot {
    public final Snapshot e;
    public final wr0 f;

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final boolean g() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: h */
    public final wr0 getF() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void l() {
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void c() {
        if (this.c) {
            return;
        }
        int i = this.b;
        Snapshot snapshot = this.e;
        if (i != snapshot.getB()) {
            a();
        }
        snapshot.k(this);
        super.c();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: f, reason: from getter */
    public final wr0 getE() {
        return this.f;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final Snapshot r(wr0 wr0Var) {
        return new NestedReadonlySnapshot(this.b, this.a, wr0Var, this.e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedReadonlySnapshot(int i, SnapshotIdSet snapshotIdSet, wr0 wr0Var, Snapshot snapshot) {
        super(i, snapshotIdSet);
        snapshotIdSet.getClass();
        snapshot.getClass();
        this.e = snapshot;
        snapshot.j(this);
        if (wr0Var != null) {
            wr0 f = snapshot.getE();
            if (f != null) {
                wr0Var = new NestedReadonlySnapshot$readObserver$1$1$1(wr0Var, f);
            }
        } else {
            wr0Var = snapshot.getE();
        }
        this.f = wr0Var;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void j(Snapshot snapshot) {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void k(Snapshot snapshot) {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void m(StateObject stateObject) {
        stateObject.getClass();
        wr0 wr0Var = SnapshotKt.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }
}
