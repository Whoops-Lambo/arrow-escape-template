package com.bytedance.sdk.component.adexpress.dynamic.rz;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.noq.sx;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class dg implements yo {
    private Context ahm;
    private sx kgy;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct rz;
    private com.bytedance.sdk.component.adexpress.dynamic.uq.yo uq;

    private void uq() {
        this.kgy = new sx(this.ahm);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.ahm, 120.0f));
        layoutParams.gravity = 17;
        this.kgy.setLayoutParams(layoutParams);
        this.kgy.setClipChildren(false);
        this.kgy.setGuideText(this.uq.pxt());
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct ctVar = this.rz;
        if (ctVar != null) {
            this.kgy.setOnClickListener((View.OnClickListener) ctVar.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void ahm() {
        sx sxVar = this.kgy;
        if (sxVar != null) {
            sxVar.ahm();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void kgy() {
        sx sxVar = this.kgy;
        if (sxVar != null) {
            sxVar.kgy();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public ViewGroup rz() {
        return this.kgy;
    }

    public dg(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct ctVar, com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar) {
        this.ahm = context;
        this.rz = ctVar;
        this.uq = yoVar;
        uq();
    }
}
