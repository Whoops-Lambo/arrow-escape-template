package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.activity.TTFullWebActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.core.wy;
import com.bytedance.sdk.openadsdk.utils.ft;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
class fi extends PAGInterstitialAd {
    private com.bytedance.sdk.openadsdk.kgy.rz.ahm ahm;
    private final com.bytedance.sdk.openadsdk.core.model.kgy kgy;
    private final String rz = ft.kgy();
    private final twf uq;

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        return this.uq.kgy(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        return this.uq.ahm();
    }

    public void kgy() {
        this.uq.kgy();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        this.uq.kgy(d, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.ahm = new com.bytedance.sdk.openadsdk.component.rz.kgy(pAGInterstitialAdInteractionCallback, this.kgy);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.ahm = new com.bytedance.sdk.openadsdk.component.rz.kgy(pAGInterstitialAdInteractionListener, this.kgy);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(Activity activity) {
        this.uq.kgy(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        this.uq.kgy(d);
    }

    public fi(Context context, com.bytedance.sdk.openadsdk.core.model.kgy kgyVar) {
        this.kgy = kgyVar;
        this.uq = new twf(context, kgyVar, "fullscreen_interstitial_ad", new twf.kgy() { // from class: com.bytedance.sdk.openadsdk.component.reward.fi.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.twf.kgy
            public Intent kgy(Context context2, ioy ioyVar, @Nullable Activity activity) {
                if (com.bytedance.sdk.openadsdk.component.reward.rz.fi.kgy(ioyVar)) {
                    return new Intent(context2, (Class<?>) TTFullWebActivity.class);
                }
                if (ioyVar.lb()) {
                    return new Intent(context2, (Class<?>) TTAdActivity.class);
                }
                if (ioyVar.noq()) {
                    return new Intent(context2, (Class<?>) TTFullScreenExpressVideoActivity.class);
                }
                return new Intent(context2, (Class<?>) TTFullScreenVideoActivity.class);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.twf.kgy
            public void kgy(Intent intent, @Nullable Activity activity, ioy ioyVar) {
                com.bytedance.sdk.openadsdk.component.reward.kgy.rz.kgy(intent, activity, fi.this.uq.rz(), fi.this.kgy, fi.this.rz);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.twf.kgy
            public void kgy() {
                if (fi.this.ahm == null) {
                    return;
                }
                wy.kgy().kgy(fi.this.rz, fi.this.ahm);
                fi.this.ahm = null;
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.twf.kgy
            public void kgy(ioy ioyVar) {
                ahm.kgy(ioyVar, fi.this.uq.rz(), false);
            }
        });
    }
}
