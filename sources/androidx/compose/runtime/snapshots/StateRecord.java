package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/StateRecord;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class StateRecord {
    public int a = SnapshotKt.h().getB();
    public StateRecord b;

    public abstract void a(StateRecord stateRecord);

    public abstract StateRecord b();
}
