package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class HorizontalWidgetRun extends WidgetRun {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    public final void n() {
        this.g = false;
        DependencyNode dependencyNode = this.h;
        dependencyNode.c();
        dependencyNode.j = false;
        DependencyNode dependencyNode2 = this.i;
        dependencyNode2.c();
        dependencyNode2.j = false;
        this.e.j = false;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun$1, reason: invalid class name */
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

    /* JADX WARN: Code duplicated, block: B:116:0x026a  */
    /* JADX WARN: Code duplicated, block: B:118:0x027a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public final void a(Dependency dependency) {
        float f;
        int iG;
        int i;
        int iG2;
        float f2;
        float f3;
        float f4;
        int i2;
        if (this.j.ordinal() == 3) {
            ConstraintWidget constraintWidget = this.b;
            l(constraintWidget.J, constraintWidget.L, 0);
            return;
        }
        DimensionDependency dimensionDependency = this.e;
        boolean z = dimensionDependency.j;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.c;
        DependencyNode dependencyNode = this.h;
        DependencyNode dependencyNode2 = this.i;
        if (z || this.d != dimensionBehaviour) {
            f = 0.5f;
        } else {
            ConstraintWidget constraintWidget2 = this.b;
            int i3 = constraintWidget2.r;
            if (i3 == 2) {
                f = 0.5f;
                ConstraintWidget constraintWidget3 = constraintWidget2.V;
                if (constraintWidget3 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidget3.d.e;
                    if (dimensionDependency2.j) {
                        dimensionDependency.d((int) ((dimensionDependency2.g * constraintWidget2.w) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = constraintWidget2.s;
                if (i4 == 0 || i4 == 3) {
                    VerticalWidgetRun verticalWidgetRun = constraintWidget2.e;
                    DependencyNode dependencyNode3 = verticalWidgetRun.h;
                    DependencyNode dependencyNode4 = verticalWidgetRun.i;
                    boolean z2 = constraintWidget2.J.f != null;
                    boolean z3 = constraintWidget2.K.f != null;
                    boolean z4 = constraintWidget2.L.f != null;
                    boolean z5 = constraintWidget2.M.f != null;
                    f = 0.5f;
                    int i5 = constraintWidget2.Z;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = constraintWidget2.Y;
                        boolean z6 = dependencyNode3.j;
                        ArrayList arrayList = dependencyNode3.l;
                        int[] iArr = k;
                        if (z6 && dependencyNode4.j) {
                            if (dependencyNode.c && dependencyNode2.c) {
                                m(iArr, ((DependencyNode) dependencyNode.l.get(0)).g + dependencyNode.f, ((DependencyNode) dependencyNode2.l.get(0)).g - dependencyNode2.f, dependencyNode3.g + dependencyNode3.f, dependencyNode4.g - dependencyNode4.f, f5, i5);
                                dimensionDependency.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (dependencyNode.j && dependencyNode2.j) {
                            if (!dependencyNode3.c || !dependencyNode4.c) {
                                return;
                            }
                            m(iArr, dependencyNode.g + dependencyNode.f, dependencyNode2.g - dependencyNode2.f, ((DependencyNode) arrayList.get(0)).g + dependencyNode3.f, ((DependencyNode) dependencyNode4.l.get(0)).g - dependencyNode4.f, f5, i5);
                            dimensionDependency.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!dependencyNode.c || !dependencyNode2.c || !dependencyNode3.c || !dependencyNode4.c) {
                            return;
                        }
                        m(iArr, ((DependencyNode) dependencyNode.l.get(0)).g + dependencyNode.f, ((DependencyNode) dependencyNode2.l.get(0)).g - dependencyNode2.f, ((DependencyNode) arrayList.get(0)).g + dependencyNode3.f, ((DependencyNode) dependencyNode4.l.get(0)).g - dependencyNode4.f, f5, i5);
                        dimensionDependency.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!dependencyNode.c || !dependencyNode2.c) {
                            return;
                        }
                        float f6 = constraintWidget2.Y;
                        int i6 = ((DependencyNode) dependencyNode.l.get(0)).g + dependencyNode.f;
                        int i7 = ((DependencyNode) dependencyNode2.l.get(0)).g - dependencyNode2.f;
                        if (i5 == -1 || i5 == 0) {
                            int iG3 = g(i7 - i6, 0);
                            int i8 = (int) ((iG3 * f6) + 0.5f);
                            int iG4 = g(i8, 1);
                            if (i8 != iG4) {
                                iG3 = (int) ((iG4 / f6) + 0.5f);
                            }
                            dimensionDependency.d(iG3);
                            this.b.e.e.d(iG4);
                        } else if (i5 == 1) {
                            int iG5 = g(i7 - i6, 0);
                            int i9 = (int) ((iG5 / f6) + 0.5f);
                            int iG6 = g(i9, 1);
                            if (i9 != iG6) {
                                iG5 = (int) ((iG6 * f6) + 0.5f);
                            }
                            dimensionDependency.d(iG5);
                            this.b.e.e.d(iG6);
                        }
                    } else if (z3 && z5) {
                        if (!dependencyNode3.c || !dependencyNode4.c) {
                            return;
                        }
                        float f7 = constraintWidget2.Y;
                        int i10 = ((DependencyNode) dependencyNode3.l.get(0)).g + dependencyNode3.f;
                        int i11 = ((DependencyNode) dependencyNode4.l.get(0)).g - dependencyNode4.f;
                        if (i5 == -1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            dimensionDependency.d(iG2);
                            this.b.e.e.d(iG);
                        } else if (i5 == 0) {
                            int iG7 = g(i11 - i10, 1);
                            int i12 = (int) ((iG7 * f7) + 0.5f);
                            int iG8 = g(i12, 0);
                            if (i12 != iG8) {
                                iG7 = (int) ((iG8 / f7) + 0.5f);
                            }
                            dimensionDependency.d(iG8);
                            this.b.e.e.d(iG7);
                        } else if (i5 == 1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            dimensionDependency.d(iG2);
                            this.b.e.e.d(iG);
                        }
                    }
                } else {
                    int i13 = constraintWidget2.Z;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = constraintWidget2.e.e.g / constraintWidget2.Y;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = constraintWidget2.e.e.g;
                            f3 = constraintWidget2.Y;
                        }
                        dimensionDependency.d(i2);
                        f = 0.5f;
                    } else {
                        f2 = constraintWidget2.e.e.g;
                        f3 = constraintWidget2.Y;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    dimensionDependency.d(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = dependencyNode.c;
        ArrayList arrayList2 = dependencyNode.l;
        if (z7) {
            boolean z8 = dependencyNode2.c;
            ArrayList arrayList3 = dependencyNode2.l;
            if (z8) {
                if (dependencyNode.j && dependencyNode2.j && dimensionDependency.j) {
                    return;
                }
                if (!dimensionDependency.j && this.d == dimensionBehaviour) {
                    ConstraintWidget constraintWidget4 = this.b;
                    if (constraintWidget4.r == 0 && !constraintWidget4.y()) {
                        DependencyNode dependencyNode5 = (DependencyNode) arrayList2.get(0);
                        DependencyNode dependencyNode6 = (DependencyNode) arrayList3.get(0);
                        int i14 = dependencyNode5.g + dependencyNode.f;
                        int i15 = dependencyNode6.g + dependencyNode2.f;
                        dependencyNode.d(i14);
                        dependencyNode2.d(i15);
                        dimensionDependency.d(i15 - i14);
                        return;
                    }
                }
                if (!dimensionDependency.j && this.d == dimensionBehaviour && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((DependencyNode) arrayList3.get(0)).g + dependencyNode2.f) - (((DependencyNode) arrayList2.get(0)).g + dependencyNode.f), dimensionDependency.m);
                    ConstraintWidget constraintWidget5 = this.b;
                    int i16 = constraintWidget5.v;
                    int iMax = Math.max(constraintWidget5.u, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    dimensionDependency.d(iMax);
                }
                if (dimensionDependency.j) {
                    DependencyNode dependencyNode7 = (DependencyNode) arrayList2.get(0);
                    DependencyNode dependencyNode8 = (DependencyNode) arrayList3.get(0);
                    int i17 = dependencyNode7.g;
                    int i18 = dependencyNode.f + i17;
                    int i19 = dependencyNode8.g;
                    int i20 = dependencyNode2.f + i19;
                    float f8 = this.b.f0;
                    if (dependencyNode7 == dependencyNode8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    dependencyNode.d((int) ((((i19 - i17) - dimensionDependency.g) * f8) + i17 + f));
                    dependencyNode2.d(dependencyNode.g + dimensionDependency.g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget constraintWidget5 = this.b;
        boolean z = constraintWidget5.a;
        DimensionDependency dimensionDependency = this.e;
        if (z) {
            dimensionDependency.d(constraintWidget5.r());
        }
        boolean z2 = dimensionDependency.j;
        ArrayList arrayList = dimensionDependency.k;
        ArrayList arrayList2 = dimensionDependency.l;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.a;
        DependencyNode dependencyNode = this.i;
        DependencyNode dependencyNode2 = this.h;
        if (!z2) {
            ConstraintWidget constraintWidget6 = this.b;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = constraintWidget6.U[0];
            this.d = dimensionBehaviour6;
            if (dimensionBehaviour6 != dimensionBehaviour4) {
                if (dimensionBehaviour6 == dimensionBehaviour3 && (constraintWidget4 = constraintWidget6.V) != null && ((dimensionBehaviour2 = constraintWidget4.U[0]) == dimensionBehaviour5 || dimensionBehaviour2 == dimensionBehaviour3)) {
                    int iR = (constraintWidget4.r() - this.b.J.e()) - this.b.L.e();
                    WidgetRun.b(dependencyNode2, constraintWidget4.d.h, this.b.J.e());
                    WidgetRun.b(dependencyNode, constraintWidget4.d.i, -this.b.L.e());
                    dimensionDependency.d(iR);
                    return;
                }
                if (dimensionBehaviour6 == dimensionBehaviour5) {
                    dimensionDependency.d(constraintWidget6.r());
                }
            }
        } else if (this.d == dimensionBehaviour3 && (constraintWidget2 = (constraintWidget = this.b).V) != null && ((dimensionBehaviour = constraintWidget2.U[0]) == dimensionBehaviour5 || dimensionBehaviour == dimensionBehaviour3)) {
            WidgetRun.b(dependencyNode2, constraintWidget2.d.h, constraintWidget.J.e());
            WidgetRun.b(dependencyNode, constraintWidget2.d.i, -this.b.L.e());
            return;
        }
        if (dimensionDependency.j) {
            ConstraintWidget constraintWidget7 = this.b;
            if (constraintWidget7.a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.R;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
                if (constraintAnchor2 != null && constraintAnchorArr[1].f != null) {
                    boolean zY = constraintWidget7.y();
                    ConstraintWidget constraintWidget8 = this.b;
                    if (zY) {
                        dependencyNode2.f = constraintWidget8.R[0].e();
                        dependencyNode.f = -this.b.R[1].e();
                        return;
                    }
                    DependencyNode dependencyNodeH = WidgetRun.h(constraintWidget8.R[0]);
                    if (dependencyNodeH != null) {
                        WidgetRun.b(dependencyNode2, dependencyNodeH, this.b.R[0].e());
                    }
                    DependencyNode dependencyNodeH2 = WidgetRun.h(this.b.R[1]);
                    if (dependencyNodeH2 != null) {
                        WidgetRun.b(dependencyNode, dependencyNodeH2, -this.b.R[1].e());
                    }
                    dependencyNode2.b = true;
                    dependencyNode.b = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode dependencyNodeH3 = WidgetRun.h(constraintAnchor);
                    if (dependencyNodeH3 != null) {
                        WidgetRun.b(dependencyNode2, dependencyNodeH3, this.b.R[0].e());
                        WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.g);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.f != null) {
                    DependencyNode dependencyNodeH4 = WidgetRun.h(constraintAnchor3);
                    if (dependencyNodeH4 != null) {
                        WidgetRun.b(dependencyNode, dependencyNodeH4, -this.b.R[1].e());
                        WidgetRun.b(dependencyNode2, dependencyNode, -dimensionDependency.g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof Helper) || constraintWidget7.V == null || constraintWidget7.j(ConstraintAnchor.Type.f).f != null) {
                    return;
                }
                ConstraintWidget constraintWidget9 = this.b;
                WidgetRun.b(dependencyNode2, constraintWidget9.V.d.h, constraintWidget9.s());
                WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.g);
                return;
            }
        }
        if (this.d == dimensionBehaviour4) {
            ConstraintWidget constraintWidget10 = this.b;
            int i = constraintWidget10.r;
            if (i == 2) {
                ConstraintWidget constraintWidget11 = constraintWidget10.V;
                if (constraintWidget11 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidget11.e.e;
                    arrayList2.add(dimensionDependency2);
                    dimensionDependency2.k.add(dimensionDependency);
                    dimensionDependency.b = true;
                    arrayList.add(dependencyNode2);
                    arrayList.add(dependencyNode);
                }
            } else if (i == 3) {
                if (constraintWidget10.s == 3) {
                    dependencyNode2.a = this;
                    dependencyNode.a = this;
                    VerticalWidgetRun verticalWidgetRun = constraintWidget10.e;
                    verticalWidgetRun.h.a = this;
                    verticalWidgetRun.i.a = this;
                    dimensionDependency.a = this;
                    if (constraintWidget10.z()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(dimensionDependency);
                        VerticalWidgetRun verticalWidgetRun2 = this.b.e;
                        verticalWidgetRun2.e.a = this;
                        arrayList2.add(verticalWidgetRun2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(dimensionDependency);
                        this.b.e.i.k.add(dimensionDependency);
                    } else {
                        boolean zY2 = this.b.y();
                        ConstraintWidget constraintWidget12 = this.b;
                        if (zY2) {
                            constraintWidget12.e.e.l.add(dimensionDependency);
                            arrayList.add(this.b.e.e);
                        } else {
                            constraintWidget12.e.e.l.add(dimensionDependency);
                        }
                    }
                } else {
                    DimensionDependency dimensionDependency3 = constraintWidget10.e.e;
                    arrayList2.add(dimensionDependency3);
                    dimensionDependency3.k.add(dimensionDependency);
                    this.b.e.h.k.add(dimensionDependency);
                    this.b.e.i.k.add(dimensionDependency);
                    dimensionDependency.b = true;
                    arrayList.add(dependencyNode2);
                    arrayList.add(dependencyNode);
                    dependencyNode2.l.add(dimensionDependency);
                    dependencyNode.l.add(dimensionDependency);
                }
            }
        }
        ConstraintWidget constraintWidget13 = this.b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget13.R;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.f;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].f != null) {
            boolean zY3 = constraintWidget13.y();
            ConstraintWidget constraintWidget14 = this.b;
            if (zY3) {
                dependencyNode2.f = constraintWidget14.R[0].e();
                dependencyNode.f = -this.b.R[1].e();
                return;
            }
            DependencyNode dependencyNodeH5 = WidgetRun.h(constraintWidget14.R[0]);
            DependencyNode dependencyNodeH6 = WidgetRun.h(this.b.R[1]);
            if (dependencyNodeH5 != null) {
                dependencyNodeH5.b(this);
            }
            if (dependencyNodeH6 != null) {
                dependencyNodeH6.b(this);
            }
            this.j = WidgetRun.RunType.b;
            return;
        }
        if (constraintAnchor5 != null) {
            DependencyNode dependencyNodeH7 = WidgetRun.h(constraintAnchor4);
            if (dependencyNodeH7 != null) {
                WidgetRun.b(dependencyNode2, dependencyNodeH7, this.b.R[0].e());
                c(dependencyNode, dependencyNode2, 1, dimensionDependency);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.f != null) {
            DependencyNode dependencyNodeH8 = WidgetRun.h(constraintAnchor6);
            if (dependencyNodeH8 != null) {
                WidgetRun.b(dependencyNode, dependencyNodeH8, -this.b.R[1].e());
                c(dependencyNode2, dependencyNode, -1, dimensionDependency);
                return;
            }
            return;
        }
        if ((constraintWidget13 instanceof Helper) || (constraintWidget3 = constraintWidget13.V) == null) {
            return;
        }
        WidgetRun.b(dependencyNode2, constraintWidget3.d.h, constraintWidget13.s());
        c(dependencyNode, dependencyNode2, 1, dimensionDependency);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        DependencyNode dependencyNode = this.h;
        if (dependencyNode.j) {
            this.b.a0 = dependencyNode.g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        return this.d != ConstraintWidget.DimensionBehaviour.c || this.b.r == 0;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.j0;
    }

    public HorizontalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.h.e = DependencyNode.Type.d;
        this.i.e = DependencyNode.Type.e;
        this.f = 0;
    }
}
