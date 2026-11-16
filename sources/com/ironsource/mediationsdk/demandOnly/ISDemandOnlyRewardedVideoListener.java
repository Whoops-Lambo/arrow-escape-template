package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public interface ISDemandOnlyRewardedVideoListener {
    void onRewardedVideoAdClicked(String str);

    void onRewardedVideoAdClosed(String str);

    void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError);

    void onRewardedVideoAdLoadSuccess(String str);

    void onRewardedVideoAdOpened(String str);

    void onRewardedVideoAdRewarded(String str);

    void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError);
}
