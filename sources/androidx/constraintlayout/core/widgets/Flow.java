package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class Flow extends VirtualLayout {
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public float P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public int W0;
    public ArrayList X0;
    public ConstraintWidget[] Y0;
    public ConstraintWidget[] Z0;
    public int[] a1;
    public ConstraintWidget[] b1;
    public int c1;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class WidgetsList {
        public int a;
        public ConstraintAnchor d;
        public ConstraintAnchor e;
        public ConstraintAnchor f;
        public ConstraintAnchor g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int q;
        public ConstraintWidget b = null;
        public int c = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int o = 0;
        public int p = 0;

        public final void a(ConstraintWidget constraintWidget) {
            int i = this.a;
            int i2 = this.q;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.c;
            Flow flow = Flow.this;
            if (i == 0) {
                int iW = flow.W(constraintWidget, i2);
                if (constraintWidget.U[0] == dimensionBehaviour) {
                    this.p++;
                    iW = 0;
                }
                this.l = iW + (constraintWidget.i0 != 8 ? flow.Q0 : 0) + this.l;
                int iV = flow.V(constraintWidget, this.q);
                if (this.b == null || this.c < iV) {
                    this.b = constraintWidget;
                    this.c = iV;
                    this.m = iV;
                }
            } else {
                int iW2 = flow.W(constraintWidget, i2);
                int iV2 = flow.V(constraintWidget, this.q);
                if (constraintWidget.U[1] == dimensionBehaviour) {
                    this.p++;
                    iV2 = 0;
                }
                this.m = iV2 + (constraintWidget.i0 != 8 ? flow.R0 : 0) + this.m;
                if (this.b == null || this.c < iW2) {
                    this.b = constraintWidget;
                    this.c = iW2;
                    this.l = iW2;
                }
            }
            this.o++;
        }

        /* JADX WARN: Code duplicated, block: B:89:0x0105 A[PHI: r5 r9
  0x0105: PHI (r5v25 int) = (r5v23 int), (r5v26 int) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0105: PHI (r9v24 float) = (r9v22 float), (r9v27 float) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
        public final void b(boolean z, int i, boolean z2) {
            Flow flow;
            int i2;
            int i3;
            ConstraintWidget constraintWidget;
            boolean z3;
            char c;
            int i4;
            float f;
            int i5;
            int i6 = this.o;
            int i7 = 0;
            while (true) {
                flow = Flow.this;
                if (i7 >= i6 || (i5 = this.n + i7) >= flow.c1) {
                    break;
                }
                ConstraintWidget constraintWidget2 = flow.b1[i5];
                if (constraintWidget2 != null) {
                    constraintWidget2.E();
                }
                i7++;
            }
            if (i6 == 0 || this.b == null) {
                return;
            }
            boolean z4 = z2 && i == 0;
            int i8 = -1;
            int i9 = -1;
            for (int i10 = 0; i10 < i6; i10++) {
                int i11 = this.n + (z ? (i6 - 1) - i10 : i10);
                if (i11 >= flow.c1) {
                    break;
                }
                ConstraintWidget constraintWidget3 = flow.b1[i11];
                if (constraintWidget3 != null && constraintWidget3.i0 == 0) {
                    if (i8 == -1) {
                        i8 = i10;
                    }
                    i9 = i10;
                }
            }
            int i12 = this.a;
            ConstraintWidget constraintWidget4 = this.b;
            if (i12 == 0) {
                constraintWidget4.l0 = flow.F0;
                ConstraintAnchor constraintAnchor = constraintWidget4.M;
                ConstraintAnchor constraintAnchor2 = constraintWidget4.K;
                int i13 = this.i;
                if (i > 0) {
                    i13 += flow.R0;
                }
                constraintAnchor2.a(this.e, i13);
                if (z2) {
                    constraintAnchor.a(this.g, this.k);
                }
                if (i > 0) {
                    this.e.d.M.a(constraintAnchor2, 0);
                }
                if (flow.T0 != 3 || constraintWidget4.E) {
                    constraintWidget = constraintWidget4;
                    break;
                }
                int i14 = 0;
                while (true) {
                    if (i14 < i6) {
                        int i15 = this.n + (z ? (i6 - 1) - i14 : i14);
                        if (i15 < flow.c1) {
                            constraintWidget = flow.b1[i15];
                            if (constraintWidget.E) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                    }
                    constraintWidget = constraintWidget4;
                    break;
                }
                int i16 = 0;
                ConstraintWidget constraintWidget5 = null;
                while (i16 < i6) {
                    int i17 = z ? (i6 - 1) - i16 : i16;
                    int i18 = this.n + i17;
                    if (i18 >= flow.c1) {
                        return;
                    }
                    ConstraintWidget constraintWidget6 = flow.b1[i18];
                    if (constraintWidget6 == null) {
                        i6 = i6;
                        z3 = z4;
                        i9 = i9;
                        c = 3;
                    } else {
                        ConstraintAnchor constraintAnchor3 = constraintWidget6.K;
                        ConstraintAnchor constraintAnchor4 = constraintWidget6.M;
                        ConstraintAnchor constraintAnchor5 = constraintWidget6.J;
                        z3 = z4;
                        if (i16 == 0) {
                            constraintWidget6.g(constraintAnchor5, this.d, this.h);
                        }
                        if (i17 == 0) {
                            int i19 = flow.E0;
                            float f2 = flow.K0;
                            if (z) {
                                f2 = 1.0f - f2;
                            }
                            if (this.n == 0 && (i4 = flow.G0) != -1) {
                                f = flow.M0;
                                if (z) {
                                    f = 1.0f - f;
                                }
                            } else if (!z2 || (i4 = flow.I0) == -1) {
                                i4 = i19;
                                f = f2;
                            } else {
                                f = flow.O0;
                                if (z) {
                                    f = 1.0f - f;
                                }
                            }
                            constraintWidget6.k0 = i4;
                            constraintWidget6.f0 = f;
                        }
                        if (i16 == i6 - 1) {
                            constraintWidget6.g(constraintWidget6.L, this.f, this.j);
                        }
                        if (constraintWidget5 != null) {
                            ConstraintAnchor constraintAnchor6 = constraintWidget5.L;
                            constraintAnchor5.a(constraintAnchor6, flow.Q0);
                            if (i16 == i8) {
                                int i20 = this.h;
                                if (constraintAnchor5.h()) {
                                    constraintAnchor5.h = i20;
                                }
                            }
                            constraintAnchor6.a(constraintAnchor5, 0);
                            if (i16 == i9 + 1) {
                                int i21 = this.j;
                                if (constraintAnchor6.h()) {
                                    constraintAnchor6.h = i21;
                                }
                            }
                        }
                        if (constraintWidget6 != constraintWidget4) {
                            int i22 = flow.T0;
                            c = 3;
                            if (i22 == 3 && constraintWidget.E && constraintWidget6 != constraintWidget && constraintWidget6.E) {
                                constraintWidget6.N.a(constraintWidget.N, 0);
                            } else if (i22 == 0) {
                                constraintAnchor3.a(constraintAnchor2, 0);
                            } else if (i22 == 1) {
                                constraintAnchor4.a(constraintAnchor, 0);
                            } else if (z3) {
                                constraintAnchor3.a(this.e, this.i);
                                constraintAnchor4.a(this.g, this.k);
                            } else {
                                constraintAnchor3.a(constraintAnchor2, 0);
                                constraintAnchor4.a(constraintAnchor, 0);
                            }
                        } else {
                            c = 3;
                        }
                        constraintWidget5 = constraintWidget6;
                    }
                    i16++;
                    z4 = z3;
                    i9 = i9;
                    i6 = i6;
                }
                return;
            }
            int i23 = i6;
            boolean z5 = z4;
            int i24 = i9;
            constraintWidget4.k0 = flow.E0;
            ConstraintAnchor constraintAnchor7 = constraintWidget4.J;
            ConstraintAnchor constraintAnchor8 = constraintWidget4.L;
            int i25 = this.h;
            if (i > 0) {
                i25 += flow.Q0;
            }
            if (z) {
                constraintAnchor8.a(this.f, i25);
                if (z2) {
                    constraintAnchor7.a(this.d, this.j);
                }
                if (i > 0) {
                    this.f.d.J.a(constraintAnchor8, 0);
                }
            } else {
                constraintAnchor7.a(this.d, i25);
                if (z2) {
                    constraintAnchor8.a(this.f, this.j);
                }
                if (i > 0) {
                    this.d.d.L.a(constraintAnchor7, 0);
                }
            }
            int i26 = 0;
            ConstraintWidget constraintWidget7 = null;
            while (true) {
                int i27 = i23;
                if (i26 >= i27 || (i2 = this.n + i26) >= flow.c1) {
                    return;
                }
                ConstraintWidget constraintWidget8 = flow.b1[i2];
                if (constraintWidget8 == null) {
                    i23 = i27;
                } else {
                    ConstraintAnchor constraintAnchor9 = constraintWidget8.J;
                    ConstraintAnchor constraintAnchor10 = constraintWidget8.K;
                    ConstraintAnchor constraintAnchor11 = constraintWidget8.L;
                    if (i26 == 0) {
                        constraintWidget8.g(constraintAnchor10, this.e, this.i);
                        int i28 = flow.F0;
                        float f3 = flow.L0;
                        if (this.n == 0) {
                            int i29 = flow.H0;
                            i23 = i27;
                            i3 = -1;
                            if (i29 != -1) {
                                f3 = flow.N0;
                            }
                            i28 = i29;
                            constraintWidget8.l0 = i28;
                            constraintWidget8.g0 = f3;
                        } else {
                            i23 = i27;
                            i3 = -1;
                        }
                        if (z2 && (i29 = flow.J0) != i3) {
                            f3 = flow.P0;
                            i28 = i29;
                        }
                        constraintWidget8.l0 = i28;
                        constraintWidget8.g0 = f3;
                    } else {
                        i23 = i27;
                    }
                    if (i26 == i23 - 1) {
                        constraintWidget8.g(constraintWidget8.M, this.g, this.k);
                    }
                    if (constraintWidget7 != null) {
                        ConstraintAnchor constraintAnchor12 = constraintWidget7.M;
                        constraintAnchor10.a(constraintAnchor12, flow.R0);
                        if (i26 == i8) {
                            int i30 = this.i;
                            if (constraintAnchor10.h()) {
                                constraintAnchor10.h = i30;
                            }
                        }
                        constraintAnchor12.a(constraintAnchor10, 0);
                        if (i26 == i24 + 1) {
                            int i31 = this.k;
                            if (constraintAnchor12.h()) {
                                constraintAnchor12.h = i31;
                            }
                        }
                    }
                    if (constraintWidget8 != constraintWidget4) {
                        int i32 = flow.S0;
                        if (z) {
                            if (i32 == 0) {
                                constraintAnchor11.a(constraintAnchor8, 0);
                            } else if (i32 == 1) {
                                constraintAnchor9.a(constraintAnchor7, 0);
                            } else if (i32 == 2) {
                                constraintAnchor9.a(constraintAnchor7, 0);
                                constraintAnchor11.a(constraintAnchor8, 0);
                            }
                        } else if (i32 == 0) {
                            constraintAnchor9.a(constraintAnchor7, 0);
                        } else if (i32 == 1) {
                            constraintAnchor11.a(constraintAnchor8, 0);
                        } else if (i32 == 2) {
                            if (z5) {
                                constraintAnchor9.a(this.d, this.h);
                                constraintAnchor11.a(this.f, this.j);
                            } else {
                                constraintAnchor9.a(constraintAnchor7, 0);
                                constraintAnchor11.a(constraintAnchor8, 0);
                            }
                        }
                    }
                    constraintWidget7 = constraintWidget8;
                }
                i26++;
            }
        }

        public final int c() {
            int i = this.a;
            int i2 = this.m;
            return i == 1 ? i2 - Flow.this.R0 : i2;
        }

        public final int d() {
            int i = this.a;
            int i2 = this.l;
            return i == 0 ? i2 - Flow.this.Q0 : i2;
        }

        public final void e(int i) {
            Flow flow;
            int i2;
            int i3 = this.p;
            if (i3 == 0) {
                return;
            }
            int i4 = this.o;
            int i5 = i / i3;
            int i6 = 0;
            while (true) {
                flow = Flow.this;
                if (i6 >= i4 || (i2 = this.n + i6) >= flow.c1) {
                    break;
                }
                ConstraintWidget constraintWidget = flow.b1[i2];
                int i7 = this.a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.c;
                if (i7 == 0) {
                    if (constraintWidget != null) {
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.U;
                        if (dimensionBehaviourArr[0] == dimensionBehaviour2 && constraintWidget.r == 0) {
                            flow.U(constraintWidget, dimensionBehaviour, i5, dimensionBehaviourArr[1], constraintWidget.l());
                        }
                    }
                } else if (constraintWidget != null) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.U;
                    if (dimensionBehaviourArr2[1] == dimensionBehaviour2 && constraintWidget.s == 0) {
                        int i8 = i5;
                        flow.U(constraintWidget, dimensionBehaviourArr2[0], constraintWidget.r(), dimensionBehaviour, i8);
                        i5 = i8;
                    }
                }
                i6++;
            }
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i9 = this.o;
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = this.n + i10;
                if (i11 >= flow.c1) {
                    return;
                }
                ConstraintWidget constraintWidget2 = flow.b1[i11];
                if (this.a == 0) {
                    int iR = constraintWidget2.r();
                    int i12 = flow.Q0;
                    if (constraintWidget2.i0 == 8) {
                        i12 = 0;
                    }
                    this.l = iR + i12 + this.l;
                    int iV = flow.V(constraintWidget2, this.q);
                    if (this.b == null || this.c < iV) {
                        this.b = constraintWidget2;
                        this.c = iV;
                        this.m = iV;
                    }
                } else {
                    int iW = flow.W(constraintWidget2, this.q);
                    int iV2 = flow.V(constraintWidget2, this.q);
                    int i13 = flow.R0;
                    if (constraintWidget2.i0 == 8) {
                        i13 = 0;
                    }
                    this.m = iV2 + i13 + this.m;
                    if (this.b == null || this.c < iW) {
                        this.b = constraintWidget2;
                        this.c = iW;
                        this.l = iW;
                    }
                }
            }
        }

        public final void f(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.d = constraintAnchor;
            this.e = constraintAnchor2;
            this.f = constraintAnchor3;
            this.g = constraintAnchor4;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.k = i5;
            this.q = i6;
        }

        public WidgetsList(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2) {
            this.a = i;
            this.d = constraintAnchor;
            this.e = constraintAnchor2;
            this.f = constraintAnchor3;
            this.g = constraintAnchor4;
            this.h = Flow.this.x0;
            this.i = Flow.this.t0;
            this.j = Flow.this.y0;
            this.k = Flow.this.u0;
            this.q = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:400:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:401:0x06e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:402:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:403:0x06f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:405:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:408:0x0705  */
    /* JADX WARN: Code duplicated, block: B:409:0x0708  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public final void T(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        WidgetsList widgetsList;
        char c;
        int i13;
        boolean z;
        int i14;
        int i15;
        int i16;
        int iCeil;
        Object obj;
        ConstraintWidget constraintWidget;
        int i17;
        int i18;
        int i19;
        int i20;
        ArrayList arrayList = this.X0;
        int i21 = this.s0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.b;
        if (i21 > 0) {
            ConstraintWidget constraintWidget2 = this.V;
            BasicMeasure.Measurer measurer = constraintWidget2 != null ? ((ConstraintWidgetContainer) constraintWidget2).v0 : null;
            if (measurer == null) {
                this.A0 = 0;
                this.B0 = 0;
                this.z0 = false;
                return;
            }
            for (int i22 = 0; i22 < this.s0; i22++) {
                ConstraintWidget constraintWidget3 = this.r0[i22];
                if (constraintWidget3 != null && !(constraintWidget3 instanceof Guideline)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourK = constraintWidget3.k(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourK2 = constraintWidget3.k(1);
                    if (dimensionBehaviourK != dimensionBehaviour || constraintWidget3.r == 1 || dimensionBehaviourK2 != dimensionBehaviour || constraintWidget3.s == 1) {
                        if (dimensionBehaviourK == dimensionBehaviour) {
                            dimensionBehaviourK = dimensionBehaviour2;
                        }
                        if (dimensionBehaviourK2 == dimensionBehaviour) {
                            dimensionBehaviourK2 = dimensionBehaviour2;
                        }
                        BasicMeasure.Measure measure = this.C0;
                        measure.a = dimensionBehaviourK;
                        measure.b = dimensionBehaviourK2;
                        measure.c = constraintWidget3.r();
                        measure.d = constraintWidget3.l();
                        measurer.b(constraintWidget3, measure);
                        constraintWidget3.P(measure.e);
                        constraintWidget3.M(measure.f);
                        constraintWidget3.J(measure.g);
                    }
                }
            }
        }
        int i23 = this.x0;
        int i24 = this.y0;
        int i25 = this.t0;
        int i26 = this.u0;
        int[] iArr2 = new int[2];
        int i27 = (i2 - i23) - i24;
        int i28 = this.W0;
        if (i28 == 1) {
            i27 = (i4 - i25) - i26;
        }
        int i29 = i27;
        int i30 = this.E0;
        if (i28 == 0) {
            i5 = 0;
            if (i30 == -1) {
                this.E0 = 0;
            }
            if (this.F0 == -1) {
                this.F0 = 0;
            }
        } else {
            i5 = 0;
            if (i30 == -1) {
                this.E0 = 0;
            }
            if (this.F0 == -1) {
                this.F0 = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr = this.r0;
        int i31 = i5;
        int i32 = i31;
        while (true) {
            i6 = this.s0;
            i7 = i23;
            if (i31 >= i6) {
                break;
            }
            if (this.r0[i31].i0 == 8) {
                i32++;
            }
            i31++;
            i23 = i7;
        }
        if (i32 > 0) {
            constraintWidgetArr = new ConstraintWidget[i6 - i32];
            i6 = 0;
            int i33 = 0;
            while (i33 < this.s0) {
                ConstraintWidget constraintWidget4 = this.r0[i33];
                int i34 = i24;
                if (constraintWidget4.i0 != 8) {
                    constraintWidgetArr[i6] = constraintWidget4;
                    i6++;
                }
                i33++;
                i24 = i34;
            }
        }
        int i35 = i24;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidgetArr;
        int i36 = i6;
        this.b1 = constraintWidgetArr2;
        this.c1 = i36;
        int i37 = this.U0;
        if (i37 != 0) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.U;
            ConstraintAnchor constraintAnchor = this.K;
            ConstraintAnchor constraintAnchor2 = this.J;
            ConstraintAnchor constraintAnchor3 = this.L;
            ConstraintAnchor constraintAnchor4 = this.M;
            if (i37 == 1) {
                i8 = i25;
                i9 = i26;
                iArr = iArr2;
                i10 = i7;
                i11 = i35;
                i12 = 0;
                int i38 = this.W0;
                if (i36 != 0) {
                    arrayList.clear();
                    WidgetsList widgetsList2 = new WidgetsList(i38, this.J, this.K, this.L, this.M, i29);
                    arrayList.add(widgetsList2);
                    if (i38 == 0) {
                        i14 = 0;
                        int i39 = 0;
                        int i40 = 0;
                        while (i40 < i36) {
                            ConstraintWidget constraintWidget5 = constraintWidgetArr2[i40];
                            int iW = W(constraintWidget5, i29);
                            if (constraintWidget5.U[0] == dimensionBehaviour) {
                                i14++;
                            }
                            int i41 = i14;
                            boolean z2 = (i39 == i29 || (this.Q0 + i39) + iW > i29) && widgetsList2.b != null;
                            if (!z2 && i40 > 0 && (i16 = this.V0) > 0 && i40 % i16 == 0) {
                                z2 = true;
                            }
                            if (z2) {
                                widgetsList2 = new WidgetsList(i38, this.J, this.K, this.L, this.M, i29);
                                widgetsList2.n = i40;
                                arrayList.add(widgetsList2);
                            } else {
                                if (i40 > 0) {
                                    i39 = this.Q0 + iW + i39;
                                }
                                widgetsList2.a(constraintWidget5);
                                i40++;
                                i14 = i41;
                            }
                            i39 = iW;
                            widgetsList2.a(constraintWidget5);
                            i40++;
                            i14 = i41;
                        }
                    } else {
                        i14 = 0;
                        int i42 = 0;
                        int i43 = 0;
                        while (i43 < i36) {
                            ConstraintWidget constraintWidget6 = constraintWidgetArr2[i43];
                            int iV = V(constraintWidget6, i29);
                            if (constraintWidget6.U[1] == dimensionBehaviour) {
                                i14++;
                            }
                            int i44 = i14;
                            boolean z3 = (i42 == i29 || (this.R0 + i42) + iV > i29) && widgetsList2.b != null;
                            if (!z3 && i43 > 0 && (i15 = this.V0) > 0 && i43 % i15 == 0) {
                                z3 = true;
                            }
                            if (z3) {
                                widgetsList2 = new WidgetsList(i38, this.J, this.K, this.L, this.M, i29);
                                widgetsList2.n = i43;
                                arrayList.add(widgetsList2);
                            } else {
                                if (i43 > 0) {
                                    i42 = this.R0 + iV + i42;
                                }
                                widgetsList2.a(constraintWidget6);
                                i43++;
                                i14 = i44;
                            }
                            i42 = iV;
                            widgetsList2.a(constraintWidget6);
                            i43++;
                            i14 = i44;
                        }
                    }
                    int size = arrayList.size();
                    int i45 = this.x0;
                    int i46 = this.t0;
                    int i47 = this.y0;
                    int i48 = this.u0;
                    boolean z4 = dimensionBehaviourArr[0] == dimensionBehaviour2 || dimensionBehaviourArr[1] == dimensionBehaviour2;
                    if (i14 > 0 && z4) {
                        for (int i49 = 0; i49 < size; i49++) {
                            WidgetsList widgetsList3 = (WidgetsList) arrayList.get(i49);
                            if (i38 == 0) {
                                widgetsList3.e(i29 - widgetsList3.d());
                            } else {
                                widgetsList3.e(i29 - widgetsList3.c());
                            }
                        }
                    }
                    int i50 = i45;
                    int i51 = i46;
                    int i52 = i47;
                    int i53 = i48;
                    ConstraintAnchor constraintAnchor5 = constraintAnchor;
                    ConstraintAnchor constraintAnchor6 = constraintAnchor2;
                    ConstraintAnchor constraintAnchor7 = constraintAnchor3;
                    ConstraintAnchor constraintAnchor8 = constraintAnchor4;
                    int iD = 0;
                    int iMax = 0;
                    for (int i54 = 0; i54 < size; i54++) {
                        WidgetsList widgetsList4 = (WidgetsList) arrayList.get(i54);
                        if (i38 == 0) {
                            if (i54 < size - 1) {
                                constraintAnchor8 = ((WidgetsList) arrayList.get(i54 + 1)).b.K;
                                i53 = 0;
                            } else {
                                i53 = this.u0;
                                constraintAnchor8 = constraintAnchor4;
                            }
                            ConstraintAnchor constraintAnchor9 = widgetsList4.b.M;
                            widgetsList4.f(i38, constraintAnchor6, constraintAnchor5, constraintAnchor7, constraintAnchor8, i50, i51, i52, i53, i29);
                            iD = Math.max(iD, widgetsList4.d());
                            iMax += widgetsList4.c();
                            if (i54 > 0) {
                                iMax += this.R0;
                            }
                            constraintAnchor5 = constraintAnchor9;
                            i51 = 0;
                        } else {
                            if (i54 < size - 1) {
                                constraintAnchor7 = ((WidgetsList) arrayList.get(i54 + 1)).b.J;
                                i52 = 0;
                            } else {
                                i52 = this.y0;
                                constraintAnchor7 = constraintAnchor3;
                            }
                            ConstraintAnchor constraintAnchor10 = widgetsList4.b.L;
                            widgetsList4.f(i38, constraintAnchor6, constraintAnchor5, constraintAnchor7, constraintAnchor8, i50, i51, i52, i53, i29);
                            iD += widgetsList4.d();
                            iMax = Math.max(iMax, widgetsList4.c());
                            if (i54 > 0) {
                                iD += this.Q0;
                            }
                            constraintAnchor6 = constraintAnchor10;
                            i50 = 0;
                        }
                    }
                    iArr[0] = iD;
                    iArr[1] = iMax;
                }
            } else if (i37 == 2) {
                i8 = i25;
                i9 = i26;
                iArr = iArr2;
                i10 = i7;
                i11 = i35;
                i12 = 0;
                int i55 = this.W0;
                int iCeil2 = this.V0;
                if (i55 == 0) {
                    if (iCeil2 <= 0) {
                        int i56 = 0;
                        iCeil = 0;
                        for (int i57 = 0; i57 < i36; i57++) {
                            if (i57 > 0) {
                                i56 += this.Q0;
                            }
                            ConstraintWidget constraintWidget7 = constraintWidgetArr2[i57];
                            if (constraintWidget7 != null) {
                                int iW2 = W(constraintWidget7, i29) + i56;
                                if (iW2 > i29) {
                                    break;
                                }
                                iCeil++;
                                i56 = iW2;
                            }
                        }
                    } else {
                        iCeil = iCeil2;
                    }
                    iCeil2 = 0;
                } else {
                    if (iCeil2 <= 0) {
                        int i58 = 0;
                        int i59 = 0;
                        for (int i60 = 0; i60 < i36; i60++) {
                            if (i60 > 0) {
                                i58 += this.R0;
                            }
                            ConstraintWidget constraintWidget8 = constraintWidgetArr2[i60];
                            if (constraintWidget8 != null) {
                                int iV2 = V(constraintWidget8, i29) + i58;
                                if (iV2 > i29) {
                                    break;
                                }
                                i59++;
                                i58 = iV2;
                            }
                        }
                        iCeil2 = i59;
                    }
                    iCeil = 0;
                }
                if (this.a1 == null) {
                    this.a1 = new int[2];
                }
                boolean z5 = (iCeil2 == 0 && i55 == 1) || (iCeil == 0 && i55 == 0);
                while (!z5) {
                    if (i55 == 0) {
                        iCeil2 = (int) Math.ceil(i36 / iCeil);
                    } else {
                        iCeil = (int) Math.ceil(i36 / iCeil2);
                    }
                    ConstraintWidget[] constraintWidgetArr3 = this.Z0;
                    if (constraintWidgetArr3 == null || constraintWidgetArr3.length < iCeil) {
                        obj = null;
                        this.Z0 = new ConstraintWidget[iCeil];
                    } else {
                        obj = null;
                        Arrays.fill(constraintWidgetArr3, (Object) null);
                    }
                    ConstraintWidget[] constraintWidgetArr4 = this.Y0;
                    if (constraintWidgetArr4 == null || constraintWidgetArr4.length < iCeil2) {
                        this.Y0 = new ConstraintWidget[iCeil2];
                    } else {
                        Arrays.fill(constraintWidgetArr4, obj);
                    }
                    for (int i61 = 0; i61 < iCeil; i61++) {
                        for (int i62 = 0; i62 < iCeil2; i62++) {
                            int i63 = (i62 * iCeil) + i61;
                            if (i55 == 1) {
                                i63 = (i61 * iCeil2) + i62;
                            }
                            if (i63 < constraintWidgetArr2.length && (constraintWidget = constraintWidgetArr2[i63]) != null) {
                                int iW3 = W(constraintWidget, i29);
                                ConstraintWidget constraintWidget9 = this.Z0[i61];
                                if (constraintWidget9 == null || constraintWidget9.r() < iW3) {
                                    this.Z0[i61] = constraintWidget;
                                }
                                int iV3 = V(constraintWidget, i29);
                                ConstraintWidget constraintWidget10 = this.Y0[i62];
                                if (constraintWidget10 == null || constraintWidget10.l() < iV3) {
                                    this.Y0[i62] = constraintWidget;
                                }
                            }
                        }
                    }
                    int iW4 = 0;
                    for (int i64 = 0; i64 < iCeil; i64++) {
                        ConstraintWidget constraintWidget11 = this.Z0[i64];
                        if (constraintWidget11 != null) {
                            if (i64 > 0) {
                                iW4 += this.Q0;
                            }
                            iW4 = W(constraintWidget11, i29) + iW4;
                        }
                    }
                    int iV4 = 0;
                    for (int i65 = 0; i65 < iCeil2; i65++) {
                        ConstraintWidget constraintWidget12 = this.Y0[i65];
                        if (constraintWidget12 != null) {
                            if (i65 > 0) {
                                iV4 += this.R0;
                            }
                            iV4 = V(constraintWidget12, i29) + iV4;
                        }
                    }
                    iArr[0] = iW4;
                    iArr[1] = iV4;
                    if (i55 == 0) {
                        if (iW4 <= i29 || iCeil <= 1) {
                            z5 = true;
                        } else {
                            iCeil--;
                        }
                    } else if (iV4 <= i29 || iCeil2 <= 1) {
                        z5 = true;
                    } else {
                        iCeil2--;
                    }
                }
                int[] iArr3 = this.a1;
                iArr3[0] = iCeil;
                iArr3[1] = iCeil2;
                c = 1;
            } else if (i37 != 3) {
                i8 = i25;
                i9 = i26;
                iArr = iArr2;
                i10 = i7;
                i11 = i35;
                c = 1;
                i12 = 0;
            } else {
                int i66 = this.W0;
                if (i36 == 0) {
                    i8 = i25;
                    i9 = i26;
                    iArr = iArr2;
                    i10 = i7;
                    i11 = i35;
                    i12 = 0;
                } else {
                    arrayList.clear();
                    iArr = iArr2;
                    i9 = i26;
                    i10 = i7;
                    i11 = i35;
                    i8 = i25;
                    i12 = 0;
                    WidgetsList widgetsList5 = new WidgetsList(i66, this.J, this.K, this.L, this.M, i29);
                    arrayList.add(widgetsList5);
                    if (i66 == 0) {
                        int i67 = 0;
                        int i68 = 0;
                        i17 = 0;
                        int i69 = 0;
                        while (i67 < i36) {
                            int i70 = i68 + 1;
                            ConstraintWidget constraintWidget13 = constraintWidgetArr2[i67];
                            int iW5 = W(constraintWidget13, i29);
                            int i71 = i66;
                            if (constraintWidget13.U[0] == dimensionBehaviour) {
                                i17++;
                            }
                            int i72 = i17;
                            boolean z6 = (i69 == i29 || (this.Q0 + i69) + iW5 > i29) && widgetsList5.b != null;
                            if (!z6 && i67 > 0 && (i20 = this.V0) > 0 && i70 > i20) {
                                z6 = true;
                            }
                            if (z6) {
                                i19 = i67;
                                i66 = i71;
                                widgetsList5 = new WidgetsList(i66, this.J, this.K, this.L, this.M, i29);
                                widgetsList5.n = i19;
                                arrayList.add(widgetsList5);
                                i69 = iW5;
                                i68 = i70;
                            } else {
                                i19 = i67;
                                i66 = i71;
                                i69 = i19 > 0 ? this.Q0 + iW5 + i69 : iW5;
                                i68 = 0;
                            }
                            widgetsList5.a(constraintWidget13);
                            i67 = i19 + 1;
                            i17 = i72;
                        }
                    } else {
                        int i73 = 0;
                        int i74 = 0;
                        int i75 = 0;
                        while (i75 < i36) {
                            ConstraintWidget constraintWidget14 = constraintWidgetArr2[i75];
                            int iV5 = V(constraintWidget14, i29);
                            if (constraintWidget14.U[1] == dimensionBehaviour) {
                                i73++;
                            }
                            int i76 = i73;
                            boolean z7 = (i74 == i29 || (this.R0 + i74) + iV5 > i29) && widgetsList5.b != null;
                            if (!z7 && i75 > 0 && (i18 = this.V0) > 0 && i18 < 0) {
                                z7 = true;
                            }
                            if (z7) {
                                widgetsList5 = new WidgetsList(i66, this.J, this.K, this.L, this.M, i29);
                                widgetsList5.n = i75;
                                arrayList.add(widgetsList5);
                            } else {
                                if (i75 > 0) {
                                    i74 = this.R0 + iV5 + i74;
                                }
                                widgetsList5.a(constraintWidget14);
                                i75++;
                                i73 = i76;
                            }
                            i74 = iV5;
                            widgetsList5.a(constraintWidget14);
                            i75++;
                            i73 = i76;
                        }
                        i17 = i73;
                    }
                    int size2 = arrayList.size();
                    int i77 = this.x0;
                    int i78 = this.t0;
                    int i79 = this.y0;
                    int i80 = this.u0;
                    boolean z8 = dimensionBehaviourArr[0] == dimensionBehaviour2 || dimensionBehaviourArr[1] == dimensionBehaviour2;
                    if (i17 > 0 && z8) {
                        for (int i81 = 0; i81 < size2; i81++) {
                            WidgetsList widgetsList6 = (WidgetsList) arrayList.get(i81);
                            if (i66 == 0) {
                                widgetsList6.e(i29 - widgetsList6.d());
                            } else {
                                widgetsList6.e(i29 - widgetsList6.c());
                            }
                        }
                    }
                    int i82 = i77;
                    int i83 = i78;
                    int i84 = i79;
                    int i85 = i80;
                    ConstraintAnchor constraintAnchor11 = constraintAnchor;
                    ConstraintAnchor constraintAnchor12 = constraintAnchor2;
                    ConstraintAnchor constraintAnchor13 = constraintAnchor3;
                    ConstraintAnchor constraintAnchor14 = constraintAnchor4;
                    int iD2 = 0;
                    int iMax2 = 0;
                    for (int i86 = 0; i86 < size2; i86++) {
                        WidgetsList widgetsList7 = (WidgetsList) arrayList.get(i86);
                        if (i66 == 0) {
                            if (i86 < size2 - 1) {
                                constraintAnchor14 = ((WidgetsList) arrayList.get(i86 + 1)).b.K;
                                i85 = 0;
                            } else {
                                i85 = this.u0;
                                constraintAnchor14 = constraintAnchor4;
                            }
                            ConstraintAnchor constraintAnchor15 = widgetsList7.b.M;
                            widgetsList7.f(i66, constraintAnchor12, constraintAnchor11, constraintAnchor13, constraintAnchor14, i82, i83, i84, i85, i29);
                            iD2 = Math.max(iD2, widgetsList7.d());
                            iMax2 += widgetsList7.c();
                            if (i86 > 0) {
                                iMax2 += this.R0;
                            }
                            constraintAnchor11 = constraintAnchor15;
                            i83 = 0;
                        } else {
                            if (i86 < size2 - 1) {
                                constraintAnchor13 = ((WidgetsList) arrayList.get(i86 + 1)).b.J;
                                i84 = 0;
                            } else {
                                i84 = this.y0;
                                constraintAnchor13 = constraintAnchor3;
                            }
                            ConstraintAnchor constraintAnchor16 = widgetsList7.b.L;
                            widgetsList7.f(i66, constraintAnchor12, constraintAnchor11, constraintAnchor13, constraintAnchor14, i82, i83, i84, i85, i29);
                            iD2 += widgetsList7.d();
                            iMax2 = Math.max(iMax2, widgetsList7.c());
                            if (i86 > 0) {
                                iD2 += this.Q0;
                            }
                            constraintAnchor12 = constraintAnchor16;
                            i82 = 0;
                        }
                    }
                    iArr[0] = iD2;
                    iArr[1] = iMax2;
                }
            }
            c = 1;
        } else {
            i8 = i25;
            i9 = i26;
            iArr = iArr2;
            i10 = i7;
            i11 = i35;
            i12 = 0;
            int i87 = this.W0;
            if (i36 == 0) {
                c = 1;
            } else {
                if (arrayList.size() == 0) {
                    widgetsList = new WidgetsList(i87, this.J, this.K, this.L, this.M, i29);
                    arrayList.add(widgetsList);
                } else {
                    widgetsList = (WidgetsList) arrayList.get(0);
                    widgetsList.c = 0;
                    widgetsList.b = null;
                    widgetsList.l = 0;
                    widgetsList.m = 0;
                    widgetsList.n = 0;
                    widgetsList.o = 0;
                    widgetsList.p = 0;
                    widgetsList.f(i87, this.J, this.K, this.L, this.M, this.x0, this.t0, this.y0, this.u0, i29);
                }
                for (int i88 = 0; i88 < i36; i88++) {
                    widgetsList.a(constraintWidgetArr2[i88]);
                }
                i12 = 0;
                iArr[0] = widgetsList.d();
                c = 1;
                iArr[1] = widgetsList.c();
            }
        }
        int iMin = iArr[i12] + i10 + i11;
        int iMin2 = iArr[c] + i8 + i9;
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                iMin = Math.min(iMin, i2);
            } else {
                i13 = i3;
                if (i != 0) {
                    iMin = i12;
                }
            }
            if (i13 == 1073741824) {
                iMin2 = i4;
            } else if (i13 == Integer.MIN_VALUE) {
                iMin2 = Math.min(iMin2, i4);
            } else if (i13 != 0) {
                iMin2 = i12;
            }
            this.A0 = iMin;
            this.B0 = iMin2;
            P(iMin);
            M(iMin2);
            if (this.s0 > 0) {
                z = c;
            } else {
                z = i12;
            }
            this.z0 = z;
        }
        iMin = i2;
        i13 = i3;
        if (i13 == 1073741824) {
            iMin2 = i4;
        } else if (i13 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i4);
        } else if (i13 != 0) {
            iMin2 = i12;
        }
        this.A0 = iMin;
        this.B0 = iMin2;
        P(iMin);
        M(iMin2);
        if (this.s0 > 0) {
            z = c;
        } else {
            z = i12;
        }
        this.z0 = z;
    }

    public final int V(ConstraintWidget constraintWidget, int i) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.U[1] == ConstraintWidget.DimensionBehaviour.c) {
            int i2 = constraintWidget.s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.z * i);
                if (i3 != constraintWidget.l()) {
                    constraintWidget.g = true;
                    U(constraintWidget, constraintWidget.U[0], constraintWidget.r(), ConstraintWidget.DimensionBehaviour.a, i3);
                }
                return i3;
            }
            constraintWidget2 = constraintWidget;
            if (i2 == 1) {
                return constraintWidget2.l();
            }
            if (i2 == 3) {
                return (int) ((constraintWidget2.r() * constraintWidget2.Y) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.l();
    }

    public final int W(ConstraintWidget constraintWidget, int i) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.U[0] == ConstraintWidget.DimensionBehaviour.c) {
            int i2 = constraintWidget.r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.w * i);
                if (i3 != constraintWidget.r()) {
                    constraintWidget.g = true;
                    U(constraintWidget, ConstraintWidget.DimensionBehaviour.a, i3, constraintWidget.U[1], constraintWidget.l());
                }
                return i3;
            }
            constraintWidget2 = constraintWidget;
            if (i2 == 1) {
                return constraintWidget2.r();
            }
            if (i2 == 3) {
                return (int) ((constraintWidget2.l() * constraintWidget2.Y) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.r();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void c(LinearSystem linearSystem, boolean z) {
        ConstraintWidget constraintWidget;
        float f;
        int i;
        ArrayList arrayList = this.X0;
        super.c(linearSystem, z);
        ConstraintWidget constraintWidget2 = this.V;
        boolean z2 = constraintWidget2 != null && ((ConstraintWidgetContainer) constraintWidget2).w0;
        int i2 = this.U0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((WidgetsList) arrayList.get(i3)).b(z2, i3, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((WidgetsList) arrayList.get(i4)).b(z2, i4, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.a1 != null && this.Z0 != null && this.Y0 != null) {
                for (int i5 = 0; i5 < this.c1; i5++) {
                    this.b1[i5].E();
                }
                int[] iArr = this.a1;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.K0;
                ConstraintWidget constraintWidget3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.K0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    ConstraintWidget constraintWidget4 = this.Z0[i];
                    if (constraintWidget4 != null) {
                        ConstraintAnchor constraintAnchor = constraintWidget4.J;
                        if (constraintWidget4.i0 != 8) {
                            if (i8 == 0) {
                                constraintWidget4.g(constraintAnchor, this.J, this.x0);
                                constraintWidget4.k0 = this.E0;
                                constraintWidget4.f0 = f;
                            }
                            if (i8 == i6 - 1) {
                                constraintWidget4.g(constraintWidget4.L, this.L, this.y0);
                            }
                            if (i8 > 0 && constraintWidget3 != null) {
                                ConstraintAnchor constraintAnchor2 = constraintWidget3.L;
                                constraintWidget4.g(constraintAnchor, constraintAnchor2, this.Q0);
                                constraintWidget3.g(constraintAnchor2, constraintAnchor, 0);
                            }
                            constraintWidget3 = constraintWidget4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    ConstraintWidget constraintWidget5 = this.Y0[i9];
                    if (constraintWidget5 != null) {
                        ConstraintAnchor constraintAnchor3 = constraintWidget5.K;
                        if (constraintWidget5.i0 != 8) {
                            if (i9 == 0) {
                                constraintWidget5.g(constraintAnchor3, this.K, this.t0);
                                constraintWidget5.l0 = this.F0;
                                constraintWidget5.g0 = this.L0;
                            }
                            if (i9 == i7 - 1) {
                                constraintWidget5.g(constraintWidget5.M, this.M, this.u0);
                            }
                            if (i9 > 0 && constraintWidget3 != null) {
                                ConstraintAnchor constraintAnchor4 = constraintWidget3.M;
                                constraintWidget5.g(constraintAnchor3, constraintAnchor4, this.R0);
                                constraintWidget3.g(constraintAnchor4, constraintAnchor3, 0);
                            }
                            constraintWidget3 = constraintWidget5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.W0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        ConstraintWidget[] constraintWidgetArr = this.b1;
                        if (i12 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i12]) != null && constraintWidget.i0 != 8) {
                            ConstraintWidget constraintWidget6 = this.Z0[i10];
                            ConstraintWidget constraintWidget7 = this.Y0[i11];
                            if (constraintWidget != constraintWidget6) {
                                constraintWidget.g(constraintWidget.J, constraintWidget6.J, 0);
                                constraintWidget.g(constraintWidget.L, constraintWidget6.L, 0);
                            }
                            if (constraintWidget != constraintWidget7) {
                                constraintWidget.g(constraintWidget.K, constraintWidget7.K, 0);
                                constraintWidget.g(constraintWidget.M, constraintWidget7.M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((WidgetsList) arrayList.get(0)).b(z2, 0, true);
        }
        this.z0 = false;
    }
}
