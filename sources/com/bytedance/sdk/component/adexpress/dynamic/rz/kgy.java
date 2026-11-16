package com.bytedance.sdk.component.adexpress.dynamic.rz;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class kgy implements yo {
    private com.bytedance.sdk.component.adexpress.noq.ahm kgy;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void ahm() {
        this.kgy.ahm();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void kgy() {
        this.kgy.kgy();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public ViewGroup rz() {
        return this.kgy;
    }

    public kgy(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct ctVar, com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar) {
        double dXkh = yoVar.xkh();
        dXkh = dXkh == 0.0d ? 1.0d : dXkh;
        double dUh = yoVar.uh();
        double d = dUh != 0.0d ? dUh : 1.0d;
        int dynamicWidth = (int) (((double) ctVar.getDynamicWidth()) * 0.32d * dXkh);
        int dynamicWidth2 = (int) (((double) ctVar.getDynamicWidth()) * 0.32d * d);
        this.kgy = new com.bytedance.sdk.component.adexpress.noq.ahm(context, dynamicWidth, dynamicWidth2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(context, yoVar.naw() - 7);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(context, yoVar.znm() - 3);
        this.kgy.setLayoutParams(layoutParams);
    }
}
