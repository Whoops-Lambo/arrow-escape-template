package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
class HelperReferences extends WidgetRun {
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        return false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public final void a(Dependency dependency) {
        Barrier barrier = (Barrier) this.b;
        int i = barrier.t0;
        DependencyNode dependencyNode = this.h;
        ArrayList arrayList = dependencyNode.l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((DependencyNode) obj).g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            dependencyNode.d(i3 + barrier.v0);
        } else {
            dependencyNode.d(i2 + barrier.v0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget instanceof Barrier) {
            DependencyNode dependencyNode = this.h;
            dependencyNode.b = true;
            ArrayList arrayList = dependencyNode.l;
            Barrier barrier = (Barrier) constraintWidget;
            int i = barrier.t0;
            boolean z = barrier.u0;
            int i2 = 0;
            if (i == 0) {
                dependencyNode.e = DependencyNode.Type.d;
                while (i2 < barrier.s0) {
                    ConstraintWidget constraintWidget2 = barrier.r0[i2];
                    if (z || constraintWidget2.i0 != 8) {
                        DependencyNode dependencyNode2 = constraintWidget2.d.h;
                        dependencyNode2.k.add(dependencyNode);
                        arrayList.add(dependencyNode2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                dependencyNode.e = DependencyNode.Type.e;
                while (i2 < barrier.s0) {
                    ConstraintWidget constraintWidget3 = barrier.r0[i2];
                    if (z || constraintWidget3.i0 != 8) {
                        DependencyNode dependencyNode3 = constraintWidget3.d.i;
                        dependencyNode3.k.add(dependencyNode);
                        arrayList.add(dependencyNode3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                dependencyNode.e = DependencyNode.Type.f;
                while (i2 < barrier.s0) {
                    ConstraintWidget constraintWidget4 = barrier.r0[i2];
                    if (z || constraintWidget4.i0 != 8) {
                        DependencyNode dependencyNode4 = constraintWidget4.e.h;
                        dependencyNode4.k.add(dependencyNode);
                        arrayList.add(dependencyNode4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            dependencyNode.e = DependencyNode.Type.g;
            while (i2 < barrier.s0) {
                ConstraintWidget constraintWidget5 = barrier.r0[i2];
                if (z || constraintWidget5.i0 != 8) {
                    DependencyNode dependencyNode5 = constraintWidget5.e.i;
                    dependencyNode5.k.add(dependencyNode);
                    arrayList.add(dependencyNode5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget instanceof Barrier) {
            int i = ((Barrier) constraintWidget).t0;
            DependencyNode dependencyNode = this.h;
            if (i == 0 || i == 1) {
                constraintWidget.a0 = dependencyNode.g;
            } else {
                constraintWidget.b0 = dependencyNode.g;
            }
        }
    }

    public final void m(DependencyNode dependencyNode) {
        DependencyNode dependencyNode2 = this.h;
        dependencyNode2.k.add(dependencyNode);
        dependencyNode.l.add(dependencyNode2);
    }
}
