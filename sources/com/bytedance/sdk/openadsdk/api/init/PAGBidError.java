package com.bytedance.sdk.openadsdk.api.init;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class PAGBidError {
    private String ahm;
    private int kgy;

    public int getCode() {
        return this.kgy;
    }

    public String getMessage() {
        return this.ahm;
    }

    public PAGBidError(int i, String str) {
        this.kgy = i;
        this.ahm = str;
    }
}
