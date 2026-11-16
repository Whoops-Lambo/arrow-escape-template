package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class LinearSnapHelper extends SnapHelper {
    public OrientationHelper b;
    public OrientationHelper c;

    @Override // androidx.recyclerview.widget.SnapHelper
    public final int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            OrientationHelper orientationHelperC = c(layoutManager);
            iArr[0] = ((orientationHelperC.e(view) / 2) + orientationHelperC.g(view)) - ((orientationHelperC.n() / 2) + orientationHelperC.m());
        } else {
            iArr[0] = 0;
        }
        if (!layoutManager.canScrollVertically()) {
            iArr[1] = 0;
            return iArr;
        }
        OrientationHelper orientationHelperD = d(layoutManager);
        iArr[1] = ((orientationHelperD.e(view) / 2) + orientationHelperD.g(view)) - ((orientationHelperD.n() / 2) + orientationHelperD.m());
        return iArr;
    }

    public final OrientationHelper c(RecyclerView.LayoutManager layoutManager) {
        if (this.c.a != layoutManager) {
            this.c = new OrientationHelper.AnonymousClass1(layoutManager);
        }
        return this.c;
    }

    public final OrientationHelper d(RecyclerView.LayoutManager layoutManager) {
        if (this.b.a != layoutManager) {
            this.b = new OrientationHelper.AnonymousClass2(layoutManager);
        }
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.SnapHelper
    public final int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int itemCount;
        View viewFindSnapView;
        int position;
        int i3;
        PointF pointFComputeScrollVectorForPosition;
        int iA;
        int iA2;
        if ((layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) && (itemCount = layoutManager.getItemCount()) != 0 && (viewFindSnapView = findSnapView(layoutManager)) != null && (position = layoutManager.getPosition(viewFindSnapView)) != -1 && (pointFComputeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition((i3 = itemCount - 1))) != null) {
            if (layoutManager.canScrollHorizontally()) {
                iA = a(layoutManager, c(layoutManager), i, 0);
                if (pointFComputeScrollVectorForPosition.x < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    iA = -iA;
                }
            } else {
                iA = 0;
            }
            if (layoutManager.canScrollVertically()) {
                iA2 = a(layoutManager, d(layoutManager), 0, i2);
                if (pointFComputeScrollVectorForPosition.y < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    iA2 = -iA2;
                }
            } else {
                iA2 = 0;
            }
            if (layoutManager.canScrollVertically()) {
                iA = iA2;
            }
            if (iA != 0) {
                int i4 = position + iA;
                int i5 = i4 >= 0 ? i4 : 0;
                return i5 >= itemCount ? i3 : i5;
            }
        }
        return -1;
    }

    public static View b(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iN = (orientationHelper.n() / 2) + orientationHelper.m();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int iAbs = Math.abs(((orientationHelper.e(childAt) / 2) + orientationHelper.g(childAt)) - iN);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    public final int a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i, int i2) {
        int i3;
        int[] iArrCalculateScrollDistance = calculateScrollDistance(i, i2);
        int childCount = layoutManager.getChildCount();
        float f = 1.0f;
        if (childCount != 0) {
            View view = null;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = layoutManager.getChildAt(i6);
                int position = layoutManager.getPosition(childAt);
                if (position != -1) {
                    if (position < i5) {
                        view = childAt;
                        i5 = position;
                    }
                    if (position > i4) {
                        view2 = childAt;
                        i4 = position;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(orientationHelper.d(view), orientationHelper.d(view2)) - Math.min(orientationHelper.g(view), orientationHelper.g(view2));
                if (iMax != 0) {
                    f = (iMax * 1.0f) / ((i4 - i5) + 1);
                }
            }
        }
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        if (Math.abs(iArrCalculateScrollDistance[0]) > Math.abs(iArrCalculateScrollDistance[1])) {
            i3 = iArrCalculateScrollDistance[0];
        } else {
            i3 = iArrCalculateScrollDistance[1];
        }
        return Math.round(i3 / f);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return b(layoutManager, d(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return b(layoutManager, c(layoutManager));
        }
        return null;
    }
}
