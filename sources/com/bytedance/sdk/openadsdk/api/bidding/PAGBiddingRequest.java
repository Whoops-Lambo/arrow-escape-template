package com.bytedance.sdk.openadsdk.api.bidding;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class PAGBiddingRequest {
    private PAGBannerSize kgy = null;
    private String ahm = null;
    private String rz = null;

    public String getAdxId() {
        return this.rz;
    }

    public PAGBannerSize getBannerSize() {
        return this.kgy;
    }

    public String getSlotId() {
        return this.ahm;
    }

    public void setAdxId(String str) {
        this.rz = str;
    }

    public void setBannerSize(PAGBannerSize pAGBannerSize) {
        this.kgy = pAGBannerSize;
    }

    public void setSlotId(String str) {
        this.ahm = str;
    }
}
