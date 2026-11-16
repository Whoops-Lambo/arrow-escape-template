package com.bytedance.sdk.openadsdk.kgy.ahm;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.mw;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ct implements PAGNativeAdLoadListener {
    private final PAGNativeAdLoadListener kgy;

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGNativeAd pAGNativeAd) {
        if (this.kgy == null) {
            return;
        }
        mw.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kgy.ahm.ct.2
            @Override // java.lang.Runnable
            public void run() {
                if (ct.this.kgy != null) {
                    ct.this.kgy.onAdLoaded(pAGNativeAd);
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
        mw.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kgy.ahm.ct.1
            @Override // java.lang.Runnable
            public void run() {
                if (ct.this.kgy != null) {
                    ct.this.kgy.onError(i, str);
                }
            }
        });
    }

    public ct(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.kgy = pAGNativeAdLoadListener;
    }
}
