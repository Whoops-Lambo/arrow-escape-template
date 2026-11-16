package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/ComplexDouble;", "", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class ComplexDouble {
    public double a;
    public double b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComplexDouble)) {
            return false;
        }
        ComplexDouble complexDouble = (ComplexDouble) obj;
        return Double.valueOf(this.a).equals(Double.valueOf(complexDouble.a)) && Double.valueOf(this.b).equals(Double.valueOf(complexDouble.b));
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.a + ", _imaginary=" + this.b + ')';
    }

    public ComplexDouble(double d, double d2) {
        this.a = d;
        this.b = d2;
    }
}
