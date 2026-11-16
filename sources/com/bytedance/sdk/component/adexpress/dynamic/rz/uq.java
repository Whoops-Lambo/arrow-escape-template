package com.bytedance.sdk.component.adexpress.dynamic.rz;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.noq.gm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class uq extends xh<com.bytedance.sdk.component.adexpress.noq.yo> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.xh
    public void uq() {
    }

    private void kgy(com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar) {
        this.kgy = new com.bytedance.sdk.component.adexpress.noq.yo(this.ahm);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.ahm, yoVar.jc());
        this.kgy.setLayoutParams(layoutParams);
        this.kgy.setSlideText(this.uq.pxt());
        gm gmVar = this.kgy;
        if (gmVar instanceof com.bytedance.sdk.component.adexpress.noq.yo) {
            ((com.bytedance.sdk.component.adexpress.noq.yo) gmVar).setButtonText(this.uq.ra());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.xh, com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void ahm() {
        this.kgy.ahm();
    }

    public uq(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct ctVar, com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar) {
        super(context, ctVar, yoVar);
        kgy(yoVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.xh, com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void kgy() {
        this.kgy.kgy();
    }
}
