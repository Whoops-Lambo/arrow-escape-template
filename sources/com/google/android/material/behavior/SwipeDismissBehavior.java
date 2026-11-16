package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ViewDragHelper;
import com.unity3d.services.UnityAdsConstants;
import defpackage.vl2;
import defpackage.wl2;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public ViewDragHelper a;
    public boolean b;
    public boolean c;
    public int d = 2;
    public float e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float f = 0.5f;
    public final vl2 g = new vl2(this);

    public boolean s(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM = coordinatorLayout.m(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = zM;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b = false;
        }
        if (zM) {
            if (this.a == null) {
                this.a = new ViewDragHelper(coordinatorLayout.getContext(), coordinatorLayout, this.g);
            }
            if (!this.c && this.a.r(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = ViewCompat.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            ViewCompat.v(1048576, view);
            ViewCompat.s(0, view);
            if (s(view)) {
                ViewCompat.w(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.n, new wl2(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.k(motionEvent);
        return true;
    }
}
