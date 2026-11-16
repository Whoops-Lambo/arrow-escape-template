package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3645sa extends ViewGroup {
    public static final int A01 = (int) (AbstractC3482px.A02 * 8.0f);
    public int A00;

    public C3645sa(C2055Hi c2055Hi) {
        super(c2055Hi);
        setMotionEventSplittingEnabled(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int childHeight = getPaddingTop();
        for (int childWidth = 0; childWidth < width; childWidth++) {
            View child = getChildAt(childWidth);
            int i6 = child.getMeasuredWidth();
            int yPos = child.getMeasuredHeight();
            int width = paddingLeft + i6;
            if (width > i5) {
                paddingLeft = getPaddingLeft();
                int width2 = this.A00;
                childHeight += width2;
            }
            int xPos = paddingLeft + i6;
            int width3 = childHeight + yPos;
            child.layout(paddingLeft, childHeight, xPos, width3);
            int width4 = A01;
            paddingLeft += width4 + i6;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int lines = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size = View.MeasureSpec.getSize(i2);
        int width = getPaddingTop();
        int i3 = size - width;
        int width2 = getPaddingBottom();
        int height = i3 - width2;
        int childWidth = getPaddingLeft();
        int iMax = 0;
        int childHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE);
        int width3 = getChildCount();
        int i4 = width3 > 0 ? 1 : 0;
        for (int lineHeight = 0; lineHeight < width; lineHeight++) {
            View childAt = getChildAt(lineHeight);
            int width4 = View.MeasureSpec.makeMeasureSpec(lines, Integer.MIN_VALUE);
            childAt.measure(width4, childHeightMeasureSpec);
            int xPos = childAt.getMeasuredWidth();
            int height2 = childAt.getMeasuredHeight();
            int width5 = A01;
            iMax = Math.max(iMax, height2 + width5);
            int width6 = childWidth + xPos;
            if (width6 > lines) {
                i4++;
                childWidth = getPaddingLeft();
            }
            int width7 = A01;
            childWidth += width7 + xPos;
        }
        this.A00 = iMax;
        int height3 = this.A00;
        int width8 = A01;
        setMeasuredDimension(lines, (height3 * i4) + width8);
    }
}
