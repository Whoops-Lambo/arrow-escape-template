package io.p071bidmachine.rendering.internal.meanbackground;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class z {
    public static View a(View view) {
        view.getClass();
        ViewGroup viewGroup = (ViewGroup) view.findViewWithTag("ads");
        if (viewGroup == null) {
            return view;
        }
        int childCount = viewGroup.getChildCount();
        View view2 = viewGroup;
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            int measuredHeight = childAt.getMeasuredHeight() * childAt.getMeasuredWidth();
            if (measuredHeight > i) {
                view2 = childAt;
                i = measuredHeight;
            }
        }
        return view2;
    }
}
