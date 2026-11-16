package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class VerticalWidgetRun extends WidgetRun {
    public final DependencyNode k;
    public BaselineDimensionDependency l;

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    public final void m() {
        this.g = false;
        DependencyNode dependencyNode = this.h;
        dependencyNode.c();
        dependencyNode.j = false;
        DependencyNode dependencyNode2 = this.i;
        dependencyNode2.c();
        dependencyNode2.j = false;
        DependencyNode dependencyNode3 = this.k;
        dependencyNode3.c();
        dependencyNode3.j = false;
        this.e.j = false;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public final void a(Dependency dependency) {
        float f;
        float f2;
        float f3;
        int i;
        if (this.j.ordinal() == 3) {
            ConstraintWidget constraintWidget = this.b;
            l(constraintWidget.K, constraintWidget.M, 1);
            return;
        }
        DimensionDependency dimensionDependency = this.e;
        boolean z = dimensionDependency.c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.c;
        if (z && !dimensionDependency.j && this.d == dimensionBehaviour) {
            ConstraintWidget constraintWidget2 = this.b;
            int i2 = constraintWidget2.s;
            if (i2 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.V;
                if (constraintWidget3 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidget3.e.e;
                    if (dimensionDependency2.j) {
                        dimensionDependency.d((int) ((dimensionDependency2.g * constraintWidget2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                DimensionDependency dimensionDependency3 = constraintWidget2.d.e;
                if (dimensionDependency3.j) {
                    int i3 = constraintWidget2.Z;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = dimensionDependency3.g * constraintWidget2.Y;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = dimensionDependency3.g;
                            f2 = constraintWidget2.Y;
                        }
                        dimensionDependency.d(i);
                    } else {
                        f = dimensionDependency3.g;
                        f2 = constraintWidget2.Y;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    dimensionDependency.d(i);
                }
            }
        }
        DependencyNode dependencyNode = this.h;
        boolean z2 = dependencyNode.c;
        ArrayList arrayList = dependencyNode.l;
        if (z2) {
            DependencyNode dependencyNode2 = this.i;
            boolean z3 = dependencyNode2.c;
            ArrayList arrayList2 = dependencyNode2.l;
            if (z3) {
                if (dependencyNode.j && dependencyNode2.j && dimensionDependency.j) {
                    return;
                }
                if (!dimensionDependency.j && this.d == dimensionBehaviour) {
                    ConstraintWidget constraintWidget4 = this.b;
                    if (constraintWidget4.r == 0 && !constraintWidget4.z()) {
                        DependencyNode dependencyNode3 = (DependencyNode) arrayList.get(0);
                        DependencyNode dependencyNode4 = (DependencyNode) arrayList2.get(0);
                        int i4 = dependencyNode3.g + dependencyNode.f;
                        int i5 = dependencyNode4.g + dependencyNode2.f;
                        dependencyNode.d(i4);
                        dependencyNode2.d(i5);
                        dimensionDependency.d(i5 - i4);
                        return;
                    }
                }
                if (!dimensionDependency.j && this.d == dimensionBehaviour && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    DependencyNode dependencyNode5 = (DependencyNode) arrayList.get(0);
                    int i6 = (((DependencyNode) arrayList2.get(0)).g + dependencyNode2.f) - (dependencyNode5.g + dependencyNode.f);
                    int i7 = dimensionDependency.m;
                    if (i6 < i7) {
                        dimensionDependency.d(i6);
                    } else {
                        dimensionDependency.d(i7);
                    }
                }
                if (dimensionDependency.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    DependencyNode dependencyNode6 = (DependencyNode) arrayList.get(0);
                    DependencyNode dependencyNode7 = (DependencyNode) arrayList2.get(0);
                    int i8 = dependencyNode6.g;
                    int i9 = dependencyNode.f + i8;
                    int i10 = dependencyNode7.g;
                    int i11 = dependencyNode2.f + i10;
                    float f4 = this.b.g0;
                    if (dependencyNode6 == dependencyNode7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    dependencyNode.d((int) ((((i10 - i8) - dimensionDependency.g) * f4) + i8 + 0.5f));
                    dependencyNode2.d(dependencyNode.g + dimensionDependency.g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5 = this.b;
        boolean z = constraintWidget5.a;
        DimensionDependency dimensionDependency = this.e;
        if (z) {
            dimensionDependency.d(constraintWidget5.l());
        }
        boolean z2 = dimensionDependency.j;
        ArrayList arrayList = dimensionDependency.k;
        ArrayList arrayList2 = dimensionDependency.l;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.c;
        DependencyNode dependencyNode = this.i;
        DependencyNode dependencyNode2 = this.h;
        if (!z2) {
            ConstraintWidget constraintWidget6 = this.b;
            this.d = constraintWidget6.U[1];
            if (constraintWidget6.E) {
                this.l = new BaselineDimensionDependency(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.d;
            if (dimensionBehaviour4 != dimensionBehaviour3) {
                if (dimensionBehaviour4 == dimensionBehaviour && (constraintWidget4 = this.b.V) != null && constraintWidget4.U[1] == dimensionBehaviour2) {
                    int iL = (constraintWidget4.l() - this.b.K.e()) - this.b.M.e();
                    WidgetRun.b(dependencyNode2, constraintWidget4.e.h, this.b.K.e());
                    WidgetRun.b(dependencyNode, constraintWidget4.e.i, -this.b.M.e());
                    dimensionDependency.d(iL);
                    return;
                }
                if (dimensionBehaviour4 == dimensionBehaviour2) {
                    dimensionDependency.d(this.b.l());
                }
            }
        } else if (this.d == dimensionBehaviour && (constraintWidget2 = (constraintWidget = this.b).V) != null && constraintWidget2.U[1] == dimensionBehaviour2) {
            WidgetRun.b(dependencyNode2, constraintWidget2.e.h, constraintWidget.K.e());
            WidgetRun.b(dependencyNode, constraintWidget2.e.i, -this.b.M.e());
            return;
        }
        boolean z3 = dimensionDependency.j;
        DependencyNode dependencyNode3 = this.k;
        if (z3) {
            ConstraintWidget constraintWidget7 = this.b;
            if (constraintWidget7.a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.R;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f != null) {
                    boolean z4 = constraintWidget7.z();
                    ConstraintWidget constraintWidget8 = this.b;
                    if (z4) {
                        dependencyNode2.f = constraintWidget8.R[2].e();
                        dependencyNode.f = -this.b.R[3].e();
                    } else {
                        DependencyNode dependencyNodeH = WidgetRun.h(constraintWidget8.R[2]);
                        if (dependencyNodeH != null) {
                            WidgetRun.b(dependencyNode2, dependencyNodeH, this.b.R[2].e());
                        }
                        DependencyNode dependencyNodeH2 = WidgetRun.h(this.b.R[3]);
                        if (dependencyNodeH2 != null) {
                            WidgetRun.b(dependencyNode, dependencyNodeH2, -this.b.R[3].e());
                        }
                        dependencyNode2.b = true;
                        dependencyNode.b = true;
                    }
                    ConstraintWidget constraintWidget9 = this.b;
                    if (constraintWidget9.E) {
                        WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget9.c0);
                        return;
                    }
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode dependencyNodeH3 = WidgetRun.h(constraintAnchor);
                    if (dependencyNodeH3 != null) {
                        WidgetRun.b(dependencyNode2, dependencyNodeH3, this.b.R[2].e());
                        WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.g);
                        ConstraintWidget constraintWidget10 = this.b;
                        if (constraintWidget10.E) {
                            WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget10.c0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                if (constraintAnchor3.f != null) {
                    DependencyNode dependencyNodeH4 = WidgetRun.h(constraintAnchor3);
                    if (dependencyNodeH4 != null) {
                        WidgetRun.b(dependencyNode, dependencyNodeH4, -this.b.R[3].e());
                        WidgetRun.b(dependencyNode2, dependencyNode, -dimensionDependency.g);
                    }
                    ConstraintWidget constraintWidget11 = this.b;
                    if (constraintWidget11.E) {
                        WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget11.c0);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                if (constraintAnchor4.f != null) {
                    DependencyNode dependencyNodeH5 = WidgetRun.h(constraintAnchor4);
                    if (dependencyNodeH5 != null) {
                        WidgetRun.b(dependencyNode3, dependencyNodeH5, 0);
                        WidgetRun.b(dependencyNode2, dependencyNode3, -this.b.c0);
                        WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof Helper) || constraintWidget7.V == null || constraintWidget7.j(ConstraintAnchor.Type.f).f != null) {
                    return;
                }
                ConstraintWidget constraintWidget12 = this.b;
                WidgetRun.b(dependencyNode2, constraintWidget12.V.e.h, constraintWidget12.t());
                WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.g);
                ConstraintWidget constraintWidget13 = this.b;
                if (constraintWidget13.E) {
                    WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget13.c0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != dimensionBehaviour3) {
            dimensionDependency.b(this);
        } else {
            ConstraintWidget constraintWidget14 = this.b;
            int i = constraintWidget14.s;
            if (i == 2) {
                ConstraintWidget constraintWidget15 = constraintWidget14.V;
                if (constraintWidget15 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidget15.e.e;
                    arrayList2.add(dimensionDependency2);
                    dimensionDependency2.k.add(dimensionDependency);
                    dimensionDependency.b = true;
                    arrayList.add(dependencyNode2);
                    arrayList.add(dependencyNode);
                }
            } else if (i == 3 && !constraintWidget14.z()) {
                ConstraintWidget constraintWidget16 = this.b;
                if (constraintWidget16.r != 3) {
                    DimensionDependency dimensionDependency3 = constraintWidget16.d.e;
                    arrayList2.add(dimensionDependency3);
                    dimensionDependency3.k.add(dimensionDependency);
                    dimensionDependency.b = true;
                    arrayList.add(dependencyNode2);
                    arrayList.add(dependencyNode);
                }
            }
        }
        ConstraintWidget constraintWidget17 = this.b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget17.R;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f != null) {
            boolean z5 = constraintWidget17.z();
            ConstraintWidget constraintWidget18 = this.b;
            if (z5) {
                dependencyNode2.f = constraintWidget18.R[2].e();
                dependencyNode.f = -this.b.R[3].e();
            } else {
                DependencyNode dependencyNodeH6 = WidgetRun.h(constraintWidget18.R[2]);
                DependencyNode dependencyNodeH7 = WidgetRun.h(this.b.R[3]);
                if (dependencyNodeH6 != null) {
                    dependencyNodeH6.b(this);
                }
                if (dependencyNodeH7 != null) {
                    dependencyNodeH7.b(this);
                }
                this.j = WidgetRun.RunType.b;
            }
            if (this.b.E) {
                c(dependencyNode3, dependencyNode2, 1, this.l);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode dependencyNodeH8 = WidgetRun.h(constraintAnchor5);
            if (dependencyNodeH8 != null) {
                WidgetRun.b(dependencyNode2, dependencyNodeH8, this.b.R[2].e());
                c(dependencyNode, dependencyNode2, 1, dimensionDependency);
                if (this.b.E) {
                    c(dependencyNode3, dependencyNode2, 1, this.l);
                }
                if (this.d == dimensionBehaviour3) {
                    ConstraintWidget constraintWidget19 = this.b;
                    if (constraintWidget19.Y > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        HorizontalWidgetRun horizontalWidgetRun = constraintWidget19.d;
                        if (horizontalWidgetRun.d == dimensionBehaviour3) {
                            horizontalWidgetRun.e.k.add(dimensionDependency);
                            arrayList2.add(this.b.d.e);
                            dimensionDependency.a = this;
                        }
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.f != null) {
                DependencyNode dependencyNodeH9 = WidgetRun.h(constraintAnchor7);
                if (dependencyNodeH9 != null) {
                    WidgetRun.b(dependencyNode, dependencyNodeH9, -this.b.R[3].e());
                    c(dependencyNode2, dependencyNode, -1, dimensionDependency);
                    if (this.b.E) {
                        c(dependencyNode3, dependencyNode2, 1, this.l);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.f != null) {
                    DependencyNode dependencyNodeH10 = WidgetRun.h(constraintAnchor8);
                    if (dependencyNodeH10 != null) {
                        WidgetRun.b(dependencyNode3, dependencyNodeH10, 0);
                        c(dependencyNode2, dependencyNode3, -1, this.l);
                        c(dependencyNode, dependencyNode2, 1, dimensionDependency);
                    }
                } else if (!(constraintWidget17 instanceof Helper) && (constraintWidget3 = constraintWidget17.V) != null) {
                    WidgetRun.b(dependencyNode2, constraintWidget3.e.h, constraintWidget17.t());
                    c(dependencyNode, dependencyNode2, 1, dimensionDependency);
                    if (this.b.E) {
                        c(dependencyNode3, dependencyNode2, 1, this.l);
                    }
                    if (this.d == dimensionBehaviour3) {
                        ConstraintWidget constraintWidget20 = this.b;
                        if (constraintWidget20.Y > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            HorizontalWidgetRun horizontalWidgetRun2 = constraintWidget20.d;
                            if (horizontalWidgetRun2.d == dimensionBehaviour3) {
                                horizontalWidgetRun2.e.k.add(dimensionDependency);
                                arrayList2.add(this.b.d.e);
                                dimensionDependency.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            dimensionDependency.c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        DependencyNode dependencyNode = this.h;
        if (dependencyNode.j) {
            this.b.b0 = dependencyNode.g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        return this.d != ConstraintWidget.DimensionBehaviour.c || this.b.s == 0;
    }

    public final String toString() {
        return "VerticalRun " + this.b.j0;
    }

    public VerticalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.k = dependencyNode;
        this.l = null;
        this.h.e = DependencyNode.Type.f;
        this.i.e = DependencyNode.Type.g;
        dependencyNode.e = DependencyNode.Type.h;
        this.f = 1;
    }
}
