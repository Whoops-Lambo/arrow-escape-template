package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.gbb;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class nu {
    protected Context ahm;
    private com.bytedance.sdk.openadsdk.core.ct.fi ct;
    protected View kgy = ct();
    private com.bytedance.sdk.openadsdk.core.widget.gf rz;
    private com.bytedance.sdk.openadsdk.core.widget.um uq;

    public void uq() {
        this.kgy = null;
        this.ahm = null;
    }

    private View ct() {
        com.bytedance.sdk.openadsdk.core.ct.ct ctVar = new com.bytedance.sdk.openadsdk.core.ct.ct(this.ahm);
        ctVar.setGravity(1);
        ctVar.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.widget.um umVar = new com.bytedance.sdk.openadsdk.core.widget.um(this.ahm);
        this.uq = umVar;
        umVar.setId(520093745);
        int iAhm = gbb.ahm(this.ahm, 64.0f);
        ctVar.addView(this.uq, new LinearLayout.LayoutParams(iAhm, iAhm));
        com.bytedance.sdk.openadsdk.core.ct.fi fiVar = new com.bytedance.sdk.openadsdk.core.ct.fi(this.ahm);
        this.ct = fiVar;
        fiVar.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gbb.ahm(this.ahm, 219.0f), -2);
        layoutParams.topMargin = gbb.ahm(this.ahm, 16.0f);
        this.ct.setLayoutParams(layoutParams);
        this.ct.setEllipsize(TextUtils.TruncateAt.END);
        this.ct.setGravity(17);
        this.ct.setMaxWidth(gbb.ahm(this.ahm, 150.0f));
        this.ct.setMaxLines(2);
        this.ct.setTextColor(-1);
        this.ct.setTextSize(1, 16.0f);
        ctVar.addView(this.ct);
        this.rz = new com.bytedance.sdk.openadsdk.core.widget.gf(this.ahm);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(gbb.ahm(this.ahm, 219.0f), gbb.ahm(this.ahm, 6.0f));
        layoutParams2.topMargin = gbb.ahm(this.ahm, 32.0f);
        ctVar.addView(this.rz, layoutParams2);
        return ctVar;
    }

    public com.bytedance.sdk.openadsdk.core.widget.um ahm() {
        return this.uq;
    }

    public void kgy(int i) {
        this.rz.setProgress(i);
    }

    public com.bytedance.sdk.openadsdk.core.ct.fi rz() {
        return this.ct;
    }

    public nu(Context context) {
        this.ahm = context;
    }

    public View kgy() {
        return this.kgy;
    }
}
