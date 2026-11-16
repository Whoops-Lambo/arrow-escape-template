package com.bytedance.sdk.openadsdk.kgy.kgy;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.mw;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class kgy implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener kgy;

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.kgy == null) {
            return;
        }
        mw.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kgy.kgy.kgy.2
            @Override // java.lang.Runnable
            public void run() {
                kgy.this.kgy.onAdLoaded(pAGBannerAd);
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
        mw.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kgy.kgy.kgy.1
            @Override // java.lang.Runnable
            public void run() {
                kgy.this.kgy.onError(i, str);
            }
        });
    }

    public kgy(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.kgy = pAGBannerAdLoadListener;
    }
}
