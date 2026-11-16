package com.bytedance.sdk.component.adexpress.dynamic.rz.kgy;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.rz.gf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ahm implements View.OnTouchListener {
    private float ahm;
    private gf ct;
    private float kgy;
    private com.bytedance.sdk.component.adexpress.dynamic.rz.fi noq;
    private long rz;
    private boolean uq;

    public ahm(gf gfVar, com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar) {
        this.ct = gfVar;
        this.noq = fiVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (Math.abs(x - this.kgy) >= com.bytedance.sdk.component.adexpress.uq.yo.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), 10.0f) || Math.abs(y - this.ahm) >= com.bytedance.sdk.component.adexpress.uq.yo.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), 10.0f)) {
                        this.uq = true;
                        this.ct.noq();
                    }
                }
            } else {
                if (this.uq) {
                    return false;
                }
                if (System.currentTimeMillis() - this.rz >= 1500) {
                    com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar = this.noq;
                    if (fiVar != null) {
                        fiVar.kgy();
                    }
                } else {
                    this.ct.noq();
                }
            }
        } else {
            this.rz = System.currentTimeMillis();
            this.kgy = motionEvent.getX();
            this.ahm = motionEvent.getY();
            this.ct.ct();
        }
        return true;
    }
}
