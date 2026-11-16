package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ecffri.arrows.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ap;
import defpackage.bp;
import defpackage.d;
import defpackage.pv1;
import defpackage.r12;
import defpackage.ro1;
import defpackage.wo;
import defpackage.xo;
import defpackage.yo;
import defpackage.zo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {
    public final ro1 a;
    public bp b;
    public final View.OnLayoutChangeListener c;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public final PointF computeScrollVectorForPosition(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
    }

    public final void setOrientation(int i) {
        bp apVar;
        if (i != 0 && i != 1) {
            d.r(pv1.k(i, "invalid orientation:"));
            return;
        }
        assertNotInLayoutOrScroll(null);
        bp bpVar = this.b;
        if (bpVar == null || i != bpVar.a) {
            if (i == 0) {
                apVar = new ap(this);
            } else {
                if (i != 1) {
                    d.r("invalid orientation");
                    return;
                }
                apVar = new zo(this);
            }
            this.b = apVar;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChildWithMargins(View view, int i, int i2) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final boolean n() {
        return this.b.a == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        xo xoVar = new xo(recyclerView.getContext());
        xoVar.setTargetPosition(i);
        startSmoothScroll(xoVar);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new yo();
        this.c = new wo(this, 0);
        this.a = new ro1();
        requestLayout();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r12.e);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            requestLayout();
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return !n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(RecyclerView.State state) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        rect.centerY();
        if (n()) {
            rect.centerX();
        }
        throw null;
    }

    public final boolean o() {
        if (n() && getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        Context context = recyclerView.getContext();
        ro1 ro1Var = this.a;
        float dimension = ro1Var.a;
        if (dimension <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        ro1Var.a = dimension;
        float dimension2 = ro1Var.b;
        if (dimension2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        ro1Var.b = dimension2;
        requestLayout();
        recyclerView.addOnLayoutChangeListener(this.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        onDetachedFromWindow(recyclerView);
        recyclerView.removeOnLayoutChangeListener(this.c);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        byte b;
        if (getChildCount() != 0) {
            int i2 = this.b.a;
            if (i != 1) {
                if (i != 2) {
                    if (i != 17) {
                        if (i != 33) {
                            if (i != 66) {
                                if (i != 130) {
                                    Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                                } else if (i2 == 1) {
                                    b = 1;
                                }
                                b = -2147483648;
                            } else if (i2 != 0) {
                                b = -2147483648;
                            } else if (!o()) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                        } else if (i2 != 1) {
                            b = -2147483648;
                        } else {
                            b = -1;
                        }
                    } else if (i2 != 0) {
                        b = -2147483648;
                    } else if (o()) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else {
                    b = 1;
                }
            } else {
                b = -1;
            }
            if (b != -2147483648) {
                int childCount = 0;
                if (b == -1) {
                    if (getPosition(view) != 0) {
                        int position = getPosition(getChildAt(0)) - 1;
                        if (position >= 0 && position < getItemCount()) {
                            this.b.d();
                            throw null;
                        }
                        if (o()) {
                            childCount = getChildCount() - 1;
                        }
                        return getChildAt(childCount);
                    }
                } else if (getPosition(view) != getItemCount() - 1) {
                    int position2 = getPosition(getChildAt(getChildCount() - 1)) + 1;
                    if (position2 >= 0 && position2 < getItemCount()) {
                        this.b.d();
                        throw null;
                    }
                    if (!o()) {
                        childCount = getChildCount() - 1;
                    }
                    return getChildAt(childCount);
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int height;
        if (state.b() > 0) {
            if (n()) {
                height = getWidth();
            } else {
                height = getHeight();
            }
            if (height > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                o();
                measureChildWithMargins(recycler.l(0, Long.MAX_VALUE).itemView, 0, 0);
                throw null;
            }
        }
        removeAndRecycleAllViews(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return;
        }
        getPosition(getChildAt(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!n() || getChildCount() == 0 || i == 0) {
            return 0;
        }
        measureChildWithMargins(recycler.l(0, Long.MAX_VALUE).itemView, 0, 0);
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!canScrollVertically() || getChildCount() == 0 || i == 0) {
            return 0;
        }
        measureChildWithMargins(recycler.l(0, Long.MAX_VALUE).itemView, 0, 0);
        throw null;
    }

    public CarouselLayoutManager() {
        ro1 ro1Var = new ro1();
        new yo();
        this.c = new wo(this, 0);
        this.a = ro1Var;
        requestLayout();
        setOrientation(0);
    }
}
