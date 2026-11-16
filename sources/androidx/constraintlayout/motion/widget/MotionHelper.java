package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class MotionHelper extends ConstraintHelper implements MotionHelperInterface {
    public float i;
    public View[] j;

    public float getProgress() {
        return this.i;
    }

    public void setProgress(float f) {
        this.i = f;
        int i = 0;
        if (this.b > 0) {
            this.j = h((ConstraintLayout) getParent());
            while (i < this.b) {
                View view = this.j[i];
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            viewGroup.getChildAt(i);
            i++;
        }
    }
}
