package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class sx {
    private float ct;
    private final kgy kgy;
    private int noq;
    private boolean nu;
    private float uq;
    private int yo;
    private final boolean ahm = false;
    private boolean rz = false;
    private boolean fi = true;
    private boolean gf = false;
    private final View.OnTouchListener ra = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.sx.1
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/sx$1;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
            return safedk_sx$1_onTouch_4ba2374a936dfdc83e3850d42e6cdf23(view, motionEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean safedk_sx$1_onTouch_4ba2374a936dfdc83e3850d42e6cdf23(View p0, MotionEvent p1) {
            if (sx.this.kgy.ioy()) {
                return !sx.this.rz;
            }
            float x = p1.getX();
            float y = p1.getY();
            int action = p1.getAction();
            if (action == 0) {
                sx sxVar = sx.this;
                sxVar.nu = sxVar.kgy(p1);
                sx.this.uq = x;
                sx.this.ct = y;
                sx.this.noq = (int) x;
                sx.this.yo = (int) y;
                sx.this.fi = true;
                if (sx.this.kgy != null && sx.this.rz) {
                    sx.this.kgy.kgy(p0, true);
                }
            } else if (action == 1) {
                if (Math.abs(x - sx.this.noq) > 20.0f || Math.abs(y - sx.this.yo) > 20.0f) {
                    sx.this.fi = false;
                }
                sx.this.fi = true;
                sx.this.gf = false;
                sx.this.uq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                sx.this.ct = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                sx.this.noq = 0;
                if (sx.this.kgy != null) {
                    sx.this.kgy.kgy(p0, sx.this.fi);
                }
                sx.this.nu = false;
            } else if (action == 3) {
                sx.this.nu = false;
            }
            return !sx.this.rz;
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
        boolean ioy();

        void kgy(View view, boolean z);
    }

    public sx(kgy kgyVar) {
        this.kgy = kgyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean kgy(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int iUq = gbb.uq(com.bytedance.sdk.openadsdk.core.xh.kgy().getApplicationContext());
        int iNoq = gbb.noq(com.bytedance.sdk.openadsdk.core.xh.kgy().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f = iUq;
        if (rawX > f * 0.01f && rawX < f * 0.99f) {
            float f2 = iNoq;
            if (rawY > 0.01f * f2 && rawY < f2 * 0.99f) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void kgy(View view) {
        if (view != null) {
            view.setOnTouchListener(this.ra);
        }
    }

    public void kgy(boolean z) {
        this.rz = z;
    }
}
