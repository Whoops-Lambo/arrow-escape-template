package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class OrientationHelper {
    public final RecyclerView.LayoutManager a;
    public int b = Integer.MIN_VALUE;
    public final Rect c = new Rect();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OrientationHelper$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    class AnonymousClass1 extends OrientationHelper {
        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int h() {
            return this.a.getWidth();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int i() {
            RecyclerView.LayoutManager layoutManager = this.a;
            return layoutManager.getWidth() - layoutManager.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int j() {
            return this.a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int k() {
            return this.a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int l() {
            return this.a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int m() {
            return this.a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int n() {
            RecyclerView.LayoutManager layoutManager = this.a;
            return (layoutManager.getWidth() - layoutManager.getPaddingLeft()) - layoutManager.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int p(View view) {
            RecyclerView.LayoutManager layoutManager = this.a;
            Rect rect = this.c;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.right;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int q(View view) {
            RecyclerView.LayoutManager layoutManager = this.a;
            Rect rect = this.c;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.left;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final void r(int i) {
            this.a.offsetChildrenHorizontal(i);
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int d(View view) {
            return this.a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int g(View view) {
            return this.a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OrientationHelper$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    class AnonymousClass2 extends OrientationHelper {
        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int h() {
            return this.a.getHeight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int i() {
            RecyclerView.LayoutManager layoutManager = this.a;
            return layoutManager.getHeight() - layoutManager.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int j() {
            return this.a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int k() {
            return this.a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int l() {
            return this.a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int m() {
            return this.a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int n() {
            RecyclerView.LayoutManager layoutManager = this.a;
            return (layoutManager.getHeight() - layoutManager.getPaddingTop()) - layoutManager.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int p(View view) {
            RecyclerView.LayoutManager layoutManager = this.a;
            Rect rect = this.c;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.bottom;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int q(View view) {
            RecyclerView.LayoutManager layoutManager = this.a;
            Rect rect = this.c;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.top;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final void r(int i) {
            this.a.offsetChildrenVertical(i);
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int d(View view) {
            return this.a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int g(View view) {
            return this.a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
        }
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public static OrientationHelper a(RecyclerView.LayoutManager layoutManager) {
        return new AnonymousClass1(layoutManager);
    }

    public static OrientationHelper b(RecyclerView.LayoutManager layoutManager, int i) {
        if (i == 0) {
            return new AnonymousClass1(layoutManager);
        }
        if (i == 1) {
            return new AnonymousClass2(layoutManager);
        }
        d.r("invalid orientation");
        return null;
    }

    public static OrientationHelper c(RecyclerView.LayoutManager layoutManager) {
        return new AnonymousClass2(layoutManager);
    }

    public final int o() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return n() - this.b;
    }

    public OrientationHelper(RecyclerView.LayoutManager layoutManager) {
        this.a = layoutManager;
    }
}
