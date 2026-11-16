package com.bytedance.sdk.component.adexpress.dynamic.rz;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class vs implements yo<com.bytedance.sdk.component.adexpress.noq.um> {
    private Context ahm;
    private String ct;
    private int fi;
    private JSONObject gf;
    private com.bytedance.sdk.component.adexpress.noq.um kgy;
    private int noq;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct rz;
    private com.bytedance.sdk.component.adexpress.dynamic.uq.yo uq;
    private int yo;

    private void ct() {
        final com.bytedance.sdk.component.adexpress.dynamic.noq.kgy dynamicClickListener = this.rz.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6kmT+s/lACo", "aOYsngaVZ9OFWNZemA==", "UuAkgTW1bNA=", 49);
        }
        if ("16".equals(this.ct)) {
            Context context = this.ahm;
            com.bytedance.sdk.component.adexpress.noq.um umVar = new com.bytedance.sdk.component.adexpress.noq.um(context, com.bytedance.sdk.component.adexpress.rz.kgy.fi(context), this.noq, this.yo, this.fi, this.gf);
            this.kgy = umVar;
            if (umVar.getShakeLayout() != null) {
                this.kgy.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context2 = this.ahm;
            this.kgy = new com.bytedance.sdk.component.adexpress.noq.um(context2, com.bytedance.sdk.component.adexpress.rz.kgy.yo(context2), this.noq, this.yo, this.fi, this.gf);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.kgy.setGravity(17);
        layoutParams.gravity = 17;
        this.kgy.setLayoutParams(layoutParams);
        this.kgy.setTranslationY(com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.ahm, this.uq.xts()));
        this.kgy.setShakeText(this.uq.pxt());
        this.kgy.setClipChildren(false);
        this.kgy.setOnShakeViewListener(new com.bytedance.sdk.component.adexpress.noq.um.kgy() { // from class: com.bytedance.sdk.component.adexpress.dynamic.rz.vs.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void ahm() {
        this.kgy.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void kgy() {
        this.kgy.kgy();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    /* JADX INFO: renamed from: uq, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.noq.um rz() {
        return this.kgy;
    }

    public vs(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct ctVar, com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar, String str, int i, int i2, int i3, JSONObject jSONObject) {
        this.ahm = context;
        this.rz = ctVar;
        this.uq = yoVar;
        this.ct = str;
        this.noq = i;
        this.yo = i2;
        this.fi = i3;
        this.gf = jSONObject;
        ct();
    }
}
