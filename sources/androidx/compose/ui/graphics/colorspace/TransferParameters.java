package androidx.compose.ui.graphics.colorspace;

import defpackage.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class TransferParameters {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;

    public final boolean equals(Object obj) {
        Object objValueOf = Double.valueOf(0.0d);
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferParameters)) {
            return false;
        }
        TransferParameters transferParameters = (TransferParameters) obj;
        return Double.valueOf(this.a).equals(Double.valueOf(transferParameters.a)) && Double.valueOf(this.b).equals(Double.valueOf(transferParameters.b)) && Double.valueOf(this.c).equals(Double.valueOf(transferParameters.c)) && Double.valueOf(this.d).equals(Double.valueOf(transferParameters.d)) && Double.valueOf(this.e).equals(Double.valueOf(transferParameters.e)) && objValueOf.equals(objValueOf) && objValueOf.equals(objValueOf);
    }

    public final int hashCode() {
        return Double.hashCode(0.0d) + ((Double.hashCode(0.0d) + ((Double.hashCode(this.e) + ((Double.hashCode(this.d) + ((Double.hashCode(this.c) + ((Double.hashCode(this.b) + (Double.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.b + ", b=" + this.c + ", c=" + this.d + ", d=" + this.e + ", e=0.0, f=0.0)";
    }

    public TransferParameters(double d, double d2, double d3, double d4, double d5) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        if (!Double.isNaN(d2) && !Double.isNaN(d3) && !Double.isNaN(d4) && !Double.isNaN(d5) && !Double.isNaN(0.0d) && !Double.isNaN(0.0d) && !Double.isNaN(d)) {
            if (d5 >= 0.0d && d5 <= 1.0d) {
                if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
                    d.r("Parameter a or g is zero, the transfer function is constant");
                    throw null;
                }
                if (d5 >= 1.0d && d4 == 0.0d) {
                    d.r("Parameter c is zero, the transfer function is constant");
                    throw null;
                }
                if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
                    d.r("Parameter a or g is zero, and c is zero, the transfer function is constant");
                    throw null;
                }
                if (d4 >= 0.0d) {
                    if (d2 >= 0.0d && d >= 0.0d) {
                        return;
                    }
                    d.r("The transfer function must be positive or increasing");
                    throw null;
                }
                d.r("The transfer function must be increasing");
                throw null;
            }
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        d.r("Parameters cannot be NaN");
        throw null;
    }
}
