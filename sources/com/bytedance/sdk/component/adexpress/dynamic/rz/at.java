package com.bytedance.sdk.component.adexpress.dynamic.rz;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class at implements yo {
    private com.bytedance.sdk.component.adexpress.noq.twf kgy;

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

    public at(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct ctVar, com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar) {
        this.kgy = new com.bytedance.sdk.component.adexpress.noq.twf(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(context, 180.0f));
        layoutParams.gravity = 17;
        this.kgy.setLayoutParams(layoutParams);
        this.kgy.setGuideText(yoVar.pxt());
    }
}
