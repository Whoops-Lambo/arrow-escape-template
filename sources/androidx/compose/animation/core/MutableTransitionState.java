package androidx.compose.animation.core;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", "S", "", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MutableTransitionState<S> {
    public final ParcelableSnapshotMutableState a;
    public final ParcelableSnapshotMutableState b;
    public final ParcelableSnapshotMutableState c = SnapshotStateKt.c(Boolean.FALSE, StructuralEqualityPolicy.a);

    public MutableTransitionState(Object obj) {
        this.a = SnapshotStateKt.c(obj, StructuralEqualityPolicy.a);
        this.b = SnapshotStateKt.c(obj, StructuralEqualityPolicy.a);
    }
}
