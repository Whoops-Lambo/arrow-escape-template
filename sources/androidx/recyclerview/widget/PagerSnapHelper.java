package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class PagerSnapHelper extends SnapHelper {
    public OrientationHelper b;
    public OrientationHelper c;

    @Override // androidx.recyclerview.widget.SnapHelper
    public final int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = a(view, c(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = a(view, d(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final OrientationHelper c(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.c;
        if (orientationHelper == null || orientationHelper.a != layoutManager) {
            this.c = new OrientationHelper.AnonymousClass1(layoutManager);
        }
        return this.c;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final RecyclerView.SmoothScroller createScroller(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.mRecyclerView.getContext()) { // from class: androidx.recyclerview.widget.PagerSnapHelper.1
                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public final int calculateTimeForScrolling(int i) {
                    return Math.min(100, super.calculateTimeForScrolling(i));
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                public final void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    PagerSnapHelper pagerSnapHelper = PagerSnapHelper.this;
                    int[] iArrCalculateDistanceToFinalSnap = pagerSnapHelper.calculateDistanceToFinalSnap(pagerSnapHelper.mRecyclerView.getLayoutManager(), view);
                    int i = iArrCalculateDistanceToFinalSnap[0];
                    int i2 = iArrCalculateDistanceToFinalSnap[1];
                    int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                    if (iCalculateTimeForDeceleration > 0) {
                        action.b(i, i2, this.mDecelerateInterpolator, iCalculateTimeForDeceleration);
                    }
                }
            };
        }
        return null;
    }

    public final OrientationHelper d(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.b;
        if (orientationHelper == null || orientationHelper.a != layoutManager) {
            this.b = new OrientationHelper.AnonymousClass2(layoutManager);
        }
        return this.b;
    }

    public static int a(View view, OrientationHelper orientationHelper) {
        return ((orientationHelper.e(view) / 2) + orientationHelper.g(view)) - ((orientationHelper.n() / 2) + orientationHelper.m());
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

    @Override // androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return b(layoutManager, d(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return b(layoutManager, c(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.SnapHelper
    public final int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        OrientationHelper orientationHelperC;
        boolean z;
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (itemCount != 0) {
            View view = null;
            if (layoutManager.canScrollVertically()) {
                orientationHelperC = d(layoutManager);
            } else if (layoutManager.canScrollHorizontally()) {
                orientationHelperC = c(layoutManager);
            } else {
                orientationHelperC = null;
            }
            if (orientationHelperC != null) {
                int childCount = layoutManager.getChildCount();
                boolean z2 = false;
                int i3 = Integer.MAX_VALUE;
                int i4 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = layoutManager.getChildAt(i5);
                    if (childAt != null) {
                        int iA = a(childAt, orientationHelperC);
                        if (iA <= 0 && iA > i4) {
                            view2 = childAt;
                            i4 = iA;
                        }
                        if (iA >= 0 && iA < i3) {
                            view = childAt;
                            i3 = iA;
                        }
                    }
                }
                int i6 = 1;
                if (!layoutManager.canScrollHorizontally() ? i2 > 0 : i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && view != null) {
                    return layoutManager.getPosition(view);
                }
                if (!z && view2 != null) {
                    return layoutManager.getPosition(view2);
                }
                if (z) {
                    view = view2;
                }
                if (view != null) {
                    int position = layoutManager.getPosition(view);
                    int itemCount2 = layoutManager.getItemCount();
                    if ((layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) && (pointFComputeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointFComputeScrollVectorForPosition.y < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                        z2 = true;
                    }
                    if (z2 == z) {
                        i6 = -1;
                    }
                    int i7 = position + i6;
                    if (i7 >= 0 && i7 < itemCount) {
                        return i7;
                    }
                }
            }
        }
        return -1;
    }
}
