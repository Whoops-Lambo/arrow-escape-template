package com.bytedance.sdk.component.adexpress.dynamic.rz.kgy;

import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class uq implements View.OnTouchListener {
    private float ahm;
    private boolean ct = true;
    private boolean fi;
    private com.bytedance.sdk.component.adexpress.dynamic.rz.fi gf;
    private float kgy;
    private float noq;
    private boolean nu;
    private int ra;
    private float rz;
    private float uq;
    private float yo;

    public uq(com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar, int i, boolean z) {
        this.gf = fiVar;
        this.ra = i;
        this.nu = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar;
        com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar2;
        com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar3;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float y = motionEvent.getY();
                    this.yo = y;
                    if (Math.abs(y - this.noq) > 10.0f) {
                        this.fi = true;
                    }
                    this.uq = motionEvent.getX();
                    this.rz = motionEvent.getY();
                    if (Math.abs(this.uq - this.kgy) > 8.0f || Math.abs(this.rz - this.ahm) > 8.0f) {
                        this.ct = false;
                    }
                }
            } else {
                if (!this.fi && !this.ct) {
                    return false;
                }
                if (!this.nu && (fiVar3 = this.gf) != null) {
                    fiVar3.kgy();
                } else {
                    int iAhm = com.bytedance.sdk.component.adexpress.uq.yo.ahm(com.bytedance.sdk.component.adexpress.uq.kgy(), Math.abs(this.yo - this.noq));
                    if (this.yo - this.noq < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && iAhm > this.ra && (fiVar2 = this.gf) != null) {
                        fiVar2.kgy();
                    } else if (this.ct && (fiVar = this.gf) != null) {
                        fiVar.kgy();
                    }
                }
            }
        } else {
            this.kgy = motionEvent.getX();
            this.ahm = motionEvent.getY();
            this.noq = motionEvent.getY();
            this.ct = true;
        }
        return true;
    }
}
