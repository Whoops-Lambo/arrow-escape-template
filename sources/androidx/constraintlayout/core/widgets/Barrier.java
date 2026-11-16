package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import defpackage.h50;
import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class Barrier extends HelperWidget {
    public int t0;
    public boolean u0;
    public int v0;
    public boolean w0;

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.s0;
            if (i4 >= i) {
                break;
            }
            ConstraintWidget constraintWidget = this.r0[i4];
            if ((this.u0 || constraintWidget.d()) && ((((i2 = this.t0) == 0 || i2 == 1) && !constraintWidget.B()) || (((i3 = this.t0) == 2 || i3 == 3) && !constraintWidget.C()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.s0; i5++) {
            ConstraintWidget constraintWidget2 = this.r0[i5];
            if (this.u0 || constraintWidget2.d()) {
                ConstraintAnchor.Type type = ConstraintAnchor.Type.d;
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.b;
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.c;
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.a;
                if (!z2) {
                    int i6 = this.t0;
                    if (i6 == 0) {
                        iMax = constraintWidget2.j(type4).d();
                    } else if (i6 == 1) {
                        iMax = constraintWidget2.j(type3).d();
                    } else if (i6 == 2) {
                        iMax = constraintWidget2.j(type2).d();
                    } else if (i6 == 3) {
                        iMax = constraintWidget2.j(type).d();
                    }
                    z2 = true;
                }
                int i7 = this.t0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, constraintWidget2.j(type4).d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, constraintWidget2.j(type3).d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, constraintWidget2.j(type2).d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, constraintWidget2.j(type).d());
                }
            }
        }
        int i8 = iMax + this.v0;
        int i9 = this.t0;
        if (i9 == 0 || i9 == 1) {
            K(i8, i8);
        } else {
            L(i8, i8);
        }
        this.w0 = true;
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean d() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean B() {
        return this.w0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean C() {
        return this.w0;
    }

    public final int U() {
        int i = this.t0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void c(LinearSystem linearSystem, boolean z) {
        boolean z2;
        int i;
        ConstraintAnchor[] constraintAnchorArr = this.R;
        ConstraintAnchor constraintAnchor = this.J;
        constraintAnchorArr[0] = constraintAnchor;
        int i2 = 2;
        ConstraintAnchor constraintAnchor2 = this.K;
        constraintAnchorArr[2] = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = this.L;
        constraintAnchorArr[1] = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = this.M;
        constraintAnchorArr[3] = constraintAnchor4;
        for (ConstraintAnchor constraintAnchor5 : constraintAnchorArr) {
            constraintAnchor5.i = linearSystem.k(constraintAnchor5);
        }
        int i3 = this.t0;
        if (i3 < 0 || i3 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr[i3];
        if (!this.w0) {
            T();
        }
        if (this.w0) {
            this.w0 = false;
            int i4 = this.t0;
            if (i4 == 0 || i4 == 1) {
                linearSystem.d(constraintAnchor.i, this.a0);
                linearSystem.d(constraintAnchor3.i, this.a0);
                return;
            } else {
                if (i4 == 2 || i4 == 3) {
                    linearSystem.d(constraintAnchor2.i, this.b0);
                    linearSystem.d(constraintAnchor4.i, this.b0);
                    return;
                }
                return;
            }
        }
        int i5 = 0;
        while (true) {
            if (i5 >= this.s0) {
                z2 = false;
                break;
            }
            ConstraintWidget constraintWidget = this.r0[i5];
            if (this.u0 || constraintWidget.d()) {
                int i6 = this.t0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.c;
                if (((i6 == 0 || i6 == 1) && constraintWidget.U[0] == dimensionBehaviour && constraintWidget.J.f != null && constraintWidget.L.f != null) || ((i6 == 2 || i6 == 3) && constraintWidget.U[1] == dimensionBehaviour && constraintWidget.K.f != null && constraintWidget.M.f != null)) {
                    z2 = true;
                    break;
                }
            }
            i5++;
        }
        boolean z3 = constraintAnchor.g() || constraintAnchor3.g();
        boolean z4 = constraintAnchor2.g() || constraintAnchor4.g();
        int i7 = !(!z2 && (((i = this.t0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.s0) {
            ConstraintWidget constraintWidget2 = this.r0[i8];
            if (this.u0 || constraintWidget2.d()) {
                SolverVariable solverVariableK = linearSystem.k(constraintWidget2.R[this.t0]);
                ConstraintAnchor[] constraintAnchorArr2 = constraintWidget2.R;
                int i9 = this.t0;
                ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[i9];
                constraintAnchor7.i = solverVariableK;
                ConstraintAnchor constraintAnchor8 = constraintAnchor7.f;
                int i10 = (constraintAnchor8 == null || constraintAnchor8.d != this) ? 0 : constraintAnchor7.g;
                if (i9 == 0 || i9 == i2) {
                    SolverVariable solverVariable = constraintAnchor6.i;
                    int i11 = this.v0 - i10;
                    ArrayRow arrayRowL = linearSystem.l();
                    SolverVariable solverVariableM = linearSystem.m();
                    solverVariableM.d = 0;
                    arrayRowL.d(solverVariable, solverVariableK, solverVariableM, i11);
                    linearSystem.c(arrayRowL);
                } else {
                    SolverVariable solverVariable2 = constraintAnchor6.i;
                    int i12 = this.v0 + i10;
                    ArrayRow arrayRowL2 = linearSystem.l();
                    SolverVariable solverVariableM2 = linearSystem.m();
                    solverVariableM2.d = 0;
                    arrayRowL2.c(solverVariable2, solverVariableK, solverVariableM2, i12);
                    linearSystem.c(arrayRowL2);
                }
                linearSystem.e(constraintAnchor6.i, solverVariableK, this.v0 + i10, i7);
            }
            i8++;
            i2 = 2;
        }
        int i13 = this.t0;
        if (i13 == 0) {
            linearSystem.e(constraintAnchor3.i, constraintAnchor.i, 0, 8);
            linearSystem.e(constraintAnchor.i, this.V.L.i, 0, 4);
            linearSystem.e(constraintAnchor.i, this.V.J.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            linearSystem.e(constraintAnchor.i, constraintAnchor3.i, 0, 8);
            linearSystem.e(constraintAnchor.i, this.V.J.i, 0, 4);
            linearSystem.e(constraintAnchor.i, this.V.L.i, 0, 0);
        } else if (i13 == 2) {
            linearSystem.e(constraintAnchor4.i, constraintAnchor2.i, 0, 8);
            linearSystem.e(constraintAnchor2.i, this.V.M.i, 0, 4);
            linearSystem.e(constraintAnchor2.i, this.V.K.i, 0, 0);
        } else if (i13 == 3) {
            linearSystem.e(constraintAnchor2.i, constraintAnchor4.i, 0, 8);
            linearSystem.e(constraintAnchor2.i, this.V.K.i, 0, 4);
            linearSystem.e(constraintAnchor2.i, this.V.M.i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final String toString() {
        String strQ = nj.q(new StringBuilder("[Barrier] "), this.j0, " {");
        for (int i = 0; i < this.s0; i++) {
            ConstraintWidget constraintWidget = this.r0[i];
            if (i > 0) {
                strQ = strQ.concat(", ");
            }
            StringBuilder sbP = h50.p(strQ);
            sbP.append(constraintWidget.j0);
            strQ = sbP.toString();
        }
        return strQ.concat("}");
    }
}
