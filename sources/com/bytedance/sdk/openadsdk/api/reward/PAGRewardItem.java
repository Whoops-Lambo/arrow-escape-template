package com.bytedance.sdk.openadsdk.api.reward;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class PAGRewardItem {
    private final String ahm;
    private final int kgy;

    public int getRewardAmount() {
        return this.kgy;
    }

    public String getRewardName() {
        return this.ahm;
    }

    public PAGRewardItem(int i, String str) {
        this.kgy = i;
        this.ahm = str;
    }
}
