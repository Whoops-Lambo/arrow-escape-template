package com.bytedance.sdk.openadsdk.component.reward.rz.kgy;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kgy implements com.bytedance.sdk.component.ra.ct {
    private boolean ahm;
    private uq kgy;

    @Override // com.bytedance.sdk.component.ra.ct
    public boolean ahm(MotionEvent motionEvent) {
        return this.ahm && kgy(this.kgy, motionEvent.getX(), motionEvent.getY());
    }

    @Override // com.bytedance.sdk.component.ra.ct
    public boolean kgy(MotionEvent motionEvent) {
        if (kgy(this.kgy, motionEvent.getX(), motionEvent.getY()) && this.ahm) {
            return false;
        }
        this.ahm = false;
        return false;
    }

    public kgy(uq uqVar) {
        this.ahm = false;
        this.kgy = uqVar;
        if (uqVar == null) {
            this.ahm = false;
        } else {
            this.ahm = uqVar.uq();
        }
    }

    public void kgy(boolean z) {
        this.ahm = z;
    }

    public boolean kgy(uq uqVar, float f, float f2) {
        if (uqVar == null) {
            return false;
        }
        return uqVar.kgy(f, f2);
    }
}
