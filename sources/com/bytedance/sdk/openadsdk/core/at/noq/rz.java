package com.bytedance.sdk.openadsdk.core.at.noq;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.ct.at;
import com.bytedance.adsdk.ugeno.ct.vs;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class rz implements vs {
    private boolean kgy = false;

    @Override // com.bytedance.adsdk.ugeno.ct.vs
    public boolean kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar, MotionEvent motionEvent, at atVar, com.bytedance.adsdk.ugeno.ct.uq.rz rzVar2) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && this.kgy) {
                this.kgy = false;
                if (kgy(rzVar.nu(), motionEvent.getX(), motionEvent.getY()) && atVar != null) {
                    atVar.kgy(rzVar, rzVar2.uq(), rzVar2.fi().ahm(), rzVar2.fi());
                }
            }
        } else {
            this.kgy = true;
        }
        return true;
    }

    private boolean kgy(View view, float f, float f2) {
        return f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f < ((float) view.getWidth()) && f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 < ((float) view.getHeight());
    }
}
