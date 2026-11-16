package com.bytedance.sdk.openadsdk.kgy.ct;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.mw;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ahm implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener kgy;

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.kgy == null) {
            return;
        }
        mw.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kgy.ct.ahm.2
            @Override // java.lang.Runnable
            public void run() {
                if (ahm.this.kgy != null) {
                    ahm.this.kgy.onAdLoaded(pAGRewardedAd);
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
        mw.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kgy.ct.ahm.1
            @Override // java.lang.Runnable
            public void run() {
                if (ahm.this.kgy != null) {
                    ahm.this.kgy.onError(i, str);
                }
            }
        });
    }

    public ahm(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.kgy = pAGRewardedAdLoadListener;
    }
}
