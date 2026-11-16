package io.p071bidmachine.rendering.model.engagedclick;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public final int a;
    public final double b;
    public final double c;

    public e(double d, double d2, int i) {
        int iIntValue;
        double dDoubleValue;
        double dDoubleValue2;
        Integer numValueOf = i <= 0 ? null : Integer.valueOf(i);
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 128;
        }
        this.a = iIntValue;
        Double dValueOf = d <= 0.0d ? null : Double.valueOf(d);
        if (dValueOf != null) {
            dDoubleValue = dValueOf.doubleValue();
        } else {
            dDoubleValue = 0.12d;
        }
        this.b = dDoubleValue;
        Double dValueOf2 = d2 > 0.0d ? Double.valueOf(d2) : null;
        if (dValueOf2 != null) {
            dDoubleValue2 = dValueOf2.doubleValue();
        } else {
            dDoubleValue2 = 1.3d;
        }
        this.c = dDoubleValue2;
    }
}
