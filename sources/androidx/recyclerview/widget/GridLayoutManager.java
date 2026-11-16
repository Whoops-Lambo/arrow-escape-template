package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.jc1;
import defpackage.nj;
import defpackage.pv1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean a;
    public int b;
    public int[] c;
    public View[] d;
    public final SparseIntArray e;
    public final SparseIntArray f;
    public DefaultSpanSizeLookup g;
    public final Rect h;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class DefaultSpanSizeLookup extends SpanSizeLookup {
        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public final int e(int i, int i2) {
            return i % i2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class SpanSizeLookup {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();
        public boolean c = false;
        public boolean d = false;

        public int e(int i, int i2) {
            int i3;
            int i4;
            SparseIntArray sparseIntArray;
            int iA;
            if (1 != i2) {
                if (!this.c || (iA = a((sparseIntArray = this.a), i)) < 0) {
                    i3 = 0;
                    i4 = 0;
                } else {
                    i3 = sparseIntArray.get(iA) + 1;
                    i4 = iA + 1;
                }
                while (i4 < i) {
                    i3++;
                    if (i3 == i2) {
                        i3 = 0;
                    } else if (i3 > i2) {
                        i3 = 1;
                    }
                    i4++;
                }
                if (i3 + 1 <= i2) {
                    return i3;
                }
            }
            return 0;
        }

        public final int b(int i, int i2) {
            if (!this.d) {
                return d(i, i2);
            }
            SparseIntArray sparseIntArray = this.b;
            int i3 = sparseIntArray.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iD = d(i, i2);
            sparseIntArray.put(i, iD);
            return iD;
        }

        public final int c(int i, int i2) {
            if (!this.c) {
                return e(i, i2);
            }
            SparseIntArray sparseIntArray = this.a;
            int i3 = sparseIntArray.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iE = e(i, i2);
            sparseIntArray.put(i, iE);
            return iE;
        }

        public final int d(int i, int i2) {
            int iC;
            int i3;
            int i4;
            SparseIntArray sparseIntArray;
            int iA;
            if (!this.d || (iA = a((sparseIntArray = this.b), i)) == -1) {
                iC = 0;
                i3 = 0;
                i4 = 0;
            } else {
                i3 = sparseIntArray.get(iA);
                i4 = iA + 1;
                iC = c(iA, i2) + 1;
                if (iC == i2) {
                    i3++;
                    iC = 0;
                }
            }
            while (i4 < i) {
                iC++;
                if (iC == i2) {
                    i3++;
                    iC = 0;
                } else if (iC > i2) {
                    i3++;
                    iC = 1;
                }
                i4++;
            }
            return iC + 1 > i2 ? i3 + 1 : i3;
        }

        public final void f() {
            this.a.clear();
        }

        public static int a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 >= 0 && i4 < sparseIntArray.size()) {
                return sparseIntArray.keyAt(i4);
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LayoutParams extends RecyclerView.LayoutParams {
        public int f;
        public int g;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f = -1;
            this.g = 0;
        }
    }

    public final void B(int i) {
        int i2;
        int[] iArr = this.c;
        int i3 = this.b;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.c = iArr;
    }

    public final void C() {
        View[] viewArr = this.d;
        if (viewArr == null || viewArr.length != this.b) {
            this.d = new View[this.b];
        }
    }

    public final int D(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.c;
        int i3 = this.b;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int E(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!state.g) {
            return this.g.b(i, this.b);
        }
        int iB = recycler.b(i);
        if (iB != -1) {
            return this.g.b(iB, this.b);
        }
        pv1.u(i, "Cannot find span size for pre layout position. ", "GridLayoutManager");
        return 0;
    }

    public final int F(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!state.g) {
            return this.g.c(i, this.b);
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = recycler.b(i);
        if (iB != -1) {
            return this.g.c(iB, this.b);
        }
        pv1.u(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", "GridLayoutManager");
        return 0;
    }

    public final int G(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!state.g) {
            this.g.getClass();
            return 1;
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (recycler.b(i) == -1) {
            pv1.u(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", "GridLayoutManager");
            return 1;
        }
        this.g.getClass();
        return 1;
    }

    public final void I(int i) {
        if (i == this.b) {
            return;
        }
        this.a = true;
        if (i < 1) {
            d.r(pv1.k(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.b = i;
        this.g.f();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i;
        int i2 = this.b;
        for (int i3 = 0; i3 < this.b && (i = layoutState.d) >= 0 && i < state.b() && i2 > 0; i3++) {
            layoutPrefetchRegistry.a(layoutState.d, Math.max(0, layoutState.g));
            this.g.getClass();
            i2--;
            layoutState.d += layoutState.e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams2.f = -1;
            layoutParams2.g = 0;
            return layoutParams2;
        }
        LayoutParams layoutParams3 = new LayoutParams(layoutParams);
        layoutParams3.f = -1;
        layoutParams3.g = 0;
        return layoutParams3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return this.b;
        }
        if (state.b() < 1) {
            return 0;
        }
        return E(state.b() - 1, recycler, state) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return this.b;
        }
        if (state.b() < 1) {
            return 0;
        }
        return E(state.b() - 1, recycler, state) + 1;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x023d  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, LinearLayoutManager.LayoutChunkResult layoutChunkResult) {
        int i;
        int i2;
        int i3;
        int paddingLeft;
        int i4;
        int paddingTop;
        int iF;
        int paddingLeft2;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z;
        int i5;
        View viewB;
        GridLayoutManager gridLayoutManager = this;
        int iL = gridLayoutManager.mOrientationHelper.l();
        boolean z2 = iL != 1073741824;
        int i6 = gridLayoutManager.getChildCount() > 0 ? gridLayoutManager.c[gridLayoutManager.b] : 0;
        if (z2) {
            gridLayoutManager.J();
        }
        boolean z3 = layoutState.e == 1;
        int iF2 = gridLayoutManager.b;
        if (!z3) {
            iF2 = gridLayoutManager.F(layoutState.d, recycler, state) + gridLayoutManager.G(layoutState.d, recycler, state);
        }
        int i7 = 0;
        while (i7 < gridLayoutManager.b && (i5 = layoutState.d) >= 0 && i5 < state.b() && iF2 > 0) {
            int i8 = layoutState.d;
            int iG = gridLayoutManager.G(i8, recycler, state);
            if (iG > gridLayoutManager.b) {
                d.r(nj.l(gridLayoutManager.b, " spans.", jc1.t("Item at position ", i8, " requires ", iG, " spans but GridLayoutManager has only ")));
                return;
            }
            iF2 -= iG;
            if (iF2 < 0 || (viewB = layoutState.b(recycler)) == null) {
                break;
            }
            gridLayoutManager.d[i7] = viewB;
            i7++;
        }
        if (i7 == 0) {
            layoutChunkResult.b = true;
            return;
        }
        if (z3) {
            i3 = 1;
            i2 = i7;
            i = 0;
        } else {
            i = i7 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i9 = 0;
        while (i != i2) {
            View view = gridLayoutManager.d[i];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int iG2 = gridLayoutManager.G(gridLayoutManager.getPosition(view), recycler, state);
            layoutParams.g = iG2;
            layoutParams.f = i9;
            i9 += iG2;
            i += i3;
        }
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            View view2 = gridLayoutManager.d[i11];
            if (layoutState.k != null) {
                z = false;
                if (z3) {
                    gridLayoutManager.addDisappearingView(view2);
                } else {
                    gridLayoutManager.addDisappearingView(view2, 0);
                }
            } else if (z3) {
                gridLayoutManager.addView(view2);
                z = false;
            } else {
                z = false;
                gridLayoutManager.addView(view2, 0);
            }
            gridLayoutManager.calculateItemDecorationsForChild(view2, gridLayoutManager.h);
            gridLayoutManager.H(view2, iL, z);
            int iE = gridLayoutManager.mOrientationHelper.e(view2);
            if (iE > i10) {
                i10 = iE;
            }
            float f2 = (gridLayoutManager.mOrientationHelper.f(view2) * 1.0f) / ((LayoutParams) view2.getLayoutParams()).g;
            if (f2 > f) {
                f = f2;
            }
        }
        if (z2) {
            gridLayoutManager.B(Math.max(Math.round(f * gridLayoutManager.b), i6));
            i10 = 0;
            for (int i12 = 0; i12 < i7; i12++) {
                View view3 = gridLayoutManager.d[i12];
                gridLayoutManager.H(view3, 1073741824, true);
                int iE2 = gridLayoutManager.mOrientationHelper.e(view3);
                if (iE2 > i10) {
                    i10 = iE2;
                }
            }
        }
        for (int i13 = 0; i13 < i7; i13++) {
            View view4 = gridLayoutManager.d[i13];
            if (gridLayoutManager.mOrientationHelper.e(view4) != i10) {
                LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
                Rect rect = layoutParams2.b;
                int i14 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                int i15 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                int iD = gridLayoutManager.D(layoutParams2.f, layoutParams2.g);
                if (gridLayoutManager.mOrientation == 1) {
                    childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(iD, 1073741824, i15, ((ViewGroup.MarginLayoutParams) layoutParams2).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i15, 1073741824);
                    childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(iD, 1073741824, i14, ((ViewGroup.MarginLayoutParams) layoutParams2).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                if (gridLayoutManager.shouldReMeasureChild(view4, childMeasureSpec2, childMeasureSpec, (RecyclerView.LayoutParams) view4.getLayoutParams())) {
                    view4.measure(childMeasureSpec2, childMeasureSpec);
                }
            }
        }
        int i16 = 0;
        layoutChunkResult.a = i10;
        int i17 = gridLayoutManager.mOrientation;
        int i18 = layoutState.f;
        int iF3 = layoutState.b;
        if (i17 != 1) {
            if (i18 == -1) {
                i4 = iF3 - i10;
                paddingLeft = iF3;
            } else {
                paddingLeft = iF3 + i10;
                i4 = iF3;
            }
            paddingTop = 0;
            iF3 = 0;
        } else if (i18 == -1) {
            paddingTop = iF3 - i10;
            i4 = 0;
            paddingLeft = 0;
        } else {
            paddingTop = iF3;
            paddingLeft = 0;
            iF3 += i10;
            i4 = 0;
        }
        while (true) {
            View[] viewArr = gridLayoutManager.d;
            if (i16 >= i7) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            int iF4 = i4;
            View view5 = viewArr[i16];
            LayoutParams layoutParams3 = (LayoutParams) view5.getLayoutParams();
            if (gridLayoutManager.mOrientation == 1) {
                if (gridLayoutManager.isLayoutRTL()) {
                    paddingLeft = gridLayoutManager.getPaddingLeft() + gridLayoutManager.c[gridLayoutManager.b - layoutParams3.f];
                    iF4 = paddingLeft - gridLayoutManager.mOrientationHelper.f(view5);
                } else {
                    paddingLeft2 = gridLayoutManager.getPaddingLeft() + gridLayoutManager.c[layoutParams3.f];
                    iF = gridLayoutManager.mOrientationHelper.f(view5) + paddingLeft2;
                }
                int i19 = iF3;
                gridLayoutManager.layoutDecoratedWithMargins(view5, paddingLeft2, paddingTop, iF, i19);
                i4 = paddingLeft2;
                paddingLeft = iF;
                iF3 = i19;
                if (layoutParams3.a.isRemoved() || layoutParams3.a.isUpdated()) {
                    layoutChunkResult.c = true;
                }
                layoutChunkResult.d = view5.hasFocusable() | layoutChunkResult.d;
                i16++;
                gridLayoutManager = this;
            } else {
                paddingTop = gridLayoutManager.getPaddingTop() + gridLayoutManager.c[layoutParams3.f];
                iF3 = gridLayoutManager.mOrientationHelper.f(view5) + paddingTop;
            }
            iF = paddingLeft;
            paddingLeft2 = iF4;
            int i110 = iF3;
            gridLayoutManager.layoutDecoratedWithMargins(view5, paddingLeft2, paddingTop, iF, i110);
            i4 = paddingLeft2;
            paddingLeft = iF;
            iF3 = i110;
            if (layoutParams3.a.isRemoved()) {
                layoutChunkResult.c = true;
            } else {
                layoutChunkResult.c = true;
            }
            layoutChunkResult.d = view5.hasFocusable() | layoutChunkResult.d;
            i16++;
            gridLayoutManager = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:73:0x0110  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.Recycler r26, androidx.recyclerview.widget.RecyclerView.State r27) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.g.f();
        this.g.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.g.f();
        this.g.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.g.f();
        this.g.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.g.f();
        this.g.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.g.f();
        this.g.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z = state.g;
        SparseIntArray sparseIntArray = this.f;
        SparseIntArray sparseIntArray2 = this.e;
        if (z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
                int layoutPosition = layoutParams.a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, layoutParams.g);
                sparseIntArray.put(layoutPosition, layoutParams.f);
            }
        }
        super.onLayoutChildren(recycler, state);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        if (this.c == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.c;
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.c;
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z) {
        if (z) {
            d.u("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.setStackFromEnd(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.a;
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new DefaultSpanSizeLookup();
        this.h = new Rect();
        I(RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2).b);
    }

    public final void H(View view, int i, boolean z) {
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean zShouldMeasureChild;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int iD = D(layoutParams.f, layoutParams.g);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(iD, i, i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(this.mOrientationHelper.n(), getHeightMode(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.LayoutManager.getChildMeasureSpec(iD, i, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int childMeasureSpec4 = RecyclerView.LayoutManager.getChildMeasureSpec(this.mOrientationHelper.n(), getWidthMode(), i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            zShouldMeasureChild = shouldReMeasureChild(view, childMeasureSpec2, childMeasureSpec, layoutParams2);
        } else {
            zShouldMeasureChild = shouldMeasureChild(view, childMeasureSpec2, childMeasureSpec, layoutParams2);
        }
        if (zShouldMeasureChild) {
            view.measure(childMeasureSpec2, childMeasureSpec);
        }
    }

    public final void J() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        B(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z, boolean z2) {
        int i;
        int childCount;
        int childCount2 = getChildCount();
        int i2 = 1;
        if (z2) {
            childCount = getChildCount() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
        }
        int iB = state.b();
        ensureLayoutState();
        int iM = this.mOrientationHelper.m();
        int i3 = this.mOrientationHelper.i();
        View view = null;
        View view2 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iB && F(position, recycler, state) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).a.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.g(childAt) < i3 && this.mOrientationHelper.d(childAt) >= iM) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i2;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorInfo, int i) {
        boolean z;
        super.onAnchorReady(recycler, state, anchorInfo, i);
        J();
        if (state.b() > 0 && !state.g) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            int iF = F(anchorInfo.b, recycler, state);
            if (z) {
                while (iF > 0) {
                    int i2 = anchorInfo.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    anchorInfo.b = i3;
                    iF = F(i3, recycler, state);
                }
            } else {
                int iB = state.b() - 1;
                int i4 = anchorInfo.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iF2 = F(i5, recycler, state);
                    if (iF2 <= iF) {
                        break;
                    }
                    i4 = i5;
                    iF = iF2;
                }
                anchorInfo.b = i4;
            }
        }
        C();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.j(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int iE = E(layoutParams2.a.getLayoutPosition(), recycler, state);
        int i = this.mOrientation;
        int i2 = layoutParams2.f;
        int i3 = layoutParams2.g;
        if (i == 0) {
            accessibilityNodeInfoCompat.m(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(i2, i3, iE, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.m(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(iE, 1, i2, i3, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.a = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        J();
        C();
        return super.scrollHorizontallyBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        J();
        C();
        return super.scrollVerticallyBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f = -1;
        layoutParams.g = 0;
        return layoutParams;
    }

    public GridLayoutManager(int i, int i2) {
        super(i2, false);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new DefaultSpanSizeLookup();
        this.h = new Rect();
        I(i);
    }
}
