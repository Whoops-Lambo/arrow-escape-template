package com.bytedance.sdk.openadsdk.kgy.rz;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.mw;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class kgy implements PAGInterstitialAdLoadListener {
    private final PAGInterstitialAdLoadListener kgy;

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.kgy == null) {
            return;
        }
        mw.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kgy.rz.kgy.2
            @Override // java.lang.Runnable
            public void run() {
                if (kgy.this.kgy != null) {
                    kgy.this.kgy.onAdLoaded(pAGInterstitialAd);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.yo
    public void onError(final int i, final String str) {
        if (this.kgy == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        mw.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kgy.rz.kgy.1
            @Override // java.lang.Runnable
            public void run() {
                if (kgy.this.kgy != null) {
                    kgy.this.kgy.onError(i, str);
                }
            }
        });
    }

    public kgy(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.kgy = pAGInterstitialAdLoadListener;
    }
}
