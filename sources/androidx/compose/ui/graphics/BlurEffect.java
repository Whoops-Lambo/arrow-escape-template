package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import defpackage.n30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/BlurEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BlurEffect extends RenderEffect {
    public final float b;
    public final float c;

    @Override // androidx.compose.ui.graphics.RenderEffect
    public final android.graphics.RenderEffect a() {
        return RenderEffectVerificationHelper.a.a(null, this.b, this.c, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlurEffect)) {
            return false;
        }
        BlurEffect blurEffect = (BlurEffect) obj;
        return this.b == blurEffect.b && this.c == blurEffect.c;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + n30.b(this.c, Float.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.b + ", radiusY=" + this.c + ", edgeTreatment=Clamp)";
    }

    public BlurEffect(float f, float f2) {
        this.b = f;
        this.c = f2;
    }
}
