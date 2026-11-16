package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class Placeholder extends VirtualLayout {
    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public final void T(int i, int i2, int i3, int i4) {
        int iR = this.x0 + this.y0;
        int iL = this.t0 + this.u0;
        if (this.s0 > 0) {
            iR += this.r0[0].r();
            iL += this.r0[0].l();
        }
        int iMax = Math.max(this.d0, iR);
        int iMax2 = Math.max(this.e0, iL);
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                i2 = Math.min(iMax, i2);
            } else {
                i2 = i == 0 ? iMax : 0;
            }
        }
        if (i3 != 1073741824) {
            if (i3 == Integer.MIN_VALUE) {
                i4 = Math.min(iMax2, i4);
            } else {
                i4 = i3 == 0 ? iMax2 : 0;
            }
        }
        this.A0 = i2;
        this.B0 = i4;
        P(i2);
        M(i4);
        this.z0 = this.s0 > 0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void c(LinearSystem linearSystem, boolean z) {
        super.c(linearSystem, z);
        if (this.s0 > 0) {
            ConstraintWidget constraintWidget = this.r0[0];
            constraintWidget.E();
            constraintWidget.g0 = 0.5f;
            constraintWidget.f0 = 0.5f;
            ConstraintAnchor.Type type = ConstraintAnchor.Type.a;
            constraintWidget.f(type, this, type, 0);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.c;
            constraintWidget.f(type2, this, type2, 0);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.b;
            constraintWidget.f(type3, this, type3, 0);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.d;
            constraintWidget.f(type4, this, type4, 0);
        }
    }
}
