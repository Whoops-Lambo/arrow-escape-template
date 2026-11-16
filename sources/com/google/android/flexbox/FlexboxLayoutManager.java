package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;
import defpackage.to0;
import defpackage.uo0;
import defpackage.wo0;
import defpackage.xo0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements to0, RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final Rect y = new Rect();
    public int a;
    public final int b;
    public final int c;
    public boolean e;
    public boolean f;
    public RecyclerView.Recycler i;
    public RecyclerView.State j;
    public xo0 k;
    public final wo0 l;
    public OrientationHelper m;
    public OrientationHelper n;
    public SavedState o;
    public int p;
    public int q;
    public int r;
    public int s;
    public final SparseArray t;
    public final Context u;
    public View v;
    public int w;
    public final uo0 x;
    public final int d = -1;
    public List g = new ArrayList();
    public final b h = new b(this);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new d();
        public float f;
        public float g;
        public int h;
        public float i;
        public int j;
        public int k;
        public int l;
        public int m;
        public boolean n;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float L() {
            return this.g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void T(int i) {
            this.k = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float U() {
            return this.f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float X() {
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean Y() {
            return this.n;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int b0() {
            return this.l;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMinHeight() {
            return this.k;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMinWidth() {
            return this.j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int k() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int n0() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int r() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int s0() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void setMinWidth(int i) {
            this.j = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int t() {
            return this.h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int u0() {
            return this.m;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f);
            parcel.writeFloat(this.g);
            parcel.writeInt(this.h);
            parcel.writeFloat(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
            parcel.writeInt(this.m);
            parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new e();
        public int a;
        public int b;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
            sb.append(this.a);
            sb.append(", mAnchorOffset=");
            return h50.l(sb, this.b, '}');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }
    }

    @Override // defpackage.to0
    public final int getAlignContent() {
        return 5;
    }

    @Override // defpackage.to0
    public final void h(a aVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        this.o = null;
        this.p = -1;
        this.q = Integer.MIN_VALUE;
        this.w = -1;
        wo0.b(this.l);
        this.t.clear();
    }

    public final View s(int i) {
        View viewX = x(0, getChildCount(), i);
        if (viewX == null) {
            return null;
        }
        int i2 = this.h.c[getPosition(viewX)];
        if (i2 == -1) {
            return null;
        }
        return t(viewX, (a) this.g.get(i2));
    }

    public final View w(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View childAt = getChildAt(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int decoratedLeft = getDecoratedLeft(childAt) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).leftMargin;
            int decoratedTop = getDecoratedTop(childAt) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).topMargin;
            int decoratedRight = getDecoratedRight(childAt) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            int decoratedBottom = getDecoratedBottom(childAt) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            boolean z = decoratedLeft >= width || decoratedRight >= paddingLeft;
            boolean z2 = decoratedTop >= height || decoratedBottom >= paddingTop;
            if (z && z2) {
                return childAt;
            }
            i += i3;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01ef  */
    public final int A(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i2;
        if (getChildCount() != 0 && i != 0) {
            q();
            this.k.i = true;
            boolean z = !j() && this.e;
            int i3 = (!z ? i > 0 : i < 0) ? -1 : 1;
            int iAbs = Math.abs(i);
            this.k.h = i3;
            boolean zJ = j();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
            boolean z2 = !zJ && this.e;
            b bVar = this.h;
            if (i3 == 1) {
                View childAt = getChildAt(getChildCount() - 1);
                if (childAt != null) {
                    this.k.e = this.m.d(childAt);
                    int position = getPosition(childAt);
                    View viewV = v(childAt, (a) this.g.get(bVar.c[position]));
                    xo0 xo0Var = this.k;
                    xo0Var.getClass();
                    int i4 = position + 1;
                    xo0Var.d = i4;
                    int[] iArr = bVar.c;
                    if (iArr.length <= i4) {
                        xo0Var.c = -1;
                    } else {
                        xo0Var.c = iArr[i4];
                    }
                    OrientationHelper orientationHelper = this.m;
                    if (z2) {
                        xo0Var.e = orientationHelper.g(viewV);
                        this.k.f = this.m.m() + (-this.m.g(viewV));
                        xo0 xo0Var2 = this.k;
                        xo0Var2.f = Math.max(xo0Var2.f, 0);
                    } else {
                        xo0Var.e = orientationHelper.d(viewV);
                        this.k.f = this.m.d(viewV) - this.m.i();
                    }
                    int i5 = this.k.c;
                    if ((i5 == -1 || i5 > this.g.size() - 1) && this.k.d <= this.j.b()) {
                        xo0 xo0Var3 = this.k;
                        int i6 = iAbs - xo0Var3.f;
                        uo0 uo0Var = this.x;
                        uo0Var.c = null;
                        uo0Var.b = 0;
                        if (i6 > 0) {
                            b bVar2 = this.h;
                            if (zJ) {
                                bVar2.b(uo0Var, iMakeMeasureSpec, iMakeMeasureSpec2, i6, xo0Var3.d, -1, this.g);
                            } else {
                                bVar2.b(uo0Var, iMakeMeasureSpec2, iMakeMeasureSpec, i6, xo0Var3.d, -1, this.g);
                                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                                iMakeMeasureSpec = iMakeMeasureSpec;
                            }
                            bVar.h(iMakeMeasureSpec, iMakeMeasureSpec2, this.k.d);
                            bVar.u(this.k.d);
                        }
                    }
                    xo0 xo0Var4 = this.k;
                    xo0Var4.a = iAbs - xo0Var4.f;
                }
            } else {
                View childAt2 = getChildAt(0);
                if (childAt2 != null) {
                    this.k.e = this.m.g(childAt2);
                    int position2 = getPosition(childAt2);
                    View viewT = t(childAt2, (a) this.g.get(bVar.c[position2]));
                    xo0 xo0Var5 = this.k;
                    xo0Var5.getClass();
                    int i7 = bVar.c[position2];
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    if (i7 > 0) {
                        this.k.d = position2 - ((a) this.g.get(i7 - 1)).h;
                    } else {
                        xo0Var5.d = -1;
                    }
                    xo0 xo0Var6 = this.k;
                    xo0Var6.c = i7 > 0 ? i7 - 1 : 0;
                    OrientationHelper orientationHelper2 = this.m;
                    if (z2) {
                        xo0Var6.e = orientationHelper2.d(viewT);
                        this.k.f = this.m.d(viewT) - this.m.i();
                        xo0 xo0Var7 = this.k;
                        xo0Var7.f = Math.max(xo0Var7.f, 0);
                    } else {
                        xo0Var6.e = orientationHelper2.g(viewT);
                        this.k.f = this.m.m() + (-this.m.g(viewT));
                    }
                    xo0 xo0Var8 = this.k;
                    xo0Var8.a = iAbs - xo0Var8.f;
                }
            }
            xo0 xo0Var9 = this.k;
            int iR = r(recycler, state, xo0Var9) + xo0Var9.f;
            if (iR >= 0) {
                if (z) {
                    if (iAbs > iR) {
                        i2 = (-i3) * iR;
                    } else {
                        i2 = i;
                    }
                } else if (iAbs > iR) {
                    i2 = i3 * iR;
                } else {
                    i2 = i;
                }
                this.m.r(-i2);
                this.k.g = i2;
                return i2;
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:76:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0104 A[EDGE_INSN: B:86:0x0104->B:93:? BREAK  A[LOOP:2: B:52:0x00b3->B:71:0x0100], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0100 A[SYNTHETIC] */
    public final void C(RecyclerView.Recycler recycler, xo0 xo0Var) {
        int childCount;
        int i;
        int childCount2;
        int i2;
        View childAt;
        int i3;
        if (xo0Var.i) {
            int i4 = xo0Var.h;
            int i5 = xo0Var.f;
            b bVar = this.h;
            int i6 = -1;
            if (i4 == -1) {
                if (i5 < 0 || (childCount2 = getChildCount()) == 0 || (childAt = getChildAt((i2 = childCount2 - 1))) == null || (i3 = bVar.c[getPosition(childAt)]) == -1) {
                    return;
                }
                a aVar = (a) this.g.get(i3);
                for (int i7 = i2; i7 >= 0; i7--) {
                    View childAt2 = getChildAt(i7);
                    if (childAt2 != null) {
                        int i8 = xo0Var.f;
                        if (!j() && this.e) {
                            if (this.m.d(childAt2) > i8) {
                                break;
                            }
                            if (aVar.o != getPosition(childAt2)) {
                                continue;
                            } else if (i3 <= 0) {
                                childCount2 = i7;
                                break;
                            } else {
                                i3 += xo0Var.h;
                                aVar = (a) this.g.get(i3);
                                childCount2 = i7;
                            }
                        } else {
                            if (this.m.g(childAt2) < this.m.h() - i8) {
                                break;
                            }
                            if (aVar.o != getPosition(childAt2)) {
                                continue;
                            } else if (i3 <= 0) {
                                childCount2 = i7;
                                break;
                            } else {
                                i3 += xo0Var.h;
                                aVar = (a) this.g.get(i3);
                                childCount2 = i7;
                            }
                        }
                    }
                }
                while (i2 >= childCount2) {
                    removeAndRecycleViewAt(i2, recycler);
                    i2--;
                }
                return;
            }
            if (i5 >= 0 && (childCount = getChildCount()) != 0) {
                int i9 = 0;
                View childAt3 = getChildAt(0);
                if (childAt3 == null || (i = bVar.c[getPosition(childAt3)]) == -1) {
                    return;
                }
                a aVar2 = (a) this.g.get(i);
                while (true) {
                    if (i9 < childCount) {
                        View childAt4 = getChildAt(i9);
                        if (childAt4 != null) {
                            int i10 = xo0Var.f;
                            if (j() || !this.e) {
                                if (this.m.d(childAt4) <= i10) {
                                    if (aVar2.p != getPosition(childAt4)) {
                                        continue;
                                    } else {
                                        if (i >= this.g.size() - 1) {
                                            break;
                                        }
                                        i += xo0Var.h;
                                        aVar2 = (a) this.g.get(i);
                                        i6 = i9;
                                    }
                                }
                            } else if (this.m.h() - this.m.g(childAt4) <= i10) {
                                if (aVar2.p != getPosition(childAt4)) {
                                    continue;
                                } else if (i >= this.g.size() - 1) {
                                    break;
                                    break;
                                } else {
                                    i += xo0Var.h;
                                    aVar2 = (a) this.g.get(i);
                                    i6 = i9;
                                }
                            }
                        }
                        i9++;
                    }
                    i9 = i6;
                    break;
                }
                while (i9 >= 0) {
                    removeAndRecycleViewAt(i9, recycler);
                    i9--;
                }
            }
        }
    }

    public final void E(int i) {
        if (this.a != i) {
            removeAllViews();
            this.a = i;
            this.m = null;
            this.n = null;
            this.g.clear();
            wo0 wo0Var = this.l;
            wo0.b(wo0Var);
            wo0Var.d = 0;
            requestLayout();
        }
    }

    public final void H(wo0 wo0Var, boolean z, boolean z2) {
        int i;
        if (z2) {
            D();
        } else {
            this.k.b = false;
        }
        if (j() || !this.e) {
            this.k.a = this.m.i() - wo0Var.c;
        } else {
            this.k.a = wo0Var.c - getPaddingRight();
        }
        xo0 xo0Var = this.k;
        xo0Var.d = wo0Var.a;
        xo0Var.h = 1;
        xo0Var.e = wo0Var.c;
        xo0Var.f = Integer.MIN_VALUE;
        xo0Var.c = wo0Var.b;
        if (!z || this.g.size() <= 1 || (i = wo0Var.b) < 0 || i >= this.g.size() - 1) {
            return;
        }
        a aVar = (a) this.g.get(wo0Var.b);
        xo0 xo0Var2 = this.k;
        xo0Var2.c++;
        xo0Var2.d += aVar.h;
    }

    public final void I(wo0 wo0Var, boolean z, boolean z2) {
        if (z2) {
            D();
        } else {
            this.k.b = false;
        }
        if (j() || !this.e) {
            this.k.a = wo0Var.c - this.m.m();
        } else {
            this.k.a = (this.v.getWidth() - wo0Var.c) - this.m.m();
        }
        xo0 xo0Var = this.k;
        xo0Var.d = wo0Var.a;
        xo0Var.h = -1;
        xo0Var.e = wo0Var.c;
        xo0Var.f = Integer.MIN_VALUE;
        int i = wo0Var.b;
        xo0Var.c = i;
        if (!z || i <= 0) {
            return;
        }
        int size = this.g.size();
        int i2 = wo0Var.b;
        if (size > i2) {
            a aVar = (a) this.g.get(i2);
            xo0 xo0Var2 = this.k;
            xo0Var2.c--;
            xo0Var2.d -= aVar.h;
        }
    }

    @Override // defpackage.to0
    public final void a(View view, int i, int i2, a aVar) {
        calculateItemDecorationsForChild(view, y);
        if (j()) {
            int rightDecorationWidth = getRightDecorationWidth(view) + getLeftDecorationWidth(view);
            aVar.e += rightDecorationWidth;
            aVar.f += rightDecorationWidth;
            return;
        }
        int bottomDecorationHeight = getBottomDecorationHeight(view) + getTopDecorationHeight(view);
        aVar.e += bottomDecorationHeight;
        aVar.f += bottomDecorationHeight;
    }

    @Override // defpackage.to0
    public final View b(int i) {
        View view = (View) this.t.get(i);
        return view != null ? view : this.i.l(i, Long.MAX_VALUE).itemView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        if (this.b == 0) {
            return j();
        }
        if (!j()) {
            return true;
        }
        int width = getWidth();
        View view = this.v;
        return width > (view != null ? view.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        if (this.b == 0) {
            return !j();
        }
        if (!j()) {
            int height = getHeight();
            View view = this.v;
            if (height <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        layoutParams.g = 1.0f;
        layoutParams.h = -1;
        layoutParams.i = -1.0f;
        layoutParams.l = 16777215;
        layoutParams.m = 16777215;
        return layoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        layoutParams.g = 1.0f;
        layoutParams.h = -1;
        layoutParams.i = -1.0f;
        layoutParams.l = 16777215;
        layoutParams.m = 16777215;
        return layoutParams;
    }

    @Override // defpackage.to0
    public final int getAlignItems() {
        return this.c;
    }

    @Override // defpackage.to0
    public final int getFlexDirection() {
        return this.a;
    }

    @Override // defpackage.to0
    public final int getFlexItemCount() {
        return this.j.b();
    }

    @Override // defpackage.to0
    public final List getFlexLinesInternal() {
        return this.g;
    }

    @Override // defpackage.to0
    public final int getFlexWrap() {
        return this.b;
    }

    @Override // defpackage.to0
    public final int getLargestMainSize() {
        if (this.g.size() == 0) {
            return 0;
        }
        int size = this.g.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((a) this.g.get(i)).e);
        }
        return iMax;
    }

    @Override // defpackage.to0
    public final int getMaxLine() {
        return this.d;
    }

    @Override // defpackage.to0
    public final int getSumOfCrossSize() {
        int size = this.g.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((a) this.g.get(i2)).g;
        }
        return i;
    }

    @Override // defpackage.to0
    public final void i(int i, View view) {
        this.t.put(i, view);
    }

    @Override // defpackage.to0
    public final boolean j() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0171  */
    /* JADX WARN: Code duplicated, block: B:106:0x0188  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:118:0x01be  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:135:0x0209  */
    /* JADX WARN: Code duplicated, block: B:139:0x020f  */
    /* JADX WARN: Code duplicated, block: B:142:0x021c  */
    /* JADX WARN: Code duplicated, block: B:143:0x0229  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x0100  */
    /* JADX WARN: Code duplicated, block: B:80:0x0105  */
    /* JADX WARN: Code duplicated, block: B:82:0x0116  */
    /* JADX WARN: Code duplicated, block: B:83:0x0120  */
    /* JADX WARN: Code duplicated, block: B:85:0x012d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0139  */
    /* JADX WARN: Code duplicated, block: B:88:0x013f  */
    /* JADX WARN: Code duplicated, block: B:89:0x014b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0153  */
    /* JADX WARN: Code duplicated, block: B:97:0x0167  */
    /* JADX WARN: Code duplicated, block: B:98:0x0169  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        View viewS;
        FlexboxLayoutManager flexboxLayoutManager;
        OrientationHelper orientationHelper;
        int position;
        int i;
        int size;
        int i2;
        int i3;
        View viewFindViewByPosition;
        View childAt;
        boolean z;
        int iG;
        OrientationHelper orientationHelper2;
        boolean z2;
        OrientationHelper orientationHelper3;
        int iG2;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        this.i = recycler;
        this.j = state;
        int iB = state.b();
        if (iB == 0 && state.g) {
            return;
        }
        int layoutDirection = getLayoutDirection();
        int i8 = this.a;
        int i9 = this.b;
        if (i8 == 0) {
            this.e = layoutDirection == 1;
            this.f = i9 == 2;
        } else if (i8 == 1) {
            this.e = layoutDirection != 1;
            this.f = i9 == 2;
        } else if (i8 == 2) {
            boolean z5 = layoutDirection == 1;
            this.e = z5;
            if (i9 == 2) {
                this.e = !z5;
            }
            this.f = false;
        } else if (i8 != 3) {
            this.e = false;
            this.f = false;
        } else {
            boolean z6 = layoutDirection == 1;
            this.e = z6;
            if (i9 == 2) {
                this.e = !z6;
            }
            this.f = true;
        }
        q();
        if (this.k == null) {
            xo0 xo0Var = new xo0();
            xo0Var.h = 1;
            this.k = xo0Var;
        }
        b bVar = this.h;
        bVar.j(iB);
        bVar.k(iB);
        bVar.i(iB);
        this.k.i = false;
        SavedState savedState = this.o;
        if (savedState != null && (i7 = savedState.a) >= 0 && i7 < iB) {
            this.p = i7;
        }
        wo0 wo0Var = this.l;
        if (!wo0Var.f || this.p != -1 || savedState != null) {
            wo0.b(wo0Var);
            SavedState savedState2 = this.o;
            if (state.g || (i3 = this.p) == -1) {
                if (getChildCount() != 0) {
                    if (wo0Var.e) {
                        viewS = u(state.b());
                    } else {
                        viewS = s(state.b());
                    }
                    if (viewS != null) {
                        flexboxLayoutManager = wo0Var.h;
                        if (flexboxLayoutManager.b == 0) {
                            orientationHelper = flexboxLayoutManager.n;
                        } else {
                            orientationHelper = flexboxLayoutManager.m;
                        }
                        if (flexboxLayoutManager.j() && flexboxLayoutManager.e) {
                            if (wo0Var.e) {
                                wo0Var.c = orientationHelper.o() + orientationHelper.g(viewS);
                            } else {
                                wo0Var.c = orientationHelper.d(viewS);
                            }
                        } else if (wo0Var.e) {
                            wo0Var.c = orientationHelper.o() + orientationHelper.d(viewS);
                        } else {
                            wo0Var.c = orientationHelper.g(viewS);
                        }
                        position = flexboxLayoutManager.getPosition(viewS);
                        wo0Var.a = position;
                        wo0Var.g = false;
                        int[] iArr = flexboxLayoutManager.h.c;
                        if (position == -1) {
                            position = 0;
                        }
                        i = iArr[position];
                        if (i == -1) {
                            i = 0;
                        }
                        wo0Var.b = i;
                        size = flexboxLayoutManager.g.size();
                        i2 = wo0Var.b;
                        if (size > i2) {
                            wo0Var.a = ((a) flexboxLayoutManager.g.get(i2)).o;
                        }
                    } else {
                        wo0.a(wo0Var);
                        wo0Var.a = 0;
                        wo0Var.b = 0;
                    }
                } else {
                    wo0.a(wo0Var);
                    wo0Var.a = 0;
                    wo0Var.b = 0;
                }
            } else if (i3 < 0 || i3 >= state.b()) {
                this.p = -1;
                this.q = Integer.MIN_VALUE;
                if (getChildCount() != 0) {
                    if (wo0Var.e) {
                        viewS = u(state.b());
                    } else {
                        viewS = s(state.b());
                    }
                    if (viewS != null) {
                        flexboxLayoutManager = wo0Var.h;
                        if (flexboxLayoutManager.b == 0) {
                            orientationHelper = flexboxLayoutManager.n;
                        } else {
                            orientationHelper = flexboxLayoutManager.m;
                        }
                        if (flexboxLayoutManager.j()) {
                            if (wo0Var.e) {
                                wo0Var.c = orientationHelper.o() + orientationHelper.d(viewS);
                            } else {
                                wo0Var.c = orientationHelper.g(viewS);
                            }
                        } else if (wo0Var.e) {
                            wo0Var.c = orientationHelper.o() + orientationHelper.d(viewS);
                        } else {
                            wo0Var.c = orientationHelper.g(viewS);
                        }
                        position = flexboxLayoutManager.getPosition(viewS);
                        wo0Var.a = position;
                        wo0Var.g = false;
                        int[] iArr2 = flexboxLayoutManager.h.c;
                        if (position == -1) {
                            position = 0;
                        }
                        i = iArr2[position];
                        if (i == -1) {
                            i = 0;
                        }
                        wo0Var.b = i;
                        size = flexboxLayoutManager.g.size();
                        i2 = wo0Var.b;
                        if (size > i2) {
                            wo0Var.a = ((a) flexboxLayoutManager.g.get(i2)).o;
                        }
                    } else {
                        wo0.a(wo0Var);
                        wo0Var.a = 0;
                        wo0Var.b = 0;
                    }
                } else {
                    wo0.a(wo0Var);
                    wo0Var.a = 0;
                    wo0Var.b = 0;
                }
            } else {
                int i10 = this.p;
                wo0Var.a = i10;
                wo0Var.b = bVar.c[i10];
                SavedState savedState3 = this.o;
                if (savedState3 != null) {
                    int iB2 = state.b();
                    int i11 = savedState3.a;
                    if (i11 >= 0 && i11 < iB2) {
                        wo0Var.c = this.m.m() + savedState2.b;
                        wo0Var.g = true;
                        wo0Var.b = -1;
                    } else if (this.q == Integer.MIN_VALUE) {
                        viewFindViewByPosition = findViewByPosition(this.p);
                        if (viewFindViewByPosition != null) {
                            if (getChildCount() > 0 && (childAt = getChildAt(0)) != null) {
                                if (this.p < getPosition(childAt)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                wo0Var.e = z;
                            }
                            wo0.a(wo0Var);
                        } else if (this.m.e(viewFindViewByPosition) > this.m.n()) {
                            wo0.a(wo0Var);
                        } else {
                            iG = this.m.g(viewFindViewByPosition) - this.m.m();
                            orientationHelper2 = this.m;
                            if (iG < 0) {
                                wo0Var.c = orientationHelper2.m();
                                wo0Var.e = false;
                            } else if (orientationHelper2.i() - this.m.d(viewFindViewByPosition) < 0) {
                                wo0Var.c = this.m.i();
                                wo0Var.e = true;
                            } else {
                                z2 = wo0Var.e;
                                orientationHelper3 = this.m;
                                if (z2) {
                                    iG2 = this.m.o() + orientationHelper3.d(viewFindViewByPosition);
                                } else {
                                    iG2 = orientationHelper3.g(viewFindViewByPosition);
                                }
                                wo0Var.c = iG2;
                            }
                        }
                    } else if (j() && this.e) {
                        wo0Var.c = this.q - this.m.j();
                    } else {
                        wo0Var.c = this.m.m() + this.q;
                    }
                } else if (this.q == Integer.MIN_VALUE) {
                    viewFindViewByPosition = findViewByPosition(this.p);
                    if (viewFindViewByPosition != null) {
                        if (getChildCount() > 0) {
                            if (this.p < getPosition(childAt)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            wo0Var.e = z;
                        }
                        wo0.a(wo0Var);
                    } else if (this.m.e(viewFindViewByPosition) > this.m.n()) {
                        wo0.a(wo0Var);
                    } else {
                        iG = this.m.g(viewFindViewByPosition) - this.m.m();
                        orientationHelper2 = this.m;
                        if (iG < 0) {
                            wo0Var.c = orientationHelper2.m();
                            wo0Var.e = false;
                        } else if (orientationHelper2.i() - this.m.d(viewFindViewByPosition) < 0) {
                            wo0Var.c = this.m.i();
                            wo0Var.e = true;
                        } else {
                            z2 = wo0Var.e;
                            orientationHelper3 = this.m;
                            if (z2) {
                                iG2 = this.m.o() + orientationHelper3.d(viewFindViewByPosition);
                            } else {
                                iG2 = orientationHelper3.g(viewFindViewByPosition);
                            }
                            wo0Var.c = iG2;
                        }
                    }
                } else if (j()) {
                    wo0Var.c = this.m.m() + this.q;
                } else {
                    wo0Var.c = this.m.m() + this.q;
                }
            }
            wo0Var.f = true;
        }
        detachAndScrapAttachedViews(recycler);
        if (wo0Var.e) {
            I(wo0Var, false, true);
        } else {
            H(wo0Var, false, true);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        boolean zJ = j();
        Context context = this.u;
        if (zJ) {
            int i12 = this.r;
            z3 = (i12 == Integer.MIN_VALUE || i12 == width) ? false : true;
            xo0 xo0Var2 = this.k;
            i4 = xo0Var2.b ? context.getResources().getDisplayMetrics().heightPixels : xo0Var2.a;
        } else {
            int i13 = this.s;
            z3 = (i13 == Integer.MIN_VALUE || i13 == height) ? false : true;
            xo0 xo0Var3 = this.k;
            i4 = xo0Var3.b ? context.getResources().getDisplayMetrics().widthPixels : xo0Var3.a;
        }
        int i14 = i4;
        this.r = width;
        this.s = height;
        int i15 = this.w;
        uo0 uo0Var = this.x;
        if (i15 != -1 || (this.p == -1 && !z3)) {
            int iMin = wo0Var.a;
            if (i15 != -1) {
                iMin = Math.min(i15, iMin);
            }
            uo0Var.c = null;
            uo0Var.b = 0;
            boolean zJ2 = j();
            List list = this.g;
            if (zJ2) {
                if (list.size() > 0) {
                    bVar.d(iMin, this.g);
                    this.h.b(this.x, iMakeMeasureSpec, iMakeMeasureSpec2, i14, iMin, wo0Var.a, this.g);
                } else {
                    bVar.i(iB);
                    this.h.b(this.x, iMakeMeasureSpec, iMakeMeasureSpec2, i14, 0, -1, this.g);
                }
            } else if (list.size() > 0) {
                bVar.d(iMin, this.g);
                int i16 = iMin;
                this.h.b(this.x, iMakeMeasureSpec2, iMakeMeasureSpec, i14, i16, wo0Var.a, this.g);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                iMin = i16;
            } else {
                bVar.i(iB);
                this.h.b(this.x, iMakeMeasureSpec2, iMakeMeasureSpec, i14, 0, -1, this.g);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.g = (List) uo0Var.c;
            bVar.h(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
            bVar.u(iMin);
        } else if (!wo0Var.e) {
            this.g.clear();
            uo0Var.c = null;
            uo0Var.b = 0;
            boolean zJ3 = j();
            int i17 = wo0Var.a;
            b bVar2 = this.h;
            uo0 uo0Var2 = this.x;
            if (zJ3) {
                bVar2.b(uo0Var2, iMakeMeasureSpec, iMakeMeasureSpec2, i14, 0, i17, this.g);
            } else {
                bVar2.b(uo0Var2, iMakeMeasureSpec2, iMakeMeasureSpec, i14, 0, i17, this.g);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.g = (List) uo0Var.c;
            bVar.h(iMakeMeasureSpec, iMakeMeasureSpec2, 0);
            bVar.u(0);
            int i18 = bVar.c[wo0Var.a];
            wo0Var.b = i18;
            this.k.c = i18;
        }
        r(recycler, state, this.k);
        boolean z7 = wo0Var.e;
        xo0 xo0Var4 = this.k;
        if (z7) {
            i6 = xo0Var4.e;
            z4 = true;
            H(wo0Var, true, false);
            r(recycler, state, this.k);
            i5 = this.k.e;
        } else {
            z4 = true;
            i5 = xo0Var4.e;
            I(wo0Var, true, false);
            r(recycler, state, this.k);
            i6 = this.k.e;
        }
        if (getChildCount() > 0) {
            if (wo0Var.e) {
                z(y(i5, recycler, state, z4) + i6, recycler, state, false);
            } else {
                y(z(i6, recycler, state, z4) + i5, recycler, state, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.o = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = this.o;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.a = savedState.a;
            savedState2.b = savedState.b;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (getChildCount() <= 0) {
            savedState3.a = -1;
            return savedState3;
        }
        View childAt = getChildAt(0);
        savedState3.a = getPosition(childAt);
        savedState3.b = this.m.g(childAt) - this.m.m();
        return savedState3;
    }

    public final void q() {
        if (this.m != null) {
            return;
        }
        boolean zJ = j();
        int i = this.b;
        if (zJ) {
            if (i == 0) {
                this.m = OrientationHelper.a(this);
                this.n = OrientationHelper.c(this);
                return;
            } else {
                this.m = OrientationHelper.c(this);
                this.n = OrientationHelper.a(this);
                return;
            }
        }
        if (i == 0) {
            this.m = OrientationHelper.c(this);
            this.n = OrientationHelper.a(this);
        } else {
            this.m = OrientationHelper.a(this);
            this.n = OrientationHelper.c(this);
        }
    }

    public final int r(RecyclerView.Recycler recycler, RecyclerView.State state, xo0 xo0Var) {
        int i;
        boolean z;
        int i2;
        int i3;
        Rect rect;
        int i4;
        int i5;
        int i6;
        Rect rect2;
        int i7 = xo0Var.f;
        if (i7 != Integer.MIN_VALUE) {
            int i8 = xo0Var.a;
            if (i8 < 0) {
                xo0Var.f = i7 + i8;
            }
            C(recycler, xo0Var);
        }
        int i9 = xo0Var.a;
        boolean zJ = j();
        int i10 = i9;
        int i11 = 0;
        while (true) {
            if (i10 <= 0 && !this.k.b) {
                break;
            }
            List list = this.g;
            int i12 = xo0Var.d;
            if (i12 < 0 || i12 >= state.b() || (i = xo0Var.c) < 0 || i >= list.size()) {
                break;
            }
            a aVar = (a) this.g.get(xo0Var.c);
            xo0Var.d = aVar.o;
            boolean zJ2 = j();
            wo0 wo0Var = this.l;
            Rect rect3 = y;
            b bVar = this.h;
            if (zJ2) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int width = getWidth();
                int i13 = xo0Var.e;
                if (xo0Var.h == -1) {
                    i13 -= aVar.g;
                }
                int i14 = xo0Var.d;
                float f = wo0Var.d;
                float f2 = paddingLeft - f;
                float leftDecorationWidth = (width - paddingRight) - f;
                float fMax = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                int i15 = aVar.h;
                int i16 = i13;
                int i17 = i14;
                int i18 = 0;
                while (i17 < i14 + i15) {
                    int i19 = i14;
                    View viewB = b(i17);
                    if (viewB == null) {
                        i18 = i18;
                        i17 = i17;
                        rect2 = rect3;
                    } else {
                        if (xo0Var.h == 1) {
                            calculateItemDecorationsForChild(viewB, rect3);
                            addView(viewB);
                        } else {
                            calculateItemDecorationsForChild(viewB, rect3);
                            addView(viewB, i18);
                            i18++;
                        }
                        long j = bVar.d[i17];
                        int i20 = (int) j;
                        int i21 = (int) (j >> 32);
                        LayoutParams layoutParams = (LayoutParams) viewB.getLayoutParams();
                        if (F(viewB, i20, i21, layoutParams)) {
                            viewB.measure(i20, i21);
                        }
                        float leftDecorationWidth2 = f2 + getLeftDecorationWidth(viewB) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        float rightDecorationWidth = leftDecorationWidth - (getRightDecorationWidth(viewB) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                        int topDecorationHeight = getTopDecorationHeight(viewB) + i16;
                        boolean z2 = this.e;
                        b bVar2 = this.h;
                        if (z2) {
                            rect2 = rect3;
                            bVar2.o(viewB, aVar, Math.round(rightDecorationWidth) - viewB.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth), viewB.getMeasuredHeight() + topDecorationHeight);
                        } else {
                            rect2 = rect3;
                            bVar2.o(viewB, aVar, Math.round(leftDecorationWidth2), topDecorationHeight, viewB.getMeasuredWidth() + Math.round(leftDecorationWidth2), viewB.getMeasuredHeight() + topDecorationHeight);
                        }
                        float rightDecorationWidth2 = getRightDecorationWidth(viewB) + viewB.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + fMax + leftDecorationWidth2;
                        leftDecorationWidth = rightDecorationWidth - ((getLeftDecorationWidth(viewB) + (viewB.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin)) + fMax);
                        f2 = rightDecorationWidth2;
                    }
                    i17++;
                    i14 = i19;
                    bVar = bVar;
                    zJ = zJ;
                    i15 = i15;
                    i18 = i18;
                    rect3 = rect2;
                }
                z = zJ;
                xo0Var.c += this.k.h;
                i3 = aVar.g;
            } else {
                z = zJ;
                Rect rect4 = rect3;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i22 = xo0Var.e;
                if (xo0Var.h == -1) {
                    int i23 = aVar.g;
                    i2 = i22 + i23;
                    i22 -= i23;
                } else {
                    i2 = i22;
                }
                int i24 = xo0Var.d;
                float f3 = height - paddingBottom;
                float f4 = wo0Var.d;
                float f5 = paddingTop - f4;
                float topDecorationHeight2 = f3 - f4;
                float fMax2 = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                int i25 = aVar.h;
                int i26 = i24;
                int i27 = 0;
                while (i26 < i24 + i25) {
                    int i28 = i24;
                    View viewB2 = b(i26);
                    if (viewB2 == null) {
                        i5 = i25;
                        i4 = i26;
                        rect = rect4;
                        i6 = i28;
                    } else {
                        float f6 = f5;
                        long j2 = bVar.d[i26];
                        float f7 = topDecorationHeight2;
                        int i29 = (int) j2;
                        int i30 = (int) (j2 >> 32);
                        LayoutParams layoutParams2 = (LayoutParams) viewB2.getLayoutParams();
                        if (F(viewB2, i29, i30, layoutParams2)) {
                            viewB2.measure(i29, i30);
                        }
                        float topDecorationHeight3 = f6 + getTopDecorationHeight(viewB2) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                        float bottomDecorationHeight = f7 - (getBottomDecorationHeight(viewB2) + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                        if (xo0Var.h == 1) {
                            rect = rect4;
                            calculateItemDecorationsForChild(viewB2, rect);
                            addView(viewB2);
                        } else {
                            rect = rect4;
                            calculateItemDecorationsForChild(viewB2, rect);
                            addView(viewB2, i27);
                            i27++;
                        }
                        int i31 = i27;
                        int leftDecorationWidth3 = getLeftDecorationWidth(viewB2) + i22;
                        int rightDecorationWidth3 = i2 - getRightDecorationWidth(viewB2);
                        int i32 = i26;
                        boolean z3 = this.e;
                        boolean z4 = this.f;
                        int i33 = i25;
                        b bVar3 = this.h;
                        if (!z3) {
                            i4 = i32;
                            i5 = i33;
                            i6 = i28;
                            if (z4) {
                                bVar3.p(viewB2, aVar, z3, leftDecorationWidth3, Math.round(bottomDecorationHeight) - viewB2.getMeasuredHeight(), viewB2.getMeasuredWidth() + leftDecorationWidth3, Math.round(bottomDecorationHeight));
                            } else {
                                bVar3.p(viewB2, aVar, z3, leftDecorationWidth3, Math.round(topDecorationHeight3), viewB2.getMeasuredWidth() + leftDecorationWidth3, viewB2.getMeasuredHeight() + Math.round(topDecorationHeight3));
                            }
                        } else if (z4) {
                            i4 = i32;
                            i5 = i33;
                            i6 = i28;
                            bVar3.p(viewB2, aVar, z3, rightDecorationWidth3 - viewB2.getMeasuredWidth(), Math.round(bottomDecorationHeight) - viewB2.getMeasuredHeight(), rightDecorationWidth3, Math.round(bottomDecorationHeight));
                        } else {
                            i4 = i32;
                            i5 = i33;
                            i6 = i28;
                            bVar3.p(viewB2, aVar, z3, rightDecorationWidth3 - viewB2.getMeasuredWidth(), Math.round(topDecorationHeight3), rightDecorationWidth3, viewB2.getMeasuredHeight() + Math.round(topDecorationHeight3));
                        }
                        float bottomDecorationHeight2 = getBottomDecorationHeight(viewB2) + viewB2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + fMax2 + topDecorationHeight3;
                        topDecorationHeight2 = bottomDecorationHeight - ((getTopDecorationHeight(viewB2) + (viewB2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin)) + fMax2);
                        f5 = bottomDecorationHeight2;
                        i27 = i31;
                    }
                    i26 = i4 + 1;
                    i24 = i6;
                    i25 = i5;
                    rect4 = rect;
                }
                xo0Var.c += this.k.h;
                i3 = aVar.g;
            }
            i11 += i3;
            if (z || !this.e) {
                xo0Var.e += aVar.g * xo0Var.h;
            } else {
                xo0Var.e -= aVar.g * xo0Var.h;
            }
            i10 -= aVar.g;
            i9 = i9;
            zJ = z;
        }
        int i34 = i9;
        int i35 = xo0Var.a - i11;
        xo0Var.a = i35;
        int i36 = xo0Var.f;
        if (i36 != Integer.MIN_VALUE) {
            int i37 = i36 + i11;
            xo0Var.f = i37;
            if (i35 < 0) {
                xo0Var.f = i37 + i35;
            }
            C(recycler, xo0Var);
        }
        return i34 - xo0Var.a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        this.p = i;
        this.q = Integer.MIN_VALUE;
        SavedState savedState = this.o;
        if (savedState != null) {
            savedState.a = -1;
        }
        requestLayout();
    }

    @Override // defpackage.to0
    public final void setFlexLines(List list) {
        this.g = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        wo0 wo0Var = new wo0(this);
        this.l = wo0Var;
        this.p = -1;
        this.q = Integer.MIN_VALUE;
        this.r = Integer.MIN_VALUE;
        this.s = Integer.MIN_VALUE;
        this.t = new SparseArray();
        this.w = -1;
        this.x = new uo0(0, (boolean) (0 == true ? 1 : 0));
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        int i3 = properties.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.c) {
                    E(3);
                } else {
                    E(2);
                }
            }
        } else if (properties.c) {
            E(1);
        } else {
            E(0);
        }
        int i4 = this.b;
        if (i4 != 1) {
            if (i4 == 0) {
                removeAllViews();
                this.g.clear();
                wo0.b(wo0Var);
                wo0Var.d = 0;
            }
            this.b = 1;
            this.m = null;
            this.n = null;
            requestLayout();
        }
        if (this.c != 4) {
            removeAllViews();
            this.g.clear();
            wo0.b(wo0Var);
            wo0Var.d = 0;
            this.c = 4;
            requestLayout();
        }
        this.u = context;
    }

    public static boolean l(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i) {
                return false;
            }
            return true;
        }
        if (size < i) {
            return false;
        }
        return true;
    }

    public final int B(int i) {
        int height;
        int height2;
        if (getChildCount() != 0 && i != 0) {
            q();
            boolean zJ = j();
            View view = this.v;
            if (zJ) {
                height = view.getWidth();
            } else {
                height = view.getHeight();
            }
            if (zJ) {
                height2 = getWidth();
            } else {
                height2 = getHeight();
            }
            int layoutDirection = getLayoutDirection();
            wo0 wo0Var = this.l;
            if (layoutDirection == 1) {
                int iAbs = Math.abs(i);
                if (i < 0) {
                    return -Math.min((height2 + wo0Var.d) - height, iAbs);
                }
                int i2 = wo0Var.d;
                if (i2 + i > 0) {
                    return -i2;
                }
            } else {
                if (i > 0) {
                    return Math.min((height2 - wo0Var.d) - height, i);
                }
                int i3 = wo0Var.d;
                if (i3 + i < 0) {
                    return -i3;
                }
            }
            return i;
        }
        return 0;
    }

    public final void D() {
        int widthMode;
        boolean z;
        if (j()) {
            widthMode = getHeightMode();
        } else {
            widthMode = getWidthMode();
        }
        xo0 xo0Var = this.k;
        if (widthMode != 0 && widthMode != Integer.MIN_VALUE) {
            z = false;
        } else {
            z = true;
        }
        xo0Var.b = z;
    }

    public final boolean F(View view, int i, int i2, LayoutParams layoutParams) {
        if (!view.isLayoutRequested() && isMeasurementCacheEnabled() && l(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && l(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
            return false;
        }
        return true;
    }

    public final void G(int i) {
        int position = -1;
        View viewW = w(getChildCount() - 1, -1);
        if (viewW != null) {
            position = getPosition(viewW);
        }
        if (i < position) {
            int childCount = getChildCount();
            b bVar = this.h;
            bVar.j(childCount);
            bVar.k(childCount);
            bVar.i(childCount);
            if (i < bVar.c.length) {
                this.w = i;
                View childAt = getChildAt(0);
                if (childAt == null) {
                    return;
                }
                this.p = getPosition(childAt);
                if (!j() && this.e) {
                    this.q = this.m.j() + this.m.d(childAt);
                } else {
                    this.q = this.m.g(childAt) - this.m.m();
                }
            }
        }
    }

    @Override // defpackage.to0
    public final int c(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(RecyclerView.State state) {
        return n(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        return o(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        return p(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public final PointF computeScrollVectorForPosition(int i) {
        View childAt;
        int i2;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        if (i < getPosition(childAt)) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if (j()) {
            return new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2);
        }
        return new PointF(i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        return n(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return o(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        return p(state);
    }

    @Override // defpackage.to0
    public final int d(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (j()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return rightDecorationWidth + leftDecorationWidth;
    }

    @Override // defpackage.to0
    public final View e(int i) {
        return b(i);
    }

    @Override // defpackage.to0
    public final int f(View view, int i, int i2) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (j()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return bottomDecorationHeight + topDecorationHeight;
    }

    @Override // defpackage.to0
    public final int g(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    public final int n(RecyclerView.State state) {
        if (getChildCount() != 0) {
            int iB = state.b();
            q();
            View viewS = s(iB);
            View viewU = u(iB);
            if (state.b() != 0 && viewS != null && viewU != null) {
                return Math.min(this.m.n(), this.m.d(viewU) - this.m.g(viewS));
            }
            return 0;
        }
        return 0;
    }

    public final int o(RecyclerView.State state) {
        if (getChildCount() != 0) {
            int iB = state.b();
            View viewS = s(iB);
            View viewU = u(iB);
            if (state.b() != 0 && viewS != null && viewU != null) {
                int position = getPosition(viewS);
                int position2 = getPosition(viewU);
                int iAbs = Math.abs(this.m.d(viewU) - this.m.g(viewS));
                int[] iArr = this.h.c;
                int i = iArr[position];
                if (i != 0 && i != -1) {
                    return Math.round((i * (iAbs / ((iArr[position2] - i) + 1))) + (this.m.m() - this.m.g(viewS)));
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.v = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        onDetachedFromWindow(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        G(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        super.onItemsMoved(recyclerView, i, i2, i3);
        G(Math.min(i, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        G(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        G(i);
    }

    public final int p(RecyclerView.State state) {
        int position;
        if (getChildCount() != 0) {
            int iB = state.b();
            View viewS = s(iB);
            View viewU = u(iB);
            if (state.b() != 0 && viewS != null && viewU != null) {
                View viewW = w(0, getChildCount());
                int position2 = -1;
                if (viewW == null) {
                    position = -1;
                } else {
                    position = getPosition(viewW);
                }
                View viewW2 = w(getChildCount() - 1, -1);
                if (viewW2 != null) {
                    position2 = getPosition(viewW2);
                }
                return (int) ((Math.abs(this.m.d(viewU) - this.m.g(viewS)) / ((position2 - position) + 1)) * state.b());
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (j() && this.b != 0) {
            int iB = B(i);
            this.l.d += iB;
            this.n.r(-iB);
            return iB;
        }
        int iA = A(i, recycler, state);
        this.t.clear();
        return iA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!j() && (this.b != 0 || j())) {
            int iB = B(i);
            this.l.d += iB;
            this.n.r(-iB);
            return iB;
        }
        int iA = A(i, recycler, state);
        this.t.clear();
        return iA;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public final View t(View view, a aVar) {
        boolean zJ = j();
        int i = aVar.h;
        for (int i2 = 1; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (this.e && !zJ) {
                    if (this.m.d(view) < this.m.d(childAt)) {
                        view = childAt;
                    }
                } else if (this.m.g(view) > this.m.g(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View u(int i) {
        View viewX = x(getChildCount() - 1, -1, i);
        if (viewX == null) {
            return null;
        }
        return v(viewX, (a) this.g.get(this.h.c[getPosition(viewX)]));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    public final View v(View view, a aVar) {
        boolean zJ = j();
        int childCount = (getChildCount() - aVar.h) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (this.e && !zJ) {
                    if (this.m.g(view) > this.m.g(childAt)) {
                        view = childAt;
                    }
                } else if (this.m.d(view) < this.m.d(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View x(int i, int i2, int i3) {
        int position;
        q();
        int i4 = 1;
        if (this.k == null) {
            xo0 xo0Var = new xo0();
            xo0Var.h = 1;
            this.k = xo0Var;
        }
        int iM = this.m.m();
        int i5 = this.m.i();
        if (i2 <= i) {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).a.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.m.g(childAt) >= iM && this.m.d(childAt) <= i5) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    public final int y(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int iA;
        int i2;
        if (!j() && this.e) {
            int iM = i - this.m.m();
            if (iM > 0) {
                iA = A(iM, recycler, state);
            } else {
                return 0;
            }
        } else {
            int i3 = this.m.i() - i;
            if (i3 > 0) {
                iA = -A(-i3, recycler, state);
            } else {
                return 0;
            }
        }
        int i4 = i + iA;
        if (z && (i2 = this.m.i() - i4) > 0) {
            this.m.r(i2);
            return i2 + iA;
        }
        return iA;
    }

    public final int z(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int iA;
        int iM;
        if (!j() && this.e) {
            int i2 = this.m.i() - i;
            if (i2 > 0) {
                iA = A(-i2, recycler, state);
            } else {
                return 0;
            }
        } else {
            int iM2 = i - this.m.m();
            if (iM2 > 0) {
                iA = -A(iM2, recycler, state);
            } else {
                return 0;
            }
        }
        int i3 = i + iA;
        if (z && (iM = i3 - this.m.m()) > 0) {
            this.m.r(-iM);
            return iA - iM;
        }
        return iA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        super.onItemsUpdated(recyclerView, i, i2);
        G(i);
    }
}
