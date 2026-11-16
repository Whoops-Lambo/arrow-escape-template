package androidx.compose.material.ripple;

import androidx.compose.runtime.Immutable;
import defpackage.h50;
import defpackage.n30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ripple/RippleAlpha;", "", "material-ripple_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class RippleAlpha {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleAlpha)) {
            return false;
        }
        RippleAlpha rippleAlpha = (RippleAlpha) obj;
        return this.a == rippleAlpha.a && this.b == rippleAlpha.b && this.c == rippleAlpha.c && this.d == rippleAlpha.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + n30.b(this.c, n30.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.a);
        sb.append(", focusedAlpha=");
        sb.append(this.b);
        sb.append(", hoveredAlpha=");
        sb.append(this.c);
        sb.append(", pressedAlpha=");
        return h50.k(sb, this.d, ')');
    }

    public RippleAlpha(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }
}
