package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
class ScrollbarHelper {
    public static int a(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.getChildCount() != 0 && state.b() != 0 && view != null && view2 != null) {
            if (!z) {
                return Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1;
            }
            return Math.min(orientationHelper.n(), orientationHelper.d(view2) - orientationHelper.g(view));
        }
        return 0;
    }

    public static int b(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z, boolean z2) {
        int iMax;
        if (layoutManager.getChildCount() == 0 || state.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMin = Math.min(layoutManager.getPosition(view), layoutManager.getPosition(view2));
        int iMax2 = Math.max(layoutManager.getPosition(view), layoutManager.getPosition(view2));
        if (z2) {
            iMax = Math.max(0, (state.b() - iMax2) - 1);
        } else {
            iMax = Math.max(0, iMin);
        }
        if (!z) {
            return iMax;
        }
        return Math.round((iMax * (Math.abs(orientationHelper.d(view2) - orientationHelper.g(view)) / (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1))) + (orientationHelper.m() - orientationHelper.g(view)));
    }

    public static int c(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.getChildCount() != 0 && state.b() != 0 && view != null && view2 != null) {
            if (!z) {
                return state.b();
            }
            return (int) (((orientationHelper.d(view2) - orientationHelper.g(view)) / (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1)) * state.b());
        }
        return 0;
    }
}
