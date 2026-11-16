package com.bytedance.sdk.openadsdk.core.rz;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class fi implements PAGBannerAdWrapperListener {
    private final PAGBannerAdInteractionListener kgy;
    private final AtomicBoolean ahm = new AtomicBoolean(false);
    private final AtomicBoolean rz = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderFail(View view, String str, int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderSuccess(View view, float f, float f2) {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener = this.kgy;
        if (pAGBannerAdInteractionListener != null) {
            pAGBannerAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdDismissed() {
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener;
        if (this.rz.compareAndSet(false, true) && (pAGBannerAdInteractionListener = this.kgy) != null) {
            pAGBannerAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdShow(View view, int i) {
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener;
        if (this.ahm.compareAndSet(false, true) && (pAGBannerAdInteractionListener = this.kgy) != null) {
            pAGBannerAdInteractionListener.onAdShowed();
        }
    }

    public fi(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        this.kgy = pAGBannerAdInteractionListener;
    }
}
