package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.d;
import defpackage.h50;
import defpackage.pv1;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements ItemTouchHelper.ViewDropHandler, RecyclerView.SmoothScroller.ScrollVectorProvider {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final AnchorInfo mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final LayoutChunkResult mLayoutChunkResult;
    private LayoutState mLayoutState;
    int mOrientation;
    OrientationHelper mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnchorInfo {
        public OrientationHelper a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public final void c() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public final void a() {
            boolean z = this.d;
            OrientationHelper orientationHelper = this.a;
            this.c = z ? orientationHelper.i() : orientationHelper.m();
        }

        public final void b(int i, View view) {
            int iO = this.a.o();
            if (iO >= 0) {
                boolean z = this.d;
                OrientationHelper orientationHelper = this.a;
                if (z) {
                    this.c = this.a.o() + orientationHelper.d(view);
                } else {
                    this.c = orientationHelper.g(view);
                }
                this.b = i;
                return;
            }
            this.b = i;
            boolean z2 = this.d;
            OrientationHelper orientationHelper2 = this.a;
            if (!z2) {
                int iG = orientationHelper2.g(view);
                int iM = iG - this.a.m();
                this.c = iG;
                if (iM > 0) {
                    int i2 = (this.a.i() - Math.min(0, (this.a.i() - iO) - this.a.d(view))) - (this.a.e(view) + iG);
                    if (i2 < 0) {
                        this.c -= Math.min(iM, -i2);
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = (orientationHelper2.i() - iO) - this.a.d(view);
            this.c = this.a.i() - i3;
            if (i3 > 0) {
                int iE = this.c - this.a.e(view);
                int iM2 = this.a.m();
                int iMin = iE - (Math.min(this.a.g(view) - iM2, 0) + iM2);
                if (iMin < 0) {
                    this.c = Math.min(i3, -iMin) + this.c;
                }
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.b);
            sb.append(", mCoordinate=");
            sb.append(this.c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.d);
            sb.append(", mValid=");
            return h50.m(sb, this.e, '}');
        }

        public AnchorInfo() {
            c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LayoutChunkResult {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LayoutState {
        public boolean a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public List k;
        public boolean l;

        public final void a(View view) {
            int layoutPosition;
            int size = this.k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((RecyclerView.ViewHolder) this.k.get(i2)).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.a.isRemoved() && (layoutPosition = (layoutParams.a.getLayoutPosition() - this.d) * this.e) >= 0 && layoutPosition < i) {
                    view2 = view3;
                    if (layoutPosition == 0) {
                        break;
                    } else {
                        i = layoutPosition;
                    }
                }
            }
            if (view2 == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.LayoutParams) view2.getLayoutParams()).a.getLayoutPosition();
            }
        }

        public final View b(RecyclerView.Recycler recycler) {
            List list = this.k;
            if (list == null) {
                View view = recycler.l(this.d, Long.MAX_VALUE).itemView;
                this.d += this.e;
                return view;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view2 = ((RecyclerView.ViewHolder) this.k.get(i)).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view2.getLayoutParams();
                if (!layoutParams.a.isRemoved() && this.d == layoutParams.a.getLayoutPosition()) {
                    a(view2);
                    return view2;
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int a;
        public int b;
        public boolean c;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.a = parcel.readInt();
                savedState.b = parcel.readInt();
                savedState.c = parcel.readInt() == 1;
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        if (i == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i == 17) {
            return this.mOrientation == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.mOrientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.mOrientation == 0 ? 1 : Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(RecyclerView.State state) {
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.c();
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z) {
            return;
        }
        this.mStackFromEnd = z;
        requestLayout();
    }

    public final void A(int i, int i2) {
        this.mLayoutState.c = i2 - this.mOrientationHelper.m();
        LayoutState layoutState = this.mLayoutState;
        layoutState.d = i;
        layoutState.e = this.mShouldReverseLayout ? 1 : -1;
        layoutState.f = -1;
        layoutState.b = i2;
        layoutState.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        y(i > 0 ? 1 : -1, Math.abs(i), true, state);
        collectPrefetchPositionsForLayoutState(state, this.mLayoutState, layoutPrefetchRegistry);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        boolean z;
        int i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || (i2 = savedState.a) < 0) {
            x();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            layoutPrefetchRegistry.a(i2, 0);
            i2 += i3;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i = layoutState.d;
        if (i < 0 || i >= state.b()) {
            return;
        }
        layoutPrefetchRegistry.a(i, Math.max(0, layoutState.g));
    }

    public LayoutState createLayoutState() {
        LayoutState layoutState = new LayoutState();
        layoutState.a = true;
        layoutState.h = 0;
        layoutState.i = 0;
        layoutState.k = null;
        return layoutState;
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state, boolean z) {
        int i;
        int i2 = layoutState.c;
        int i3 = layoutState.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                layoutState.g = i3 + i2;
            }
            v(recycler, layoutState);
        }
        int i4 = layoutState.c + layoutState.h;
        LayoutChunkResult layoutChunkResult = this.mLayoutChunkResult;
        while (true) {
            if ((!layoutState.l && i4 <= 0) || (i = layoutState.d) < 0 || i >= state.b()) {
                break;
            }
            layoutChunkResult.a = 0;
            layoutChunkResult.b = false;
            layoutChunkResult.c = false;
            layoutChunkResult.d = false;
            layoutChunk(recycler, state, layoutState, layoutChunkResult);
            if (!layoutChunkResult.b) {
                int i5 = layoutState.b;
                int i6 = layoutChunkResult.a;
                layoutState.b = (layoutState.f * i6) + i5;
                if (!layoutChunkResult.c || layoutState.k != null || !state.g) {
                    layoutState.c -= i6;
                    i4 -= i6;
                }
                int i7 = layoutState.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    layoutState.g = i8;
                    int i9 = layoutState.c;
                    if (i9 < 0) {
                        layoutState.g = i8 + i9;
                    }
                    v(recycler, layoutState);
                }
                if (z && layoutChunkResult.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - layoutState.c;
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z, z2) : findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z, z2) : findOneVisibleChild(0, getChildCount(), z, z2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z, boolean z2) {
        int i;
        int childCount;
        int i2;
        ensureLayoutState();
        int childCount2 = getChildCount();
        if (z2) {
            childCount = getChildCount() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
            i2 = 1;
        }
        int iB = state.b();
        int iM = this.mOrientationHelper.m();
        int i3 = this.mOrientationHelper.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int iG = this.mOrientationHelper.g(childAt);
            int iD = this.mOrientationHelper.d(childAt);
            if (position >= 0 && position < iB) {
                if (!((RecyclerView.LayoutParams) childAt.getLayoutParams()).a.isRemoved()) {
                    boolean z3 = iD <= iM && iG < iM;
                    boolean z4 = iG >= i3 && iD > i3;
                    if (!z3 && !z4) {
                        return childAt;
                    }
                    if (z) {
                        if (z4) {
                            view2 = childAt;
                        } else if (view == null) {
                            view = childAt;
                        }
                    } else if (z3) {
                        view2 = childAt;
                    } else if (view == null) {
                        view = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            childCount += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.State state) {
        if (state.a != -1) {
            return this.mOrientationHelper.n();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0203  */
    /* JADX WARN: Code duplicated, block: B:115:0x0206 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x0208  */
    /* JADX WARN: Code duplicated, block: B:118:0x020c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0210  */
    /* JADX WARN: Code duplicated, block: B:122:0x0217  */
    /* JADX WARN: Code duplicated, block: B:123:0x021d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:85:0x0179  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:99:0x01be  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int iB;
        View focusedChild;
        boolean z;
        boolean z2;
        View viewFindReferenceChild;
        boolean z3;
        OrientationHelper orientationHelper;
        int iG;
        int iD;
        int iM;
        int i;
        boolean z4;
        boolean z5;
        RecyclerView.LayoutParams layoutParams;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int iQ;
        int i7;
        View viewFindViewByPosition;
        int iG2;
        int i8;
        int i9;
        int i10 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && state.b() == 0) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && (i9 = savedState.a) >= 0) {
            this.mPendingScrollPosition = i9;
        }
        ensureLayoutState();
        this.mLayoutState.a = false;
        x();
        View focusedChild2 = getFocusedChild();
        AnchorInfo anchorInfo = this.mAnchorInfo;
        boolean z6 = true;
        if (!anchorInfo.e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            anchorInfo.c();
            AnchorInfo anchorInfo2 = this.mAnchorInfo;
            anchorInfo2.d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            if (state.g || (i2 = this.mPendingScrollPosition) == -1) {
                if (getChildCount() != 0) {
                    focusedChild = getFocusedChild();
                    if (focusedChild != null) {
                        layoutParams = (RecyclerView.LayoutParams) focusedChild.getLayoutParams();
                        if (!layoutParams.a.isRemoved() || layoutParams.a.getLayoutPosition() < 0 || layoutParams.a.getLayoutPosition() >= state.b()) {
                            z = this.mLastStackFromEnd;
                            z2 = this.mStackFromEnd;
                            if (z == z2 || (viewFindReferenceChild = findReferenceChild(recycler, state, anchorInfo2.d, z2)) == null) {
                                anchorInfo2.a();
                                if (this.mStackFromEnd) {
                                    iB = state.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                anchorInfo2.b = iB;
                            } else {
                                int position = getPosition(viewFindReferenceChild);
                                z3 = anchorInfo2.d;
                                orientationHelper = anchorInfo2.a;
                                if (z3) {
                                    anchorInfo2.c = anchorInfo2.a.o() + orientationHelper.d(viewFindReferenceChild);
                                } else {
                                    anchorInfo2.c = orientationHelper.g(viewFindReferenceChild);
                                }
                                anchorInfo2.b = position;
                                if (!state.g && supportsPredictiveItemAnimations()) {
                                    iG = this.mOrientationHelper.g(viewFindReferenceChild);
                                    iD = this.mOrientationHelper.d(viewFindReferenceChild);
                                    iM = this.mOrientationHelper.m();
                                    i = this.mOrientationHelper.i();
                                    if (iD <= iM || iG >= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (iG >= i || iD <= i) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z4 || z5) {
                                        if (anchorInfo2.d) {
                                            iM = i;
                                        }
                                        anchorInfo2.c = iM;
                                    }
                                }
                            }
                        } else {
                            anchorInfo2.b(getPosition(focusedChild), focusedChild);
                        }
                    } else {
                        z = this.mLastStackFromEnd;
                        z2 = this.mStackFromEnd;
                        if (z == z2) {
                            anchorInfo2.a();
                            if (this.mStackFromEnd) {
                                iB = state.b() - 1;
                            } else {
                                iB = 0;
                            }
                            anchorInfo2.b = iB;
                        } else {
                            int position2 = getPosition(viewFindReferenceChild);
                            z3 = anchorInfo2.d;
                            orientationHelper = anchorInfo2.a;
                            if (z3) {
                                anchorInfo2.c = anchorInfo2.a.o() + orientationHelper.d(viewFindReferenceChild);
                            } else {
                                anchorInfo2.c = orientationHelper.g(viewFindReferenceChild);
                            }
                            anchorInfo2.b = position2;
                            if (!state.g) {
                                iG = this.mOrientationHelper.g(viewFindReferenceChild);
                                iD = this.mOrientationHelper.d(viewFindReferenceChild);
                                iM = this.mOrientationHelper.m();
                                i = this.mOrientationHelper.i();
                                if (iD <= iM) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iG >= i) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (anchorInfo2.d) {
                                        iM = i;
                                    }
                                    anchorInfo2.c = iM;
                                } else {
                                    if (anchorInfo2.d) {
                                        iM = i;
                                    }
                                    anchorInfo2.c = iM;
                                }
                            }
                        }
                    }
                } else {
                    anchorInfo2.a();
                    if (this.mStackFromEnd) {
                        iB = state.b() - 1;
                    } else {
                        iB = 0;
                    }
                    anchorInfo2.b = iB;
                }
            } else if (i2 < 0 || i2 >= state.b()) {
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
                if (getChildCount() != 0) {
                    focusedChild = getFocusedChild();
                    if (focusedChild != null) {
                        layoutParams = (RecyclerView.LayoutParams) focusedChild.getLayoutParams();
                        if (layoutParams.a.isRemoved()) {
                            z = this.mLastStackFromEnd;
                            z2 = this.mStackFromEnd;
                            if (z == z2) {
                                anchorInfo2.a();
                                if (this.mStackFromEnd) {
                                    iB = state.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                anchorInfo2.b = iB;
                            } else {
                                int position3 = getPosition(viewFindReferenceChild);
                                z3 = anchorInfo2.d;
                                orientationHelper = anchorInfo2.a;
                                if (z3) {
                                    anchorInfo2.c = anchorInfo2.a.o() + orientationHelper.d(viewFindReferenceChild);
                                } else {
                                    anchorInfo2.c = orientationHelper.g(viewFindReferenceChild);
                                }
                                anchorInfo2.b = position3;
                                if (!state.g) {
                                    iG = this.mOrientationHelper.g(viewFindReferenceChild);
                                    iD = this.mOrientationHelper.d(viewFindReferenceChild);
                                    iM = this.mOrientationHelper.m();
                                    i = this.mOrientationHelper.i();
                                    if (iD <= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iG >= i) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (anchorInfo2.d) {
                                            iM = i;
                                        }
                                        anchorInfo2.c = iM;
                                    } else {
                                        if (anchorInfo2.d) {
                                            iM = i;
                                        }
                                        anchorInfo2.c = iM;
                                    }
                                }
                            }
                        } else {
                            z = this.mLastStackFromEnd;
                            z2 = this.mStackFromEnd;
                            if (z == z2) {
                                anchorInfo2.a();
                                if (this.mStackFromEnd) {
                                    iB = state.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                anchorInfo2.b = iB;
                            } else {
                                int position4 = getPosition(viewFindReferenceChild);
                                z3 = anchorInfo2.d;
                                orientationHelper = anchorInfo2.a;
                                if (z3) {
                                    anchorInfo2.c = anchorInfo2.a.o() + orientationHelper.d(viewFindReferenceChild);
                                } else {
                                    anchorInfo2.c = orientationHelper.g(viewFindReferenceChild);
                                }
                                anchorInfo2.b = position4;
                                if (!state.g) {
                                    iG = this.mOrientationHelper.g(viewFindReferenceChild);
                                    iD = this.mOrientationHelper.d(viewFindReferenceChild);
                                    iM = this.mOrientationHelper.m();
                                    i = this.mOrientationHelper.i();
                                    if (iD <= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iG >= i) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (anchorInfo2.d) {
                                            iM = i;
                                        }
                                        anchorInfo2.c = iM;
                                    } else {
                                        if (anchorInfo2.d) {
                                            iM = i;
                                        }
                                        anchorInfo2.c = iM;
                                    }
                                }
                            }
                        }
                    } else {
                        z = this.mLastStackFromEnd;
                        z2 = this.mStackFromEnd;
                        if (z == z2) {
                            anchorInfo2.a();
                            if (this.mStackFromEnd) {
                                iB = state.b() - 1;
                            } else {
                                iB = 0;
                            }
                            anchorInfo2.b = iB;
                        } else {
                            int position5 = getPosition(viewFindReferenceChild);
                            z3 = anchorInfo2.d;
                            orientationHelper = anchorInfo2.a;
                            if (z3) {
                                anchorInfo2.c = anchorInfo2.a.o() + orientationHelper.d(viewFindReferenceChild);
                            } else {
                                anchorInfo2.c = orientationHelper.g(viewFindReferenceChild);
                            }
                            anchorInfo2.b = position5;
                            if (!state.g) {
                                iG = this.mOrientationHelper.g(viewFindReferenceChild);
                                iD = this.mOrientationHelper.d(viewFindReferenceChild);
                                iM = this.mOrientationHelper.m();
                                i = this.mOrientationHelper.i();
                                if (iD <= iM) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iG >= i) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (anchorInfo2.d) {
                                        iM = i;
                                    }
                                    anchorInfo2.c = iM;
                                } else {
                                    if (anchorInfo2.d) {
                                        iM = i;
                                    }
                                    anchorInfo2.c = iM;
                                }
                            }
                        }
                    }
                } else {
                    anchorInfo2.a();
                    if (this.mStackFromEnd) {
                        iB = state.b() - 1;
                    } else {
                        iB = 0;
                    }
                    anchorInfo2.b = iB;
                }
            } else {
                int i11 = this.mPendingScrollPosition;
                anchorInfo2.b = i11;
                SavedState savedState2 = this.mPendingSavedState;
                if (savedState2 != null && savedState2.a >= 0) {
                    boolean z7 = savedState2.c;
                    anchorInfo2.d = z7;
                    OrientationHelper orientationHelper2 = this.mOrientationHelper;
                    if (z7) {
                        anchorInfo2.c = orientationHelper2.i() - this.mPendingSavedState.b;
                    } else {
                        anchorInfo2.c = orientationHelper2.m() + this.mPendingSavedState.b;
                    }
                } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View viewFindViewByPosition2 = findViewByPosition(i11);
                    if (viewFindViewByPosition2 == null) {
                        if (getChildCount() > 0) {
                            anchorInfo2.d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                        }
                        anchorInfo2.a();
                    } else if (this.mOrientationHelper.e(viewFindViewByPosition2) > this.mOrientationHelper.n()) {
                        anchorInfo2.a();
                    } else {
                        int iG3 = this.mOrientationHelper.g(viewFindViewByPosition2) - this.mOrientationHelper.m();
                        OrientationHelper orientationHelper3 = this.mOrientationHelper;
                        if (iG3 < 0) {
                            anchorInfo2.c = orientationHelper3.m();
                            anchorInfo2.d = false;
                        } else if (orientationHelper3.i() - this.mOrientationHelper.d(viewFindViewByPosition2) < 0) {
                            anchorInfo2.c = this.mOrientationHelper.i();
                            anchorInfo2.d = true;
                        } else {
                            boolean z8 = anchorInfo2.d;
                            OrientationHelper orientationHelper4 = this.mOrientationHelper;
                            anchorInfo2.c = z8 ? this.mOrientationHelper.o() + orientationHelper4.d(viewFindViewByPosition2) : orientationHelper4.g(viewFindViewByPosition2);
                        }
                    }
                } else {
                    boolean z9 = this.mShouldReverseLayout;
                    anchorInfo2.d = z9;
                    OrientationHelper orientationHelper5 = this.mOrientationHelper;
                    if (z9) {
                        anchorInfo2.c = orientationHelper5.i() - this.mPendingScrollPositionOffset;
                    } else {
                        anchorInfo2.c = orientationHelper5.m() + this.mPendingScrollPositionOffset;
                    }
                }
            }
            this.mAnchorInfo.e = true;
        } else if (focusedChild2 != null && (this.mOrientationHelper.g(focusedChild2) >= this.mOrientationHelper.i() || this.mOrientationHelper.d(focusedChild2) <= this.mOrientationHelper.m())) {
            this.mAnchorInfo.b(getPosition(focusedChild2), focusedChild2);
        }
        LayoutState layoutState = this.mLayoutState;
        layoutState.f = layoutState.j >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int iM2 = this.mOrientationHelper.m() + Math.max(0, this.mReusableIntPair[0]);
        int iJ = this.mOrientationHelper.j() + Math.max(0, this.mReusableIntPair[1]);
        if (state.g && (i7 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i7)) != null) {
            boolean z10 = this.mShouldReverseLayout;
            OrientationHelper orientationHelper6 = this.mOrientationHelper;
            if (z10) {
                i8 = orientationHelper6.i() - this.mOrientationHelper.d(viewFindViewByPosition);
                iG2 = this.mPendingScrollPositionOffset;
            } else {
                iG2 = orientationHelper6.g(viewFindViewByPosition) - this.mOrientationHelper.m();
                i8 = this.mPendingScrollPositionOffset;
            }
            int i12 = i8 - iG2;
            if (i12 > 0) {
                iM2 += i12;
            } else {
                iJ -= i12;
            }
        }
        AnchorInfo anchorInfo3 = this.mAnchorInfo;
        boolean z11 = anchorInfo3.d;
        boolean z12 = this.mShouldReverseLayout;
        if (!z11 ? !z12 : z12) {
            i10 = 1;
        }
        onAnchorReady(recycler, state, anchorInfo3, i10);
        detachAndScrapAttachedViews(recycler);
        this.mLayoutState.l = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.i = 0;
        AnchorInfo anchorInfo4 = this.mAnchorInfo;
        boolean z13 = anchorInfo4.d;
        int i13 = anchorInfo4.b;
        if (z13) {
            A(i13, anchorInfo4.c);
            LayoutState layoutState2 = this.mLayoutState;
            layoutState2.h = iM2;
            fill(recycler, layoutState2, state, false);
            LayoutState layoutState3 = this.mLayoutState;
            i4 = layoutState3.b;
            int i14 = layoutState3.d;
            int i15 = layoutState3.c;
            if (i15 > 0) {
                iJ += i15;
            }
            AnchorInfo anchorInfo5 = this.mAnchorInfo;
            z(anchorInfo5.b, anchorInfo5.c);
            LayoutState layoutState4 = this.mLayoutState;
            layoutState4.h = iJ;
            layoutState4.d += layoutState4.e;
            fill(recycler, layoutState4, state, false);
            LayoutState layoutState5 = this.mLayoutState;
            i3 = layoutState5.b;
            int i16 = layoutState5.c;
            if (i16 > 0) {
                A(i14, i4);
                LayoutState layoutState6 = this.mLayoutState;
                layoutState6.h = i16;
                fill(recycler, layoutState6, state, false);
                i4 = this.mLayoutState.b;
            }
        } else {
            z(i13, anchorInfo4.c);
            LayoutState layoutState7 = this.mLayoutState;
            layoutState7.h = iJ;
            fill(recycler, layoutState7, state, false);
            LayoutState layoutState8 = this.mLayoutState;
            i3 = layoutState8.b;
            int i17 = layoutState8.d;
            int i18 = layoutState8.c;
            if (i18 > 0) {
                iM2 += i18;
            }
            AnchorInfo anchorInfo6 = this.mAnchorInfo;
            A(anchorInfo6.b, anchorInfo6.c);
            LayoutState layoutState9 = this.mLayoutState;
            layoutState9.h = iM2;
            layoutState9.d += layoutState9.e;
            fill(recycler, layoutState9, state, false);
            LayoutState layoutState10 = this.mLayoutState;
            int i19 = layoutState10.b;
            int i20 = layoutState10.c;
            if (i20 > 0) {
                z(i17, i3);
                LayoutState layoutState11 = this.mLayoutState;
                layoutState11.h = i20;
                fill(recycler, layoutState11, state, false);
                i3 = this.mLayoutState.b;
            }
            i4 = i19;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iQ2 = q(i3, recycler, state, true);
                i5 = i4 + iQ2;
                i6 = i3 + iQ2;
                iQ = r(i5, recycler, state, false);
            } else {
                int iR = r(i4, recycler, state, true);
                i5 = i4 + iR;
                i6 = i3 + iR;
                iQ = q(i6, recycler, state, false);
            }
            i4 = i5 + iQ;
            i3 = i6 + iQ;
        }
        if (state.k && getChildCount() != 0 && !state.g && supportsPredictiveItemAnimations()) {
            List list = recycler.d;
            int size = list.size();
            int position6 = getPosition(getChildAt(0));
            int i21 = 0;
            int iE = 0;
            int iE2 = 0;
            while (i21 < size) {
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) list.get(i21);
                if (!viewHolder.isRemoved()) {
                    boolean z14 = viewHolder.getLayoutPosition() < position6 ? z6 : false;
                    boolean z15 = this.mShouldReverseLayout;
                    OrientationHelper orientationHelper7 = this.mOrientationHelper;
                    View view = viewHolder.itemView;
                    if (z14 != z15) {
                        iE += orientationHelper7.e(view);
                    } else {
                        iE2 += orientationHelper7.e(view);
                    }
                }
                i21++;
                z6 = true;
            }
            this.mLayoutState.k = list;
            if (iE > 0) {
                A(getPosition(t()), i4);
                LayoutState layoutState12 = this.mLayoutState;
                layoutState12.h = iE;
                layoutState12.c = 0;
                layoutState12.a(null);
                fill(recycler, this.mLayoutState, state, false);
            }
            if (iE2 > 0) {
                z(getPosition(s()), i3);
                LayoutState layoutState13 = this.mLayoutState;
                layoutState13.h = iE2;
                layoutState13.c = 0;
                layoutState13.a(null);
                fill(recycler, this.mLayoutState, state, false);
            }
            this.mLayoutState.k = null;
        }
        if (state.g) {
            this.mAnchorInfo.c();
        } else {
            OrientationHelper orientationHelper8 = this.mOrientationHelper;
            orientationHelper8.b = orientationHelper8.n();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.a = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.a = savedState.a;
            savedState2.b = savedState.b;
            savedState2.c = savedState.c;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (getChildCount() <= 0) {
            savedState3.a = -1;
            return savedState3;
        }
        ensureLayoutState();
        boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        savedState3.c = z;
        if (z) {
            View viewS = s();
            savedState3.b = this.mOrientationHelper.i() - this.mOrientationHelper.d(viewS);
            savedState3.a = getPosition(viewS);
            return savedState3;
        }
        View viewT = t();
        savedState3.a = getPosition(viewT);
        savedState3.b = this.mOrientationHelper.g(viewT) - this.mOrientationHelper.m();
        return savedState3;
    }

    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        x();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b = position < position2 ? (byte) 1 : (byte) -1;
        boolean z = this.mShouldReverseLayout;
        OrientationHelper orientationHelper = this.mOrientationHelper;
        if (z) {
            if (b == 1) {
                scrollToPositionWithOffset(position2, orientationHelper.i() - (this.mOrientationHelper.e(view) + this.mOrientationHelper.g(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, orientationHelper.i() - this.mOrientationHelper.d(view2));
                return;
            }
        }
        if (b == -1) {
            scrollToPositionWithOffset(position2, orientationHelper.g(view2));
        } else {
            scrollToPositionWithOffset(position2, orientationHelper.d(view2) - this.mOrientationHelper.e(view));
        }
    }

    public final int q(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int i2;
        int i3 = this.mOrientationHelper.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -scrollBy(-i3, recycler, state);
        int i5 = i + i4;
        if (!z || (i2 = this.mOrientationHelper.i() - i5) <= 0) {
            return i4;
        }
        this.mOrientationHelper.r(i2);
        return i2 + i4;
    }

    public final int r(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int iM;
        int iM2 = i - this.mOrientationHelper.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(iM2, recycler, state);
        int i3 = i + i2;
        if (!z || (iM = i3 - this.mOrientationHelper.m()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.r(-iM);
        return i2 - iM;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.k() == 0 && this.mOrientationHelper.h() == 0;
    }

    public final View s() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.a = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.a = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, recycler, state);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            d.r(pv1.k(i, "invalid orientation:"));
            return;
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            OrientationHelper orientationHelperB = OrientationHelper.b(this, i);
            this.mOrientationHelper = orientationHelperB;
            this.mAnchorInfo.a = orientationHelperB;
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public final View t() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    public final void u() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.g(childAt));
        }
        Log.d(TAG, "==============");
    }

    public final void v(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (!layoutState.a || layoutState.l) {
            return;
        }
        int i = layoutState.g;
        int i2 = layoutState.i;
        if (layoutState.f == -1) {
            int childCount = getChildCount();
            if (i < 0) {
                return;
            }
            int iH = (this.mOrientationHelper.h() - i) + i2;
            if (this.mShouldReverseLayout) {
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (this.mOrientationHelper.g(childAt) < iH || this.mOrientationHelper.q(childAt) < iH) {
                        w(recycler, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = childCount - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View childAt2 = getChildAt(i5);
                if (this.mOrientationHelper.g(childAt2) < iH || this.mOrientationHelper.q(childAt2) < iH) {
                    w(recycler, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int childCount2 = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt3 = getChildAt(i7);
                if (this.mOrientationHelper.d(childAt3) > i6 || this.mOrientationHelper.p(childAt3) > i6) {
                    w(recycler, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = childCount2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View childAt4 = getChildAt(i9);
            if (this.mOrientationHelper.d(childAt4) > i6 || this.mOrientationHelper.p(childAt4) > i6) {
                w(recycler, i8, i9);
                return;
            }
        }
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iG = this.mOrientationHelper.g(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int iG2 = this.mOrientationHelper.g(childAt);
                if (position2 < position) {
                    u();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    sb.append(iG2 < iG);
                    throw new RuntimeException(sb.toString());
                }
                if (iG2 > iG) {
                    u();
                    y.j("detected invalid location");
                    return;
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int iG3 = this.mOrientationHelper.g(childAt2);
            if (position3 < position) {
                u();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                sb2.append(iG3 < iG);
                throw new RuntimeException(sb2.toString());
            }
            if (iG3 < iG) {
                u();
                y.j("detected invalid location");
                return;
            }
        }
    }

    public final void w(RecyclerView.Recycler recycler, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, recycler);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                removeAndRecycleViewAt(i3, recycler);
            }
        }
    }

    public final void x() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public final void y(int i, int i2, boolean z, RecyclerView.State state) {
        int iM;
        this.mLayoutState.l = resolveIsInfinite();
        this.mLayoutState.f = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z2 = i == 1;
        LayoutState layoutState = this.mLayoutState;
        int i3 = z2 ? iMax2 : iMax;
        layoutState.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        layoutState.i = iMax;
        if (z2) {
            layoutState.h = this.mOrientationHelper.j() + i3;
            View viewS = s();
            LayoutState layoutState2 = this.mLayoutState;
            layoutState2.e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(viewS);
            LayoutState layoutState3 = this.mLayoutState;
            layoutState2.d = position + layoutState3.e;
            layoutState3.b = this.mOrientationHelper.d(viewS);
            iM = this.mOrientationHelper.d(viewS) - this.mOrientationHelper.i();
        } else {
            View viewT = t();
            LayoutState layoutState4 = this.mLayoutState;
            layoutState4.h = this.mOrientationHelper.m() + layoutState4.h;
            LayoutState layoutState5 = this.mLayoutState;
            layoutState5.e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(viewT);
            LayoutState layoutState6 = this.mLayoutState;
            layoutState5.d = position2 + layoutState6.e;
            layoutState6.b = this.mOrientationHelper.g(viewT);
            iM = (-this.mOrientationHelper.g(viewT)) + this.mOrientationHelper.m();
        }
        LayoutState layoutState7 = this.mLayoutState;
        layoutState7.c = i2;
        if (z) {
            layoutState7.c = i2 - iM;
        }
        layoutState7.g = iM;
    }

    public final void z(int i, int i2) {
        this.mLayoutState.c = this.mOrientationHelper.i() - i2;
        LayoutState layoutState = this.mLayoutState;
        layoutState.e = this.mShouldReverseLayout ? -1 : 1;
        layoutState.d = i;
        layoutState.f = 1;
        layoutState.b = i2;
        layoutState.g = Integer.MIN_VALUE;
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.a);
        setReverseLayout(properties.c);
        setStackFromEnd(properties.d);
    }

    public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(state);
        if (this.mLayoutState.f == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return n(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return o(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return p(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        if (z != this.mShouldReverseLayout) {
            i2 = -1;
        }
        if (this.mOrientation == 0) {
            return new PointF(i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return n(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return o(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return p(state);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 > i || i2 < i) {
            if (this.mOrientationHelper.g(getChildAt(i)) < this.mOrientationHelper.m()) {
                i3 = 16644;
                i4 = 16388;
            } else {
                i3 = 4161;
                i4 = 4097;
            }
            if (this.mOrientation == 0) {
                return this.mHorizontalBoundCheck.a(i, i2, i3, i4);
            }
            return this.mVerticalBoundCheck.a(i, i2, i3, i4);
        }
        return getChildAt(i);
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        int i3;
        ensureLayoutState();
        int i4 = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.a(i, i2, i3, i4);
        }
        return this.mVerticalBoundCheck.a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    public boolean isLayoutRTL() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutState, LayoutChunkResult layoutChunkResult) {
        boolean z;
        int iF;
        int i;
        int paddingLeft;
        int i2;
        int iF2;
        boolean z2;
        View viewB = layoutState.b(recycler);
        if (viewB == null) {
            layoutChunkResult.b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewB.getLayoutParams();
        List list = layoutState.k;
        boolean z3 = this.mShouldReverseLayout;
        int i3 = layoutState.f;
        if (list == null) {
            if (i3 == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                addView(viewB);
            } else {
                addView(viewB, 0);
            }
        } else {
            if (i3 == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                addDisappearingView(viewB);
            } else {
                addDisappearingView(viewB, 0);
            }
        }
        measureChildWithMargins(viewB, 0, 0);
        layoutChunkResult.a = this.mOrientationHelper.e(viewB);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iF2 = getWidth() - getPaddingRight();
                paddingLeft = iF2 - this.mOrientationHelper.f(viewB);
            } else {
                paddingLeft = getPaddingLeft();
                iF2 = this.mOrientationHelper.f(viewB) + paddingLeft;
            }
            int i4 = layoutState.f;
            int i5 = layoutState.b;
            int i6 = layoutChunkResult.a;
            if (i4 == -1) {
                i2 = i5 - i6;
                iF = i5;
            } else {
                iF = i6 + i5;
                i2 = i5;
            }
            i = iF2;
        } else {
            int paddingTop = getPaddingTop();
            iF = this.mOrientationHelper.f(viewB) + paddingTop;
            int i7 = layoutState.f;
            int i8 = layoutState.b;
            int i9 = layoutChunkResult.a;
            if (i7 == -1) {
                i = i8;
                paddingLeft = i8 - i9;
            } else {
                i = i8 + i9;
                paddingLeft = i8;
            }
            i2 = paddingTop;
        }
        layoutDecoratedWithMargins(viewB, paddingLeft, i2, i, iF);
        if (layoutParams.a.isRemoved() || layoutParams.a.isUpdated()) {
            layoutChunkResult.c = true;
        }
        layoutChunkResult.d = viewB.hasFocusable();
    }

    public final int n(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.a(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public final int o(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.b(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        onDetachedFromWindow(recyclerView);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(recycler);
            recycler.a.clear();
            recycler.g();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int iConvertFocusDirectionToLayoutDirection;
        View viewFindOnePartiallyOrCompletelyInvisibleChild;
        View viewS;
        x();
        if (getChildCount() != 0 && (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) != Integer.MIN_VALUE) {
            ensureLayoutState();
            y(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.n() * MAX_SCROLL_FACTOR), false, state);
            LayoutState layoutState = this.mLayoutState;
            layoutState.g = Integer.MIN_VALUE;
            layoutState.a = false;
            fill(recycler, layoutState, state, true);
            boolean z = this.mShouldReverseLayout;
            if (iConvertFocusDirectionToLayoutDirection == -1) {
                if (z) {
                    viewFindOnePartiallyOrCompletelyInvisibleChild = findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
                } else {
                    viewFindOnePartiallyOrCompletelyInvisibleChild = findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
                }
            } else if (z) {
                viewFindOnePartiallyOrCompletelyInvisibleChild = findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
            } else {
                viewFindOnePartiallyOrCompletelyInvisibleChild = findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
            }
            if (iConvertFocusDirectionToLayoutDirection == -1) {
                viewS = t();
            } else {
                viewS = s();
            }
            if (viewS.hasFocusable()) {
                if (viewFindOnePartiallyOrCompletelyInvisibleChild != null) {
                    return viewS;
                }
            } else {
                return viewFindOnePartiallyOrCompletelyInvisibleChild;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    public final int p(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.c(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.a = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int iAbs = Math.abs(i);
        y(i2, iAbs, true, state);
        LayoutState layoutState = this.mLayoutState;
        int iFill = fill(recycler, layoutState, state, false) + layoutState.g;
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i = i2 * iFill;
        }
        this.mOrientationHelper.r(-i);
        this.mLayoutState.j = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean shouldMeasureTwice() {
        if (getHeightMode() != 1073741824 && getWidthMode() != 1073741824 && hasFlexibleChildInBothOrientations()) {
            return true;
        }
        return false;
    }

    public LinearLayoutManager(int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    public LinearLayoutManager() {
        this(1, false);
    }
}
