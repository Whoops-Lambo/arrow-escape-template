package com.ironsource.mediationsdk.adapter;

import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractRewardedVideoAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements RewardedVideoAdapterInterface {
    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void destroyRewardedVideoAd(@Nullable JSONObject jSONObject) {
    }

    public AbstractRewardedVideoAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void collectRewardedVideoBiddingData(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @NotNull BiddingDataCallback biddingDataCallback) {
        jSONObject.getClass();
        biddingDataCallback.getClass();
        Map<String, Object> rewardedVideoBiddingData = getRewardedVideoBiddingData(jSONObject, jSONObject2);
        if (rewardedVideoBiddingData != null) {
            biddingDataCallback.onSuccess(rewardedVideoBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    @Nullable
    public Map<String, Object> getRewardedVideoBiddingData(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        jSONObject.getClass();
        return null;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(@Nullable String str, @Nullable String str2, @NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @NotNull RewardedVideoSmashListener rewardedVideoSmashListener) {
        jSONObject.getClass();
        rewardedVideoSmashListener.getClass();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoForDemandOnly(@Nullable String str, @Nullable String str2, @NotNull JSONObject jSONObject, @NotNull RewardedVideoSmashListener rewardedVideoSmashListener) {
        jSONObject.getClass();
        rewardedVideoSmashListener.getClass();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(@Nullable String str, @Nullable String str2, @NotNull JSONObject jSONObject, @NotNull RewardedVideoSmashListener rewardedVideoSmashListener) {
        jSONObject.getClass();
        rewardedVideoSmashListener.getClass();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @NotNull RewardedVideoSmashListener rewardedVideoSmashListener) {
        jSONObject.getClass();
        rewardedVideoSmashListener.getClass();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable String str, @NotNull RewardedVideoSmashListener rewardedVideoSmashListener) {
        jSONObject.getClass();
        rewardedVideoSmashListener.getClass();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(@NotNull JSONObject jSONObject, @NotNull RewardedVideoSmashListener rewardedVideoSmashListener) {
        jSONObject.getClass();
        rewardedVideoSmashListener.getClass();
    }
}
