package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
class sx implements TTClientBidding {
    private final ra kgy;

    public void ahm() {
        this.kgy.kgy();
    }

    public ra kgy() {
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

    public sx(Context context, com.bytedance.sdk.openadsdk.core.model.kgy kgyVar, AdSlot adSlot) {
        this.kgy = new ra(context, kgyVar, adSlot);
    }
}
