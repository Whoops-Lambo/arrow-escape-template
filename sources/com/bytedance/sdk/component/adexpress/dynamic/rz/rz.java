package com.bytedance.sdk.component.adexpress.dynamic.rz;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class rz implements yo {
    com.bytedance.sdk.component.adexpress.noq.ct kgy;

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
    public com.bytedance.sdk.component.adexpress.noq.ct rz() {
        return this.kgy;
    }

    public rz(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct ctVar, com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar) {
        this.kgy = new com.bytedance.sdk.component.adexpress.noq.ct(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ctVar.getDynamicHeight(), ctVar.getDynamicHeight());
        layoutParams.gravity = 17;
        this.kgy.setLayoutParams(layoutParams);
    }
}
