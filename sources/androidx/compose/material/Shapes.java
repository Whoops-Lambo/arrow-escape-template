package androidx.compose.material;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/Shapes;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Shapes {
    public final RoundedCornerShape a;
    public final RoundedCornerShape b;
    public final RoundedCornerShape c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) obj;
        return this.a.equals(shapes.a) && this.b.equals(shapes.b) && this.c.equals(shapes.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ')';
    }

    public Shapes(RoundedCornerShape roundedCornerShape, RoundedCornerShape roundedCornerShape2, RoundedCornerShape roundedCornerShape3) {
        this.a = roundedCornerShape;
        this.b = roundedCornerShape2;
        this.c = roundedCornerShape3;
    }
}
