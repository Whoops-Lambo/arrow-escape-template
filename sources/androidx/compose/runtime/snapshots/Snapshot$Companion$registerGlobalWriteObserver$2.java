package androidx.compose.runtime.snapshots;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Laz2;", "<anonymous>", "()V"}, k = 3, mv = {1, 6, 0})
final class Snapshot$Companion$registerGlobalWriteObserver$2 implements ObserverHandle {
    @Override // androidx.compose.runtime.snapshots.ObserverHandle
    public final void dispose() {
        synchronized (SnapshotKt.c) {
            SnapshotKt.h.remove((Object) null);
        }
        SnapshotKt.e(SnapshotKt$advanceGlobalSnapshot$2.i);
    }
}
