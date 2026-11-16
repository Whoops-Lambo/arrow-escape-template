package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class RunGroup {
    public WidgetRun a;
    public ArrayList b;

    public static long a(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.d;
        ArrayList arrayList = dependencyNode.k;
        if (widgetRun instanceof HelperReferences) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            Dependency dependency = (Dependency) arrayList.get(i);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.d != widgetRun) {
                    jMin = Math.min(jMin, a(dependencyNode2, ((long) dependencyNode2.f) + j));
                }
            }
        }
        DependencyNode dependencyNode3 = widgetRun.i;
        DependencyNode dependencyNode4 = widgetRun.h;
        if (dependencyNode != dependencyNode3) {
            return jMin;
        }
        long j2 = j - widgetRun.j();
        return Math.min(Math.min(jMin, a(dependencyNode4, j2)), j2 - ((long) dependencyNode4.f));
    }

    public static long b(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.d;
        ArrayList arrayList = dependencyNode.k;
        if (widgetRun instanceof HelperReferences) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            Dependency dependency = (Dependency) arrayList.get(i);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.d != widgetRun) {
                    jMax = Math.max(jMax, b(dependencyNode2, ((long) dependencyNode2.f) + j));
                }
            }
        }
        DependencyNode dependencyNode3 = widgetRun.h;
        DependencyNode dependencyNode4 = widgetRun.i;
        if (dependencyNode != dependencyNode3) {
            return jMax;
        }
        long j2 = widgetRun.j() + j;
        return Math.max(Math.max(jMax, b(dependencyNode4, j2)), j2 - ((long) dependencyNode4.f));
    }
}
