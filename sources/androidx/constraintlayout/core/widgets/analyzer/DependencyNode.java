package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class DependencyNode implements Dependency {
    public final WidgetRun d;
    public int f;
    public int g;
    public WidgetRun a = null;
    public boolean b = false;
    public boolean c = false;
    public Type e = Type.a;
    public int h = 1;
    public DimensionDependency i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Type {
        public static final Type a;
        public static final Type b;
        public static final Type c;
        public static final Type d;
        public static final Type e;
        public static final Type f;
        public static final Type g;
        public static final Type h;
        public static final /* synthetic */ Type[] i;

        static {
            Type type = new Type("UNKNOWN", 0);
            a = type;
            Type type2 = new Type("HORIZONTAL_DIMENSION", 1);
            b = type2;
            Type type3 = new Type("VERTICAL_DIMENSION", 2);
            c = type3;
            Type type4 = new Type("LEFT", 3);
            d = type4;
            Type type5 = new Type("RIGHT", 4);
            e = type5;
            Type type6 = new Type("TOP", 5);
            f = type6;
            Type type7 = new Type("BOTTOM", 6);
            g = type7;
            Type type8 = new Type("BASELINE", 7);
            h = type8;
            i = new Type[]{type, type2, type3, type4, type5, type6, type7, type8};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) i.clone();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public final void a(Dependency dependency) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((DependencyNode) obj).j) {
                return;
            }
        }
        this.c = true;
        WidgetRun widgetRun = this.a;
        if (widgetRun != null) {
            widgetRun.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        int size2 = arrayList.size();
        DependencyNode dependencyNode = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            DependencyNode dependencyNode2 = (DependencyNode) obj2;
            if (!(dependencyNode2 instanceof DimensionDependency)) {
                i++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i == 1 && dependencyNode.j) {
            DimensionDependency dimensionDependency = this.i;
            if (dimensionDependency != null) {
                if (!dimensionDependency.j) {
                    return;
                } else {
                    this.f = this.h * dimensionDependency.g;
                }
            }
            d(dependencyNode.g + this.f);
        }
        WidgetRun widgetRun2 = this.a;
        if (widgetRun2 != null) {
            widgetRun2.a(this);
        }
    }

    public final void b(WidgetRun widgetRun) {
        this.k.add(widgetRun);
        if (this.j) {
            widgetRun.a(widgetRun);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Dependency dependency = (Dependency) obj;
            dependency.a(dependency);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.j0);
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.d = widgetRun;
    }
}
