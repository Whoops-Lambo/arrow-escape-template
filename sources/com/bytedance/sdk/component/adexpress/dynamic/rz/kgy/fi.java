package com.bytedance.sdk.component.adexpress.dynamic.rz.kgy;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class fi implements View.OnTouchListener {
    private final boolean ahm;
    private float ct;
    private final com.bytedance.sdk.component.adexpress.dynamic.rz.fi kgy;
    private float noq;
    private final int rz = 10;
    private float uq;
    private float yo;

    public fi(com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar, boolean z) {
        this.kgy = fiVar;
        this.ahm = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar;
        com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.noq = motionEvent.getX();
                this.yo = motionEvent.getY();
                new StringBuilder(", mEndY: ").append(this.yo);
                if (!this.ahm && (fiVar2 = this.kgy) != null) {
                    fiVar2.kgy();
                } else {
                    float f = this.noq - this.uq;
                    float f2 = this.yo - this.ct;
                    if (com.bytedance.sdk.component.adexpress.uq.yo.ahm(com.bytedance.sdk.component.adexpress.uq.kgy(), Math.abs((float) Math.sqrt((f2 * f2) + (f * f)))) > 10.0f && (fiVar = this.kgy) != null) {
                        fiVar.kgy();
                    }
                }
            }
        } else {
            this.uq = motionEvent.getX();
            this.ct = motionEvent.getY();
            new StringBuilder(", mStartY: ").append(this.ct);
        }
        return true;
    }
}
