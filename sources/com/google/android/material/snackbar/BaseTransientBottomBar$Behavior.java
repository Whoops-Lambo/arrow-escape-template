package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bi;
import defpackage.u61;
import defpackage.zh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final zh h;

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (u61.c == null) {
                    u61.c = new u61();
                }
                synchronized (u61.c.b) {
                }
            }
        } else if (coordinatorLayout.m(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (u61.c == null) {
                u61.c = new u61();
            }
            synchronized (u61.c.b) {
            }
        }
        return super.g(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean s(View view) {
        this.h.getClass();
        return view instanceof bi;
    }

    public BaseTransientBottomBar$Behavior() {
        zh zhVar = new zh();
        this.e = Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.1f), 1.0f);
        this.f = Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.6f), 1.0f);
        this.d = 0;
        this.h = zhVar;
    }
}
