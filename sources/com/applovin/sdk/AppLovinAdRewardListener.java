package com.applovin.sdk;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface AppLovinAdRewardListener {
    void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map);

    void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map);

    void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map);

    void validationRequestFailed(AppLovinAd appLovinAd, int i);
}
