package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl;", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Landroidx/compose/foundation/layout/BoxScope;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final /* data */ class BoxWithConstraintsScopeImpl implements BoxWithConstraintsScope, BoxScope {
    public final Density a;
    public final long b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
        return s71.b(this.a, boxWithConstraintsScopeImpl.a) && Constraints.b(this.b, boxWithConstraintsScopeImpl.b);
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getB() {
        return this.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) Constraints.k(this.b)) + ')';
    }

    public BoxWithConstraintsScopeImpl(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
        this.a = subcomposeMeasureScope;
        this.b = j;
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public final Modifier a(Modifier modifier, Alignment alignment) {
        modifier.getClass();
        alignment.getClass();
        return BoxScopeInstance.a.a(modifier, alignment);
    }
}
