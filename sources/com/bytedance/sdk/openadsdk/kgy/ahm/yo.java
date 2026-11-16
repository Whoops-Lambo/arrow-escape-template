package com.bytedance.sdk.openadsdk.kgy.ahm;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.mw;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class yo implements noq {
    private final PAGNativeAdInteractionListener kgy;

    @Override // com.bytedance.sdk.openadsdk.kgy.ahm.noq
    public boolean ahm() {
        return this.kgy != null;
    }

    @Override // com.bytedance.sdk.openadsdk.kgy.ahm.noq
    public void kgy(PAGNativeAd pAGNativeAd) {
        mw.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kgy.ahm.yo.2
            @Override // java.lang.Runnable
            public void run() {
                if (yo.this.kgy != null) {
                    yo.this.kgy.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        mw.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kgy.ahm.yo.1
            @Override // java.lang.Runnable
            public void run() {
                if (yo.this.kgy != null) {
                    yo.this.kgy.onAdClicked();
                }
            }
        });
    }

    public yo(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.kgy = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.kgy.ahm.noq
    public void kgy() {
        mw.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kgy.ahm.yo.3
            @Override // java.lang.Runnable
            public void run() {
                if (yo.this.kgy != null) {
                    yo.this.kgy.onAdDismissed();
                }
            }
        });
    }
}
