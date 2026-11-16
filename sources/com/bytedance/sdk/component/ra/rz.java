package com.bytedance.sdk.component.ra;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class rz implements View.OnTouchListener {
    private int ahm = -1;
    private ViewConfiguration kgy;

    public abstract void kgy(View.OnTouchListener onTouchListener);

    public boolean kgy(float f, float f2, float f3, float f4, Context context) {
        if (this.kgy == null) {
            this.kgy = ViewConfiguration.get(context);
        }
        if (this.ahm == -1) {
            this.ahm = this.kgy.getScaledTouchSlop();
        }
        return Math.abs(f - f3) <= ((float) this.ahm) && Math.abs(f2 - f4) <= ((float) this.ahm);
    }
}
