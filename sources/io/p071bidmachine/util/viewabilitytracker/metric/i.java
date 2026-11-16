package io.p071bidmachine.util.viewabilitytracker.metric;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;
import defpackage.m32;
import io.p071bidmachine.util.log.d;
import io.p071bidmachine.util.o;
import io.p071bidmachine.util.p;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class i implements a {
    public static final d c = new d("OverlapMetric");
    public final int a;
    public final float b;

    public i(int i, float f) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
        this.b = 100.0f - f;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.p071bidmachine.util.viewabilitytracker.metric.a
    public final boolean a(View view) {
        ViewGroup viewGroup;
        float fMax;
        m32 m32Var = new m32();
        m32Var.a = view;
        int iC = h50.C(this.a);
        d dVar = c;
        int i = 1;
        ViewGroup viewGroup2 = null;
        if (iC == 0) {
            Rect rect = new Rect();
            if (!((View) m32Var.a).getGlobalVisibleRect(rect)) {
                dVar.c(null, new io.p071bidmachine.rendering.internal.event.i(m32Var, 1));
                return false;
            }
            View rootView = ((View) m32Var.a).getRootView();
            ViewGroup viewGroup3 = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            ViewParent parent = ((View) m32Var.a).getParent();
            ViewGroup viewGroup4 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            while (viewGroup4 != null) {
                int iIndexOfChild = viewGroup4.indexOfChild((View) m32Var.a) + i;
                int childCount = viewGroup4.getChildCount();
                while (iIndexOfChild < childCount) {
                    View childAt = viewGroup4.getChildAt(iIndexOfChild);
                    childAt.getClass();
                    if (childAt.getVisibility() == 0) {
                        Rect rectU = p.u(childAt);
                        if (Rect.intersects(rect, rectU)) {
                            int i2 = o.a;
                            int iHeight = rect.height() * rect.width();
                            if (iHeight == 0) {
                                fMax = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            } else {
                                fMax = (iHeight - (Math.max(0, Math.min(rect.bottom, rectU.bottom) - Math.max(rect.top, rectU.top)) * Math.max(0, Math.min(rect.right, rectU.right) - Math.max(rect.left, rectU.left)))) / iHeight;
                            }
                            if (fMax < this.b) {
                                dVar.c(null, new g(fMax, this, m32Var, childAt));
                                return false;
                            }
                            viewGroup = null;
                        } else {
                            i = i;
                            viewGroup = viewGroup2;
                        }
                    } else {
                        i = i;
                        viewGroup = viewGroup2;
                    }
                    iIndexOfChild++;
                    viewGroup2 = viewGroup;
                    i = i;
                }
                int i3 = i;
                ViewGroup viewGroup5 = viewGroup2;
                if (viewGroup4 != viewGroup3) {
                    m32Var.a = viewGroup4;
                    ViewParent parent2 = viewGroup4.getParent();
                    viewGroup4 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : viewGroup5;
                    viewGroup2 = viewGroup5;
                } else {
                    viewGroup2 = viewGroup5;
                    viewGroup4 = viewGroup2;
                }
                i = i3;
            }
        } else {
            if (iC == 1) {
                dVar.d(null, new h(this, 0));
                return true;
            }
            if (iC == 2) {
                dVar.d(null, new h(this, 1));
                return true;
            }
        }
        return i;
    }
}
