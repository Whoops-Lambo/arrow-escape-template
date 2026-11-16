package com.bytedance.sdk.openadsdk.core.at.ahm;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class ct extends com.bytedance.adsdk.ugeno.ahm.rz<FrameLayout> {
    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    /* JADX INFO: renamed from: rz, reason: merged with bridge method [inline-methods] */
    public FrameLayout kgy() {
        FrameLayout frameLayout = new FrameLayout(this.ahm);
        com.bytedance.sdk.openadsdk.core.model.ahm ahmVar = new com.bytedance.sdk.openadsdk.core.model.ahm();
        ahmVar.kgy(true);
        PAGLogoView pAGLogoView = new PAGLogoView(this.ahm);
        pAGLogoView.initData(ahmVar);
        frameLayout.addView(pAGLogoView);
        return frameLayout;
    }

    public ct(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void ahm() {
        super.ahm();
    }
}
