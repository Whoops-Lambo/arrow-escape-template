package com.bytedance.adsdk.ugeno.yo.ahm;

import android.text.TextUtils;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class uq implements com.bytedance.adsdk.ugeno.gf.rz.ct {
    private String kgy;

    @Override // com.bytedance.adsdk.ugeno.gf.rz.ct
    public void kgy(View view, float f) {
        float height = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f < -1.0f || f > 1.0f) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            view.setAlpha(1.0f);
            view.setTranslationX(view.getWidth() * (-f));
            view.setTranslationY(view.getHeight() * f);
        }
        if (TextUtils.equals(this.kgy, "cube")) {
            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                height = view.getHeight();
            }
            view.setPivotX(view.getWidth() * 0.5f);
            view.setPivotY(height);
            view.setRotationX(f * (-90.0f));
        }
    }

    public void kgy(String str) {
        this.kgy = str;
    }
}
