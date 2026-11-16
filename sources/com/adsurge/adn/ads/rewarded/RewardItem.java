package com.adsurge.adn.ads.rewarded;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface RewardItem {
    public static final RewardItem DEFAULT_REWARD = new RewardItem() { // from class: com.adsurge.adn.ads.rewarded.RewardItem.1
        @Override // com.adsurge.adn.ads.rewarded.RewardItem
        public int getAmount() {
            return 1;
        }

        @Override // com.adsurge.adn.ads.rewarded.RewardItem
        @NonNull
        public String getType() {
            return "";
        }
    };

    int getAmount();

    @NonNull
    String getType();
}
