package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize kgy;

    public PAGBannerSize getAdSize() {
        return this.kgy;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.kgy = pAGBannerSize;
    }

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.kgy = pAGBannerSize;
    }
}
