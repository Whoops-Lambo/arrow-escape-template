package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class WidgetRun implements Dependency {
    public int a;
    public ConstraintWidget b;
    public RunGroup c;
    public ConstraintWidget.DimensionBehaviour d;
    public final DimensionDependency e = new DimensionDependency(this);
    public int f = 0;
    public boolean g = false;
    public final DependencyNode h = new DependencyNode(this);
    public final DependencyNode i = new DependencyNode(this);
    public RunType j = RunType.a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class RunType {
        public static final RunType a;
        public static final RunType b;
        public static final /* synthetic */ RunType[] c;

        static {
            RunType runType = new RunType("NONE", 0);
            a = runType;
            RunType runType2 = new RunType("START", 1);
            RunType runType3 = new RunType("END", 2);
            RunType runType4 = new RunType("CENTER", 3);
            b = runType4;
            c = new RunType[]{runType, runType2, runType3, runType4};
        }

        public static RunType valueOf(String str) {
            return (RunType) Enum.valueOf(RunType.class, str);
        }

        public static RunType[] values() {
            return (RunType[]) c.clone();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void a(Dependency dependency) {
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract boolean k();

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$1, reason: invalid class name */
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
                a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i) {
        dependencyNode.l.add(dependencyNode2);
        dependencyNode.f = i;
        dependencyNode2.k.add(dependencyNode);
    }

    public static DependencyNode h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.d;
        int iOrdinal = constraintAnchor2.e.ordinal();
        if (iOrdinal == 1) {
            return constraintWidget.d.h;
        }
        if (iOrdinal == 2) {
            return constraintWidget.e.h;
        }
        if (iOrdinal == 3) {
            return constraintWidget.d.i;
        }
        if (iOrdinal == 4) {
            return constraintWidget.e.i;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return constraintWidget.e.k;
    }

    public static DependencyNode i(ConstraintAnchor constraintAnchor, int i) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.d;
        WidgetRun widgetRun = i == 0 ? constraintWidget.d : constraintWidget.e;
        int iOrdinal = constraintAnchor2.e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return widgetRun.h;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return widgetRun.i;
        }
        return null;
    }

    public final void c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i, DimensionDependency dimensionDependency) {
        dependencyNode.l.add(dependencyNode2);
        dependencyNode.l.add(this.e);
        dependencyNode.h = i;
        dependencyNode.i = dimensionDependency;
        dependencyNode2.k.add(dependencyNode);
        dimensionDependency.k.add(dependencyNode);
    }

    public final int g(int i, int i2) {
        ConstraintWidget constraintWidget = this.b;
        if (i2 == 0) {
            int i3 = constraintWidget.v;
            int iMax = Math.max(constraintWidget.u, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = constraintWidget.y;
            int iMax2 = Math.max(constraintWidget.x, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        DimensionDependency dimensionDependency = this.e;
        if (dimensionDependency.j) {
            return dimensionDependency.g;
        }
        return 0L;
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.b = constraintWidget;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    public final void l(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        float f;
        WidgetRun widgetRun;
        float f2;
        DimensionDependency dimensionDependency;
        float f3;
        int i2;
        int i3;
        DependencyNode dependencyNodeH = h(constraintAnchor);
        DependencyNode dependencyNodeH2 = h(constraintAnchor2);
        if (dependencyNodeH.j && dependencyNodeH2.j) {
            int iE = constraintAnchor.e() + dependencyNodeH.g;
            int iE2 = dependencyNodeH2.g - constraintAnchor2.e();
            int i4 = iE2 - iE;
            DimensionDependency dimensionDependency2 = this.e;
            if (!dimensionDependency2.j) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.c;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    int i5 = this.a;
                    if (i5 != 0) {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 == 3) {
                                    ConstraintWidget constraintWidget = this.b;
                                    WidgetRun widgetRun2 = constraintWidget.d;
                                    if (widgetRun2.d == dimensionBehaviour2 && widgetRun2.a == 3) {
                                        VerticalWidgetRun verticalWidgetRun = constraintWidget.e;
                                        if (verticalWidgetRun.d != dimensionBehaviour2 || verticalWidgetRun.a != 3) {
                                            if (i == 0) {
                                                widgetRun2 = constraintWidget.e;
                                            }
                                            dimensionDependency = widgetRun2.e;
                                            if (dimensionDependency.j) {
                                                f3 = constraintWidget.Y;
                                                i2 = dimensionDependency.g;
                                                if (i == 1) {
                                                    i3 = (int) ((i2 / f3) + 0.5f);
                                                } else {
                                                    i3 = (int) ((f3 * i2) + 0.5f);
                                                }
                                                dimensionDependency2.d(i3);
                                            }
                                        }
                                    } else {
                                        if (i == 0) {
                                            widgetRun2 = constraintWidget.e;
                                        }
                                        dimensionDependency = widgetRun2.e;
                                        if (dimensionDependency.j) {
                                            f3 = constraintWidget.Y;
                                            i2 = dimensionDependency.g;
                                            if (i == 1) {
                                                i3 = (int) ((i2 / f3) + 0.5f);
                                            } else {
                                                i3 = (int) ((f3 * i2) + 0.5f);
                                            }
                                            dimensionDependency2.d(i3);
                                        }
                                    }
                                }
                            } else {
                                ConstraintWidget constraintWidget2 = this.b;
                                ConstraintWidget constraintWidget3 = constraintWidget2.V;
                                if (constraintWidget3 != null) {
                                    if (i == 0) {
                                        widgetRun = constraintWidget3.d;
                                    } else {
                                        widgetRun = constraintWidget3.e;
                                    }
                                    DimensionDependency dimensionDependency3 = widgetRun.e;
                                    if (dimensionDependency3.j) {
                                        if (i == 0) {
                                            f2 = constraintWidget2.w;
                                        } else {
                                            f2 = constraintWidget2.z;
                                        }
                                        dimensionDependency2.d(g((int) ((dimensionDependency3.g * f2) + 0.5f), i));
                                    }
                                }
                            }
                        } else {
                            dimensionDependency2.d(Math.min(g(dimensionDependency2.m, i), i4));
                        }
                    } else {
                        dimensionDependency2.d(g(i4, i));
                    }
                }
            }
            if (dimensionDependency2.j) {
                int i6 = dimensionDependency2.g;
                DependencyNode dependencyNode = this.i;
                DependencyNode dependencyNode2 = this.h;
                if (i6 == i4) {
                    dependencyNode2.d(iE);
                    dependencyNode.d(iE2);
                    return;
                }
                ConstraintWidget constraintWidget4 = this.b;
                if (i == 0) {
                    f = constraintWidget4.f0;
                } else {
                    f = constraintWidget4.g0;
                }
                if (dependencyNodeH == dependencyNodeH2) {
                    iE = dependencyNodeH.g;
                    iE2 = dependencyNodeH2.g;
                    f = 0.5f;
                }
                dependencyNode2.d((int) ((((iE2 - iE) - i6) * f) + iE + 0.5f));
                dependencyNode.d(dependencyNode2.g + dimensionDependency2.g);
            }
        }
    }
}
