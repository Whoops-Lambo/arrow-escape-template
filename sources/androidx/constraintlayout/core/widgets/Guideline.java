package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class Guideline extends ConstraintWidget {
    public float r0 = -1.0f;
    public int s0 = -1;
    public int t0 = -1;
    public ConstraintAnchor u0 = this.K;
    public int v0 = 0;
    public boolean w0;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean d() {
        return true;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.Guideline$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[0] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean B() {
        return this.w0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean C() {
        return this.w0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void R(LinearSystem linearSystem, boolean z) {
        if (this.V == null) {
            return;
        }
        ConstraintAnchor constraintAnchor = this.u0;
        linearSystem.getClass();
        int iN = LinearSystem.n(constraintAnchor);
        if (this.v0 == 1) {
            this.a0 = iN;
            this.b0 = 0;
            M(this.V.l());
            P(0);
            return;
        }
        this.a0 = 0;
        this.b0 = iN;
        P(this.V.r());
        M(0);
    }

    public final void S(int i) {
        this.u0.l(i);
        this.w0 = true;
    }

    public final void T(int i) {
        if (this.v0 == i) {
            return;
        }
        this.v0 = i;
        ArrayList arrayList = this.S;
        arrayList.clear();
        if (this.v0 == 1) {
            this.u0 = this.J;
        } else {
            this.u0 = this.K;
        }
        arrayList.add(this.u0);
        ConstraintAnchor[] constraintAnchorArr = this.R;
        int length = constraintAnchorArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            constraintAnchorArr[i2] = this.u0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void c(LinearSystem linearSystem, boolean z) {
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) this.V;
        if (constraintWidgetContainer == null) {
            return;
        }
        Object objJ = constraintWidgetContainer.j(ConstraintAnchor.Type.a);
        Object objJ2 = constraintWidgetContainer.j(ConstraintAnchor.Type.c);
        ConstraintWidget constraintWidget = this.V;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.b;
        boolean z2 = constraintWidget != null && constraintWidget.U[0] == dimensionBehaviour;
        if (this.v0 == 0) {
            objJ = constraintWidgetContainer.j(ConstraintAnchor.Type.b);
            objJ2 = constraintWidgetContainer.j(ConstraintAnchor.Type.d);
            ConstraintWidget constraintWidget2 = this.V;
            z2 = constraintWidget2 != null && constraintWidget2.U[1] == dimensionBehaviour;
        }
        if (this.w0) {
            ConstraintAnchor constraintAnchor = this.u0;
            if (constraintAnchor.c) {
                SolverVariable solverVariableK = linearSystem.k(constraintAnchor);
                linearSystem.d(solverVariableK, this.u0.d());
                if (this.s0 != -1) {
                    if (z2) {
                        linearSystem.f(linearSystem.k(objJ2), solverVariableK, 0, 5);
                    }
                } else if (this.t0 != -1 && z2) {
                    SolverVariable solverVariableK2 = linearSystem.k(objJ2);
                    linearSystem.f(solverVariableK, linearSystem.k(objJ), 0, 5);
                    linearSystem.f(solverVariableK2, solverVariableK, 0, 5);
                }
                this.w0 = false;
                return;
            }
        }
        if (this.s0 != -1) {
            SolverVariable solverVariableK3 = linearSystem.k(this.u0);
            linearSystem.e(solverVariableK3, linearSystem.k(objJ), this.s0, 8);
            if (z2) {
                linearSystem.f(linearSystem.k(objJ2), solverVariableK3, 0, 5);
                return;
            }
            return;
        }
        if (this.t0 != -1) {
            SolverVariable solverVariableK4 = linearSystem.k(this.u0);
            SolverVariable solverVariableK5 = linearSystem.k(objJ2);
            linearSystem.e(solverVariableK4, solverVariableK5, -this.t0, 8);
            if (z2) {
                linearSystem.f(solverVariableK4, linearSystem.k(objJ), 0, 5);
                linearSystem.f(solverVariableK5, solverVariableK4, 0, 5);
                return;
            }
            return;
        }
        if (this.r0 != -1.0f) {
            SolverVariable solverVariableK6 = linearSystem.k(this.u0);
            SolverVariable solverVariableK7 = linearSystem.k(objJ2);
            float f = this.r0;
            ArrayRow arrayRowL = linearSystem.l();
            arrayRowL.d.c(solverVariableK6, -1.0f);
            arrayRowL.d.c(solverVariableK7, f);
            linearSystem.c(arrayRowL);
        }
    }

    public Guideline() {
        this.S.clear();
        this.S.add(this.u0);
        int length = this.R.length;
        for (int i = 0; i < length; i++) {
            this.R[i] = this.u0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final ConstraintAnchor j(ConstraintAnchor.Type type) {
        int iOrdinal = type.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                }
            }
            if (this.v0 == 0) {
                return this.u0;
            }
            return null;
        }
        if (this.v0 == 1) {
            return this.u0;
        }
        return null;
    }
}
