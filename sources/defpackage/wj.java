package defpackage;

import android.view.View;
import androidx.core.math.MathUtils;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class wj extends ViewDragHelper.Callback {
    public final /* synthetic */ BottomSheetBehavior a;

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void f(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior.K) {
                bottomSheetBehavior.D(1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:34:0x0082  */
    /* JADX WARN: Code duplicated, block: B:6:0x000d  */
    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void h(View view, float f, float f2) {
        int i = 6;
        BottomSheetBehavior bottomSheetBehavior = this.a;
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (bottomSheetBehavior.b) {
                i = 3;
            } else {
                int top = view.getTop();
                System.currentTimeMillis();
                if (top <= bottomSheetBehavior.E) {
                    i = 3;
                }
            }
        } else if (bottomSheetBehavior.I && bottomSheetBehavior.E(view, f2)) {
            if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.d) {
                if (view.getTop() > (bottomSheetBehavior.y() + bottomSheetBehavior.T) / 2) {
                    i = 5;
                } else if (bottomSheetBehavior.b || Math.abs(view.getTop() - bottomSheetBehavior.y()) < Math.abs(view.getTop() - bottomSheetBehavior.E)) {
                    i = 3;
                }
            } else {
                i = 5;
            }
        } else if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Math.abs(f) > Math.abs(f2)) {
            int top2 = view.getTop();
            if (!bottomSheetBehavior.b) {
                int i2 = bottomSheetBehavior.E;
                if (top2 < i2) {
                    if (top2 < Math.abs(top2 - bottomSheetBehavior.G)) {
                        i = 3;
                    }
                } else if (Math.abs(top2 - i2) >= Math.abs(top2 - bottomSheetBehavior.G)) {
                    i = 4;
                }
            } else if (Math.abs(top2 - bottomSheetBehavior.D) < Math.abs(top2 - bottomSheetBehavior.G)) {
                i = 3;
            } else {
                i = 4;
            }
        } else if (bottomSheetBehavior.b) {
            i = 4;
        } else {
            int top3 = view.getTop();
            if (Math.abs(top3 - bottomSheetBehavior.E) >= Math.abs(top3 - bottomSheetBehavior.G)) {
                i = 4;
            }
        }
        bottomSheetBehavior.F(view, i, true);
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int b(int i, View view) {
        return MathUtils.a(i, this.a.y(), d());
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int d() {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.G;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void g(View view, int i, int i2) {
        this.a.v(i2);
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final boolean i(int i, View view) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i2 = bottomSheetBehavior.L;
        if (i2 == 1 || bottomSheetBehavior.a0) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.Y == i) {
            WeakReference weakReference = bottomSheetBehavior.V;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.U;
        return weakReference2 != null && weakReference2.get() == view;
    }

    public wj(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int a(int i, View view) {
        return view.getLeft();
    }
}
