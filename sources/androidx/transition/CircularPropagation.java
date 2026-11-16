package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class CircularPropagation extends VisibilityPropagation {
    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    @Override // androidx.transition.TransitionPropagation
    public final long b(ViewGroup viewGroup, Transition transition, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i;
        int iRound;
        int iCenterX;
        Integer num;
        if (transitionValues == null && transitionValues2 == null) {
            return 0L;
        }
        if (transitionValues2 == null) {
            i = -1;
        } else {
            if (((transitionValues == null || (num = (Integer) transitionValues.a.get("android:visibilityPropagation:visibility")) == null) ? 8 : num.intValue()) == 0) {
                i = -1;
            } else {
                transitionValues = transitionValues2;
                i = 1;
            }
        }
        int iC = VisibilityPropagation.c(transitionValues, 0);
        int iC2 = VisibilityPropagation.c(transitionValues, 1);
        Transition.EpicenterCallback epicenterCallback = transition.w;
        Rect rectA = epicenterCallback == null ? null : epicenterCallback.a();
        if (rectA != null) {
            iCenterX = rectA.centerX();
            iRound = rectA.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int iRound2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + iArr[0]);
            iRound = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + iArr[1]);
            iCenterX = iRound2;
        }
        float f = iCenterX - iC;
        float f2 = iRound - iC2;
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float width = viewGroup.getWidth();
        float height = viewGroup.getHeight();
        float f3 = width - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f4 = height - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float fSqrt2 = fSqrt / ((float) Math.sqrt((f4 * f4) + (f3 * f3)));
        long j = transition.c;
        if (j < 0) {
            j = 300;
        }
        return Math.round(((j * ((long) i)) / UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * fSqrt2);
    }
}
