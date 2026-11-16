package androidx.compose.ui.platform;

import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import defpackage.fy;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/NestedScrollInteropConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class NestedScrollInteropConnection implements NestedScrollConnection {
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long b(int i, long j) {
        NestedScrollInteropConnectionKt.a(j);
        throw null;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long c(int i, long j, long j2) {
        NestedScrollInteropConnectionKt.a(j2);
        throw null;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object d(long j, long j2, fy fyVar) {
        Velocity.a(j2);
        Velocity.b(j2);
        throw null;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object e(long j, fy fyVar) {
        Velocity.a(j);
        Velocity.b(j);
        throw null;
    }
}
