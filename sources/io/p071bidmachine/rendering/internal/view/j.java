package io.p071bidmachine.rendering.internal.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class j extends RelativeLayout {
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Integer numValueOf;
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            childAt.getClass();
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof i) {
                i iVar = (i) layoutParams;
                float f = iVar.c;
                Integer numValueOf2 = null;
                if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f < 1.0f) {
                    int i4 = iVar.a;
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (i4 <= 0) {
                        if (i4 == -1) {
                            i4 = size;
                        } else if (i4 == -2) {
                            i4 = measuredWidth;
                        } else {
                            numValueOf = null;
                        }
                        if (i4 == 0) {
                            numValueOf = Integer.valueOf(Math.round(i4 * f));
                        } else {
                            numValueOf = null;
                        }
                    } else if (i4 == 0) {
                        numValueOf = Integer.valueOf(Math.round(i4 * f));
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        ((RelativeLayout.LayoutParams) iVar).width = numValueOf.intValue();
                    }
                }
                float f2 = iVar.d;
                if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 < 1.0f) {
                    int i5 = iVar.b;
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (i5 <= 0) {
                        if (i5 == -1) {
                            i5 = size2;
                        } else if (i5 == -2) {
                            i5 = measuredHeight;
                        }
                        if (i5 != 0) {
                            numValueOf2 = Integer.valueOf(Math.round(i5 * f2));
                        }
                    } else if (i5 != 0) {
                        numValueOf2 = Integer.valueOf(Math.round(i5 * f2));
                    }
                    if (numValueOf2 != null) {
                        ((RelativeLayout.LayoutParams) iVar).height = numValueOf2.intValue();
                    }
                }
            }
        }
        super.onMeasure(i, i2);
    }
}
