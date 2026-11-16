package com.mbridge.msdk.newinterstitial.out;

import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface NewInterstitialListener {
    void onAdClicked(MBridgeIds mBridgeIds);

    void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo);

    void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo);

    void onAdShow(MBridgeIds mBridgeIds);

    void onEndcardShow(MBridgeIds mBridgeIds);

    void onLoadCampaignSuccess(MBridgeIds mBridgeIds);

    void onResourceLoadFail(MBridgeIds mBridgeIds, String str);

    void onResourceLoadSuccess(MBridgeIds mBridgeIds);

    void onShowFail(MBridgeIds mBridgeIds, String str);

    void onVideoComplete(MBridgeIds mBridgeIds);
}
