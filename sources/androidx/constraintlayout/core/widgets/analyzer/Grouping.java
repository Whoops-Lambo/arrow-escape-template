package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class Grouping {
    public static WidgetGroup a(ConstraintWidget constraintWidget, int i, ArrayList arrayList, WidgetGroup widgetGroup) {
        int i2;
        int i3 = i == 0 ? constraintWidget.p0 : constraintWidget.q0;
        if (i3 != -1 && (widgetGroup == null || i3 != widgetGroup.b)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                WidgetGroup widgetGroup2 = (WidgetGroup) arrayList.get(i4);
                if (widgetGroup2.b == i3) {
                    if (widgetGroup != null) {
                        widgetGroup.c(i, widgetGroup2);
                        arrayList.remove(widgetGroup);
                    }
                    widgetGroup = widgetGroup2;
                    break;
                }
            }
        } else if (i3 != -1) {
            return widgetGroup;
        }
        if (widgetGroup == null) {
            if (constraintWidget instanceof HelperWidget) {
                HelperWidget helperWidget = (HelperWidget) constraintWidget;
                int i5 = 0;
                while (true) {
                    if (i5 >= helperWidget.s0) {
                        i2 = -1;
                        break;
                    }
                    ConstraintWidget constraintWidget2 = helperWidget.r0[i5];
                    if ((i == 0 && (i2 = constraintWidget2.p0) != -1) || (i == 1 && (i2 = constraintWidget2.q0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        WidgetGroup widgetGroup3 = (WidgetGroup) arrayList.get(i6);
                        if (widgetGroup3.b == i2) {
                            widgetGroup = widgetGroup3;
                            break;
                        }
                    }
                }
            }
            if (widgetGroup == null) {
                widgetGroup = new WidgetGroup();
                widgetGroup.a = new ArrayList();
                widgetGroup.d = null;
                widgetGroup.e = -1;
                int i7 = WidgetGroup.f;
                WidgetGroup.f = i7 + 1;
                widgetGroup.b = i7;
                widgetGroup.c = i;
            }
            arrayList.add(widgetGroup);
        }
        ArrayList arrayList2 = widgetGroup.a;
        if (arrayList2.contains(constraintWidget)) {
            return widgetGroup;
        }
        arrayList2.add(constraintWidget);
        if (constraintWidget instanceof Guideline) {
            Guideline guideline = (Guideline) constraintWidget;
            guideline.u0.c(guideline.v0 == 0 ? 1 : 0, widgetGroup, arrayList);
        }
        int i8 = widgetGroup.b;
        if (i == 0) {
            constraintWidget.p0 = i8;
            constraintWidget.J.c(i, widgetGroup, arrayList);
            constraintWidget.L.c(i, widgetGroup, arrayList);
        } else {
            constraintWidget.q0 = i8;
            constraintWidget.K.c(i, widgetGroup, arrayList);
            constraintWidget.N.c(i, widgetGroup, arrayList);
            constraintWidget.M.c(i, widgetGroup, arrayList);
        }
        constraintWidget.Q.c(i, widgetGroup, arrayList);
        return widgetGroup;
    }

    public static boolean b(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.b;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.a;
        return (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == dimensionBehaviour6 || (dimensionBehaviour3 == dimensionBehaviour5 && dimensionBehaviour != dimensionBehaviour6)) || (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == dimensionBehaviour6 || (dimensionBehaviour4 == dimensionBehaviour5 && dimensionBehaviour2 != dimensionBehaviour6));
    }
}
