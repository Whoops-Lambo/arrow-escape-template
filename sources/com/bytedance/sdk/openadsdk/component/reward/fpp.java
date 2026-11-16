package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
class fpp implements TTClientBidding {
    private final fi kgy;

    public void ahm() {
        this.kgy.kgy();
    }

    public fi kgy() {
        return this.kgy;
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d, String str, String str2) {
        this.kgy.loss(d, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d) {
        this.kgy.win(d);
    }

    public fpp(Context context, com.bytedance.sdk.openadsdk.core.model.kgy kgyVar) {
        this.kgy = new fi(context, kgyVar);
    }
}
