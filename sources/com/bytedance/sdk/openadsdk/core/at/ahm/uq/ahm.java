package com.bytedance.sdk.openadsdk.core.at.ahm.uq;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class ahm extends com.bytedance.adsdk.ugeno.ahm.kgy<com.bytedance.adsdk.ugeno.ra.ahm.kgy> {
    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    /* JADX INFO: renamed from: rz, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.ra.ahm.kgy kgy() {
        kgy kgyVar = new kgy(this.ahm);
        kgyVar.kgy(this);
        return kgyVar;
    }

    public com.bytedance.adsdk.ugeno.ra.ahm.kgy uq() {
        return ((kgy) this.ct).getPlayableView();
    }

    public ahm(Context context) {
        super(context);
    }
}
