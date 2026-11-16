package com.bytedance.sdk.openadsdk.api.open;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class PAGAppOpenRequest extends PAGRequest {
    private int kgy;

    public int getTimeout() {
        return this.kgy;
    }

    public void setTimeout(int i) {
        this.kgy = i;
    }
}
