package com.bytedance.sdk.component.adexpress.dynamic.rz;

import android.content.Context;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class um implements yo<com.bytedance.sdk.component.adexpress.noq.nu> {
    private final com.bytedance.sdk.component.adexpress.noq.nu kgy;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void ahm() {
        com.bytedance.sdk.component.adexpress.noq.nu nuVar = this.kgy;
        if (nuVar != null) {
            nuVar.ahm();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void kgy() {
        com.bytedance.sdk.component.adexpress.noq.nu nuVar = this.kgy;
        if (nuVar != null) {
            nuVar.kgy();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    /* JADX INFO: renamed from: uq, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.noq.nu rz() {
        return this.kgy;
    }

    public um(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct ctVar, com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar) {
        int iJc;
        com.bytedance.sdk.component.adexpress.noq.nu nuVar = new com.bytedance.sdk.component.adexpress.noq.nu(context);
        this.kgy = nuVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        if (yoVar.jc() > 0) {
            iJc = yoVar.jc();
        } else if (com.bytedance.sdk.component.adexpress.uq.ahm()) {
            iJc = 0;
        } else {
            iJc = b.v;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(context, iJc);
        nuVar.setLayoutParams(layoutParams);
        nuVar.setClipChildren(false);
        nuVar.setText(yoVar.pxt());
    }
}
