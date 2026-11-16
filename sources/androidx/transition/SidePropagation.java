package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class SidePropagation extends VisibilityPropagation {
    public int b;

    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    @Override // androidx.transition.TransitionPropagation
    public final long b(ViewGroup viewGroup, Transition transition, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i;
        int iCenterX;
        int iCenterY;
        int iAbs;
        Integer num;
        TransitionValues transitionValues3 = transitionValues;
        if (transitionValues3 == null && transitionValues2 == null) {
            return 0L;
        }
        Transition.EpicenterCallback epicenterCallback = transition.w;
        Rect rectA = epicenterCallback == null ? null : epicenterCallback.a();
        if (transitionValues2 == null) {
            i = -1;
        } else {
            if (((transitionValues3 == null || (num = (Integer) transitionValues3.a.get("android:visibilityPropagation:visibility")) == null) ? 8 : num.intValue()) == 0) {
                i = -1;
            } else {
                transitionValues3 = transitionValues2;
                i = 1;
            }
        }
        int iC = VisibilityPropagation.c(transitionValues3, 0);
        int iC2 = VisibilityPropagation.c(transitionValues3, 1);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = Math.round(viewGroup.getTranslationX()) + iArr[0];
        int iRound2 = Math.round(viewGroup.getTranslationY()) + iArr[1];
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (rectA != null) {
            iCenterX = rectA.centerX();
            iCenterY = rectA.centerY();
        } else {
            iCenterX = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
        }
        int i2 = this.b;
        if (i2 == 8388611) {
            if (viewGroup.getLayoutDirection() == 1) {
                i2 = 5;
            } else {
                i2 = 3;
            }
        } else if (i2 == 8388613) {
            if (viewGroup.getLayoutDirection() == 1) {
                i2 = 3;
            } else {
                i2 = 5;
            }
        }
        if (i2 == 3) {
            iAbs = Math.abs(iCenterY - iC2) + (width - iC);
        } else if (i2 == 5) {
            iAbs = Math.abs(iCenterY - iC2) + (iC - iRound);
        } else if (i2 != 48) {
            iAbs = i2 != 80 ? 0 : Math.abs(iCenterX - iC) + (iC2 - iRound2);
        } else {
            iAbs = Math.abs(iCenterX - iC) + (height - iC2);
        }
        float f = iAbs;
        int i3 = this.b;
        float width2 = f / ((i3 == 3 || i3 == 5 || i3 == 8388611 || i3 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
        long j = transition.c;
        if (j < 0) {
            j = 300;
        }
        return Math.round(((j * ((long) i)) / 3.0f) * width2);
    }
}
