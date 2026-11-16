package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableStateImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/StateObject;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "StateStateRecord", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class SnapshotMutableStateImpl<T> implements StateObject, SnapshotMutableState<T> {
    public final SnapshotMutationPolicy a;
    public StateStateRecord b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableStateImpl$StateStateRecord;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/StateRecord;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class StateStateRecord<T> extends StateRecord {
        public Object c;

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return new StateStateRecord(this.c);
        }

        public StateStateRecord(Object obj) {
            this.c = obj;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            stateRecord.getClass();
            this.c = ((StateStateRecord) stateRecord).c;
        }
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    /* JADX INFO: renamed from: b, reason: from getter */
    public final SnapshotMutationPolicy getA() {
        return this.a;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord d(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        if (this.a.a(((StateStateRecord) stateRecord2).c, ((StateStateRecord) stateRecord3).c)) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.State
    /* JADX INFO: renamed from: getValue */
    public final Object getA() {
        StateStateRecord stateStateRecord = this.b;
        wr0 wr0Var = SnapshotKt.a;
        stateStateRecord.getClass();
        return ((StateStateRecord) SnapshotKt.m(stateStateRecord, this, SnapshotKt.h())).c;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord h() {
        return this.b;
    }

    @Override // androidx.compose.runtime.MutableState
    public final void setValue(Object obj) {
        Snapshot snapshotH;
        StateRecord stateRecord;
        StateStateRecord stateStateRecord = (StateStateRecord) SnapshotKt.g(this.b, SnapshotKt.h());
        if (this.a.a(stateStateRecord.c, obj)) {
            return;
        }
        StateStateRecord stateStateRecord2 = this.b;
        synchronized (SnapshotKt.c) {
            snapshotH = SnapshotKt.h();
            stateStateRecord2.getClass();
            if (snapshotH.g()) {
                snapshotH.m(this);
            }
            int b = snapshotH.getB();
            if (stateStateRecord.a == b) {
                stateRecord = stateStateRecord;
            } else {
                StateRecord stateRecordJ = SnapshotKt.j(stateStateRecord2, this);
                stateRecordJ.a = b;
                snapshotH.m(this);
                stateRecord = stateRecordJ;
            }
            ((StateStateRecord) stateRecord).c = obj;
        }
        SnapshotKt.k(snapshotH, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((StateStateRecord) SnapshotKt.g(this.b, SnapshotKt.h())).c + ")@" + hashCode();
    }

    public SnapshotMutableStateImpl(Object obj, SnapshotMutationPolicy snapshotMutationPolicy) {
        snapshotMutationPolicy.getClass();
        this.a = snapshotMutationPolicy;
        this.b = new StateStateRecord(obj);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void c(StateRecord stateRecord) {
        stateRecord.getClass();
        this.b = (StateStateRecord) stateRecord;
    }
}
