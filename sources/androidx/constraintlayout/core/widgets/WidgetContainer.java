package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class WidgetContainer extends ConstraintWidget {
    public ArrayList r0;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void D() {
        this.r0.clear();
        super.D();
    }

    public void S() {
        ArrayList arrayList = this.r0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.r0.get(i);
            if (constraintWidget instanceof WidgetContainer) {
                ((WidgetContainer) constraintWidget).S();
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void G(Cache cache) {
        super.G(cache);
        int size = this.r0.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.r0.get(i)).G(cache);
        }
    }
}
