package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class Optimizer {
    public static final boolean[] a = new boolean[3];

    public static void a(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ConstraintWidget constraintWidget) {
        constraintWidget.o = -1;
        ConstraintAnchor constraintAnchor = constraintWidget.N;
        ConstraintAnchor constraintAnchor2 = constraintWidget.M;
        ConstraintAnchor constraintAnchor3 = constraintWidget.K;
        ConstraintAnchor constraintAnchor4 = constraintWidget.L;
        ConstraintAnchor constraintAnchor5 = constraintWidget.J;
        constraintWidget.p = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidgetContainer.U[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.b;
        if (dimensionBehaviour != dimensionBehaviour3 && constraintWidget.U[0] == dimensionBehaviour2) {
            int i = constraintAnchor5.g;
            int iR = constraintWidgetContainer.r() - constraintAnchor4.g;
            constraintAnchor5.i = linearSystem.k(constraintAnchor5);
            constraintAnchor4.i = linearSystem.k(constraintAnchor4);
            linearSystem.d(constraintAnchor5.i, i);
            linearSystem.d(constraintAnchor4.i, iR);
            constraintWidget.o = 2;
            constraintWidget.a0 = i;
            int i2 = iR - i;
            constraintWidget.W = i2;
            int i3 = constraintWidget.d0;
            if (i2 < i3) {
                constraintWidget.W = i3;
            }
        }
        if (constraintWidgetContainer.U[1] == dimensionBehaviour3 || constraintWidget.U[1] != dimensionBehaviour2) {
            return;
        }
        int i4 = constraintAnchor3.g;
        int iL = constraintWidgetContainer.l() - constraintAnchor2.g;
        constraintAnchor3.i = linearSystem.k(constraintAnchor3);
        constraintAnchor2.i = linearSystem.k(constraintAnchor2);
        linearSystem.d(constraintAnchor3.i, i4);
        linearSystem.d(constraintAnchor2.i, iL);
        if (constraintWidget.c0 > 0 || constraintWidget.i0 == 8) {
            SolverVariable solverVariableK = linearSystem.k(constraintAnchor);
            constraintAnchor.i = solverVariableK;
            linearSystem.d(solverVariableK, constraintWidget.c0 + i4);
        }
        constraintWidget.p = 2;
        constraintWidget.b0 = i4;
        int i5 = iL - i4;
        constraintWidget.X = i5;
        int i6 = constraintWidget.e0;
        if (i5 < i6) {
            constraintWidget.X = i6;
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
