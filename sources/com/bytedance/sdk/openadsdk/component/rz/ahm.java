package com.bytedance.sdk.openadsdk.component.rz;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.mw;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ahm implements PAGInterstitialAdLoadListener {
    final PAGInterstitialAdLoadListener kgy;

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.kgy != null) {
            mw.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.rz.ahm.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = ahm.this.kgy;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.yo
    public void onError(final int i, final String str) {
        if (this.kgy != null) {
            mw.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.rz.ahm.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = ahm.this.kgy;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onError(i, str);
                    }
                }
            });
        }
    }

    public ahm(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.kgy = pAGInterstitialAdLoadListener;
    }
}
