package com.mbridge.msdk.out;

import com.mbridge.msdk.video.bt.module.orglistener.g;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public interface RewardVideoListener extends g {
    @Override // com.mbridge.msdk.video.bt.module.orglistener.g
    void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo);

    @Override // com.mbridge.msdk.video.bt.module.orglistener.g
    void onAdShow(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.bt.module.orglistener.g
    void onEndcardShow(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.bt.module.orglistener.g
    void onLoadSuccess(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.bt.module.orglistener.g
    void onShowFail(MBridgeIds mBridgeIds, String str);

    @Override // com.mbridge.msdk.video.bt.module.orglistener.g
    void onVideoAdClicked(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.bt.module.orglistener.g
    void onVideoComplete(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.bt.module.orglistener.g
    void onVideoLoadFail(MBridgeIds mBridgeIds, String str);

    @Override // com.mbridge.msdk.video.bt.module.orglistener.g
    void onVideoLoadSuccess(MBridgeIds mBridgeIds);
}
