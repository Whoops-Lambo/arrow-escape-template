package com.bytedance.sdk.component.adexpress.dynamic.rz;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class kus implements yo<com.bytedance.sdk.component.adexpress.noq.vs> {
    private com.bytedance.sdk.component.adexpress.noq.vs kgy;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void ahm() {
        this.kgy.ahm();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void kgy() {
        this.kgy.kgy();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    /* JADX INFO: renamed from: uq, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.noq.vs rz() {
        return this.kgy;
    }

    public kus(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct ctVar, com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar) {
        this.kgy = new com.bytedance.sdk.component.adexpress.noq.vs(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(context, 180.0f));
        layoutParams.gravity = 17;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(context, 20.0f);
        this.kgy.setLayoutParams(layoutParams);
        this.kgy.setGuideText(yoVar.pxt());
    }
}
