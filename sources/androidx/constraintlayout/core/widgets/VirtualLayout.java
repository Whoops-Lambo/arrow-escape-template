package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class VirtualLayout extends HelperWidget {
    public int t0 = 0;
    public int u0 = 0;
    public int v0 = 0;
    public int w0 = 0;
    public int x0 = 0;
    public int y0 = 0;
    public boolean z0 = false;
    public int A0 = 0;
    public int B0 = 0;
    public final BasicMeasure.Measure C0 = new BasicMeasure.Measure();
    public BasicMeasure.Measurer D0 = null;

    public void T(int i, int i2, int i3, int i4) {
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.Helper
    public final void a() {
        for (int i = 0; i < this.s0; i++) {
            ConstraintWidget constraintWidget = this.r0[i];
            if (constraintWidget != null) {
                constraintWidget.G = true;
            }
        }
    }

    public final void U(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        BasicMeasure.Measurer measurer;
        ConstraintWidget constraintWidget2;
        while (true) {
            measurer = this.D0;
            if (measurer != null || (constraintWidget2 = this.V) == null) {
                break;
            } else {
                this.D0 = ((ConstraintWidgetContainer) constraintWidget2).v0;
            }
        }
        BasicMeasure.Measure measure = this.C0;
        measure.a = dimensionBehaviour;
        measure.b = dimensionBehaviour2;
        measure.c = i;
        measure.d = i2;
        measurer.b(constraintWidget, measure);
        constraintWidget.P(measure.e);
        constraintWidget.M(measure.f);
        constraintWidget.E = measure.h;
        constraintWidget.J(measure.g);
    }
}
