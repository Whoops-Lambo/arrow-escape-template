package com.bytedance.sdk.component.adexpress.dynamic.rz.kgy;

import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ct implements View.OnTouchListener {
    private float ahm;
    private int ct;
    private float kgy;
    private boolean rz;
    private com.bytedance.sdk.component.adexpress.dynamic.rz.fi uq;

    public ct(com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar, int i) {
        this.uq = fiVar;
        this.ct = i;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float y = motionEvent.getY();
                    this.ahm = y;
                    if (Math.abs(y - this.kgy) > 10.0f) {
                        this.rz = true;
                    }
                }
            } else {
                if (!this.rz) {
                    return false;
                }
                int iAhm = com.bytedance.sdk.component.adexpress.uq.yo.ahm(com.bytedance.sdk.component.adexpress.uq.kgy(), Math.abs(this.ahm - this.kgy));
                if (this.ahm - this.kgy < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && iAhm > this.ct && (fiVar = this.uq) != null) {
                    fiVar.kgy();
                    this.kgy = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.ahm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.rz = false;
                }
            }
        } else {
            this.kgy = motionEvent.getY();
        }
        return true;
    }
}
