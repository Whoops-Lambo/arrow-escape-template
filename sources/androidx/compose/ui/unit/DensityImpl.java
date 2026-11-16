package androidx.compose.ui.unit;

import defpackage.h50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/DensityImpl;", "Landroidx/compose/ui/unit/Density;", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final /* data */ class DensityImpl implements Density {
    public final float a;
    public final float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityImpl)) {
            return false;
        }
        DensityImpl densityImpl = (DensityImpl) obj;
        return Float.valueOf(this.a).equals(Float.valueOf(densityImpl.a)) && Float.valueOf(this.b).equals(Float.valueOf(densityImpl.b));
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: getDensity, reason: from getter */
    public final float getA() {
        return this.a;
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: getFontScale, reason: from getter */
    public final float getB() {
        return this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.a);
        sb.append(", fontScale=");
        return h50.k(sb, this.b, ')');
    }

    public DensityImpl(float f, float f2) {
        this.a = f;
        this.b = f2;
    }
}
