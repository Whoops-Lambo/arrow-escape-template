package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/OffsetEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OffsetEffect extends RenderEffect {
    @Override // androidx.compose.ui.graphics.RenderEffect
    public final android.graphics.RenderEffect a() {
        return RenderEffectVerificationHelper.a.b(null, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OffsetEffect) && Offset.a(0L, 0L);
    }

    public final int hashCode() {
        int i = Offset.e;
        return Long.hashCode(0L);
    }

    public final String toString() {
        return "OffsetEffect(renderEffect=null, offset=" + ((Object) Offset.h(0L)) + ')';
    }
}
