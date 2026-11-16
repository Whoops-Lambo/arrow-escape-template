package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
class GuidelineReference extends WidgetRun {
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        return false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public final void a(Dependency dependency) {
        DependencyNode dependencyNode = this.h;
        if (dependencyNode.c && !dependencyNode.j) {
            dependencyNode.d((int) ((((DependencyNode) dependencyNode.l.get(0)).g * ((Guideline) this.b).r0) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget = this.b;
        Guideline guideline = (Guideline) constraintWidget;
        int i = guideline.s0;
        int i2 = guideline.t0;
        int i3 = guideline.v0;
        DependencyNode dependencyNode = this.h;
        if (i3 == 1) {
            if (i != -1) {
                dependencyNode.l.add(constraintWidget.V.d.h);
                this.b.V.d.h.k.add(dependencyNode);
                dependencyNode.f = i;
            } else if (i2 != -1) {
                dependencyNode.l.add(constraintWidget.V.d.i);
                this.b.V.d.i.k.add(dependencyNode);
                dependencyNode.f = -i2;
            } else {
                dependencyNode.b = true;
                dependencyNode.l.add(constraintWidget.V.d.i);
                this.b.V.d.i.k.add(dependencyNode);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            dependencyNode.l.add(constraintWidget.V.e.h);
            this.b.V.e.h.k.add(dependencyNode);
            dependencyNode.f = i;
        } else if (i2 != -1) {
            dependencyNode.l.add(constraintWidget.V.e.i);
            this.b.V.e.i.k.add(dependencyNode);
            dependencyNode.f = -i2;
        } else {
            dependencyNode.b = true;
            dependencyNode.l.add(constraintWidget.V.e.i);
            this.b.V.e.i.k.add(dependencyNode);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        ConstraintWidget constraintWidget = this.b;
        int i = ((Guideline) constraintWidget).v0;
        DependencyNode dependencyNode = this.h;
        if (i == 1) {
            constraintWidget.a0 = dependencyNode.g;
        } else {
            constraintWidget.b0 = dependencyNode.g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.h.c();
    }

    public final void m(DependencyNode dependencyNode) {
        DependencyNode dependencyNode2 = this.h;
        dependencyNode2.k.add(dependencyNode);
        dependencyNode.l.add(dependencyNode2);
    }
}
