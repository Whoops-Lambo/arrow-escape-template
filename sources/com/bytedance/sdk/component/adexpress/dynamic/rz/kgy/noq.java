package com.bytedance.sdk.component.adexpress.dynamic.rz.kgy;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class noq implements View.OnTouchListener {
    private static int rz = 10;
    private float ahm;
    private com.bytedance.sdk.component.adexpress.dynamic.rz.fi ct;
    private float kgy;
    private boolean uq;

    public noq(com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar) {
        this.ct = fiVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.uq = false;
                    }
                } else {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (Math.abs(x - this.kgy) >= rz || Math.abs(y - this.ahm) >= rz) {
                        this.uq = true;
                    }
                }
            } else {
                if (this.uq) {
                    this.uq = false;
                    return false;
                }
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                if (Math.abs(x2 - this.kgy) < rz && Math.abs(y2 - this.ahm) < rz) {
                    com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar = this.ct;
                    if (fiVar != null) {
                        fiVar.kgy();
                    }
                } else {
                    this.uq = false;
                }
            }
        } else {
            this.kgy = motionEvent.getX();
            this.ahm = motionEvent.getY();
        }
        return true;
    }
}
