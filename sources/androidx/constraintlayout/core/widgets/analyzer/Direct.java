package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class Direct {
    public static final BasicMeasure.Measure a = new BasicMeasure.Measure();

    public static boolean a(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.U;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
        ConstraintWidget constraintWidget2 = constraintWidget.V;
        ConstraintWidgetContainer constraintWidgetContainer = constraintWidget2 != null ? (ConstraintWidgetContainer) constraintWidget2 : null;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.a;
        if (constraintWidgetContainer != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer.U[0];
        }
        if (constraintWidgetContainer != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidgetContainer.U[1];
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.b;
        boolean z = dimensionBehaviour == dimensionBehaviour3 || constraintWidget.B() || dimensionBehaviour == dimensionBehaviour7 || (dimensionBehaviour == dimensionBehaviour6 && constraintWidget.r == 0 && constraintWidget.Y == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && constraintWidget.u(0)) || (dimensionBehaviour == dimensionBehaviour6 && constraintWidget.r == 1 && constraintWidget.v(0, constraintWidget.r()));
        boolean z2 = dimensionBehaviour2 == dimensionBehaviour3 || constraintWidget.C() || dimensionBehaviour2 == dimensionBehaviour7 || (dimensionBehaviour2 == dimensionBehaviour6 && constraintWidget.s == 0 && constraintWidget.Y == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && constraintWidget.u(1)) || (dimensionBehaviour2 == dimensionBehaviour6 && constraintWidget.s == 1 && constraintWidget.v(1, constraintWidget.l()));
        return (constraintWidget.Y > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (z || z2)) || (z && z2);
    }

    public static void b(int i, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, boolean z) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        boolean z2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.m) {
            return;
        }
        if (!(constraintWidget instanceof ConstraintWidgetContainer) && constraintWidget.A() && a(constraintWidget)) {
            ConstraintWidgetContainer.V(constraintWidget, measurer, new BasicMeasure.Measure());
        }
        ConstraintAnchor constraintAnchorJ = constraintWidget.j(ConstraintAnchor.Type.a);
        ConstraintAnchor constraintAnchorJ2 = constraintWidget.j(ConstraintAnchor.Type.c);
        int iD = constraintAnchorJ.d();
        int iD2 = constraintAnchorJ2.d();
        HashSet<ConstraintAnchor> hashSet = constraintAnchorJ.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.c;
        if (hashSet != null && constraintAnchorJ.c) {
            for (ConstraintAnchor constraintAnchor5 : hashSet) {
                ConstraintWidget constraintWidget2 = constraintAnchor5.d;
                int i2 = i + 1;
                boolean zA = a(constraintWidget2);
                ConstraintAnchor constraintAnchor6 = constraintWidget2.J;
                ConstraintAnchor constraintAnchor7 = constraintWidget2.L;
                if (constraintWidget2.A() && zA) {
                    z2 = true;
                    ConstraintWidgetContainer.V(constraintWidget2, measurer, new BasicMeasure.Measure());
                } else {
                    z2 = true;
                }
                boolean z3 = ((constraintAnchor5 == constraintAnchor6 && (constraintAnchor4 = constraintAnchor7.f) != null && constraintAnchor4.c) || (constraintAnchor5 == constraintAnchor7 && (constraintAnchor3 = constraintAnchor6.f) != null && constraintAnchor3.c)) ? z2 : false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget2.U[0];
                if (dimensionBehaviour2 != dimensionBehaviour || zA) {
                    if (!constraintWidget2.A()) {
                        if (constraintAnchor5 == constraintAnchor6 && constraintAnchor7.f == null) {
                            int iE = constraintAnchor6.e() + iD;
                            constraintWidget2.K(iE, constraintWidget2.r() + iE);
                            b(i2, constraintWidget2, measurer, z);
                        } else if (constraintAnchor5 == constraintAnchor7 && constraintAnchor6.f == null) {
                            int iE2 = iD - constraintAnchor7.e();
                            constraintWidget2.K(iE2 - constraintWidget2.r(), iE2);
                            b(i2, constraintWidget2, measurer, z);
                        } else if (z3 && !constraintWidget2.y()) {
                            c(i2, constraintWidget2, measurer, z);
                        }
                    }
                } else if (dimensionBehaviour2 == dimensionBehaviour && constraintWidget2.v >= 0 && constraintWidget2.u >= 0 && (constraintWidget2.i0 == 8 || (constraintWidget2.r == 0 && constraintWidget2.Y == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                    if (!constraintWidget2.y() && !constraintWidget2.G && z3 && !constraintWidget2.y()) {
                        d(i2, constraintWidget, measurer, constraintWidget2, z);
                    }
                }
            }
        }
        if (constraintWidget instanceof Guideline) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = constraintAnchorJ2.a;
        if (hashSet2 != null && constraintAnchorJ2.c) {
            for (ConstraintAnchor constraintAnchor8 : hashSet2) {
                ConstraintWidget constraintWidget3 = constraintAnchor8.d;
                int i3 = i + 1;
                boolean zA2 = a(constraintWidget3);
                ConstraintAnchor constraintAnchor9 = constraintWidget3.J;
                ConstraintAnchor constraintAnchor10 = constraintWidget3.L;
                if (constraintWidget3.A() && zA2) {
                    ConstraintWidgetContainer.V(constraintWidget3, measurer, new BasicMeasure.Measure());
                }
                boolean z4 = (constraintAnchor8 == constraintAnchor9 && (constraintAnchor2 = constraintAnchor10.f) != null && constraintAnchor2.c) || (constraintAnchor8 == constraintAnchor10 && (constraintAnchor = constraintAnchor9.f) != null && constraintAnchor.c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.U[0];
                if (dimensionBehaviour3 != dimensionBehaviour || zA2) {
                    if (!constraintWidget3.A()) {
                        if (constraintAnchor8 == constraintAnchor9 && constraintAnchor10.f == null) {
                            int iE3 = constraintAnchor9.e() + iD2;
                            constraintWidget3.K(iE3, constraintWidget3.r() + iE3);
                            b(i3, constraintWidget3, measurer, z);
                        } else if (constraintAnchor8 == constraintAnchor10 && constraintAnchor9.f == null) {
                            int iE4 = iD2 - constraintAnchor10.e();
                            constraintWidget3.K(iE4 - constraintWidget3.r(), iE4);
                            b(i3, constraintWidget3, measurer, z);
                        } else if (z4 && !constraintWidget3.y()) {
                            c(i3, constraintWidget3, measurer, z);
                        }
                    }
                } else if (dimensionBehaviour3 == dimensionBehaviour && constraintWidget3.v >= 0 && constraintWidget3.u >= 0) {
                    if (constraintWidget3.i0 == 8 || (constraintWidget3.r == 0 && constraintWidget3.Y == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                        if (!constraintWidget3.y() && !constraintWidget3.G && z4 && !constraintWidget3.y()) {
                            d(i3, constraintWidget, measurer, constraintWidget3, z);
                        }
                    }
                }
            }
        }
        constraintWidget.m = true;
    }

    public static void c(int i, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, boolean z) {
        float f = constraintWidget.f0;
        ConstraintAnchor constraintAnchor = constraintWidget.J;
        int iD = constraintAnchor.f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget.L;
        int iD2 = constraintAnchor2.f.d();
        int iE = constraintAnchor.e() + iD;
        int iE2 = iD2 - constraintAnchor2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iR = constraintWidget.r();
        int i2 = (iD2 - iD) - iR;
        if (iD > iD2) {
            i2 = (iD - iD2) - iR;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iD;
        int i4 = i3 + iR;
        if (iD > iD2) {
            i4 = i3 - iR;
        }
        constraintWidget.K(i3, i4);
        b(i + 1, constraintWidget, measurer, z);
    }

    public static void d(int i, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget2, boolean z) {
        float f = constraintWidget2.f0;
        ConstraintAnchor constraintAnchor = constraintWidget2.J;
        int iE = constraintAnchor.e() + constraintAnchor.f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.L;
        int iD = constraintAnchor2.f.d() - constraintAnchor2.e();
        if (iD >= iE) {
            int iR = constraintWidget2.r();
            if (constraintWidget2.i0 != 8) {
                int i2 = constraintWidget2.r;
                if (i2 == 2) {
                    iR = (int) (constraintWidget2.f0 * 0.5f * (constraintWidget instanceof ConstraintWidgetContainer ? constraintWidget.r() : constraintWidget.V.r()));
                } else if (i2 == 0) {
                    iR = iD - iE;
                }
                iR = Math.max(constraintWidget2.u, iR);
                int i3 = constraintWidget2.v;
                if (i3 > 0) {
                    iR = Math.min(i3, iR);
                }
            }
            int i4 = iE + ((int) ((f * ((iD - iE) - iR)) + 0.5f));
            constraintWidget2.K(i4, iR + i4);
            b(i + 1, constraintWidget2, measurer, z);
        }
    }

    public static void e(int i, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer) {
        float f = constraintWidget.g0;
        ConstraintAnchor constraintAnchor = constraintWidget.K;
        int iD = constraintAnchor.f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget.M;
        int iD2 = constraintAnchor2.f.d();
        int iE = constraintAnchor.e() + iD;
        int iE2 = iD2 - constraintAnchor2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iL = constraintWidget.l();
        int i2 = (iD2 - iD) - iL;
        if (iD > iD2) {
            i2 = (iD - iD2) - iL;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iD + i3;
        int i5 = i4 + iL;
        if (iD > iD2) {
            i4 = iD - i3;
            i5 = i4 - iL;
        }
        constraintWidget.L(i4, i5);
        g(i + 1, constraintWidget, measurer);
    }

    public static void f(int i, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget2) {
        float f = constraintWidget2.g0;
        ConstraintAnchor constraintAnchor = constraintWidget2.K;
        int iE = constraintAnchor.e() + constraintAnchor.f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.M;
        int iD = constraintAnchor2.f.d() - constraintAnchor2.e();
        if (iD >= iE) {
            int iL = constraintWidget2.l();
            if (constraintWidget2.i0 != 8) {
                int i2 = constraintWidget2.s;
                if (i2 == 2) {
                    iL = (int) (f * 0.5f * (constraintWidget instanceof ConstraintWidgetContainer ? constraintWidget.l() : constraintWidget.V.l()));
                } else if (i2 == 0) {
                    iL = iD - iE;
                }
                iL = Math.max(constraintWidget2.x, iL);
                int i3 = constraintWidget2.y;
                if (i3 > 0) {
                    iL = Math.min(i3, iL);
                }
            }
            int i4 = iE + ((int) ((f * ((iD - iE) - iL)) + 0.5f));
            constraintWidget2.L(i4, iL + i4);
            g(i + 1, constraintWidget2, measurer);
        }
    }

    public static void g(int i, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer) {
        boolean z;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.n) {
            return;
        }
        if (!(constraintWidget instanceof ConstraintWidgetContainer) && constraintWidget.A() && a(constraintWidget)) {
            ConstraintWidgetContainer.V(constraintWidget, measurer, new BasicMeasure.Measure());
        }
        ConstraintAnchor constraintAnchorJ = constraintWidget.j(ConstraintAnchor.Type.b);
        ConstraintAnchor constraintAnchorJ2 = constraintWidget.j(ConstraintAnchor.Type.d);
        int iD = constraintAnchorJ.d();
        int iD2 = constraintAnchorJ2.d();
        HashSet<ConstraintAnchor> hashSet = constraintAnchorJ.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.c;
        if (hashSet != null && constraintAnchorJ.c) {
            for (ConstraintAnchor constraintAnchor5 : hashSet) {
                ConstraintWidget constraintWidget2 = constraintAnchor5.d;
                int i2 = i + 1;
                boolean zA = a(constraintWidget2);
                ConstraintAnchor constraintAnchor6 = constraintWidget2.K;
                ConstraintAnchor constraintAnchor7 = constraintWidget2.M;
                if (constraintWidget2.A() && zA) {
                    ConstraintWidgetContainer.V(constraintWidget2, measurer, new BasicMeasure.Measure());
                }
                boolean z2 = (constraintAnchor5 == constraintAnchor6 && (constraintAnchor4 = constraintAnchor7.f) != null && constraintAnchor4.c) || (constraintAnchor5 == constraintAnchor7 && (constraintAnchor3 = constraintAnchor6.f) != null && constraintAnchor3.c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget2.U[1];
                if (dimensionBehaviour2 != dimensionBehaviour || zA) {
                    if (!constraintWidget2.A()) {
                        if (constraintAnchor5 == constraintAnchor6 && constraintAnchor7.f == null) {
                            int iE = constraintAnchor6.e() + iD;
                            constraintWidget2.L(iE, constraintWidget2.l() + iE);
                            g(i2, constraintWidget2, measurer);
                        } else if (constraintAnchor5 == constraintAnchor7 && constraintAnchor6.f == null) {
                            int iE2 = iD - constraintAnchor7.e();
                            constraintWidget2.L(iE2 - constraintWidget2.l(), iE2);
                            g(i2, constraintWidget2, measurer);
                        } else if (z2 && !constraintWidget2.z()) {
                            e(i2, constraintWidget2, measurer);
                        }
                    }
                } else if (dimensionBehaviour2 == dimensionBehaviour && constraintWidget2.y >= 0 && constraintWidget2.x >= 0 && (constraintWidget2.i0 == 8 || (constraintWidget2.s == 0 && constraintWidget2.Y == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                    if (!constraintWidget2.z() && !constraintWidget2.G && z2 && !constraintWidget2.z()) {
                        f(i2, constraintWidget, measurer, constraintWidget2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (constraintWidget instanceof Guideline) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = constraintAnchorJ2.a;
        if (hashSet2 != null && constraintAnchorJ2.c) {
            for (ConstraintAnchor constraintAnchor8 : hashSet2) {
                ConstraintWidget constraintWidget3 = constraintAnchor8.d;
                int i3 = i + 1;
                boolean zA2 = a(constraintWidget3);
                ConstraintAnchor constraintAnchor9 = constraintWidget3.K;
                ConstraintAnchor constraintAnchor10 = constraintWidget3.M;
                if (constraintWidget3.A() && zA2) {
                    ConstraintWidgetContainer.V(constraintWidget3, measurer, new BasicMeasure.Measure());
                }
                boolean z4 = (constraintAnchor8 == constraintAnchor9 && (constraintAnchor2 = constraintAnchor10.f) != null && constraintAnchor2.c) || (constraintAnchor8 == constraintAnchor10 && (constraintAnchor = constraintAnchor9.f) != null && constraintAnchor.c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.U[1];
                if (dimensionBehaviour3 != dimensionBehaviour || zA2) {
                    if (!constraintWidget3.A()) {
                        if (constraintAnchor8 == constraintAnchor9 && constraintAnchor10.f == null) {
                            int iE3 = constraintAnchor9.e() + iD2;
                            constraintWidget3.L(iE3, constraintWidget3.l() + iE3);
                            g(i3, constraintWidget3, measurer);
                        } else if (constraintAnchor8 == constraintAnchor10 && constraintAnchor9.f == null) {
                            int iE4 = iD2 - constraintAnchor10.e();
                            constraintWidget3.L(iE4 - constraintWidget3.l(), iE4);
                            g(i3, constraintWidget3, measurer);
                        } else if (z4 && !constraintWidget3.z()) {
                            e(i3, constraintWidget3, measurer);
                        }
                    }
                } else if (dimensionBehaviour3 == dimensionBehaviour && constraintWidget3.y >= 0 && constraintWidget3.x >= 0 && (constraintWidget3.i0 == 8 || (constraintWidget3.s == 0 && constraintWidget3.Y == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                    if (!constraintWidget3.z() && !constraintWidget3.G && z4 && !constraintWidget3.z()) {
                        f(i3, constraintWidget, measurer, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor constraintAnchorJ3 = constraintWidget.j(ConstraintAnchor.Type.e);
        if (constraintAnchorJ3.a != null && constraintAnchorJ3.c) {
            int iD3 = constraintAnchorJ3.d();
            for (ConstraintAnchor constraintAnchor11 : constraintAnchorJ3.a) {
                ConstraintWidget constraintWidget4 = constraintAnchor11.d;
                int i4 = i + 1;
                boolean zA3 = a(constraintWidget4);
                ConstraintAnchor constraintAnchor12 = constraintWidget4.N;
                if (constraintWidget4.A() && zA3) {
                    ConstraintWidgetContainer.V(constraintWidget4, measurer, new BasicMeasure.Measure());
                }
                if (constraintWidget4.U[z3 ? 1 : 0] != dimensionBehaviour || zA3) {
                    if (!constraintWidget4.A()) {
                        if (constraintAnchor11 == constraintAnchor12) {
                            int iE5 = constraintAnchor11.e() + iD3;
                            if (constraintWidget4.E) {
                                int i5 = iE5 - constraintWidget4.c0;
                                int i6 = constraintWidget4.X + i5;
                                constraintWidget4.b0 = i5;
                                constraintWidget4.K.l(i5);
                                constraintWidget4.M.l(i6);
                                constraintAnchor12.l(iE5);
                                z = z3 ? 1 : 0;
                                constraintWidget4.l = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            g(i4, constraintWidget4, measurer);
                        }
                        z3 = z;
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        constraintWidget.n = z3;
    }
}
