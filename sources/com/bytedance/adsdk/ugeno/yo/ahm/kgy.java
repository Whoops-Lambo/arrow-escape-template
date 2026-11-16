package com.bytedance.adsdk.ugeno.yo.ahm;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kgy implements com.bytedance.adsdk.ugeno.gf.rz.ct {
    @Override // com.bytedance.adsdk.ugeno.gf.rz.ct
    public void kgy(View view, float f) {
        float width = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            width = view.getWidth();
        }
        float height = view.getHeight() * 0.5f;
        view.setPivotX(width);
        view.setPivotY(height);
        view.setRotationY(f * 90.0f);
    }
}
