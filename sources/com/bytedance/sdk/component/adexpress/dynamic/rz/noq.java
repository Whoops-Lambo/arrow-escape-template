package com.bytedance.sdk.component.adexpress.dynamic.rz;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.noq.gm;
import com.safedk.android.analytics.brandsafety.b;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class noq extends xh<com.bytedance.sdk.component.adexpress.noq.noq> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.xh
    public void uq() {
    }

    private void kgy(int i, int i2, int i3, JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar) {
        int iJc;
        this.kgy = new com.bytedance.sdk.component.adexpress.noq.noq(this.ahm, i, i2, i3, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.ahm, 300.0f));
        layoutParams.gravity = 81;
        Context context = this.ahm;
        if (yoVar.jc() > 0) {
            iJc = yoVar.jc();
        } else {
            iJc = com.bytedance.sdk.component.adexpress.uq.ahm() ? 0 : b.v;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(context, iJc);
        this.kgy.setLayoutParams(layoutParams);
        this.kgy.setClipChildren(false);
        this.kgy.setSlideText(this.uq.pxt());
        gm gmVar = this.kgy;
        if (gmVar instanceof com.bytedance.sdk.component.adexpress.noq.noq) {
            ((com.bytedance.sdk.component.adexpress.noq.noq) gmVar).setShakeText(this.uq.pft());
            final com.bytedance.sdk.component.adexpress.noq.fpp shakeView = ((com.bytedance.sdk.component.adexpress.noq.noq) this.kgy).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new com.bytedance.sdk.component.adexpress.noq.um.kgy() { // from class: com.bytedance.sdk.component.adexpress.dynamic.rz.noq.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.rz.getDynamicClickListener());
            }
        }
    }

    public noq(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct ctVar, com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar, int i, int i2, int i3, JSONObject jSONObject) {
        super(context, ctVar, yoVar);
        this.ahm = context;
        this.uq = yoVar;
        this.rz = ctVar;
        kgy(i, i2, i3, jSONObject, yoVar);
    }
}
