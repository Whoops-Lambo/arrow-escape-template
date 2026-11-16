package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class HelperWidget extends ConstraintWidget implements Helper {
    public ConstraintWidget[] r0 = new ConstraintWidget[4];
    public int s0 = 0;

    public final void S(int i, WidgetGroup widgetGroup, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.s0; i2++) {
            ConstraintWidget constraintWidget = this.r0[i2];
            ArrayList arrayList2 = widgetGroup.a;
            if (!arrayList2.contains(constraintWidget)) {
                arrayList2.add(constraintWidget);
            }
        }
        for (int i3 = 0; i3 < this.s0; i3++) {
            Grouping.a(this.r0[i3], i, arrayList, widgetGroup);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void a() {
    }
}
