package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/AndroidOverscrollKt$NoOpOverscrollEffect$1", "Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidOverscrollKt$NoOpOverscrollEffect$1 implements OverscrollEffect {
    public boolean a;

    @Override // androidx.compose.foundation.OverscrollEffect
    public final boolean a() {
        return false;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final void b(long j) {
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final void f(long j, long j2, Offset offset, int i) {
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final Modifier c() {
        return Modifier.Companion.a;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final Velocity d(long j) {
        return new Velocity(Velocity.b);
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final long e(long j, Offset offset) {
        return Offset.b;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: isEnabled, reason: from getter */
    public final boolean getA() {
        return this.a;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final void setEnabled(boolean z) {
        this.a = z;
    }
}
