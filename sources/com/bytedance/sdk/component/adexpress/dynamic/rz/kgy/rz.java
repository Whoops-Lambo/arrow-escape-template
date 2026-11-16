package com.bytedance.sdk.component.adexpress.dynamic.rz.kgy;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz implements View.OnTouchListener {
    private float ahm;
    private boolean ct;
    private boolean fi;
    private boolean gf;
    private float kgy;
    private com.bytedance.sdk.component.adexpress.dynamic.rz.fi noq;
    private float rz;
    private float uq;
    private int yo;

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar;
        com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar2;
        com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar3;
        if (this.gf) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.kgy = motionEvent.getX();
            this.ahm = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.uq = motionEvent.getX();
                this.rz = motionEvent.getY();
                if (Math.abs(this.uq - this.kgy) > 10.0f) {
                    this.ct = true;
                }
                if (Math.abs(this.uq - this.kgy) > 8.0f || Math.abs(this.rz - this.ahm) > 8.0f) {
                    this.fi = false;
                }
                int iAhm = com.bytedance.sdk.component.adexpress.uq.yo.ahm(com.bytedance.sdk.component.adexpress.uq.kgy(), Math.abs(this.uq - this.kgy));
                if (this.uq > this.kgy && iAhm > this.yo && (fiVar3 = this.noq) != null) {
                    fiVar3.kgy();
                    this.gf = true;
                }
            }
        } else {
            if (!this.ct && !this.fi) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int iAhm2 = com.bytedance.sdk.component.adexpress.uq.yo.ahm(com.bytedance.sdk.component.adexpress.uq.kgy(), Math.abs(this.uq - this.kgy));
            if (this.uq > this.kgy && iAhm2 > this.yo && (fiVar2 = this.noq) != null) {
                fiVar2.kgy();
                this.gf = true;
            }
            float fAbs = Math.abs(x - this.kgy);
            float fAbs2 = Math.abs(y - this.ahm);
            if ((fAbs < 8.0f || fAbs2 < 8.0f) && (fiVar = this.noq) != null) {
                fiVar.ahm();
                this.gf = true;
            }
        }
        return true;
    }

    public rz(com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar, int i) {
        this.yo = 5;
        this.fi = true;
        this.noq = fiVar;
        if (i > 0) {
            this.yo = i;
        }
    }

    public rz(com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar) {
        this(fiVar, 5);
    }
}
