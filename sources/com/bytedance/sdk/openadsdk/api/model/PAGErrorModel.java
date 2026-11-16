package com.bytedance.sdk.openadsdk.api.model;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class PAGErrorModel {
    private final String ahm;
    private final int kgy;

    public int getErrorCode() {
        return this.kgy;
    }

    public String getErrorMessage() {
        return this.ahm;
    }

    public PAGErrorModel(int i, String str) {
        this.kgy = i;
        this.ahm = str;
    }
}
