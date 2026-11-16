package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class BasicMeasure {
    public final ArrayList a = new ArrayList();
    public final Measure b = new Measure();
    public final ConstraintWidgetContainer c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Measure {
        public ConstraintWidget.DimensionBehaviour a;
        public ConstraintWidget.DimensionBehaviour b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Measurer {
        void a();

        void b(ConstraintWidget constraintWidget, Measure measure);
    }

    public final boolean a(int i, ConstraintWidget constraintWidget, Measurer measurer) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.U;
        int[] iArr = constraintWidget.t;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        Measure measure = this.b;
        measure.a = dimensionBehaviour;
        measure.b = dimensionBehaviourArr[1];
        measure.c = constraintWidget.r();
        measure.d = constraintWidget.l();
        measure.i = false;
        measure.j = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = measure.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.c;
        boolean z = dimensionBehaviour2 == dimensionBehaviour3;
        boolean z2 = measure.b == dimensionBehaviour3;
        boolean z3 = z && constraintWidget.Y > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z4 = z2 && constraintWidget.Y > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.a;
        if (z3 && iArr[0] == 4) {
            measure.a = dimensionBehaviour4;
        }
        if (z4 && iArr[1] == 4) {
            measure.b = dimensionBehaviour4;
        }
        measurer.b(constraintWidget, measure);
        constraintWidget.P(measure.e);
        constraintWidget.M(measure.f);
        constraintWidget.E = measure.h;
        constraintWidget.J(measure.g);
        measure.j = 0;
        return measure.i;
    }

    public final void b(ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3) {
        int i4 = constraintWidgetContainer.d0;
        int i5 = constraintWidgetContainer.e0;
        constraintWidgetContainer.d0 = 0;
        constraintWidgetContainer.e0 = 0;
        constraintWidgetContainer.P(i2);
        constraintWidgetContainer.M(i3);
        if (i4 < 0) {
            constraintWidgetContainer.d0 = 0;
        } else {
            constraintWidgetContainer.d0 = i4;
        }
        if (i5 < 0) {
            constraintWidgetContainer.e0 = 0;
        } else {
            constraintWidgetContainer.e0 = i5;
        }
        ConstraintWidgetContainer constraintWidgetContainer2 = this.c;
        constraintWidgetContainer2.u0 = i;
        constraintWidgetContainer2.S();
    }

    public final void c(ConstraintWidgetContainer constraintWidgetContainer) {
        ArrayList arrayList = this.a;
        arrayList.clear();
        int size = constraintWidgetContainer.r0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) constraintWidgetContainer.r0.get(i);
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.U;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.c;
            if (dimensionBehaviour == dimensionBehaviour2 || dimensionBehaviourArr[1] == dimensionBehaviour2) {
                arrayList.add(constraintWidget);
            }
        }
        constraintWidgetContainer.t0.b = true;
    }

    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer) {
        this.c = constraintWidgetContainer;
    }
}
