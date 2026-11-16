package androidx.constraintlayout.helper.widget;

import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class MotionPlaceholder extends VirtualLayout {
    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i, int i2) {
        n(null, i, i2);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void n(androidx.constraintlayout.core.widgets.VirtualLayout virtualLayout, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (virtualLayout != null) {
            virtualLayout.T(mode, size, mode2, size2);
            setMeasuredDimension(virtualLayout.A0, virtualLayout.B0);
        } else {
            setMeasuredDimension(0, 0);
        }
    }
}
