package com.bytedance.sdk.component.adexpress.dynamic.rz;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.noq.gm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ct extends xh<com.bytedance.sdk.component.adexpress.noq.yo> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.xh
    public void uq() {
    }

    private void kgy(com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar) {
        this.kgy = new com.bytedance.sdk.component.adexpress.noq.fi(this.ahm);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        this.kgy.setLayoutParams(layoutParams);
        gm gmVar = this.kgy;
        if (gmVar instanceof com.bytedance.sdk.component.adexpress.noq.fi) {
            ((com.bytedance.sdk.component.adexpress.noq.fi) gmVar).setButtonText(this.uq.pxt());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.xh, com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void ahm() {
        this.kgy.ahm();
    }

    public ct(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct ctVar, com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar) {
        super(context, ctVar, yoVar);
        kgy(yoVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.xh, com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void kgy() {
        this.kgy.kgy();
    }
}
