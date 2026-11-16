package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/FractionalThreshold;", "Landroidx/compose/material/ThresholdConfig;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalMaterialApi
public final /* data */ class FractionalThreshold implements ThresholdConfig {
    public final boolean equals(Object obj) {
        Object objValueOf = Float.valueOf(0.5f);
        if (this == obj) {
            return true;
        }
        return (obj instanceof FractionalThreshold) && objValueOf.equals(objValueOf);
    }

    public final int hashCode() {
        return Float.hashCode(0.5f);
    }

    public final String toString() {
        return "FractionalThreshold(fraction=0.5)";
    }

    @Override // androidx.compose.material.ThresholdConfig
    public final float a(Density density, float f, float f2) {
        density.getClass();
        return MathHelpersKt.a(f, f2, 0.5f);
    }
}
