package androidx.compose.runtime;

import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/StructuralEqualityPolicy;", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class StructuralEqualityPolicy implements SnapshotMutationPolicy<Object> {
    public static final StructuralEqualityPolicy a = new StructuralEqualityPolicy();

    public final String toString() {
        return "StructuralEqualityPolicy";
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public final boolean a(Object obj, Object obj2) {
        return s71.b(obj, obj2);
    }
}
